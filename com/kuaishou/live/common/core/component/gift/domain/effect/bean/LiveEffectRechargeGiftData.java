package com.kuaishou.live.common.core.component.gift.domain.effect.bean.LiveEffectRechargeGiftData;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveEffectRechargeGiftData implements Serializable	// class@0011a5
{
    public final int countDown;
    public final int giftNum;
    public final boolean isHighLightTime;
    public final int targetGiftNum;

    public void LiveEffectRechargeGiftData(int p0,int p1,int p2,boolean p3){
       super();
       this.giftNum = p0;
       this.targetGiftNum = p1;
       this.countDown = p2;
       this.isHighLightTime = p3;
    }
    public static LiveEffectRechargeGiftData copy$default(LiveEffectRechargeGiftData p0,int p1,int p2,int p3,boolean p4,int p5,Object p6){
       LiveEffectRechargeGiftData giftNum;
       LiveEffectRechargeGiftData targetGiftNu;
       LiveEffectRechargeGiftData countDown;
       LiveEffectRechargeGiftData isHighLightT;
       if (p5 & 0x01) {
          giftNum = p0.giftNum;
       }
       if (p5 & 0x02) {
          targetGiftNu = p0.targetGiftNum;
       }
       if (p5 & 0x04) {
          countDown = p0.countDown;
       }
       if (p5 & 0x08) {
          isHighLightT = p0.isHighLightTime;
       }
       return p0.copy(giftNum, targetGiftNu, countDown, isHighLightT);
    }
    public final int component1(){
       return this.giftNum;
    }
    public final int component2(){
       return this.targetGiftNum;
    }
    public final int component3(){
       return this.countDown;
    }
    public final boolean component4(){
       return this.isHighLightTime;
    }
    public final LiveEffectRechargeGiftData copy(int p0,int p1,int p2,boolean p3){
       if (PatchProxy.isSupport(LiveEffectRechargeGiftData.class)) {
          Object obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Boolean.valueOf(p3), this, LiveEffectRechargeGiftData.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new LiveEffectRechargeGiftData(p0, p1, p2, p3);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof LiveEffectRechargeGiftData && (this.giftNum == p0.giftNum && (this.targetGiftNum == p0.targetGiftNum && (this.countDown == p0.countDown && this.isHighLightTime == p0.isHighLightTime))))) {
          return true;
       }
       return false;
    }
    public final int getCountDown(){
       return this.countDown;
    }
    public final int getGiftNum(){
       return this.giftNum;
    }
    public final int getTargetGiftNum(){
       return this.targetGiftNum;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, LiveEffectRechargeGiftData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = ((((this.giftNum * 31) + this.targetGiftNum) * 31) + this.countDown) * 31;
       LiveEffectRechargeGiftData tisHighLight = this.isHighLightTime;
       if (tisHighLight != null) {
          tisHighLight = 1;
       }
       return (i + tisHighLight);
    }
    public final boolean isHighLightTime(){
       return this.isHighLightTime;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveEffectRechargeGiftData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveEffectRechargeGiftData\(giftNum="+this.giftNum+", targetGiftNum="+this.targetGiftNum+", countDown="+this.countDown+", isHighLightTime="+this.isHighLightTime+"\)";
    }
}
