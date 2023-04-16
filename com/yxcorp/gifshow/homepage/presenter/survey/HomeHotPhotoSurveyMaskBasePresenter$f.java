package com.yxcorp.gifshow.homepage.presenter.survey.HomeHotPhotoSurveyMaskBasePresenter$f;
import java.lang.Runnable;
import com.yxcorp.gifshow.homepage.presenter.survey.HomeHotPhotoSurveyMaskBasePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;

public final class HomeHotPhotoSurveyMaskBasePresenter$f implements Runnable	// class@0017e3
{
    public final HomeHotPhotoSurveyMaskBasePresenter b;

    public void HomeHotPhotoSurveyMaskBasePresenter$f(HomeHotPhotoSurveyMaskBasePresenter p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, HomeHotPhotoSurveyMaskBasePresenter$f.class, "1")) {
          return;
       }
       ViewGroup viewGroup = this.b.Z8();
       if (viewGroup == null || viewGroup.getVisibility()) {
          this.b.c9(false);
       }
       return;
    }
}
