import java.awt.*;

public class Rectangle extends Shape {
  int width;
  int height;

  public Rectangle(Color colour, int width, int height) {
    super(colour);
    this.width = width;
    this.height = height;
  }

  @Override
  public double getArea() {
    return width*height;
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof Rectangle){
      Rectangle other = (Rectangle)o;
      return super.equals(other) && this.height == other.height && this.width == other.width;
    }
    return false;
  }
}
