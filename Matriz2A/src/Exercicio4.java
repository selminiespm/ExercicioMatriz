import java.util.Random;

public class Exercicio4 {
	public static void main(String[] args) {
		
		// criação das variáveis
		Random gerador = new Random();
		int[][] x = new int[4][4];
		int dp = 0, ds = 0;
		
		// preenchimento e impressão da matriz
		for(int i = 0; i < x.length; i++) {
			for(int j = 0; j < x.length; j++) {
				x[i][j] = gerador.nextInt(20);
				System.out.print(x[i][j] + "\t");
			}
			System.out.println();
		}
		
		// soma dos elementos da diagonal principal e da diagonal secundária
		for(int i = 0; i < x.length; i++) {
			for(int j = 0; j < x.length; j++) {
				if(i == j) {
					dp = dp + x[i][j];
				}
				if(i + j == x.length - 1) {
					ds = ds + x[i][j];
				}
			}
		}
		
		System.out.println("soma da diagonal principal = " + dp);
		System.out.println("soma da diagonal secundária = " + ds);
	}
}
