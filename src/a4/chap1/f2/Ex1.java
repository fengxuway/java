package a4.chap1.f2;
import edu.princeton.cs.algs4.*;
import java.util.ArrayList;
import java.awt.*;

/**
 * 编写一个Point2D的用例，从命令行接受一个整数N。在单位正方形中生成N个随机数，然后计算两点之间的最近距离。
 */
public class Ex1 {
    public static void main(String[] args){
        int N = 2;
        ArrayList<Point2D> list = new ArrayList<>();
        ArrayList<Double> list2 = new ArrayList<>();
        for(int i = 0; i < N; i++){
            double x = Math.random();
            double y = Math.random();
            Point2D p = new Point2D(x, y);
            list.add(p);
            p.draw();
            double juli = Math.sqrt(x * x + y * y);
            list2.add(juli);
            StdOut.print(juli + ",");
        }
        double x = 2;
        for(int j = 0; j < list2.size(); j ++){
            x = list2.get(j) < x ? list2.get(j) : x;

        }
        StdOut.println("Min: " + x);

    }
}
