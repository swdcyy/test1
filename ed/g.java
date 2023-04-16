package ed.g;
import java.lang.Object;
import android.util.SparseArray;
import ed.g$b;

public class g	// class@001f2a
{
    public final SparseArray a;
    public g$b b;
    public g$b c;

    public void g(){
       super();
       this.a = new SparseArray();
    }
    public final void a(g$b p0){
       if (this.b == p0) {
          return;
       }
       this.b(p0);
       g tb = this.b;
       if (tb == null) {
          this.b = p0;
          this.c = p0;
          return;
       }else {
          p0.d = tb;
          tb.a = p0;
          this.b = p0;
          return;
       }
    }
    public synchronized final void b(g$b p0){
       g$b a = p0.a;
       g$b d = p0.d;
       if (a != null) {
          a.d = d;
       }
       if (d != null) {
          d.a = a;
       }
       p0.a = null;
       p0.d = null;
       if (p0 == this.b) {
          this.b = d;
       }
       if (p0 == this.c) {
          this.c = a;
       }
       return;
    }
}
