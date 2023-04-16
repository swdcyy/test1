package com.kuaishou.live.common.core.component.effect.renderer.ReceivedData;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import com.google.gson.JsonObject;
import java.lang.StringBuilder;

public final class ReceivedData	// class@0010ec
{
    public final String ability;
    public final String method;
    public final JsonObject params;

    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReceivedData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof ReceivedData && (a.g(this.ability, p0.ability) && (a.g(this.method, p0.method) && a.g(this.params, p0.params))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       ReceivedData obj = PatchProxy.apply(null, this, ReceivedData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.ability;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       ReceivedData tmethod = this.method;
       int i2 = (tmethod != null)? tmethod.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmethod = this.params;
       if (tmethod != null) {
          i = tmethod.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ReceivedData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ReceivedData\(ability="+this.ability+", method="+this.method+", params="+this.params+"\)";
    }
}
