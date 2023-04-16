package com.kuaishou.live.common.core.component.gift.domain.effect.bean.LiveEffectKissFrogData;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveEffectKissFrogData implements Serializable	// class@0011a4
{
    public final int giftNum;

    public void LiveEffectKissFrogData(int p0){
       super();
       this.giftNum = p0;
    }
    public static LiveEffectKissFrogData copy$default(LiveEffectKissFrogData p0,int p1,int p2,Object p3){
       LiveEffectKissFrogData giftNum;
       if (p2 & 0x01) {
          giftNum = p0.giftNum;
       }
       return p0.copy(giftNum);
    }
    public final int component1(){
       return this.giftNum;
    }
    public final LiveEffectKissFrogData copy(int p0){
       if (PatchProxy.isSupport(LiveEffectKissFrogData.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LiveEffectKissFrogData.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new LiveEffectKissFrogData(p0);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof LiveEffectKissFrogData && this.giftNum == p0.giftNum)) {
          return true;
       }
       return false;
    }
    public final int getGiftNum(){
       return this.giftNum;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, LiveEffectKissFrogData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.giftNum;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveEffectKissFrogData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveEffectKissFrogData\(giftNum="+this.giftNum+"\)";
    }
}
