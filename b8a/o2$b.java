package b8a.o2$b;
import jta.c;
import b8a.o2;
import java.lang.Object;
import jta.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import android.widget.TextView;

public final class o2$b implements c	// class@0003d2
{
    public final o2 a;

    public void o2$b(o2 p0){
       this.a = p0;
       super();
    }
    public void a(float p0){
    }
    public void b(float p0){
       b.a(this, p0);
    }
    public void c(float p0){
       o2$b uob = o2$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uob, "2")) {
          return;
       }
       if (this.a.W8()) {
          float f = (float)1 - p0;
          this.a.V8(f);
          uob = this.a;
          if (uob.z != null) {
             o2 w = uob.w;
             if (w != null) {
                w.setAlpha(f);
             }
          }
          if (!o2.P8(this.a).getVisibility()) {
             o2.P8(this.a).setAlpha(p0);
          }
       }
       return;
    }
    public void d(float p0){
       o2$b uob = o2$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uob, "1")) {
          return;
       }
       o2$b ta = this.a;
       if (ta.z != null) {
          ta.S8();
       }
       return;
    }
}
