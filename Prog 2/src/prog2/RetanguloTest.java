package prog2;

import static org.junit.Assert.*;

import org.junit.Test;

public class RetanguloTest {

	@Test
	public void retanguloTest() {
		Retangulo ret = new Retangulo();
		ret.print();	
	}
	
	@Test 
	public void retanguloTest(Ponto2D a) {
		Retangulo ret = new Retangulo(5.0, 6.0, 10.0, 11.0);
		ret.print();		
	}
	
	

}
