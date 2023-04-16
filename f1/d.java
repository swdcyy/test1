package f1.d;
import f1.c;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.lang.String;

public class d implements c	// class@001fae
{
    public final Object[] a;
    public int b;

    public void d(int p0){
       super();
       if (p0 <= 0) {
          throw new IllegalArgumentException("The max pool size must be > 0");
       }
       Object[] objArray = new Object[p0];
       this.a = objArray;
       return;
    }
    public boolean a(Object p0){
       d tb = this.b;
       d ta = this.a;
       if (tb >= ta.length) {
          return false;
       }
       ta[tb] = p0;
       this.b = tb + 1;
       return 1;
    }
    public Object q(){
       d tb = this.b;
       if (tb <= null) {
          return null;
       }
       int i = tb - 1;
       d ta = this.a;
       object oobject = ta[i];
       ta[i] = null;
       this.b = tb - 1;
       return oobject;
    }
    public void r(Object[] p0,int p1){
       if (p1 > p0.length) {
          p1 = p0.length;
       }
       int i = 0;
       while (i < p1) {
          object oobject = p0[i];
          d tb = this.b;
          d ta = this.a;
          if (tb < ta.length) {
             ta[tb] = oobject;
             int i1 = tb + 1;
             this.b = i1;
          }
          i = i + 1;
       }
       return;
    }
}
