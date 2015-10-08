
package histogram;
import java.util.*;

public class Application {
    public static void main (String [] args ){
        int[] array={1,2,3,4,5,5,5,6,6,7,8};
        
        Histogram histo=new Histogram(array);
        
        HashMap <Integer ,Integer> histogram = histo.getHisto(); 

        System.out.println("Resultado");
        
        for(Integer key : histogram.keySet()){
            System.out.println(key + ":" + histogram.get(key));
        }
    }
}
