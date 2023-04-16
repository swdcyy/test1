package com.kuaishou.liveclient.resourcemanager.preload.policy.PreloadPolicy;
import java.io.Serializable;
import java.util.List;
import nsd.u;
import java.lang.Object;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class PreloadPolicy implements Serializable	// class@001090
{
    public List preloadBanedTimeFrame;
    public long preloadFreqCtrTimeInterval;

    public void PreloadPolicy(){
       super(null, 0, 3, null);
    }
    public void PreloadPolicy(List p0,long p1){
       super();
       this.preloadBanedTimeFrame = p0;
       this.preloadFreqCtrTimeInterval = p1;
    }
    public void PreloadPolicy(List p0,long p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = CollectionsKt__CollectionsKt.E();
       }
       if (p2 & 0x02) {
          p1 = 0;
       }
       super(p0, p1);
       return;
    }
    public static PreloadPolicy copy$default(PreloadPolicy p0,List p1,long p2,int p3,Object p4){
       PreloadPolicy preloadBaned;
       PreloadPolicy preloadFreqC;
       if (p3 & 0x01) {
          preloadBaned = p0.preloadBanedTimeFrame;
       }
       if (p3 & 0x02) {
          preloadFreqC = p0.preloadFreqCtrTimeInterval;
       }
       return p0.copy(preloadBaned, preloadFreqC);
    }
    public final List component1(){
       return this.preloadBanedTimeFrame;
    }
    public final long component2(){
       return this.preloadFreqCtrTimeInterval;
    }
    public final PreloadPolicy copy(List p0,long p1){
       if (PatchProxy.isSupport(PreloadPolicy.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), this, PreloadPolicy.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new PreloadPolicy(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PreloadPolicy.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof PreloadPolicy && (a.g(this.preloadBanedTimeFrame, p0.preloadBanedTimeFrame) && !this.preloadFreqCtrTimeInterval - p0.preloadFreqCtrTimeInterval))) {
          return true;
       }
       return false;
    }
    public final List getPreloadBanedTimeFrame(){
       return this.preloadBanedTimeFrame;
    }
    public final long getPreloadFreqCtrTimeInterval(){
       return this.preloadFreqCtrTimeInterval;
    }
    public int hashCode(){
       PreloadPolicy obj = PatchProxy.apply(null, this, PreloadPolicy.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.preloadBanedTimeFrame;
       int i = (obj != null)? obj.hashCode(): 0;
       PreloadPolicy tpreloadFreq = this.preloadFreqCtrTimeInterval;
       return ((i * 31) + (int)(tpreloadFreq ^ (tpreloadFreq >> 32)));
    }
    public final void setPreloadBanedTimeFrame(List p0){
       this.preloadBanedTimeFrame = p0;
    }
    public final void setPreloadFreqCtrTimeInterval(long p0){
       this.preloadFreqCtrTimeInterval = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PreloadPolicy.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PreloadPolicy\(preloadBanedTimeFrame="+this.preloadBanedTimeFrame+", preloadFreqCtrTimeInterval="+this.preloadFreqCtrTimeInterval+"\)";
    }
}
