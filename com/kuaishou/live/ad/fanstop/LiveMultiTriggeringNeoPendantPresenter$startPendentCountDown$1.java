package com.kuaishou.live.ad.fanstop.LiveMultiTriggeringNeoPendantPresenter$startPendentCountDown$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.ad.fanstop.LiveMultiTriggeringNeoPendantPresenter;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.ad.fanstop.widget.LiveAdNeoEnhancePendantView;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.a;
import im8.f;
import usd.q;
import com.kuaishou.live.ad.fanstop.LiveMultiTriggeringNeoPendantPresenter$startPendentCountDown$1$1;
import com.kuaishou.live.ad.fanstop.LiveMultiTriggeringNeoPendantPresenter$startPendentCountDown$1$2;
import msd.l;
import crd.b;
import com.kuaishou.live.ad.fanstop.widget.LiveAdNeoPendantBaseView;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class LiveMultiTriggeringNeoPendantPresenter$startPendentCountDown$1 extends Lambda implements a	// class@000994
{
    public final LiveMultiTriggeringNeoPendantPresenter this$0;

    public void LiveMultiTriggeringNeoPendantPresenter$startPendentCountDown$1(LiveMultiTriggeringNeoPendantPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       long l;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveMultiTriggeringNeoPendantPresenter$startPendentCountDown$1.class, "1")) {
          return;
       }
       LiveMultiTriggeringNeoPendantPresenter$startPendentCountDown$1 tthis$0 = this.this$0;
       tthis$0.z = false;
       LiveAdNeoEnhancePendantView liveAdNeoEnh = tthis$0.W8();
       LiveMultiTriggeringNeoPendantPresenter$startPendentCountDown$1 tthis$01 = this.this$0;
       Objects.requireNonNull(tthis$01);
       LiveMultiTriggeringNeoPendantPresenter obj = PatchProxy.apply(objArray, tthis$01, LiveMultiTriggeringNeoPendantPresenter.class, "13");
       if (obj != PatchProxyResult.class) {
          l = obj.longValue();
       }else {
          obj = tthis$01.r;
          if (obj != null) {
             a.m(obj);
             l = q.o(0, (tthis$01.x - (obj.get().longValue() / (long)1000)));
          }else {
             l = tthis$01.x;
          }
       }
       this.this$0.X7(liveAdNeoEnh.a(l, new LiveMultiTriggeringNeoPendantPresenter$startPendentCountDown$1$1(this.this$0), new LiveMultiTriggeringNeoPendantPresenter$startPendentCountDown$1$2(this.this$0)));
       return;
    }
}
