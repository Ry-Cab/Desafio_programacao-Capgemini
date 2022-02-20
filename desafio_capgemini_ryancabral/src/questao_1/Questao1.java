package questao_1;



public class Questao1 {

	
		public int Stairs(int number) {			
			/*Declaro uma matriz n x n  que contém os mesmos valores 
			* de altura e largura fazendo com que tenha a mesmas quantidade
			* de asterísticos tanto na vertical quanto na horizontal
			*/
			String[][] stairs = new String[number][number];
			
			int columnNumber = stairs.length - 1;
			int rowNumber = -1;
			int countAsterisk = 0;
			
			
			/*Essa primeria estrutura contém duas repetições uma que
			 * calcula a quantidade de espaços que devem ser adicionados e onde
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
			
			//Essa estrutura mapeia quantidade de células qua não receberam
			//espaços vazios, caracterizando-as do tipo null
			for(int row = 0; row < stairs.length; row++) {
				
				//Essa estrutura em específico mapeia a quantidade de células 
				//vazias(null)  e substitui com um asterísticos finalizando uma 
				//matriz com o efeito escada
				for(int column = 0; column < stairs.length; column++) {
					if(stairs[row][column]==null) {
						stairs[row][column]="*";
						
						//Caucula a quantidade de asterísticos 
						countAsterisk++;
						
					}
				}
				
			}
			
			
			//Por último essa estrutura foi feita para imprimir todos os 
			//índices da matriz de forma sequencial caracterizando o 
			//efeito escada
			for(int row = 0; row < stairs.length; row++) {
				
				for(int column = 0; column < stairs.length; column++) {
			
					System.out.print(stairs[row][column]);
				}
				System.out.println("");
			}
			
			//Retorna a quantidade de asterísticos para testes unitários
			return countAsterisk;
		}
		
	

}
