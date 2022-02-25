package testeCap;

import java.util.Scanner;

public class Questão_2 {
	
	
	
	public static void main(String[] args) {
//      Chama a Primeira resposta		
		respostaUm();

//      Chama a segunda resposta		
	//	respostaDois();
			
	}
	
//*******************************************************************************************
//	 ESTE É A SPRIMEIRA RESPOSTA PARA A QUESTÃO 02 COMO COMENTADO NO README
	
	public static void respostaUm() {

		Scanner ler = new Scanner(System.in);				
		String senha;
		
		System.out.print("Digite uma Senha: ");
		senha = ler.nextLine();
		
		
		if(senha.length() < 6) {
			
			int diferenca = 6 - senha.length();
			
			System.out.println("Sua senha é fraca procure melhorar!");
			System.out.println("Sua senha contem apenas " + senha.length() + " caracteres.");
			
			System.out.printf("Complete com no minimo mais %d caractere(s)", diferenca);
		}
		else {
			System.out.println("Senha Salva com sucesso!");
			System.out.println(senha.length());
		}
		
	}
	
//**********************************************************************************	
//	 ESTE É A SEGUNDA RESPOSTA PARA A QUESTÃO 02 COMO COMENTADO NO README
	
	
	public static void respostaDois (){
		
		Scanner sc = new Scanner(System.in);

		String nomeUsuario = "";
		String senha = "";
		String[] senhaPessoa = new String[6];
		char reinicia = 'v';
		int valorCaracteres = 0;
		int valorSenha=0;
		
			System.out.println();
			System.out.println();
			System.out.print("Digite seu nome: ");
			nomeUsuario = sc.next();
			while (reinicia == 'v') {
			System.out.print("Digite a senha para verificação: ");
			senha = sc.next();
			senhaPessoa = senha.split("");

			String number = senha.replaceAll("(?:[^0-9]+)", "");
			String caracaterEspecial = senha.replaceAll("(?:[^!@#$%^&*()-+]+)", "");
			String minusculas = senha.replaceAll("(?:[^a-z]+)", "");
			String maiusculas = senha.replaceAll("(?:[^A-Z]+)", "");
			senha.matches("[a-zA-Z]{2}");

			System.out
					.println("Sua senha apontou a sequinte quantidade de numeros de caracteres: " + senhaPessoa.length);
			System.out.println();
			if (senhaPessoa.length > 0 && senhaPessoa.length < 6) {
				 valorSenha = 6 - senhaPessoa.length;
				System.out.println("Este valor está abaixo do permitido, ainda faltam " + valorSenha + " caracteres");
			} else if (senhaPessoa.length > 6) {
				 valorSenha = senhaPessoa.length - 6;
				System.out.println("Voce ultrapassou o valor de caracteres digitandos, recebi  " + valorSenha
						+ " valor(valores) a mais");
			}

			
			valorCaracteres = senhaPessoa.length;
			switch (valorCaracteres) {
			case 1:
				System.out.println("voce pode adicionar sequintes caracteres 8*9Ab");
				break;
			case 2:
				System.out.println("voce pode adicionar sequintes caracteres *9Ab");
				break;
			case 3:
				System.out.println("voce pode adicionar sequintes caracteres *Ab");
				break;
			case 4:
				System.out.println("voce pode adicionar sequintes caracteres *1");
				break;
			case 5:
				System.out.println("voce pode adicionar sequintes caracteres @");
				break;
			default:
				System.out.println("");
			}
				
					
				
				System.out.println();
				if (number.equals("") || caracaterEspecial.equals("") || minusculas.equals("")|| maiusculas.equals("") || senhaPessoa.length>=7) {
					System.out.println("-----NOTIFICAÇÃO-----");
					System.out.println(
							"Você precisa digitar um valor numerico,  1 letra em maiúsculo,  1 letra em minúsculo e caracteres especiais.");
				} else {
					System.out.println("sistema de caracteres digitados corretamente, a senha passou");
					reinicia = 'f';
				}

			}
			sc.close();
		}
		
	
	
}
