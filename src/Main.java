import edu.princeton.cs.algs4.StdOut;
public class Main {

    public static int[] histogram(int[] a, int M){
        int[] result = new int[M];
        for(int i = 0; i < M; i ++){
            int count = 0;
            for(int j = 0; j < a.length; j ++){
                if(a[j] == i){
                    count ++;
                }
            }
            result[i] = count;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");

        int[] a = {2,4,7,9,4,3,1,7,0,8,5};
        int[] r = histogram(a, a.length);
        for (int i: r
             ) {
            StdOut.println(i);
        }

    }
}
