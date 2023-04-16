package com.kuaishou.merchant.live.cart.MerchantCartLogBiz;
import p74.a;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MerchantCartLogBiz extends Enum implements a	// class@0018f4
{
    public final String mBiz;
    public static final MerchantCartLogBiz[] $VALUES;
    public static final MerchantCartLogBiz CART_BARRAGE;
    public static final MerchantCartLogBiz CART_RN;
    public static final MerchantCartLogBiz CART_SEARCH;
    public static final MerchantCartLogBiz CART_WELFARE;
    public static final MerchantCartLogBiz LIVE_ANCHOR_ON_SALE;
    public static final MerchantCartLogBiz LIVE_AUDIENCE_ON_SALE;
    public static final MerchantCartLogBiz LIVE_INTERPRETATION;
    public static final MerchantCartLogBiz LIVE_SALE_MANAGER;
    public static final MerchantCartLogBiz LIVE_SHOP_PRELOAD;
    public static final MerchantCartLogBiz SHOP_LIST_COUPON;
    public static final MerchantCartLogBiz SKY_FALL_COUPON;

    static {
       MerchantCartLogBiz merchantCart = new MerchantCartLogBiz("LIVE_AUDIENCE_ON_SALE", 0, "LiveAudienceOnSale");
       MerchantCartLogBiz.LIVE_AUDIENCE_ON_SALE = merchantCart;
       MerchantCartLogBiz merchantCart1 = new MerchantCartLogBiz("LIVE_ANCHOR_ON_SALE", 1, "LiveAnchorOnSale");
       MerchantCartLogBiz.LIVE_ANCHOR_ON_SALE = merchantCart1;
       MerchantCartLogBiz merchantCart2 = new MerchantCartLogBiz("LIVE_INTERPRETATION", 2, "LiveInterpretation");
       MerchantCartLogBiz.LIVE_INTERPRETATION = merchantCart2;
       MerchantCartLogBiz merchantCart3 = new MerchantCartLogBiz("LIVE_SALE_MANAGER", 3, "LiveSaleManager");
       MerchantCartLogBiz.LIVE_SALE_MANAGER = merchantCart3;
       MerchantCartLogBiz merchantCart4 = new MerchantCartLogBiz("SHOP_LIST_COUPON", 4, "LiveShopListCoupon");
       MerchantCartLogBiz.SHOP_LIST_COUPON = merchantCart4;
       MerchantCartLogBiz merchantCart5 = new MerchantCartLogBiz("SKY_FALL_COUPON", 5, "LiveSkyFallCoupon");
       MerchantCartLogBiz.SKY_FALL_COUPON = merchantCart5;
       MerchantCartLogBiz merchantCart6 = new MerchantCartLogBiz("LIVE_SHOP_PRELOAD", 6, "LiveShopPreload");
       MerchantCartLogBiz.LIVE_SHOP_PRELOAD = merchantCart6;
       MerchantCartLogBiz merchantCart7 = new MerchantCartLogBiz("CART_WELFARE", 7, "LiveCartWelfare");
       MerchantCartLogBiz.CART_WELFARE = merchantCart7;
       MerchantCartLogBiz merchantCart8 = new MerchantCartLogBiz("CART_RN", 8, "LiveCartRN");
       MerchantCartLogBiz.CART_RN = merchantCart8;
       MerchantCartLogBiz merchantCart9 = new MerchantCartLogBiz("CART_SEARCH", 9, "LiveCartSearch");
       MerchantCartLogBiz.CART_SEARCH = merchantCart9;
       MerchantCartLogBiz merchantCart10 = new MerchantCartLogBiz("CART_BARRAGE", 10, "LiveCartBarrage");
       MerchantCartLogBiz.CART_BARRAGE = merchantCart10;
       MerchantCartLogBiz[] merchantCart11 = new MerchantCartLogBiz[11];
       merchantCart11[0] = merchantCart;
       merchantCart11[1] = merchantCart1;
       merchantCart11[2] = merchantCart2;
       merchantCart11[3] = merchantCart3;
       merchantCart11[4] = merchantCart4;
       merchantCart11[5] = merchantCart5;
       merchantCart11[6] = merchantCart6;
       merchantCart11[7] = merchantCart7;
       merchantCart11[8] = merchantCart8;
       merchantCart11[9] = merchantCart9;
       merchantCart11[10] = merchantCart10;
       MerchantCartLogBiz.$VALUES = merchantCart11;
    }
    public void MerchantCartLogBiz(String p0,int p1,String p2){
       super(p0, p1);
       this.mBiz = p2;
    }
    public static MerchantCartLogBiz valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MerchantCartLogBiz.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MerchantCartLogBiz.class, p0);
    }
    public static MerchantCartLogBiz[] values(){
       Object obj = PatchProxy.apply(null, null, MerchantCartLogBiz.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MerchantCartLogBiz.$VALUES.clone();
    }
    public String getBiz(){
       return this.mBiz;
    }
}
