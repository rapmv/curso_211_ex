package application;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

import entities.Alunos;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		int quant, codigo;
		Set<Alunos> alunos = new HashSet<>();
		
		//não utilizei o try catch
		for(int j=0; j<3; j++) {
			System.out.print("Digite o numero de alunos: ");
			quant = sc.nextInt();
			
			for(int i=1; i<=quant; i++) {
				System.out.print("Digite o numero do "+i+" aluno: ");
				codigo = sc.nextInt();
				alunos.add(new Alunos(codigo));
			}
			System.out.println();
		}
		System.out.println("Total de alunos: " +alunos.size());
		sc.close();
	}

}
