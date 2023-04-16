package com.kuaishou.live.common.core.component.multipk.game.vc.LiveMultiPkGameController$a;
import z0.a;
import com.kuaishou.live.common.core.component.multipk.game.vc.LiveMultiPkGameController;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ut1.f;
import zs1.b;
import bt1.d;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import ut1.j;
import pu1.m;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;

public final class LiveMultiPkGameController$a implements a	// class@0015e1
{
    public final LiveMultiPkGameController a;

    public void LiveMultiPkGameController$a(LiveMultiPkGameController p0){
       this.a = p0;
       super();
    }
    public final Object apply(Object p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveMultiPkGameController$a.class, str);
       if (obj != patchProxyRe) {
          return obj;
       }
       p0 = this.a.Y2();
       obj = PatchProxy.applyOneRefs(p0, null, d.class, str);
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "liveMultiPkCoreModel");
          if (p0.w().d == null) {
             if (!m.m(p0) && !m.a.k(p0)) {
                Object obj1 = PatchProxy.applyOneRefs(p0, null, m.class, "5");
                if (obj1 != patchProxyRe) {
                   b = obj1.booleanValue();
                }else {
                   a.p(p0, "liveMultiPkCoreModel");
                   p0 = p0.l().getValue();
                   b = (p0 != null && p0.h() == 2)? true: false;
                }
                if (!b) {
                label_0071 :
                   b = false;
                }
             }
          label_0073 :
             b = true;
          }
       }
       return Boolean.valueOf(b);
    }
}
