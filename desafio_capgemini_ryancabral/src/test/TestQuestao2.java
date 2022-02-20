package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import questao_2.Questao2;

class TestQuestao2 {

	@Test
	void testPassword() {
		Questao2 test = new Questao2();
		assertEquals(3,test.Password("Ya3"));
		//3 � a quantidade de caracteres que faltam 
	}
	
	@Test
	void testPassword2() {
		Questao2 test = new Questao2();
		assertEquals(0,test.Password("Ya3&ab"));
		//� esperado que n�o falte nenhum caractere (0)
	}
	
	@Test
	void testPassword3() {
		Questao2 test = new Questao2();
		assertEquals(5,test.Password("Y"));
		//5 � a quantidade de caracteres que faltam 

	}
}
