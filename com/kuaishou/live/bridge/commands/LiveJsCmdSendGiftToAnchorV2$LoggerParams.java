package com.kuaishou.live.bridge.commands.LiveJsCmdSendGiftToAnchorV2$LoggerParams;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveJsCmdSendGiftToAnchorV2$LoggerParams	// class@000dfc
{
    public final Integer giftBoxSourceType;
    public final Integer giftEntryType;

    public final Integer a(){
       return this.giftBoxSourceType;
    }
    public final Integer b(){
       return this.giftEntryType;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveJsCmdSendGiftToAnchorV2$LoggerParams.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveJsCmdSendGiftToAnchorV2$LoggerParams && (a.g(this.giftEntryType, p0.giftEntryType) && a.g(this.giftBoxSourceType, p0.giftBoxSourceType)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       LiveJsCmdSendGiftToAnchorV2$LoggerParams obj = PatchProxy.apply(null, this, LiveJsCmdSendGiftToAnchorV2$LoggerParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.giftEntryType;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LiveJsCmdSendGiftToAnchorV2$LoggerParams tgiftBoxSour = this.giftBoxSourceType;
       if (tgiftBoxSour != null) {
          i = tgiftBoxSour.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveJsCmdSendGiftToAnchorV2$LoggerParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LoggerParams\(giftEntryType="+this.giftEntryType+", giftBoxSourceType="+this.giftBoxSourceType+"\)";
    }
}
