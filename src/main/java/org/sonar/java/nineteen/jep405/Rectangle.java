package org.sonar.java.nineteen.jep405;

public record Rectangle(Point a, Point b) implements Polygon {

  @Override
  public boolean equals(java.lang.Object o) {
    if (o != null && o instanceof Rectangle(var x,var y)) {
      return this.a.equals(x) && this.b.equals(y);
    }
    return false;
  }
}
