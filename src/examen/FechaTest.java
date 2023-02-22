package examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FechaTest {

Fecha fc= new Fecha();

	@Test
	void CP1() {
		boolean esperado=fc.validarFecha(1915, 2, 7);
	assertTrue(esperado);
	}
	@Test
	void CP2() {
		boolean esperado=fc.validarFecha(1915, 2, -1);
	assertFalse(esperado);
	}
	@Test
	void CP3() {
		boolean esperado=fc.validarFecha(1915, -4, 7);
	assertFalse(esperado);
	}
	@Test
	void CP4() {
		boolean esperado=fc.validarFecha(-5, 2, 7);
	assertFalse(esperado);
	}
	@Test
	
	void CP5() {
		boolean esperado=fc.validarFecha(1915, 24, 7);
	assertFalse(esperado);
	}
	@Test
	void CP6() {
		boolean esperado=fc.validarFecha(1915, 2, 45);
	assertFalse(esperado);
	}
	@Test
	void CP7() {
		boolean esperado=fc.validarFecha(1915, 4, 7);
	assertTrue(esperado);
	}
	@Test
	void C8() {
		boolean esperado=fc.validarFecha(1915, 5, 7);
	assertTrue(esperado);
	}

}
