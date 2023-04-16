package com.kuaishou.activity.kwaibubble.krn.bridge.JsKwaiPopParams;
import java.io.Serializable;
import com.kuaishou.activity.kwaibubble.krn.bridge.JsKwaiPopParams$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class JsKwaiPopParams implements Serializable	// class@00077e
{
    public final String name;
    public final String params;
    public static final JsKwaiPopParams$a Companion;
    public static final long serialVersionUID;

    static {
       JsKwaiPopParams.Companion = new JsKwaiPopParams$a(null);
    }
    public void JsKwaiPopParams(){
       super(null, null, 3, null);
    }
    public void JsKwaiPopParams(String p0,String p1){
       a.p(p0, "name");
       a.p(p1, "params");
       super();
       this.name = p0;
       this.params = p1;
    }
    public void JsKwaiPopParams(String p0,String p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = "";
       }
       if (p2 & 0x02) {
          p1 = "{}";
       }
       super(p0, p1);
       return;
    }
    public static JsKwaiPopParams copy$default(JsKwaiPopParams p0,String p1,String p2,int p3,Object p4){
       JsKwaiPopParams name;
       JsKwaiPopParams params;
       if (p3 & 0x01) {
          name = p0.name;
       }
       if (p3 & 0x02) {
          params = p0.params;
       }
       return p0.copy(name, params);
    }
    public final String component1(){
       return this.name;
    }
    public final String component2(){
       return this.params;
    }
    public final JsKwaiPopParams copy(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, JsKwaiPopParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "name");
       a.p(p1, "params");
       return new JsKwaiPopParams(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, JsKwaiPopParams.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof JsKwaiPopParams && (a.g(this.name, p0.name) && a.g(this.params, p0.params)))) {
          return true;
       }
       return false;
    }
    public final String getName(){
       return this.name;
    }
    public final String getParams(){
       return this.params;
    }
    public int hashCode(){
       JsKwaiPopParams obj = PatchProxy.apply(null, this, JsKwaiPopParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.name;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       JsKwaiPopParams tparams = this.params;
       if (tparams != null) {
          i = tparams.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, JsKwaiPopParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "JsKwaiPopParams\(name="+this.name+", params="+this.params+"\)";
    }
}
