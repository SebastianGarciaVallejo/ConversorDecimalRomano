package co.udea.edu.test;

import static org.junit.Assert.*;

import org.junit.Test;

import co.udea.edu.AppEmpresarial.Romano;

public class TestConversor {

	private String convertido;
	Romano conversor;
	
	@Test
	public void datoInvalido() {
		conversor = new Romano();
		convertido = conversor.retornaRomano(4000);
		assertEquals("error",convertido);
	}
	
	@Test
	public void cero() {
		conversor = new Romano();
		convertido = conversor.retornaRomano(0);
		assertEquals("",convertido);
	}
	
	@Test
	public void uno() {
		conversor = new Romano();
		convertido = conversor.retornaRomano(1);
		assertEquals("I",convertido);
	}	
	
	@Test
	public void dos() {
		conversor = new Romano();
		convertido = conversor.retornaRomano(2);
		assertEquals("II",convertido);
	}
	
	@Test
	public void tres() {
		conversor = new Romano();
		convertido = conversor.retornaRomano(3);
		assertEquals("III",convertido);
	}
	
	@Test
	public void cuatro() {
		conversor = new Romano();
		convertido = conversor.retornaRomano(4);
		assertEquals("IV",convertido);
	}
	
	@Test
	public void cinco() {
		conversor = new Romano();
		convertido = conversor.retornaRomano(5);
		assertEquals("V",convertido);
	}
	
	@Test
	public void seis() {
		conversor = new Romano();
		convertido = conversor.retornaRomano(6);
		assertEquals("VI",convertido);
	}
	
	@Test
	public void siete() {
		conversor = new Romano();
		convertido = conversor.retornaRomano(7);
		assertEquals("VII",convertido);
	}
	
	@Test
	public void ocho() {
		conversor = new Romano();
		convertido = conversor.retornaRomano(8);
		assertEquals("VIII",convertido);
	}
	
	@Test
	public void nueve() {
		conversor = new Romano();
		convertido = conversor.retornaRomano(9);
		assertEquals("IX",convertido);
	}
	
	@Test
	public void diez() {
		conversor = new Romano();
		convertido = conversor.retornaRomano(10);
		assertEquals("X",convertido);
	}
	
	@Test
	public void veinte() {
		conversor = new Romano();
		convertido = conversor.retornaRomano(20);
		assertEquals("XX",convertido);
	}
	
	@Test
	public void treinta() {
		conversor = new Romano();
		convertido = conversor.retornaRomano(30);
		assertEquals("XXX",convertido);
	}
	
	@Test
	public void cuarenta() {
		conversor = new Romano();
		convertido = conversor.retornaRomano(40);
		assertEquals("XL",convertido);
	}	
	
	@Test
	public void cincuenta() {
		conversor = new Romano();
		convertido = conversor.retornaRomano(50);
		assertEquals("L",convertido);
	}
	
	@Test
	public void sesenta() {
		conversor = new Romano();
		convertido = conversor.retornaRomano(60);
		assertEquals("LX",convertido);
	}
	
	@Test
	public void Setenta() {
		conversor = new Romano();
		convertido = conversor.retornaRomano(70);
		assertEquals("LXX",convertido);
	}
	
	@Test
	public void ochenta() {
		conversor = new Romano();
		convertido = conversor.retornaRomano(80);
		assertEquals("LXXX",convertido);
	}
	
	@Test
	public void noventa() {
		conversor = new Romano();
		convertido = conversor.retornaRomano(90);
		assertEquals("XC",convertido);
	}
	
	@Test
	public void cien() {
		conversor = new Romano();
		convertido = conversor.retornaRomano(100);
		assertEquals("C",convertido);
	}
	
	@Test
	public void doscientos() {
		conversor = new Romano();
		convertido = conversor.retornaRomano(200);
		assertEquals("CC",convertido);
	}
	
	@Test
	public void trescientos() {
		conversor = new Romano();
		convertido = conversor.retornaRomano(300);
		assertEquals("CCC",convertido);
	}
	
	@Test
	public void cuatrocientos() {
		conversor = new Romano();
		convertido = conversor.retornaRomano(400);
		assertEquals("CD",convertido);
	}	
	
	@Test
	public void novecientos() {
		conversor = new Romano();
		convertido = conversor.retornaRomano(900);
		assertEquals("CM",convertido);
	}
	
	@Test
	public void mil() {
		conversor = new Romano();
		convertido = conversor.retornaRomano(1000);
		assertEquals("M",convertido);
	}
	
	@Test
	public void convertir3999() {
		conversor = new Romano();
		convertido = conversor.retornaRomano(3999);
		assertEquals("MMMCMXCIX",convertido);
	}
	
	@Test
	public void convertir856() {
		conversor = new Romano();
		convertido = conversor.retornaRomano(856);
		assertEquals("DCCCLVI",convertido);
	}
	
	@Test
	public void convertir1490() {
		conversor = new Romano();
		convertido = conversor.retornaRomano(1490);
		assertEquals("MCDXC",convertido);
	}
	
	@Test
	public void convertir2096() {
		conversor = new Romano();
		convertido = conversor.retornaRomano(2096);
		assertEquals("MMXCVI",convertido);
	}
	
	@Test
	public void convertir3333() {
		conversor = new Romano();
		convertido = conversor.retornaRomano(3333);
		assertEquals("MMMCCCXXXIII",convertido);
	}	
}
