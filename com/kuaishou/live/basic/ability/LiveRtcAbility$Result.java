package com.kuaishou.live.basic.ability.LiveRtcAbility$Result;
import java.lang.String;
import java.lang.Object;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveRtcAbility$Result	// class@000c7f
{
    public int code;
    public final String message;

    public void LiveRtcAbility$Result(int p0,String p1){
       super();
       this.code = p0;
       this.message = p1;
    }
    public void LiveRtcAbility$Result(int p0,String p1,int p2,u p3){
       if (p2 & 0x02) {
          p1 = null;
       }
       super(p0, p1);
       return;
    }
    public static LiveRtcAbility$Result copy$default(LiveRtcAbility$Result p0,int p1,String p2,int p3,Object p4){
       LiveRtcAbility$Result code;
       LiveRtcAbility$Result message;
       if (p3 & 0x01) {
          code = p0.code;
       }
       if (p3 & 0x02) {
          message = p0.message;
       }
       return p0.copy(code, message);
    }
    public final int component1(){
       return this.code;
    }
    public final String component2(){
       return this.message;
    }
    public final LiveRtcAbility$Result copy(int p0,String p1){
       LiveRtcAbility$Result result = LiveRtcAbility$Result.class;
       if (PatchProxy.isSupport(result)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, result, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new LiveRtcAbility$Result(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveRtcAbility$Result.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveRtcAbility$Result && (this.code == p0.code && a.g(this.message, p0.message)))) {
          return true;
       }
       return false;
    }
    public final int getCode(){
       return this.code;
    }
    public final String getMessage(){
       return this.message;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, LiveRtcAbility$Result.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.code * 31;
       LiveRtcAbility$Result tmessage = this.message;
       int i1 = (tmessage != null)? tmessage.hashCode(): 0;
       return (i + i1);
    }
    public final void setCode(int p0){
       this.code = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveRtcAbility$Result.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Result\(code="+this.code+", message="+this.message+"\)";
    }
}
