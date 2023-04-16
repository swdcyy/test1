package com.yxcorp.gifshow.homepage.presenter.PhotoCoverSurveyPresenter$1;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gifshow.homepage.presenter.PhotoCoverSurveyPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import lnc.p5;
import java.lang.Runnable;

public class PhotoCoverSurveyPresenter$1 implements LifecycleObserver	// class@001799
{
    public final PhotoCoverSurveyPresenter b;

    public void PhotoCoverSurveyPresenter$1(PhotoCoverSurveyPresenter p0){
       this.b = p0;
       super();
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, PhotoCoverSurveyPresenter$1.class, "1")) {
          return;
       }
       PhotoCoverSurveyPresenter$1 tb = this.b;
       if (tb.t == null) {
          return;
       }
       if (tb.I != null) {
          int i = -87691847;
          if (b.a(i).b(this.b.J) && !this.b.R8()) {
             this.b.b9();
          }
          b.a(i).c(this.b.J);
          tb = this.b;
          tb.I = false;
          tb.Y8();
          this.b.Z8(false, "", 1, null);
       }
       return;
    }
}
