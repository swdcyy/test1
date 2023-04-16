package com.yxcorp.gifshow.ad.response.NeoOrderStatusData;
import java.io.Serializable;
import com.yxcorp.gifshow.ad.response.NeoOrderStatusData$a;
import nsd.u;
import java.lang.String;
import com.yxcorp.gifshow.ad.response.NeoOrderStatusActionBarInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SecondNeoInfo;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class NeoOrderStatusData implements Serializable	// class@0017e2
{
    public final NeoOrderStatusActionBarInfo actionBarInfo;
    public final String appLink;
    public final String landPageUrl;
    public final int orderStatus;
    public final PhotoAdvertisement$SecondNeoInfo secondNeoInfo;
    public static final NeoOrderStatusData$a Companion;
    public static final long serialVersionUID;

    static {
       NeoOrderStatusData.Companion = new NeoOrderStatusData$a(null);
    }
    public void NeoOrderStatusData(String p0,String p1,int p2,NeoOrderStatusActionBarInfo p3,PhotoAdvertisement$SecondNeoInfo p4){
       super();
       this.landPageUrl = p0;
       this.appLink = p1;
       this.orderStatus = p2;
       this.actionBarInfo = p3;
       this.secondNeoInfo = p4;
    }
    public void NeoOrderStatusData(String p0,String p1,int p2,NeoOrderStatusActionBarInfo p3,PhotoAdvertisement$SecondNeoInfo p4,int p5,u p6){
       int i = (p5 & 0x04)? 0: p2;
       super(p0, p1, i, p3, p4);
       return;
    }
    public static NeoOrderStatusData copy$default(NeoOrderStatusData p0,String p1,String p2,int p3,NeoOrderStatusActionBarInfo p4,PhotoAdvertisement$SecondNeoInfo p5,int p6,Object p7){
       NeoOrderStatusData landPageUrl;
       NeoOrderStatusData appLink;
       NeoOrderStatusData orderStatus;
       NeoOrderStatusData actionBarInf;
       NeoOrderStatusData secondNeoInf;
       if (p6 & 0x01) {
          landPageUrl = p0.landPageUrl;
       }
       if (p6 & 0x02) {
          appLink = p0.appLink;
       }
       p7 = appLink;
       if (p6 & 0x04) {
          orderStatus = p0.orderStatus;
       }
       NeoOrderStatusData neoOrderStat = orderStatus;
       if (p6 & 0x08) {
          actionBarInf = p0.actionBarInfo;
       }
       NeoOrderStatusData neoOrderStat1 = actionBarInf;
       if (p6 & 0x10) {
          secondNeoInf = p0.secondNeoInfo;
       }
       return p0.copy(landPageUrl, p7, neoOrderStat, neoOrderStat1, secondNeoInf);
    }
    public final String component1(){
       return this.landPageUrl;
    }
    public final String component2(){
       return this.appLink;
    }
    public final int component3(){
       return this.orderStatus;
    }
    public final NeoOrderStatusActionBarInfo component4(){
       return this.actionBarInfo;
    }
    public final PhotoAdvertisement$SecondNeoInfo component5(){
       return this.secondNeoInfo;
    }
    public final NeoOrderStatusData copy(String p0,String p1,int p2,NeoOrderStatusActionBarInfo p3,PhotoAdvertisement$SecondNeoInfo p4){
       Object obj;
       if (PatchProxy.isSupport(NeoOrderStatusData.class)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),p3,p4};
          obj = PatchProxy.apply(objArray, this, NeoOrderStatusData.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       NeoOrderStatusData neoOrderStat = new NeoOrderStatusData(p0, p1, p2, p3, p4);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NeoOrderStatusData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof NeoOrderStatusData && (a.g(this.landPageUrl, p0.landPageUrl) && (a.g(this.appLink, p0.appLink) && (this.orderStatus == p0.orderStatus && (a.g(this.actionBarInfo, p0.actionBarInfo) && a.g(this.secondNeoInfo, p0.secondNeoInfo))))))) {
          return true;
       }
       return false;
    }
    public final NeoOrderStatusActionBarInfo getActionBarInfo(){
       return this.actionBarInfo;
    }
    public final String getAppLink(){
       return this.appLink;
    }
    public final String getLandPageUrl(){
       return this.landPageUrl;
    }
    public final int getOrderStatus(){
       return this.orderStatus;
    }
    public final PhotoAdvertisement$SecondNeoInfo getSecondNeoInfo(){
       return this.secondNeoInfo;
    }
    public int hashCode(){
       NeoOrderStatusData obj = PatchProxy.apply(null, this, NeoOrderStatusData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.landPageUrl;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       NeoOrderStatusData tappLink = this.appLink;
       int i2 = (tappLink != null)? tappLink.hashCode(): 0;
       i1 = (((i1 + i2) * 31) + this.orderStatus) * 31;
       tappLink = this.actionBarInfo;
       i2 = (tappLink != null)? tappLink.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tappLink = this.secondNeoInfo;
       if (tappLink != null) {
          i = tappLink.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, NeoOrderStatusData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "NeoOrderStatusData\(landPageUrl="+this.landPageUrl+", appLink="+this.appLink+", orderStatus="+this.orderStatus+", actionBarInfo="+this.actionBarInfo+", secondNeoInfo="+this.secondNeoInfo+"\)";
    }
}
