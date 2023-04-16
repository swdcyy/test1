package com.yxcorp.gifshow.ad.detail.presenter.ad.playend.BaseAdPlayEndPresenter$hidePlayEnd$$inlined$let$lambda$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.ad.detail.presenter.ad.playend.view.AdPlayEndBaseView;
import a09.a;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.FrameLayout;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import im8.f;
import io.reactivex.subjects.PublishSubject;

public final class BaseAdPlayEndPresenter$hidePlayEnd$$inlined$let$lambda$2 extends Lambda implements a	// class@0015e2
{
    public final AdPlayEndBaseView $it;
    public final a this$0;

    public void BaseAdPlayEndPresenter$hidePlayEnd$$inlined$let$lambda$2(AdPlayEndBaseView p0,a p1){
       this.$it = p0;
       this.this$0 = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoidWithListener(null, this, BaseAdPlayEndPresenter$hidePlayEnd$$inlined$let$lambda$2.class, "1")) {
          return;
       }
       this.$it.setVisibility(8);
       a t = this.this$0.t;
       if (t == null) {
          a.S("mIsPlayEndScreenVisible");
       }
       Boolean fALSE = Boolean.FALSE;
       t.set(fALSE);
       t = this.this$0.x;
       if (t == null) {
          a.S("mAdPlayEndViewState");
       }
       t.onNext(fALSE);
       PatchProxy.onMethodExit(BaseAdPlayEndPresenter$hidePlayEnd$$inlined$let$lambda$2.class, "1");
       return;
    }
}
