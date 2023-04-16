package com.kwai.performance.stability.crash.monitor.message.AnrExtraDump;
import java.io.Serializable;
import com.kwai.performance.stability.crash.monitor.anr.config.AnrMonitorConfig;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.System;
import android.os.SystemClock;
import com.kwai.performance.stability.crash.monitor.util.CpuInfoUtils;
import android.system.OsConstants;
import android.system.Os;
import com.kwai.performance.stability.crash.monitor.anr.LogRecordQueue$PackedRecord;
import java.lang.String;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.kwai.performance.stability.crash.monitor.anr.LogRecordQueue$PackedRecordExtra;
import java.util.HashMap;
import android.os.Parcelable;
import java.lang.Class;
import java.util.Map;
import java.util.List;
import com.kwai.performance.stability.crash.monitor.message.AnrExtraDump$AnrExtraSummary;
import java.util.Set;
import java.util.Iterator;
import java.lang.CharSequence;
import com.kwai.performance.stability.crash.monitor.message.AnrExtraDump$SamplingPerf;
import com.kwai.performance.stability.crash.monitor.anr.config.AnrMonitorConfigAdv;
import java.util.ArrayList;
import com.kwai.apm.message.FastUnwindBackTraceElement;
import com.kwai.performance.stability.crash.monitor.util.AnrWithJvmtiHelper$JvmtiInfo;
import java.util.Locale;
import vg7.h;
import android.text.TextUtils;

public class AnrExtraDump implements Serializable	// class@0011f3
{
    public long anrAtTime;
    public LogRecordQueue$PackedRecord anrRecord;
    public long clickTick;
    public AnrMonitorConfig config;
    public long dumpCost;
    public Map extraInfo;
    public boolean isAnrRecordAppend;
    public AnrExtraDump$AnrKeyInfo keyInfo;
    public BackTraceStatistics mBackTraceStatistics;
    public long mainThreadId;
    public List packedRecords;
    public long pid;
    public StringBuilder rawLog;
    public AnrExtraDump$SamplingPerf samplingPerf;
    public AnrExtraDump$AnrExtraSummary summary;
    public String syncBarrierMessage;
    public long sysStartUp;
    public Map threadCpu;
    public int version;
    public Map windowInfo;

    public void AnrExtraDump(){
       super(null);
    }
    public void AnrExtraDump(AnrMonitorConfig p0){
       super();
       this.version = 15;
       this.rawLog = new StringBuilder(1024);
       this.isAnrRecordAppend = false;
       this.config = p0;
       this.sysStartUp = System.currentTimeMillis() - SystemClock.elapsedRealtime();
       long l = Os.sysconf(OsConstants._SC_CLK_TCK);
       if (l > 0) {
       }else {
          l = 100;
       }
       this.clickTick = l;
       return;
    }
    public final StringBuilder a(StringBuilder p0,LogRecordQueue$PackedRecord p1,String p2,SimpleDateFormat p3){
       LogRecordQueue$PackedRecord extra = p1.extra;
       p0 = p0+p2+"Time: "+p3.format(new Date(p1.now))+"\n"+p2+"Type: "+p1.packType+", Wall: "+p1.wall+", Cpu: "+p1.cpu+", IdleWall: "+p1.idleWall+", IdleCpu: "+p1.idleCpu+", 打包消息个数: "+p1.count+"\n"+p2+"MaxWall: "+p1.maxWall+", Message: "+p1.msg+"\n"+p2+"CheckTime 机制: "+extra.checkTimeLast+", Count: "+extra.checkTimeCount+", Max: "+extra.checkTimeMax+", Avg: "+extra.checkTimeAvg+"\n";
       if (p1.extra.nativePollMsg != null) {
          p0 = p0+p2+"NativePollOnce 下一条消息: "+p1.extra.nativePollMsg+"\n";
       }
       if (p1.hasStackTrace()) {
          p0 = p0+"堆栈采集耗时: Wall\("+p1.extra.costWall+"\), Cpu\("+p1.extra.costCpu+"\), Times\("+p1.extra.updateTimes+"\)\n"+p1.getStackTrace();
       }
       return p0+"\n";
    }
    public void addExtraInfo(String p0,Object p1){
       if (p0 != null && p1 != null) {
          if (this.extraInfo == null) {
             this.extraInfo = new HashMap();
          }
          if (p1 instanceof Serializable || p1 instanceof Parcelable) {
             this.extraInfo.put(p0, p1);
          }else {
             this.extraInfo.put(p0, p1.getClass().getName()+" not Serializable or Parcelable");
          }
       }
       return;
    }
    public boolean checkAnrRecordAppend(String p0){
       if (this.anrRecord != null && this.isAnrRecordAppend == null) {
          AnrExtraDump tpackedRecor = this.packedRecords;
          if (tpackedRecor != null && tpackedRecor.size()) {
             int i = 1;
             int i1 = this.packedRecords.size() - i;
             int i2 = 0;
             LogRecordQueue$PackedRecord packedRecord = this.packedRecords.get(i2);
             LogRecordQueue$PackedRecord packedRecord1 = this.packedRecords.get(i1);
             if (packedRecord.isAnr() || packedRecord1.isAnr()) {
                if (packedRecord1.isFullPack == null && this.anrRecord.isFullPack != null) {
                   this.packedRecords.remove(i1);
                   this.packedRecords.add(this.anrRecord);
                   this.rawLog+"\n"+"AppendAnrBy: first="+packedRecord.isAnr()+",last="+packedRecord1.isAnr()+",from="+p0;
                   this.isAnrRecordAppend = i;
                }
             }else {
                LogRecordQueue$PackedRecord now = packedRecord1.now;
                LogRecordQueue$PackedRecord now1 = this.anrRecord.now;
                if (now - now1 < 0 && (now + packedRecord1.wall) - now1 < 0) {
                   tpackedRecor = this.summary;
                   if (tpackedRecor != null) {
                      AnrExtraDump$AnrExtraSummary packedStatus = tpackedRecor.packedStatus;
                      if (packedStatus != null) {
                         Iterator iterator = packedStatus.keySet().iterator();
                         while (iterator.hasNext()) {
                            if ((iterator.next()).contains("AnrMsg")) {
                               i2 = 1;
                            }
                         }
                      }
                   }
                   if (!i2) {
                      this.packedRecords.add(this.anrRecord);
                      this.isAnrRecordAppend = i;
                      this.rawLog+"\n"+"AppendAnrBy: last="+packedRecord1.now+",anr="+this.anrRecord.now+",from="+p0;
                   }
                }
             }
          }
       }
    label_00db :
       return this.isAnrRecordAppend;
    }
    public void clearDataNotNeedToJson(AnrMonitorConfig p0){
       Iterator iterator;
       Iterator iterator1;
       long l2;
       LogRecordQueue$PackedRecordExtra costCpu;
       LogRecordQueue$PackedRecordExtra costWall;
       float f;
       AnrExtraDump packedRecord;
       AnrExtraDump packedRecord2;
       int i2;
       int i3;
       AnrExtraDump uAnrExtraDum = this;
       AnrMonitorConfig uAnrMonitorC = p0;
       StringBuilder str = null;
       uAnrExtraDum.rawLog = str;
       if (uAnrExtraDum.packedRecords != null) {
          AnrExtraDump$SamplingPerf samplingPerf = new AnrExtraDump$SamplingPerf();
          iterator = uAnrExtraDum.packedRecords.iterator();
          long l = 0;
          long l1 = 0;
          while (iterator.hasNext()) {
             LogRecordQueue$PackedRecord extra = iterator.next().extra;
             LogRecordQueue$PackedRecordExtra stacks = extra.stacks;
             if (stacks != null && stacks.length) {
                iterator1 = iterator;
                l2 = samplingPerf.stackCount + 1;
                samplingPerf.stackCount = l2;
                l2 = samplingPerf.samplingCount + extra.updateTimes;
                samplingPerf.samplingCount = l2;
                costCpu = extra.costCpu;
                l = l + costCpu;
                costWall = extra.costWall;
                l1 = l1 + costWall;
                int i = -1;
                if (!samplingPerf.minCpu - i) {
                   samplingPerf.minCpu = costCpu;
                }
                if (!samplingPerf.maxCpu - i) {
                   samplingPerf.maxCpu = costCpu;
                }
                if (!samplingPerf.minWall - i) {
                   samplingPerf.minWall = costWall;
                }
                if (!samplingPerf.maxWall - i) {
                   samplingPerf.maxWall = costWall;
                }
                if (samplingPerf.minCpu - costCpu > 0) {
                   samplingPerf.minCpu = costCpu;
                }
                if (samplingPerf.maxCpu - costCpu < 0) {
                   samplingPerf.maxCpu = costCpu;
                }
                if (samplingPerf.minWall - costWall > 0) {
                   samplingPerf.minWall = costWall;
                }
                if (samplingPerf.maxWall - costWall < 0) {
                   samplingPerf.maxWall = costWall;
                }
             }else {
                iterator1 = iterator;
             }
             costCpu = extra.stackTraceDiff;
             int i1 = (costCpu != null)? costCpu.size(): 0;
             if (i1) {
                l2 = samplingPerf.stackDiffCount + 1;
                samplingPerf.stackDiffCount = l2;
                long l3 = (long)i1;
                l2 = samplingPerf.stackDiffTotal + l3;
                samplingPerf.stackDiffTotal = l2;
                if (samplingPerf.stackDiffMax - l3 < 0) {
                   samplingPerf.stackDiffMax = l3;
                }
             }
             costWall = extra.checkTimeMax;
             if (samplingPerf.checkTimeMax - costWall < 0) {
                samplingPerf.checkTimeMax = costWall;
             }
             LogRecordQueue$PackedRecordExtra checkTimeAvg = extra.checkTimeAvg;
             if (samplingPerf.checkTimeAvg - checkTimeAvg < 0) {
                samplingPerf.checkTimeAvg = checkTimeAvg;
             }
             iterator = iterator1;
          }
          f = 0x3f800000;
          float f1 = 0;
          if (l - f1) {
             AnrExtraDump$SamplingPerf stackCount = samplingPerf.stackCount;
             if (stackCount - f1) {
                samplingPerf.avgCpu = ((float)l * f) / (float)stackCount;
             }
          }
          if (l1 - f1) {
             AnrExtraDump$SamplingPerf stackCount1 = samplingPerf.stackCount;
             if (stackCount1 - f1) {
                samplingPerf.avgWall = ((float)l1 * f) / (float)stackCount1;
             }
          }
          uAnrExtraDum.samplingPerf = samplingPerf;
       }
       if (uAnrMonitorC.mAdvConfig != null) {
          long l4 = SystemClock.elapsedRealtime();
          AnrMonitorConfig mAdvConfig = uAnrMonitorC.mAdvConfig;
          if (mAdvConfig.trimCpuInfo != null) {
             uAnrExtraDum.threadCpu = str;
          }
          if (mAdvConfig.trimRuntimeStat != null) {
             packedRecord = uAnrExtraDum.packedRecords;
             if (packedRecord != null) {
                iterator = packedRecord.iterator();
                while (iterator.hasNext()) {
                   iterator.next().extra.runtimeStat = str;
                }
             }
          }
          if (uAnrMonitorC.mAdvConfig.trimOtherStackDiff != null) {
             AnrExtraDump packedRecord1 = uAnrExtraDum.packedRecords;
             if (packedRecord1 != null) {
                Iterator iterator2 = packedRecord1.iterator();
                while (iterator2.hasNext()) {
                   LogRecordQueue$PackedRecord extra1 = iterator2.next().extra;
                   costWall = extra1.stackTraceDiff;
                   if (costWall != null && costWall.size()) {
                      ArrayList uArrayList = new ArrayList();
                      Iterator iterator3 = extra1.stackTraceDiff.iterator();
                      while (iterator3.hasNext()) {
                         FastUnwindBackTraceElement uFastUnwindB = iterator3.next();
                         if ((uFastUnwindB.threadInfo).contains("|main|")) {
                            uArrayList.add(uFastUnwindB);
                         }else {
                         }
                      }
                      extra1.stackTraceDiff = uArrayList;
                   }
                }
             }
          }
          uAnrExtraDum.summary.advTrimCost = SystemClock.elapsedRealtime() - l4;
          if (uAnrMonitorC.mAdvConfig.appendJvmtiData != null) {
             packedRecord2 = uAnrExtraDum.packedRecords;
             if (packedRecord2 != null) {
                Iterator iterator4 = packedRecord2.iterator();
                while (iterator4.hasNext()) {
                   LogRecordQueue$PackedRecordExtra jvmtiInfo = iterator4.next().extra.jvmtiInfo;
                   if (jvmtiInfo != null) {
                      AnrWithJvmtiHelper$JvmtiInfo gcInfo = jvmtiInfo.gcInfo;
                      f = -1;
                      if (gcInfo != null) {
                         packedRecord = uAnrExtraDum.summary;
                         if (packedRecord.jvmtiGc == f) {
                            packedRecord.jvmtiGc = 0;
                         }
                         i2 = packedRecord.jvmtiGc + gcInfo.length;
                         packedRecord.jvmtiGc = i2;
                         i3 = packedRecord.jvmtiGcReal + jvmtiInfo.gcInfoCount;
                         packedRecord.jvmtiGcReal = i3;
                      }
                      gcInfo = jvmtiInfo.classLoadInfo;
                      if (gcInfo != null) {
                         packedRecord = uAnrExtraDum.summary;
                         if (packedRecord.jvmtiClass == f) {
                            packedRecord.jvmtiClass = 0;
                         }else {
                            f = 0;
                         }
                         i2 = packedRecord.jvmtiClass + gcInfo.length;
                         packedRecord.jvmtiClass = i2;
                         i3 = packedRecord.jvmtiClassReal + jvmtiInfo.classLoadInfoCount;
                         packedRecord.jvmtiClassReal = i3;
                      }
                   }
                   f = 0;
                   continue ;
                }
             }
          }
       }
       packedRecord2 = uAnrExtraDum.packedRecords;
       if (packedRecord2 != null) {
          uAnrExtraDum.summary.keepSize = packedRecord2.size();
       }
    }
    public String toString(){
       SimpleDateFormat simpleDateFo = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.CHINA);
       StringBuilder str = new h().a();
       AnrExtraDump tkeyInfo = this.keyInfo;
       String str1 = "\n";
       if (tkeyInfo != null) {
          str = str+tkeyInfo+str1;
       }
       String str2 = "  ";
       if (this.anrRecord != null) {
          str = str+"ANR 发生所在消息耗时: Wall = "+this.anrRecord.wall+", Cpu = "+this.anrRecord.cpu+str1;
          this.a(str, this.anrRecord, str2, simpleDateFo);
       }
       if (this.syncBarrierMessage != null) {
          str = str+"ANR 可能是因为同步屏障导致: "+this.syncBarrierMessage+str1;
       }
       if (this.windowInfo != null) {
          str = str+"窗口相关信息，关注 Barrier 和 Window 属性\n";
          Iterator iterator = this.windowInfo.keySet().iterator();
          while (iterator.hasNext()) {
             String str3 = iterator.next();
             Object obj = this.windowInfo.get(str3);
             if (obj instanceof Map) {
                str = str+str2+str3+": "+str1;
                Iterator iterator1 = obj.keySet().iterator();
                while (iterator1.hasNext()) {
                   Object obj1 = iterator1.next();
                   str = str+"    "+obj1+": "+obj.get(obj1)+str1;
                }
             }else {
                str = str+str2+str3+": "+obj+str1;
             }
          }
          str = str+str1;
       }
       str = (this.packedRecords != null)? str+"PackedRecords: "+this.packedRecords.size()+str1: str+"PackedRecords: is null"+str1;
       tkeyInfo = this.summary;
       if (tkeyInfo != null) {
          StringBuilder str4 = tkeyInfo.toString(str, simpleDateFo)+str1;
          str2 = "\) <<<\n";
          if (this.summary.wallIdxEqCpu != null) {
             str = str+">>> Max Wall/Cpu Record \(Index = "+this.summary.maxWallIndex+str2;
             tkeyInfo = this.packedRecords;
             if (tkeyInfo != null) {
                this.a(str, tkeyInfo.get(this.summary.maxWallIndex), "", simpleDateFo);
             }
          }else {
             str = str+">>> Max Wall Record \(Index = "+this.summary.maxWallIndex+str2;
             tkeyInfo = this.packedRecords;
             if (tkeyInfo != null) {
                this.a(str, tkeyInfo.get(this.summary.maxWallIndex), "", simpleDateFo);
             }
             str = str+">>> Max Cpu Record \(Index = "+this.summary.maxCpuIndex+str2;
             tkeyInfo = this.packedRecords;
             if (tkeyInfo != null) {
                this.a(str, tkeyInfo.get(this.summary.maxCpuIndex), "", simpleDateFo);
             }
          }
       }
       if (!TextUtils.isEmpty(this.rawLog)) {
          str = str+"\n额外的日志: \n"+this.rawLog;
       }
       return str;
    }
}
