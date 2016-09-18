package ar.edu.unlam.tp1.circulo;

import org.junit.Assert;
import org.junit.Test;

public class CirculoTest {
	
	@Test
	public void crearCirculoConRadio2(){
		Circulo miCirculo = new Circulo(2.0);
		
		Double valorEsperado = 12.56;
		
		Double valorActual = miCirculo.crearCircunferencia();
		
		Assert.assertEquals(valorEsperado, valorActual, 0.01);
			
	}
	
	@Test
	public void crearCirculoConRadio37(){
		Circulo miCirculo = new Circulo(3.7);
		
		Double valorEsperado = 23.23;
		
		Double valorActual = miCirculo.crearCircunferencia();
		
		Assert.assertEquals(valorEsperado, valorActual, 0.01);
		
	}
	
	@Test
	public void crearCirculoConRadio5(){
		Circulo miCirculo = new Circulo(5.0);
		
		Double valorEsperado = 31.40;
		
		Double valorActual = miCirculo.crearCircunferencia();
		
		Assert.assertEquals(valorEsperado, valorActual, 0.01);
	}
	
	@Test
	public void crearCirculoConRadio109(){
		Circulo miCirculo = new Circulo(10.9);
		
		Double valorEsperado = 68.45;
		
		Double valorActual = miCirculo.crearCircunferencia();
		
		Assert.assertEquals(valorEsperado, valorActual, 0.01);
	}
	
	@Test
	public void crearCirculoConRadio98Comparar61573(){
		Circulo miCirculo = new Circulo(9.8);
		
		Double valorEsperado = 615.73;
		
		Double valorActual = miCirculo.crearCircunferencia();
		
		Assert.assertEquals(valorEsperado, valorActual, 0.01);
	}
	
	@Test
	public void crearCirculoConRadio166Comparar86567(){
		Circulo miCirculo = new Circulo (16.6);
		
		Double valorEsperado = 865.67;
		
		Double valorActual = miCirculo.crearCircunferencia();
		
		Assert.assertEquals(valorEsperado, valorActual, 0.01);
	}

}
