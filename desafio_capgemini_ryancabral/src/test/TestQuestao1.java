package test;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import questao_1.Questao1;


class TestQuestao1 {
	
	@Test
	void test10Asterisks() {
		Questao1 testQuestao1 = new Questao1();
		assertEquals(55, testQuestao1.Stairs(10));
		//55 � a quantidade de aster�sticos inseridos na matriz.
		//(Isso � verificado quando o teste n�o passa e retorna a quantidade que "n�o foi esperada")
		//Complementando com a comprova��o do resultado no console :)
	}

	@Test
	void test6Asterisks() {
		Questao1 testQuestao1 = new Questao1();
		assertEquals(21, testQuestao1.Stairs(6));
		//21 � a quantidade de aster�sticos inseridos na matriz.
		//Complementando com a comprova��o do resultado no console :)
	}
	
	@Test
	void test3Asterisks() {
		Questao1 testQuestao1 = new Questao1();
		assertEquals(6, testQuestao1.Stairs(3));
		//6 � a quantidade de aster�sticos inseridos na matriz.
		//Complementando com a comprova��o do resultado no console :)
	}
	
	
	

}
