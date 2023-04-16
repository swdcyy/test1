package com.kuaishou.live.bridge.commands.CustomEvent;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class CustomEvent implements Serializable	// class@000dea
{
    public final String key;
    public final String value;

    public void CustomEvent(String p0,String p1){
       super();
       this.key = p0;
       this.value = p1;
    }
    public static CustomEvent copy$default(CustomEvent p0,String p1,String p2,int p3,Object p4){
       CustomEvent key;
       CustomEvent value;
       if (p3 & 0x01) {
          key = p0.key;
       }
       if (p3 & 0x02) {
          value = p0.value;
       }
       return p0.copy(key, value);
    }
    public final String component1(){
       return this.key;
    }
    public final String component2(){
       return this.value;
    }
    public final CustomEvent copy(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, CustomEvent.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new CustomEvent(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CustomEvent.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof CustomEvent && (a.g(this.key, p0.key) && a.g(this.value, p0.value)))) {
          return true;
       }
       return false;
    }
    public final String getKey(){
       return this.key;
    }
    public final String getValue(){
       return this.value;
    }
    public int hashCode(){
       CustomEvent obj = PatchProxy.apply(null, this, CustomEvent.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.key;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       CustomEvent tvalue = this.value;
       if (tvalue != null) {
          i = tvalue.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, CustomEvent.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "CustomEvent\(key="+this.key+", value="+this.value+"\)";
    }
}
