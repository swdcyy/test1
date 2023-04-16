package com.kwai.feature.api.social.message.bridge.model.JSGetOriginUrlParams;
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

public final class JSGetOriginUrlParams implements Serializable	// class@001122
{
    public final String callback;
    public final String ksUri;

    public void JSGetOriginUrlParams(String p0,String p1){
       super();
       this.ksUri = p0;
       this.callback = p1;
    }
    public static JSGetOriginUrlParams copy$default(JSGetOriginUrlParams p0,String p1,String p2,int p3,Object p4){
       JSGetOriginUrlParams ksUri;
       JSGetOriginUrlParams callback;
       if (p3 & 0x01) {
          ksUri = p0.ksUri;
       }
       if (p3 & 0x02) {
          callback = p0.callback;
       }
       return p0.copy(ksUri, callback);
    }
    public final String component1(){
       return this.ksUri;
    }
    public final String component2(){
       return this.callback;
    }
    public final JSGetOriginUrlParams copy(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, JSGetOriginUrlParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new JSGetOriginUrlParams(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, JSGetOriginUrlParams.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof JSGetOriginUrlParams && (a.g(this.ksUri, p0.ksUri) && a.g(this.callback, p0.callback)))) {
          return true;
       }
       return false;
    }
    public final String getCallback(){
       return this.callback;
    }
    public final String getKsUri(){
       return this.ksUri;
    }
    public int hashCode(){
       JSGetOriginUrlParams obj = PatchProxy.apply(null, this, JSGetOriginUrlParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.ksUri;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       JSGetOriginUrlParams tcallback = this.callback;
       if (tcallback != null) {
          i = tcallback.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, JSGetOriginUrlParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "JSGetOriginUrlParams\(ksUri="+this.ksUri+", callback="+this.callback+"\)";
    }
}
