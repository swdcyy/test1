package com.kwai.feature.api.social.message.bridge.model.JsJumpToSessionWhiteListParams;
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

public final class JsJumpToSessionWhiteListParams implements Serializable	// class@001131
{
    public final String callback;
    public final String conversationId;
    public final int conversationType;
    public final String subBiz;

    public void JsJumpToSessionWhiteListParams(String p0,int p1,String p2,String p3){
       super();
       this.conversationId = p0;
       this.conversationType = p1;
       this.subBiz = p2;
       this.callback = p3;
    }
    public static JsJumpToSessionWhiteListParams copy$default(JsJumpToSessionWhiteListParams p0,String p1,int p2,String p3,String p4,int p5,Object p6){
       JsJumpToSessionWhiteListParams conversation;
       JsJumpToSessionWhiteListParams conversation1;
       JsJumpToSessionWhiteListParams subBiz;
       JsJumpToSessionWhiteListParams callback;
       if (p5 & 0x01) {
          conversation = p0.conversationId;
       }
       if (p5 & 0x02) {
          conversation1 = p0.conversationType;
       }
       if (p5 & 0x04) {
          subBiz = p0.subBiz;
       }
       if (p5 & 0x08) {
          callback = p0.callback;
       }
       return p0.copy(conversation, conversation1, subBiz, callback);
    }
    public final String component1(){
       return this.conversationId;
    }
    public final int component2(){
       return this.conversationType;
    }
    public final String component3(){
       return this.subBiz;
    }
    public final String component4(){
       return this.callback;
    }
    public final JsJumpToSessionWhiteListParams copy(String p0,int p1,String p2,String p3){
       if (PatchProxy.isSupport(JsJumpToSessionWhiteListParams.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), p2, p3, this, JsJumpToSessionWhiteListParams.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new JsJumpToSessionWhiteListParams(p0, p1, p2, p3);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, JsJumpToSessionWhiteListParams.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof JsJumpToSessionWhiteListParams && (a.g(this.conversationId, p0.conversationId) && (this.conversationType == p0.conversationType && (a.g(this.subBiz, p0.subBiz) && a.g(this.callback, p0.callback)))))) {
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
       JsJumpToSessionWhiteListParams obj = PatchProxy.apply(null, this, JsJumpToSessionWhiteListParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.conversationId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = ((i1 * 31) + this.conversationType) * 31;
       JsJumpToSessionWhiteListParams tsubBiz = this.subBiz;
       int i2 = (tsubBiz != null)? tsubBiz.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tsubBiz = this.callback;
       if (tsubBiz != null) {
          i = tsubBiz.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, JsJumpToSessionWhiteListParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "JsJumpToSessionWhiteListParams\(conversationId="+this.conversationId+", conversationType="+this.conversationType+", subBiz="+this.subBiz+", callback="+this.callback+"\)";
    }
}
