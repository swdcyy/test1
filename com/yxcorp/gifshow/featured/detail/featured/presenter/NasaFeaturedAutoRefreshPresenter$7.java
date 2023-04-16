package com.yxcorp.gifshow.featured.detail.featured.presenter.NasaFeaturedAutoRefreshPresenter$7;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.yxcorp.gifshow.featured.detail.featured.presenter.NasaFeaturedAutoRefreshPresenter;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import rf5.u;

public class NasaFeaturedAutoRefreshPresenter$7 implements DefaultLifecycleObserver	// class@000f54
{
    public final NasaFeaturedAutoRefreshPresenter b;

    public void NasaFeaturedAutoRefreshPresenter$7(NasaFeaturedAutoRefreshPresenter p0){
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
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaFeaturedAutoRefreshPresenter$7.class, "1")) {
          return;
       }
       if (this.b.p.Vg().c() && this.b.q.v()) {
          NasaFeaturedAutoRefreshPresenter$7 tb = this.b;
          if (tb.v != null) {
             tb.v = false;
             tb.P8(tb.x);
          }else if(tb.w != null){
             tb.w = false;
             tb.R8();
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
