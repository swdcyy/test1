package com.kuaishou.merchant.live.basic.startlive.SignalRouterEventData;
import java.io.Serializable;
import java.util.List;
import nsd.u;
import java.lang.Object;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class SignalRouterEventData implements Serializable	// class@0018d2
{
    public List datas;
    public final long serialVersionUID;

    public void SignalRouterEventData(){
       super(null, 1, null);
    }
    public void SignalRouterEventData(List p0){
       super();
       this.datas = p0;
       this.serialVersionUID = 0xfee24835ab46c80f;
    }
    public void SignalRouterEventData(List p0,int p1,u p2){
       if (p1 & 0x01) {
          p0 = CollectionsKt__CollectionsKt.E();
       }
       super(p0);
       return;
    }
    public static SignalRouterEventData copy$default(SignalRouterEventData p0,List p1,int p2,Object p3){
       SignalRouterEventData datas;
       if (p2 & 0x01) {
          datas = p0.datas;
       }
       return p0.copy(datas);
    }
    public final List component1(){
       return this.datas;
    }
    public final SignalRouterEventData copy(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SignalRouterEventData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new SignalRouterEventData(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SignalRouterEventData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof SignalRouterEventData && a.g(this.datas, p0.datas))) {
          return true;
       }
       return false;
    }
    public final List getDatas(){
       return this.datas;
    }
    public int hashCode(){
       SignalRouterEventData obj = PatchProxy.apply(null, this, SignalRouterEventData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.datas;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public final void setDatas(List p0){
       this.datas = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, SignalRouterEventData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SignalRouterEventData\(datas="+this.datas+"\)";
    }
}
