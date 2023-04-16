package com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.FeatureOpenDanmakuGuidePresenter$mShowGuideRunnable$1;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.FeatureOpenDanmakuGuidePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import sm5.d;
import j8a.a;
import j8a.d1;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.FeatureOpenDanmakuGuidePresenter$mShowGuideRunnable$1$1;
import msd.a;
import msd.l;

public final class FeatureOpenDanmakuGuidePresenter$mShowGuideRunnable$1 implements Runnable	// class@001952
{
    public final FeatureOpenDanmakuGuidePresenter b;

    public void FeatureOpenDanmakuGuidePresenter$mShowGuideRunnable$1(FeatureOpenDanmakuGuidePresenter p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, FeatureOpenDanmakuGuidePresenter$mShowGuideRunnable$1.class, "1")) {
          return;
       }
       if (!this.b.R8()) {
          if (d.b(FeatureOpenDanmakuGuidePresenter.P8(this.b))) {
             FeatureOpenDanmakuGuidePresenter$mShowGuideRunnable$1 tb = this.b;
             if (tb.S8(FeatureOpenDanmakuGuidePresenter.P8(tb))) {
             label_002c :
                this.b.W8().S();
                this.b.W8().E(null, new FeatureOpenDanmakuGuidePresenter$mShowGuideRunnable$1$1(this), null);
             }
          }
       }else {
          goto label_002c ;
       }
       return;
    }
}
