import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		
		// declaração de variáveis
		Scanner teclado = new Scanner(System.in);
		int totalDeAlunos;
		int qtdNotas = 3;
		String[] coluna = {"Prova 1: ", "Prova 2: ", "Trabalho: "};
		double[] peso = {0.3, 0.5, 0.2};
		double media;
		
		// entrada do total de alunos
		System.out.print("Total de alunos: ");
		totalDeAlunos = teclado.nextInt();
		
		// declaração dos arrays
		String[] nome = new String[totalDeAlunos];
		double[][] nota = new double[totalDeAlunos][qtdNotas+1];
		
		// entrada dos dados e cálculo da média
		for(int i = 0; i < totalDeAlunos; i++) {
			teclado.nextLine();
			System.out.println("Aluno "+(i+1));
			System.out.print("Nome: ");
			nome[i] = teclado.nextLine();
			media = 0;
			for(int j = 0; j < qtdNotas; j++) {
				System.out.print(coluna[j]);
				nota[i][j] = teclado.nextDouble();
				media += nota[i][j] * peso[j];
			}
			nota[i][qtdNotas] = media;
			System.out.println();
		}
		
		// saída de dados
		for(int i = 0; i < totalDeAlunos; i++) {
			System.out.println(nome[i]);
			System.out.println(nota[i][qtdNotas]);
			if(nota[i][qtdNotas] >= 7) {
				System.out.println("APROVADO");
			} else {
				System.out.println("REPROVADO");
			}
		}
	}
}
