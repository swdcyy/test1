package com.kuaishou.live.bridge.commands.LiveJsCmdSendGiftToAnchor$a;
import com.kuaishou.live.bridge.commands.LiveJsCmdSendGiftToAnchor$LoggerParams;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveJsCmdSendGiftToAnchor$a	// class@000df9
{
    public final LiveJsCmdSendGiftToAnchor$LoggerParams LoggerParams;
    public int comboCount;
    public int comboKey;
    public final int count;
    public final int giftId;
    public final String giftToken;
    public boolean isAsync;
    public final Map logExtraInfo;

    public final int a(){
       return this.comboCount;
    }
    public final int b(){
       return this.comboKey;
    }
    public final int c(){
       return this.count;
    }
    public final int d(){
       return this.giftId;
    }
    public final LiveJsCmdSendGiftToAnchor$LoggerParams e(){
       return this.LoggerParams;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveJsCmdSendGiftToAnchor$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveJsCmdSendGiftToAnchor$a && (this.giftId == p0.giftId && (this.count == p0.count && (a.g(this.giftToken, p0.giftToken) && (this.comboKey == p0.comboKey && (this.comboCount == p0.comboCount && (this.isAsync == p0.isAsync && (a.g(this.LoggerParams, p0.LoggerParams) && a.g(this.logExtraInfo, p0.logExtraInfo)))))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, LiveJsCmdSendGiftToAnchor$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = ((this.giftId * 31) + this.count) * 31;
       LiveJsCmdSendGiftToAnchor$a tgiftToken = this.giftToken;
       int i1 = 0;
       int i2 = (tgiftToken != null)? tgiftToken.hashCode(): 0;
       i = (((((i + i2) * 31) + this.comboKey) * 31) + this.comboCount) * 31;
       tgiftToken = this.isAsync;
       if (tgiftToken != null) {
          i2 = 1;
       }
       i = (i + i2) * 31;
       tgiftToken = this.LoggerParams;
       i2 = (tgiftToken != null)? tgiftToken.hashCode(): 0;
       i = (i + i2) * 31;
       tgiftToken = this.logExtraInfo;
       if (tgiftToken != null) {
          i1 = tgiftToken.hashCode();
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveJsCmdSendGiftToAnchor$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Request\(giftId="+this.giftId+", count="+this.count+", giftToken="+this.giftToken+", comboKey="+this.comboKey+", comboCount="+this.comboCount+", isAsync="+this.isAsync+", LoggerParams="+this.LoggerParams+", logExtraInfo="+this.logExtraInfo+"\)";
    }
}
