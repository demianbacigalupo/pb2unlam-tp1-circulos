package ar.edu.unlam.tp1.circulo;

public class Circulo {
	
	private static final Double PI = 3.14;
	private Double radio;
	private Double circunferencia;
	
	public Circulo(Double radioingresado){
		this.radio=radioingresado;


	}
	
	public Double crearCircunferencia()
	{
		this.circunferencia=2 * radio * PI;
		return circunferencia;
	}
	
	public double getcircunferencia(Double radioingresado){
		return this.circunferencia;
	}

}
