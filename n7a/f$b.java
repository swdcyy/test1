package n7a.f$b;
import jta.a;
import n7a.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import n7a.a;
import o7a.d;

public class f$b extends a	// class@0030f7
{
    public final f a;

    public void f$b(f p0){
       this.a = p0;
       super();
    }
    public void a(float p0){
       boolean b;
       f$b uob = f$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uob, "2")) {
          return;
       }
       f$b ta = this.a;
       if (ta.r != null) {
          a u = ta.u;
          if (u != null) {
             if (!ta.X8()) {
                ta = this.a;
                if (ta.S8(ta.D)) {
                   b = true;
                label_0032 :
                   u.setEnabled(b);
                }
             }
             b = false;
             goto label_0032 ;
          }
       }
       return;
    }
    public void d(float p0){
       f$b uob = f$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uob, "1")) {
          return;
       }
       f$b ta = this.a;
       if (ta.r != null && !ta.X8()) {
          a u = this.a.u;
          if (u != null) {
             u.setEnabled(false);
             this.a.R8();
          }
       }
       return;
    }
}
