package testeCap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Questão_3 {
	
	static int anagramas(String palavra) {
        Map<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < palavra.length(); i++) {
            for (int j = i; j < palavra.length(); j++) {
                char[] substrings = palavra.substring(i, j + 1).toCharArray();
                Arrays.sort(substrings);
                String newPalavra = new String(substrings);

                if (hashMap.containsKey(newPalavra)) {
                    hashMap.put(newPalavra, hashMap.get(newPalavra) + 1);
                } else {
                    hashMap.put(newPalavra, 1);
                }
            }
        }
        int anagramaPares = 0;
        for (String newPalavra : hashMap.keySet()) {
            int i = hashMap.get(newPalavra);
            anagramaPares += (i * (i - 1)) / 2;
        }
        return anagramaPares;
    }
	 
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String frase = scanner.next();

        System.out.print(anagramas(frase) + " anagramas possíveis");

    }
		
}