package org.sonar.java.nineteen.jep405;

public record Rectangle(Point a, Point b) {

  @Override
  public boolean equals(Object o) {
    if (o != null && o instanceof Rectangle(var x, var y)) {
      return this.a.equals(x) && this.b.equals(y);
    }
    return false;
  }
}
