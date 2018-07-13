package a4.chap1.f1;
import edu.princeton.cs.algs4.*;
public class Ex35 {
    static double[] side_percent(){
        int side = 6;
        double[] array = new double[2 * side + 1];
        for(int i = 1; i <= side; i++){
            for(int j = 1; j <= side; j++){
                array[i + j] += 1.0;
            }
        }
        for(int k = 2; k < array.length; k ++){
            array[k] /= 36.0;
        }
        return array;
    }
    public static void main(String[] args){
        double[] r = side_percent();
        for(int i = 0; i< r.length; i++){
            StdOut.println(i + " - " + r[i]);
        }
    }
}
