package com.kuaishou.live.bridge.commands.LiveJsCmdSendGiftToAnchorV2$a;
import java.lang.Integer;
import com.kuaishou.live.bridge.commands.LiveJsCmdSendGiftToAnchorV2$LoggerParams;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveJsCmdSendGiftToAnchorV2$a	// class@000dfd
{
    public final LiveJsCmdSendGiftToAnchorV2$LoggerParams LoggerParams;
    public final Integer batchCount;
    public final Integer giftId;
    public final String giftToken;
    public Boolean isAsync;
    public Boolean isCombo;
    public final Map logExtraInfo;
    public String scene;
    public final String sendExtraInfo;

    public final Integer a(){
       return this.batchCount;
    }
    public final Integer b(){
       return this.giftId;
    }
    public final LiveJsCmdSendGiftToAnchorV2$LoggerParams c(){
       return this.LoggerParams;
    }
    public final String d(){
       return this.scene;
    }
    public final String e(){
       return this.sendExtraInfo;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveJsCmdSendGiftToAnchorV2$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveJsCmdSendGiftToAnchorV2$a && (a.g(this.giftId, p0.giftId) && (a.g(this.batchCount, p0.batchCount) && (a.g(this.giftToken, p0.giftToken) && (a.g(this.isCombo, p0.isCombo) && (a.g(this.scene, p0.scene) && (a.g(this.isAsync, p0.isAsync) && (a.g(this.LoggerParams, p0.LoggerParams) && (a.g(this.logExtraInfo, p0.logExtraInfo) && a.g(this.sendExtraInfo, p0.sendExtraInfo))))))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       LiveJsCmdSendGiftToAnchorV2$a obj = PatchProxy.apply(null, this, LiveJsCmdSendGiftToAnchorV2$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.giftId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LiveJsCmdSendGiftToAnchorV2$a tbatchCount = this.batchCount;
       int i2 = (tbatchCount != null)? tbatchCount.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbatchCount = this.giftToken;
       i2 = (tbatchCount != null)? tbatchCount.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbatchCount = this.isCombo;
       i2 = (tbatchCount != null)? tbatchCount.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbatchCount = this.scene;
       i2 = (tbatchCount != null)? tbatchCount.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbatchCount = this.isAsync;
       i2 = (tbatchCount != null)? tbatchCount.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbatchCount = this.LoggerParams;
       i2 = (tbatchCount != null)? tbatchCount.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbatchCount = this.logExtraInfo;
       i2 = (tbatchCount != null)? tbatchCount.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbatchCount = this.sendExtraInfo;
       if (tbatchCount != null) {
          i = tbatchCount.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveJsCmdSendGiftToAnchorV2$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Request\(giftId="+this.giftId+", batchCount="+this.batchCount+", giftToken="+this.giftToken+", isCombo="+this.isCombo+", scene="+this.scene+", isAsync="+this.isAsync+", LoggerParams="+this.LoggerParams+", logExtraInfo="+this.logExtraInfo+", sendExtraInfo="+this.sendExtraInfo+"\)";
    }
}
