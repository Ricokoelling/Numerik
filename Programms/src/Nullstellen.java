import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Nullstellen {

    final static public double A=1.61801916;
    final static public double B=1.61801917;

    public static HashMap<Double,Double> test = new HashMap<>();
    private static ArrayList<Double> zahlen = new ArrayList<>();
    private static double fvonX(double x){
        return ((223200658*Math.pow(x,3))-(1083557822*Math.pow(x,2))+(1753426039*x) -945804881);
    }

    public static void main(String[] args) {
        MyFrameTwo frame = new MyFrameTwo();
        frame.insert();
    }
}
