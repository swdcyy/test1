package com.kuaishou.live.common.core.component.bottombubble.notices.sendgift.LiveAudienceSendGiftInfo$ExtraInfo$SendGiftInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveAudienceSendGiftInfo$ExtraInfo$SendGiftInfo	// class@000ff6
{
    public final int count;
    public final int giftId;
    public final String giftToken;

    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceSendGiftInfo$ExtraInfo$SendGiftInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveAudienceSendGiftInfo$ExtraInfo$SendGiftInfo && (this.giftId == p0.giftId && (a.g(this.giftToken, p0.giftToken) && this.count == p0.count)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceSendGiftInfo$ExtraInfo$SendGiftInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.giftId * 31;
       LiveAudienceSendGiftInfo$ExtraInfo$SendGiftInfo tgiftToken = this.giftToken;
       int i1 = (tgiftToken != null)? tgiftToken.hashCode(): 0;
       return (((i + i1) * 31) + this.count);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceSendGiftInfo$ExtraInfo$SendGiftInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SendGiftInfo\(giftId="+this.giftId+", giftToken="+this.giftToken+", count="+this.count+"\)";
    }
}
