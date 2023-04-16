package e0b.j$f;
import java.lang.Runnable;
import e0b.j;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.widget.LinearLayout;

public final class j$f implements Runnable	// class@0025d1
{
    public final j b;
    public final List c;

    public void j$f(j p0,List p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       j f;
       if (PatchProxy.applyVoid(null, this, j$f.class, "1")) {
          return;
       }
       this.b.k0();
       j$f tb = this.b;
       j g = tb.G;
       if (g != null) {
          f = tb.F;
          if (f != null) {
             f.removeView(g);
          }
       }
       tb = this.b;
       g = tb.F;
       if (g != null) {
          g.removeView(tb.O);
       }
       if (this.c.isEmpty()) {
          this.b.i0();
       }else {
          tb = this.b;
          g = tb.I;
          if (g != null) {
             f = tb.F;
             if (f != null) {
                f.removeView(g);
             }
          }
          this.b.g0(this.c);
       }
       return;
    }
}
