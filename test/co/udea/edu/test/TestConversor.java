package co.udea.edu.test;

import static org.junit.Assert.*;

import org.junit.Test;

import co.udea.edu.AppEmpresarial.Romano;

public class TestConversor {

	private String convertido;
	Romano conversor = new Romano();;
	
	@Test
	public void datoInvalido() {
		convertido = conversor.retornaRomano(4000);
		assertEquals("error",convertido);
	}
	
	@Test
	public void cero() {
		convertido = conversor.retornaRomano(0);
		assertEquals("",convertido);
	}
	
	@Test
	public void uno() {
		convertido = conversor.retornaRomano(1);
		assertEquals("I",convertido);
	}	
	
	@Test
	public void dos() {
		convertido = conversor.retornaRomano(2);
		assertEquals("II",convertido);
	}
	
	@Test
	public void tres() {
		convertido = conversor.retornaRomano(3);
		assertEquals("III",convertido);
	}
	
	@Test
	public void cuatro() {
		convertido = conversor.retornaRomano(4);
		assertEquals("IV",convertido);
	}
	
	@Test
	public void cinco() {
		convertido = conversor.retornaRomano(5);
		assertEquals("V",convertido);
	}
	
	@Test
	public void seis() {
		convertido = conversor.retornaRomano(6);
		assertEquals("VI",convertido);
	}
	
	@Test
	public void siete() {
		convertido = conversor.retornaRomano(7);
		assertEquals("VII",convertido);
	}
	
	@Test
	public void ocho() {
		convertido = conversor.retornaRomano(8);
		assertEquals("VIII",convertido);
	}
	
	@Test
	public void nueve() {
		convertido = conversor.retornaRomano(9);
		assertEquals("IX",convertido);
	}
	
	@Test
	public void diez() {
		convertido = conversor.retornaRomano(10);
		assertEquals("X",convertido);
	}
	
	@Test
	public void veinte() {
		convertido = conversor.retornaRomano(20);
		assertEquals("XX",convertido);
	}
	
	@Test
	public void treinta() {
		convertido = conversor.retornaRomano(30);
		assertEquals("XXX",convertido);
	}
	
	@Test
	public void cuarenta() {
		convertido = conversor.retornaRomano(40);
		assertEquals("XL",convertido);
	}	
	
	@Test
	public void cincuenta() {
		convertido = conversor.retornaRomano(50);
		assertEquals("L",convertido);
	}
	
	@Test
	public void sesenta() {
		convertido = conversor.retornaRomano(60);
		assertEquals("LX",convertido);
	}
	
	@Test
	public void Setenta() {
		convertido = conversor.retornaRomano(70);
		assertEquals("LXX",convertido);
	}
	
	@Test
	public void ochenta() {
		convertido = conversor.retornaRomano(80);
		assertEquals("LXXX",convertido);
	}
	
	@Test
	public void noventa() {
		convertido = conversor.retornaRomano(90);
		assertEquals("XC",convertido);
	}
	
	@Test
	public void cien() {
		convertido = conversor.retornaRomano(100);
		assertEquals("C",convertido);
	}
	
	@Test
	public void doscientos() {
		convertido = conversor.retornaRomano(200);
		assertEquals("CC",convertido);
	}
	
	@Test
	public void trescientos() {
		convertido = conversor.retornaRomano(300);
		assertEquals("CCC",convertido);
	}
	
	@Test
	public void cuatrocientos() {
		convertido = conversor.retornaRomano(400);
		assertEquals("CD",convertido);
	}	
	
	@Test
	public void novecientos() {
		convertido = conversor.retornaRomano(900);
		assertEquals("CM",convertido);
	}
	
	@Test
	public void mil() {
		convertido = conversor.retornaRomano(1000);
		assertEquals("M",convertido);
	}
	
	@Test
	public void convertir3999() {
		convertido = conversor.retornaRomano(3999);
		assertEquals("MMMCMXCIX",convertido);
	}
	
	@Test
	public void convertir856() {
		convertido = conversor.retornaRomano(856);
		assertEquals("DCCCLVI",convertido);
	}
	
	@Test
	public void convertir1490() {;
		convertido = conversor.retornaRomano(1490);
		assertEquals("MCDXC",convertido);
	}
	
	@Test
	public void convertir2096() {
		convertido = conversor.retornaRomano(2096);
		assertEquals("MMXCVI",convertido);
	}
	
	@Test
	public void convertir3333() {
		convertido = conversor.retornaRomano(3333);
		assertEquals("MMMCCCXXXIII",convertido);
	}	
}
