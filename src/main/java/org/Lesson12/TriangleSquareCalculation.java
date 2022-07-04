package org.Lesson12;

public class TriangleSquareCalculation {

    public  static  double computeTriangleSquare(int a, int b, int c) throws TriangleNotExistException {
        if ((a <= 0 || b <= 0 || c <= 0) || (((a + b) < c) & ((b + c) < a) & ((a + c) < b))) {
            throw new TriangleNotExistException("Введенные стороны не образуют треугольник");
        }
        double semiperimeter = (a + b + c)/ 2;
        double square = Math.sqrt(semiperimeter * (semiperimeter - a) * (semiperimeter - b) * (semiperimeter - c));
        return square;
    }

}
