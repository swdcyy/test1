package com.yxcorp.gifshow.detail.slidev2.presenter.feature.NasaProfileSideLikePresenter$2;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.NasaProfileSideLikePresenter;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class NasaProfileSideLikePresenter$2 implements DefaultLifecycleObserver	// class@001919
{
    public final NasaProfileSideLikePresenter b;

    public void NasaProfileSideLikePresenter$2(NasaProfileSideLikePresenter p0){
       this.b = p0;
       super();
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       a.b(this, p0);
    }
    public void onPause(LifecycleOwner p0){
       a.c(this, p0);
    }
    public void onResume(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaProfileSideLikePresenter$2.class, "1")) {
          return;
       }
       this.b.Y8();
       return;
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       a.f(this, p0);
    }
}
