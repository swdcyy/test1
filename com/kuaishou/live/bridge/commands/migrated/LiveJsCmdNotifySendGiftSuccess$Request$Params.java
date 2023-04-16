package com.kuaishou.live.bridge.commands.migrated.LiveJsCmdNotifySendGiftSuccess$Request$Params;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveJsCmdNotifySendGiftSuccess$Request$Params	// class@000e15
{
    public final String giftSentInfo;

    public void LiveJsCmdNotifySendGiftSuccess$Request$Params(){
       super(null);
    }
    public void LiveJsCmdNotifySendGiftSuccess$Request$Params(String p0){
       super();
       this.giftSentInfo = p0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveJsCmdNotifySendGiftSuccess$Request$Params.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveJsCmdNotifySendGiftSuccess$Request$Params && a.g(this.giftSentInfo, p0.giftSentInfo))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       LiveJsCmdNotifySendGiftSuccess$Request$Params obj = PatchProxy.apply(null, this, LiveJsCmdNotifySendGiftSuccess$Request$Params.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.giftSentInfo;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveJsCmdNotifySendGiftSuccess$Request$Params.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Params\(giftSentInfo="+this.giftSentInfo+"\)";
    }
}
