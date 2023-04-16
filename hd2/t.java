package hd2.t;
import erd.g;
import hd2.r;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import pp.c;
import com.kuaishou.android.live.log.b;
import kotlin.jvm.internal.a;

public final class t implements g	// class@002d78
{
    public final r b;

    public void t(r p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "1")) {
       }else {
          b.c0(this.b.a, "handle sei", "isMultiPkData", p0);
          a.o(p0, "it");
          if (p0.booleanValue()) {
             p0 = this.b;
             p0.f = true;
             p0.d();
          }
       }
       return;
    }
}
