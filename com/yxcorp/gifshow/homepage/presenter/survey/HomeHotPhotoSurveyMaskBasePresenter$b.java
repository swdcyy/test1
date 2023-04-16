package com.yxcorp.gifshow.homepage.presenter.survey.HomeHotPhotoSurveyMaskBasePresenter$b;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.homepage.presenter.survey.HomeHotPhotoSurveyMaskBasePresenter;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.model.EventTrackType;

public final class HomeHotPhotoSurveyMaskBasePresenter$b extends m	// class@0017df
{
    public final HomeHotPhotoSurveyMaskBasePresenter c;

    public void HomeHotPhotoSurveyMaskBasePresenter$b(HomeHotPhotoSurveyMaskBasePresenter p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeHotPhotoSurveyMaskBasePresenter$b.class, "1")) {
          return;
       }
       HomeHotPhotoSurveyMaskBasePresenter.e9(this.c, EventTrackType.CLOSE_TYPE, null, null, 6, null);
       this.c.a9(true);
       this.c.b9("close");
       return;
    }
}
