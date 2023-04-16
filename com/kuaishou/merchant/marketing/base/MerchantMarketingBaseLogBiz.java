package com.kuaishou.merchant.marketing.base.MerchantMarketingBaseLogBiz;
import p74.a;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MerchantMarketingBaseLogBiz extends Enum implements a	// class@001ae4
{
    public final String mBiz;
    public static final MerchantMarketingBaseLogBiz[] $VALUES;
    public static final MerchantMarketingBaseLogBiz ACTIVITY_DISPATCHER;
    public static final MerchantMarketingBaseLogBiz DEBUG;
    public static final MerchantMarketingBaseLogBiz MARKETING_BUBBLE;
    public static final MerchantMarketingBaseLogBiz MARKETING_LOTTIE_CACHE;
    public static final MerchantMarketingBaseLogBiz TOP_RIGHT_PENDANT_ANIMATE;

    static {
       MerchantMarketingBaseLogBiz merchantMark = new MerchantMarketingBaseLogBiz("DEBUG", 0, "MarketingBaseAndrDebug");
       MerchantMarketingBaseLogBiz.DEBUG = merchantMark;
       MerchantMarketingBaseLogBiz merchantMark1 = new MerchantMarketingBaseLogBiz("ACTIVITY_DISPATCHER", 1, "MarketingBaseAndrActivityDispatcher");
       MerchantMarketingBaseLogBiz.ACTIVITY_DISPATCHER = merchantMark1;
       MerchantMarketingBaseLogBiz merchantMark2 = new MerchantMarketingBaseLogBiz("TOP_RIGHT_PENDANT_ANIMATE", 2, "MarketingBaseAndrTopRightAnimate");
       MerchantMarketingBaseLogBiz.TOP_RIGHT_PENDANT_ANIMATE = merchantMark2;
       MerchantMarketingBaseLogBiz merchantMark3 = new MerchantMarketingBaseLogBiz("MARKETING_BUBBLE", 3, "MarketingBaseAndrAnchorBubble");
       MerchantMarketingBaseLogBiz.MARKETING_BUBBLE = merchantMark3;
       MerchantMarketingBaseLogBiz merchantMark4 = new MerchantMarketingBaseLogBiz("MARKETING_LOTTIE_CACHE", 4, "MarketingBaseAndrLottieCache");
       MerchantMarketingBaseLogBiz.MARKETING_LOTTIE_CACHE = merchantMark4;
       MerchantMarketingBaseLogBiz[] merchantMark5 = new MerchantMarketingBaseLogBiz[]{merchantMark,merchantMark1,merchantMark2,merchantMark3,merchantMark4};
       MerchantMarketingBaseLogBiz.$VALUES = merchantMark5;
    }
    public void MerchantMarketingBaseLogBiz(String p0,int p1,String p2){
       super(p0, p1);
       this.mBiz = p2;
    }
    public static MerchantMarketingBaseLogBiz valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MerchantMarketingBaseLogBiz.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MerchantMarketingBaseLogBiz.class, p0);
    }
    public static MerchantMarketingBaseLogBiz[] values(){
       Object obj = PatchProxy.apply(null, null, MerchantMarketingBaseLogBiz.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MerchantMarketingBaseLogBiz.$VALUES.clone();
    }
    public String getBiz(){
       return this.mBiz;
    }
}
