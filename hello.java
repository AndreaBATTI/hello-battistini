import java.io.*;
import java.util.Vector;
public class hello{

    public static void main(String[] args) {
        System.out.println("Hello Andrea!");
        System.out.println("Hello Andrea!");
        System.out.println("Hello Andrea!");
        System.out.println("Sono nato il 22 Agosto 2007");
        System.out.println("Non tifo alcuna squadra");
        Vector<Character> v = new Vector<Character>();
        v.add('a');
        v.add('n');
        v.add('d');
        v.add('r');
        v.add('e');
        v.add('a');
        for(int i = 0; i < v.size(); i++){
            System.out.println(v.elementAt(i));
        }
        System.out.println("");
    }
}

