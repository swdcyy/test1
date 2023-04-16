package com.kuaishou.merchant.marketing.shop.MerchantMarketingShopLogBiz;
import p74.a;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MerchantMarketingShopLogBiz extends Enum implements a	// class@001b78
{
    public final String mBiz;
    public static final MerchantMarketingShopLogBiz[] $VALUES;
    public static final MerchantMarketingShopLogBiz AUCTION;
    public static final MerchantMarketingShopLogBiz FISSION_COUPON;
    public static final MerchantMarketingShopLogBiz GINSENG_FRUIT;
    public static final MerchantMarketingShopLogBiz GOOD_LUCK;
    public static final MerchantMarketingShopLogBiz LIVE_MERCHANT_TIME_DISCOUNT;
    public static final MerchantMarketingShopLogBiz NEW_FAN_COUPON;
    public static final MerchantMarketingShopLogBiz SHARE_RED_PACKAGE;
    public static final MerchantMarketingShopLogBiz WELFARE_PURCHASE;

    static {
       MerchantMarketingShopLogBiz merchantMark = new MerchantMarketingShopLogBiz("LIVE_MERCHANT_TIME_DISCOUNT", 0, "MarketingShopAndrTimeDiscount");
       MerchantMarketingShopLogBiz.LIVE_MERCHANT_TIME_DISCOUNT = merchantMark;
       MerchantMarketingShopLogBiz merchantMark1 = new MerchantMarketingShopLogBiz("SHARE_RED_PACKAGE", 1, "MarketingShopAndrShareRedPackage");
       MerchantMarketingShopLogBiz.SHARE_RED_PACKAGE = merchantMark1;
       MerchantMarketingShopLogBiz merchantMark2 = new MerchantMarketingShopLogBiz("NEW_FAN_COUPON", 2, "MarketingShopAndrNewFanCoupon");
       MerchantMarketingShopLogBiz.NEW_FAN_COUPON = merchantMark2;
       MerchantMarketingShopLogBiz merchantMark3 = new MerchantMarketingShopLogBiz("WELFARE_PURCHASE", 3, "MarketingShopAndrWelfarePurchase");
       MerchantMarketingShopLogBiz.WELFARE_PURCHASE = merchantMark3;
       MerchantMarketingShopLogBiz merchantMark4 = new MerchantMarketingShopLogBiz("GOOD_LUCK", 4, "MarketingShopAndrGoodLuck");
       MerchantMarketingShopLogBiz.GOOD_LUCK = merchantMark4;
       MerchantMarketingShopLogBiz merchantMark5 = new MerchantMarketingShopLogBiz("FISSION_COUPON", 5, "MarketingShopAndrFissionCoupon");
       MerchantMarketingShopLogBiz.FISSION_COUPON = merchantMark5;
       MerchantMarketingShopLogBiz merchantMark6 = new MerchantMarketingShopLogBiz("GINSENG_FRUIT", 6, "MarketingShopAndrGinsengFruit");
       MerchantMarketingShopLogBiz.GINSENG_FRUIT = merchantMark6;
       MerchantMarketingShopLogBiz merchantMark7 = new MerchantMarketingShopLogBiz("AUCTION", 7, "MarketingShopAndrAuction");
       MerchantMarketingShopLogBiz.AUCTION = merchantMark7;
       MerchantMarketingShopLogBiz[] merchantMark8 = new MerchantMarketingShopLogBiz[]{merchantMark,merchantMark1,merchantMark2,merchantMark3,merchantMark4,merchantMark5,merchantMark6,merchantMark7};
       MerchantMarketingShopLogBiz.$VALUES = merchantMark8;
    }
    public void MerchantMarketingShopLogBiz(String p0,int p1,String p2){
       super(p0, p1);
       this.mBiz = p2;
    }
    public static MerchantMarketingShopLogBiz valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MerchantMarketingShopLogBiz.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MerchantMarketingShopLogBiz.class, p0);
    }
    public static MerchantMarketingShopLogBiz[] values(){
       Object obj = PatchProxy.apply(null, null, MerchantMarketingShopLogBiz.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MerchantMarketingShopLogBiz.$VALUES.clone();
    }
    public String getBiz(){
       return this.mBiz;
    }
}
