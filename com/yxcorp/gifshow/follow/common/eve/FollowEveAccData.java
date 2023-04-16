package com.yxcorp.gifshow.follow.common.eve.FollowEveAccData;
import java.io.Serializable;
import com.yxcorp.gifshow.follow.common.eve.FollowEveAccData$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import lnc.a1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class FollowEveAccData implements Serializable	// class@00104e
{
    public final String action;
    public final boolean hasRedDot;
    public final String page;
    public final long timestamp;
    public static final FollowEveAccData$a Companion;
    public static final long serialVersionUID;

    static {
       FollowEveAccData.Companion = new FollowEveAccData$a(null);
    }
    public void FollowEveAccData(String p0){
       super(p0, 0, false, null, 14, null);
    }
    public void FollowEveAccData(String p0,long p1){
       super(p0, p1, false, null, 12, null);
    }
    public void FollowEveAccData(String p0,long p1,boolean p2){
       super(p0, p1, p2, null, 8, null);
    }
    public void FollowEveAccData(String p0,long p1,boolean p2,String p3){
       a.p(p0, "action");
       a.p(p3, "page");
       super();
       this.action = p0;
       this.timestamp = p1;
       this.hasRedDot = p2;
       this.page = p3;
    }
    public void FollowEveAccData(String p0,long p1,boolean p2,String p3,int p4,u p5){
       if (p4 & 0x02) {
          p1 = a1.k();
       }
       long l = p1;
       boolean b = (p4 & 0x04)? false: p2;
       if (p4 & 0x08) {
          p3 = "FOLLOW";
       }
       super(p0, l, b, p3);
       return;
    }
    public static FollowEveAccData copy$default(FollowEveAccData p0,String p1,long p2,boolean p3,String p4,int p5,Object p6){
       FollowEveAccData action;
       FollowEveAccData timestamp;
       FollowEveAccData hasRedDot;
       FollowEveAccData page;
       if (p5 & 0x01) {
          action = p0.action;
       }
       if (p5 & 0x02) {
          timestamp = p0.timestamp;
       }
       FollowEveAccData uFollowEveAc = timestamp;
       if (p5 & 0x04) {
          hasRedDot = p0.hasRedDot;
       }
       p6 = hasRedDot;
       if (p5 & 0x08) {
          page = p0.page;
       }
       return p0.copy(action, uFollowEveAc, p6, page);
    }
    public final String component1(){
       return this.action;
    }
    public final long component2(){
       return this.timestamp;
    }
    public final boolean component3(){
       return this.hasRedDot;
    }
    public final String component4(){
       return this.page;
    }
    public final FollowEveAccData copy(String p0,long p1,boolean p2,String p3){
       Object obj;
       if (PatchProxy.isSupport(FollowEveAccData.class)) {
          obj = PatchProxy.applyFourRefs(p0, Long.valueOf(p1), Boolean.valueOf(p2), p3, this, FollowEveAccData.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "action");
       a.p(p3, "page");
       FollowEveAccData uFollowEveAc = new FollowEveAccData(p0, p1, p2, p3);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FollowEveAccData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof FollowEveAccData && (a.g(this.action, p0.action) && (!this.timestamp - p0.timestamp && (this.hasRedDot == p0.hasRedDot && a.g(this.page, p0.page)))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       int i2;
       FollowEveAccData obj = PatchProxy.apply(null, this, FollowEveAccData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.action;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       FollowEveAccData ttimestamp = this.timestamp;
       i1 = ((i1 * 31) + (int)(ttimestamp ^ (ttimestamp >> 32))) * 31;
       ttimestamp = this.hasRedDot;
       if (ttimestamp != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       ttimestamp = this.page;
       if (ttimestamp != null) {
          i = ttimestamp.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, FollowEveAccData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "FollowEveAccData\(action="+this.action+", timestamp="+this.timestamp+", hasRedDot="+this.hasRedDot+", page="+this.page+"\)";
    }
}
