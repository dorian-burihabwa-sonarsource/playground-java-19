package org.sonar.java.nineteen.jep427;

import org.junit.jupiter.api.Test;
import org.sonar.java.nineteen.GeometricObject;
import org.sonar.java.nineteen.Point;
import org.sonar.java.nineteen.jep405.Line;

import static org.assertj.core.api.Assertions.assertThat;

public class RectangleTest {
  @Test
  void is_equal_to_itself() {
    Rectangle rectangle = new Rectangle(new Point(0, 0), new Point(1, 1));
    Rectangle flippedRectangle = new Rectangle(new Point(0, 0), new Point(1, 1));
    assertThat(rectangle).isEqualTo(rectangle);
  }

  @Test
  void is_equal_to_itself_flipped() {
    var a = new Point(0, 0);
    var b = new Point(1, 1);
    Rectangle rectangle = new Rectangle(a, b);
    Rectangle flippedRectangle = new Rectangle(b, a);
    assertThat(rectangle).isEqualTo(flippedRectangle);
  }

  @Test
  void is_not_equal_to_a_different_rectangle() {
    Rectangle rectangle = new Rectangle(new Point(0, 0), new Point(1, 1));
    Rectangle otherRectangle = new Rectangle(new Point(1, 1), new Point(2, 3));
    assertThat(rectangle).isNotEqualTo(otherRectangle);
  }

  @Test
  void is_not_equal_to_a_non_rectangle() {
    Point a = new Point(0, 0);
    Point b = new Point(1, 1);
    Rectangle rectangle = new Rectangle(a, b);
    GeometricObject otherRectangle = new Line(a, b);
    assertThat(rectangle).isNotEqualTo(otherRectangle);
  }
}
