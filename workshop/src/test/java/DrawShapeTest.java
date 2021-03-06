import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class DrawShapeTest {

	DrawShape tested;
	
	@Before
	public void setUp() throws Exception {
		tested = new DrawShape();
	}

	@Test
	public void when_passed_Triangle_should_return_Triangle_string() {
		String expected = "Triangle";
		assertEquals(expected, tested.draw(new Triangle()));
	}

}
