import java.util.HashMap;

public class BitParser {
    private static HashMap<Integer,Integer> mapblue = new HashMap<>();  // x , y
    private static HashMap<Integer,Integer> mapred = new HashMap<>();  // x , y
    public static boolean checkFormatting(String bitlist){
        if(bitlist == null || bitlist.length() != 16 || bitlist.isBlank())
            return false;
        for(int i = 0; i < bitlist.length(); i++){
            char c = bitlist.charAt(i);
            if(c != '0' && c != '1')
                return false;
        }

        return true;
    }

    public static float parseIEEE754(String bitlist){
        if(!checkFormatting(bitlist))
            return -1;

        //erstes Bit ablesen
        int v = bitlist.charAt(0) == '1' ? 1 : 0;
        //Vorzeichen festlegen
        int vorzeichen = (v == 0) ? 1 : -1;
        //Halb precision
        int r = 5, p = 10;

        //Biaswert
        int B = (int) Math.pow(2, r - 1) - 1;
        //Biased Exponent
        int E = Integer.parseInt(bitlist.substring(1, r + 1), 2);
        //Mantissa
        int M = Integer.parseInt(bitlist.substring(r + 1, r + 1 + p), 2);
 
        float num = -1;
        //Fallunterscheidung
        //3 Fälle
        if(E > 0 && E < Math.pow(2, r) - 1)
            num = vorzeichen * (1 + (M / (float) Math.pow(2, p))) * (float) Math.pow(2, E - B);
        else if(E == 0)
            num = vorzeichen * M / (float) Math.pow(2, p) * (float) Math.pow(2, 1 - B);
        else if(E == (Math.pow(2, r) - 1) && M == 0){
            if(vorzeichen == 1)
                num = Float.POSITIVE_INFINITY;
            else
                num = Float.NEGATIVE_INFINITY;
        }
        else if(M > 0)
            num = Float.NaN;

        return num;
    }

    public static int do2Complement(String bitlist){
        if(!checkFormatting(bitlist)){
            return -1;
        }

        String reversedBits = "";
        //Bits invertieren
        for(int i = 0; i < bitlist.length(); i++){
            char c = bitlist.charAt(i);
            reversedBits += String.valueOf(c == '1' ? 0 : 1);
        }

        int num = Integer.parseInt(reversedBits, 2);

        //1 addieren und zurückgeben
        return ++num;
    }

    public static float parsePosit(String bitlist){     
        if(!checkFormatting(bitlist)){
            return -1;
        }

        //Vorzeichen
        int v = bitlist.charAt(0) == '0' ? 0 : 1;

        boolean regimeForm;
        char charToCompare;
        //11110 Format
        if(bitlist.charAt(1) == '1'){
            charToCompare = '0';
            //k+1 Regime
            regimeForm = true;
        }
        //00001 Format
        else{
            charToCompare = '1';
            //-k regime
            regimeForm = false;
        }

        //Regime berechnen
        int j = 0;
        char c = '\0';
        do {
            j++;
            c = bitlist.charAt(j);
        } while (j < bitlist.length() && c != charToCompare);
        
        int i = bitlist.substring(j + 1).length() + 1;
        int k = regimeForm ? bitlist.length() - 2 - i : i + 1 - bitlist.length();

        int E = 0;
        float F = 0;
        if(i <= 1) 
            E = 0;   
        else if(i == 2) 
            E = bitlist.charAt(bitlist.length() - 1) == '1' ? 1 : 0;
        else{
            E = Integer.parseInt(bitlist.substring(j + 1, j + 3), 2);

            if(i <= 3)
                F = 0;

            else  
                F = (Integer.parseInt(bitlist.substring(j + 3, bitlist.length()), 2))
                    / (float) Math.pow(2, i - 3);
        }

        return (1 + (-3 * v) + F) * (float) Math.pow(2, (1 + (- 2 * v)) * (4 * k + E + v));
    } 

    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        System.out.println(parsePosit("0111110001010101"));
        System.out.println(do2Complement("0111110001010101"));
        System.out.println(parseIEEE754("0111110001010101"));
        String s = "0111111000111111";
        for(int i = 0; i < 100; i+= 1){
            int num = Integer.parseInt(s, 2);
            num += 100;
            s = Integer.toBinaryString(num);
            System.out.println("blue " + (int) Math.log(Math.abs(parsePosit(s))));
            System.out.println("red " + (int) Math.log(Math.abs(parseIEEE754(s))));
            System.out.println("x " + do2Complement(s) / 500);
            mapblue.put(do2Complement(s) / 15 - 1450,(int) Math.log(Math.abs(parsePosit(s))) *10 + (frame.getHeight() / 2) - 5);
            mapred.put(do2Complement(s) / 15 - 1450, (int) Math.log(Math.abs(parseIEEE754(s)))*10  + (frame.getHeight() / 2) + 5);
        }
        frame.insertblue(mapblue);
        frame.insertred(mapred);
        System.out.println(frame.toString());
        frame.re();
    }
}
