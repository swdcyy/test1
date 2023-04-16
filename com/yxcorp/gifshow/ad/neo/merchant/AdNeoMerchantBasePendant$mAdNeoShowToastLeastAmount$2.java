package com.yxcorp.gifshow.ad.neo.merchant.AdNeoMerchantBasePendant$mAdNeoShowToastLeastAmount$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.framework.abtest.f;
import java.lang.Integer;

public final class AdNeoMerchantBasePendant$mAdNeoShowToastLeastAmount$2 extends Lambda implements a	// class@001793
{
    public static final AdNeoMerchantBasePendant$mAdNeoShowToastLeastAmount$2 INSTANCE;

    static {
       AdNeoMerchantBasePendant$mAdNeoShowToastLeastAmount$2.INSTANCE = new AdNeoMerchantBasePendant$mAdNeoShowToastLeastAmount$2();
    }
    public void AdNeoMerchantBasePendant$mAdNeoShowToastLeastAmount$2(){
       super(0);
    }
    public final int invoke(){
       Object obj = PatchProxy.apply(null, this, AdNeoMerchantBasePendant$mAdNeoShowToastLeastAmount$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return f.f("adNeoShowToastLeastAmount", 70);
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
