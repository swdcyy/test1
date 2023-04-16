package com.yxcorp.gifshow.ad.response.TvcUserId;
import java.io.Serializable;
import com.yxcorp.gifshow.ad.response.TvcUserId$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class TvcUserId implements Serializable	// class@0017f0
{
    public final long endTime;
    public final long startTime;
    public final String userId;
    public static final TvcUserId$a Companion;
    public static final long serialVersionUID;

    static {
       TvcUserId.Companion = new TvcUserId$a(null);
    }
    public void TvcUserId(String p0,long p1,long p2){
       super();
       this.userId = p0;
       this.startTime = p1;
       this.endTime = p2;
    }
    public static TvcUserId copy$default(TvcUserId p0,String p1,long p2,long p3,int p4,Object p5){
       TvcUserId userId;
       TvcUserId startTime;
       TvcUserId endTime;
       if (p4 & 0x01) {
          userId = p0.userId;
       }
       if (p4 & 0x02) {
          startTime = p0.startTime;
       }
       TvcUserId tvcUserId = startTime;
       if (p4 & 0x04) {
          endTime = p0.endTime;
       }
       return p0.copy(userId, tvcUserId, endTime);
    }
    public final String component1(){
       return this.userId;
    }
    public final long component2(){
       return this.startTime;
    }
    public final long component3(){
       return this.endTime;
    }
    public final TvcUserId copy(String p0,long p1,long p2){
       Object obj;
       if (PatchProxy.isSupport(TvcUserId.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, TvcUserId.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       TvcUserId tvcUserId = new TvcUserId(p0, p1, p2);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TvcUserId.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof TvcUserId && (a.g(this.userId, p0.userId) && (!this.startTime - p0.startTime && !this.endTime - p0.endTime)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       TvcUserId obj = PatchProxy.apply(null, this, TvcUserId.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.userId;
       int i = (obj != null)? obj.hashCode(): 0;
       TvcUserId tstartTime = this.startTime;
       tstartTime = this.endTime;
       return ((((i * 31) + (int)(tstartTime ^ (tstartTime >> 32))) * 31) + (int)(tstartTime ^ (tstartTime >> 32)));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, TvcUserId.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "TvcUserId\(userId="+this.userId+", startTime="+this.startTime+", endTime="+this.endTime+"\)";
    }
}
