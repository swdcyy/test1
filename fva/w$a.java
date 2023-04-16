package fva.w$a;
import erd.g;
import fva.w;
import java.lang.Object;
import zf6.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import jva.l;
import com.yxcorp.gifshow.model.hotspot.HotSpotModel;

public final class w$a implements g	// class@002a35
{
    public final w b;

    public void w$a(w p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w$a.class, "1")) {
       }else {
          w$a tb = this.b;
          w q = tb.q;
          if (q == null) {
             a.S("binding");
          }
          w p = this.b.p;
          if (p == null) {
             a.S("data");
          }
          tb.P8(q, p, p0.a);
       }
       return;
    }
}
