package com.kuaishou.live.basic.ability.LiveResourceAbility$GetMagicFacePathResult;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveResourceAbility$GetMagicFacePathResult	// class@000c70
{
    public int code;
    public String message;
    public final String path;

    public void LiveResourceAbility$GetMagicFacePathResult(String p0,int p1,String p2){
       a.p(p0, "path");
       a.p(p2, "message");
       super();
       this.path = p0;
       this.code = p1;
       this.message = p2;
    }
    public void LiveResourceAbility$GetMagicFacePathResult(String p0,int p1,String p2,int p3,u p4){
       if (p3 & 0x04) {
          p2 = "";
       }
       super(p0, p1, p2);
       return;
    }
    public static LiveResourceAbility$GetMagicFacePathResult copy$default(LiveResourceAbility$GetMagicFacePathResult p0,String p1,int p2,String p3,int p4,Object p5){
       LiveResourceAbility$GetMagicFacePathResult path;
       LiveResourceAbility$GetMagicFacePathResult code;
       LiveResourceAbility$GetMagicFacePathResult message;
       if (p4 & 0x01) {
          path = p0.path;
       }
       if (p4 & 0x02) {
          code = p0.code;
       }
       if (p4 & 0x04) {
          message = p0.message;
       }
       return p0.copy(path, code, message);
    }
    public final String component1(){
       return this.path;
    }
    public final int component2(){
       return this.code;
    }
    public final String component3(){
       return this.message;
    }
    public final LiveResourceAbility$GetMagicFacePathResult copy(String p0,int p1,String p2){
       if (PatchProxy.isSupport(LiveResourceAbility$GetMagicFacePathResult.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, LiveResourceAbility$GetMagicFacePathResult.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "path");
       a.p(p2, "message");
       return new LiveResourceAbility$GetMagicFacePathResult(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveResourceAbility$GetMagicFacePathResult.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveResourceAbility$GetMagicFacePathResult && (a.g(this.path, p0.path) && (this.code == p0.code && a.g(this.message, p0.message))))) {
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
    public final String getPath(){
       return this.path;
    }
    public int hashCode(){
       LiveResourceAbility$GetMagicFacePathResult obj = PatchProxy.apply(null, this, LiveResourceAbility$GetMagicFacePathResult.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.path;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = ((i1 * 31) + this.code) * 31;
       LiveResourceAbility$GetMagicFacePathResult tmessage = this.message;
       if (tmessage != null) {
          i = tmessage.hashCode();
       }
       return (i1 + i);
    }
    public final void setCode(int p0){
       this.code = p0;
    }
    public final void setMessage(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveResourceAbility$GetMagicFacePathResult.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.message = p0;
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveResourceAbility$GetMagicFacePathResult.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "GetMagicFacePathResult\(path="+this.path+", code="+this.code+", message="+this.message+"\)";
    }
}
