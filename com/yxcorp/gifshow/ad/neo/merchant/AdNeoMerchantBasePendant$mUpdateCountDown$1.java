package com.yxcorp.gifshow.ad.neo.merchant.AdNeoMerchantBasePendant$mUpdateCountDown$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.ad.neo.merchant.AdNeoMerchantBasePendant;
import java.lang.Object;
import java.lang.Number;
import java.lang.Boolean;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import com.yxcorp.gifshow.ad.neo.merchant.AdNeoMerchantBasePendant$mUpdateCountDown$1$a;
import java.lang.Runnable;
import ekd.k1;

public final class AdNeoMerchantBasePendant$mUpdateCountDown$1 extends Lambda implements p	// class@00179c
{
    public final AdNeoMerchantBasePendant this$0;

    public void AdNeoMerchantBasePendant$mUpdateCountDown$1(AdNeoMerchantBasePendant p0){
       this.this$0 = p0;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0.longValue(), p1.booleanValue());
       return l1.a;
    }
    public final void invoke(long p0,boolean p1){
       if (PatchProxy.isSupport(AdNeoMerchantBasePendant$mUpdateCountDown$1.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Boolean.valueOf(p1), this, AdNeoMerchantBasePendant$mUpdateCountDown$1.class, "1")) {
          return;
       }
       this.this$0.d(p0, p1);
       k1.p(new AdNeoMerchantBasePendant$mUpdateCountDown$1$a(this, p0, p1), this.this$0);
       return;
    }
}
