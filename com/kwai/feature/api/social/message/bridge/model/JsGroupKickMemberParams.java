package com.kwai.feature.api.social.message.bridge.model.JsGroupKickMemberParams;
import java.io.Serializable;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class JsGroupKickMemberParams implements Serializable	// class@00112c
{
    public final String callback;
    public final String groupId;
    public final boolean joinBlackList;
    public final List uids;

    public void JsGroupKickMemberParams(String p0,List p1,boolean p2,String p3){
       super();
       this.groupId = p0;
       this.uids = p1;
       this.joinBlackList = p2;
       this.callback = p3;
    }
    public static JsGroupKickMemberParams copy$default(JsGroupKickMemberParams p0,String p1,List p2,boolean p3,String p4,int p5,Object p6){
       JsGroupKickMemberParams groupId;
       JsGroupKickMemberParams uids;
       JsGroupKickMemberParams joinBlackLis;
       JsGroupKickMemberParams callback;
       if (p5 & 0x01) {
          groupId = p0.groupId;
       }
       if (p5 & 0x02) {
          uids = p0.uids;
       }
       if (p5 & 0x04) {
          joinBlackLis = p0.joinBlackList;
       }
       if (p5 & 0x08) {
          callback = p0.callback;
       }
       return p0.copy(groupId, uids, joinBlackLis, callback);
    }
    public final String component1(){
       return this.groupId;
    }
    public final List component2(){
       return this.uids;
    }
    public final boolean component3(){
       return this.joinBlackList;
    }
    public final String component4(){
       return this.callback;
    }
    public final JsGroupKickMemberParams copy(String p0,List p1,boolean p2,String p3){
       if (PatchProxy.isSupport(JsGroupKickMemberParams.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Boolean.valueOf(p2), p3, this, JsGroupKickMemberParams.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new JsGroupKickMemberParams(p0, p1, p2, p3);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, JsGroupKickMemberParams.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof JsGroupKickMemberParams && (a.g(this.groupId, p0.groupId) && (a.g(this.uids, p0.uids) && (this.joinBlackList == p0.joinBlackList && a.g(this.callback, p0.callback)))))) {
          return true;
       }
       return false;
    }
    public final String getCallback(){
       return this.callback;
    }
    public final String getGroupId(){
       return this.groupId;
    }
    public final boolean getJoinBlackList(){
       return this.joinBlackList;
    }
    public final List getUids(){
       return this.uids;
    }
    public int hashCode(){
       JsGroupKickMemberParams obj = PatchProxy.apply(null, this, JsGroupKickMemberParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.groupId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       JsGroupKickMemberParams tuids = this.uids;
       int i2 = (tuids != null)? tuids.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tuids = this.joinBlackList;
       if (tuids != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tuids = this.callback;
       if (tuids != null) {
          i = tuids.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, JsGroupKickMemberParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "JsGroupKickMemberParams\(groupId="+this.groupId+", uids="+this.uids+", joinBlackList="+this.joinBlackList+", callback="+this.callback+"\)";
    }
}
