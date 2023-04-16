package com.kwai.feature.api.social.message.bridge.model.JsGetGroupMemberIdsParams;
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

public final class JsGetGroupMemberIdsParams implements Serializable	// class@001129
{
    public final String callback;
    public final String groupId;

    public void JsGetGroupMemberIdsParams(String p0,String p1){
       super();
       this.groupId = p0;
       this.callback = p1;
    }
    public static JsGetGroupMemberIdsParams copy$default(JsGetGroupMemberIdsParams p0,String p1,String p2,int p3,Object p4){
       JsGetGroupMemberIdsParams groupId;
       JsGetGroupMemberIdsParams callback;
       if (p3 & 0x01) {
          groupId = p0.groupId;
       }
       if (p3 & 0x02) {
          callback = p0.callback;
       }
       return p0.copy(groupId, callback);
    }
    public final String component1(){
       return this.groupId;
    }
    public final String component2(){
       return this.callback;
    }
    public final JsGetGroupMemberIdsParams copy(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, JsGetGroupMemberIdsParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new JsGetGroupMemberIdsParams(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, JsGetGroupMemberIdsParams.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof JsGetGroupMemberIdsParams && (a.g(this.groupId, p0.groupId) && a.g(this.callback, p0.callback)))) {
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
    public int hashCode(){
       JsGetGroupMemberIdsParams obj = PatchProxy.apply(null, this, JsGetGroupMemberIdsParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.groupId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       JsGetGroupMemberIdsParams tcallback = this.callback;
       if (tcallback != null) {
          i = tcallback.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, JsGetGroupMemberIdsParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "JsGetGroupMemberIdsParams\(groupId="+this.groupId+", callback="+this.callback+"\)";
    }
}
