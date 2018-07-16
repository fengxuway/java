package a4.chap1.f2;

import edu.princeton.cs.algs4.StdOut;

class Rational{
    int numerator;
    int denominator;

    Rational(int numerator, int denominator){
        this.denominator = denominator;
        this.numerator = numerator;
    }

    Rational plus(Rational b){
        int n = b.numerator * this.denominator + this.numerator * b.denominator;
        int d = b.denominator * this.denominator;
        return new Rational(n, d);
    }

    Rational minus(Rational b){
        int n = b.denominator * this.numerator - this.denominator * b.numerator;
        int d = b.denominator * this.denominator;
        return new Rational(n, d);
    }

    Rational times(Rational b){
        int n = b.numerator * this.numerator;
        int d = b.denominator * this.denominator;
        return new Rational(n, d);
    }

    Rational divides(Rational b){
        int n = this.numerator * b.denominator;
        int d = this.denominator * b.numerator;
        return new Rational(n, d);
    }

    boolean equals(Rational b){
        return b.numerator / this.numerator == b.denominator / this.denominator;
    }

    public String toString(){
        return "<"+this.numerator+"/"+this.denominator+">";
    }
}

public class Ex16 {

    public static void main(String[] args){
        Rational r1 = new Rational(1, 3);
        Rational r2 = new Rational(1, 2);
        StdOut.println(r1.divides(r2));

    }
}
