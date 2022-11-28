package org.sonar.java.nineteen;

import java.util.logging.Logger;
import org.sonar.java.nineteen.jep405.Line;
import org.sonar.java.nineteen.jep405.Point;

public class Main {
  private static final Logger LOG = Logger.getLogger(Main.class.getName());

  public static void main(String[] args) {
    var pointA = new Point(1, 1);
    var pointB = new Point(4, 2);
    var line = new Line(pointA, pointB);
    LOG.info(pointA.toString());
    LOG.info(pointB.toString());
    LOG.info(line.toString());
  }
}