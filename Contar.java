package exerciciosLivro;

import javax.swing.JOptionPane;

public class Contar {

	public static void main(String[] args) {

		// Definição das variaveis
		int inicio = 0, limite = 0, delay = 0;

		// Entrada do usuário
		int userChoice = 0;

		// Inicio do loop.
		do {

			// Entrada do usuário
			try {

				userChoice = Integer.parseInt(JOptionPane.showInputDialog(null,
						"Escolha uma opção " + "\n1-Contar de 0 a 10" + "\n2-Contar de 1 até um valor definido"
								+ "\n3-Defina inicio e fim" + "\n4-Defina inicio,fim e delay"));

				// Entrada do usuário , o programa verificará, caso o usuario digite um número
				// negativo ou igual a 0
				if (userChoice <= 0) {
					JOptionPane.showMessageDialog(null,
							"Você inseriu um número 0 ou negativo, selecione apenas números inteiros positivos");
				}

				// Outra verificação, captura da entrada do usuário, caso o programa seja
				// fechado ou exista algum caractere inválido
			} catch (NumberFormatException | NullPointerException e) {

				JOptionPane.showMessageDialog(null,
						"Você inseriu caracteres inválidos nesse campo ou fechou o programa incorretamente,"
								+ " insira apenas números inteiros positivos ");

			}

			// Entrada do switch
			switch (userChoice) {

			case 1:

				// Se a primeira opção for escolhida, o método contarNumeros, imprime de 0 a 10,
				// não tem nenhuma interação com o usuario.
				ContarSobrecarga.contarNumeros();

				break;

			case 2:

				limite = 0;

				// Se a segunda opção for escolhida, o método contarNumeros sobrecarregado
				// permite que o usuario digite um número limite por exemplo : inicia em 1 e
				// termina em 1000(suponha que o usuario digite esse valor no campo)

				ContarSobrecarga.contarNumeros(limite);

				break;

			case 3:

				inicio = 0;

				limite = 0;

				// Se a terceira opção for escolhida , o usuário pode chamar o método
				// sobrecarregado e definir um valor limite e final.
				ContarSobrecarga.contarNumeros(inicio, limite);

				break;

			case 4:

				// Se a quarta opção for escolhida , o usuário pode definir um inicio,fim e
				// delay, o delay permite que o usuário defina a pausa entre os valores que
				// serão imprimidos
				ContarSobrecarga.contarNumeros(inicio, limite, delay);

				break;

			default:

				// Se a escolha do usuário for diferente de 1,2,3 ou 4 , o programa cairá nesse
				// bloco de código e a aplicação será encerrada
				JOptionPane.showMessageDialog(null, "Nenhuma opção foi escolhida, fim da aplicação!!!");

				break;

			}

			// Enquanto a escolha do usuario for maior que 0 ....
		} while (userChoice > 0);

	}

}
