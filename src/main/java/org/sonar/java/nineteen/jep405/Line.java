package org.sonar.java.nineteen.jep405;

import java.util.Optional;

public record Line(Point a, Point b) {

  public Line {
    float m = ((float) a.y() - b.y()) / (a.x() - b.x());
    float c = (-1 * b.x()) * m + b.x();
  }


  boolean contains(Point point) {
    return false;
  }

  Optional<Point> intersection(Line other) {
    return Optional.empty();
  }

  boolean intersectsWith(Line other) {
    return intersection(other).isPresent();
  }

  boolean isParallelTo(Line other) {
    return !intersectsWith(other);
  }

  @Override
  public String toString() {
    return "y = %fx + %f".formatted(computeSlope(), computeOffset());
  }

  private float computeSlope() {
    return ((float) a.y() - b.y()) / (a.x() - b.x());
  }

  private float computeOffset() {
    return  (-1.0f * b.y()) + b.y();
  }

  @Override
  public boolean equals(Object o) {
    if (o == null) {
      return false;
    }
    if (o instanceof Line line) {
      return this.computeSlope() == line.computeSlope() && this.computeOffset() == line.computeOffset();
    }
    return false;
  }
}
