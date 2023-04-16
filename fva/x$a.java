package fva.x$a;
import erd.g;
import fva.x;
import java.lang.Object;
import zf6.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.model.hotspot.HotSpotModel;
import jva.m;

public final class x$a implements g	// class@002a38
{
    public final x b;

    public void x$a(x p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x$a.class, "1")) {
       }else {
          x$a tb = this.b;
          x q = tb.q;
          if (q == null) {
             a.S("binding");
          }
          tb.R8(q, x.P8(this.b), p0.a);
       }
       return;
    }
}
