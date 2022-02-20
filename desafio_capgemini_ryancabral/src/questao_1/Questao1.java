package questao_1;



public class Questao1 {

	
		public int Stairs(int number) {			
			/*Declaro uma matriz n x n  que cont�m os mesmos valores 
			* de altura e largura fazendo com que tenha a mesmas quantidade
			* de aster�sticos tanto na vertical quanto na horizontal
			*/
			String[][] stairs = new String[number][number];
			
			int columnNumber = stairs.length - 1;
			int rowNumber = -1;
			int countAsterisk = 0;
			
			
			/*Essa primeria estrutura cont�m duas repeti��es uma que
			 * calcula a quantidade de espa�os que devem ser adicionados e onde
			 * devem ser colocados 
			 */ 
			for(int row = 0; row < stairs.length; row++) {
				
				for(int column = columnNumber; column > 0; column--) {
						
						rowNumber++;	
						stairs[row][rowNumber] = " ";
						
						if(column == 1) {
							rowNumber = -1;
						}
					}
					
					
				columnNumber--;
				
			}
			
			//Essa estrutura mapeia quantidade de c�lulas qua n�o receberam
			//espa�os vazios, caracterizando-as do tipo null
			for(int row = 0; row < stairs.length; row++) {
				
				//Essa estrutura em espec�fico mapeia a quantidade de c�lulas 
				//vazias(null)  e substitui com um aster�sticos finalizando uma 
				//matriz com o efeito escada
				for(int column = 0; column < stairs.length; column++) {
					if(stairs[row][column]==null) {
						stairs[row][column]="*";
						
						//Caucula a quantidade de aster�sticos 
						countAsterisk++;
						
					}
				}
				
			}
			
			
			//Por �ltimo essa estrutura foi feita para imprimir todos os 
			//�ndices da matriz de forma sequencial caracterizando o 
			//efeito escada
			for(int row = 0; row < stairs.length; row++) {
				
				for(int column = 0; column < stairs.length; column++) {
			
					System.out.print(stairs[row][column]);
				}
				System.out.println("");
			}
			
			//Retorna a quantidade de aster�sticos para testes unit�rios
			return countAsterisk;
		}
		
	

}
