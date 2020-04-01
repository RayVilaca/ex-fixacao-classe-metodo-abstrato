package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Pessoa> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 1; i < n+1; ++i) {
			System.out.println("Tax payer #"+i+" data:");
			System.out.print("Individual or company (i/c)? ");
			char opcao = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Anual income: ");
			double rendaAnual = sc.nextDouble();
			
			if(opcao == 'i') {
				System.out.print("Health expenditures: ");
				double gastoSaude = sc.nextDouble();
				list.add(new PessoaFisica(name, rendaAnual, gastoSaude));
			} else {
				System.out.print("Number of employees: ");
				int numFuncionario = sc.nextInt();
				list.add(new PessoaJuridica(name, rendaAnual, numFuncionario));
			}
			
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		
		double sum = 0;
		for(Pessoa p : list) {
			System.out.println(p);
			sum += p.imposto();
		}
		
		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f%n", sum);
		
		
		sc.close();

	}

}
