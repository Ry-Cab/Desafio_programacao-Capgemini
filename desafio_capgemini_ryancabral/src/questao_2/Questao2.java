package questao_2;

public class Questao2 {
	
		public int Password(String characters) {
			//O método length verifica quantos cararacteres tem uma string qualquer.
		
			/*
			*Se essa quantidade de caracteres contados pelo método
			*length() for menor que 6 irá retornar um número do tipo int
			*mostrando quantos números faltam para ser uma senha segura
			*/
			
			if(characters.length() < 6) {
				return 6 - characters.length() ; 
			}else {
				return 0;
			}
			
			/*
			*Se não estiver nenhum caractere faltando o algorítmo 
			*irá retornar 0 que subtende que há 0 caracteres faltando (nada)
			*/
		}
		
	

}
