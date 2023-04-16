package com.yxcorp.gifshow.commoninsertcard.entity.CommonCardEvent;
import java.io.Serializable;
import java.lang.String;
import com.google.gson.JsonObject;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class CommonCardEvent implements Serializable	// class@001198
{
    public final String key;
    public final JsonObject value;

    public void CommonCardEvent(String p0,JsonObject p1){
       super();
       this.key = p0;
       this.value = p1;
    }
    public static CommonCardEvent copy$default(CommonCardEvent p0,String p1,JsonObject p2,int p3,Object p4){
       CommonCardEvent key;
       CommonCardEvent value;
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
    public final JsonObject component2(){
       return this.value;
    }
    public final CommonCardEvent copy(String p0,JsonObject p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, CommonCardEvent.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new CommonCardEvent(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CommonCardEvent.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof CommonCardEvent && (a.g(this.key, p0.key) && a.g(this.value, p0.value)))) {
          return true;
       }
       return false;
    }
    public final String getKey(){
       return this.key;
    }
    public final JsonObject getValue(){
       return this.value;
    }
    public int hashCode(){
       CommonCardEvent obj = PatchProxy.apply(null, this, CommonCardEvent.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.key;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       CommonCardEvent tvalue = this.value;
       if (tvalue != null) {
          i = tvalue.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, CommonCardEvent.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "CommonCardEvent\(key="+this.key+", value="+this.value+"\)";
    }
}
