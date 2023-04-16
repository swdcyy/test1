package com.yxcorp.gifshow.ad.neo.merchant.AdNeoMerchantClickPresenter$mLifecycleObserver$1;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gifshow.ad.neo.merchant.AdNeoMerchantClickPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import lnc.b9;

public final class AdNeoMerchantClickPresenter$mLifecycleObserver$1 implements LifecycleObserver	// class@0017a2
{
    public final AdNeoMerchantClickPresenter b;

    public void AdNeoMerchantClickPresenter$mLifecycleObserver$1(AdNeoMerchantClickPresenter p0){
       this.b = p0;
       super();
    }
    public final void onPause(){
       if (PatchProxy.applyVoid(null, this, AdNeoMerchantClickPresenter$mLifecycleObserver$1.class, "2")) {
          return;
       }
       b9.a(this.b.r);
       return;
    }
    public final void onResume(){
       if (PatchProxy.applyVoid(null, this, AdNeoMerchantClickPresenter$mLifecycleObserver$1.class, "1")) {
          return;
       }
       AdNeoMerchantClickPresenter$mLifecycleObserver$1 tb = this.b;
       if (tb.s != null) {
          tb.P8();
       }
       return;
    }
}
