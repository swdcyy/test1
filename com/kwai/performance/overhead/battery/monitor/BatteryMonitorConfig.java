package com.kwai.performance.overhead.battery.monitor.BatteryMonitorConfig;
import java.io.Serializable;
import yf7.f;
import com.kwai.performance.overhead.battery.monitor.BatteryMonitorConfig$b;
import nsd.u;
import java.util.List;
import com.kwai.performance.overhead.battery.monitor.ThreadCpuInfoConfig;
import msd.l;
import msd.a;
import msd.p;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class BatteryMonitorConfig extends f implements Serializable	// class@001129
{
    public int baseMonitorFlag;
    public final List blackSections;
    public int cpuExceptionFlag;
    public List cpuUsageCallbacks;
    public final l customParamsInvoker;
    public boolean disable;
    public boolean enableBgSample;
    public final boolean enableCollectGpuInfo;
    public final boolean enableCollectSysCpu;
    public boolean enableStackSampling;
    public boolean enableThreadCpuInfo;
    public final long loopInterval;
    public long loopIntervalBg;
    public int overThresholdTimes;
    public float processCpuUsageThreshold;
    public int sampleListSize;
    public int slideWindowSize;
    public a socNameProvider;
    public final List specifiedSections;
    public int stackSampleInterval;
    public p statusMapProvider;
    public final int systemCpuLoop;
    public ThreadCpuInfoConfig threadCpuInfoConfig;
    public int threadCpuTopN;
    public int[] timeDiffThreshold;
    public static final BatteryMonitorConfig$b Companion;
    public static final int[] THREAD_CPU_ENABLE_THRESHOLD_DEFAULT;
    public static final int[] TIME_DIFF_THRESHOLD_DEFAULT;

    static {
       BatteryMonitorConfig.Companion = new BatteryMonitorConfig$b(null);
       BatteryMonitorConfig.THREAD_CPU_ENABLE_THRESHOLD_DEFAULT = new int[3]{250,1000,4000};
       BatteryMonitorConfig.TIME_DIFF_THRESHOLD_DEFAULT = new int[3]{250,200,150};
    }
    public void BatteryMonitorConfig(){
       super(false, false, false, false, 0, 0, 0, null, false, 0, false, 0, 0, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, 0x1ffffff, null);
    }
    public void BatteryMonitorConfig(boolean p0,boolean p1,boolean p2,boolean p3,long p4,int p5,int p6,int[] p7,boolean p8,long p9,boolean p10,float p11,int p12,int p13,int p14,int p15,int p16,int p17,List p18,List p19,ThreadCpuInfoConfig p20,l p21,List p22,a p23,p p24){
       int i = this;
       a.q(p7, "timeDiffThreshold");
       super();
       i.disable = p0;
       i.enableCollectGpuInfo = p1;
       i.enableCollectSysCpu = p2;
       i.enableThreadCpuInfo = p3;
       i.loopInterval = p4;
       i.systemCpuLoop = p5;
       i.sampleListSize = p6;
       i.timeDiffThreshold = p7;
       i.enableBgSample = p8;
       i.loopIntervalBg = p9;
       i.enableStackSampling = p10;
       i.processCpuUsageThreshold = p11;
       i.overThresholdTimes = p12;
       i.stackSampleInterval = p13;
       i.threadCpuTopN = p14;
       i.slideWindowSize = p15;
       i.baseMonitorFlag = p16;
       i.cpuExceptionFlag = p17;
       i.specifiedSections = p18;
       i.blackSections = p19;
       i.threadCpuInfoConfig = p20;
       i.customParamsInvoker = p21;
       i.cpuUsageCallbacks = p22;
       i.socNameProvider = p23;
       i.statusMapProvider = p24;
    }
    public void BatteryMonitorConfig(boolean p0,boolean p1,boolean p2,boolean p3,long p4,int p5,int p6,int[] p7,boolean p8,long p9,boolean p10,float p11,int p12,int p13,int p14,int p15,int p16,int p17,List p18,List p19,ThreadCpuInfoConfig p20,l p21,List p22,a p23,p p24,int p25,u p26){
       int i = p25;
       int i1 = (i & 0x01)? 1: p0;
       int i2 = 0;
       int i3 = (i & 0x02)? 0: p1;
       int i4 = (i & 0x04)? 0: p2;
       int i5 = (i & 0x08)? 0: p3;
       int i6 = (i & 0x10)? 1000: p4;
       int i7 = (i & 0x20)? 10: p5;
       int i8 = (i & 0x40)? 200: p6;
       int[] tIME_DIFF_TH = (i & 0x0080)? BatteryMonitorConfig.TIME_DIFF_THRESHOLD_DEFAULT: p7;
       int i9 = (i & 0x0100)? 0: p8;
       int i10 = (i & 0x0200)? 4000: p9;
       if (!(i & 0x0400)) {
          i2 = p10;
       }
       int i11 = (i & 0x0800)? 0x42a00000: p11;
       int i12 = (i & 0x1000)? 2: p12;
       int i13 = i12;
       i12 = (i & 0x2000)? 1: p13;
       int i14 = i12;
       i12 = (i & 0x4000)? 3: p14;
       int i15 = (i & 0x8000)? 60: p15;
       int i16 = (i & 0x10000)? 1: p16;
       int i17 = (i & 0x20000)? 11: p17;
       int i18 = 0;
       int i19 = (i & 0x40000)? i18: p18;
       int i20 = (i & 0x80000)? i18: p19;
       int i21 = (i & 0x100000)? i18: p20;
       int i22 = (i & 0x200000)? i18: p21;
       int i23 = (i & 0x400000)? i18: p22;
       int i24 = (i & Float.MIN_NORMAL)? i18: p23;
       if (!(i & 0x1000000)) {
          i18 = p24;
       }
       super(i1, i3, i4, i5, i6, i7, i8, tIME_DIFF_TH, i9, i10, i2, i11, i13, i14, i12, i15, i16, i17, i19, i20, i21, i22, i23, i24, i18);
       return;
    }
    public final boolean isEnableIgnoreNoDiffThread(){
       boolean b = (this.cpuExceptionFlag & 0x08)? true: false;
       return b;
    }
    public final boolean isEnableMatchMultiThread(){
       boolean b = (this.cpuExceptionFlag & 0x04)? true: false;
       return b;
    }
    public final boolean isEnableNotWindowReport(){
       int i = 1;
       if (this.cpuExceptionFlag & i) {
       }else {
          i = false;
       }
       return i;
    }
    public final boolean isEnableReportWithBatteryInfo(){
       boolean b = (this.cpuExceptionFlag & 0x02)? true: false;
       return b;
    }
    public final boolean isHoldHistoryRecords(){
       boolean b = (this.baseMonitorFlag & 0x04)? true: false;
       return b;
    }
    public final boolean isUseThreadDumpToBind(){
       boolean b = (this.cpuExceptionFlag & 0x10)? true: false;
       return b;
    }
    public final boolean reportWithSampleDetail(){
       boolean b = (this.baseMonitorFlag & 0x02)? true: false;
       return b;
    }
    public final boolean reportWithThermalStatus(){
       int i = 1;
       if (this.baseMonitorFlag & i) {
       }else {
          i = false;
       }
       return i;
    }
}
