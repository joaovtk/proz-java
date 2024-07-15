package calc;

public class Less {
    public static double normal(double x, double y){
        return x - y;
    }
    public static double multiply(double[] arr){
        double res = 0;
        for(double i: arr){
            res -= i;
        }

        return res;
    }
}
