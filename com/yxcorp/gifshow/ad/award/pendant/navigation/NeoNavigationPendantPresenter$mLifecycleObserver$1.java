package com.yxcorp.gifshow.ad.award.pendant.navigation.NeoNavigationPendantPresenter$mLifecycleObserver$1;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gifshow.ad.award.pendant.navigation.NeoNavigationPendantPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kotlin.jvm.internal.a;
import java.util.Objects;
import android.app.Activity;
import hy8.a;

public final class NeoNavigationPendantPresenter$mLifecycleObserver$1 implements LifecycleObserver	// class@00151f
{
    public final NeoNavigationPendantPresenter b;

    public void NeoNavigationPendantPresenter$mLifecycleObserver$1(NeoNavigationPendantPresenter p0){
       this.b = p0;
       super();
    }
    public final void onPause(){
       if (PatchProxy.applyVoid(null, this, NeoNavigationPendantPresenter$mLifecycleObserver$1.class, "2")) {
          return;
       }
       this.b.P8();
       return;
    }
    public final void onResume(){
       if (PatchProxy.applyVoid(null, this, NeoNavigationPendantPresenter$mLifecycleObserver$1.class, "1")) {
          return;
       }
       NeoNavigationPendantPresenter$mLifecycleObserver$1 tb = this.b;
       View view = tb.m8();
       a.o(view, "rootView");
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(view, tb, NeoNavigationPendantPresenter.class, "4")) {
          NeoNavigationPendantPresenter p = tb.p;
          if (p != null) {
             p.f(view, tb.getActivity());
          }
       }
       return;
    }
}
