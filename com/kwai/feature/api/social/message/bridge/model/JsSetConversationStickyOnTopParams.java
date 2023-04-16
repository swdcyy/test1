package com.kwai.feature.api.social.message.bridge.model.JsSetConversationStickyOnTopParams;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class JsSetConversationStickyOnTopParams implements Serializable	// class@001137
{
    public final String callback;
    public final String conversationId;
    public int conversationType;
    public final boolean isStickOnTop;
    public final String subBiz;

    public void JsSetConversationStickyOnTopParams(String p0,int p1,String p2,boolean p3,String p4){
       super();
       this.subBiz = p0;
       this.conversationType = p1;
       this.conversationId = p2;
       this.isStickOnTop = p3;
       this.callback = p4;
    }
    public static JsSetConversationStickyOnTopParams copy$default(JsSetConversationStickyOnTopParams p0,String p1,int p2,String p3,boolean p4,String p5,int p6,Object p7){
       JsSetConversationStickyOnTopParams subBiz;
       JsSetConversationStickyOnTopParams conversation;
       JsSetConversationStickyOnTopParams conversation1;
       JsSetConversationStickyOnTopParams isStickOnTop;
       JsSetConversationStickyOnTopParams callback;
       if (p6 & 0x01) {
          subBiz = p0.subBiz;
       }
       if (p6 & 0x02) {
          conversation = p0.conversationType;
       }
       p7 = conversation;
       if (p6 & 0x04) {
          conversation1 = p0.conversationId;
       }
       JsSetConversationStickyOnTopParams jsSetConvers = conversation1;
       if (p6 & 0x08) {
          isStickOnTop = p0.isStickOnTop;
       }
       JsSetConversationStickyOnTopParams jsSetConvers1 = isStickOnTop;
       if (p6 & 0x10) {
          callback = p0.callback;
       }
       return p0.copy(subBiz, p7, jsSetConvers, jsSetConvers1, callback);
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
    public final boolean component4(){
       return this.isStickOnTop;
    }
    public final String component5(){
       return this.callback;
    }
    public final JsSetConversationStickyOnTopParams copy(String p0,int p1,String p2,boolean p3,String p4){
       Object obj;
       if (PatchProxy.isSupport(JsSetConversationStickyOnTopParams.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),p2,Boolean.valueOf(p3),p4};
          obj = PatchProxy.apply(objArray, this, JsSetConversationStickyOnTopParams.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       JsSetConversationStickyOnTopParams jsSetConvers = new JsSetConversationStickyOnTopParams(p0, p1, p2, p3, p4);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, JsSetConversationStickyOnTopParams.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof JsSetConversationStickyOnTopParams && (a.g(this.subBiz, p0.subBiz) && (this.conversationType == p0.conversationType && (a.g(this.conversationId, p0.conversationId) && (this.isStickOnTop == p0.isStickOnTop && a.g(this.callback, p0.callback))))))) {
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
       JsSetConversationStickyOnTopParams obj = PatchProxy.apply(null, this, JsSetConversationStickyOnTopParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.subBiz;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = ((i1 * 31) + this.conversationType) * 31;
       JsSetConversationStickyOnTopParams tconversatio = this.conversationId;
       int i2 = (tconversatio != null)? tconversatio.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tconversatio = this.isStickOnTop;
       if (tconversatio != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tconversatio = this.callback;
       if (tconversatio != null) {
          i = tconversatio.hashCode();
       }
       return (i1 + i);
    }
    public final boolean isStickOnTop(){
       return this.isStickOnTop;
    }
    public final void setConversationType(int p0){
       this.conversationType = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, JsSetConversationStickyOnTopParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "JsSetConversationStickyOnTopParams\(subBiz="+this.subBiz+", conversationType="+this.conversationType+", conversationId="+this.conversationId+", isStickOnTop="+this.isStickOnTop+", callback="+this.callback+"\)";
    }
}
