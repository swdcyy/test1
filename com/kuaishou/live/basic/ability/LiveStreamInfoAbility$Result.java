package com.kuaishou.live.basic.ability.LiveStreamInfoAbility$Result;
import java.lang.Object;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveStreamInfoAbility$Result	// class@000c8d
{
    public int code;
    public final Object value;

    public void LiveStreamInfoAbility$Result(int p0,Object p1){
       super();
       this.code = p0;
       this.value = p1;
    }
    public void LiveStreamInfoAbility$Result(int p0,Object p1,int p2,u p3){
       if (p2 & 0x02) {
          p1 = null;
       }
       super(p0, p1);
       return;
    }
    public static LiveStreamInfoAbility$Result copy$default(LiveStreamInfoAbility$Result p0,int p1,Object p2,int p3,Object p4){
       LiveStreamInfoAbility$Result code;
       if (p3 & 0x01) {
          code = p0.code;
       }
       if (p3 & 0x02) {
          p2 = p0.value;
       }
       return p0.copy(code, p2);
    }
    public final int component1(){
       return this.code;
    }
    public final Object component2(){
       return this.value;
    }
    public final LiveStreamInfoAbility$Result copy(int p0,Object p1){
       LiveStreamInfoAbility$Result result = LiveStreamInfoAbility$Result.class;
       if (PatchProxy.isSupport(result)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, result, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new LiveStreamInfoAbility$Result(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveStreamInfoAbility$Result.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveStreamInfoAbility$Result && (this.code == p0.code && a.g(this.value, p0.value)))) {
          return true;
       }
       return false;
    }
    public final int getCode(){
       return this.code;
    }
    public final Object getValue(){
       return this.value;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, LiveStreamInfoAbility$Result.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.code * 31;
       LiveStreamInfoAbility$Result tvalue = this.value;
       int i1 = (tvalue != null)? tvalue.hashCode(): 0;
       return (i + i1);
    }
    public final void setCode(int p0){
       this.code = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveStreamInfoAbility$Result.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Result\(code="+this.code+", value="+this.value+"\)";
    }
}
