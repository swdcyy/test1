package com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureLikeGuidePresenter$mShowGuideRunnable$2$1;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureLikeGuidePresenter$mShowGuideRunnable$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uw9.o;
import java.lang.StringBuilder;
import im8.f;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureLikeGuidePresenter;
import java.lang.Boolean;
import q87.c;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureLikeGuidePresenter$mShowGuideRunnable$2$1$1;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureLikeGuidePresenter$mShowGuideRunnable$2$1$2;
import msd.a;
import msd.l;
import j8a.d1;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureLikeGuidePresenter$mShowGuideRunnable$2$1$3;

public final class NasaFeatureLikeGuidePresenter$mShowGuideRunnable$2$1 implements Runnable	// class@00196f
{
    public final NasaFeatureLikeGuidePresenter$mShowGuideRunnable$2 b;

    public void NasaFeatureLikeGuidePresenter$mShowGuideRunnable$2$1(NasaFeatureLikeGuidePresenter$mShowGuideRunnable$2 p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray2;
       NasaFeatureLikeGuidePresenter z;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, NasaFeatureLikeGuidePresenter$mShowGuideRunnable$2$1.class, "1")) {
          return;
       }
       int i = 0;
       Object[] objArray1 = new Object[i];
       o.C().w("NasaGuide", this.b.this$0.V8().get()+"-----", objArray1);
       NasaFeatureLikeGuidePresenter$mShowGuideRunnable$2 this$0 = this.b.this$0;
       if (this$0.D != null && (this$0.P8() && this.b.this$0.G == null)) {
          objArray2 = new Object[i];
          o.C().w("NasaGuide", "展示点赞引导", objArray2);
          z = this.b.this$0.z;
          if (z != null) {
             z.E(objArray, new NasaFeatureLikeGuidePresenter$mShowGuideRunnable$2$1$1(this), new NasaFeatureLikeGuidePresenter$mShowGuideRunnable$2$1$2(this));
          }
       }else {
          this$0 = this.b.this$0;
          if (this$0.D != null) {
             this$0.b9("f");
          }else if(this$0.B == null && this$0.P8()){
             this$0 = this.b.this$0;
             if (this$0.G == null && !this$0.Y8()) {
                objArray2 = new Object[i];
                o.C().w("NasaGuide", "展示点赞引导", objArray2);
                z = this.b.this$0.z;
                if (z != null) {
                   z.E(objArray, new NasaFeatureLikeGuidePresenter$mShowGuideRunnable$2$1$3(this), objArray);
                }
             }
          }
       }
       return;
    }
}
