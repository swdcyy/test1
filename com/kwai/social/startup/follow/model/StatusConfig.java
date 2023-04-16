package com.kwai.social.startup.follow.model.StatusConfig;
import java.io.Serializable;
import java.lang.Object;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class StatusConfig implements Serializable	// class@0018a9
{
    public final boolean enableMood;
    public long moodValidDuration;

    public void StatusConfig(long p0,boolean p1){
       super();
       this.moodValidDuration = p0;
       this.enableMood = p1;
    }
    public void StatusConfig(long p0,boolean p1,int p2,u p3){
       if (p2 & 0x02) {
          p1 = false;
       }
       super(p0, p1);
       return;
    }
    public static StatusConfig copy$default(StatusConfig p0,long p1,boolean p2,int p3,Object p4){
       StatusConfig moodValidDur;
       StatusConfig enableMood;
       if (p3 & 0x01) {
          moodValidDur = p0.moodValidDuration;
       }
       if (p3 & 0x02) {
          enableMood = p0.enableMood;
       }
       return p0.copy(moodValidDur, enableMood);
    }
    public final long component1(){
       return this.moodValidDuration;
    }
    public final boolean component2(){
       return this.enableMood;
    }
    public final StatusConfig copy(long p0,boolean p1){
       if (PatchProxy.isSupport(StatusConfig.class)) {
          Object obj = PatchProxy.applyTwoRefs(Long.valueOf(p0), Boolean.valueOf(p1), this, StatusConfig.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new StatusConfig(p0, p1);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof StatusConfig && (!this.moodValidDuration - p0.moodValidDuration && this.enableMood == p0.enableMood))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       int i1;
       StatusConfig obj = PatchProxy.apply(null, this, StatusConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.moodValidDuration;
       int i = (int)(obj ^ (obj >> 32)) * 31;
       obj = this.enableMood;
       if (obj != null) {
          i1 = 1;
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, StatusConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "StatusConfig\(moodValidDuration="+this.moodValidDuration+", enableMood="+this.enableMood+"\)";
    }
}
