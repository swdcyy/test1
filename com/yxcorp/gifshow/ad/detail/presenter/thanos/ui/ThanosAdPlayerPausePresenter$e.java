package com.yxcorp.gifshow.ad.detail.presenter.thanos.ui.ThanosAdPlayerPausePresenter$e;
import android.view.GestureDetector$SimpleOnGestureListener;
import com.yxcorp.gifshow.ad.detail.presenter.thanos.ui.ThanosAdPlayerPausePresenter;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;

public final class ThanosAdPlayerPausePresenter$e extends GestureDetector$SimpleOnGestureListener	// class@0016d1
{
    public final ThanosAdPlayerPausePresenter b;

    public void ThanosAdPlayerPausePresenter$e(ThanosAdPlayerPausePresenter p0){
       this.b = p0;
       super();
    }
    public boolean onDoubleTap(MotionEvent p0){
       return true;
    }
    public boolean onSingleTapConfirmed(MotionEvent p0){
       p0 = PatchProxy.applyOneRefs(p0, this, ThanosAdPlayerPausePresenter$e.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       ThanosAdPlayerPausePresenter s = this.b.s;
       if (s == null) {
          a.S("mSlidePlayViewModel");
       }
       if (s.C()) {
          this.b.S8();
       }
       return true;
    }
}
