package com.kwai.nearby.startup.local.model.NearbyPreLoadInfo;
import java.io.Serializable;
import com.kwai.nearby.startup.local.model.NearbyPreLoadInfo$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class NearbyPreLoadInfo implements Serializable	// class@00102b
{
    public final long mMaxPreLoadDurationMs;
    public long mStartAfterOpenMs;
    public static final NearbyPreLoadInfo$a Companion;
    public static final long serialVersionUID;

    static {
       NearbyPreLoadInfo.Companion = new NearbyPreLoadInfo$a(null);
    }
    public void NearbyPreLoadInfo(long p0,long p1){
       super();
       this.mStartAfterOpenMs = p0;
       this.mMaxPreLoadDurationMs = p1;
    }
    public static NearbyPreLoadInfo copy$default(NearbyPreLoadInfo p0,long p1,long p2,int p3,Object p4){
       NearbyPreLoadInfo mStartAfterO;
       NearbyPreLoadInfo mMaxPreLoadD;
       if (p3 & 0x01) {
          mStartAfterO = p0.mStartAfterOpenMs;
       }
       if (p3 & 0x02) {
          mMaxPreLoadD = p0.mMaxPreLoadDurationMs;
       }
       return p0.copy(mStartAfterO, mMaxPreLoadD);
    }
    public final long component1(){
       return this.mStartAfterOpenMs;
    }
    public final long component2(){
       return this.mMaxPreLoadDurationMs;
    }
    public final NearbyPreLoadInfo copy(long p0,long p1){
       if (PatchProxy.isSupport(NearbyPreLoadInfo.class)) {
          Object obj = PatchProxy.applyTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, NearbyPreLoadInfo.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new NearbyPreLoadInfo(p0, p1);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof NearbyPreLoadInfo && (!this.mStartAfterOpenMs - p0.mStartAfterOpenMs && !this.mMaxPreLoadDurationMs - p0.mMaxPreLoadDurationMs))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       NearbyPreLoadInfo obj = PatchProxy.apply(null, this, NearbyPreLoadInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mStartAfterOpenMs;
       NearbyPreLoadInfo tmMaxPreLoad = this.mMaxPreLoadDurationMs;
       return (((int)(obj ^ (obj >> 32)) * 31) + (int)(tmMaxPreLoad ^ (tmMaxPreLoad >> 32)));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, NearbyPreLoadInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "NearbyPreLoadInfo\(mStartAfterOpenMs="+this.mStartAfterOpenMs+", mMaxPreLoadDurationMs="+this.mMaxPreLoadDurationMs+"\)";
    }
}
