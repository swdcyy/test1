package okhttp3.CipherSuite$1;
import java.util.Comparator;
import java.lang.Object;
import java.lang.String;
import java.lang.Math;

public class CipherSuite$1 implements Comparator	// class@002066
{

    public void CipherSuite$1(){
       super();
    }
    public int compare(Object p0,Object p1){
       return this.compare(p0, p1);
    }
    public int compare(String p0,String p1){
       int i2;
       int i = Math.min(p0.length(), p1.length());
       int i1 = 4;
       while (true) {
          i2 = -1;
          if (i1 < i) {
             char c = p0.charAt(i1);
             char c1 = p1.charAt(i1);
             if (c != c1) {
                if (c >= c1) {
                   i2 = 1;
                   break ;
                }
                break ;
             }else {
                i1 = i1 + 1;
             }
          }else {
             int i3 = p0.length();
             int i4 = p1.length();
             if (i3 == i4) {
                return 0;
             }
             if (i3 >= i4) {
                i2 = 1;
             }
             return i2;
          }
       }
       return i2;
    }
}
