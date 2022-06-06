
import java.util.Arrays;

public class AchtPunktVier {

    private static final int n=20;
    private static Double[] c;
    private static Double[] xx;

    /**
     * Berechnet M und C
     * @return nxn Matrix M
     */
    private static Double[][] M(){
        Double[][] matrix = new Double[n][n];
        for(int i=0;i < n;i++){
            c[i] =0.0;
            for(int j=0;j<n;j++){
                matrix[i][j]=(1.0)/((i+1)+(j+1)-1.0);
                c[i]=c[i]+matrix[i][j];
            }
        }
        System.out.println(Arrays.toString(c));
        return matrix;
    }

    /**
     * Berechnet r_0
     * @param c ist die Endmatrix
     * @param M ist die Ausgangsmatrix
     * @return
     */
    private static Double[] rNull(Double[] c, Double[][] M){
        return Subtraktion(c,Multi(xx,M));
    }

    // Hilfreiche Funktionen

    /**
     * Rechnet eine n Matrix mal einer nxn Matrix,
     * @param x n Matrix
     * @param y nxn Matrix
     * @return
     */
    public static Double[] Multi(Double[] x, Double[][] y){

        Double[] matrix= new Double[n];
        for(int temp=0;temp< n;temp++){
            matrix[temp]=0.0;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j< n;j++){
                matrix[j] = matrix[j] + (x[i]*y[i][j]);
            }
        }
        return matrix;
    }

    /**
     * Addiert zwei n Matrizen
     * @param x
     * @param y
     * @return die Addition dieser
     */
    public static Double[] Addition(Double[] x, Double[] y){
        Double[] matrix = new Double[n];
        for(int i=0; i<n;i++){
                matrix[i]=x[i]+y[i];
            }
        return matrix;
    }

    /**
     * Subtrahiert einer Matrix von einer anderen
     * X-Y
     * @param x
     * @param y
     * @return die Subtraktion dieser
     */
    public static Double[] Subtraktion(Double[] x, Double[] y){
        Double[] z = new Double[n];
        for(int i=0; i<n;i++){
                z[i]=-y[i];
        }
        return Addition(x,z);

    }

    /**
     * Multipliziert eine Transponierte n Matrix mit einer n Matrix
     * @param x
     * @param y
     * @return das Ergebnis als einen Wert
     */
    public static double Multi1(Double[] x, Double[] y){
        double temp= 0;
        for(int i=0;i<n;i++){
            temp= temp+x[i]*y[i];
        }
        return temp;
    }

    /**
     * Multipliziert ein n Matrix mit einem double
     * @param x
     * @param zahl
     * @return
     */
    public static Double[] MultmitZahl(Double[] x, double zahl){

        Double[] y = new Double[n];
        for(int i=0; i<n;i++){
            y[i]=x[i]*zahl;
        }
        return y;
    }

    public static void main(String[] args) {
        c =new Double[n];
        xx = new Double[n];
        for(int i=0;i<n;i++){
            c[i]=0.0;
            xx[i]=0.0;
        }

        Double[][] matrixM = M();
        Double[] r = rNull(c,matrixM);
        Double[] z;
        Double[] p = r;
        Double[] rold = r;
        Double[] xold = xx;
        Double[] pold = p;
        double alpha;
        double beta;
        do{
            z       = Multi(p,matrixM);
            alpha   = Multi1(r,r)/Multi1(z,p);
            xx      = Addition(xold,MultmitZahl(p,alpha));
            r       = Subtraktion(rold,MultmitZahl(z,alpha));

            beta = Multi1(r,r)/Multi1(rold,rold);
            p=Addition(r,MultmitZahl(pold,beta));

            rold=r;
            xold=xx;
            pold = p;

        }while (Multi1(r,r)>=(5*Math.pow(10,-15)));
        System.out.println("r am Ende = " + Arrays.toString(r));
        System.out.println("x = " + Arrays.toString(xx));
        System.out.println("Abweichung von x = " + Arrays.toString(Subtraktion(c, Multi(xx, matrixM))));
        System.out.println(Arrays.toString(Multi(xx, matrixM)));
    }
}
