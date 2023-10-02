package exerciciosLivro;

import javax.swing.JOptionPane;

public class ContarSobrecarga {

	// Método contar numeros , apenas imprime de 0 a 10.
	public static void contarNumeros() {

		for (int i = 0; i <= 10; i++) {

			System.out.print(" " + i + " ");

		}

	}

	// Método contar números sobrecarregado, permite que o usuario defina um número
	// limite
	public static void contarNumeros(int fim) {

		try {

			fim = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um número que definirá o limite"));

			if (fim <= 0) {

				JOptionPane.showMessageDialog(null, "Insira apenas números positivos inteiros!!!");
			}

		} catch (NumberFormatException | NullPointerException erro) {

			JOptionPane.showMessageDialog(null,
					"Você inseriu dados inválidos(letras ou caracteres especiais) ou fechou o programa incorretamente");
		}

		for (int i = 1; i <= fim; i++) {

			System.out.print(" " + i + " ");

		}

	}

	// Método contar numeros sobrecarregado permite que o inicio e fim seja definido
	public static void contarNumeros(int inicio, int limite) {

		try {

			inicio = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um número que definirá o inicio"));

			limite = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um número que definirá o limite"));

			if (inicio <= 0 || limite <= 0) {

				JOptionPane.showMessageDialog(null, "Insira apenas números positivos inteiros!!!");
			}

		} catch (NumberFormatException | NullPointerException erro) {

			JOptionPane.showMessageDialog(null,
					"Você inseriu dados inválidos(letras ou caracteres especiais) ou fechou o programa incorretamente");
		}

		for (inicio = 0; inicio <= limite; inicio++) {

			System.out.print(" " + inicio + " ");

		}

	}

	// E por fim, permite que o inicio, limite e delay seja fornecido
	public static void contarNumeros(int inicio, int limite, int delay) {

		try {

			inicio = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um número que definirá o inicio"));

			limite = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um número que definirá o limite"));

			delay = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Insira um número que definirá o delay da contagem sendo 1 para 1 segundo e assim por diante"));

			if (inicio <= 0 || limite <= 0 || delay <= 0) {

				JOptionPane.showMessageDialog(null, "Insira apenas números positivos inteiros!!!");
			}

			else {

				// Recebe o valor e multiplica por 1000(milisegundos).
				delay *= 1000;

			}

		} catch (NumberFormatException | NullPointerException erro) {

			JOptionPane.showMessageDialog(null,
					"Você inseriu dados inválidos(letras ou caracteres especiais) ou fechou o programa incorretamente");
		}

		for (inicio = 0; inicio <= limite; inicio++) {

			System.out.print(" " + inicio + " ");

			try {

				Thread.sleep(delay);

			} catch (InterruptedException e) {

				JOptionPane.showMessageDialog(null, "A contagem foi interrompida, inicie o processo!!");
			}

		}

	}

}
