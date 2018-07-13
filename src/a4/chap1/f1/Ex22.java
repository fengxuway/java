package a4.chap1.f1;
import edu.princeton.cs.algs4.*;

public class Ex22 {
    static int rank(int[] array, int number){
        return rank(array, number, 0, array.length-1);
    }

    static int rank(int[] array, int number, int s, int e){
        if(s > e){
            return -1;
        }
        int m = (s + e) / 2;
        StdOut.printf("[%s - %s] - %s\n", s, e, m);
        if(array[m] == number){
            return m;
        }
        if(array[m] > number){
            return rank(array, number, s, m-1);
        }
        return rank(array, number, m+1, e);
    }

    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6,7,8,9};
        StdOut.println(rank(array, 8));
        StdOut.println(rank(array, 5));
        StdOut.println(rank(array, 1));
        StdOut.println(rank(array, 9));
        StdOut.println(rank(array, 0));
    }
}
