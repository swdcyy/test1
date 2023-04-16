package com.kuaishou.live.ad.fanstop.LiveAudienceVideoAdNeoPendantPresenter$initPendantFistAddAction$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import pl0.u0;
import java.lang.Object;
import android.animation.AnimatorSet;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import ks5.m;
import pl0.v0;
import com.kuaishou.live.ad.fanstop.video.DetailVideoNeoLivePendantController;
import com.kwai.feature.api.live.merchant.top.LiveTopPendantTempPlayService;
import ks5.i;
import lp3.c;
import lp3.i;
import android.animation.Animator;

public final class LiveAudienceVideoAdNeoPendantPresenter$initPendantFistAddAction$1 extends Lambda implements l	// class@000984
{
    public final u0 this$0;

    public void LiveAudienceVideoAdNeoPendantPresenter$initPendantFistAddAction$1(u0 p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(AnimatorSet p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceVideoAdNeoPendantPresenter$initPendantFistAddAction$1.class, "1")) {
          return;
       }
       a.p(p0, "anim");
       LiveAudienceVideoAdNeoPendantPresenter$initPendantFistAddAction$1 tthis$0 = this.this$0;
       u0 v = tthis$0.v;
       if (v != null) {
          Objects.requireNonNull(tthis$0);
          u0 ou0 = PatchProxy.applyOneRefs(v, tthis$0, u0.class, "5");
          if (ou0 != PatchProxyResult.class) {
          }else if(tthis$0.u == null){
             tthis$0.u = new v0(v);
          }
          ou0 = tthis$0.u;
          a.m(ou0);
          u0 s = this.this$0.s;
          if (s != null) {
             s.b(ou0);
          }
          s = this.this$0.t;
          if (s != null) {
             i oi = s.a(i.class);
             if (oi != null) {
                oi.rb(ou0, p0);
             }
          }
       }
    label_0054 :
       return;
    }
}
