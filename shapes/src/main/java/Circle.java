

import java.awt.*;


public class Circle extends Shape {

  double radius;

  public Circle(Color colour,double radius) {
    super(colour);
    this.radius = radius;
  }




  @Override
  public double getArea () {

    return (radius*(Math.PI*10));
  }


  @Override
  public boolean equals(Object obj) {
  if (this == obj) return true;
  if (obj == null || getClass() != obj.getClass()) return false;
  return super.equals(((Circle) obj).getArea()) || super.getColor().equals(((Circle) obj).getColor()); }

  @Override
  public int hashCode() {
    return Double.valueOf(radius).hashCode() + super.hashCode();
  }


}
