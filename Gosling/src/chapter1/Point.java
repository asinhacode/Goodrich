package chapter1;

public class Point {

	private double x;
	private double y;
	
		public Point()
		{
			
		}
		
		public void reset()
		{
			this.setX(0.0);
			this.setY(0.0);
		}

		public double getX() {
			return this.x;
		}

		public void setX(double x) {
			this.x = x;
		}

		public double getY() {
			return this.y;
		}

		public void setY(double y) {
			this.y = y;
		}
		
		public void copyValue(Point that)
		{
			this.setX(that.getX());
			this.setY(that.getY());
		}

}
