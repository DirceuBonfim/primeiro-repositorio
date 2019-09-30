//exercicio 2.33 java como programar
//Programa para calcular o IMC

import java.util.Scanner;

	public class exerc2_33
	
	{
		public static void main(String[]args)
		
		{

		Scanner input = new Scanner(System.in);

		int pesoEmQuilogramas;
		int alturaEmMetros;
		int IMC;

		System.out.print("Digite o seu peso em quilogramas: ");
		pesoEmQuilogramas = input.nextInt();

		System.out.print("Digite a sua altura em metros: ");
		alturaEmMetros = input.nextInt();

		IMC = pesoEmQuilogramas/alturaEmMetros*alturaEmMetros;
		System.out.printf("Seu IMC e: %d\n\n", IMC);

		System.out.println("Valor IMC");
		System.out.println("Abaixo do peso: menor do que 18.5");
		System.out.println("Normal: entre 18.5 e 24.9");
		System.out.println("Acima do peso: entre 25 e 29.9");
		System.out.println("Obeso: 30 ou maior");
	}

}


