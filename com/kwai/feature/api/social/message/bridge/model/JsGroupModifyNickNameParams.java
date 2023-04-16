package com.kwai.feature.api.social.message.bridge.model.JsGroupModifyNickNameParams;
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

public final class JsGroupModifyNickNameParams implements Serializable	// class@00112e
{
    public final String callback;
    public final String groupId;
    public final String name;

    public void JsGroupModifyNickNameParams(String p0,String p1,String p2){
       super();
       this.groupId = p0;
       this.name = p1;
       this.callback = p2;
    }
    public static JsGroupModifyNickNameParams copy$default(JsGroupModifyNickNameParams p0,String p1,String p2,String p3,int p4,Object p5){
       JsGroupModifyNickNameParams groupId;
       JsGroupModifyNickNameParams name;
       JsGroupModifyNickNameParams callback;
       if (p4 & 0x01) {
          groupId = p0.groupId;
       }
       if (p4 & 0x02) {
          name = p0.name;
       }
       if (p4 & 0x04) {
          callback = p0.callback;
       }
       return p0.copy(groupId, name, callback);
    }
    public final String component1(){
       return this.groupId;
    }
    public final String component2(){
       return this.name;
    }
    public final String component3(){
       return this.callback;
    }
    public final JsGroupModifyNickNameParams copy(String p0,String p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, JsGroupModifyNickNameParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new JsGroupModifyNickNameParams(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, JsGroupModifyNickNameParams.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof JsGroupModifyNickNameParams && (a.g(this.groupId, p0.groupId) && (a.g(this.name, p0.name) && a.g(this.callback, p0.callback))))) {
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
    public final String getName(){
       return this.name;
    }
    public int hashCode(){
       JsGroupModifyNickNameParams obj = PatchProxy.apply(null, this, JsGroupModifyNickNameParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.groupId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       JsGroupModifyNickNameParams tname = this.name;
       int i2 = (tname != null)? tname.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tname = this.callback;
       if (tname != null) {
          i = tname.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, JsGroupModifyNickNameParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "JsGroupModifyNickNameParams\(groupId="+this.groupId+", name="+this.name+", callback="+this.callback+"\)";
    }
}
