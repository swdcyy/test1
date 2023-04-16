package com.kwai.feature.api.danmaku.model.DanmakuMaskOpenGuideConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class DanmakuMaskOpenGuideConfig implements Serializable	// class@000e7b
{
    public final int maxShowCount;
    public final int startShowTime;
    public final int tipsShowTime;

    public void DanmakuMaskOpenGuideConfig(int p0,int p1,int p2){
       super();
       this.maxShowCount = p0;
       this.tipsShowTime = p1;
       this.startShowTime = p2;
    }
    public static DanmakuMaskOpenGuideConfig copy$default(DanmakuMaskOpenGuideConfig p0,int p1,int p2,int p3,int p4,Object p5){
       DanmakuMaskOpenGuideConfig maxShowCount;
       DanmakuMaskOpenGuideConfig tipsShowTime;
       DanmakuMaskOpenGuideConfig startShowTim;
       if (p4 & 0x01) {
          maxShowCount = p0.maxShowCount;
       }
       if (p4 & 0x02) {
          tipsShowTime = p0.tipsShowTime;
       }
       if (p4 & 0x04) {
          startShowTim = p0.startShowTime;
       }
       return p0.copy(maxShowCount, tipsShowTime, startShowTim);
    }
    public final int component1(){
       return this.maxShowCount;
    }
    public final DanmakuMaskOpenGuideConfig copy(int p0,int p1,int p2){
       if (PatchProxy.isSupport(DanmakuMaskOpenGuideConfig.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, DanmakuMaskOpenGuideConfig.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new DanmakuMaskOpenGuideConfig(p0, p1, p2);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof DanmakuMaskOpenGuideConfig && (this.maxShowCount == p0.maxShowCount && (this.tipsShowTime == p0.tipsShowTime && this.startShowTime == p0.startShowTime)))) {
          return true;
       }
       return false;
    }
    public final int getMaxShowCount(){
       return this.maxShowCount;
    }
    public final int getStartShowTimeMillisecond(){
       return (this.startShowTime * 1000);
    }
    public final int getTipsShowTimeMillisecond(){
       return (this.tipsShowTime * 1000);
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, DanmakuMaskOpenGuideConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ((((this.maxShowCount * 31) + this.tipsShowTime) * 31) + this.startShowTime);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, DanmakuMaskOpenGuideConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "DanmakuMaskOpenGuideConfig\(maxShowCount="+this.maxShowCount+", tipsShowTime="+this.tipsShowTime+", startShowTime="+this.startShowTime+"\)";
    }
}
