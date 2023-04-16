package com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.FeatureOpenDanmakuGuidePresenter$a;
import d6a.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.FeatureOpenDanmakuGuidePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kwai.feature.api.danmaku.model.DanmakuInfo;
import nm5.e;
import com.kwai.feature.api.danmaku.model.PhotoDanmakuGuideConfig;
import sm5.d;

public final class FeatureOpenDanmakuGuidePresenter$a extends a	// class@00194d
{
    public final FeatureOpenDanmakuGuidePresenter b;

    public void FeatureOpenDanmakuGuidePresenter$a(FeatureOpenDanmakuGuidePresenter p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, FeatureOpenDanmakuGuidePresenter$a.class, "2")) {
          return;
       }
       this.b.V8();
       k1.m(this.b.B);
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, FeatureOpenDanmakuGuidePresenter$a.class, "1")) {
          return;
       }
       QPhoto qPhoto = FeatureOpenDanmakuGuidePresenter.P8(this.b);
       if (qPhoto != null) {
          CommonMeta commonMeta = qPhoto.getCommonMeta();
          if (commonMeta != null) {
             DanmakuInfo uDanmakuInfo = e.a(commonMeta);
             if (uDanmakuInfo != null) {
                uDanmakuInfo = uDanmakuInfo.mPhotoDanmakuGuideConfig;
                if (uDanmakuInfo != null) {
                   int startShowTim = uDanmakuInfo.getStartShowTime();
                   if (!this.b.R8()) {
                      if (d.b(FeatureOpenDanmakuGuidePresenter.P8(this.b))) {
                         FeatureOpenDanmakuGuidePresenter$a tb = this.b;
                         if (!tb.S8(FeatureOpenDanmakuGuidePresenter.P8(tb))) {
                         label_0054 :
                            return;
                         }
                      }else {
                         goto label_0054 ;
                      }
                   }
                   k1.r(this.b.B, ((long)startShowTim * 1000));
                   goto label_0054 ;
                }else {
                   goto label_0054 ;
                }
             }else {
                goto label_0054 ;
             }
          }else {
             goto label_0054 ;
          }
       }else {
          goto label_0054 ;
       }
    }
}
