package com.kuaishou.live.core.show.conditionredpacket.model.LiveConditionRedPacketTabInformation;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Arrays;
import java.lang.StringBuilder;

public final class LiveConditionRedPacketTabInformation implements Serializable	// class@000ab9
{
    public final int countLowerLimit;
    public final int countUpperLimit;
    public final long[] countdownItems;
    public final int defaultCountdownItemIndex;
    public final String description;
    public final boolean enableSend;
    public final int redPackType;
    public final String ruleUrl;
    public final String title;
    public final int totalLowerLimit;
    public final int totalUpperLimit;
    public final int unitLowerLimit;
    public final int unitUpperLimit;

    public void LiveConditionRedPacketTabInformation(int p0,String p1,String p2,String p3,long[] p4,int p5,int p6,int p7,int p8,int p9,int p10,int p11,boolean p12){
       a.p(p1, "title");
       a.p(p2, "description");
       a.p(p4, "countdownItems");
       super();
       this.redPackType = p0;
       this.title = p1;
       this.description = p2;
       this.ruleUrl = p3;
       this.countdownItems = p4;
       this.defaultCountdownItemIndex = p5;
       this.countLowerLimit = p6;
       this.countUpperLimit = p7;
       this.unitLowerLimit = p8;
       this.unitUpperLimit = p9;
       this.totalLowerLimit = p10;
       this.totalUpperLimit = p11;
       this.enableSend = p12;
    }
    public static LiveConditionRedPacketTabInformation copy$default(LiveConditionRedPacketTabInformation p0,int p1,String p2,String p3,String p4,long[] p5,int p6,int p7,int p8,int p9,int p10,int p11,int p12,boolean p13,int p14,Object p15){
       LiveConditionRedPacketTabInformation liveConditio = p0;
       int i = p14;
       LiveConditionRedPacketTabInformation redPackType = (i & 0x01)? liveConditio.redPackType: p1;
       LiveConditionRedPacketTabInformation title = (i & 0x02)? liveConditio.title: p2;
       LiveConditionRedPacketTabInformation description = (i & 0x04)? liveConditio.description: p3;
       LiveConditionRedPacketTabInformation ruleUrl = (i & 0x08)? liveConditio.ruleUrl: p4;
       LiveConditionRedPacketTabInformation countdownIte = (i & 0x10)? liveConditio.countdownItems: p5;
       LiveConditionRedPacketTabInformation defaultCount = (i & 0x20)? liveConditio.defaultCountdownItemIndex: p6;
       LiveConditionRedPacketTabInformation countLowerLi = (i & 0x40)? liveConditio.countLowerLimit: p7;
       LiveConditionRedPacketTabInformation countUpperLi = (i & 0x0080)? liveConditio.countUpperLimit: p8;
       LiveConditionRedPacketTabInformation unitLowerLim = (i & 0x0100)? liveConditio.unitLowerLimit: p9;
       LiveConditionRedPacketTabInformation unitUpperLim = (i & 0x0200)? liveConditio.unitUpperLimit: p10;
       LiveConditionRedPacketTabInformation totalLowerLi = (i & 0x0400)? liveConditio.totalLowerLimit: p11;
       LiveConditionRedPacketTabInformation totalUpperLi = (i & 0x0800)? liveConditio.totalUpperLimit: p12;
       LiveConditionRedPacketTabInformation enableSend = (i & 0x1000)? liveConditio.enableSend: p13;
       return p0.copy(redPackType, title, description, ruleUrl, countdownIte, defaultCount, countLowerLi, countUpperLi, unitLowerLim, unitUpperLim, totalLowerLi, totalUpperLi, enableSend);
    }
    public final int component1(){
       return this.redPackType;
    }
    public final int component10(){
       return this.unitUpperLimit;
    }
    public final int component11(){
       return this.totalLowerLimit;
    }
    public final int component12(){
       return this.totalUpperLimit;
    }
    public final boolean component13(){
       return this.enableSend;
    }
    public final String component2(){
       return this.title;
    }
    public final String component3(){
       return this.description;
    }
    public final String component4(){
       return this.ruleUrl;
    }
    public final long[] component5(){
       return this.countdownItems;
    }
    public final int component6(){
       return this.defaultCountdownItemIndex;
    }
    public final int component7(){
       return this.countLowerLimit;
    }
    public final int component8(){
       return this.countUpperLimit;
    }
    public final int component9(){
       return this.unitLowerLimit;
    }
    public final LiveConditionRedPacketTabInformation copy(int p0,String p1,String p2,String p3,long[] p4,int p5,int p6,int p7,int p8,int p9,int p10,int p11,boolean p12){
       LiveConditionRedPacketTabInformation obj;
       object oobject = p1;
       object oobject1 = p2;
       object oobject2 = p4;
       if (PatchProxy.isSupport(LiveConditionRedPacketTabInformation.class)) {
          Object[] objArray = new Object[13];
          objArray[0] = Integer.valueOf(p0);
          objArray[1] = oobject;
          objArray[2] = oobject1;
          objArray[3] = p3;
          objArray[4] = oobject2;
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = Integer.valueOf(p8);
          objArray[9] = Integer.valueOf(p9);
          objArray[10] = Integer.valueOf(p10);
          objArray[11] = Integer.valueOf(p11);
          objArray[12] = Boolean.valueOf(p12);
          obj = PatchProxy.apply(objArray, this, LiveConditionRedPacketTabInformation.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       a.p(oobject, "title");
       a.p(oobject1, "description");
       a.p(oobject2, "countdownItems");
       obj = new LiveConditionRedPacketTabInformation(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12);
       return v15;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveConditionRedPacketTabInformation.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveConditionRedPacketTabInformation && (this.redPackType == p0.redPackType && (a.g(this.title, p0.title) && (a.g(this.description, p0.description) && (a.g(this.ruleUrl, p0.ruleUrl) && (a.g(this.countdownItems, p0.countdownItems) && (this.defaultCountdownItemIndex == p0.defaultCountdownItemIndex && (this.countLowerLimit == p0.countLowerLimit && (this.countUpperLimit == p0.countUpperLimit && (this.unitLowerLimit == p0.unitLowerLimit && (this.unitUpperLimit == p0.unitUpperLimit && (this.totalLowerLimit == p0.totalLowerLimit && (this.totalUpperLimit == p0.totalUpperLimit && this.enableSend == p0.enableSend)))))))))))))) {
          return true;
       }
       return false;
    }
    public final int getCountLowerLimit(){
       return this.countLowerLimit;
    }
    public final int getCountUpperLimit(){
       return this.countUpperLimit;
    }
    public final long[] getCountdownItems(){
       return this.countdownItems;
    }
    public final int getDefaultCountdownItemIndex(){
       return this.defaultCountdownItemIndex;
    }
    public final String getDescription(){
       return this.description;
    }
    public final boolean getEnableSend(){
       return this.enableSend;
    }
    public final int getRedPackType(){
       return this.redPackType;
    }
    public final String getRuleUrl(){
       return this.ruleUrl;
    }
    public final String getTitle(){
       return this.title;
    }
    public final int getTotalLowerLimit(){
       return this.totalLowerLimit;
    }
    public final int getTotalUpperLimit(){
       return this.totalUpperLimit;
    }
    public final int getUnitLowerLimit(){
       return this.unitLowerLimit;
    }
    public final int getUnitUpperLimit(){
       return this.unitUpperLimit;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, LiveConditionRedPacketTabInformation.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.redPackType * 31;
       LiveConditionRedPacketTabInformation ttitle = this.title;
       int i1 = 0;
       int i2 = (ttitle != null)? ttitle.hashCode(): 0;
       i = (i + i2) * 31;
       ttitle = this.description;
       i2 = (ttitle != null)? ttitle.hashCode(): 0;
       i = (i + i2) * 31;
       ttitle = this.ruleUrl;
       i2 = (ttitle != null)? ttitle.hashCode(): 0;
       i = (i + i2) * 31;
       ttitle = this.countdownItems;
       if (ttitle != null) {
          i1 = Arrays.hashCode(ttitle);
       }
       i = (((((((((((((((i + i1) * 31) + this.defaultCountdownItemIndex) * 31) + this.countLowerLimit) * 31) + this.countUpperLimit) * 31) + this.unitLowerLimit) * 31) + this.unitUpperLimit) * 31) + this.totalLowerLimit) * 31) + this.totalUpperLimit) * 31;
       ttitle = this.enableSend;
       if (ttitle != null) {
          i2 = 1;
       }
       return (i + i2);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveConditionRedPacketTabInformation.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveConditionRedPacketTabInformation\(redPackType="+this.redPackType+", title="+this.title+", description="+this.description+", ruleUrl="+this.ruleUrl+", countdownItems="+Arrays.toString(this.countdownItems)+", defaultCountdownItemIndex="+this.defaultCountdownItemIndex+", countLowerLimit="+this.countLowerLimit+", countUpperLimit="+this.countUpperLimit+", unitLowerLimit="+this.unitLowerLimit+", unitUpperLimit="+this.unitUpperLimit+", totalLowerLimit="+this.totalLowerLimit+", totalUpperLimit="+this.totalUpperLimit+", enableSend="+this.enableSend+"\)";
    }
}
