package com.kuaishou.merchant.live.cart.onsale.audience.component.NativeComponents;
import java.lang.Enum;
import x34.a;
import com.kuaishou.merchant.live.cart.onsale.audience.model.HeaderAreaInfo;
import java.lang.String;
import java.lang.Class;
import q34.a;
import com.kuaishou.merchant.live.cart.onsale.audience.model.LiveShopBanner;
import u34.a;
import com.kuaishou.merchant.live.cart.onsale.audience.model.CouponPackageInfo;
import w34.a;
import com.kuaishou.merchant.live.cart.onsale.model.FullDeliveryTaskProgress;
import y34.d;
import com.kuaishou.merchant.live.cart.onsale.audience.model.OrderToPayInfo;
import s34.c;
import com.kuaishou.merchant.api.core.model.Commodity;
import s34.b;
import com.kuaishou.merchant.live.cart.onsale.audience.model.GoodsGroupTitleInfo;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class NativeComponents extends Enum	// class@00192d
{
    public final Class componentClass;
    public final String componentType;
    public final Class modelClass;
    public static final NativeComponents[] $VALUES;
    public static final NativeComponents BANNER;
    public static final NativeComponents COMMODITY_GROUP_TITLE;
    public static final NativeComponents COMMODITY_V4;
    public static final NativeComponents COUPON_PACKAGE;
    public static final NativeComponents FULL_GIVING;
    public static final NativeComponents HEADER;
    public static final NativeComponents ORDER_TO_PAY;

    static {
       NativeComponents nativeCompon1;
       NativeComponents[] nativeCompon = new NativeComponents[]{v7,nativeCompon1,nativeCompon1,nativeCompon1,nativeCompon1,nativeCompon1,nativeCompon1};
       nativeCompon1 = new NativeComponents("HEADER", 0, "live_cart_header", a.class, HeaderAreaInfo.class);
       NativeComponents.HEADER = v7;
       NativeComponents nativeCompon2 = new NativeComponents("BANNER", 1, "live_cart_banner", a.class, LiveShopBanner.class);
       NativeComponents.BANNER = nativeCompon1;
       NativeComponents nativeCompon3 = new NativeComponents("COUPON_PACKAGE", 2, "live_cart_coupon_package", a.class, CouponPackageInfo.class);
       NativeComponents.COUPON_PACKAGE = nativeCompon1;
       nativeCompon3 = new NativeComponents("FULL_GIVING", 3, "live_cart_full_giving", a.class, FullDeliveryTaskProgress.class);
       NativeComponents.FULL_GIVING = nativeCompon1;
       nativeCompon3 = new NativeComponents("ORDER_TO_PAY", 4, "live_cart_order_pay", d.class, OrderToPayInfo.class);
       NativeComponents.ORDER_TO_PAY = nativeCompon1;
       nativeCompon3 = new NativeComponents("COMMODITY_V4", 5, "live_cart_commodity_v4", c.class, Commodity.class);
       NativeComponents.COMMODITY_V4 = nativeCompon1;
       nativeCompon3 = new NativeComponents("COMMODITY_GROUP_TITLE", 6, "live_cart_commodity_group_title", b.class, GoodsGroupTitleInfo.class);
       NativeComponents.COMMODITY_GROUP_TITLE = nativeCompon1;
       NativeComponents.$VALUES = nativeCompon;
    }
    public void NativeComponents(String p0,int p1,String p2,Class p3,Class p4){
       super(p0, p1);
       this.componentType = p2;
       this.componentClass = p3;
       this.modelClass = p4;
    }
    public static NativeComponents valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, NativeComponents.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(NativeComponents.class, p0);
    }
    public static NativeComponents[] values(){
       Object obj = PatchProxy.apply(null, null, NativeComponents.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return NativeComponents.$VALUES.clone();
    }
    public final Class getComponentClass(){
       return this.componentClass;
    }
    public final String getComponentType(){
       return this.componentType;
    }
    public final Class getModelClass(){
       return this.modelClass;
    }
}
