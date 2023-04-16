package com.kuaishou.live.common.core.component.multipk.render.viewcontroller.participant.cell.LiveMultiPkRenderCellViewModel$e;
import z0.a;
import zs1.b;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ut1.f;
import pu1.m;
import ut1.c;
import cu1.d;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import ut1.o;

public final class LiveMultiPkRenderCellViewModel$e implements a	// class@00168b
{
    public final b a;

    public void LiveMultiPkRenderCellViewModel$e(b p0){
       this.a = p0;
       super();
    }
    public final Object apply(Object p0){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c obj = PatchProxy.applyOneRefs(p0, this, LiveMultiPkRenderCellViewModel$e.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       boolean b = true;
       if (m.m(this.a)) {
          obj = p0.d();
          obj = (obj != null)? obj.a: null;
          if (obj != null) {
             String str = p0.a();
             String str1 = d.c(p0);
             p0 = p0.d();
             Object obj1 = PatchProxy.applyThreeRefs(str, str1, p0, null, d.class, "18");
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else {
                a.p(str, "anchorUserId");
                a.p(str1, "opponentUserId");
                o oo = d.b(str, p0);
                p0 = d.b(str1, p0);
                b1 = (oo != null && (p0 == null || (!oo.a() && !p0.a())))? true: false;
             }
             if (!b1) {
             label_0070 :
                return Boolean.valueOf(b);
             }
          }
       }
    label_006f :
       b = false;
       goto label_0070 ;
    }
}
