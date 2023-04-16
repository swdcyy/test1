package com.kuaishou.merchant.bowl.MerchantSuperBowlLogBiz;
import p74.a;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MerchantSuperBowlLogBiz extends Enum implements a	// class@001608
{
    public final String mBiz;
    public static final MerchantSuperBowlLogBiz[] $VALUES;
    public static final MerchantSuperBowlLogBiz SuperBowl;

    static {
       MerchantSuperBowlLogBiz merchantSupe = new MerchantSuperBowlLogBiz("SuperBowl", 0, "SuperBowl");
       MerchantSuperBowlLogBiz.SuperBowl = merchantSupe;
       MerchantSuperBowlLogBiz[] merchantSupe1 = new MerchantSuperBowlLogBiz[]{merchantSupe};
       MerchantSuperBowlLogBiz.$VALUES = merchantSupe1;
    }
    public void MerchantSuperBowlLogBiz(String p0,int p1,String p2){
       super(p0, p1);
       this.mBiz = p2;
    }
    public static MerchantSuperBowlLogBiz valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MerchantSuperBowlLogBiz.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MerchantSuperBowlLogBiz.class, p0);
    }
    public static MerchantSuperBowlLogBiz[] values(){
       Object obj = PatchProxy.apply(null, null, MerchantSuperBowlLogBiz.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MerchantSuperBowlLogBiz.$VALUES.clone();
    }
    public String getBiz(){
       return this.mBiz;
    }
}
