package com.kuaishou.merchant.live.cart.onsale.audience.ultron.component.CartNativeComponents;
import java.lang.Enum;
import ho4.o;
import java.lang.String;
import java.lang.Class;
import ho4.h;
import ho4.g;
import ho4.a;
import q44.a;
import com.kuaishou.merchant.live.cart.onsale.audience.model.HeaderAreaInfo;
import k44.a;
import com.kuaishou.merchant.live.cart.onsale.audience.model.LiveShopBanner;
import o44.a;
import com.kuaishou.merchant.live.cart.onsale.model.FullDeliveryTaskProgress;
import s44.a;
import com.kuaishou.merchant.live.cart.onsale.audience.model.OrderToPayInfo;
import m44.b;
import com.kuaishou.merchant.api.core.model.Commodity;
import p44.a;
import com.kuaishou.merchant.live.cart.onsale.audience.model.GoodsGroupTitleInfo;
import t44.e;
import u44.a;
import n44.b;
import n44.a;
import r44.c;
import r44.a;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class CartNativeComponents extends Enum	// class@00198a
{
    public final Class componentClass;
    public final String componentName;
    public final Class modelClass;
    public static final CartNativeComponents[] $VALUES;
    public static final CartNativeComponents BANNER;
    public static final CartNativeComponents COMMODITY_GROUP_TITLE;
    public static final CartNativeComponents COMMODITY_V4;
    public static final CartNativeComponents DIVIDER;
    public static final CartNativeComponents FULL_GIVING;
    public static final CartNativeComponents HEADER;
    public static final CartNativeComponents LIMIT_LIST;
    public static final CartNativeComponents LIST;
    public static final CartNativeComponents MULTI_TAB;
    public static final CartNativeComponents NO_MORE;
    public static final CartNativeComponents ORDER_TO_PAY;
    public static final CartNativeComponents PAGE_COMPONENT;
    public static final CartNativeComponents TAB_BAR;

    static {
       CartNativeComponents[] uCartNativeC = new CartNativeComponents[13];
       CartNativeComponents uCartNativeC1 = new CartNativeComponents("LIMIT_LIST", 0, "list_limit_component", o.class, null);
       CartNativeComponents.LIMIT_LIST = v7;
       uCartNativeC[0] = v7;
       CartNativeComponents uCartNativeC2 = new CartNativeComponents("LIST", 1, "list_component", h.class, null);
       CartNativeComponents.LIST = uCartNativeC1;
       uCartNativeC[1] = uCartNativeC1;
       CartNativeComponents uCartNativeC3 = new CartNativeComponents("MULTI_TAB", 2, "channel_component", g.class, null);
       CartNativeComponents.MULTI_TAB = uCartNativeC1;
       uCartNativeC[2] = uCartNativeC1;
       uCartNativeC3 = new CartNativeComponents("PAGE_COMPONENT", 3, "page_component", a.class, null);
       CartNativeComponents.PAGE_COMPONENT = uCartNativeC1;
       uCartNativeC[3] = uCartNativeC1;
       uCartNativeC3 = new CartNativeComponents("HEADER", 4, "live_cart_ultron_header", a.class, HeaderAreaInfo.class);
       CartNativeComponents.HEADER = uCartNativeC1;
       uCartNativeC[4] = uCartNativeC1;
       uCartNativeC3 = new CartNativeComponents("BANNER", 5, "live_cart_ultron_banner", a.class, LiveShopBanner.class);
       CartNativeComponents.BANNER = uCartNativeC1;
       uCartNativeC[5] = uCartNativeC1;
       uCartNativeC3 = new CartNativeComponents("FULL_GIVING", 6, "live_cart_ultron_full_giving", a.class, FullDeliveryTaskProgress.class);
       CartNativeComponents.FULL_GIVING = uCartNativeC1;
       uCartNativeC[6] = uCartNativeC1;
       uCartNativeC3 = new CartNativeComponents("ORDER_TO_PAY", 7, "live_cart_ultron_order_pay", a.class, OrderToPayInfo.class);
       CartNativeComponents.ORDER_TO_PAY = uCartNativeC1;
       uCartNativeC[7] = uCartNativeC1;
       uCartNativeC3 = new CartNativeComponents("COMMODITY_V4", 8, "live_cart_ultron_commodity_v4", b.class, Commodity.class);
       CartNativeComponents.COMMODITY_V4 = uCartNativeC1;
       uCartNativeC[8] = uCartNativeC1;
       uCartNativeC3 = new CartNativeComponents("COMMODITY_GROUP_TITLE", 9, "live_cart_ultron_commodity_group_title", a.class, GoodsGroupTitleInfo.class);
       CartNativeComponents.COMMODITY_GROUP_TITLE = uCartNativeC1;
       uCartNativeC[9] = uCartNativeC1;
       uCartNativeC3 = new CartNativeComponents("TAB_BAR", 10, "live_cart_ultron_tab_bar", e.class, a.class);
       CartNativeComponents.TAB_BAR = uCartNativeC1;
       uCartNativeC[10] = uCartNativeC1;
       uCartNativeC3 = new CartNativeComponents("DIVIDER", 11, "live_cart_ultron_divider", b.class, a.class);
       CartNativeComponents.DIVIDER = uCartNativeC1;
       uCartNativeC[11] = uCartNativeC1;
       uCartNativeC3 = new CartNativeComponents("NO_MORE", 12, "live_cart_ultron_list_end", c.class, a.class);
       CartNativeComponents.NO_MORE = uCartNativeC1;
       uCartNativeC[12] = uCartNativeC1;
       CartNativeComponents.$VALUES = uCartNativeC;
    }
    public void CartNativeComponents(String p0,int p1,String p2,Class p3,Class p4){
       super(p0, p1);
       this.componentName = p2;
       this.componentClass = p3;
       this.modelClass = p4;
    }
    public static CartNativeComponents valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CartNativeComponents.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(CartNativeComponents.class, p0);
    }
    public static CartNativeComponents[] values(){
       Object obj = PatchProxy.apply(null, null, CartNativeComponents.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CartNativeComponents.$VALUES.clone();
    }
    public final Class getComponentClass(){
       return this.componentClass;
    }
    public final String getComponentName(){
       return this.componentName;
    }
    public final Class getModelClass(){
       return this.modelClass;
    }
}
