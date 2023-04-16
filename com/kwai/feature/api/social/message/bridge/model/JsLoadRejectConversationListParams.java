package com.kwai.feature.api.social.message.bridge.model.JsLoadRejectConversationListParams;
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

public final class JsLoadRejectConversationListParams implements Serializable	// class@001133
{
    public final String callback;
    public final String offset;
    public final int pageSize;
    public final String subBiz;

    public void JsLoadRejectConversationListParams(String p0,String p1,int p2,String p3){
       super();
       this.subBiz = p0;
       this.offset = p1;
       this.pageSize = p2;
       this.callback = p3;
    }
    public static JsLoadRejectConversationListParams copy$default(JsLoadRejectConversationListParams p0,String p1,String p2,int p3,String p4,int p5,Object p6){
       JsLoadRejectConversationListParams subBiz;
       JsLoadRejectConversationListParams offset;
       JsLoadRejectConversationListParams pageSize;
       JsLoadRejectConversationListParams callback;
       if (p5 & 0x01) {
          subBiz = p0.subBiz;
       }
       if (p5 & 0x02) {
          offset = p0.offset;
       }
       if (p5 & 0x04) {
          pageSize = p0.pageSize;
       }
       if (p5 & 0x08) {
          callback = p0.callback;
       }
       return p0.copy(subBiz, offset, pageSize, callback);
    }
    public final String component1(){
       return this.subBiz;
    }
    public final String component2(){
       return this.offset;
    }
    public final int component3(){
       return this.pageSize;
    }
    public final String component4(){
       return this.callback;
    }
    public final JsLoadRejectConversationListParams copy(String p0,String p1,int p2,String p3){
       if (PatchProxy.isSupport(JsLoadRejectConversationListParams.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), p3, this, JsLoadRejectConversationListParams.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new JsLoadRejectConversationListParams(p0, p1, p2, p3);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, JsLoadRejectConversationListParams.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof JsLoadRejectConversationListParams && (a.g(this.subBiz, p0.subBiz) && (a.g(this.offset, p0.offset) && (this.pageSize == p0.pageSize && a.g(this.callback, p0.callback)))))) {
          return true;
       }
       return false;
    }
    public final String getCallback(){
       return this.callback;
    }
    public final String getOffset(){
       return this.offset;
    }
    public final int getPageSize(){
       return this.pageSize;
    }
    public final String getSubBiz(){
       return this.subBiz;
    }
    public int hashCode(){
       JsLoadRejectConversationListParams obj = PatchProxy.apply(null, this, JsLoadRejectConversationListParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.subBiz;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       JsLoadRejectConversationListParams toffset = this.offset;
       int i2 = (toffset != null)? toffset.hashCode(): 0;
       i1 = (((i1 + i2) * 31) + this.pageSize) * 31;
       toffset = this.callback;
       if (toffset != null) {
          i = toffset.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, JsLoadRejectConversationListParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "JsLoadRejectConversationListParams\(subBiz="+this.subBiz+", offset="+this.offset+", pageSize="+this.pageSize+", callback="+this.callback+"\)";
    }
}
