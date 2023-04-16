package com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureLongPressCollectGuidePresenter$b;
import d6a.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureLongPressCollectGuidePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Runnable;
import ekd.k1;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.a;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.CollectGuideInfo;
import java.lang.Long;

public final class NasaFeatureLongPressCollectGuidePresenter$b extends a	// class@001976
{
    public final NasaFeatureLongPressCollectGuidePresenter b;

    public void NasaFeatureLongPressCollectGuidePresenter$b(NasaFeatureLongPressCollectGuidePresenter p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, NasaFeatureLongPressCollectGuidePresenter$b.class, "2")) {
          return;
       }
       this.b.R8();
       this.b.W8();
       k1.m(this.b.V8());
       return;
    }
    public void i2(){
       long l;
       CollectGuideInfo mStrongGuide;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, NasaFeatureLongPressCollectGuidePresenter$b.class, "1")) {
          return;
       }
       if (this.b.P8()) {
          Runnable runnable = this.b.V8();
          NasaFeatureLongPressCollectGuidePresenter$b tb = this.b;
          Objects.requireNonNull(tb);
          Object obj = PatchProxy.apply(objArray, tb, NasaFeatureLongPressCollectGuidePresenter.class, "28");
          if (obj != PatchProxyResult.class) {
             l = obj.longValue();
          }else {
             NasaFeatureLongPressCollectGuidePresenter p = tb.p;
             if (p == null) {
                a.S("mPhoto");
             }
             PhotoMeta photoMeta = p.getPhotoMeta();
             obj = 0;
             if (photoMeta != null) {
                photoMeta = photoMeta.mCollectGuideInfo;
                if (photoMeta != null) {
                   mStrongGuide = photoMeta.mStrongGuidePopUpTime;
                label_004b :
                   Long longx = Long.valueOf((mStrongGuide * (long)1000));
                   obj = (longx.longValue() - obj >= 0)? 1: 0;
                   if (obj) {
                      objArray = longx;
                   }
                   if (objArray != null) {
                      l = objArray.longValue();
                   }else {
                      l = 8000;
                   }
                }
             }
             mStrongGuide = obj;
             goto label_004b ;
          }
          k1.r(runnable, l);
       }
       return;
    }
}
