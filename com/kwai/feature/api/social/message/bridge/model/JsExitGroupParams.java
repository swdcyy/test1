package com.kwai.feature.api.social.message.bridge.model.JsExitGroupParams;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class JsExitGroupParams implements Serializable	// class@001126
{
    public final String callback;
    public final String groupId;
    public final boolean isDestroyGroup;

    public void JsExitGroupParams(String p0,boolean p1,String p2){
       a.p(p0, "groupId");
       super();
       this.groupId = p0;
       this.isDestroyGroup = p1;
       this.callback = p2;
    }
    public static JsExitGroupParams copy$default(JsExitGroupParams p0,String p1,boolean p2,String p3,int p4,Object p5){
       JsExitGroupParams groupId;
       JsExitGroupParams isDestroyGro;
       JsExitGroupParams callback;
       if (p4 & 0x01) {
          groupId = p0.groupId;
       }
       if (p4 & 0x02) {
          isDestroyGro = p0.isDestroyGroup;
       }
       if (p4 & 0x04) {
          callback = p0.callback;
       }
       return p0.copy(groupId, isDestroyGro, callback);
    }
    public final String component1(){
       return this.groupId;
    }
    public final boolean component2(){
       return this.isDestroyGroup;
    }
    public final String component3(){
       return this.callback;
    }
    public final JsExitGroupParams copy(String p0,boolean p1,String p2){
       if (PatchProxy.isSupport(JsExitGroupParams.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), p2, this, JsExitGroupParams.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "groupId");
       return new JsExitGroupParams(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, JsExitGroupParams.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof JsExitGroupParams && (a.g(this.groupId, p0.groupId) && (this.isDestroyGroup == p0.isDestroyGroup && a.g(this.callback, p0.callback))))) {
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
       JsExitGroupParams obj = PatchProxy.apply(null, this, JsExitGroupParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.groupId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       JsExitGroupParams tisDestroyGr = this.isDestroyGroup;
       if (tisDestroyGr != null) {
          tisDestroyGr = 1;
       }
       i1 = (i1 + tisDestroyGr) * 31;
       tisDestroyGr = this.callback;
       if (tisDestroyGr != null) {
          i = tisDestroyGr.hashCode();
       }
       return (i1 + i);
    }
    public final boolean isDestroyGroup(){
       return this.isDestroyGroup;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, JsExitGroupParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "JsExitGroupParams\(groupId="+this.groupId+", isDestroyGroup="+this.isDestroyGroup+", callback="+this.callback+"\)";
    }
}
