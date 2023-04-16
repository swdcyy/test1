package com.kuaishou.live.basic.ability.LiveResourceAbility$Result;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveResourceAbility$Result	// class@000c74
{
    public int code;
    public String message;
    public List paths;

    public void LiveResourceAbility$Result(int p0,String p1,List p2){
       a.p(p1, "message");
       a.p(p2, "paths");
       super();
       this.code = p0;
       this.message = p1;
       this.paths = p2;
    }
    public static LiveResourceAbility$Result copy$default(LiveResourceAbility$Result p0,int p1,String p2,List p3,int p4,Object p5){
       LiveResourceAbility$Result code;
       LiveResourceAbility$Result message;
       LiveResourceAbility$Result paths;
       if (p4 & 0x01) {
          code = p0.code;
       }
       if (p4 & 0x02) {
          message = p0.message;
       }
       if (p4 & 0x04) {
          paths = p0.paths;
       }
       return p0.copy(code, message, paths);
    }
    public final int component1(){
       return this.code;
    }
    public final String component2(){
       return this.message;
    }
    public final List component3(){
       return this.paths;
    }
    public final LiveResourceAbility$Result copy(int p0,String p1,List p2){
       if (PatchProxy.isSupport(LiveResourceAbility$Result.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, this, LiveResourceAbility$Result.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "message");
       a.p(p2, "paths");
       return new LiveResourceAbility$Result(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveResourceAbility$Result.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveResourceAbility$Result && (this.code == p0.code && (a.g(this.message, p0.message) && a.g(this.paths, p0.paths))))) {
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
    public final List getPaths(){
       return this.paths;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, LiveResourceAbility$Result.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.code * 31;
       LiveResourceAbility$Result tmessage = this.message;
       int i1 = 0;
       int i2 = (tmessage != null)? tmessage.hashCode(): 0;
       i = (i + i2) * 31;
       tmessage = this.paths;
       if (tmessage != null) {
          i1 = tmessage.hashCode();
       }
       return (i + i1);
    }
    public final void setCode(int p0){
       this.code = p0;
    }
    public final void setMessage(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveResourceAbility$Result.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.message = p0;
       return;
    }
    public final void setPaths(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveResourceAbility$Result.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.paths = p0;
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveResourceAbility$Result.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Result\(code="+this.code+", message="+this.message+", paths="+this.paths+"\)";
    }
}
