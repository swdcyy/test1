package com.kuaishou.live.bridge.commands.migrated.LiveJsCmdMockSelfSendGiftEffect$a;
import com.kuaishou.live.bridge.commands.migrated.LiveJsCmdMockSelfSendGiftEffect$Param;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveJsCmdMockSelfSendGiftEffect$a	// class@000e10
{
    public final LiveJsCmdMockSelfSendGiftEffect$Param param;

    public void LiveJsCmdMockSelfSendGiftEffect$a(){
       super(null);
    }
    public void LiveJsCmdMockSelfSendGiftEffect$a(LiveJsCmdMockSelfSendGiftEffect$Param p0){
       super();
       this.param = p0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveJsCmdMockSelfSendGiftEffect$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveJsCmdMockSelfSendGiftEffect$a && a.g(this.param, p0.param))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       LiveJsCmdMockSelfSendGiftEffect$a obj = PatchProxy.apply(null, this, LiveJsCmdMockSelfSendGiftEffect$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.param;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveJsCmdMockSelfSendGiftEffect$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Request\(param="+this.param+"\)";
    }
}
