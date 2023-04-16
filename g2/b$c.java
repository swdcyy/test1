package g2.b$c;
import java.util.Comparator;
import g2.b$a;
import java.lang.Object;
import android.graphics.Rect;

public class b$c implements Comparator	// class@002038
{
    public final Rect b;
    public final Rect c;
    public final boolean d;
    public final b$a e;

    public void b$c(boolean p0,b$a p1){
       super();
       this.b = new Rect();
       this.c = new Rect();
       this.d = p0;
       this.e = p1;
    }
    public int compare(Object p0,Object p1){
       b$c tb = this.b;
       b$c tc = this.c;
       this.e.a(p0, tb);
       this.e.a(p1, tc);
       p0 = tb.top;
       p1 = tc.top;
       int i = -1;
       if (p0 < p1) {
          return i;
       }
       if (p0 > p1) {
          return 1;
       }
       p0 = tb.left;
       p1 = tc.left;
       if (p0 < p1) {
          if (this.d != null) {
             i = 1;
          }
          return i;
       }else if(p0 > p1){
          if (this.d == null) {
             i = 1;
          }
          return i;
       }else {
          p0 = tb.bottom;
          p1 = tc.bottom;
          if (p0 < p1) {
             return i;
          }
          if (p0 > p1) {
             return 1;
          }
          p0 = tb.right;
          p1 = tc.right;
          if (p0 < p1) {
             if (this.d != null) {
                i = 1;
             }
             return i;
          }else if(p0 > p1){
             if (this.d == null) {
                i = 1;
             }
             return i;
          }else {
             return 0;
          }
       }
    }
}
