package ok.b$s;
import ok.b;
import java.lang.String;
import ok.n;
import java.lang.Object;
import java.lang.Character;
import java.util.Arrays;

public class b$s extends b	// class@002043
{
    public final String p;
    public final char[] q;
    public final char[] r;

    public void b$s(String p0,char[] p1,char[] p2){
       super();
       this.p = p0;
       this.q = p1;
       this.r = p2;
       boolean b = (p1.length == p2.length)? true: false;
       n.b(b);
       b = 0;
       while (b < p1.length) {
          int b1 = (p1[b] <= p2[b])? true: false;
          n.b(b1);
          b1 = b + 1;
          if (b1 < p1.length) {
             b = (p2[b] < p1[b1])? true: false;
             n.b(b);
          }
          b = b1;
       }
       return;
    }
    public boolean apply(Object p0){
       return this.b(p0);
    }
    public boolean f(char p0){
       int i = Arrays.binarySearch(this.q, p0);
       boolean b = true;
       if (i >= 0) {
          return b;
       }
       i = (~ i) - b;
       if (i < 0 || p0 > this.r[i]) {
          b = false;
       }
       return b;
    }
    public String toString(){
       return this.p;
    }
}
