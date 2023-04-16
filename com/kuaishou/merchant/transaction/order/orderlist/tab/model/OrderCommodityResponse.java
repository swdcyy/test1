package com.kuaishou.merchant.transaction.order.orderlist.tab.model.OrderCommodityResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import la6.a;
import java.lang.CharSequence;
import android.text.TextUtils;

public class OrderCommodityResponse implements Serializable	// class@0008d3
{
    public String mCursor;
    public int mDisplayType;
    public boolean mEnableFetchOrderList;
    public List mOrderTabInfos;
    public String mPageUrl;
    public int mTab;
    public String mTitle;
    public JsonElement mTopBannerJsonelement;
    public String mUnreadInfo;
    public String orderListTransparentParam;
    public static final long serialVersionUID = 0x65244561f17efeca;

    public void OrderCommodityResponse(){
       super();
       this.mEnableFetchOrderList = true;
    }
    public static OrderCommodityResponse of(String p0,int p1,String p2){
       OrderCommodityResponse obj;
       if (PatchProxy.isSupport(OrderCommodityResponse.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, null, OrderCommodityResponse.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new OrderCommodityResponse();
       obj.mTitle = p0;
       obj.mTab = p1;
       obj.mPageUrl = p2;
       obj.mEnableFetchOrderList = false;
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, OrderCommodityResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || this.getClass() != p0.getClass()) {
          return false;
       }
       if (this.mTab != p0.mTab) {
          b = false;
       }
       return b;
    }
    public JsonObject getTopBannerJsonObj(){
       OrderCommodityResponse obj = PatchProxy.apply(null, this, OrderCommodityResponse.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mTopBannerJsonelement;
       if (obj != null && (!obj.D() && this.mTopBannerJsonelement.E())) {
          return this.mTopBannerJsonelement.r();
       }
       return null;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, OrderCommodityResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
    public boolean isSameOrderTab(OrderCommodityResponse p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, OrderCommodityResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (TextUtils.equals(this.mTitle, p0.mTitle) && (TextUtils.equals(this.mPageUrl, p0.mPageUrl) && this.mTab == p0.mTab))? true: false;
       return b;
    }
}
