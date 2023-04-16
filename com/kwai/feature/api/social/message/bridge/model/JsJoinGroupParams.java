package com.kwai.feature.api.social.message.bridge.model.JsJoinGroupParams;
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

public final class JsJoinGroupParams implements Serializable	// class@001130
{
    public final String applyJoinDescContent;
    public final String callback;
    public final int groupFindType;
    public final String groupId;
    public final String inviterId;

    public void JsJoinGroupParams(String p0,String p1,int p2,String p3,String p4){
       super();
       this.groupId = p0;
       this.inviterId = p1;
       this.groupFindType = p2;
       this.applyJoinDescContent = p3;
       this.callback = p4;
    }
    public static JsJoinGroupParams copy$default(JsJoinGroupParams p0,String p1,String p2,int p3,String p4,String p5,int p6,Object p7){
       JsJoinGroupParams groupId;
       JsJoinGroupParams inviterId;
       JsJoinGroupParams groupFindTyp;
       JsJoinGroupParams applyJoinDes;
       JsJoinGroupParams callback;
       if (p6 & 0x01) {
          groupId = p0.groupId;
       }
       if (p6 & 0x02) {
          inviterId = p0.inviterId;
       }
       p7 = inviterId;
       if (p6 & 0x04) {
          groupFindTyp = p0.groupFindType;
       }
       JsJoinGroupParams jsJoinGroupP = groupFindTyp;
       if (p6 & 0x08) {
          applyJoinDes = p0.applyJoinDescContent;
       }
       JsJoinGroupParams jsJoinGroupP1 = applyJoinDes;
       if (p6 & 0x10) {
          callback = p0.callback;
       }
       return p0.copy(groupId, p7, jsJoinGroupP, jsJoinGroupP1, callback);
    }
    public final String component1(){
       return this.groupId;
    }
    public final String component2(){
       return this.inviterId;
    }
    public final int component3(){
       return this.groupFindType;
    }
    public final String component4(){
       return this.applyJoinDescContent;
    }
    public final String component5(){
       return this.callback;
    }
    public final JsJoinGroupParams copy(String p0,String p1,int p2,String p3,String p4){
       Object obj;
       if (PatchProxy.isSupport(JsJoinGroupParams.class)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),p3,p4};
          obj = PatchProxy.apply(objArray, this, JsJoinGroupParams.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       JsJoinGroupParams jsJoinGroupP = new JsJoinGroupParams(p0, p1, p2, p3, p4);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, JsJoinGroupParams.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof JsJoinGroupParams && (a.g(this.groupId, p0.groupId) && (a.g(this.inviterId, p0.inviterId) && (this.groupFindType == p0.groupFindType && (a.g(this.applyJoinDescContent, p0.applyJoinDescContent) && a.g(this.callback, p0.callback))))))) {
          return true;
       }
       return false;
    }
    public final String getApplyJoinDescContent(){
       return this.applyJoinDescContent;
    }
    public final String getCallback(){
       return this.callback;
    }
    public final int getGroupFindType(){
       return this.groupFindType;
    }
    public final String getGroupId(){
       return this.groupId;
    }
    public final String getInviterId(){
       return this.inviterId;
    }
    public int hashCode(){
       JsJoinGroupParams obj = PatchProxy.apply(null, this, JsJoinGroupParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.groupId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       JsJoinGroupParams tinviterId = this.inviterId;
       int i2 = (tinviterId != null)? tinviterId.hashCode(): 0;
       i1 = (((i1 + i2) * 31) + this.groupFindType) * 31;
       tinviterId = this.applyJoinDescContent;
       i2 = (tinviterId != null)? tinviterId.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tinviterId = this.callback;
       if (tinviterId != null) {
          i = tinviterId.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, JsJoinGroupParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "JsJoinGroupParams\(groupId="+this.groupId+", inviterId="+this.inviterId+", groupFindType="+this.groupFindType+", applyJoinDescContent="+this.applyJoinDescContent+", callback="+this.callback+"\)";
    }
}
