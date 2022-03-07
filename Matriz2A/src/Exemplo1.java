import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int[][] x = new int[3][3];
		
		// entrada de dados
		for(int linha = 0; linha < x.length; linha++) {
			for(int coluna = 0; coluna < x.length; coluna++) {
				System.out.print("Valor: ");
				x[linha][coluna] = teclado.nextInt();
			}
		}
		
		// saída de dados
		for(int linha = 0; linha < x.length; linha++) {
			for(int coluna = 0; coluna < x.length; coluna++) {
				System.out.print(x[linha][coluna] + "\t");
			}
			System.out.println();
		}
	}

}
