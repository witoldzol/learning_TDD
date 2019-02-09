import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class DrawShapeTest {

	DrawShape tested;
	Shape triangle;
	
	@Before
	public void setUp() throws Exception {
		tested = new DrawShape();
		triangle = new Triangle();
	}

	@Test
	public void when_passed_Triangle_should_return_Triangle_string() {
		String expected = "Triangle";
		assertEquals(expected, tested.draw(triangle));
	}

}
