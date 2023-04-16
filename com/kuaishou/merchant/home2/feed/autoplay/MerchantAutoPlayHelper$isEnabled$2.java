package com.kuaishou.merchant.home2.feed.autoplay.MerchantAutoPlayHelper$isEnabled$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.SystemUtil;

public final class MerchantAutoPlayHelper$isEnabled$2 extends Lambda implements a	// class@001785
{
    public static final MerchantAutoPlayHelper$isEnabled$2 INSTANCE;

    static {
       MerchantAutoPlayHelper$isEnabled$2.INSTANCE = new MerchantAutoPlayHelper$isEnabled$2();
    }
    public void MerchantAutoPlayHelper$isEnabled$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, MerchantAutoPlayHelper$isEnabled$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return SystemUtil.a(21);
    }
}
