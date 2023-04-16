package com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.FeatureLongPressExtractTextGuidePresenter$mShowGuideRunnable$1;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.FeatureLongPressExtractTextGuidePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import rf5.u;
import j8a.a;
import j8a.d1;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.FeatureLongPressExtractTextGuidePresenter$mShowGuideRunnable$1$1;
import msd.a;
import msd.l;

public final class FeatureLongPressExtractTextGuidePresenter$mShowGuideRunnable$1 implements Runnable	// class@00194b
{
    public final FeatureLongPressExtractTextGuidePresenter b;

    public void FeatureLongPressExtractTextGuidePresenter$mShowGuideRunnable$1(FeatureLongPressExtractTextGuidePresenter p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, FeatureLongPressExtractTextGuidePresenter$mShowGuideRunnable$1.class, "1")) {
          return;
       }
       if (this.b.P8()) {
          FeatureLongPressExtractTextGuidePresenter$mShowGuideRunnable$1 tb = this.b;
          if (tb.z == null) {
             FeatureLongPressExtractTextGuidePresenter u = tb.u;
             if (u == null) {
                a.S("mSwipeToProfileFeedMovement");
             }
             if (!u.w()) {
                this.b.S8().S();
                this.b.S8().E(null, new FeatureLongPressExtractTextGuidePresenter$mShowGuideRunnable$1$1(this), null);
             }
          }
       }
       return;
    }
}
