package com.yxcorp.gifshow.ad.neo.merchant.AdNeoMerchantClickPresenter$c;
import erd.g;
import com.yxcorp.gifshow.ad.neo.merchant.AdNeoMerchantClickPresenter;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import yx.j0;
import crd.b;
import lnc.b9;
import wkd.b;
import ql9.f;

public final class AdNeoMerchantClickPresenter$c implements g	// class@0017a0
{
    public final AdNeoMerchantClickPresenter b;

    public void AdNeoMerchantClickPresenter$c(AdNeoMerchantClickPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdNeoMerchantClickPresenter$c.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.p = p0.longValue();
          if (this.b.p <= 0) {
             p0 = new Object[0];
             j0.f("AdNeoMerchantClick", "countdown end", p0);
             b9.a(this.b.r);
             p0 = b.a(-618875779);
             AdNeoMerchantClickPresenter q = this.b.q;
             if (q == null) {
                q = "";
             }
             p0.c(q);
          }
       }
       return;
    }
}
