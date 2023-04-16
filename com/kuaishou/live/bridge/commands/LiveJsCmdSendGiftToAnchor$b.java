package com.kuaishou.live.bridge.commands.LiveJsCmdSendGiftToAnchor$b;
import java.lang.String;
import com.yxcorp.gifshow.model.response.LiveSendNoPanelGiftResponse;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveJsCmdSendGiftToAnchor$b	// class@000dfa
{
    public String error;
    public LiveSendNoPanelGiftResponse liveSendNoPanelGiftResponse;

    public void LiveJsCmdSendGiftToAnchor$b(String p0,LiveSendNoPanelGiftResponse p1){
       super();
       this.error = null;
       this.liveSendNoPanelGiftResponse = p1;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveJsCmdSendGiftToAnchor$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveJsCmdSendGiftToAnchor$b && (a.g(this.error, p0.error) && a.g(this.liveSendNoPanelGiftResponse, p0.liveSendNoPanelGiftResponse)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       LiveJsCmdSendGiftToAnchor$b obj = PatchProxy.apply(null, this, LiveJsCmdSendGiftToAnchor$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.error;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LiveJsCmdSendGiftToAnchor$b tliveSendNoP = this.liveSendNoPanelGiftResponse;
       if (tliveSendNoP != null) {
          i = tliveSendNoP.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveJsCmdSendGiftToAnchor$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Response\(error="+this.error+", liveSendNoPanelGiftResponse="+this.liveSendNoPanelGiftResponse+"\)";
    }
}
