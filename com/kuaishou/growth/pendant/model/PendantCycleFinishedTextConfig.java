package com.kuaishou.growth.pendant.model.PendantCycleFinishedTextConfig;
import java.io.Serializable;
import com.kuaishou.growth.pendant.model.PendantCycleFinishedTextConfig$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Long;
import java.lang.Boolean;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class PendantCycleFinishedTextConfig implements Serializable	// class@000674
{
    public final String cycleFinishedTextColor;
    public final float cycleFinishedTextSize;
    public final boolean isFakeBold;
    public final int leftMargin;
    public final int offsetX;
    public final int offsetY;
    public final long textAnimPlayDuration;
    public final long textEnterDelayDuration;
    public final int topMargin;
    public static final PendantCycleFinishedTextConfig$a Companion;
    public static final long serialVersionUID;

    static {
       PendantCycleFinishedTextConfig.Companion = new PendantCycleFinishedTextConfig$a(null);
    }
    public void PendantCycleFinishedTextConfig(String p0,float p1,long p2,long p3,boolean p4,int p5,int p6,int p7,int p8){
       super();
       this.cycleFinishedTextColor = p0;
       this.cycleFinishedTextSize = p1;
       this.textEnterDelayDuration = p2;
       this.textAnimPlayDuration = p3;
       this.isFakeBold = p4;
       this.topMargin = p5;
       this.leftMargin = p6;
       this.offsetX = p7;
       this.offsetY = p8;
    }
    public static PendantCycleFinishedTextConfig copy$default(PendantCycleFinishedTextConfig p0,String p1,float p2,long p3,long p4,boolean p5,int p6,int p7,int p8,int p9,int p10,Object p11){
       PendantCycleFinishedTextConfig pendantCycle = p0;
       int i = p10;
       PendantCycleFinishedTextConfig cycleFinishe = (i & 0x01)? pendantCycle.cycleFinishedTextColor: p1;
       PendantCycleFinishedTextConfig cycleFinishe1 = (i & 0x02)? pendantCycle.cycleFinishedTextSize: p2;
       PendantCycleFinishedTextConfig textEnterDel = (i & 0x04)? pendantCycle.textEnterDelayDuration: p3;
       PendantCycleFinishedTextConfig textAnimPlay = (i & 0x08)? pendantCycle.textAnimPlayDuration: p4;
       PendantCycleFinishedTextConfig isFakeBold = (i & 0x10)? pendantCycle.isFakeBold: p5;
       PendantCycleFinishedTextConfig topMargin = (i & 0x20)? pendantCycle.topMargin: p6;
       PendantCycleFinishedTextConfig leftMargin = (i & 0x40)? pendantCycle.leftMargin: p7;
       PendantCycleFinishedTextConfig offsetX = (i & 0x0080)? pendantCycle.offsetX: p8;
       PendantCycleFinishedTextConfig offsetY = (i & 0x0100)? pendantCycle.offsetY: p9;
       return p0.copy(cycleFinishe, cycleFinishe1, textEnterDel, textAnimPlay, isFakeBold, topMargin, leftMargin, offsetX, offsetY);
    }
    public final String component1(){
       return this.cycleFinishedTextColor;
    }
    public final float component2(){
       return this.cycleFinishedTextSize;
    }
    public final long component3(){
       return this.textEnterDelayDuration;
    }
    public final long component4(){
       return this.textAnimPlayDuration;
    }
    public final boolean component5(){
       return this.isFakeBold;
    }
    public final int component6(){
       return this.topMargin;
    }
    public final int component7(){
       return this.leftMargin;
    }
    public final int component8(){
       return this.offsetX;
    }
    public final int component9(){
       return this.offsetY;
    }
    public final PendantCycleFinishedTextConfig copy(String p0,float p1,long p2,long p3,boolean p4,int p5,int p6,int p7,int p8){
       Object obj;
       if (PatchProxy.isSupport(PendantCycleFinishedTextConfig.class)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = Float.valueOf(p1);
          objArray[2] = Long.valueOf(p2);
          objArray[3] = Long.valueOf(p3);
          objArray[4] = Boolean.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = Integer.valueOf(p8);
          obj = PatchProxy.apply(objArray, this, PendantCycleFinishedTextConfig.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       PendantCycleFinishedTextConfig pendantCycle = new PendantCycleFinishedTextConfig(p0, p1, p2, p3, p4, p5, p6, p7, p8);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PendantCycleFinishedTextConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof PendantCycleFinishedTextConfig && (a.g(this.cycleFinishedTextColor, p0.cycleFinishedTextColor) && (!Float.compare(this.cycleFinishedTextSize, p0.cycleFinishedTextSize) && (!this.textEnterDelayDuration - p0.textEnterDelayDuration && (!this.textAnimPlayDuration - p0.textAnimPlayDuration && (this.isFakeBold == p0.isFakeBold && (this.topMargin == p0.topMargin && (this.leftMargin == p0.leftMargin && (this.offsetX == p0.offsetX && this.offsetY == p0.offsetY)))))))))) {
          return true;
       }
       return false;
    }
    public final String getCycleFinishedTextColor(){
       return this.cycleFinishedTextColor;
    }
    public final float getCycleFinishedTextSize(){
       return this.cycleFinishedTextSize;
    }
    public final int getLeftMargin(){
       return this.leftMargin;
    }
    public final int getOffsetX(){
       return this.offsetX;
    }
    public final int getOffsetY(){
       return this.offsetY;
    }
    public final long getTextAnimPlayDuration(){
       return this.textAnimPlayDuration;
    }
    public final long getTextEnterDelayDuration(){
       return this.textEnterDelayDuration;
    }
    public final int getTopMargin(){
       return this.topMargin;
    }
    public int hashCode(){
       int i1;
       PendantCycleFinishedTextConfig obj = PatchProxy.apply(null, this, PendantCycleFinishedTextConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.cycleFinishedTextColor;
       int i = (obj != null)? obj.hashCode(): 0;
       PendantCycleFinishedTextConfig ttextEnterDe = this.textEnterDelayDuration;
       ttextEnterDe = this.textAnimPlayDuration;
       i = ((((((i * 31) + Float.floatToIntBits(this.cycleFinishedTextSize)) * 31) + (int)(ttextEnterDe ^ (ttextEnterDe >> 32))) * 31) + (int)(ttextEnterDe ^ (ttextEnterDe >> 32))) * 31;
       ttextEnterDe = this.isFakeBold;
       if (ttextEnterDe != null) {
          i1 = 1;
       }
       return (((((((((i + i1) * 31) + this.topMargin) * 31) + this.leftMargin) * 31) + this.offsetX) * 31) + this.offsetY);
    }
    public final boolean isFakeBold(){
       return this.isFakeBold;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PendantCycleFinishedTextConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PendantCycleFinishedTextConfig\(cycleFinishedTextColor="+this.cycleFinishedTextColor+", cycleFinishedTextSize="+this.cycleFinishedTextSize+", textEnterDelayDuration="+this.textEnterDelayDuration+", textAnimPlayDuration="+this.textAnimPlayDuration+", isFakeBold="+this.isFakeBold+", topMargin="+this.topMargin+", leftMargin="+this.leftMargin+", offsetX="+this.offsetX+", offsetY="+this.offsetY+"\)";
    }
}
