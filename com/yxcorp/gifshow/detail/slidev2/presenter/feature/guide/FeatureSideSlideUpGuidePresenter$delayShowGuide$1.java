package com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.FeatureSideSlideUpGuidePresenter$delayShowGuide$1;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.FeatureSideSlideUpGuidePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.FeatureSideSlideUpGuidePresenter$delayShowGuide$1$1;
import msd.a;
import msd.l;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.SideSlideUpGuider;

public final class FeatureSideSlideUpGuidePresenter$delayShowGuide$1 implements Runnable	// class@001960
{
    public final FeatureSideSlideUpGuidePresenter b;

    public void FeatureSideSlideUpGuidePresenter$delayShowGuide$1(FeatureSideSlideUpGuidePresenter p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, FeatureSideSlideUpGuidePresenter$delayShowGuide$1.class, "1")) {
          return;
       }
       if (this.b.P8()) {
          FeatureSideSlideUpGuidePresenter w = this.b.w;
          if (w != null) {
             w.E(null, new FeatureSideSlideUpGuidePresenter$delayShowGuide$1$1(this), null);
          }
       }
       return;
    }
}
