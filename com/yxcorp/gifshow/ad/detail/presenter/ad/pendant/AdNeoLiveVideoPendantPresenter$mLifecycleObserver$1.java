package com.yxcorp.gifshow.ad.detail.presenter.ad.pendant.AdNeoLiveVideoPendantPresenter$mLifecycleObserver$1;
import com.yxcorp.gifshow.osbug.FixedLifecycleObserver;
import com.yxcorp.gifshow.ad.detail.presenter.ad.pendant.AdNeoLiveVideoPendantPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yx.j0;
import com.yxcorp.gifshow.commercial.pendant.NeoLiveCountDown;
import tkd.b;
import tkd.d;
import vt5.e;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kotlin.jvm.internal.a;
import st5.b$a;
import st5.b;
import androidx.lifecycle.LifecycleOwner;

public final class AdNeoLiveVideoPendantPresenter$mLifecycleObserver$1 extends FixedLifecycleObserver	// class@0015de
{
    public final AdNeoLiveVideoPendantPresenter f;

    public void AdNeoLiveVideoPendantPresenter$mLifecycleObserver$1(AdNeoLiveVideoPendantPresenter p0){
       this.f = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, AdNeoLiveVideoPendantPresenter$mLifecycleObserver$1.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("AdNeoPendentPresenter", "onPauseBelievable", objArray);
       AdNeoLiveVideoPendantPresenter r = this.f.r;
       if (r != null) {
          r.stop();
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, AdNeoLiveVideoPendantPresenter$mLifecycleObserver$1.class, "1")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       j0.f("AdNeoPendentPresenter", "onResumeBelievable", objArray);
       Activity activity = this.f.getActivity();
       a.m(activity);
       d.a(-1094279325).ha(activity, b$a.b);
       if (this.f.t != null) {
          Object[] objArray1 = new Object[i];
          j0.f("AdNeoPendentPresenter", "mNeoLivePendant has been used,now it will be start again", objArray1);
          AdNeoLiveVideoPendantPresenter r = this.f.r;
          if (r != null) {
             r.start();
          }
       }
       return;
    }
    public void onStop(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdNeoLiveVideoPendantPresenter$mLifecycleObserver$1.class, "3")) {
          return;
       }
       a.p(p0, "owner");
       Object[] objArray = new Object[0];
       j0.f("AdNeoPendentPresenter", "onStop", objArray);
       super.onStop(p0);
       Activity activity = this.f.getActivity();
       a.m(activity);
       d.a(-1094279325).fx(activity, b$a.b);
       return;
    }
}
