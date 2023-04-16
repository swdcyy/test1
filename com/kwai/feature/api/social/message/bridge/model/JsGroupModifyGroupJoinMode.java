package com.kwai.feature.api.social.message.bridge.model.JsGroupModifyGroupJoinMode;
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

public final class JsGroupModifyGroupJoinMode implements Serializable	// class@00112d
{
    public final String callback;
    public final String groupId;
    public final int groupJoinMode;

    public void JsGroupModifyGroupJoinMode(String p0,int p1,String p2){
       super();
       this.groupId = p0;
       this.groupJoinMode = p1;
       this.callback = p2;
    }
    public static JsGroupModifyGroupJoinMode copy$default(JsGroupModifyGroupJoinMode p0,String p1,int p2,String p3,int p4,Object p5){
       JsGroupModifyGroupJoinMode groupId;
       JsGroupModifyGroupJoinMode groupJoinMod;
       JsGroupModifyGroupJoinMode callback;
       if (p4 & 0x01) {
          groupId = p0.groupId;
       }
       if (p4 & 0x02) {
          groupJoinMod = p0.groupJoinMode;
       }
       if (p4 & 0x04) {
          callback = p0.callback;
       }
       return p0.copy(groupId, groupJoinMod, callback);
    }
    public final String component1(){
       return this.groupId;
    }
    public final int component2(){
       return this.groupJoinMode;
    }
    public final String component3(){
       return this.callback;
    }
    public final JsGroupModifyGroupJoinMode copy(String p0,int p1,String p2){
       if (PatchProxy.isSupport(JsGroupModifyGroupJoinMode.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, JsGroupModifyGroupJoinMode.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new JsGroupModifyGroupJoinMode(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, JsGroupModifyGroupJoinMode.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof JsGroupModifyGroupJoinMode && (a.g(this.groupId, p0.groupId) && (this.groupJoinMode == p0.groupJoinMode && a.g(this.callback, p0.callback))))) {
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
    public final int getGroupJoinMode(){
       return this.groupJoinMode;
    }
    public int hashCode(){
       JsGroupModifyGroupJoinMode obj = PatchProxy.apply(null, this, JsGroupModifyGroupJoinMode.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.groupId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = ((i1 * 31) + this.groupJoinMode) * 31;
       JsGroupModifyGroupJoinMode tcallback = this.callback;
       if (tcallback != null) {
          i = tcallback.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, JsGroupModifyGroupJoinMode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "JsGroupModifyGroupJoinMode\(groupId="+this.groupId+", groupJoinMode="+this.groupJoinMode+", callback="+this.callback+"\)";
    }
}
