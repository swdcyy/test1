package com.kwai.nearby.local.presenter.secondary.RecycleItemRecoRealShowPresenter$1;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.kwai.nearby.local.presenter.secondary.RecycleItemRecoRealShowPresenter;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class RecycleItemRecoRealShowPresenter$1 implements DefaultLifecycleObserver	// class@000fca
{
    public final RecycleItemRecoRealShowPresenter b;

    public void RecycleItemRecoRealShowPresenter$1(RecycleItemRecoRealShowPresenter p0){
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
       if (PatchProxy.applyVoidOneRefs(p0, this, RecycleItemRecoRealShowPresenter$1.class, "1")) {
          return;
       }
       this.b.S8();
       return;
    }
    public void onResume(LifecycleOwner p0){
       a.d(this, p0);
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       a.f(this, p0);
    }
}
