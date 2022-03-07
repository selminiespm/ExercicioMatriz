import java.util.Random;

public class Exercicio7 {
	public static void main(String[] args) {

		Random gerador = new Random();
		int[][] x = new int[3][3];
		int aux;

		// preenche e imprime a matriz antes da troca
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++) {
				x[i][j] = gerador.nextInt(50);
				System.out.print(x[i][j] + "\t");
			}
			System.out.println();
		}

		// troca dos elementos das diagonais
		int i = 0;
		int j = x.length - 1;
		while(i < x.length) {
			aux = x[i][i];
			x[i][i] = x[i][j];
			x[i][j] = aux;
			i++;
			j--;
		}
		
		// imprime a matriz após a troca dos elementos
		System.out.println();
		for (i = 0; i < x.length; i++) {
			for (j = 0; j < x.length; j++) {				
				System.out.print(x[i][j] + "\t");
			}
			System.out.println();
		}
		
		// teste feito no git

	}
}
