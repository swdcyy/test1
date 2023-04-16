package com.kuaishou.live.basic.ability.LiveRouterAbility$Result;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveRouterAbility$Result	// class@000c7a
{
    public int code;
    public String message;

    public void LiveRouterAbility$Result(int p0,String p1){
       a.p(p1, "message");
       super();
       this.code = p0;
       this.message = p1;
    }
    public static LiveRouterAbility$Result copy$default(LiveRouterAbility$Result p0,int p1,String p2,int p3,Object p4){
       LiveRouterAbility$Result code;
       LiveRouterAbility$Result message;
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
    public final LiveRouterAbility$Result copy(int p0,String p1){
       LiveRouterAbility$Result result = LiveRouterAbility$Result.class;
       if (PatchProxy.isSupport(result)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, result, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "message");
       return new LiveRouterAbility$Result(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveRouterAbility$Result.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveRouterAbility$Result && (this.code == p0.code && a.g(this.message, p0.message)))) {
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
       Object obj = PatchProxy.apply(null, this, LiveRouterAbility$Result.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.code * 31;
       LiveRouterAbility$Result tmessage = this.message;
       int i1 = (tmessage != null)? tmessage.hashCode(): 0;
       return (i + i1);
    }
    public final void setCode(int p0){
       this.code = p0;
    }
    public final void setMessage(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveRouterAbility$Result.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.message = p0;
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveRouterAbility$Result.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Result\(code="+this.code+", message="+this.message+"\)";
    }
}
