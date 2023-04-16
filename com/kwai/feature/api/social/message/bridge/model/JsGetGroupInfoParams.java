package com.kwai.feature.api.social.message.bridge.model.JsGetGroupInfoParams;
import java.io.Serializable;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class JsGetGroupInfoParams implements Serializable	// class@001128
{
    public final String callback;
    public final Boolean fromServer;
    public final String groupId;

    public void JsGetGroupInfoParams(String p0,Boolean p1,String p2){
       super();
       this.groupId = p0;
       this.fromServer = p1;
       this.callback = p2;
    }
    public static JsGetGroupInfoParams copy$default(JsGetGroupInfoParams p0,String p1,Boolean p2,String p3,int p4,Object p5){
       JsGetGroupInfoParams groupId;
       JsGetGroupInfoParams fromServer;
       JsGetGroupInfoParams callback;
       if (p4 & 0x01) {
          groupId = p0.groupId;
       }
       if (p4 & 0x02) {
          fromServer = p0.fromServer;
       }
       if (p4 & 0x04) {
          callback = p0.callback;
       }
       return p0.copy(groupId, fromServer, callback);
    }
    public final String component1(){
       return this.groupId;
    }
    public final Boolean component2(){
       return this.fromServer;
    }
    public final String component3(){
       return this.callback;
    }
    public final JsGetGroupInfoParams copy(String p0,Boolean p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, JsGetGroupInfoParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new JsGetGroupInfoParams(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, JsGetGroupInfoParams.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof JsGetGroupInfoParams && (a.g(this.groupId, p0.groupId) && (a.g(this.fromServer, p0.fromServer) && a.g(this.callback, p0.callback))))) {
          return true;
       }
       return false;
    }
    public final String getCallback(){
       return this.callback;
    }
    public final Boolean getFromServer(){
       return this.fromServer;
    }
    public final String getGroupId(){
       return this.groupId;
    }
    public int hashCode(){
       JsGetGroupInfoParams obj = PatchProxy.apply(null, this, JsGetGroupInfoParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.groupId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       JsGetGroupInfoParams tfromServer = this.fromServer;
       int i2 = (tfromServer != null)? tfromServer.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tfromServer = this.callback;
       if (tfromServer != null) {
          i = tfromServer.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, JsGetGroupInfoParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "JsGetGroupInfoParams\(groupId="+this.groupId+", fromServer="+this.fromServer+", callback="+this.callback+"\)";
    }
}
