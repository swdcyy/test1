package n21.h$c;
import n21.h;
import n21.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import lnc.b9;
import com.kwai.robust.PatchProxyResult;
import n21.s;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import brd.t;
import n21.i;
import erd.g;

public class h$c	// class@00328d
{
    public final e a;
    public b b;
    public final h c;

    public void h$c(h p0,e p1){
       this.c = p0;
       super();
       this.a = p1;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, h$c.class, "2")) {
          return;
       }
       b9.a(this.b);
       return;
    }
    public String b(){
       Object obj = PatchProxy.apply(null, this, h$c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.e();
    }
    public void c(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$c.class, "1")) {
          return;
       }
       long l = p0.d() - this.c.b.a();
       this.a();
       if (l - null > 0) {
          this.b = t.timer(l, TimeUnit.MILLISECONDS, d.a).subscribe(new i(this, p0));
       }
       return;
    }
}
