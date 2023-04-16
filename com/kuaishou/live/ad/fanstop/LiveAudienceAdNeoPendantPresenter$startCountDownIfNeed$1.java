package com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoPendantPresenter$startCountDownIfNeed$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoPendantPresenter;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.ad.fanstop.widget.LiveAdNeoPendantBaseView;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.a;
import im8.f;
import usd.q;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoPendantPresenter$startCountDownIfNeed$1$1;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoPendantPresenter$startCountDownIfNeed$1$2;
import msd.l;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class LiveAudienceAdNeoPendantPresenter$startCountDownIfNeed$1 extends Lambda implements a	// class@000982
{
    public final LiveAudienceAdNeoPendantPresenter this$0;

    public void LiveAudienceAdNeoPendantPresenter$startCountDownIfNeed$1(LiveAudienceAdNeoPendantPresenter p0){
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
       if (PatchProxy.applyVoid(objArray, this, LiveAudienceAdNeoPendantPresenter$startCountDownIfNeed$1.class, "1")) {
          return;
       }
       LiveAdNeoPendantBaseView liveAdNeoPen = this.this$0.X8();
       LiveAudienceAdNeoPendantPresenter$startCountDownIfNeed$1 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       LiveAudienceAdNeoPendantPresenter obj = PatchProxy.apply(objArray, tthis$0, LiveAudienceAdNeoPendantPresenter.class, "14");
       if (obj != PatchProxyResult.class) {
          l = obj.longValue();
       }else {
          obj = tthis$0.s;
          if (obj != null) {
             a.m(obj);
             l = q.o(0, (tthis$0.y - (obj.get().longValue() / (long)1000)));
          }else {
             l = tthis$0.y;
          }
       }
       this.this$0.X7(liveAdNeoPen.a(l, new LiveAudienceAdNeoPendantPresenter$startCountDownIfNeed$1$1(this.this$0), new LiveAudienceAdNeoPendantPresenter$startCountDownIfNeed$1$2(this.this$0)));
       return;
    }
}
