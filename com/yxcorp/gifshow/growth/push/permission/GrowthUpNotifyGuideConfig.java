package com.yxcorp.gifshow.growth.push.permission.GrowthUpNotifyGuideConfig;
import com.yxcorp.gifshow.growth.push.permission.CommonGrowthUpPushGuideConfig;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class GrowthUpNotifyGuideConfig extends CommonGrowthUpPushGuideConfig	// class@0014a8
{
    public final String button1;
    public final String button2;
    public final String card;
    public final long momentLike;
    public final int scene;

    public void GrowthUpNotifyGuideConfig(int p0,long p1,String p2,String p3,String p4){
       a.p(p2, "card");
       a.p(p3, "button1");
       a.p(p4, "button2");
       super();
       this.scene = p0;
       this.momentLike = p1;
       this.card = p2;
       this.button1 = p3;
       this.button2 = p4;
    }
    public static GrowthUpNotifyGuideConfig copy$default(GrowthUpNotifyGuideConfig p0,int p1,long p2,String p3,String p4,String p5,int p6,Object p7){
       GrowthUpNotifyGuideConfig scene;
       GrowthUpNotifyGuideConfig momentLike;
       GrowthUpNotifyGuideConfig card;
       GrowthUpNotifyGuideConfig button1;
       GrowthUpNotifyGuideConfig button2;
       if (p6 & 0x01) {
          scene = p0.scene;
       }
       if (p6 & 0x02) {
          momentLike = p0.momentLike;
       }
       GrowthUpNotifyGuideConfig growthUpNoti = momentLike;
       if (p6 & 0x04) {
          card = p0.card;
       }
       p7 = card;
       if (p6 & 0x08) {
          button1 = p0.button1;
       }
       GrowthUpNotifyGuideConfig growthUpNoti1 = button1;
       if (p6 & 0x10) {
          button2 = p0.button2;
       }
       return p0.copy(scene, growthUpNoti, p7, growthUpNoti1, button2);
    }
    public final int component1(){
       return this.scene;
    }
    public final long component2(){
       return this.momentLike;
    }
    public final String component3(){
       return this.card;
    }
    public final String component4(){
       return this.button1;
    }
    public final String component5(){
       return this.button2;
    }
    public final GrowthUpNotifyGuideConfig copy(int p0,long p1,String p2,String p3,String p4){
       Object obj;
       if (PatchProxy.isSupport(GrowthUpNotifyGuideConfig.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Long.valueOf(p1),p2,p3,p4};
          obj = PatchProxy.apply(objArray, this, GrowthUpNotifyGuideConfig.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p2, "card");
       a.p(p3, "button1");
       a.p(p4, "button2");
       GrowthUpNotifyGuideConfig growthUpNoti = new GrowthUpNotifyGuideConfig(p0, p1, p2, p3, p4);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GrowthUpNotifyGuideConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof GrowthUpNotifyGuideConfig && (this.scene == p0.scene && (!this.momentLike - p0.momentLike && (a.g(this.card, p0.card) && (a.g(this.button1, p0.button1) && a.g(this.button2, p0.button2))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, GrowthUpNotifyGuideConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       GrowthUpNotifyGuideConfig tmomentLike = this.momentLike;
       int i = ((this.scene * 31) + (int)(tmomentLike ^ (tmomentLike >> 32))) * 31;
       tmomentLike = this.card;
       int i1 = 0;
       int i2 = (tmomentLike != null)? tmomentLike.hashCode(): 0;
       i = (i + i2) * 31;
       tmomentLike = this.button1;
       i2 = (tmomentLike != null)? tmomentLike.hashCode(): 0;
       i = (i + i2) * 31;
       tmomentLike = this.button2;
       if (tmomentLike != null) {
          i1 = tmomentLike.hashCode();
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, GrowthUpNotifyGuideConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "GrowthUpNotifyGuideConfig\(scene="+this.scene+", momentLike="+this.momentLike+", card="+this.card+", button1="+this.button1+", button2="+this.button2+"\)";
    }
}
