package org.sonar.java.nineteen.jep427;

import org.sonar.java.nineteen.Point;
import org.sonar.java.nineteen.Polygon;

public record Rectangle(Point a, Point b) implements Polygon {

  @Override
  public boolean equals(java.lang.Object o) {
    if (o != null && o instanceof Rectangle(var x,var y)) {
      return (this.a.equals(x) && this.b.equals(y)) ||
        (this.a.equals(y) && this.b.equals(x));
    }
    return false;
  }
}
