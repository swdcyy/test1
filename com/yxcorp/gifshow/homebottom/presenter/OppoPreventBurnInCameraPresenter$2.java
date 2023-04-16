package com.yxcorp.gifshow.homebottom.presenter.OppoPreventBurnInCameraPresenter$2;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gifshow.homebottom.presenter.OppoPreventBurnInCameraPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Runnable;
import ekd.k1;

public class OppoPreventBurnInCameraPresenter$2 implements LifecycleObserver	// class@00168e
{
    public final OppoPreventBurnInCameraPresenter b;

    public void OppoPreventBurnInCameraPresenter$2(OppoPreventBurnInCameraPresenter p0){
       this.b = p0;
       super();
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, OppoPreventBurnInCameraPresenter$2.class, "2")) {
          return;
       }
       k1.m(this.b.u);
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, OppoPreventBurnInCameraPresenter$2.class, "1")) {
          return;
       }
       OppoPreventBurnInCameraPresenter$2 tb = this.b;
       k1.r(tb.u, tb.r);
       return;
    }
}
