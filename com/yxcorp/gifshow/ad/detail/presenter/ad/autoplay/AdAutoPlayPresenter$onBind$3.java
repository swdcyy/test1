package com.yxcorp.gifshow.ad.detail.presenter.ad.autoplay.AdAutoPlayPresenter$onBind$3;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.ad.detail.presenter.ad.autoplay.AdAutoPlayPresenter;
import java.lang.Object;
import fy8.b;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.ad.detail.presenter.ad.autoplay.AdAutoPlayPresenter$STOP_REASON;
import java.util.BitSet;

public final class AdAutoPlayPresenter$onBind$3 extends Lambda implements l	// class@001594
{
    public final AdAutoPlayPresenter this$0;

    public void AdAutoPlayPresenter$onBind$3(AdAutoPlayPresenter p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdAutoPlayPresenter$onBind$3.class, "1")) {
          return;
       }
       a.p(p0, "it");
       p0 = p0.a;
       if (p0 != null && (p0 != 1 && p0 != 2)) {
          if (p0 == 3) {
             this.this$0.w.clear(AdAutoPlayPresenter$STOP_REASON.STOP_BY_FEEDBACK_MASK.getType());
             this.this$0.R8();
          }
       }else {
          this.this$0.w.set(AdAutoPlayPresenter$STOP_REASON.STOP_BY_FEEDBACK_MASK.getType());
          this.this$0.V8();
       }
       return;
    }
}
