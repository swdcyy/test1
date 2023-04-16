package com.yxcorp.gifshow.profile.util.ProfileLastSeenUtil$a;
import com.yxcorp.gifshow.profile.util.ProfileLastSeenUtil$SearchConfig;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class ProfileLastSeenUtil$a	// class@0015c7
{
    public final long intervalMs;
    public final int percent;
    public final ProfileLastSeenUtil$SearchConfig searchConfig;
    public final int totalRequestTime;

    public void ProfileLastSeenUtil$a(int p0,long p1,int p2,ProfileLastSeenUtil$SearchConfig p3,int p4,u p5){
       super();
       this.percent = p0;
       this.intervalMs = p1;
       this.totalRequestTime = p2;
       this.searchConfig = null;
    }
    public final long a(){
       return this.intervalMs;
    }
    public final int b(){
       return this.percent;
    }
    public final ProfileLastSeenUtil$SearchConfig c(){
       return this.searchConfig;
    }
    public final int d(){
       return this.totalRequestTime;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ProfileLastSeenUtil$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof ProfileLastSeenUtil$a && (this.percent == p0.percent && (!this.intervalMs - p0.intervalMs && (this.totalRequestTime == p0.totalRequestTime && a.g(this.searchConfig, p0.searchConfig)))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, ProfileLastSeenUtil$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       ProfileLastSeenUtil$a tintervalMs = this.intervalMs;
       int i = ((((this.percent * 31) + (int)(tintervalMs ^ (tintervalMs >> 32))) * 31) + this.totalRequestTime) * 31;
       tintervalMs = this.searchConfig;
       int i1 = (tintervalMs != null)? tintervalMs.hashCode(): 0;
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ProfileLastSeenUtil$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "RequestConfig\(percent="+this.percent+", intervalMs="+this.intervalMs+", totalRequestTime="+this.totalRequestTime+", searchConfig="+this.searchConfig+"\)";
    }
}
