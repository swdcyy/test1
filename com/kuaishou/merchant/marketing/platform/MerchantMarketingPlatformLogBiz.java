package com.kuaishou.merchant.marketing.platform.MerchantMarketingPlatformLogBiz;
import p74.a;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MerchantMarketingPlatformLogBiz extends Enum implements a	// class@001aff
{
    public final String mBiz;
    public static final MerchantMarketingPlatformLogBiz[] $VALUES;
    public static final MerchantMarketingPlatformLogBiz CHALLENGE_CHEST;
    public static final MerchantMarketingPlatformLogBiz CNY_CHALLENGE;
    public static final MerchantMarketingPlatformLogBiz CNY_SELL_GOODS_CHALLENGE;
    public static final MerchantMarketingPlatformLogBiz COUPON_PENDENT;
    public static final MerchantMarketingPlatformLogBiz FULL_GIVEN;
    public static final MerchantMarketingPlatformLogBiz PLATFORM_FULL_RETURN;
    public static final MerchantMarketingPlatformLogBiz SKY_FALL_COUPON;
    public static final MerchantMarketingPlatformLogBiz TRUST_DARE;
    public static final MerchantMarketingPlatformLogBiz _616OpenBox;

    static {
       MerchantMarketingPlatformLogBiz merchantMark = new MerchantMarketingPlatformLogBiz("COUPON_PENDENT", 0, "MarketingPlatformAndrCouponPendent");
       MerchantMarketingPlatformLogBiz.COUPON_PENDENT = merchantMark;
       MerchantMarketingPlatformLogBiz merchantMark1 = new MerchantMarketingPlatformLogBiz("PLATFORM_FULL_RETURN", 1, "MarketingPlatformAndrFullReturn");
       MerchantMarketingPlatformLogBiz.PLATFORM_FULL_RETURN = merchantMark1;
       MerchantMarketingPlatformLogBiz merchantMark2 = new MerchantMarketingPlatformLogBiz("CHALLENGE_CHEST", 2, "MarketingPlatformAndrChallengeChest");
       MerchantMarketingPlatformLogBiz.CHALLENGE_CHEST = merchantMark2;
       MerchantMarketingPlatformLogBiz merchantMark3 = new MerchantMarketingPlatformLogBiz("_616OpenBox", 3, "MarketingPlatformAndr616OpenBox");
       MerchantMarketingPlatformLogBiz._616OpenBox = merchantMark3;
       MerchantMarketingPlatformLogBiz merchantMark4 = new MerchantMarketingPlatformLogBiz("SKY_FALL_COUPON", 4, "MarketingPlatformAndrSkyFallCoupon");
       MerchantMarketingPlatformLogBiz.SKY_FALL_COUPON = merchantMark4;
       MerchantMarketingPlatformLogBiz merchantMark5 = new MerchantMarketingPlatformLogBiz("FULL_GIVEN", 5, "MarketingPlatformAndrFullGiving");
       MerchantMarketingPlatformLogBiz.FULL_GIVEN = merchantMark5;
       MerchantMarketingPlatformLogBiz merchantMark6 = new MerchantMarketingPlatformLogBiz("CNY_SELL_GOODS_CHALLENGE", 6, "MarketingShopAndrCnySellGoodsChallenge");
       MerchantMarketingPlatformLogBiz.CNY_SELL_GOODS_CHALLENGE = merchantMark6;
       MerchantMarketingPlatformLogBiz merchantMark7 = new MerchantMarketingPlatformLogBiz("TRUST_DARE", 7, "MarketingPlatformAndrTruthOrDare");
       MerchantMarketingPlatformLogBiz.TRUST_DARE = merchantMark7;
       MerchantMarketingPlatformLogBiz merchantMark8 = new MerchantMarketingPlatformLogBiz("CNY_CHALLENGE", 8, "MarketingPlatformAndrCnyChallenge");
       MerchantMarketingPlatformLogBiz.CNY_CHALLENGE = merchantMark8;
       MerchantMarketingPlatformLogBiz[] merchantMark9 = new MerchantMarketingPlatformLogBiz[9];
       merchantMark9[0] = merchantMark;
       merchantMark9[1] = merchantMark1;
       merchantMark9[2] = merchantMark2;
       merchantMark9[3] = merchantMark3;
       merchantMark9[4] = merchantMark4;
       merchantMark9[5] = merchantMark5;
       merchantMark9[6] = merchantMark6;
       merchantMark9[7] = merchantMark7;
       merchantMark9[8] = merchantMark8;
       MerchantMarketingPlatformLogBiz.$VALUES = merchantMark9;
    }
    public void MerchantMarketingPlatformLogBiz(String p0,int p1,String p2){
       super(p0, p1);
       this.mBiz = p2;
    }
    public static MerchantMarketingPlatformLogBiz valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MerchantMarketingPlatformLogBiz.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MerchantMarketingPlatformLogBiz.class, p0);
    }
    public static MerchantMarketingPlatformLogBiz[] values(){
       Object obj = PatchProxy.apply(null, null, MerchantMarketingPlatformLogBiz.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MerchantMarketingPlatformLogBiz.$VALUES.clone();
    }
    public String getBiz(){
       return this.mBiz;
    }
}
