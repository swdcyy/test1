package com.kuaishou.live.core.basic.model.LiteAuthorReplyAfterSendGiftConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiteAuthorReplyAfterSendGiftConfig	// class@000847
{
    public final Long delayTimeMs;
    public final Boolean enableLiteAuthorReplyAfterSendGift;

    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiteAuthorReplyAfterSendGiftConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiteAuthorReplyAfterSendGiftConfig && (a.g(this.enableLiteAuthorReplyAfterSendGift, p0.enableLiteAuthorReplyAfterSendGift) && a.g(this.delayTimeMs, p0.delayTimeMs)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       LiteAuthorReplyAfterSendGiftConfig obj = PatchProxy.apply(null, this, LiteAuthorReplyAfterSendGiftConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.enableLiteAuthorReplyAfterSendGift;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LiteAuthorReplyAfterSendGiftConfig tdelayTimeMs = this.delayTimeMs;
       if (tdelayTimeMs != null) {
          i = tdelayTimeMs.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiteAuthorReplyAfterSendGiftConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiteAuthorReplyAfterSendGiftConfig\(enableLiteAuthorReplyAfterSendGift="+this.enableLiteAuthorReplyAfterSendGift+", delayTimeMs="+this.delayTimeMs+"\)";
    }
}
