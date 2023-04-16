package com.kwai.feature.api.social.message.bridge.model.JsEnableRedDotRestrainParams;
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

public final class JsEnableRedDotRestrainParams implements Serializable	// class@001125
{
    public final String callback;
    public final String category;
    public final String subBiz;

    public void JsEnableRedDotRestrainParams(String p0,String p1,String p2){
       super();
       this.category = p0;
       this.subBiz = p1;
       this.callback = p2;
    }
    public static JsEnableRedDotRestrainParams copy$default(JsEnableRedDotRestrainParams p0,String p1,String p2,String p3,int p4,Object p5){
       JsEnableRedDotRestrainParams category;
       JsEnableRedDotRestrainParams subBiz;
       JsEnableRedDotRestrainParams callback;
       if (p4 & 0x01) {
          category = p0.category;
       }
       if (p4 & 0x02) {
          subBiz = p0.subBiz;
       }
       if (p4 & 0x04) {
          callback = p0.callback;
       }
       return p0.copy(category, subBiz, callback);
    }
    public final String component1(){
       return this.category;
    }
    public final String component2(){
       return this.subBiz;
    }
    public final String component3(){
       return this.callback;
    }
    public final JsEnableRedDotRestrainParams copy(String p0,String p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, JsEnableRedDotRestrainParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new JsEnableRedDotRestrainParams(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, JsEnableRedDotRestrainParams.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof JsEnableRedDotRestrainParams && (a.g(this.category, p0.category) && (a.g(this.subBiz, p0.subBiz) && a.g(this.callback, p0.callback))))) {
          return true;
       }
       return false;
    }
    public final String getCallback(){
       return this.callback;
    }
    public final String getCategory(){
       return this.category;
    }
    public final String getSubBiz(){
       return this.subBiz;
    }
    public int hashCode(){
       JsEnableRedDotRestrainParams obj = PatchProxy.apply(null, this, JsEnableRedDotRestrainParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.category;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       JsEnableRedDotRestrainParams tsubBiz = this.subBiz;
       int i2 = (tsubBiz != null)? tsubBiz.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tsubBiz = this.callback;
       if (tsubBiz != null) {
          i = tsubBiz.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, JsEnableRedDotRestrainParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "JsEnableRedDotRestrainParams\(category="+this.category+", subBiz="+this.subBiz+", callback="+this.callback+"\)";
    }
}
