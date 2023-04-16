package com.yxcorp.gifshow.detail.slideplay.nasa.relax.RelaxTimeDetailPresenter$5;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.yxcorp.gifshow.detail.slideplay.nasa.relax.RelaxTimeDetailPresenter;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.player.core.b;

public class RelaxTimeDetailPresenter$5 implements DefaultLifecycleObserver	// class@0017a9
{
    public final RelaxTimeDetailPresenter b;

    public void RelaxTimeDetailPresenter$5(RelaxTimeDetailPresenter p0){
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
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, RelaxTimeDetailPresenter$5.class, "2")) {
          return;
       }
       RelaxTimeDetailPresenter f = this.b.F;
       if (f != null) {
          f.pause();
       }
       PatchProxy.onMethodExit(RelaxTimeDetailPresenter$5.class, "2");
       return;
    }
    public void onResume(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, RelaxTimeDetailPresenter$5.class, "1")) {
          return;
       }
       RelaxTimeDetailPresenter f = this.b.F;
       if (f != null) {
          f.start();
       }
       PatchProxy.onMethodExit(RelaxTimeDetailPresenter$5.class, "1");
       return;
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       a.f(this, p0);
    }
}
