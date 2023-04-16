package com.kuaishou.live.basic.ability.LiveServerTimeAbility$Result;
import java.lang.Long;
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

public final class LiveServerTimeAbility$Result	// class@000c83
{
    public Long time;

    public void LiveServerTimeAbility$Result(){
       super(null, 1, null);
    }
    public void LiveServerTimeAbility$Result(Long p0){
       super();
       this.time = p0;
    }
    public void LiveServerTimeAbility$Result(Long p0,int p1,u p2){
       if (p1 & 0x01) {
          p0 = Long.valueOf(0);
       }
       super(p0);
       return;
    }
    public static LiveServerTimeAbility$Result copy$default(LiveServerTimeAbility$Result p0,Long p1,int p2,Object p3){
       LiveServerTimeAbility$Result time;
       if (p2 & 0x01) {
          time = p0.time;
       }
       return p0.copy(time);
    }
    public final Long component1(){
       return this.time;
    }
    public final LiveServerTimeAbility$Result copy(Long p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveServerTimeAbility$Result.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveServerTimeAbility$Result(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveServerTimeAbility$Result.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveServerTimeAbility$Result && a.g(this.time, p0.time))) {
          return true;
       }
       return false;
    }
    public final Long getTime(){
       return this.time;
    }
    public int hashCode(){
       LiveServerTimeAbility$Result obj = PatchProxy.apply(null, this, LiveServerTimeAbility$Result.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.time;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public final void setTime(Long p0){
       this.time = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveServerTimeAbility$Result.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Result\(time="+this.time+"\)";
    }
}
