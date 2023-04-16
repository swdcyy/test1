package com.kuaishou.live.bridge.commands.LiveJsCmdSendGiftToAnchor$LoggerParams;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveJsCmdSendGiftToAnchor$LoggerParams	// class@000df8
{
    public final int giftBoxSourceType;
    public final int giftEntryType;

    public final int a(){
       return this.giftBoxSourceType;
    }
    public final int b(){
       return this.giftEntryType;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof LiveJsCmdSendGiftToAnchor$LoggerParams && (this.giftEntryType == p0.giftEntryType && this.giftBoxSourceType == p0.giftBoxSourceType))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, LiveJsCmdSendGiftToAnchor$LoggerParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ((this.giftEntryType * 31) + this.giftBoxSourceType);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveJsCmdSendGiftToAnchor$LoggerParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LoggerParams\(giftEntryType="+this.giftEntryType+", giftBoxSourceType="+this.giftBoxSourceType+"\)";
    }
}
