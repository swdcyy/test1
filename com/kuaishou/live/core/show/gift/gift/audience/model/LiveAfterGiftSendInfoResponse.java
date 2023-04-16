package com.kuaishou.live.core.show.gift.gift.audience.model.LiveAfterGiftSendInfoResponse;
import java.io.Serializable;
import java.lang.String;
import java.lang.Integer;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveAfterGiftSendInfoResponse implements Serializable	// class@000bb7
{
    public final String broadcastGiftFeed;
    public final int comboCount;
    public final String comboKey;
    public final String effectInfoPBString;
    public final Integer effectInfoType;
    public final boolean isFromBlessingLight;
    public final String multiMagicEffectGiftFeed;
    public final String normalGiftFeed;
    public final String toAudienceGiftFeed;

    public void LiveAfterGiftSendInfoResponse(String p0,Integer p1,String p2,String p3,String p4,String p5,boolean p6,String p7,int p8){
       a.p(p2, "normalGiftFeed");
       a.p(p3, "broadcastGiftFeed");
       a.p(p4, "toAudienceGiftFeed");
       super();
       this.effectInfoPBString = p0;
       this.effectInfoType = p1;
       this.normalGiftFeed = p2;
       this.broadcastGiftFeed = p3;
       this.toAudienceGiftFeed = p4;
       this.multiMagicEffectGiftFeed = p5;
       this.isFromBlessingLight = p6;
       this.comboKey = p7;
       this.comboCount = p8;
    }
    public static LiveAfterGiftSendInfoResponse copy$default(LiveAfterGiftSendInfoResponse p0,String p1,Integer p2,String p3,String p4,String p5,String p6,boolean p7,String p8,int p9,int p10,Object p11){
       LiveAfterGiftSendInfoResponse liveAfterGif = p0;
       int i = p10;
       LiveAfterGiftSendInfoResponse effectInfoPB = (i & 0x01)? liveAfterGif.effectInfoPBString: p1;
       LiveAfterGiftSendInfoResponse effectInfoTy = (i & 0x02)? liveAfterGif.effectInfoType: p2;
       LiveAfterGiftSendInfoResponse normalGiftFe = (i & 0x04)? liveAfterGif.normalGiftFeed: p3;
       LiveAfterGiftSendInfoResponse broadcastGif = (i & 0x08)? liveAfterGif.broadcastGiftFeed: p4;
       LiveAfterGiftSendInfoResponse toAudienceGi = (i & 0x10)? liveAfterGif.toAudienceGiftFeed: p5;
       LiveAfterGiftSendInfoResponse multiMagicEf = (i & 0x20)? liveAfterGif.multiMagicEffectGiftFeed: p6;
       LiveAfterGiftSendInfoResponse isFromBlessi = (i & 0x40)? liveAfterGif.isFromBlessingLight: p7;
       LiveAfterGiftSendInfoResponse comboKey = (i & 0x0080)? liveAfterGif.comboKey: p8;
       LiveAfterGiftSendInfoResponse comboCount = (i & 0x0100)? liveAfterGif.comboCount: p9;
       return p0.copy(effectInfoPB, effectInfoTy, normalGiftFe, broadcastGif, toAudienceGi, multiMagicEf, isFromBlessi, comboKey, comboCount);
    }
    public final String component1(){
       return this.effectInfoPBString;
    }
    public final Integer component2(){
       return this.effectInfoType;
    }
    public final String component3(){
       return this.normalGiftFeed;
    }
    public final String component4(){
       return this.broadcastGiftFeed;
    }
    public final String component5(){
       return this.toAudienceGiftFeed;
    }
    public final String component6(){
       return this.multiMagicEffectGiftFeed;
    }
    public final boolean component7(){
       return this.isFromBlessingLight;
    }
    public final String component8(){
       return this.comboKey;
    }
    public final int component9(){
       return this.comboCount;
    }
    public final LiveAfterGiftSendInfoResponse copy(String p0,Integer p1,String p2,String p3,String p4,String p5,boolean p6,String p7,int p8){
       LiveAfterGiftSendInfoResponse obj;
       object oobject = p2;
       object oobject1 = p3;
       object oobject2 = p4;
       if (PatchProxy.isSupport(LiveAfterGiftSendInfoResponse.class)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = oobject;
          objArray[3] = oobject1;
          objArray[4] = oobject2;
          objArray[5] = p5;
          objArray[6] = Boolean.valueOf(p6);
          objArray[7] = p7;
          objArray[8] = Integer.valueOf(p8);
          obj = PatchProxy.apply(objArray, this, LiveAfterGiftSendInfoResponse.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       a.p(p2, "normalGiftFeed");
       a.p(oobject1, "broadcastGiftFeed");
       a.p(oobject2, "toAudienceGiftFeed");
       obj = new LiveAfterGiftSendInfoResponse(p0, p1, p2, p3, p4, p5, p6, p7, p8);
       return v11;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAfterGiftSendInfoResponse.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveAfterGiftSendInfoResponse && (a.g(this.effectInfoPBString, p0.effectInfoPBString) && (a.g(this.effectInfoType, p0.effectInfoType) && (a.g(this.normalGiftFeed, p0.normalGiftFeed) && (a.g(this.broadcastGiftFeed, p0.broadcastGiftFeed) && (a.g(this.toAudienceGiftFeed, p0.toAudienceGiftFeed) && (a.g(this.multiMagicEffectGiftFeed, p0.multiMagicEffectGiftFeed) && (this.isFromBlessingLight == p0.isFromBlessingLight && (a.g(this.comboKey, p0.comboKey) && this.comboCount == p0.comboCount)))))))))) {
          return true;
       }
       return false;
    }
    public final String getBroadcastGiftFeed(){
       return this.broadcastGiftFeed;
    }
    public final int getComboCount(){
       return this.comboCount;
    }
    public final String getComboKey(){
       return this.comboKey;
    }
    public final String getEffectInfoPBString(){
       return this.effectInfoPBString;
    }
    public final Integer getEffectInfoType(){
       return this.effectInfoType;
    }
    public final String getMultiMagicEffectGiftFeed(){
       return this.multiMagicEffectGiftFeed;
    }
    public final String getNormalGiftFeed(){
       return this.normalGiftFeed;
    }
    public final String getToAudienceGiftFeed(){
       return this.toAudienceGiftFeed;
    }
    public int hashCode(){
       LiveAfterGiftSendInfoResponse obj = PatchProxy.apply(null, this, LiveAfterGiftSendInfoResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.effectInfoPBString;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LiveAfterGiftSendInfoResponse teffectInfoT = this.effectInfoType;
       int i2 = (teffectInfoT != null)? teffectInfoT.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       teffectInfoT = this.normalGiftFeed;
       i2 = (teffectInfoT != null)? teffectInfoT.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       teffectInfoT = this.broadcastGiftFeed;
       i2 = (teffectInfoT != null)? teffectInfoT.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       teffectInfoT = this.toAudienceGiftFeed;
       i2 = (teffectInfoT != null)? teffectInfoT.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       teffectInfoT = this.multiMagicEffectGiftFeed;
       i2 = (teffectInfoT != null)? teffectInfoT.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       teffectInfoT = this.isFromBlessingLight;
       if (teffectInfoT != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       teffectInfoT = this.comboKey;
       if (teffectInfoT != null) {
          i = teffectInfoT.hashCode();
       }
       return (((i1 + i) * 31) + this.comboCount);
    }
    public final boolean isFromBlessingLight(){
       return this.isFromBlessingLight;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveAfterGiftSendInfoResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveAfterGiftSendInfoResponse\(effectInfoPBString="+this.effectInfoPBString+", effectInfoType="+this.effectInfoType+", normalGiftFeed="+this.normalGiftFeed+", broadcastGiftFeed="+this.broadcastGiftFeed+", toAudienceGiftFeed="+this.toAudienceGiftFeed+", multiMagicEffectGiftFeed="+this.multiMagicEffectGiftFeed+", isFromBlessingLight="+this.isFromBlessingLight+", comboKey="+this.comboKey+", comboCount="+this.comboCount+"\)";
    }
}
