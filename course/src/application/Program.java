package application;

import java.util.Scanner;

import services.PrintServiceTipoT;


public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//instanciação
		PrintServiceTipoT<Integer> ps = new PrintServiceTipoT<>();
		
		
		System.out.println("How many value? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int value = sc.nextInt();
			ps.addValue(value);	//adicionado no PrintService
		}
		
		ps.print();
		Integer x = ps.first();
		System.out.println("Firts: " + x);
		
		sc.close();

	}

}
