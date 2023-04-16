package com.kwai.performance.stability.crash.monitor.anr.LogRecordQueue$PackedRecordExtra;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;
import java.util.UUID;
import java.lang.String;
import java.util.HashMap;
import java.util.List;
import com.kwai.performance.stability.crash.monitor.anr.config.AnrMonitorConfig;
import java.lang.Math;
import com.kwai.apm.message.FastUnwindBackTraceElement;
import android.os.Message;
import java.lang.System;
import java.lang.Long;
import java.util.Map;
import com.kwai.performance.stability.crash.monitor.anr.d$c;
import com.kwai.performance.stability.crash.monitor.anr.d;
import com.kwai.performance.stability.crash.monitor.anr.d$a;
import java.util.Set;
import java.util.Iterator;
import com.kwai.performance.stability.crash.monitor.anr.LogRecordQueue$StackHolder;
import java.util.Collection;
import android.os.SystemClock;
import com.kwai.performance.stability.crash.monitor.util.BacktraceUtil;
import com.kwai.performance.stability.crash.monitor.message.BackTraceStatistics;
import java.lang.StringBuilder;
import java.util.Arrays;
import java.util.HashSet;
import com.kwai.performance.stability.crash.monitor.anr.extra.ThreadHolder;
import com.kwai.performance.stability.crash.monitor.anr.extra.RuntimeStat;
import java.lang.Thread;
import com.kwai.performance.stability.crash.monitor.anr.LogRecordQueue$PackedRecordExtra$a;
import com.kwai.apm.message.FastUnwindBacktrace;
import com.kwai.performance.stability.crash.monitor.anr.d$b;
import com.kwai.performance.stability.crash.monitor.anr.d$d;
import java.util.LinkedList;

public class LogRecordQueue$PackedRecordExtra implements Serializable	// class@000df4
{
    public float checkTimeAvg;
    public int checkTimeCount;
    public long checkTimeLast;
    public long checkTimeMax;
    public long checkTimeTotal;
    public long costCpu;
    public long costWall;
    public String endPage;
    public String extraLog;
    public AnrWithJvmtiHelper$JvmtiInfo jvmtiInfo;
    public Object[] lastStacks;
    public String nativePollMsg;
    public boolean processed;
    public RuntimeStat runtimeStat;
    public List samplingTime;
    public List stackDiff;
    public List stackTraceDiff;
    public long stackUpdateAt;
    public Object[] stacks;
    public String startPage;
    public Map threadStackDiff;
    public List threadStateInfo;
    public d$c traceProvider;
    public long updateTimes;
    public String uuid;

    public void LogRecordQueue$PackedRecordExtra(){
       super();
       this.costWall = -1;
       this.costCpu = -1;
       this.stackUpdateAt = -1;
       this.updateTimes = 0;
       this.samplingTime = new ArrayList();
       this.checkTimeLast = -1;
       this.checkTimeMax = -1;
       this.checkTimeAvg = 0xbf800000;
       this.checkTimeCount = 0;
       this.checkTimeTotal = 0;
       this.stackDiff = new ArrayList();
       this.threadStateInfo = new ArrayList();
       this.uuid = UUID.randomUUID().toString();
       this.stackTraceDiff = new ArrayList();
       this.threadStackDiff = new HashMap();
    }
    public final void a(Object[] p0,Object[] p1,long p2,long p3,List p4,String p5,String p6,AnrMonitorConfig p7){
       int i5;
       FastUnwindBackTraceElement uFastUnwindB1;
       int i = p0;
       int i1 = p1;
       long l = p3;
       List list = p4;
       String str = p5;
       String str1 = p6;
       int i2 = Math.min(i.length, i1.length);
       int i3 = 0;
       int i4 = -1;
       while (i3 < i2) {
          i5 = i.length + i4;
          i5 = i5 - i3;
          int i6 = i1.length + i4;
          i6 = i6 - i3;
          if (!i[i5].equals(i1[i6])) {
             i2 = i3;
             break ;
          }else {
             i3 = i3 + 1;
          }
       }
       i3 = (i.length - 1) - i2;
       i5 = (i1.length - 1) - i2;
       if (!p4.size()) {
          for (i2 = i.length - 1; i2 >= 0; i2 = i2 - 1) {
             FastUnwindBackTraceElement uFastUnwindB = FastUnwindBackTraceElement.obtainFastUnwindBackTraceElement(i[i2]);
             uFastUnwindB.threadInfo = str;
             uFastUnwindB.costInfo = str1;
             uFastUnwindB.updateTime = p2;
             uFastUnwindB.tag = "|B|";
             list.add(uFastUnwindB);
          }
       }
       AnrMonitorConfig stackDiffLis = p7.stackDiffListMaxSize;
       if (p4.size() <= stackDiffLis || stackDiffLis < null) {
          if (i3 == i4 || i5 == i4) {
             if (i5 != i4) {
                for (; i5 >= 0; i5 = i5 - 1) {
                   uFastUnwindB1 = FastUnwindBackTraceElement.obtainFastUnwindBackTraceElement(i1[i5]);
                   uFastUnwindB1.threadInfo = str;
                   uFastUnwindB1.costInfo = str1;
                   uFastUnwindB1.updateTime = l;
                   uFastUnwindB1.tag = "|B|";
                   list.add(uFastUnwindB1);
                }
             }else if(i3 != i4){
                for (; i3 >= 0; i3 = i3 - 1) {
                   FastUnwindBackTraceElement uFastUnwindB2 = FastUnwindBackTraceElement.obtainFastUnwindBackTraceElement(i[i3]);
                   uFastUnwindB2.threadInfo = str;
                   uFastUnwindB2.costInfo = str1;
                   uFastUnwindB2.updateTime = l;
                   uFastUnwindB2.tag = "|E|";
                   list.add(uFastUnwindB2);
                }
             }
          }else {
             for (; i3 >= 0; i3 = i3 - 1) {
                FastUnwindBackTraceElement uFastUnwindB3 = FastUnwindBackTraceElement.obtainFastUnwindBackTraceElement(i[i3]);
                uFastUnwindB3.threadInfo = str;
                uFastUnwindB3.costInfo = str1;
                uFastUnwindB3.updateTime = l;
                uFastUnwindB3.tag = "|E|";
                list.add(uFastUnwindB3);
             }
             for (; i5 >= 0; i5 = i5 - 1) {
                uFastUnwindB1 = FastUnwindBackTraceElement.obtainFastUnwindBackTraceElement(i1[i5]);
                uFastUnwindB1.threadInfo = str;
                uFastUnwindB1.costInfo = str1;
                uFastUnwindB1.updateTime = l;
                uFastUnwindB1.tag = "|B|";
                list.add(uFastUnwindB1);
             }
          }
       }
       return;
    }
    public final void b(long p0,long p1,Message p2){
       this.updateTimes = this.updateTimes + 1;
       this.samplingTime.add(Long.valueOf(System.currentTimeMillis()));
       LogRecordQueue$PackedRecordExtra tcostWall = this.costWall;
       if (!tcostWall - -1) {
          this.costWall = p0;
       }else if(p0 - tcostWall > 0){
          this.costWall = p0;
       }
       this.costCpu = (!this.costCpu - -1)? p1: this.costWall + p1;
       try{
          if (p2 != null) {
             this.nativePollMsg = p2.toString();
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public void clear(){
       long l = -1;
       this.costWall = l;
       this.costCpu = l;
       this.updateTimes = 0;
       this.stackUpdateAt = l;
       this.nativePollMsg = null;
       this.stacks = null;
       this.checkTimeLast = l;
       this.checkTimeMax = l;
       this.checkTimeAvg = 0xbf800000;
       this.checkTimeTotal = 0;
       this.checkTimeCount = 0;
       LogRecordQueue$PackedRecordExtra tsamplingTim = this.samplingTime;
       if (tsamplingTim != null) {
          tsamplingTim.clear();
       }
       tsamplingTim = this.stackTraceDiff;
       if (tsamplingTim != null) {
          tsamplingTim.clear();
       }
       tsamplingTim = this.threadStackDiff;
       if (tsamplingTim != null) {
          tsamplingTim.clear();
       }
       this.extraLog = null;
       this.runtimeStat = null;
       tsamplingTim = this.traceProvider;
       if (tsamplingTim != null) {
          d$c a = tsamplingTim.a;
          if (a - l) {
             d$a b = d.b;
             if (b != null && a - b.c > 0) {
                b.c = a;
             }
          }
       }
       this.traceProvider = null;
       return;
    }
    public LogRecordQueue$PackedRecordExtra copy(){
       LogRecordQueue$PackedRecordExtra packedRecord = new LogRecordQueue$PackedRecordExtra();
       packedRecord.update(this);
       return packedRecord;
    }
    public void processOnDump(boolean p0){
       if (this.processed != null) {
          return;
       }
       this.processed = true;
       LogRecordQueue$PackedRecordExtra tthreadStack = this.threadStackDiff;
       if (tthreadStack != null && tthreadStack.size()) {
          Iterator iterator = this.threadStackDiff.keySet().iterator();
          while (iterator.hasNext()) {
             LogRecordQueue$StackHolder stackHolder = this.threadStackDiff.get(iterator.next());
             if (stackHolder != null) {
                this.stackTraceDiff.addAll(stackHolder.stackDiff);
             }
          }
          this.threadStackDiff.clear();
       }
       long l = SystemClock.elapsedRealtimeNanos();
       int i = 0;
       if (p0) {
          BacktraceUtil.f(this.stackTraceDiff);
          LogRecordQueue$PackedRecordExtra tstacks = this.stacks;
          if (tstacks != null && tstacks.length > 0) {
             ArrayList uArrayList = new ArrayList();
             LogRecordQueue$PackedRecordExtra tstacks1 = this.stacks;
             int len = tstacks1.length;
             for (int i1 = 0; i1 < len; i1 = i1 + 1) {
                uArrayList.add(FastUnwindBackTraceElement.obtainFastUnwindBackTraceElement(tstacks1[i1]));
             }
             this.stacks = BacktraceUtil.f(uArrayList).toArray();
          }
       }
       Iterator iterator1 = this.stackTraceDiff.iterator();
       while (iterator1.hasNext()) {
          FastUnwindBackTraceElement uFastUnwindB = iterator1.next();
          if (uFastUnwindB.hasUnwind != null) {
             this.stackDiff.add(uFastUnwindB.toTraceString());
          }else {
             i = i + 1;
          }
       }
       BackTraceStatistics.getQualityStatistics().setUnwindInfo(this.uuid, (SystemClock.elapsedRealtimeNanos() - l)+","+i+","+this.stackTraceDiff.size());
       BackTraceStatistics.getQualityStatistics().updateDiscardFrame(i);
       this.stackTraceDiff.clear();
       return;
    }
    public void processOnParse(){
       LogRecordQueue$PackedRecordExtra tcheckTimeTo = this.checkTimeTotal;
       if (tcheckTimeTo - null) {
          LogRecordQueue$PackedRecordExtra tcheckTimeCo = this.checkTimeCount;
          if (tcheckTimeCo != null) {
             this.checkTimeAvg = ((float)tcheckTimeTo * 0x3f800000) / (float)tcheckTimeCo;
          }
       }
       return;
    }
    public void update(long p0){
       this.checkTimeLast = p0;
       if (this.checkTimeMax - p0 < 0) {
          this.checkTimeMax = p0;
       }
       this.checkTimeTotal = this.checkTimeTotal + p0;
       this.checkTimeCount = this.checkTimeCount + 1;
       return;
    }
    public void update(LogRecordQueue$PackedRecordExtra p0){
       this.costWall = p0.costWall;
       this.costCpu = p0.costCpu;
       this.updateTimes = p0.updateTimes;
       this.stackUpdateAt = p0.stackUpdateAt;
       this.nativePollMsg = p0.nativePollMsg;
       LogRecordQueue$PackedRecordExtra stacks = p0.stacks;
       if (stacks != null) {
          this.stacks = Arrays.copyOf(stacks, stacks.length);
       }
       this.checkTimeLast = p0.checkTimeLast;
       this.checkTimeMax = p0.checkTimeMax;
       this.checkTimeAvg = p0.checkTimeAvg;
       this.checkTimeTotal = p0.checkTimeTotal;
       this.checkTimeCount = p0.checkTimeCount;
       stacks = p0.samplingTime;
       if (stacks != null && stacks.size()) {
          this.samplingTime = new ArrayList(p0.samplingTime);
       }
       stacks = p0.stackTraceDiff;
       if (stacks != null && stacks.size()) {
          this.stackTraceDiff = new ArrayList(p0.stackTraceDiff);
       }
       stacks = p0.threadStackDiff;
       if (stacks != null && stacks.size()) {
          try{
             Iterator iterator = new HashSet(p0.threadStackDiff.keySet()).iterator();
             while (iterator.hasNext()) {
                String str = iterator.next();
                LogRecordQueue$StackHolder stackHolder = p0.threadStackDiff.get(str);
                if (stackHolder == null) {
                   continue ;
                }
                this.threadStackDiff.put(str, stackHolder.copy());
             }
          }catch(java.util.ConcurrentModificationException e0){
          }
       }
       this.extraLog = p0.extraLog;
       this.runtimeStat = p0.runtimeStat;
       this.uuid = p0.uuid;
       return;
    }
    public void update(d$c p0,AnrMonitorConfig p1){
       String str = (p1.withExtraCost != null)? p0.l+"|"+p0.m: null;
       String str1 = str;
       if (p0.g != null) {
          this.updateNew(p0.j, p0.k, str1, p0.h, p0.f, null, p1);
       }else {
          this.updateNew(p0.j, p0.k, str1, null, p0.f, p0, p1);
       }
       return;
    }
    public void update(RuntimeStat p0){
       LogRecordQueue$PackedRecordExtra truntimeStat = this.runtimeStat;
       if (truntimeStat == null) {
          this.runtimeStat = p0.copy();
       }else {
          truntimeStat.update(p0);
       }
       return;
    }
    public void update(String p0,AnrMonitorConfig p1){
       LogRecordQueue$PackedRecordExtra textraLog = this.extraLog;
       if (textraLog == null) {
          this.extraLog = p0;
       }else if(textraLog.length() > p1.inputEventLogMaxLength){
          return;
       }else {
          this.extraLog = this.extraLog+"\n"+p0;
       }
       return;
    }
    public void updateMainStackDiff(String p0,String p1,Object[] p2,AnrMonitorConfig p3){
       LogRecordQueue$PackedRecordExtra tstackUpdate = this.stackUpdateAt;
       long l = System.currentTimeMillis();
       this.stackUpdateAt = l;
       LogRecordQueue$PackedRecordExtra tstacks = this.stacks;
       if (tstacks == null) {
          this.stacks = p2;
          this.lastStacks = p2;
       }else if(p2 != null){
          if (tstacks.length < p2.length) {
             this.stacks = p2;
          }
          LogRecordQueue$PackedRecordExtra tlastStacks = this.lastStacks;
          if (tlastStacks != null) {
             this.a(tlastStacks, p2, tstackUpdate, l, this.stackTraceDiff, p0, p1, p3);
          }
          this.lastStacks = p2;
       }
       return;
    }
    public void updateNew(long p0,long p1,String p2,Message p3,ThreadHolder p4,d$c p5,AnrMonitorConfig p6){
       LogRecordQueue$PackedRecordExtra packedRecord = this;
       String str = p2;
       d$c uoc = p5;
       ThreadHolder thread = p4.thread;
       boolean b = p4.isMainThread();
       String str1 = "|"+thread.getId()+"|"+thread.getName();
       StringBuilder str2 = "|"+p0+"|"+p1;
       if (str) {
          StringBuilder str3 = "|"+str;
          str = (b)? "|"+packedRecord.updateTimes: "";
          str = str3+str;
       }else {
          str = "";
       }
       str = str2+str;
       if (b) {
          this.b(p0, p1, p3);
       }
       if (uoc) {
          d$a LogRecordQueue$PackedRecordExtra$a packedRecord1 = new LogRecordQueue$PackedRecordExtra$a(this, p4, b, str1, str, p6);
          uoc.e = v12;
          d$c d = uoc.d;
          if (d != null && d.b != null) {
             packedRecord1 = d.b;
             super(uoc.a, v12.c(d), uoc.e);
             d$a b1 = packedRecord1.b;
             _monitor_enter(b1);
             packedRecord1.b.offer(this);
             _monitor_exit(b1);
             try{
                _monitor_enter(packedRecord1);
                packedRecord1.notifyAll();
                _monitor_exit(packedRecord1);
                this.c.b(this.a);
             }catch(java.lang.IllegalMonitorStateException e0){
             }
          }
       }
       return;
    }
    public void updateNoMainThread(String p0,String p1,Object[] p2,AnrMonitorConfig p3){
       LogRecordQueue$PackedRecordExtra packedRecord = this;
       if (!packedRecord.threadStackDiff.containsKey(p0)) {
          packedRecord.threadStackDiff.put(p0, new LogRecordQueue$StackHolder());
       }
       int i = packedRecord.threadStackDiff.get(p0);
       if (i == null) {
          return;
       }else {
          i.updateTimes = i.updateTimes + 1;
          LogRecordQueue$StackHolder lastUpdate = i.lastUpdate;
          i.lastUpdate = System.currentTimeMillis();
          if (i.lastStacks != null) {
             String str = (p3.withExtraCost != null)? p1+"|"+i.updateTimes: p1;
             this.a(i.lastStacks, p2, lastUpdate, i.lastUpdate, i.stackDiff, p0, str, p3);
          }
          i.lastStacks = p2;
          return;
       }
    }
    public void updateOld(long p0,long p1,Message p2,ThreadHolder p3,Object[] p4,AnrMonitorConfig p5){
       ThreadHolder thread = p3.thread;
       String str = "|"+thread.getId()+"|"+thread.getName();
       String str1 = "|"+p0+"|"+p1;
       if (!p3.isMainThread()) {
          this.updateNoMainThread(str, str1, p4, p5);
          return;
       }else {
          this.b(p0, p1, p2);
          this.updateMainStackDiff(str, str1, p4, p5);
          return;
       }
    }
}
