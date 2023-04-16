package com.kwai.feature.api.social.message.bridge.model.JsSetEnableIMTipParams;
import java.io.Serializable;
import java.lang.Boolean;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class JsSetEnableIMTipParams implements Serializable	// class@001138
{
    public final String callback;
    public final Boolean enabled;

    public void JsSetEnableIMTipParams(Boolean p0,String p1){
       super();
       this.enabled = p0;
       this.callback = p1;
    }
    public static JsSetEnableIMTipParams copy$default(JsSetEnableIMTipParams p0,Boolean p1,String p2,int p3,Object p4){
       JsSetEnableIMTipParams enabled;
       JsSetEnableIMTipParams callback;
       if (p3 & 0x01) {
          enabled = p0.enabled;
       }
       if (p3 & 0x02) {
          callback = p0.callback;
       }
       return p0.copy(enabled, callback);
    }
    public final Boolean component1(){
       return this.enabled;
    }
    public final String component2(){
       return this.callback;
    }
    public final JsSetEnableIMTipParams copy(Boolean p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, JsSetEnableIMTipParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new JsSetEnableIMTipParams(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, JsSetEnableIMTipParams.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof JsSetEnableIMTipParams && (a.g(this.enabled, p0.enabled) && a.g(this.callback, p0.callback)))) {
          return true;
       }
       return false;
    }
    public final String getCallback(){
       return this.callback;
    }
    public final Boolean getEnabled(){
       return this.enabled;
    }
    public int hashCode(){
       JsSetEnableIMTipParams obj = PatchProxy.apply(null, this, JsSetEnableIMTipParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.enabled;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       JsSetEnableIMTipParams tcallback = this.callback;
       if (tcallback != null) {
          i = tcallback.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, JsSetEnableIMTipParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "JsSetEnableIMTipParams\(enabled="+this.enabled+", callback="+this.callback+"\)";
    }
}
