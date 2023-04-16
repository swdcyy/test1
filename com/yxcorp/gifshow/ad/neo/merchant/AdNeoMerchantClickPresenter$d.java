package com.yxcorp.gifshow.ad.neo.merchant.AdNeoMerchantClickPresenter$d;
import erd.g;
import com.yxcorp.gifshow.ad.neo.merchant.AdNeoMerchantClickPresenter;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yx.j0;

public final class AdNeoMerchantClickPresenter$d implements g	// class@0017a1
{
    public final AdNeoMerchantClickPresenter b;

    public void AdNeoMerchantClickPresenter$d(AdNeoMerchantClickPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdNeoMerchantClickPresenter$d.class, "1")) {
       }else {
          j0.b("AdNeoMerchantClick", "count down error", p0);
          p0.p = -1;
       }
       return;
    }
}
