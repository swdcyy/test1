package d61.x;
import java.lang.Runnable;
import java.lang.ref.WeakReference;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import d61.y;
import ekd.k1;

public class x implements Runnable	// class@001f44
{
    public int b;
    public final int c;
    public final WeakReference d;
    public final Runnable e;
    public final Object f;
    public final long g;

    public void x(int p0,WeakReference p1,Runnable p2,Object p3,long p4){
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       this.g = p4;
       super();
       this.b = p0;
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, x.class, "1")) {
          return;
       }
       if (this.d.get() != null && !y.b(this.d.get())) {
          if (y.d(this.d.get())) {
             int i = this.b - 1;
             this.b = i;
             if (i >= 0) {
                k1.s(this, this.f, this.g);
             }
          }
          this.e.run();
       }
       return;
    }
}
