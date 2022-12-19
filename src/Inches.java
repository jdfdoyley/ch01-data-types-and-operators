/*
* Jason D. F. D'Oyley
* Dec 19, 2022
* Ch02: Introduction to Data Types and Operators
* Instruction: Compute the number of cubic inches
* in 1 cubic mile.
* */

public class Inches {
    public static void main(String[] args) {
        long ci;
        long im;

        im = 5280 * 12;
        ci = im * im * im;

        System.out.println(
                "There are " + ci +
                " cubic inches in cubic mile."
        );
    }
}
