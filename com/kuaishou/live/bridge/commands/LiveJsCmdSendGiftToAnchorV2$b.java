package com.kuaishou.live.bridge.commands.LiveJsCmdSendGiftToAnchorV2$b;
import com.yxcorp.gifshow.model.response.LiveSendNoPanelGiftResponse;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveJsCmdSendGiftToAnchorV2$b	// class@000dfe
{
    public LiveSendNoPanelGiftResponse liveSendNoPanelGiftResponse;

    public void LiveJsCmdSendGiftToAnchorV2$b(LiveSendNoPanelGiftResponse p0){
       super();
       this.liveSendNoPanelGiftResponse = p0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveJsCmdSendGiftToAnchorV2$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveJsCmdSendGiftToAnchorV2$b && a.g(this.liveSendNoPanelGiftResponse, p0.liveSendNoPanelGiftResponse))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       LiveJsCmdSendGiftToAnchorV2$b obj = PatchProxy.apply(null, this, LiveJsCmdSendGiftToAnchorV2$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.liveSendNoPanelGiftResponse;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveJsCmdSendGiftToAnchorV2$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Response\(liveSendNoPanelGiftResponse="+this.liveSendNoPanelGiftResponse+"\)";
    }
}
