package h82.p0;
import h82.m;
import h82.o0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import h82.b0;

public class p0 implements m	// class@002ce4
{
    public final o0 a;

    public void p0(o0 p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, p0.class, "1")) {
          return;
       }
       o0 l = this.a.l;
       if (l != null) {
          b0 m = l.m;
          if (m != null) {
             m.a();
          }
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, p0.class, "2")) {
          return;
       }
       o0 l = this.a.l;
       if (l != null) {
          b0 m = l.m;
          if (m != null) {
             m.b();
          }
       }
       return;
    }
}
