package org.sonar.java.nineteen.jep405;

public interface GeometricObject {
  default boolean contains(GeometricObject go) {
    return false;
  }
}
