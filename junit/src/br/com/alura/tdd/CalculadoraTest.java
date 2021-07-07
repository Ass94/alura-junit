package br.com.alura.tdd;

import org.junit.Assert;
import org.junit.jupiter.api.Test;



public class CalculadoraTest {
	
	@Test
	public void deveriaSomarDoisNumerosPositivos() {
		Calculadora cal = new Calculadora();
		int soma = cal.somar(3, 7);
		Assert.assertEquals(10, soma);
		
	}
}
