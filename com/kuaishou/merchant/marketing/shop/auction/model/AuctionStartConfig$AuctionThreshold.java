package com.kuaishou.merchant.marketing.shop.auction.model.AuctionStartConfig$AuctionThreshold;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.merchant.marketing.shop.auction.model.AuctionStartConfig$AuctionThreshold$MarginExtendInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.merchant.marketing.shop.MerchantMarketingShopLogBiz;
import p74.a;
import java.lang.Throwable;
import o74.a;
import java.lang.Number;
import com.kuaishou.merchant.marketing.shop.auction.model.AuctionStartConfig$AuctionThreshold$MarginSetting;
import com.kuaishou.merchant.marketing.shop.auction.start.AuctionPublish;
import java.util.Collection;
import ekd.q;
import java.lang.Integer;
import z1.d;
import java.lang.StringBuilder;

public class AuctionStartConfig$AuctionThreshold implements Serializable	// class@001ba9
{
    public AuctionStartConfig$AuctionThreshold$MarginExtendInfo b;
    public String extendInfo;
    public AuctionStartConfig$AuctionThreshold$MarginSetting mMarginSetting;
    public String mName;
    public String mOptionTitle;
    public List mOptions;
    public String mPlaceholder;
    public int mSelectOptionPosition;
    public AuctionStartConfig$ThresholdOption mSelectedOption;
    public int mType;
    public static final long serialVersionUID = 0xc28320e3354868f;

    public void AuctionStartConfig$AuctionThreshold(){
       super();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AuctionStartConfig$AuctionThreshold.class, "8");
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
       if (this.mType != p0.mType) {
          b = false;
       }
       return b;
    }
    public AuctionStartConfig$AuctionThreshold$MarginExtendInfo getMarginExtendInfo(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, AuctionStartConfig$AuctionThreshold.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mType != 4 || TextUtils.x(this.extendInfo)) {
          return objArray;
       }
       if (this.b == null) {
          try{
             this.b = a.a.h(this.extendInfo, AuctionStartConfig$AuctionThreshold$MarginExtendInfo.class);
          }catch(java.lang.Exception e0){
             a.l(MerchantMarketingShopLogBiz.AUCTION, "AuctionThreshold", "deserialize extendInfo error", e0);
          }
       }
    }
    public long getMarginMaxAmount(){
       AuctionStartConfig$AuctionThreshold$MarginExtendInfo obj = PatchProxy.apply(null, this, AuctionStartConfig$AuctionThreshold.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.getMarginExtendInfo();
       long l = (obj == null)? Long.MAX_VALUE: obj.marginMaxAmount;
       return l;
    }
    public long getMarginMinAmount(){
       AuctionStartConfig$AuctionThreshold$MarginExtendInfo obj = PatchProxy.apply(null, this, AuctionStartConfig$AuctionThreshold.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.getMarginExtendInfo();
       long l = (obj == null)? 0: obj.marginMinAmount;
       return l;
    }
    public String getMarginSettingRequestString(){
       Object[] objArray = null;
       AuctionStartConfig$AuctionThreshold$MarginSetting obj = PatchProxy.apply(objArray, this, AuctionStartConfig$AuctionThreshold.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mMarginSetting == null) {
          return objArray;
       }
       obj = new AuctionStartConfig$AuctionThreshold$MarginSetting();
       AuctionStartConfig$AuctionThreshold tmMarginSett = this.mMarginSetting;
       obj.marginId = tmMarginSett.marginId;
       obj.marginAmount = String.valueOf(AuctionPublish.parseStringToCent(tmMarginSett.marginAmount));
       return a.a.q(obj);
    }
    public boolean hasOptions(){
       Object obj = PatchProxy.apply(null, this, AuctionStartConfig$AuctionThreshold.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (q.f(this.mOptions) ^ 0x01);
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, AuctionStartConfig$AuctionThreshold.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{Integer.valueOf(this.mType)};
       return d.b(obj);
    }
    public void initMarginSetting(){
       if (PatchProxy.applyVoid(null, this, AuctionStartConfig$AuctionThreshold.class, "4")) {
          return;
       }
       if (this.mMarginSetting == null) {
          this.mMarginSetting = new AuctionStartConfig$AuctionThreshold$MarginSetting();
          AuctionStartConfig$AuctionThreshold$MarginExtendInfo marginExtend = this.getMarginExtendInfo();
          if (marginExtend != null) {
             this.mMarginSetting.marginId = marginExtend.marginId;
          }
       }
       return;
    }
    public boolean isValidSelected(){
       AuctionStartConfig$AuctionThreshold obj = PatchProxy.apply(null, this, AuctionStartConfig$AuctionThreshold.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mType;
       boolean b = true;
       if (obj == b) {
          return b;
       }
       if (obj == 4) {
          if (this.mSelectedOption != null) {
             obj = this.mMarginSetting;
             if (obj != null && !TextUtils.x(obj.marginAmount)) {
             label_0030 :
                return b;
             }
          }
          b = false;
          goto label_0030 ;
       }else if(this.mSelectedOption != null){
          b = false;
       }
       return b;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, AuctionStartConfig$AuctionThreshold.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "AuctionThreshold{mType="+this.mType+", mName=\'"+this.mName+'''+", mOptions="+this.mOptions+", mOptionTitle=\'"+this.mOptionTitle+'''+'}';
    }
}
