package questao_3;

import java.util.ArrayList;
import java.util.Arrays;

public class Questao3 {

	public int subAnagrams(String word) {
		
		ArrayList<String> substrings = new ArrayList<>();
		int count = 0;
	
		/*O método length() mapeia a quantidade de caracteres em uma paralavra
		 * Nessa estrutura de repetição cada caractere de uma 
		 *String é mapeado para depois ser passado pelo método 
		 *substrings um método do Java que forma substrings de uma palavra
		 */
		for(int i = 0; i <= word.length(); i++) {
			
			for(int j = i + 1; j <= word.length(); j++) {
				
				var substring = word.substring(i, j);
				//"i" veio da primeira estrutura de repetição que por exemplo mapeia
				//A primeira string. E o "j" a segunda string + 1
				//Comparando um caractere com todas os outros caracteres de uma palavra
				//Possibilitando o anagrama em pares
				
				substrings.add(substring);
				//A cada anagrama formado é adicionado a uma lista (Instanciado na linha 10)
				//Para poder ser comparado depois 
			}
		}
		
		//Nessa estrutura conta a quantidade de anagrama pares
		//E guardando na variável count 
		//E chamando o método que compara dois anagramas 
		for(int i = 0; i < substrings.size(); i++) {
			
			for(int j = i + 1; j < substrings.size(); j++) {
				
				if(isAnagram(substrings.get(i), substrings.get(j))) {
					count++;
				}
			}
		}
		
		return count;
			
		
	}
	
	//Nesse método compara duas strings que contém o mesmo caractere no ínicio
	//Evitando assim a redundancia de pares de anagramas
	public static boolean isAnagram(String s1, String s2) {
		String[] s11 = s1.split("");
		Arrays.sort(s11);
		
		String[] s22 = s2.split("");
		Arrays.sort(s22);
		
		String joined1 = String.join("",s11);
		
		String joined2 = String.join("",s22);
		
		return joined1.equals(joined2);
	}	
		
}
	
	

	


