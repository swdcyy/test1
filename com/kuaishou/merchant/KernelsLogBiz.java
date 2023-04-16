package com.kuaishou.merchant.KernelsLogBiz;
import p74.a;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KernelsLogBiz extends Enum implements a	// class@0014c4
{
    public final String mBiz;
    public static final KernelsLogBiz[] $VALUES;
    public static final KernelsLogBiz LIVE_MERCHANT_PAYMENT;
    public static final KernelsLogBiz LIVE_SKIN;
    public static final KernelsLogBiz MERCHANT_INIT_MODULE;
    public static final KernelsLogBiz RATING;
    public static final KernelsLogBiz RN_HALF;
    public static final KernelsLogBiz ROUTER;

    static {
       KernelsLogBiz kernelsLogBi = new KernelsLogBiz("RATING", 0, "KernelsRating");
       KernelsLogBiz.RATING = kernelsLogBi;
       KernelsLogBiz kernelsLogBi1 = new KernelsLogBiz("RN_HALF", 1, "KernelsRNHalf");
       KernelsLogBiz.RN_HALF = kernelsLogBi1;
       KernelsLogBiz kernelsLogBi2 = new KernelsLogBiz("LIVE_SKIN", 2, "LiveSkin");
       KernelsLogBiz.LIVE_SKIN = kernelsLogBi2;
       KernelsLogBiz kernelsLogBi3 = new KernelsLogBiz("ROUTER", 3, "MerchantRouter");
       KernelsLogBiz.ROUTER = kernelsLogBi3;
       KernelsLogBiz kernelsLogBi4 = new KernelsLogBiz("MERCHANT_INIT_MODULE", 4, "MerchantInitModule");
       KernelsLogBiz.MERCHANT_INIT_MODULE = kernelsLogBi4;
       KernelsLogBiz kernelsLogBi5 = new KernelsLogBiz("LIVE_MERCHANT_PAYMENT", 5, "TransactionPayment");
       KernelsLogBiz.LIVE_MERCHANT_PAYMENT = kernelsLogBi5;
       KernelsLogBiz[] kernelsLogBi6 = new KernelsLogBiz[]{kernelsLogBi,kernelsLogBi1,kernelsLogBi2,kernelsLogBi3,kernelsLogBi4,kernelsLogBi5};
       KernelsLogBiz.$VALUES = kernelsLogBi6;
    }
    public void KernelsLogBiz(String p0,int p1,String p2){
       super(p0, p1);
       this.mBiz = p2;
    }
    public static KernelsLogBiz valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KernelsLogBiz.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KernelsLogBiz.class, p0);
    }
    public static KernelsLogBiz[] values(){
       Object obj = PatchProxy.apply(null, null, KernelsLogBiz.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KernelsLogBiz.$VALUES.clone();
    }
    public String getBiz(){
       return this.mBiz;
    }
}
