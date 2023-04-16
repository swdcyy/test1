package com.yxcorp.gifshow.detail.presenter.PictureInPicturePresenter$mActivityLifecycleObserver$1;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gifshow.detail.presenter.PictureInPicturePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class PictureInPicturePresenter$mActivityLifecycleObserver$1 implements LifecycleObserver	// class@0016bd
{
    public final PictureInPicturePresenter b;

    public void PictureInPicturePresenter$mActivityLifecycleObserver$1(PictureInPicturePresenter p0){
       this.b = p0;
       super();
    }
    public final void onActivityResumed(){
       if (PatchProxy.applyVoid(null, this, PictureInPicturePresenter$mActivityLifecycleObserver$1.class, "1")) {
          return;
       }
       PictureInPicturePresenter$mActivityLifecycleObserver$1 tb = this.b;
       if (tb.G != null) {
          tb.G = false;
          tb.V8();
       }
       return;
    }
}
