import java.util.Random;

public class Exercicio5 {
	public static void main(String[] args) {

		// criação das variáveis
		Random gerador = new Random();
		int[][] x = new int[4][4];
		int aux = 0;
		
		// preenchimento e impressão da matriz
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++) {
				x[i][j] = gerador.nextInt(20);
				System.out.print(x[i][j] + "\t");
				if(x[i][j] > aux) {
					aux = x[i][j];
				}
			}
			System.out.println();
		}
		System.out.println("maior valor = " + aux);
		
		// encontra a localização do maior elemento
		for(int i = 0; i < x.length; i++) {
			for(int j = 0; j < x.length; j++) {
				if(x[i][j] == aux) {
					System.out.println("linha = " + i);
					System.out.println("coluna = " + j);
					System.out.println();
				}
			}
		}
	}
}
