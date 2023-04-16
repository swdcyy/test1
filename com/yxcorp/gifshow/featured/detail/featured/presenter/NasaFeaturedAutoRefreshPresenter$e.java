package com.yxcorp.gifshow.featured.detail.featured.presenter.NasaFeaturedAutoRefreshPresenter$e;
import jta.a;
import com.yxcorp.gifshow.featured.detail.featured.presenter.NasaFeaturedAutoRefreshPresenter;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle$State;

public class NasaFeaturedAutoRefreshPresenter$e extends a	// class@000f59
{
    public final NasaFeaturedAutoRefreshPresenter a;

    public void NasaFeaturedAutoRefreshPresenter$e(NasaFeaturedAutoRefreshPresenter p0){
       this.a = p0;
       super();
    }
    public void a(float p0){
       NasaFeaturedAutoRefreshPresenter$e uoe = NasaFeaturedAutoRefreshPresenter$e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoe, "1")) {
          return;
       }
       if (!p0 - 0x3f800000 && (this.a.p.Vg().c() && this.a.p.getLifecycle().getCurrentState() == Lifecycle$State.RESUMED)) {
          NasaFeaturedAutoRefreshPresenter$e ta = this.a;
          if (ta.w != null) {
             ta.w = false;
             ta.R8();
          }
       }
       return;
    }
}
