package com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.FeatureSideSlideUpGuidePresenter$delayShowGuide$1$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.FeatureSideSlideUpGuidePresenter$delayShowGuide$1;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureGuideManager;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureGuideManager$a;
import java.util.Objects;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.FeatureSideSlideUpGuidePresenter;
import com.kwai.robust.PatchProxyResult;
import im8.f;
import kotlin.jvm.internal.a;
import java.lang.Boolean;

public final class FeatureSideSlideUpGuidePresenter$delayShowGuide$1$1 extends Lambda implements a	// class@00195f
{
    public final FeatureSideSlideUpGuidePresenter$delayShowGuide$1 this$0;

    public void FeatureSideSlideUpGuidePresenter$delayShowGuide$1$1(FeatureSideSlideUpGuidePresenter$delayShowGuide$1 p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, FeatureSideSlideUpGuidePresenter$delayShowGuide$1$1.class, "1")) {
          return;
       }
       NasaFeatureGuideManager.e.a().r(false);
       FeatureSideSlideUpGuidePresenter$delayShowGuide$1 b = this.this$0.b;
       Objects.requireNonNull(b);
       FeatureSideSlideUpGuidePresenter uFeatureSide = PatchProxy.apply(objArray, b, FeatureSideSlideUpGuidePresenter.class, "4");
       if (uFeatureSide != PatchProxyResult.class) {
       }else {
          uFeatureSide = b.r;
          if (uFeatureSide == null) {
             a.S("mHasShownGuide");
          }
       }
       uFeatureSide.set(Boolean.TRUE);
       return;
    }
}
