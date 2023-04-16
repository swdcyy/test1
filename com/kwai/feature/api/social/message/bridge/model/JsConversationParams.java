package com.kwai.feature.api.social.message.bridge.model.JsConversationParams;
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

public final class JsConversationParams implements Serializable	// class@001124
{
    public final String callback;
    public final String conversationId;
    public final int conversationType;
    public final String subBiz;

    public void JsConversationParams(String p0,int p1,String p2,String p3){
       super();
       this.subBiz = p0;
       this.conversationType = p1;
       this.conversationId = p2;
       this.callback = p3;
    }
    public static JsConversationParams copy$default(JsConversationParams p0,String p1,int p2,String p3,String p4,int p5,Object p6){
       JsConversationParams subBiz;
       JsConversationParams conversation;
       JsConversationParams conversation1;
       JsConversationParams callback;
       if (p5 & 0x01) {
          subBiz = p0.subBiz;
       }
       if (p5 & 0x02) {
          conversation = p0.conversationType;
       }
       if (p5 & 0x04) {
          conversation1 = p0.conversationId;
       }
       if (p5 & 0x08) {
          callback = p0.callback;
       }
       return p0.copy(subBiz, conversation, conversation1, callback);
    }
    public final String component1(){
       return this.subBiz;
    }
    public final int component2(){
       return this.conversationType;
    }
    public final String component3(){
       return this.conversationId;
    }
    public final String component4(){
       return this.callback;
    }
    public final JsConversationParams copy(String p0,int p1,String p2,String p3){
       if (PatchProxy.isSupport(JsConversationParams.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), p2, p3, this, JsConversationParams.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new JsConversationParams(p0, p1, p2, p3);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, JsConversationParams.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof JsConversationParams && (a.g(this.subBiz, p0.subBiz) && (this.conversationType == p0.conversationType && (a.g(this.conversationId, p0.conversationId) && a.g(this.callback, p0.callback)))))) {
          return true;
       }
       return false;
    }
    public final String getCallback(){
       return this.callback;
    }
    public final String getConversationId(){
       return this.conversationId;
    }
    public final int getConversationType(){
       return this.conversationType;
    }
    public final String getSubBiz(){
       return this.subBiz;
    }
    public int hashCode(){
       JsConversationParams obj = PatchProxy.apply(null, this, JsConversationParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.subBiz;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = ((i1 * 31) + this.conversationType) * 31;
       JsConversationParams tconversatio = this.conversationId;
       int i2 = (tconversatio != null)? tconversatio.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tconversatio = this.callback;
       if (tconversatio != null) {
          i = tconversatio.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, JsConversationParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "JsConversationParams\(subBiz="+this.subBiz+", conversationType="+this.conversationType+", conversationId="+this.conversationId+", callback="+this.callback+"\)";
    }
}
