package aulas;

import java.util.Scanner;

public class OperacoesMedia {
	public static void main(String[]args) {
		
	/*•Faça
	um Programa que peça as 4 notas bimestrais e mostre a média.
	•Faça
	um Programa que pergunte quanto você ganha por hora e o número de horas
	trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.*/
		
		double nota1 = 0;
		double nota2 = 0;
		double nota3 = 0;
		double nota4 = 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a nota do primeiro bimestre: ");
		nota1 = leia.nextDouble();
		
		System.out.println("Digite a nota do primeiro bimestre: ");
		nota2 = leia.nextDouble();
		
		System.out.println("Digite a nota do primeiro bimestre: ");
		nota3 = leia.nextDouble();
		
		System.out.println("Digite a nota do primeiro bimestre: ");
		nota4 = leia.nextDouble();
		
		System.out.println("A média das notas é: " + (nota1 + nota2 + nota3 + nota4) / 4);
		
		leia.close();
	
	}
}