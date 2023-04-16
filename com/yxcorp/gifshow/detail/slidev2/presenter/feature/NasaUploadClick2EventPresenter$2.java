package com.yxcorp.gifshow.detail.slidev2.presenter.feature.NasaUploadClick2EventPresenter$2;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.NasaUploadClick2EventPresenter;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import lnc.j1;

public class NasaUploadClick2EventPresenter$2 implements DefaultLifecycleObserver	// class@00191f
{
    public final NasaUploadClick2EventPresenter b;

    public void NasaUploadClick2EventPresenter$2(NasaUploadClick2EventPresenter p0){
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
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaUploadClick2EventPresenter$2.class, "2")) {
          return;
       }
       NasaUploadClick2EventPresenter$2 tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, NasaUploadClick2EventPresenter.class, "7")) {
          NasaUploadClick2EventPresenter u = tb.u;
          if (u != null) {
             u.b();
          }
       }
       return;
    }
    public void onResume(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaUploadClick2EventPresenter$2.class, "1")) {
          return;
       }
       this.b.R8();
       return;
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       a.f(this, p0);
    }
}
