package com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureLongPressCollectGuidePresenter$mShowGuideRunnable$2$1;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureLongPressCollectGuidePresenter$mShowGuideRunnable$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureLongPressCollectGuidePresenter;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import rf5.u;
import kotlin.jvm.internal.a;
import j8a.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureLongPressCollectGuidePresenter$mShowGuideRunnable$2$1$1;
import msd.a;
import msd.l;
import j8a.d1;

public final class NasaFeatureLongPressCollectGuidePresenter$mShowGuideRunnable$2$1 implements Runnable	// class@00197b
{
    public final NasaFeatureLongPressCollectGuidePresenter$mShowGuideRunnable$2 b;

    public void NasaFeatureLongPressCollectGuidePresenter$mShowGuideRunnable$2$1(NasaFeatureLongPressCollectGuidePresenter$mShowGuideRunnable$2 p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, NasaFeatureLongPressCollectGuidePresenter$mShowGuideRunnable$2$1.class, "1")) {
          return;
       }
       if (this.b.this$0.P8()) {
          NasaFeatureLongPressCollectGuidePresenter$mShowGuideRunnable$2 this$0 = this.b.this$0;
          Objects.requireNonNull(this$0);
          NasaFeatureLongPressCollectGuidePresenter nasaFeatureL = PatchProxy.apply(null, this$0, NasaFeatureLongPressCollectGuidePresenter.class, "4");
          if (nasaFeatureL != PatchProxyResult.class) {
          }else {
             nasaFeatureL = this$0.q;
             if (nasaFeatureL == null) {
                a.S("mSwipeToProfileFeedMovement");
             }
          }
          if (!nasaFeatureL.w()) {
             this.b.this$0.S8().E(null, new NasaFeatureLongPressCollectGuidePresenter$mShowGuideRunnable$2$1$1(this), null);
          }
       }
       return;
    }
}
