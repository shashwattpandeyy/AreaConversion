public class AreaCalculator {
    public static String area(double radius){
        if(radius < 0){
            return "invalid Statement" ;
        }else{
            double pi = (double) Math.PI;
            double area = (double) (radius * radius * pi);
            return String.valueOf ( (double  ) area );
        }
    }
    public static String area(double x, double y){
        if(x< 0 || y< 0){
            return "Invalid value";

        }else{
            long area = (long) (x * y);
            return String.valueOf ( area );
        }
    }
}
