package com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.FeatureSideSlideUpGuidePresenter$mSidebarStatusListener$2$a;
import jta.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.FeatureSideSlideUpGuidePresenter$mSidebarStatusListener$2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.FeatureSideSlideUpGuidePresenter;

public final class FeatureSideSlideUpGuidePresenter$mSidebarStatusListener$2$a extends a	// class@001961
{
    public final FeatureSideSlideUpGuidePresenter$mSidebarStatusListener$2 a;

    public void FeatureSideSlideUpGuidePresenter$mSidebarStatusListener$2$a(FeatureSideSlideUpGuidePresenter$mSidebarStatusListener$2 p0){
       this.a = p0;
       super();
    }
    public void a(float p0){
       FeatureSideSlideUpGuidePresenter$mSidebarStatusListener$2 this$0;
       FeatureSideSlideUpGuidePresenter$mSidebarStatusListener$2$a omSidebarSta = FeatureSideSlideUpGuidePresenter$mSidebarStatusListener$2$a.class;
       if (PatchProxy.isSupport(omSidebarSta) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, omSidebarSta, "1")) {
          return;
       }
       if (!p0) {
          this$0 = this.a.this$0;
          this$0.A = true;
          if (this$0.P8()) {
             this.a.this$0.S8();
          }
       }else {
          this$0 = this.a.this$0;
          this$0.A = false;
          this$0.R8();
       }
       return;
    }
}
