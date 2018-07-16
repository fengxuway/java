package a4.chap1.f2;

import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdOut;

import java.util.ArrayList;

public class Ex6 {
    public static void main(String[] args){
        String s = "ACTGACG";
        String n = "TGACGAC";
        if((s + s).contains(n) && (n + n).contains(s)){
            StdOut.println("True");
        }else{
            StdOut.println("False");
        }

    }
}
