package com.kwai.performance.stability.crash.monitor.anr.config.AnrMonitorConfigAdv;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;

public class AnrMonitorConfigAdv implements Serializable	// class@000e07
{
    public boolean appendJvmtiData;
    public int cpuInfoPairMaxSize;
    public int cpuInfoUpdateMin;
    public int cpuSamplingFlag;
    public boolean enableFastStack;
    public boolean enableGetNativeFrames;
    public boolean enableGetThreadLockInfo;
    public boolean enableSamplingPauseResume;
    public int focusThreadCpuInterval;
    public AnrMonitorConfigAdv$JvmtiControl jvmtiControl;
    public int multiThreadSamplingFlag;
    public boolean observeThreadByLock;
    public boolean runtimeCheckToken;
    public int runtimeSamplingInterval;
    public int runtimeStatFlag;
    public String[] samplingThreadList;
    public String[] threadListBlack;
    public int threadListUpdateMin;
    public int topCpuThreadNum;
    public boolean trimCpuInfo;
    public boolean trimOtherStackDiff;
    public boolean trimRuntimeStat;
    public int unwindStackFlag;
    public boolean unwindStackSafeMode;

    public void AnrMonitorConfigAdv(){
       super();
       this.enableSamplingPauseResume = true;
       this.multiThreadSamplingFlag = 0;
       String[] stringArray = new String[0];
       this.samplingThreadList = stringArray;
       stringArray = new String[0];
       this.threadListBlack = stringArray;
       this.threadListUpdateMin = 300;
       this.cpuSamplingFlag = 0;
       this.cpuInfoUpdateMin = 300;
       this.topCpuThreadNum = 10;
       this.focusThreadCpuInterval = 150;
       this.cpuInfoPairMaxSize = 100;
       this.enableFastStack = false;
       this.enableGetThreadLockInfo = false;
       this.enableGetNativeFrames = false;
       this.unwindStackSafeMode = false;
       this.unwindStackFlag = 2;
       this.runtimeStatFlag = 0;
       this.runtimeSamplingInterval = 450;
       this.runtimeCheckToken = true;
       this.observeThreadByLock = false;
       this.trimCpuInfo = false;
       this.trimRuntimeStat = false;
       this.trimOtherStackDiff = false;
       this.appendJvmtiData = false;
    }
    public boolean isDefault(){
       boolean b = (this.multiThreadSamplingFlag == null && (this.cpuSamplingFlag == null && (this.runtimeStatFlag == null && this.enableFastStack == null)))? true: false;
       return b;
    }
    public boolean isEnableCpuSampling(){
       boolean b = (this.cpuSamplingFlag != null)? true: false;
       return b;
    }
    public boolean isEnableMultiThreadSampling(){
       boolean b = (this.multiThreadSamplingFlag != null)? true: false;
       return b;
    }
    public boolean isEnableMultiThreadSamplingOnDispatch(){
       int i = 1;
       if (this.multiThreadSamplingFlag & i) {
       }else {
          i = false;
       }
       return i;
    }
    public boolean isEnableMultiThreadSamplingOnIdle(){
       boolean b = (this.multiThreadSamplingFlag & 0x02)? true: false;
       return b;
    }
    public boolean isEnableRuntimeStatSampling(){
       int i = 1;
       if (this.runtimeStatFlag & i) {
       }else {
          i = false;
       }
       return i;
    }
    public boolean needUpdateCpuList(long p0){
       boolean b = (this.cpuSamplingFlag != null && p0 - (long)this.cpuInfoUpdateMin > 0)? true: false;
       return b;
    }
    public boolean needUpdateThreadList(long p0){
       AnrMonitorConfigAdv tsamplingThr = this.samplingThreadList;
       boolean b = (tsamplingThr != null && (tsamplingThr.length && p0 - (long)this.threadListUpdateMin > 0))? true: false;
       return b;
    }
    public boolean unwindInGetThread(){
       boolean b = (this.unwindStackFlag & 0x02)? true: false;
       return b;
    }
    public boolean unwindInNewThread(){
       int i = 1;
       if (this.unwindStackFlag & i) {
       }else {
          i = false;
       }
       return i;
    }
}
