package com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.FeatureLongPressExtractTextGuidePresenter$mShowGuideRunnable$1$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.FeatureLongPressExtractTextGuidePresenter$mShowGuideRunnable$1;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.FeatureLongPressExtractTextGuidePresenter;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import im8.f;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureGuideManager;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureGuideManager$a;
import java.util.Objects;
import oe6.e;

public final class FeatureLongPressExtractTextGuidePresenter$mShowGuideRunnable$1$1 extends Lambda implements a	// class@00194a
{
    public final FeatureLongPressExtractTextGuidePresenter$mShowGuideRunnable$1 this$0;

    public void FeatureLongPressExtractTextGuidePresenter$mShowGuideRunnable$1$1(FeatureLongPressExtractTextGuidePresenter$mShowGuideRunnable$1 p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, FeatureLongPressExtractTextGuidePresenter$mShowGuideRunnable$1$1.class, "1")) {
          return;
       }
       FeatureLongPressExtractTextGuidePresenter r = this.this$0.b.r;
       if (r == null) {
          a.S("mHasShownGuide");
       }
       Boolean tRUE = Boolean.TRUE;
       r.set(tRUE);
       r = this.this$0.b.s;
       if (r == null) {
          a.S("mCanClearScreen");
       }
       r.set(Boolean.FALSE);
       NasaFeatureGuideManager nasaFeatureG = NasaFeatureGuideManager.e.a();
       Objects.requireNonNull(nasaFeatureG);
       if (!PatchProxy.isSupport(NasaFeatureGuideManager.class) || !PatchProxy.applyVoidOneRefs(tRUE, nasaFeatureG, NasaFeatureGuideManager.class, "15")) {
          e.w0(true);
       }
       return;
    }
}
