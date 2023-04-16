package com.kwai.feature.api.social.message.bridge.model.JsHandleGroupJoinRequestParams;
import java.io.Serializable;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class JsHandleGroupJoinRequestParams implements Serializable	// class@00112f
{
    public final String auditComment;
    public final String callback;
    public final String groupId;
    public final int groupJoinAckType;
    public final Boolean ignoreFutureJoinRequest;
    public final String reqId;

    public void JsHandleGroupJoinRequestParams(String p0,int p1,String p2,String p3,Boolean p4,String p5){
       super();
       this.reqId = p0;
       this.groupJoinAckType = p1;
       this.groupId = p2;
       this.auditComment = p3;
       this.ignoreFutureJoinRequest = p4;
       this.callback = p5;
    }
    public static JsHandleGroupJoinRequestParams copy$default(JsHandleGroupJoinRequestParams p0,String p1,int p2,String p3,String p4,Boolean p5,String p6,int p7,Object p8){
       JsHandleGroupJoinRequestParams reqId;
       JsHandleGroupJoinRequestParams groupJoinAck;
       JsHandleGroupJoinRequestParams groupId;
       JsHandleGroupJoinRequestParams auditComment;
       JsHandleGroupJoinRequestParams ignoreFuture;
       JsHandleGroupJoinRequestParams callback;
       if (p7 & 0x01) {
          reqId = p0.reqId;
       }
       if (p7 & 0x02) {
          groupJoinAck = p0.groupJoinAckType;
       }
       p8 = groupJoinAck;
       if (p7 & 0x04) {
          groupId = p0.groupId;
       }
       JsHandleGroupJoinRequestParams jsHandleGrou = groupId;
       if (p7 & 0x08) {
          auditComment = p0.auditComment;
       }
       JsHandleGroupJoinRequestParams jsHandleGrou1 = auditComment;
       if (p7 & 0x10) {
          ignoreFuture = p0.ignoreFutureJoinRequest;
       }
       JsHandleGroupJoinRequestParams jsHandleGrou2 = ignoreFuture;
       if (p7 & 0x20) {
          callback = p0.callback;
       }
       return p0.copy(reqId, p8, jsHandleGrou, jsHandleGrou1, jsHandleGrou2, callback);
    }
    public final String component1(){
       return this.reqId;
    }
    public final int component2(){
       return this.groupJoinAckType;
    }
    public final String component3(){
       return this.groupId;
    }
    public final String component4(){
       return this.auditComment;
    }
    public final Boolean component5(){
       return this.ignoreFutureJoinRequest;
    }
    public final String component6(){
       return this.callback;
    }
    public final JsHandleGroupJoinRequestParams copy(String p0,int p1,String p2,String p3,Boolean p4,String p5){
       Object obj;
       if (PatchProxy.isSupport(JsHandleGroupJoinRequestParams.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),p2,p3,p4,p5};
          obj = PatchProxy.apply(objArray, this, JsHandleGroupJoinRequestParams.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       JsHandleGroupJoinRequestParams jsHandleGrou = new JsHandleGroupJoinRequestParams(p0, p1, p2, p3, p4, p5);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, JsHandleGroupJoinRequestParams.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof JsHandleGroupJoinRequestParams && (a.g(this.reqId, p0.reqId) && (this.groupJoinAckType == p0.groupJoinAckType && (a.g(this.groupId, p0.groupId) && (a.g(this.auditComment, p0.auditComment) && (a.g(this.ignoreFutureJoinRequest, p0.ignoreFutureJoinRequest) && a.g(this.callback, p0.callback)))))))) {
          return true;
       }
       return false;
    }
    public final String getAuditComment(){
       return this.auditComment;
    }
    public final String getCallback(){
       return this.callback;
    }
    public final String getGroupId(){
       return this.groupId;
    }
    public final int getGroupJoinAckType(){
       return this.groupJoinAckType;
    }
    public final Boolean getIgnoreFutureJoinRequest(){
       return this.ignoreFutureJoinRequest;
    }
    public final String getReqId(){
       return this.reqId;
    }
    public int hashCode(){
       JsHandleGroupJoinRequestParams obj = PatchProxy.apply(null, this, JsHandleGroupJoinRequestParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.reqId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = ((i1 * 31) + this.groupJoinAckType) * 31;
       JsHandleGroupJoinRequestParams tgroupId = this.groupId;
       int i2 = (tgroupId != null)? tgroupId.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tgroupId = this.auditComment;
       i2 = (tgroupId != null)? tgroupId.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tgroupId = this.ignoreFutureJoinRequest;
       i2 = (tgroupId != null)? tgroupId.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tgroupId = this.callback;
       if (tgroupId != null) {
          i = tgroupId.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, JsHandleGroupJoinRequestParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "JsHandleGroupJoinRequestParams\(reqId="+this.reqId+", groupJoinAckType="+this.groupJoinAckType+", groupId="+this.groupId+", auditComment="+this.auditComment+", ignoreFutureJoinRequest="+this.ignoreFutureJoinRequest+", callback="+this.callback+"\)";
    }
}
