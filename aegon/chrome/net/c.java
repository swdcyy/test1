package aegon.chrome.net.c;
import java.util.Comparator;
import java.lang.Object;
import aegon.chrome.net.e;
import java.lang.String;
import java.lang.Integer;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.Throwable;

public class c implements Comparator	// class@0001ad
{

    public void c(){
       super();
    }
    public int compare(Object p0,Object p1){
       int i;
       String str = "Fallback-Cronet-Provider";
       if (str.equals(p0.c())) {
          i = 1;
       }else if(str.equals(p1.c())){
          i = -1;
       }else {
          p0 = p0.d();
          p1 = p1.d();
          if (p0 != null && p1 != null) {
             p0 = p0.split("\\.");
             p1 = p1.split("\\.");
             int i1 = 0;
             while (true) {
                if (i1 < p0.length && i1 < p1.length) {
                   try{
                      int i2 = Integer.parseInt(p0[i1]);
                      int i3 = Integer.parseInt(p1[i1]);
                      if (i2 != i3) {
                         i = Integer.signum((i2 - i3));
                      label_007d :
                         i = - i;
                         break ;
                      }else {
                         i1 = i1 + 1;
                      }
                   }catch(java.lang.NumberFormatException e1){
                      throw new IllegalArgumentException("Unable to convert version segments into integers: "+p0[i1]+" & "+p1[i1], e1);
                   }
                }else {
                   i = Integer.signum((p0.length - p1.length));
                   goto label_007d ;
                }
             }
          }else {
             throw new IllegalArgumentException("The input values cannot be null");
          }
       }
       return i;
    }
}
