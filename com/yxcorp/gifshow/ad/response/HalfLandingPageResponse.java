package com.yxcorp.gifshow.ad.response.HalfLandingPageResponse;
import java.io.Serializable;
import com.yxcorp.gifshow.ad.response.HalfLandingPageResponse$a;
import nsd.u;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HalfLandingData;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class HalfLandingPageResponse implements Serializable	// class@0017d7
{
    public final Integer code;
    public final PhotoAdvertisement$HalfLandingData halfLandingData;
    public final String message;
    public static final HalfLandingPageResponse$a Companion;
    public static final long serialVersionUID;

    static {
       HalfLandingPageResponse.Companion = new HalfLandingPageResponse$a(null);
    }
    public void HalfLandingPageResponse(Integer p0,String p1,PhotoAdvertisement$HalfLandingData p2){
       super();
       this.code = p0;
       this.message = p1;
       this.halfLandingData = p2;
    }
    public static HalfLandingPageResponse copy$default(HalfLandingPageResponse p0,Integer p1,String p2,PhotoAdvertisement$HalfLandingData p3,int p4,Object p5){
       HalfLandingPageResponse code;
       HalfLandingPageResponse message;
       HalfLandingPageResponse halfLandingD;
       if (p4 & 0x01) {
          code = p0.code;
       }
       if (p4 & 0x02) {
          message = p0.message;
       }
       if (p4 & 0x04) {
          halfLandingD = p0.halfLandingData;
       }
       return p0.copy(code, message, halfLandingD);
    }
    public final Integer component1(){
       return this.code;
    }
    public final String component2(){
       return this.message;
    }
    public final PhotoAdvertisement$HalfLandingData component3(){
       return this.halfLandingData;
    }
    public final HalfLandingPageResponse copy(Integer p0,String p1,PhotoAdvertisement$HalfLandingData p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, HalfLandingPageResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new HalfLandingPageResponse(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HalfLandingPageResponse.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof HalfLandingPageResponse && (a.g(this.code, p0.code) && (a.g(this.message, p0.message) && a.g(this.halfLandingData, p0.halfLandingData))))) {
          return true;
       }
       return false;
    }
    public final Integer getCode(){
       return this.code;
    }
    public final PhotoAdvertisement$HalfLandingData getHalfLandingData(){
       return this.halfLandingData;
    }
    public final String getMessage(){
       return this.message;
    }
    public int hashCode(){
       HalfLandingPageResponse obj = PatchProxy.apply(null, this, HalfLandingPageResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.code;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       HalfLandingPageResponse tmessage = this.message;
       int i2 = (tmessage != null)? tmessage.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmessage = this.halfLandingData;
       if (tmessage != null) {
          i = tmessage.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, HalfLandingPageResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "HalfLandingPageResponse\(code="+this.code+", message="+this.message+", halfLandingData="+this.halfLandingData+"\)";
    }
}
