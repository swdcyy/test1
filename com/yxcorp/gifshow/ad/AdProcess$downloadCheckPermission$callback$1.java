package com.yxcorp.gifshow.ad.AdProcess$downloadCheckPermission$callback$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.ad.AdProcess;
import com.yxcorp.gifshow.ad.AdProcess$b;
import java.lang.Object;
import java.lang.Boolean;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import mxb.j0;
import mxb.i0;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import mxb.j;
import com.yxcorp.gifshow.ad.AdProcess$c;
import nx8.q;
import yx.j0;

public final class AdProcess$downloadCheckPermission$callback$1 extends Lambda implements l	// class@0014e2
{
    public final AdProcess$b $downloadOnMobileNet;
    public final AdProcess this$0;

    public void AdProcess$downloadCheckPermission$callback$1(AdProcess p0,AdProcess$b p1){
       this.this$0 = p0;
       this.$downloadOnMobileNet = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(Boolean p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdProcess$downloadCheckPermission$callback$1.class, "1")) {
          return;
       }
       if (a.g(p0, Boolean.TRUE)) {
          this.this$0.a(this.$downloadOnMobileNet);
       }else {
          i0.a().b(this.this$0.d().getAdLogWrapper(), 39);
          AdProcess$c uoc = this.this$0.f();
          if (uoc != null) {
             uoc.a(new q(10));
          }
          Object[] objArray = new Object[0];
          j0.f("AdProcess", "cannot process adData, permission not granted!", objArray);
       }
       return;
    }
}
