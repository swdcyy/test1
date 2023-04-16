package com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.FeatureScaleCleanGuidePresenter$mShowGuideRunnable$2$1;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.FeatureScaleCleanGuidePresenter$mShowGuideRunnable$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.FeatureScaleCleanGuidePresenter;
import kotlin.jvm.internal.a;
import rf5.u;
import j8a.b1;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.FeatureScaleCleanGuidePresenter$mShowGuideRunnable$2$1$1;
import msd.a;
import msd.l;
import j8a.d1;

public final class FeatureScaleCleanGuidePresenter$mShowGuideRunnable$2$1 implements Runnable	// class@001959
{
    public final FeatureScaleCleanGuidePresenter$mShowGuideRunnable$2 b;

    public void FeatureScaleCleanGuidePresenter$mShowGuideRunnable$2$1(FeatureScaleCleanGuidePresenter$mShowGuideRunnable$2 p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, FeatureScaleCleanGuidePresenter$mShowGuideRunnable$2$1.class, "1")) {
          return;
       }
       if (this.b.this$0.P8()) {
          FeatureScaleCleanGuidePresenter q = this.b.this$0.q;
          if (q == null) {
             a.S("mSwipeToProfileFeedMovement");
          }
          if (!q.w()) {
             this.b.this$0.S8().E(null, new FeatureScaleCleanGuidePresenter$mShowGuideRunnable$2$1$1(this), null);
          }
       }
       return;
    }
}
