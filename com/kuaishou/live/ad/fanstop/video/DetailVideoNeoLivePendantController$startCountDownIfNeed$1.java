package com.kuaishou.live.ad.fanstop.video.DetailVideoNeoLivePendantController$startCountDownIfNeed$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.ad.fanstop.video.DetailVideoNeoLivePendantController;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import dm9.a;
import kotlin.jvm.internal.a;
import usd.q;
import com.kuaishou.live.ad.fanstop.widget.LiveAdNeoPendantBaseView;
import com.kuaishou.live.ad.fanstop.video.DetailVideoNeoLivePendantController$startCountDownIfNeed$1$1;
import com.kuaishou.live.ad.fanstop.video.DetailVideoNeoLivePendantController$startCountDownIfNeed$1$2;
import msd.l;
import crd.b;
import com.kuaishou.android.model.ads.LiveAdNeoParam;

public final class DetailVideoNeoLivePendantController$startCountDownIfNeed$1 extends Lambda implements a	// class@0009c1
{
    public final DetailVideoNeoLivePendantController this$0;

    public void DetailVideoNeoLivePendantController$startCountDownIfNeed$1(DetailVideoNeoLivePendantController p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       long l;
       DetailVideoNeoLivePendantController uDetailVideo = DetailVideoNeoLivePendantController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, DetailVideoNeoLivePendantController$startCountDownIfNeed$1.class, "1")) {
          return;
       }
       DetailVideoNeoLivePendantController$startCountDownIfNeed$1 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a obj = PatchProxy.apply(objArray, tthis$0, uDetailVideo, "17");
       DetailVideoNeoLivePendantController$startCountDownIfNeed$1 ostartCountD = null;
       if (obj != patchProxyRe) {
          l = obj.longValue();
       }else {
          obj = a.d;
          DetailVideoNeoLivePendantController q = tthis$0.q;
          Objects.requireNonNull(obj);
          Object obj1 = PatchProxy.applyOneRefs(q, obj, a.class, "3");
          if (obj1 != patchProxyRe) {
             l = obj1.longValue();
          }else {
             a.p(q, "videoLivePendantId");
             DetailVideoNeoLivePendantController$startCountDownIfNeed$1 ostartCountD1 = (a.g(q, "") || (a.g(a.b, q) ^ 0x01))? ostartCountD: a.a;
          }
          l = q.o(ostartCountD, (tthis$0.a - (l / (long)1000)));
       }
       if (l - ostartCountD > 0) {
          this.this$0.a(this.this$0.d().a(l, new DetailVideoNeoLivePendantController$startCountDownIfNeed$1$1(this.this$0), new DetailVideoNeoLivePendantController$startCountDownIfNeed$1$2(this.this$0)));
       }else {
          tthis$0 = this.this$0;
          Objects.requireNonNull(tthis$0);
          if (!PatchProxy.applyVoid(objArray, tthis$0, uDetailVideo, "22")) {
             if (tthis$0.n(tthis$0.g)) {
                tthis$0.l();
             }else {
                tthis$0.e();
             }
          }
       }
       return;
    }
}
