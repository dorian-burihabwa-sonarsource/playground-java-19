package org.sonar.java.nineteen.jep405;


import org.junit.jupiter.api.Test;
import org.sonar.java.nineteen.Point;

import static org.assertj.core.api.Assertions.assertThat;


class LineTest {

  @Test
  public void test_equality() {
    Point a = new Point(0, 0);
    Point b = new Point(1, 0);
    Line first = new Line(a, b);
    Line second = new Line(a, b);
    assertThat(first).isEqualTo(second);
  }

  @Test
  public void test_contains() {
    Point a = new Point(0, 0);
    Point b = new Point(1, 0);
    Point c = new Point (0, 1);
    Line line = new Line(a, b);
    Line impossibleLine = new Line(a, a);
    assertThat(line.contains(a)).isTrue();
    assertThat(line.contains(b)).isTrue();
    assertThat(line.contains(c)).isFalse();
    assertThat(line.contains(line)).isTrue();
    assertThat(line.contains(impossibleLine)).isFalse();
  }

}