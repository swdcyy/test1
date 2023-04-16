package com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureLikeGuidePresenter$c;
import d6a.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureLikeGuidePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureGuideManager;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureGuideManager$a;
import uw9.o;
import q87.c;
import java.lang.Runnable;
import ekd.k1;

public final class NasaFeatureLikeGuidePresenter$c extends a	// class@001969
{
    public final NasaFeatureLikeGuidePresenter b;

    public void NasaFeatureLikeGuidePresenter$c(NasaFeatureLikeGuidePresenter p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, NasaFeatureLikeGuidePresenter$c.class, "2")) {
          return;
       }
       NasaFeatureLikeGuidePresenter$c tb = this.b;
       tb.C = false;
       tb.R8();
       this.b.a9();
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, NasaFeatureLikeGuidePresenter$c.class, "1")) {
          return;
       }
       this.b.C = true;
       if (NasaFeatureGuideManager.e.a().d() > 3 && this.b.B == null) {
          Object[] objArray = new Object[0];
          o.C().w("NasaGuide", "like guide p attach", objArray);
          k1.r(this.b.W8(), 7000);
       }
       return;
    }
}
