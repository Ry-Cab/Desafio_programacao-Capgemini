package questao_2;

public class Questao2 {
	
		public int Password(String characters) {
			//O m�todo length verifica quantos cararacteres tem uma string qualquer.
		
			/*
			*Se essa quantidade de caracteres contados pelo m�todo
			*length() for menor que 6 ir� retornar um n�mero do tipo int
			*mostrando quantos n�meros faltam para ser uma senha segura
			*/
			
			if(characters.length() < 6) {
				return 6 - characters.length() ; 
			}else {
				return 0;
			}
			
			/*
			*Se n�o estiver nenhum caractere faltando o algor�tmo 
			*ir� retornar 0 que subtende que h� 0 caracteres faltando (nada)
			*/
		}
		
	

}
