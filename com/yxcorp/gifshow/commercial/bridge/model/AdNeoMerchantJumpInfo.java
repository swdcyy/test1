package com.yxcorp.gifshow.commercial.bridge.model.AdNeoMerchantJumpInfo;
import java.io.Serializable;
import com.yxcorp.gifshow.commercial.bridge.model.AdNeoMerchantJumpInfo$a;
import nsd.u;
import java.lang.String;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.CharSequence;
import java.lang.StringBuilder;

public final class AdNeoMerchantJumpInfo implements Serializable	// class@001128
{
    public final long activityId;
    public final PhotoAdvertisement ad;
    public final String appLink;
    public final long bonusTime;
    public final String creativeId;
    public final String jumpId;
    public final int jumpType;
    public final String llsid;
    public final boolean openGoodsList;
    public final String serverExpTag;
    public static final AdNeoMerchantJumpInfo$a Companion;
    public static final long serialVersionUID;

    static {
       AdNeoMerchantJumpInfo.Companion = new AdNeoMerchantJumpInfo$a(null);
    }
    public void AdNeoMerchantJumpInfo(int p0,String p1,PhotoAdvertisement p2,String p3,boolean p4,String p5,long p6,String p7,String p8,long p9){
       a.p(p7, "llsid");
       a.p(p8, "creativeId");
       super();
       this.jumpType = p0;
       this.jumpId = p1;
       this.ad = p2;
       this.serverExpTag = p3;
       this.openGoodsList = p4;
       this.appLink = p5;
       this.bonusTime = p6;
       this.llsid = p7;
       this.creativeId = p8;
       this.activityId = p9;
    }
    public void AdNeoMerchantJumpInfo(int p0,String p1,PhotoAdvertisement p2,String p3,boolean p4,String p5,long p6,String p7,String p8,long p9,int p10,u p11){
       int i = p10;
       int i1 = (i & 0x01)? 0: p0;
       boolean b = (i & 0x10)? false: p4;
       long l = (i & 0x40)? -1: p6;
       String str = "";
       String str1 = (i & 0x0080)? str: p7;
       String str2 = (i & 0x0100)? str: p8;
       long l1 = (i & 0x0200)? -1: p9;
       super(i1, p1, p2, p3, b, p5, l, str1, str2, l1);
       return;
    }
    public static AdNeoMerchantJumpInfo copy$default(AdNeoMerchantJumpInfo p0,int p1,String p2,PhotoAdvertisement p3,String p4,boolean p5,String p6,long p7,String p8,String p9,long p10,int p11,Object p12){
       AdNeoMerchantJumpInfo uAdNeoMercha = p0;
       int i = p11;
       AdNeoMerchantJumpInfo jumpType = (i & 0x01)? uAdNeoMercha.jumpType: p1;
       AdNeoMerchantJumpInfo jumpId = (i & 0x02)? uAdNeoMercha.jumpId: p2;
       AdNeoMerchantJumpInfo ad = (i & 0x04)? uAdNeoMercha.ad: p3;
       AdNeoMerchantJumpInfo serverExpTag = (i & 0x08)? uAdNeoMercha.serverExpTag: p4;
       AdNeoMerchantJumpInfo openGoodsLis = (i & 0x10)? uAdNeoMercha.openGoodsList: p5;
       AdNeoMerchantJumpInfo appLink = (i & 0x20)? uAdNeoMercha.appLink: p6;
       AdNeoMerchantJumpInfo bonusTime = (i & 0x40)? uAdNeoMercha.bonusTime: p7;
       AdNeoMerchantJumpInfo llsid = (i & 0x0080)? uAdNeoMercha.llsid: p8;
       AdNeoMerchantJumpInfo creativeId = (i & 0x0100)? uAdNeoMercha.creativeId: p9;
       AdNeoMerchantJumpInfo activityId = (i & 0x0200)? uAdNeoMercha.activityId: p10;
       return p0.copy(jumpType, jumpId, ad, serverExpTag, openGoodsLis, appLink, bonusTime, llsid, creativeId, activityId);
    }
    public final int component1(){
       return this.jumpType;
    }
    public final long component10(){
       return this.activityId;
    }
    public final String component2(){
       return this.jumpId;
    }
    public final PhotoAdvertisement component3(){
       return this.ad;
    }
    public final String component4(){
       return this.serverExpTag;
    }
    public final boolean component5(){
       return this.openGoodsList;
    }
    public final String component6(){
       return this.appLink;
    }
    public final long component7(){
       return this.bonusTime;
    }
    public final String component8(){
       return this.llsid;
    }
    public final String component9(){
       return this.creativeId;
    }
    public final AdNeoMerchantJumpInfo copy(int p0,String p1,PhotoAdvertisement p2,String p3,boolean p4,String p5,long p6,String p7,String p8,long p9){
       AdNeoMerchantJumpInfo obj;
       object oobject = p7;
       object oobject1 = p8;
       if (PatchProxy.isSupport(AdNeoMerchantJumpInfo.class)) {
          Object[] objArray = new Object[10];
          objArray[0] = Integer.valueOf(p0);
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = p3;
          objArray[4] = Boolean.valueOf(p4);
          objArray[5] = p5;
          objArray[6] = Long.valueOf(p6);
          objArray[7] = oobject;
          objArray[8] = oobject1;
          objArray[9] = Long.valueOf(p9);
          obj = PatchProxy.apply(objArray, this, AdNeoMerchantJumpInfo.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       a.p(oobject, "llsid");
       a.p(oobject1, "creativeId");
       obj = new AdNeoMerchantJumpInfo(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
       return v14;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AdNeoMerchantJumpInfo.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof AdNeoMerchantJumpInfo && (this.jumpType == p0.jumpType && (a.g(this.jumpId, p0.jumpId) && (a.g(this.ad, p0.ad) && (a.g(this.serverExpTag, p0.serverExpTag) && (this.openGoodsList == p0.openGoodsList && (a.g(this.appLink, p0.appLink) && (!this.bonusTime - p0.bonusTime && (a.g(this.llsid, p0.llsid) && (a.g(this.creativeId, p0.creativeId) && !this.activityId - p0.activityId))))))))))) {
          return true;
       }
       return false;
    }
    public final long getActivityId(){
       return this.activityId;
    }
    public final PhotoAdvertisement getAd(){
       return this.ad;
    }
    public final String getAppLink(){
       return this.appLink;
    }
    public final long getBonusTime(){
       return this.bonusTime;
    }
    public final String getCreativeId(){
       return this.creativeId;
    }
    public final String getJumpId(){
       return this.jumpId;
    }
    public final int getJumpType(){
       return this.jumpType;
    }
    public final String getLlsid(){
       return this.llsid;
    }
    public final boolean getOpenGoodsList(){
       return this.openGoodsList;
    }
    public final String getServerExpTag(){
       return this.serverExpTag;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, AdNeoMerchantJumpInfo.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.jumpType * 31;
       AdNeoMerchantJumpInfo tjumpId = this.jumpId;
       int i1 = 0;
       int i2 = (tjumpId != null)? tjumpId.hashCode(): 0;
       i = (i + i2) * 31;
       tjumpId = this.ad;
       i2 = (tjumpId != null)? tjumpId.hashCode(): 0;
       i = (i + i2) * 31;
       tjumpId = this.serverExpTag;
       i2 = (tjumpId != null)? tjumpId.hashCode(): 0;
       i = (i + i2) * 31;
       tjumpId = this.openGoodsList;
       if (tjumpId != null) {
          i2 = 1;
       }
       i = (i + i2) * 31;
       tjumpId = this.appLink;
       i2 = (tjumpId != null)? tjumpId.hashCode(): 0;
       AdNeoMerchantJumpInfo tbonusTime = this.bonusTime;
       long l = 32;
       i = (((i + i2) * 31) + (int)(tbonusTime ^ (tbonusTime >> l))) * 31;
       tbonusTime = this.llsid;
       int i3 = (tbonusTime != null)? tbonusTime.hashCode(): 0;
       i = (i + i3) * 31;
       tbonusTime = this.creativeId;
       if (tbonusTime != null) {
          i1 = tbonusTime.hashCode();
       }
       AdNeoMerchantJumpInfo tactivityId = this.activityId;
       return (((i + i1) * 31) + (int)(tactivityId ^ (tactivityId >> l)));
    }
    public final boolean isClickReward(){
       AdNeoMerchantJumpInfo obj = PatchProxy.apply(null, this, AdNeoMerchantJumpInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.bonusTime > 0) {
          obj = (this.llsid.length() > 0)? 1: null;
          if (obj) {
             obj = (this.creativeId.length() > 0)? 1: null;
             if (obj && this.activityId > 0) {
             label_0040 :
                return b;
             }
          }
       }
    label_003f :
       b = false;
       goto label_0040 ;
    }
    public final boolean isValid(){
       boolean b1;
       boolean b2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       AdNeoMerchantJumpInfo obj = PatchProxy.apply(null, this, AdNeoMerchantJumpInfo.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.apply(null, this, AdNeoMerchantJumpInfo.class, "2");
       boolean b = false;
       if (obj != patchProxyRe) {
          b1 = obj.booleanValue();
       }else {
          obj = this.jumpType;
          if (obj == 3 || obj == 2) {
             obj = this.serverExpTag;
             obj = (obj == null || !obj.length())? 1: null;
             if (!obj && this.ad != null) {
                obj = this.jumpId;
                b1 = (obj == null || !obj.length())? 1: 0;
                if (!b1) {
                   b1 = true;
                }
             }
          }
       label_0055 :
          b1 = false;
       }
       if (!b1) {
          obj = PatchProxy.apply(null, this, AdNeoMerchantJumpInfo.class, "3");
          if (obj != patchProxyRe) {
             b2 = obj.booleanValue();
          }else if(this.jumpType == 1){
             AdNeoMerchantJumpInfo tjumpId = this.jumpId;
             tjumpId = (tjumpId == null || !tjumpId.length())? 1: null;
             if (!tjumpId) {
                tjumpId = this.appLink;
                tjumpId = (tjumpId == null || !tjumpId.length())? 1: 0;
                if (!tjumpId) {
                   b2 = true;
                }
             }
          }
       label_008f :
          b2 = false;
          if (!b2) {
          label_0093 :
             return b;
          }
       }
       b = true;
       goto label_0093 ;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, AdNeoMerchantJumpInfo.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "AdNeoMerchantJumpInfo\(jumpType="+this.jumpType+", jumpId="+this.jumpId+", ad="+this.ad+", serverExpTag="+this.serverExpTag+", openGoodsList="+this.openGoodsList+", appLink="+this.appLink+", bonusTime="+this.bonusTime+", llsid="+this.llsid+", creativeId="+this.creativeId+", activityId="+this.activityId+"\)";
    }
}
