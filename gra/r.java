package gra.r;
import erd.o;
import gra.v;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import fra.g;
import brd.t;
import gra.b;
import com.kwai.library.widget.popup.common.c;
import gra.h;
import com.yxcorp.gifshow.growth.vfc.GrowthVfcUtilKt;

public final class r implements o	// class@002bc2
{
    public final v b;

    public void r(v p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, r.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "success");
          if (p0.booleanValue()) {
             p0 = this.b;
             p0 = p0.a9(p0.k9().c(), this.b.k9().d());
          }else {
             p0 = this.b.X8();
             if (p0 != null) {
                GrowthVfcUtilKt.a(p0);
             }
             p0 = t.just(Boolean.TRUE);
          }
          ot = p0;
       }
       return ot;
    }
}
