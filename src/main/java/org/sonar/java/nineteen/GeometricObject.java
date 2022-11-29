package org.sonar.java.nineteen;

public interface GeometricObject {
  default boolean contains(GeometricObject go) {
    return false;
  }
}
