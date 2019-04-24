package ar.edu.unlam.pb2.persona;

import org.junit.Assert;
import org.junit.Test;

public class TestPersona {

	@Test
	
	public void testDeCompararDosPersonasPorDni() {
		
		Integer dni = 37000111;
		Integer dni2;
		String nombre = "juan";
		String nombre2= "pedro";
		Integer edad = 23;
		
		Persona miPersona = new Persona(dni,nombre,edad);
		Persona tuPersona = new Persona(dni,nombre2,edad);
		
		Assert.assertEquals(miPersona, tuPersona);
		Assert.assertTrue(miPersona.equals(tuPersona));
		
	}
}
