package com.kwai.performance.stability.crash.monitor.anr.config.AnrMonitorConfigAdvAdapter;
import com.kwai.performance.stability.crash.monitor.anr.config.BaseGsonAdapter;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import java.lang.Object;
import com.kwai.performance.stability.crash.monitor.anr.config.AnrMonitorConfigAdv;
import com.google.gson.JsonObject;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.String;
import java.util.Objects;
import java.lang.Boolean;
import java.lang.Integer;
import com.kwai.performance.stability.crash.monitor.anr.config.AnrMonitorConfigAdv$JvmtiControl;
import zk.h;
import java.lang.Number;
import com.google.gson.JsonArray;

public class AnrMonitorConfigAdvAdapter extends BaseGsonAdapter	// class@000e09
{

    public void AnrMonitorConfigAdvAdapter(){
       super();
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       AnrMonitorConfigAdv uAnrMonitorC = new AnrMonitorConfigAdv();
       Iterator iterator = p0.r().entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String key = uEntry.getKey();
          JsonElement value = uEntry.getValue();
          Objects.requireNonNull(key);
          int i = -1;
          switch (key.hashCode()){
              case 0x8d27a5c4:
                if (key.equals("runtimeSamplingInterval")) {
                   i = 0;
                }
                break;
              case 0xa42991bb:
                if (key.equals("cpuSamplingFlag")) {
                   i = 1;
                }
                break;
              case 0xa9cb6808:
                if (key.equals("observeThreadByLock")) {
                   i = 2;
                }
                break;
              case 0xaffeb036:
                if (key.equals("multiThreadSamplingFlag")) {
                   i = 3;
                }
                break;
              case 0xb5fdbda6:
                if (key.equals("appendJvmtiData")) {
                   i = 4;
                }
                break;
              case 0xbcd4550f:
                if (key.equals("samplingThreadList")) {
                   i = 5;
                }
                break;
              case 0xbd2cdf17:
                if (key.equals("threadListBlack")) {
                   i = 6;
                }
                break;
              case 0xcb7957e1:
                if (key.equals("threadListUpdateMin")) {
                   i = 7;
                }
                break;
              case 0xe75aaa49:
                if (key.equals("topCpuThreadNum")) {
                   i = 8;
                }
                break;
              case 0xe93adff4:
                if (key.equals("trimCpuInfo")) {
                   i = 9;
                }
                break;
              case 0xf6f848ca:
                if (key.equals("trimRuntimeStat")) {
                   i = 10;
                }
                break;
              case 0x750f0d9:
                if (key.equals("enableSamplingPauseResume")) {
                   i = 11;
                }
                break;
              case 0x8ff1656:
                if (key.equals("enableGetThreadLockInfo")) {
                   i = 12;
                }
                break;
              case 0x1152ae3f:
                if (key.equals("trimOtherStackDiff")) {
                   i = 13;
                }
                break;
              case 0x1d4f0bd8:
                if (key.equals("runtimeStatFlag")) {
                   i = 14;
                }
                break;
              case 0x280187c9:
                if (key.equals("runtimeCheckToken")) {
                   i = 15;
                }
                break;
              case 0x30aaaef5:
                if (key.equals("cpuInfoPairMaxSize")) {
                   i = 16;
                }
                break;
              case 0x3a8bb9a7:
                if (key.equals("jvmtiControl")) {
                   i = 17;
                }
                break;
              case 0x4cf4282b:
                if (key.equals("focusThreadCpuInterval")) {
                   i = 18;
                }
                break;
              case 0x51e32210:
                if (key.equals("enableGetNativeFrames")) {
                   i = 19;
                }
                break;
              case 0x59b112f3:
                if (key.equals("cpuInfoUpdateMin")) {
                   i = 20;
                }
                break;
              case 0x69e5a0d7:
                if (key.equals("unwindStackSafeMode")) {
                   i = 21;
                }
                break;
              case 0x6ab7dcf3:
                if (key.equals("unwindStackFlag")) {
                   i = 22;
                }
                break;
              case 0x79285149:
                if (key.equals("enableFastStack")) {
                   i = 23;
                }
                break;
              default:
          }
          switch (i){
              case 0:
                uAnrMonitorC.runtimeSamplingInterval = this.e(value, Integer.valueOf(uAnrMonitorC.runtimeSamplingInterval)).intValue();
                break;
              case 1:
                uAnrMonitorC.cpuSamplingFlag = this.e(value, Integer.valueOf(uAnrMonitorC.cpuSamplingFlag)).intValue();
                break;
              case 2:
                uAnrMonitorC.observeThreadByLock = this.e(value, Boolean.valueOf(uAnrMonitorC.observeThreadByLock)).booleanValue();
                break;
              case 3:
                uAnrMonitorC.multiThreadSamplingFlag = this.e(value, Integer.valueOf(uAnrMonitorC.multiThreadSamplingFlag)).intValue();
                break;
              case 4:
                uAnrMonitorC.appendJvmtiData = this.e(value, Boolean.valueOf(uAnrMonitorC.appendJvmtiData)).booleanValue();
                break;
              case 5:
                uAnrMonitorC.samplingThreadList = this.g(value, uAnrMonitorC.samplingThreadList);
                break;
              case 6:
                uAnrMonitorC.threadListBlack = this.g(value, uAnrMonitorC.threadListBlack);
                break;
              case 7:
                uAnrMonitorC.threadListUpdateMin = this.e(value, Integer.valueOf(uAnrMonitorC.threadListUpdateMin)).intValue();
                break;
              case 8:
                uAnrMonitorC.topCpuThreadNum = this.e(value, Integer.valueOf(uAnrMonitorC.topCpuThreadNum)).intValue();
                break;
              case 9:
                uAnrMonitorC.trimCpuInfo = this.e(value, Boolean.valueOf(uAnrMonitorC.trimCpuInfo)).booleanValue();
                break;
              case 10:
                uAnrMonitorC.trimRuntimeStat = this.e(value, Boolean.valueOf(uAnrMonitorC.trimRuntimeStat)).booleanValue();
                break;
              case 11:
                uAnrMonitorC.enableSamplingPauseResume = this.e(value, Boolean.valueOf(uAnrMonitorC.enableSamplingPauseResume)).booleanValue();
                break;
              case 12:
                uAnrMonitorC.enableGetThreadLockInfo = this.e(value, Boolean.valueOf(uAnrMonitorC.enableGetThreadLockInfo)).booleanValue();
                break;
              case 13:
                uAnrMonitorC.trimOtherStackDiff = this.e(value, Boolean.valueOf(uAnrMonitorC.trimOtherStackDiff)).booleanValue();
                break;
              case 14:
                uAnrMonitorC.runtimeStatFlag = this.e(value, Integer.valueOf(uAnrMonitorC.runtimeStatFlag)).intValue();
                break;
              case 15:
                uAnrMonitorC.runtimeCheckToken = this.e(value, Boolean.valueOf(uAnrMonitorC.runtimeCheckToken)).booleanValue();
                break;
              case 16:
                uAnrMonitorC.cpuInfoPairMaxSize = this.e(value, Integer.valueOf(uAnrMonitorC.cpuInfoPairMaxSize)).intValue();
                break;
              case 17:
                if (value != null) {
                   uAnrMonitorC.jvmtiControl = p2.c(value, AnrMonitorConfigAdv$JvmtiControl.class);
                }
                break;
              case 18:
                uAnrMonitorC.focusThreadCpuInterval = this.e(value, Integer.valueOf(uAnrMonitorC.focusThreadCpuInterval)).intValue();
                break;
              case 19:
                uAnrMonitorC.enableGetNativeFrames = this.e(value, Boolean.valueOf(uAnrMonitorC.enableGetNativeFrames)).booleanValue();
                break;
              case 20:
                uAnrMonitorC.cpuInfoUpdateMin = this.e(value, Integer.valueOf(uAnrMonitorC.cpuInfoUpdateMin)).intValue();
                break;
              case 21:
                uAnrMonitorC.unwindStackSafeMode = this.e(value, Boolean.valueOf(uAnrMonitorC.unwindStackSafeMode)).booleanValue();
                break;
              case 22:
                uAnrMonitorC.unwindStackFlag = this.e(value, Integer.valueOf(uAnrMonitorC.unwindStackFlag)).intValue();
                break;
              case 23:
                uAnrMonitorC.enableFastStack = this.e(value, Boolean.valueOf(uAnrMonitorC.enableFastStack)).booleanValue();
                break;
              default:
          }
       }
       return uAnrMonitorC;
    }
    public JsonElement serialize(Object p0,Type p1,h p2){
       JsonObject jsonObject = new JsonObject();
       jsonObject.H("enableSamplingPauseResume", Boolean.valueOf(p0.enableSamplingPauseResume));
       jsonObject.a0("multiThreadSamplingFlag", Integer.valueOf(p0.multiThreadSamplingFlag));
       jsonObject.G("samplingThreadList", this.c(p0.samplingThreadList));
       jsonObject.G("threadListBlack", this.c(p0.threadListBlack));
       jsonObject.a0("threadListUpdateMin", Integer.valueOf(p0.threadListUpdateMin));
       jsonObject.a0("cpuSamplingFlag", Integer.valueOf(p0.cpuSamplingFlag));
       jsonObject.a0("cpuInfoUpdateMin", Integer.valueOf(p0.cpuInfoUpdateMin));
       jsonObject.a0("topCpuThreadNum", Integer.valueOf(p0.topCpuThreadNum));
       jsonObject.a0("focusThreadCpuInterval", Integer.valueOf(p0.focusThreadCpuInterval));
       jsonObject.a0("cpuInfoPairMaxSize", Integer.valueOf(p0.cpuInfoPairMaxSize));
       jsonObject.H("enableFastStack", Boolean.valueOf(p0.enableFastStack));
       jsonObject.H("enableGetThreadLockInfo", Boolean.valueOf(p0.enableGetThreadLockInfo));
       jsonObject.H("enableGetNativeFrames", Boolean.valueOf(p0.enableGetNativeFrames));
       jsonObject.H("unwindStackSafeMode", Boolean.valueOf(p0.unwindStackSafeMode));
       jsonObject.a0("unwindStackFlag", Integer.valueOf(p0.unwindStackFlag));
       jsonObject.a0("runtimeStatFlag", Integer.valueOf(p0.runtimeStatFlag));
       jsonObject.a0("runtimeSamplingInterval", Integer.valueOf(p0.runtimeSamplingInterval));
       jsonObject.H("runtimeCheckToken", Boolean.valueOf(p0.runtimeCheckToken));
       jsonObject.H("observeThreadByLock", Boolean.valueOf(p0.observeThreadByLock));
       jsonObject.H("trimCpuInfo", Boolean.valueOf(p0.trimCpuInfo));
       jsonObject.H("trimRuntimeStat", Boolean.valueOf(p0.trimRuntimeStat));
       jsonObject.H("trimOtherStackDiff", Boolean.valueOf(p0.trimOtherStackDiff));
       jsonObject.H("appendJvmtiData", Boolean.valueOf(p0.appendJvmtiData));
       jsonObject.G("jvmtiControl", p2.a(p0.jvmtiControl));
       return jsonObject;
    }
}
