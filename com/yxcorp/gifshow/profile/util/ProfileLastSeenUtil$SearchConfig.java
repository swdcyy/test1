package com.yxcorp.gifshow.profile.util.ProfileLastSeenUtil$SearchConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class ProfileLastSeenUtil$SearchConfig	// class@0015c6
{
    public final long intervalMs;
    public final int percent;
    public final int totalRequestTime;

    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof ProfileLastSeenUtil$SearchConfig && (this.percent == p0.percent && (!this.intervalMs - p0.intervalMs && this.totalRequestTime == p0.totalRequestTime)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, ProfileLastSeenUtil$SearchConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       ProfileLastSeenUtil$SearchConfig tintervalMs = this.intervalMs;
       return ((((this.percent * 31) + (int)(tintervalMs ^ (tintervalMs >> 32))) * 31) + this.totalRequestTime);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ProfileLastSeenUtil$SearchConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SearchConfig\(percent="+this.percent+", intervalMs="+this.intervalMs+", totalRequestTime="+this.totalRequestTime+"\)";
    }
}
