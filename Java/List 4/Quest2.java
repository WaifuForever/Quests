//Quest2.java exibe o antecessor do número que o usuário digitar na tela
import java.util.Scanner;

public class Quest2 {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
		//Entrada
		System.out.println("Digite um número: ");
		int num = scanner.nextInt();
		
		//Processamento
		int resultado = num - 1;
		//Saída
		System.out.println("O antecessor dele é: " + resultado);
		
		
		// TODO Auto-generated method stub

	}

}