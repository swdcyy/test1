package com.kuaishou.live.common.core.component.gift.giftstore.api.LivePackSendResponse;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LivePackSendResponse implements Serializable	// class@00130d
{
    public final String afterSendToast;
    public final int count;
    public final String errorMsg;
    public final long expireTime;
    public final boolean expiredSoon;
    public final String giftSentInfo;
    public final String jumpUrl;
    public final long serverTime;

    public void LivePackSendResponse(int p0,long p1,long p2,String p3,boolean p4,String p5,String p6,String p7){
       a.p(p3, "errorMsg");
       a.p(p5, "giftSentInfo");
       super();
       this.count = p0;
       this.expireTime = p1;
       this.serverTime = p2;
       this.errorMsg = p3;
       this.expiredSoon = p4;
       this.giftSentInfo = p5;
       this.afterSendToast = p6;
       this.jumpUrl = p7;
    }
    public static LivePackSendResponse copy$default(LivePackSendResponse p0,int p1,long p2,long p3,String p4,boolean p5,String p6,String p7,String p8,int p9,Object p10){
       LivePackSendResponse livePackSend = p0;
       int i = p9;
       LivePackSendResponse count = (i & 0x01)? livePackSend.count: p1;
       LivePackSendResponse expireTime = (i & 0x02)? livePackSend.expireTime: p2;
       LivePackSendResponse serverTime = (i & 0x04)? livePackSend.serverTime: p3;
       LivePackSendResponse errorMsg = (i & 0x08)? livePackSend.errorMsg: p4;
       LivePackSendResponse expiredSoon = (i & 0x10)? livePackSend.expiredSoon: p5;
       LivePackSendResponse giftSentInfo = (i & 0x20)? livePackSend.giftSentInfo: p6;
       LivePackSendResponse afterSendToa = (i & 0x40)? livePackSend.afterSendToast: p7;
       LivePackSendResponse jumpUrl = (i & 0x0080)? livePackSend.jumpUrl: p8;
       return p0.copy(count, expireTime, serverTime, errorMsg, expiredSoon, giftSentInfo, afterSendToa, jumpUrl);
    }
    public final int component1(){
       return this.count;
    }
    public final long component2(){
       return this.expireTime;
    }
    public final long component3(){
       return this.serverTime;
    }
    public final String component4(){
       return this.errorMsg;
    }
    public final boolean component5(){
       return this.expiredSoon;
    }
    public final String component6(){
       return this.giftSentInfo;
    }
    public final String component7(){
       return this.afterSendToast;
    }
    public final String component8(){
       return this.jumpUrl;
    }
    public final LivePackSendResponse copy(int p0,long p1,long p2,String p3,boolean p4,String p5,String p6,String p7){
       LivePackSendResponse obj;
       object oobject = p3;
       object oobject1 = p5;
       if (PatchProxy.isSupport(LivePackSendResponse.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Long.valueOf(p1),Long.valueOf(p2),oobject,Boolean.valueOf(p4),oobject1,p6,p7};
          obj = PatchProxy.apply(objArray, this, LivePackSendResponse.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       a.p(oobject, "errorMsg");
       a.p(oobject1, "giftSentInfo");
       obj = new LivePackSendResponse(p0, p1, p2, p3, p4, p5, p6, p7);
       return v12;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LivePackSendResponse.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LivePackSendResponse && (this.count == p0.count && (!this.expireTime - p0.expireTime && (!this.serverTime - p0.serverTime && (a.g(this.errorMsg, p0.errorMsg) && (this.expiredSoon == p0.expiredSoon && (a.g(this.giftSentInfo, p0.giftSentInfo) && (a.g(this.afterSendToast, p0.afterSendToast) && a.g(this.jumpUrl, p0.jumpUrl)))))))))) {
          return true;
       }
       return false;
    }
    public final String getAfterSendToast(){
       return this.afterSendToast;
    }
    public final int getCount(){
       return this.count;
    }
    public final String getErrorMsg(){
       return this.errorMsg;
    }
    public final long getExpireTime(){
       return this.expireTime;
    }
    public final boolean getExpiredSoon(){
       return this.expiredSoon;
    }
    public final String getGiftSentInfo(){
       return this.giftSentInfo;
    }
    public final String getJumpUrl(){
       return this.jumpUrl;
    }
    public final long getServerTime(){
       return this.serverTime;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, LivePackSendResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       LivePackSendResponse texpireTime = this.expireTime;
       texpireTime = this.serverTime;
       int i = ((((this.count * 31) + (int)(texpireTime ^ (texpireTime >> 32))) * 31) + (int)(texpireTime ^ (texpireTime >> 32))) * 31;
       texpireTime = this.errorMsg;
       int i1 = 0;
       int i2 = (texpireTime != null)? texpireTime.hashCode(): 0;
       i = (i + i2) * 31;
       texpireTime = this.expiredSoon;
       if (texpireTime != null) {
          i2 = 1;
       }
       i = (i + i2) * 31;
       texpireTime = this.giftSentInfo;
       i2 = (texpireTime != null)? texpireTime.hashCode(): 0;
       i = (i + i2) * 31;
       texpireTime = this.afterSendToast;
       i2 = (texpireTime != null)? texpireTime.hashCode(): 0;
       i = (i + i2) * 31;
       texpireTime = this.jumpUrl;
       if (texpireTime != null) {
          i1 = texpireTime.hashCode();
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LivePackSendResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LivePackSendResponse\(count="+this.count+", expireTime="+this.expireTime+", serverTime="+this.serverTime+", errorMsg="+this.errorMsg+", expiredSoon="+this.expiredSoon+", giftSentInfo="+this.giftSentInfo+", afterSendToast="+this.afterSendToast+", jumpUrl="+this.jumpUrl+"\)";
    }
}
