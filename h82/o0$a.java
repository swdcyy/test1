package h82.o0$a;
import h82.r0;
import h82.o0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import u61.c$a;
import h82.b0;

public class o0$a implements r0	// class@002ce1
{
    public final o0 a;

    public void o0$a(o0 p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, o0$a.class, "1")) {
          return;
       }
       o0 n = this.a.n;
       if (n != null) {
          n.a();
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, o0$a.class, "2")) {
          return;
       }
       o0 l = this.a.l;
       if (l != null) {
          b0 b = l.b;
          if (b != null) {
             b.b();
          }
       }
       return;
    }
}
