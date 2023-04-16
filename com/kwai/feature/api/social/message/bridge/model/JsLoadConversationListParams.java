package com.kwai.feature.api.social.message.bridge.model.JsLoadConversationListParams;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class JsLoadConversationListParams implements Serializable	// class@001132
{
    public final String callback;
    public final int category;
    public final String subBiz;

    public void JsLoadConversationListParams(String p0,int p1,String p2){
       super();
       this.subBiz = p0;
       this.category = p1;
       this.callback = p2;
    }
    public static JsLoadConversationListParams copy$default(JsLoadConversationListParams p0,String p1,int p2,String p3,int p4,Object p5){
       JsLoadConversationListParams subBiz;
       JsLoadConversationListParams category;
       JsLoadConversationListParams callback;
       if (p4 & 0x01) {
          subBiz = p0.subBiz;
       }
       if (p4 & 0x02) {
          category = p0.category;
       }
       if (p4 & 0x04) {
          callback = p0.callback;
       }
       return p0.copy(subBiz, category, callback);
    }
    public final String component1(){
       return this.subBiz;
    }
    public final int component2(){
       return this.category;
    }
    public final String component3(){
       return this.callback;
    }
    public final JsLoadConversationListParams copy(String p0,int p1,String p2){
       if (PatchProxy.isSupport(JsLoadConversationListParams.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, JsLoadConversationListParams.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new JsLoadConversationListParams(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, JsLoadConversationListParams.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof JsLoadConversationListParams && (a.g(this.subBiz, p0.subBiz) && (this.category == p0.category && a.g(this.callback, p0.callback))))) {
          return true;
       }
       return false;
    }
    public final String getCallback(){
       return this.callback;
    }
    public final int getCategory(){
       return this.category;
    }
    public final String getSubBiz(){
       return this.subBiz;
    }
    public int hashCode(){
       JsLoadConversationListParams obj = PatchProxy.apply(null, this, JsLoadConversationListParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.subBiz;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = ((i1 * 31) + this.category) * 31;
       JsLoadConversationListParams tcallback = this.callback;
       if (tcallback != null) {
          i = tcallback.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, JsLoadConversationListParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "JsLoadConversationListParams\(subBiz="+this.subBiz+", category="+this.category+", callback="+this.callback+"\)";
    }
}
