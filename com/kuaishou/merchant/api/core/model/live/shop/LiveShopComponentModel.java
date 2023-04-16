package com.kuaishou.merchant.api.core.model.live.shop.LiveShopComponentModel;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import z1.d;
import vr3.a;
import java.util.Map;
import ekd.q;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.merchant.api.core.model.live.shop.ItemMarketingComplexInfo;
import ur3.d;
import com.kuaishou.merchant.api.core.model.live.shop.ShopItemMarketingComponentDynamicText;
import com.kuaishou.merchant.api.core.model.live.shop.ShopItemMarketingComponentCouponInfo;
import com.kuaishou.merchant.api.core.model.live.shop.ShopItemMarketingComponentTextContent;
import com.kuaishou.merchant.api.core.model.live.shop.ShopItemComponentBubble;
import com.kuaishou.merchant.api.core.model.live.shop.ShopItemMarketingComponentRatingBar;
import com.kuaishou.merchant.api.core.model.live.shop.ItemMarketingImageInfo;
import com.kuaishou.merchant.api.core.model.live.shop.ShopItemMarketingComponentTimer;
import com.kuaishou.merchant.api.core.model.live.shop.ShopItemMarketingComponentProgressBarInfo;
import tkd.b;
import tkd.d;
import wr3.b;
import java.lang.Throwable;
import java.lang.Number;
import java.lang.Integer;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;

public class LiveShopComponentModel implements Serializable	// class@0008dc
{
    public int mBusinessType;
    public int mCode;
    public HashMap mPayloadMap;
    public int mRowIndex;
    public HashMap mTraceMap;
    public static final long serialVersionUID = 0xe6ad8c414710a267;

    public void LiveShopComponentModel(){
       super();
       this.mRowIndex = -1;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveShopComponentModel.class, "1");
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
       if (this.mCode != p0.mCode || !d.a(this.mPayloadMap, p0.mPayloadMap)) {
          b = false;
       }
       return b;
    }
    public a getPayload(){
       LiveShopComponentModel obj = PatchProxy.apply(null, this, LiveShopComponentModel.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (q.h(this.mPayloadMap)) {
          return null;
       }
       try{
          obj = this.mCode;
          if (obj != 1001) {
             if (obj != 2001) {
                if (obj != 4001) {
                   if (obj != 4003) {
                      if (obj != 5001) {
                         switch (obj){
                             case 3001:
                               return d.b(a.a.q(this.mPayloadMap), ShopItemMarketingComponentTextContent.class);
                             case 3002:
                               return d.b(a.a.q(this.mPayloadMap), ShopItemMarketingComponentCouponInfo.class);
                             case 3003:
                               return d.b(a.a.q(this.mPayloadMap), ShopItemMarketingComponentDynamicText.class);
                             default:
                               switch (obj){
                                   case 0x2711:
                                   case 0x2713:
                                   case 0x2712:
                                     return d.b(a.a.q(this.mPayloadMap), ItemMarketingComplexInfo.class);
                                   default:
                               }
                         }
                      }else {
                         return d.b(a.a.q(this.mPayloadMap), ShopItemComponentBubble.class);
                      }
                   }else {
                      return d.b(a.a.q(this.mPayloadMap), ShopItemMarketingComponentRatingBar.class);
                   }
                }else {
                   return d.b(a.a.q(this.mPayloadMap), ItemMarketingImageInfo.class);
                }
             }else {
                return d.b(a.a.q(this.mPayloadMap), ShopItemMarketingComponentTimer.class);
             }
          }else {
             return d.b(a.a.q(this.mPayloadMap), ShopItemMarketingComponentProgressBarInfo.class);
          }
       }catch(java.lang.Exception e0){
          d.a(-1122717348).e("LiveShopComponentModel", "getPlayload: ", e0);
       }
       return null;
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, LiveShopComponentModel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{Integer.valueOf(this.mCode),this.mPayloadMap};
       return d.b(obj);
    }
    public void incrementMerge(LiveShopComponentModel p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveShopComponentModel.class, "3")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (!q.h(p0.mPayloadMap)) {
          if (this.mPayloadMap == null) {
             this.mPayloadMap = new HashMap();
          }
          Iterator iterator = p0.mPayloadMap.keySet().iterator();
          while (iterator.hasNext()) {
             String str = iterator.next();
             this.mPayloadMap.put(str, p0.mPayloadMap.get(str));
          }
       }
       return;
    }
}
