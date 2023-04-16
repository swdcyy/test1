package com.kuaishou.live.merchant.LiveMerchantLogTag;
import pp.c;
import java.lang.Enum;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.kuaishou.android.live.log.a;

public final class LiveMerchantLogTag extends Enum implements c	// class@000c96
{
    public final String mName;
    public static final LiveMerchantLogTag[] $VALUES;
    public static final LiveMerchantLogTag COMMON;
    public static final LiveMerchantLogTag CUSTOMER_SERVICE;
    public static final LiveMerchantLogTag FORBIDDEN;
    public static final LiveMerchantLogTag MAGIC;
    public static final LiveMerchantLogTag PROFILE;

    static {
       LiveMerchantLogTag liveMerchant = new LiveMerchantLogTag("CUSTOMER_SERVICE", 0, "CustomerService");
       LiveMerchantLogTag.CUSTOMER_SERVICE = liveMerchant;
       LiveMerchantLogTag liveMerchant1 = new LiveMerchantLogTag("MAGIC", 1, "MagicEffect");
       LiveMerchantLogTag.MAGIC = liveMerchant1;
       LiveMerchantLogTag liveMerchant2 = new LiveMerchantLogTag("COMMON", 2, "Common");
       LiveMerchantLogTag.COMMON = liveMerchant2;
       LiveMerchantLogTag liveMerchant3 = new LiveMerchantLogTag("FORBIDDEN", 3, "Forbidden");
       LiveMerchantLogTag.FORBIDDEN = liveMerchant3;
       LiveMerchantLogTag liveMerchant4 = new LiveMerchantLogTag("PROFILE", 4, "Profile");
       LiveMerchantLogTag.PROFILE = liveMerchant4;
       LiveMerchantLogTag[] liveMerchant5 = new LiveMerchantLogTag[]{liveMerchant,liveMerchant1,liveMerchant2,liveMerchant3,liveMerchant4};
       LiveMerchantLogTag.$VALUES = liveMerchant5;
    }
    public void LiveMerchantLogTag(String p0,int p1,String p2){
       super(p0, p1);
       this.mName = "MerchantLive"+p2;
    }
    public static LiveMerchantLogTag valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveMerchantLogTag.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveMerchantLogTag.class, p0);
    }
    public static LiveMerchantLogTag[] values(){
       Object obj = PatchProxy.apply(null, null, LiveMerchantLogTag.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveMerchantLogTag.$VALUES.clone();
    }
    public List appendTag(String p0){
       return a.a(this, p0);
    }
    public String getName(){
       return this.mName;
    }
}
