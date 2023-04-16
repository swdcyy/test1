package com.kwai.edge.reco.xtab.config.XTabPredictConfig;
import java.util.List;
import nsd.u;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Number;
import java.lang.StringBuilder;

public final class XTabPredictConfig	// class@000d61
{
    public long backToAppTriggerBackDurationLimit;
    public float backToAppTriggerRatio;
    public List candidateTab;
    public float coldLaunchTriggerRatio;
    public long delayReportTime;
    public boolean enableBackToAppTrigger;
    public boolean enableColdLaunchTrigger;
    public boolean enableDelayReport;
    public boolean enableIntervalTimeBackgroundJudge;
    public boolean enableIntervalTimeColdLaunchJudge;
    public boolean enableIntervalTimeTrigger;
    public boolean enableNasaLoadMoreTrigger;
    public long intervalTime;
    public long intervalTimeBackgroundJudgeTime;
    public long intervalTimeColdLaunchJudgeTime;
    public long intervalTimeStartDelayTime;
    public float intervalTimeTriggerRatio;
    public boolean reportIntervalTimeLabelSeparate;

    public void XTabPredictConfig(){
       super(null, false, 0, false, 0, 0, false, 0, 0, 0, false, 0, false, 0, false, false, 0, false, 0x3ffff, null);
    }
    public void XTabPredictConfig(List p0,boolean p1,float p2,boolean p3,float p4,long p5,boolean p6,float p7,long p8,long p9,boolean p10,long p11,boolean p12,long p13,boolean p14,boolean p15,long p16,boolean p17,int p18,u p19){
       int i = this;
       int i1 = p18;
       List list = (i1 & 0x01)? CollectionsKt__CollectionsKt.E(): null;
       boolean b = (i1 & 0x02)? true: p1;
       float f = 0x3f800000;
       float f1 = (i1 & 0x04)? 0x3f800000: p2;
       boolean b1 = (i1 & 0x08)? true: p3;
       float f2 = (i1 & 0x10)? 0x3f800000: p4;
       long l = (i1 & 0x20)? 0: p5;
       boolean b2 = (i1 & 0x40)? false: p6;
       if (!(i1 & 0x0080)) {
          f = p7;
       }
       long l1 = (i1 & 0x0100)? 5000: p8;
       long l2 = (i1 & 0x0200)? 5000: p9;
       int i2 = (i1 & 0x0400)? 0: p10;
       int i3 = i2;
       int i4 = (i1 & 0x0800)? 5000: p11;
       i2 = (i1 & 0x1000)? 0: p12;
       int i5 = i2;
       int i6 = (i1 & 0x2000)? 5000: p13;
       i2 = (i1 & 0x4000)? false: p14;
       int i7 = (i1 & 0x8000)? 1: p15;
       int i8 = (i1 & 0x10000)? 5000: p16;
       int i9 = (i1 & 0x20000)? 0: p17;
       a.p(list, "candidateTab");
       super();
       i.candidateTab = list;
       i.enableColdLaunchTrigger = b;
       i.coldLaunchTriggerRatio = f1;
       i.enableBackToAppTrigger = b1;
       i.backToAppTriggerRatio = f2;
       i.backToAppTriggerBackDurationLimit = l;
       i.enableIntervalTimeTrigger = b2;
       i.intervalTimeTriggerRatio = f;
       i.intervalTime = l1;
       i.intervalTimeStartDelayTime = l2;
       i.enableIntervalTimeBackgroundJudge = i3;
       i.intervalTimeBackgroundJudgeTime = i4;
       i.enableIntervalTimeColdLaunchJudge = i5;
       i.intervalTimeColdLaunchJudgeTime = i6;
       i.enableNasaLoadMoreTrigger = i2;
       i.enableDelayReport = i7;
       i.delayReportTime = i8;
       i.reportIntervalTimeLabelSeparate = i9;
       return;
    }
    public final boolean a(){
       return this.enableIntervalTimeTrigger;
    }
    public final long b(){
       return this.intervalTime;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, XTabPredictConfig.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof XTabPredictConfig && (a.g(this.candidateTab, p0.candidateTab) && (this.enableColdLaunchTrigger == p0.enableColdLaunchTrigger && (!Float.compare(this.coldLaunchTriggerRatio, p0.coldLaunchTriggerRatio) && (this.enableBackToAppTrigger == p0.enableBackToAppTrigger && (!Float.compare(this.backToAppTriggerRatio, p0.backToAppTriggerRatio) && (!this.backToAppTriggerBackDurationLimit - p0.backToAppTriggerBackDurationLimit && (this.enableIntervalTimeTrigger == p0.enableIntervalTimeTrigger && (!Float.compare(this.intervalTimeTriggerRatio, p0.intervalTimeTriggerRatio) && (!this.intervalTime - p0.intervalTime && (!this.intervalTimeStartDelayTime - p0.intervalTimeStartDelayTime && (this.enableIntervalTimeBackgroundJudge == p0.enableIntervalTimeBackgroundJudge && (!this.intervalTimeBackgroundJudgeTime - p0.intervalTimeBackgroundJudgeTime && (this.enableIntervalTimeColdLaunchJudge == p0.enableIntervalTimeColdLaunchJudge && (!this.intervalTimeColdLaunchJudgeTime - p0.intervalTimeColdLaunchJudgeTime && (this.enableNasaLoadMoreTrigger == p0.enableNasaLoadMoreTrigger && (this.enableDelayReport == p0.enableDelayReport && (!this.delayReportTime - p0.delayReportTime && this.reportIntervalTimeLabelSeparate == p0.reportIntervalTimeLabelSeparate))))))))))))))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       int i2;
       int i3;
       XTabPredictConfig obj = PatchProxy.apply(null, this, XTabPredictConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.candidateTab;
       int i = (obj != null)? obj.hashCode(): 0;
       i = i * 31;
       XTabPredictConfig tenableColdL = this.enableColdLaunchTrigger;
       int i1 = 1;
       if (tenableColdL != null) {
          tenableColdL = 1;
       }
       i = (((i + tenableColdL) * 31) + Float.floatToIntBits(this.coldLaunchTriggerRatio)) * 31;
       tenableColdL = this.enableBackToAppTrigger;
       if (tenableColdL != null) {
          i2 = 1;
       }
       XTabPredictConfig tbackToAppTr = this.backToAppTriggerBackDurationLimit;
       long l = 32;
       i = (((((i + i2) * 31) + Float.floatToIntBits(this.backToAppTriggerRatio)) * 31) + (int)(tbackToAppTr ^ (tbackToAppTr >> l))) * 31;
       tbackToAppTr = this.enableIntervalTimeTrigger;
       if (tbackToAppTr != null) {
          i3 = 1;
       }
       tbackToAppTr = this.intervalTime;
       tbackToAppTr = this.intervalTimeStartDelayTime;
       i = (((((((i + i3) * 31) + Float.floatToIntBits(this.intervalTimeTriggerRatio)) * 31) + (int)(tbackToAppTr ^ (tbackToAppTr >> l))) * 31) + (int)(tbackToAppTr ^ (tbackToAppTr >> l))) * 31;
       tbackToAppTr = this.enableIntervalTimeBackgroundJudge;
       if (tbackToAppTr != null) {
          i3 = 1;
       }
       tbackToAppTr = this.intervalTimeBackgroundJudgeTime;
       i = (((i + i3) * 31) + (int)(tbackToAppTr ^ (tbackToAppTr >> l))) * 31;
       tbackToAppTr = this.enableIntervalTimeColdLaunchJudge;
       if (tbackToAppTr != null) {
          i3 = 1;
       }
       tbackToAppTr = this.intervalTimeColdLaunchJudgeTime;
       i = (((i + i3) * 31) + (int)(tbackToAppTr ^ (tbackToAppTr >> l))) * 31;
       tbackToAppTr = this.enableNasaLoadMoreTrigger;
       if (tbackToAppTr != null) {
          i3 = 1;
       }
       i = (i + i3) * 31;
       tbackToAppTr = this.enableDelayReport;
       if (tbackToAppTr != null) {
          i3 = 1;
       }
       tbackToAppTr = this.delayReportTime;
       i = (((i + i3) * 31) + (int)(tbackToAppTr ^ (tbackToAppTr >> l))) * 31;
       tenableColdL = this.reportIntervalTimeLabelSeparate;
       if (tenableColdL == null) {
          i1 = tenableColdL;
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, XTabPredictConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "XTabPredictConfig\(candidateTab="+this.candidateTab+", enableColdLaunchTrigger="+this.enableColdLaunchTrigger+", coldLaunchTriggerRatio="+this.coldLaunchTriggerRatio+", enableBackToAppTrigger="+this.enableBackToAppTrigger+", backToAppTriggerRatio="+this.backToAppTriggerRatio+", backToAppTriggerBackDurationLimit="+this.backToAppTriggerBackDurationLimit+", enableIntervalTimeTrigger="+this.enableIntervalTimeTrigger+", intervalTimeTriggerRatio="+this.intervalTimeTriggerRatio+", intervalTime="+this.intervalTime+", intervalTimeStartDelayTime="+this.intervalTimeStartDelayTime+", enableIntervalTimeBackgroundJudge="+this.enableIntervalTimeBackgroundJudge+", intervalTimeBackgroundJudgeTime="+this.intervalTimeBackgroundJudgeTime+", enableIntervalTimeColdLaunchJudge="+this.enableIntervalTimeColdLaunchJudge+", intervalTimeColdLaunchJudgeTime="+this.intervalTimeColdLaunchJudgeTime+", enableNasaLoadMoreTrigger="+this.enableNasaLoadMoreTrigger+", enableDelayReport="+this.enableDelayReport+", delayReportTime="+this.delayReportTime+", reportIntervalTimeLabelSeparate="+this.reportIntervalTimeLabelSeparate+"\)";
    }
}
