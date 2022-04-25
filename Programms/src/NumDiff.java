public class NumDiff {

    private static final double x0 = 0.5;
    private static double Dvonh(double h){
        double o = f(x0+h)-(f(x0));
        return (o/h);
    }
    private static double Svonh(double h){
        double o = f(x0+h)-(f(x0-h));
        return (o/(2*h));
    }
    private static double f(double x){
        return x * Math.sin(x);
    }
    private static double fstrich(){
        return x0*Math.cos(x0)+Math.sin(x0);
    }
    public static void main(String[] args) {
        for(int n = 1; n <= 20; n++){
            System.out.println("|D(h)-f'(x0)|: "+Math.abs(Dvonh(Math.pow(0.25,n))-fstrich()));
            System.out.println("|S(h)-f'(x0)|: "+Math.abs(Svonh(Math.pow(0.25,n))-fstrich()));
            System.out.println();
        }

    }

}
