package com.yxcorp.gifshow.commoninsertcard.entity.CommonCardEventValue;
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

public final class CommonCardEventValue implements Serializable	// class@001199
{
    public final String actionName;
    public final JsonObject params;

    public void CommonCardEventValue(String p0,JsonObject p1){
       super();
       this.actionName = p0;
       this.params = p1;
    }
    public static CommonCardEventValue copy$default(CommonCardEventValue p0,String p1,JsonObject p2,int p3,Object p4){
       CommonCardEventValue actionName;
       CommonCardEventValue params;
       if (p3 & 0x01) {
          actionName = p0.actionName;
       }
       if (p3 & 0x02) {
          params = p0.params;
       }
       return p0.copy(actionName, params);
    }
    public final String component1(){
       return this.actionName;
    }
    public final JsonObject component2(){
       return this.params;
    }
    public final CommonCardEventValue copy(String p0,JsonObject p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, CommonCardEventValue.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new CommonCardEventValue(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CommonCardEventValue.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof CommonCardEventValue && (a.g(this.actionName, p0.actionName) && a.g(this.params, p0.params)))) {
          return true;
       }
       return false;
    }
    public final String getActionName(){
       return this.actionName;
    }
    public final JsonObject getParams(){
       return this.params;
    }
    public int hashCode(){
       CommonCardEventValue obj = PatchProxy.apply(null, this, CommonCardEventValue.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.actionName;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       CommonCardEventValue tparams = this.params;
       if (tparams != null) {
          i = tparams.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, CommonCardEventValue.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "CommonCardEventValue\(actionName="+this.actionName+", params="+this.params+"\)";
    }
}
