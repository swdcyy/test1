package com.kuaishou.live.basic.ability.LiveMagicFaceEventCaptureAbility$Result;
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

public final class LiveMagicFaceEventCaptureAbility$Result	// class@000c6a
{
    public final int code;
    public final String message;
    public final Object value;

    public void LiveMagicFaceEventCaptureAbility$Result(int p0,String p1,Object p2){
       super();
       this.code = p0;
       this.message = p1;
       this.value = p2;
    }
    public void LiveMagicFaceEventCaptureAbility$Result(int p0,String p1,Object p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = null;
       }
       super(p0, p1, p2);
       return;
    }
    public static LiveMagicFaceEventCaptureAbility$Result copy$default(LiveMagicFaceEventCaptureAbility$Result p0,int p1,String p2,Object p3,int p4,Object p5){
       LiveMagicFaceEventCaptureAbility$Result code;
       LiveMagicFaceEventCaptureAbility$Result message;
       if (p4 & 0x01) {
          code = p0.code;
       }
       if (p4 & 0x02) {
          message = p0.message;
       }
       if (p4 & 0x04) {
          p3 = p0.value;
       }
       return p0.copy(code, message, p3);
    }
    public final int component1(){
       return this.code;
    }
    public final String component2(){
       return this.message;
    }
    public final Object component3(){
       return this.value;
    }
    public final LiveMagicFaceEventCaptureAbility$Result copy(int p0,String p1,Object p2){
       if (PatchProxy.isSupport(LiveMagicFaceEventCaptureAbility$Result.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, this, LiveMagicFaceEventCaptureAbility$Result.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new LiveMagicFaceEventCaptureAbility$Result(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveMagicFaceEventCaptureAbility$Result.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveMagicFaceEventCaptureAbility$Result && (this.code == p0.code && (a.g(this.message, p0.message) && a.g(this.value, p0.value))))) {
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
    public final Object getValue(){
       return this.value;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, LiveMagicFaceEventCaptureAbility$Result.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.code * 31;
       LiveMagicFaceEventCaptureAbility$Result tmessage = this.message;
       int i1 = 0;
       int i2 = (tmessage != null)? tmessage.hashCode(): 0;
       i = (i + i2) * 31;
       tmessage = this.value;
       if (tmessage != null) {
          i1 = tmessage.hashCode();
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveMagicFaceEventCaptureAbility$Result.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Result\(code="+this.code+", message="+this.message+", value="+this.value+"\)";
    }
}
