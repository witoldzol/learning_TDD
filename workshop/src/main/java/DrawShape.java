
public class DrawShape {
	
	private Shape shape;
	
	public void setShape(Shape shape) {
		this.shape = shape;
	}

	public String draw(Shape shape) {
		return shape.draw();
	}
	
}
