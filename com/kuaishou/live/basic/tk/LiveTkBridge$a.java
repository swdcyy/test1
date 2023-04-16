package com.kuaishou.live.basic.tk.LiveTkBridge$a;
import java.lang.String;
import java.lang.Object;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveTkBridge$a	// class@000d12
{
    public final Object data;
    public final int result;
    public final String subscribeId;

    public void LiveTkBridge$a(){
       super(0, null, null, 7, null);
    }
    public void LiveTkBridge$a(int p0,String p1,Object p2,int p3,u p4){
       if (p3 & 0x01) {
          p0 = 1;
       }
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = null;
       }
       super();
       this.result = p0;
       this.subscribeId = p1;
       this.data = p2;
       return;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveTkBridge$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveTkBridge$a && (this.result == p0.result && (a.g(this.subscribeId, p0.subscribeId) && a.g(this.data, p0.data))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, LiveTkBridge$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.result * 31;
       LiveTkBridge$a tsubscribeId = this.subscribeId;
       int i1 = 0;
       int i2 = (tsubscribeId != null)? tsubscribeId.hashCode(): 0;
       i = (i + i2) * 31;
       tsubscribeId = this.data;
       if (tsubscribeId != null) {
          i1 = tsubscribeId.hashCode();
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveTkBridge$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SubscribeResultParams\(result="+this.result+", subscribeId="+this.subscribeId+", data="+this.data+"\)";
    }
}
