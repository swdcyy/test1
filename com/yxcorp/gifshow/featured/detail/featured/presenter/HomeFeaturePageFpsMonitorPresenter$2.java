package com.yxcorp.gifshow.featured.detail.featured.presenter.HomeFeaturePageFpsMonitorPresenter$2;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.yxcorp.gifshow.featured.detail.featured.presenter.d;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class HomeFeaturePageFpsMonitorPresenter$2 implements DefaultLifecycleObserver	// class@000f53
{
    public final d b;

    public void HomeFeaturePageFpsMonitorPresenter$2(d p0){
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
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeFeaturePageFpsMonitorPresenter$2.class, "2")) {
          return;
       }
       if (this.b.p.Vg().c()) {
          HomeFeaturePageFpsMonitorPresenter$2 tb = this.b;
          if (tb.z != null) {
             tb.X8();
          }
          this.b.W8(3);
       }
       return;
    }
    public void onResume(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeFeaturePageFpsMonitorPresenter$2.class, "1")) {
          return;
       }
       if (this.b.p.Vg().c()) {
          HomeFeaturePageFpsMonitorPresenter$2 tb = this.b;
          if (tb.y != null && tb.z == null) {
             tb.V8(4);
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
