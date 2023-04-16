package com.kuaishou.merchant.api.core.model.live.shop.ShopItemMarketingComponentCouponInfo;
import java.io.Serializable;
import vr3.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class ShopItemMarketingComponentCouponInfo extends a implements Serializable	// class@001550
{
    public String mContent;
    public String mPrefix;
    public long mTime;
    public String mTimeSuffix;

    public void ShopItemMarketingComponentCouponInfo(){
       super();
       this.mPrefix = "";
       this.mContent = "";
       this.mTimeSuffix = "";
    }
    public final String getMContent(){
       return this.mContent;
    }
    public final String getMPrefix(){
       return this.mPrefix;
    }
    public final long getMTime(){
       return this.mTime;
    }
    public final String getMTimeSuffix(){
       return this.mTimeSuffix;
    }
    public final void setMContent(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShopItemMarketingComponentCouponInfo.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mContent = p0;
       return;
    }
    public final void setMPrefix(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShopItemMarketingComponentCouponInfo.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mPrefix = p0;
       return;
    }
    public final void setMTime(long p0){
       this.mTime = p0;
    }
    public final void setMTimeSuffix(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShopItemMarketingComponentCouponInfo.class, "3")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mTimeSuffix = p0;
       return;
    }
}
