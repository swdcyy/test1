package com.yxcorp.gifshow.ad.detail.presenter.ad.label.thanos.ThanosToggleStatePresenter$onBind$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.ad.detail.presenter.ad.label.thanos.ThanosToggleStatePresenter;
import java.lang.Object;
import android.view.View;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import android.util.Property;
import android.animation.ObjectAnimator;
import ky8.a;
import android.animation.TimeInterpolator;
import vz8.g;
import com.yxcorp.gifshow.ad.detail.presenter.ad.label.thanos.ToggleState;
import io.reactivex.subjects.PublishSubject;

public final class ThanosToggleStatePresenter$onBind$1 extends Lambda implements l	// class@0015c7
{
    public final ThanosToggleStatePresenter this$0;

    public void ThanosToggleStatePresenter$onBind$1(ThanosToggleStatePresenter p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(View p0){
       ThanosToggleStatePresenter r;
       if (PatchProxy.applyVoidOneRefs(p0, this, ThanosToggleStatePresenter$onBind$1.class, "1")) {
          return;
       }
       a.p(p0, "it");
       ThanosToggleStatePresenter$onBind$1 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       if (!PatchProxy.applyVoid(null, tthis$0, ThanosToggleStatePresenter.class, "4")) {
          r = tthis$0.s;
          if (r == null) {
             a.S("mToggleStateView");
          }
          ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(r, View.ROTATION, new float[2]{0,0x43340000});
          a.o(objectAnimat, "animator");
          objectAnimat.setInterpolator(new a(0.25f, 0.10f, 0.25f, 0.10f));
          objectAnimat.setDuration(200);
          objectAnimat.start();
       }
       r = this.this$0.r;
       if (r == null) {
          a.S("mCardToggleStateSubject");
       }
       r.onNext(new g(ToggleState.TOGGLE_STATE_INFO_TO_CARD, false, false));
       this.this$0.R8();
       return;
    }
}
