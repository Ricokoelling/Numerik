import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class MyFrameTwo extends JFrame {
    private static HashMap<Integer,Integer> map = new HashMap<>();  // x , y
    final static public double A=1.61801916;
    final static public double B=1.61801917;
    private Color color;
    int i = 0;
    public MyFrameTwo() {
        super("MyFrameTwo");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1280,720);
        setVisible(true);
    }

    public double check(double x){

        return ((223200658*Math.pow(x,3))-(1083557822*Math.pow(x,2))+(1753426039*x) -945804881);
    }
    public void insert(){
        for(double i=A; i <= B; i=i+(0.0000000000001)){
            map.put((int) Math.round(i * 100), (int) Math.round((check(i) * 100000000) + 360));
            update(this.getGraphics());
        }
        System.out.println(map.size());
    }
    public void re(){
        repaint();
    }

    @Override
    public String toString() {
        return "MyFrame{" +
                "map=" + map + "\n" +
                ", color=" + color +
                '}';
    }

    public static void main(String[] args) {
        new MyFrame();
    }
    @Override
    public void paint(Graphics graphics){
        Graphics2D g = (Graphics2D) graphics;
        g.drawLine(100,getHeight() / 2,getWidth()-200,getHeight() / 2);
        g.drawLine(100,100,100,getHeight()-100);
        for(int i = 0; i <= 17;i++){
            g.drawLine(100+50*i,getHeight() / 2,100+50*i,(getHeight() / 2)+10);
            if(i < 11) {
                g.drawLine(90, 110 + 50 * i, 100, 110 + 50 * i);
            }
        }
        //System.out.println(map.size());
        /*for(Integer key : map.keySet()){
            System.out.println("key: " + key+ " value: " + map.get(key));
        }*/
        g.setColor(Color.BLACK);
        for(Integer key : map.keySet()){
            g.fillOval(key,map.get(key),5,5);
        }
    }
}
