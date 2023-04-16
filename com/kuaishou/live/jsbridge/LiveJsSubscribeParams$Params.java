package com.kuaishou.live.jsbridge.LiveJsSubscribeParams$Params;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveJsSubscribeParams$Params	// class@001d20
{
    public final String message;
    public final Integer messageType;

    public final String a(){
       return this.message;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveJsSubscribeParams$Params.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveJsSubscribeParams$Params && (a.g(this.messageType, p0.messageType) && a.g(this.message, p0.message)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       LiveJsSubscribeParams$Params obj = PatchProxy.apply(null, this, LiveJsSubscribeParams$Params.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.messageType;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LiveJsSubscribeParams$Params tmessage = this.message;
       if (tmessage != null) {
          i = tmessage.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveJsSubscribeParams$Params.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Params\(messageType="+this.messageType+", message="+this.message+"\)";
    }
}
