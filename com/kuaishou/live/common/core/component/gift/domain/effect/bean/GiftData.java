package com.kuaishou.live.common.core.component.gift.domain.effect.bean.GiftData;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class GiftData implements Serializable	// class@0011a2
{
    public final String giftId;
    public final String giftName;
    public final int giftPrice;

    public void GiftData(String p0,String p1,int p2){
       a.p(p0, "giftName");
       a.p(p1, "giftId");
       super();
       this.giftName = p0;
       this.giftId = p1;
       this.giftPrice = p2;
    }
    public static GiftData copy$default(GiftData p0,String p1,String p2,int p3,int p4,Object p5){
       GiftData giftName;
       GiftData giftId;
       GiftData giftPrice;
       if (p4 & 0x01) {
          giftName = p0.giftName;
       }
       if (p4 & 0x02) {
          giftId = p0.giftId;
       }
       if (p4 & 0x04) {
          giftPrice = p0.giftPrice;
       }
       return p0.copy(giftName, giftId, giftPrice);
    }
    public final String component1(){
       return this.giftName;
    }
    public final String component2(){
       return this.giftId;
    }
    public final int component3(){
       return this.giftPrice;
    }
    public final GiftData copy(String p0,String p1,int p2){
       if (PatchProxy.isSupport(GiftData.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, GiftData.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "giftName");
       a.p(p1, "giftId");
       return new GiftData(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GiftData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof GiftData && (a.g(this.giftName, p0.giftName) && (a.g(this.giftId, p0.giftId) && this.giftPrice == p0.giftPrice)))) {
          return true;
       }
       return false;
    }
    public final String getGiftId(){
       return this.giftId;
    }
    public final String getGiftName(){
       return this.giftName;
    }
    public final int getGiftPrice(){
       return this.giftPrice;
    }
    public int hashCode(){
       GiftData obj = PatchProxy.apply(null, this, GiftData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.giftName;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       GiftData tgiftId = this.giftId;
       if (tgiftId != null) {
          i = tgiftId.hashCode();
       }
       return (((i1 + i) * 31) + this.giftPrice);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, GiftData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "GiftData\(giftName="+this.giftName+", giftId="+this.giftId+", giftPrice="+this.giftPrice+"\)";
    }
}
