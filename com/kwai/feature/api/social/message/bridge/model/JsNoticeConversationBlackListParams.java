package com.kwai.feature.api.social.message.bridge.model.JsNoticeConversationBlackListParams;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class JsNoticeConversationBlackListParams implements Serializable	// class@001134
{
    public final String blockedUid;
    public final boolean isAddToBlackList;
    public String ownerUid;

    public void JsNoticeConversationBlackListParams(String p0,String p1,boolean p2){
       super();
       this.blockedUid = p0;
       this.ownerUid = p1;
       this.isAddToBlackList = p2;
    }
    public static JsNoticeConversationBlackListParams copy$default(JsNoticeConversationBlackListParams p0,String p1,String p2,boolean p3,int p4,Object p5){
       JsNoticeConversationBlackListParams blockedUid;
       JsNoticeConversationBlackListParams ownerUid;
       JsNoticeConversationBlackListParams isAddToBlack;
       if (p4 & 0x01) {
          blockedUid = p0.blockedUid;
       }
       if (p4 & 0x02) {
          ownerUid = p0.ownerUid;
       }
       if (p4 & 0x04) {
          isAddToBlack = p0.isAddToBlackList;
       }
       return p0.copy(blockedUid, ownerUid, isAddToBlack);
    }
    public final String component1(){
       return this.blockedUid;
    }
    public final String component2(){
       return this.ownerUid;
    }
    public final boolean component3(){
       return this.isAddToBlackList;
    }
    public final JsNoticeConversationBlackListParams copy(String p0,String p1,boolean p2){
       if (PatchProxy.isSupport(JsNoticeConversationBlackListParams.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, JsNoticeConversationBlackListParams.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new JsNoticeConversationBlackListParams(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, JsNoticeConversationBlackListParams.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof JsNoticeConversationBlackListParams && (a.g(this.blockedUid, p0.blockedUid) && (a.g(this.ownerUid, p0.ownerUid) && this.isAddToBlackList == p0.isAddToBlackList)))) {
          return true;
       }
       return false;
    }
    public final String getBlockedUid(){
       return this.blockedUid;
    }
    public final String getOwnerUid(){
       return this.ownerUid;
    }
    public int hashCode(){
       JsNoticeConversationBlackListParams obj = PatchProxy.apply(null, this, JsNoticeConversationBlackListParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.blockedUid;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       JsNoticeConversationBlackListParams townerUid = this.ownerUid;
       if (townerUid != null) {
          i = townerUid.hashCode();
       }
       i1 = (i1 + i) * 31;
       JsNoticeConversationBlackListParams tisAddToBlac = this.isAddToBlackList;
       if (tisAddToBlac != null) {
          tisAddToBlac = 1;
       }
       return (i1 + tisAddToBlac);
    }
    public final boolean isAddToBlackList(){
       return this.isAddToBlackList;
    }
    public final void setOwnerUid(String p0){
       this.ownerUid = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, JsNoticeConversationBlackListParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "JsNoticeConversationBlackListParams\(blockedUid="+this.blockedUid+", ownerUid="+this.ownerUid+", isAddToBlackList="+this.isAddToBlackList+"\)";
    }
}
