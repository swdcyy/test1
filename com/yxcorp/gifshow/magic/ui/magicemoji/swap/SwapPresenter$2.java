package com.yxcorp.gifshow.magic.ui.magicemoji.swap.SwapPresenter$2;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.SwapPresenter;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import i5b.h;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleObserver;
import android.view.View;
import z69.t;
import android.os.Build;
import android.os.Build$VERSION;

public class SwapPresenter$2 implements DefaultLifecycleObserver	// class@001c28
{
    public final SwapPresenter b;

    public void SwapPresenter$2(SwapPresenter p0){
       this.b = p0;
       super();
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SwapPresenter$2.class, "3")) {
          return;
       }
       this.b.M.b().getLifecycle().removeObserver(this.b.T);
       return;
    }
    public void onPause(LifecycleOwner p0){
       a.c(this, p0);
    }
    public void onResume(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SwapPresenter$2.class, "1")) {
          return;
       }
       SwapPresenter v = this.b.v;
       if (v != null && !v.getVisibility()) {
          if (!this.b.P.a() && ((Build.MODEL).startsWith("Redmi") || Build$VERSION.SDK_INT >= 29)) {
             SwapPresenter$2 tb = this.b;
             SwapPresenter k = tb.K;
             if (k <= null) {
                k = 70;
             }
             tb.h9(true, k);
          }
          this.b.P.c();
       }
       return;
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SwapPresenter$2.class, "2")) {
          return;
       }
       this.b.P.b();
       return;
    }
}
