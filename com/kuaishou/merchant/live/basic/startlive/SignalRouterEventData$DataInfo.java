package com.kuaishou.merchant.live.basic.startlive.SignalRouterEventData$DataInfo;
import java.io.Serializable;
import com.kuaishou.merchant.live.basic.startlive.RouterActionConfig;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class SignalRouterEventData$DataInfo implements Serializable	// class@0018d1
{
    public RouterActionConfig data;
    public final long serialVersionUID;

    public void SignalRouterEventData$DataInfo(){
       super(null, 1, null);
    }
    public void SignalRouterEventData$DataInfo(RouterActionConfig p0){
       super();
       this.data = p0;
       this.serialVersionUID = 0xffdfdb9b5d4fd8c9;
    }
    public void SignalRouterEventData$DataInfo(RouterActionConfig p0,int p1,u p2){
       if (p1 & 0x01) {
          p0 = new RouterActionConfig();
       }
       super(p0);
       return;
    }
    public static SignalRouterEventData$DataInfo copy$default(SignalRouterEventData$DataInfo p0,RouterActionConfig p1,int p2,Object p3){
       SignalRouterEventData$DataInfo data;
       if (p2 & 0x01) {
          data = p0.data;
       }
       return p0.copy(data);
    }
    public final RouterActionConfig component1(){
       return this.data;
    }
    public final SignalRouterEventData$DataInfo copy(RouterActionConfig p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SignalRouterEventData$DataInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new SignalRouterEventData$DataInfo(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SignalRouterEventData$DataInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof SignalRouterEventData$DataInfo && a.g(this.data, p0.data))) {
          return true;
       }
       return false;
    }
    public final RouterActionConfig getData(){
       return this.data;
    }
    public int hashCode(){
       SignalRouterEventData$DataInfo obj = PatchProxy.apply(null, this, SignalRouterEventData$DataInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.data;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public final void setData(RouterActionConfig p0){
       this.data = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, SignalRouterEventData$DataInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "DataInfo\(data="+this.data+"\)";
    }
}
