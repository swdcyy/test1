package com.yxcorp.gifshow.featured.detail.featured.presenter.NasaFeaturedNewFpsMonitorPresenter$lifecycleObserver$1;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.yxcorp.gifshow.featured.detail.featured.presenter.NasaFeaturedNewFpsMonitorPresenter;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kda.e;
import q87.c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;

public final class NasaFeaturedNewFpsMonitorPresenter$lifecycleObserver$1 implements DefaultLifecycleObserver	// class@000f60
{
    public final NasaFeaturedNewFpsMonitorPresenter b;

    public void NasaFeaturedNewFpsMonitorPresenter$lifecycleObserver$1(NasaFeaturedNewFpsMonitorPresenter p0){
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
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaFeaturedNewFpsMonitorPresenter$lifecycleObserver$1.class, "2")) {
          return;
       }
       a.p(p0, "owner");
       Object[] objArray = new Object[0];
       e.C().w("NasaFeaturedNewFpsMonitorPresenter", "onPause", objArray);
       if (NasaFeaturedNewFpsMonitorPresenter.P8(this.b).Vg().c()) {
          if (this.b.V8()) {
             this.b.b9();
          }
          if (this.b.S8()) {
             this.b.a9(0);
          }
       }
       return;
    }
    public void onResume(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaFeaturedNewFpsMonitorPresenter$lifecycleObserver$1.class, "1")) {
          return;
       }
       a.p(p0, "owner");
       Object[] objArray = new Object[0];
       e.C().w("NasaFeaturedNewFpsMonitorPresenter", "onResume", objArray);
       if (NasaFeaturedNewFpsMonitorPresenter.P8(this.b).Vg().c()) {
          if (this.b.X8()) {
             this.b.Z8();
          }
          if (this.b.W8()) {
             this.b.Y8();
          }
       }
       return;
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       a.f(this, p0);
    }
}
