package fia.n0$c;
import jta.a;
import fia.n0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;

public final class n0$c extends a	// class@002928
{
    public final n0 a;

    public void n0$c(n0 p0){
       this.a = p0;
       super();
    }
    public void a(float p0){
       n0$c uoc = n0$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoc, "1")) {
          return;
       }
       if (!p0 - 0x3f800000) {
          this.a.o9();
       }
       return;
    }
}
