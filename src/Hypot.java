/*
 * Jason D. F. D'Oyley
 * Dec 19, 2022
 * Ch02: Introduction to Data Types and Operators
 * Instruction: Use the Pythagorean theorem to
 * find the length of the hypotenuse given the
 * lengths of the two opposing sides.
 * */

public class Hypot {
    public static void main(String[] args) {
        double x, y, z;

        x = 3;
        y = 4;

        z = Math.sqrt(x*x + y*y);

        System.out.println("Hypotenuse is " + z);
    }
}
