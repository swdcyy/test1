package com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.FeatureSideSlideUpGuidePresenter$c;
import androidx.viewpager.widget.ViewPager$i;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.FeatureSideSlideUpGuidePresenter;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Float;
import java.lang.String;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureGuideManager;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureGuideManager$a;

public final class FeatureSideSlideUpGuidePresenter$c implements ViewPager$i	// class@00195e
{
    public final FeatureSideSlideUpGuidePresenter b;

    public void FeatureSideSlideUpGuidePresenter$c(FeatureSideSlideUpGuidePresenter p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
    }
    public void onPageScrolled(int p0,float p1,int p2){
       if (PatchProxy.isSupport(FeatureSideSlideUpGuidePresenter$c.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, FeatureSideSlideUpGuidePresenter$c.class, "1")) {
          return;
       }
       if (this.b.A != null && p1 - (float)0 > 0) {
          NasaFeatureGuideManager.e.a().r(0);
       }
       return;
    }
    public void onPageSelected(int p0){
    }
}
