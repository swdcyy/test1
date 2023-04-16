package com.yxcorp.gifshow.ad.neo.merchant.AdNeoMerchantBasePendant$mLifecycleObserver$1;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gifshow.ad.neo.merchant.AdNeoMerchantBasePendant;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import wkd.b;
import ql9.f;

public final class AdNeoMerchantBasePendant$mLifecycleObserver$1 implements LifecycleObserver	// class@001794
{
    public final AdNeoMerchantBasePendant b;

    public void AdNeoMerchantBasePendant$mLifecycleObserver$1(AdNeoMerchantBasePendant p0){
       this.b = p0;
       super();
    }
    public final void onPause(){
       if (PatchProxy.applyVoid(null, this, AdNeoMerchantBasePendant$mLifecycleObserver$1.class, "2")) {
          return;
       }
       AdNeoMerchantBasePendant$mLifecycleObserver$1 tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, AdNeoMerchantBasePendant.class, "3")) {
          b.a(-618875779).e();
       }
       return;
    }
    public final void onResume(){
       if (PatchProxy.applyVoid(null, this, AdNeoMerchantBasePendant$mLifecycleObserver$1.class, "1")) {
          return;
       }
       AdNeoMerchantBasePendant$mLifecycleObserver$1 tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, AdNeoMerchantBasePendant.class, "2")) {
          b.a(-618875779).i();
       }
       return;
    }
}
