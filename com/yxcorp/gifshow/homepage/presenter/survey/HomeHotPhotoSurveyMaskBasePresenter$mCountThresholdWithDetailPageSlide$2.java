package com.yxcorp.gifshow.homepage.presenter.survey.HomeHotPhotoSurveyMaskBasePresenter$mCountThresholdWithDetailPageSlide$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import com.yxcorp.gifshow.homepage.util.HomeCardExperimentUtil;
import java.util.Objects;
import qrd.p;
import java.lang.Integer;

public final class HomeHotPhotoSurveyMaskBasePresenter$mCountThresholdWithDetailPageSlide$2 extends Lambda implements a	// class@0017e6
{
    public static final HomeHotPhotoSurveyMaskBasePresenter$mCountThresholdWithDetailPageSlide$2 INSTANCE;

    static {
       HomeHotPhotoSurveyMaskBasePresenter$mCountThresholdWithDetailPageSlide$2.INSTANCE = new HomeHotPhotoSurveyMaskBasePresenter$mCountThresholdWithDetailPageSlide$2();
    }
    public void HomeHotPhotoSurveyMaskBasePresenter$mCountThresholdWithDetailPageSlide$2(){
       super(0);
    }
    public final int invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       HomeCardExperimentUtil obj = PatchProxy.apply(null, this, HomeHotPhotoSurveyMaskBasePresenter$mCountThresholdWithDetailPageSlide$2.class, "1");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = HomeCardExperimentUtil.e;
       Objects.requireNonNull(obj);
       Number number = PatchProxy.apply(null, obj, HomeCardExperimentUtil.class, "4");
       if (number == patchProxyRe) {
          number = HomeCardExperimentUtil.d.getValue();
       }
       return number.intValue();
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
