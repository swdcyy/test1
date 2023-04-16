package com.yxcorp.gifshow.commercial.api.AdSession;
import java.io.Serializable;
import com.yxcorp.gifshow.commercial.api.AdSession$a;
import nsd.u;
import java.util.UUID;
import java.lang.String;
import com.yxcorp.gifshow.commercial.api.AdBusinessType;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.commercial.api.ImpExtData;
import ql9.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class AdSession implements Serializable	// class@00111c
{
    public final int action;
    public String adBaseId;
    public final String appId;
    public final AdBusinessType businessType;
    public final String drainageType;
    public final long pageId;
    public String scheme;
    public final UUID sessionId;
    public final long subPageId;
    public static final AdSession$a Companion;
    public static final long serialVersionUID;

    static {
       AdSession.Companion = new AdSession$a(null);
    }
    public void AdSession(UUID p0,long p1,long p2,int p3,String p4,AdBusinessType p5,String p6,String p7,String p8){
       a.p(p0, "sessionId");
       a.p(p4, "scheme");
       a.p(p5, "businessType");
       super();
       this.sessionId = p0;
       this.pageId = p1;
       this.subPageId = p2;
       this.action = p3;
       this.scheme = p4;
       this.businessType = p5;
       this.drainageType = p6;
       this.appId = p7;
       this.adBaseId = p8;
    }
    public void AdSession(UUID p0,long p1,long p2,int p3,String p4,AdBusinessType p5,String p6,String p7,String p8,int p9,u p10){
       int i = p9;
       int i1 = (i & 0x08)? 0: p3;
       String str = (i & 0x10)? "": p4;
       int i2 = 0;
       String str1 = (i & 0x40)? i2: p6;
       String str2 = (i & 0x0080)? i2: p7;
       String str3 = (i & 0x0100)? i2: p8;
       super(p0, p1, p2, i1, str, p5, str1, str2, str3);
       return;
    }
    public static AdSession copy$default(AdSession p0,UUID p1,long p2,long p3,int p4,String p5,AdBusinessType p6,String p7,String p8,String p9,int p10,Object p11){
       AdSession uAdSession = p0;
       int i = p10;
       AdSession sessionId = (i & 0x01)? uAdSession.sessionId: p1;
       AdSession pageId = (i & 0x02)? uAdSession.pageId: p2;
       AdSession subPageId = (i & 0x04)? uAdSession.subPageId: p3;
       AdSession action = (i & 0x08)? uAdSession.action: p4;
       AdSession scheme = (i & 0x10)? uAdSession.scheme: p5;
       AdSession businessType = (i & 0x20)? uAdSession.businessType: p6;
       AdSession drainageType = (i & 0x40)? uAdSession.drainageType: p7;
       AdSession appId = (i & 0x0080)? uAdSession.appId: p8;
       AdSession adBaseId = (i & 0x0100)? uAdSession.adBaseId: p9;
       return p0.copy(sessionId, pageId, subPageId, action, scheme, businessType, drainageType, appId, adBaseId);
    }
    public static a toAdParams$default(AdSession p0,int p1,ImpExtData p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = null;
       }
       return p0.toAdParams(p1, p2);
    }
    public final UUID component1(){
       return this.sessionId;
    }
    public final long component2(){
       return this.pageId;
    }
    public final long component3(){
       return this.subPageId;
    }
    public final int component4(){
       return this.action;
    }
    public final String component5(){
       return this.scheme;
    }
    public final AdBusinessType component6(){
       return this.businessType;
    }
    public final String component7(){
       return this.drainageType;
    }
    public final String component8(){
       return this.appId;
    }
    public final String component9(){
       return this.adBaseId;
    }
    public final AdSession copy(UUID p0,long p1,long p2,int p3,String p4,AdBusinessType p5,String p6,String p7,String p8){
       AdSession obj;
       object oobject = p0;
       object oobject1 = p4;
       object oobject2 = p5;
       if (PatchProxy.isSupport(AdSession.class)) {
          Object[] objArray = new Object[9];
          objArray[0] = oobject;
          objArray[1] = Long.valueOf(p1);
          objArray[2] = Long.valueOf(p2);
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = oobject1;
          objArray[5] = oobject2;
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = p8;
          obj = PatchProxy.apply(objArray, this, AdSession.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       a.p(p0, "sessionId");
       a.p(oobject1, "scheme");
       a.p(oobject2, "businessType");
       obj = new AdSession(p0, p1, p2, p3, p4, p5, p6, p7, p8);
       return v13;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AdSession.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof AdSession && (a.g(this.sessionId, p0.sessionId) && (!this.pageId - p0.pageId && (!this.subPageId - p0.subPageId && (this.action == p0.action && (a.g(this.scheme, p0.scheme) && (a.g(this.businessType, p0.businessType) && (a.g(this.drainageType, p0.drainageType) && (a.g(this.appId, p0.appId) && a.g(this.adBaseId, p0.adBaseId))))))))))) {
          return true;
       }
       return false;
    }
    public final int getAction(){
       return this.action;
    }
    public final String getAdBaseId(){
       return this.adBaseId;
    }
    public final String getAppId(){
       return this.appId;
    }
    public final AdBusinessType getBusinessType(){
       return this.businessType;
    }
    public final String getDrainageType(){
       return this.drainageType;
    }
    public final long getPageId(){
       return this.pageId;
    }
    public final String getScheme(){
       return this.scheme;
    }
    public final UUID getSessionId(){
       return this.sessionId;
    }
    public final long getSubPageId(){
       return this.subPageId;
    }
    public int hashCode(){
       AdSession obj = PatchProxy.apply(null, this, AdSession.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.sessionId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       AdSession tpageId = this.pageId;
       tpageId = this.subPageId;
       i1 = ((((((i1 * 31) + (int)(tpageId ^ (tpageId >> 32))) * 31) + (int)(tpageId ^ (tpageId >> 32))) * 31) + this.action) * 31;
       tpageId = this.scheme;
       int i2 = (tpageId != null)? tpageId.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tpageId = this.businessType;
       i2 = (tpageId != null)? tpageId.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tpageId = this.drainageType;
       i2 = (tpageId != null)? tpageId.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tpageId = this.appId;
       i2 = (tpageId != null)? tpageId.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tpageId = this.adBaseId;
       if (tpageId != null) {
          i = tpageId.hashCode();
       }
       return (i1 + i);
    }
    public final void setAdBaseId(String p0){
       this.adBaseId = p0;
    }
    public final void setScheme(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdSession.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.scheme = p0;
       return;
    }
    public final a toAdParams(int p0,ImpExtData p1){
       Object obj;
       if (PatchProxy.isSupport(AdSession.class)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, AdSession.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a uoa = new a(this.pageId, this.subPageId, this.action, 0, 0, p0, p1, this.drainageType);
       return obj;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, AdSession.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "AdSession\(sessionId="+this.sessionId+", pageId="+this.pageId+", subPageId="+this.subPageId+", action="+this.action+", scheme="+this.scheme+", businessType="+this.businessType+", drainageType="+this.drainageType+", appId="+this.appId+", adBaseId="+this.adBaseId+"\)";
    }
}
