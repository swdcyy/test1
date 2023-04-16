package com.yxcorp.gifshow.homepage.presenter.survey.HomeHotPhotoSurveyMaskBasePresenter$e;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.homepage.presenter.survey.HomeHotPhotoSurveyMaskBasePresenter;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.model.EventTrackType;
import lnc.a1;

public final class HomeHotPhotoSurveyMaskBasePresenter$e extends m	// class@0017e2
{
    public final HomeHotPhotoSurveyMaskBasePresenter c;

    public void HomeHotPhotoSurveyMaskBasePresenter$e(HomeHotPhotoSurveyMaskBasePresenter p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeHotPhotoSurveyMaskBasePresenter$e.class, "1")) {
          return;
       }
       this.c.d9(EventTrackType.NOT_SURE_TYPE, "2", "2");
       this.c.a9(true);
       this.c.j9();
       this.c.b9(a1.p(R.string.arg_RES_7f101559));
       return;
    }
}
