package com.yxcorp.gifshow.model.response.PostStartUpResponse$ShopPromotionInfo;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class PostStartUpResponse$ShopPromotionInfo	// class@001f56
{
    public String shopPromotionUrl;
    public boolean showShopPromotion;

    public void PostStartUpResponse$ShopPromotionInfo(){
       a.p("", "shopPromotionUrl");
       super();
       this.showShopPromotion = false;
       this.shopPromotionUrl = "";
    }
    public final String a(){
       return this.shopPromotionUrl;
    }
    public final boolean b(){
       return this.showShopPromotion;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PostStartUpResponse$ShopPromotionInfo.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof PostStartUpResponse$ShopPromotionInfo && (this.showShopPromotion == p0.showShopPromotion && a.g(this.shopPromotionUrl, p0.shopPromotionUrl)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       int i;
       PostStartUpResponse$ShopPromotionInfo obj = PatchProxy.apply(null, this, PostStartUpResponse$ShopPromotionInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.showShopPromotion;
       if (obj != null) {
          i = 1;
       }
       i = i * 31;
       PostStartUpResponse$ShopPromotionInfo tshopPromoti = this.shopPromotionUrl;
       int i1 = (tshopPromoti != null)? tshopPromoti.hashCode(): 0;
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PostStartUpResponse$ShopPromotionInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ShopPromotionInfo\(showShopPromotion="+this.showShopPromotion+", shopPromotionUrl="+this.shopPromotionUrl+"\)";
    }
}
