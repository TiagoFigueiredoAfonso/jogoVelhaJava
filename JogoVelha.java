package dezembro;

import java.util.Scanner;

public class JogoVelha {

	public static void main(String[] args) {
		
		System.out.println("Início do jogo\n"); // bloco com a Matriz Jogo da Velha
		String[][] velha = { { "1", "2", "3" }, { "4", "5", "6" }, { "7", "8", "9" } };
		for (int i = 0; i < velha.length; i++) {
			for (int j = 0; j < velha.length; j++) {
				System.out.print(" | " + velha[i][j] + " | ");
			}
			System.out.println();
		}
		
		Scanner sc = new Scanner(System.in);
		// bloco com as variáveis que serão somados os valores da matriz
		int i = 0, linhaZeroX = 0, linhaUmX = 0, linhaDoisX = 0, diaPrincipal = 0, diaSecun = 0, linhaZeroO = 0,
				linhaUmO = 0, linhaDoisO = 0, diaPrincipalO = 0, diaSecunO = 0, colunaZeroO = 0, 
						colunaUmO = 0, colunaDoisO = 0, colunaZeroX = 0, colunaUmX = 0, colunaDoisX = 0;
		
		// usuário pode escolher qual letra inicia o jogo
		System.out.println("\nQual letra deseja jogar? ('X' | 'O')");
		String res = sc.next();
		
		System.out.println("\nIniciando pelo jogador: '" + res.toUpperCase() + "' ");
		while (i < 4) {
			
			if (res.equalsIgnoreCase("x")) { // caso a resposta seja X, executa esse if
				
				System.out.println("Jogador - 'X', sua vez de jogar: ");
				System.out.print("Escolha a posição numérica que deseja preencher: ");
				String en = sc.next();			
				System.out.println();
				if (en.equalsIgnoreCase("1")) {	// opção  para preencher a matriz e enviar o valor X 				
					for (int l = 0; l < velha.length; l++) {
						for (int c = 0; c < velha.length; c++) {
							velha[0][0] = res; // setando o valor e atribuindo o X
							System.out.print(" | " + velha[l][c] + " | ");
						}
						System.out.println();
					}
					// contadores para somar as posições da matriz
					linhaZeroX += Integer.parseInt(en); 
					diaPrincipal += Integer.parseInt(en);
					colunaUmX += Integer.parseInt(en);
				} else if (en.equalsIgnoreCase("2")) {
					for (int l = 0; l < velha.length; l++) {
						for (int c = 0; c < velha.length; c++) {
							velha[0][1] = res;
							System.out.print(" | " + velha[l][c] + " | ");
						}
						System.out.println();
					}
					linhaZeroX += Integer.parseInt(en);
					colunaUmX += Integer.parseInt(en);
				} else if (en.equalsIgnoreCase("3")) {
					for (int l = 0; l < velha.length; l++) {
						for (int c = 0; c < velha.length; c++) {
							velha[0][2] = res;
							System.out.print(" | " + velha[l][c] + " | ");
						}
						System.out.println();
					}
					linhaZeroX += Integer.parseInt(en);
					diaSecun += Integer.parseInt(en);
					colunaDoisX += Integer.parseInt(en);
				} else if (en.equalsIgnoreCase("4")) {
					for (int l = 0; l < velha.length; l++) {
						for (int c = 0; c < velha.length; c++) {
							velha[1][0] = res;
							System.out.print(" | " + velha[l][c] + " | ");
						}
						System.out.println();
					}
					linhaUmX += Integer.parseInt(en);
					colunaUmX += Integer.parseInt(en);
				} else if (en.equalsIgnoreCase("5")) {
					for (int l = 0; l < velha.length; l++) {
						for (int c = 0; c < velha.length; c++) {
							velha[1][1] = res;
							System.out.print(" | " + velha[l][c] + " | ");
						}
						System.out.println();
					}
					linhaUmX += Integer.parseInt(en);
					diaSecun += Integer.parseInt(en);
					diaPrincipal += Integer.parseInt(en);
					colunaUmX += Integer.parseInt(en);
				} else if (en.equalsIgnoreCase("6")) {
					for (int l = 0; l < velha.length; l++) {
						for (int c = 0; c < velha.length; c++) {
							velha[1][2] = res;
							System.out.print(" | " + velha[l][c] + " | ");
						}
						System.out.println();
					}
					linhaUmX += Integer.parseInt(en);
					colunaDoisX += Integer.parseInt(en);
				} else if (en.equalsIgnoreCase("7")) {
					for (int l = 0; l < velha.length; l++) {
						for (int c = 0; c < velha.length; c++) {
							velha[2][0] = res;
							System.out.print(" | " + velha[l][c] + " | ");
						}
						System.out.println();
					}
					linhaDoisX += Integer.parseInt(en);
					diaSecun += Integer.parseInt(en);
					colunaZeroX += Integer.parseInt(en);	
				
				} else if (en.equalsIgnoreCase("8")) {
					for (int l = 0; l < velha.length; l++) {
						for (int c = 0; c < velha.length; c++) {
							velha[2][1] = res;
							System.out.print(" | " + velha[l][c] + " | ");
						}
						System.out.println();
					}				
					linhaDoisX += Integer.parseInt(en);
					colunaUmX += Integer.parseInt(en);
				} else if (en.equalsIgnoreCase("9")) {
					for (int l = 0; l < velha.length; l++) {
						for (int c = 0; c < velha.length; c++) {
							velha[2][2] = res;
							System.out.print(" | " + velha[l][c] + " | ");
						}
						System.out.println();
					}
					linhaDoisX += Integer.parseInt(en);
					diaPrincipal += Integer.parseInt(en);
					colunaDoisX += Integer.parseInt(en);
				}
				
				/* bloco de soma das linhas/colunas da matriz. Caso o resultado seja igual
				 o jogador vence a partida*/
				if (linhaZeroX == 6 || linhaUmX == 15 || linhaDoisX == 24 || diaPrincipal == 15 || 
						diaSecun == 15 || colunaZeroX == 12 || colunaUmX == 15 || colunaDoisX == 18) {				
					System.out.println("Jogador X - Venceu!");
					System.exit(0); // encerra o programa caso a soma seja o resultado da variável
				}
				res = "O"; // seta o valor X e inicia o bloco O 
			}
			if (res.equalsIgnoreCase("O")) {
				System.out.println("\nJogador - 'O', sua vez de jogar: ");
				System.out.print("Escolha a posição numérica que deseja preencher: ");
				String en2 = sc.next();
				System.out.println();
				if (en2.equalsIgnoreCase("1")) {

					for (int a = 0; a < velha.length; a++) {
						for (int c = 0; c < velha.length; c++) {
							velha[0][0] = res;
							System.out.print(" | " + velha[a][c] + " | ");
						}
						System.out.println();
					}
					linhaZeroO += Integer.parseInt(en2);
					diaPrincipalO += Integer.parseInt(en2);
					colunaZeroO += Integer.parseInt(en2);
				} else if (en2.equalsIgnoreCase("2")) {
					for (int b = 0; b < velha.length; b++) {
						for (int c = 0; c < velha.length; c++) {
							velha[0][1] = res;
							System.out.print(" | " + velha[b][c] + " | ");
						}
						System.out.println();
					}
					linhaZeroO += Integer.parseInt(en2);
					colunaUmO += Integer.parseInt(en2);
				} else if (en2.equalsIgnoreCase("3")) {
					for (int d = 0; d < velha.length; d++) {
						for (int c = 0; c < velha.length; c++) {
							velha[0][2] = res;
							System.out.print(" | " + velha[d][c] + " | ");
						}
						System.out.println();
					}
					linhaZeroO += Integer.parseInt(en2);
					diaSecunO += Integer.parseInt(en2);
					colunaDoisO += Integer.parseInt(en2);
				} else if (en2.equalsIgnoreCase("4")) {
					for (int e = 0; e < velha.length; e++) {
						for (int c = 0; c < velha.length; c++) {
							velha[1][0] = res;
							System.out.print(" | " + velha[e][c] + " | ");
						}
						System.out.println();
					}
					linhaUmO += Integer.parseInt(en2);
					colunaZeroO += Integer.parseInt(en2);
				} else if (en2.equalsIgnoreCase("5")) {
					for (int f = 0; f < velha.length; f++) {
						for (int c = 0; c < velha.length; c++) {
							velha[1][1] = res;
							System.out.print(" | " + velha[f][c] + " | ");
						}
						System.out.println();
					}
					linhaUmO += Integer.parseInt(en2);
					diaPrincipalO += Integer.parseInt(en2);
					diaSecunO += Integer.parseInt(en2);
					colunaUmO += Integer.parseInt(en2);
				} else if (en2.equalsIgnoreCase("6")) {
					for (int g = 0; g < velha.length; g++) {
						for (int c = 0; c < velha.length; c++) {
							velha[1][2] = res;
							System.out.print(" | " + velha[g][c] + " | ");
						}
						System.out.println();
					}
					linhaUmO += Integer.parseInt(en2);
					colunaDoisO += Integer.parseInt(en2);
				} else if (en2.equalsIgnoreCase("7")) {
					for (int h = 0; h < velha.length; h++) {
						for (int c = 0; c < velha.length; c++) {
							velha[2][0] = res;
							System.out.print(" | " + velha[h][c] + " | ");
						}
						System.out.println();
					}
					linhaDoisO += Integer.parseInt(en2);
					diaSecunO += Integer.parseInt(en2);
					colunaZeroO += Integer.parseInt(en2);
				} else if (en2.equalsIgnoreCase("8")) {
					for (int j = 0; j < velha.length; j++) {
						for (int c = 0; c < velha.length; c++) {
							velha[2][1] = res;
							System.out.print(" | " + velha[j][c] + " | ");
						}
						System.out.println();
					}
					linhaDoisO += Integer.parseInt(en2);
					colunaUmO += Integer.parseInt(en2);
				} else if (en2.equalsIgnoreCase("9")) {
					for (int k = 0; k < velha.length; k++) {
						for (int c = 0; c < velha.length; c++) {
							velha[2][2] = res;
							System.out.print(" | " + velha[k][c] + " | ");
						}
						System.out.println();
					}
					linhaDoisO += Integer.parseInt(en2);
					diaPrincipalO += Integer.parseInt(en2);
					colunaDoisO += Integer.parseInt(en2);
				}
				res = "X";
				if (linhaZeroO == 6 || linhaUmO == 15 || linhaDoisO == 24 || diaPrincipalO == 15 
					|| diaSecunO == 15 || colunaZeroO == 12 || colunaUmO == 15 || colunaDoisO == 18) {					
					System.out.println("Jogador - O Venceu!");
					System.exit(0);
				}
			}
			i++;
		}
		System.out.println("Fim do jogo");
	}

}
