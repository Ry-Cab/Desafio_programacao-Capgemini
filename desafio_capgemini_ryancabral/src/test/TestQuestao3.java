package test;


import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import questao_3.Questao3;


class TestQuestao3 {

	@Test
	void testOvo() {
		Questao3 testQuestao3 = new Questao3();
		assertEquals(2, testQuestao3.subAnagrams("ovo"));
		//2 retorno esperado de 2 anagramas pares
	}
	
	@Test
	void testIfailuhkqq() {
		Questao3 testQuestao3 = new Questao3();
		assertEquals(3, testQuestao3.subAnagrams("ifailuhkqq"));
		//3 é retorno esperado de 3 anagramas pares
	}
	
	@Test
	void testAbc() {
		Questao3 testQuestao3 = new Questao3();
		assertEquals(0, testQuestao3.subAnagrams("abc"));
		
		//0 é retorno esperado de 0 anagramas pares

	}

}
