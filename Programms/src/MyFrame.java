import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.util.HashMap;

public class MyFrame extends JFrame {

    private static HashMap<Integer,Integer> mapblue = new HashMap<>();  // x , y
    private static HashMap<Integer,Integer> mapred = new HashMap<>();  // x , y
    private Color color;
    public MyFrame() {
        super("myFrame");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1280,720);
        setVisible(true);
    }

    public void insertblue(HashMap<Integer,Integer> mapp){
        mapblue = mapp;
    }
    public void insertred(HashMap<Integer,Integer> mapp){
        mapred = mapp;
    }
    public void re(){
        repaint();
    }

    @Override
    public String toString() {
        return "MyFrame{" +
                "mapblue=" + mapblue + "\n" +
                ", mapred=" + mapred +
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
       g.setColor(Color.BLUE);
        for(Integer key : mapblue.keySet()){
            g.fillOval(key,mapblue.get(key),5,5);
        }
        g.setColor(Color.RED);
        for(Integer key : mapred.keySet()){
            g.fillOval(key,mapred.get(key),5,5);
        }
    }
}
