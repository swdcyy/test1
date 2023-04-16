package lz9.b0$c;
import jta.a;
import lz9.b0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import qp7.x0;
import qp7.b;
import ks7.h0;

public class b0$c extends a	// class@002ecd
{
    public final b0 a;

    public void b0$c(b0 p0){
       this.a = p0;
       super();
    }
    public void a(float p0){
       b0$c uoc = b0$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoc, "2")) {
          return;
       }
       if (!p0 - 0x3f800000) {
          this.a.o0();
       }
       return;
    }
    public void c(float p0){
       b0$c uoc = b0$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoc, "1")) {
          return;
       }
       this.a.E().i(true);
       this.a.E().g(false);
       return;
    }
}
