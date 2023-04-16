package com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureLongPressCollectGuidePresenter$c;
import tyc.k3;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureLongPressCollectGuidePresenter;
import java.lang.Object;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Runnable;
import ekd.k1;

public final class NasaFeatureLongPressCollectGuidePresenter$c implements k3	// class@001977
{
    public final NasaFeatureLongPressCollectGuidePresenter a;

    public void NasaFeatureLongPressCollectGuidePresenter$c(NasaFeatureLongPressCollectGuidePresenter p0){
       this.a = p0;
       super();
    }
    public final void onDispatchTouchEvent(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaFeatureLongPressCollectGuidePresenter$c.class, "1")) {
          return;
       }
       NasaFeatureLongPressCollectGuidePresenter$c ta = this.a;
       ta.C = true;
       ta.R8();
       this.a.W8();
       k1.m(this.a.V8());
       return;
    }
}
