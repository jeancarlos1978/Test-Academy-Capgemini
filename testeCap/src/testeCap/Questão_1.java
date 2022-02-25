package testeCap;

import java.util.Scanner;

public class Questão_1 {
	
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		String valorMatrix = "*";
		
		int num;
		System.out.print("Digite um numero: ");
		num = sc.nextInt();
		
		
		String[][] mat = new String[num+1][num];
		
		for (int i = 0; i < num + 1; i++) {
			for (int j = 0; j < num; j++) {
				mat[i][j] = valorMatrix;
			}
			
		}
			
		System.out.println("Matrix: ");
		System.out.println();
		
		for (int i = 0; i < num + 1; i++) {
			for (int j = 0; j < num; j++) {
				if(j>=num-i) {												
					System.out.print(mat[i][j]);	
				}else {														
					System.out.print(" ");
				}
			}
			System.out.println(" ");

			sc.close();
		}
	}
	
}