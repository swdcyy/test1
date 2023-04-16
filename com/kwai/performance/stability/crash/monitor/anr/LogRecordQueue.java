package com.kwai.performance.stability.crash.monitor.anr.LogRecordQueue;
import com.kwai.performance.stability.crash.monitor.anr.config.AnrMonitorConfig;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import com.kwai.performance.stability.crash.monitor.anr.LogRecordQueue$PackedRecordExtra;
import java.lang.String;
import java.util.List;
import com.kwai.performance.stability.crash.monitor.anr.LogRecordQueue$PackedRecord;
import java.lang.System;
import pg7.e;
import com.kwai.performance.stability.crash.monitor.anr.b;
import pg7.d;
import com.kwai.performance.stability.crash.monitor.util.AnrWithJvmtiHelper$JvmtiInfo;
import com.kwai.performance.stability.crash.monitor.util.AnrWithJvmtiHelper;
import java.util.Map;
import java.util.Collection;
import com.kwai.performance.stability.crash.monitor.anr.d$c;
import com.kwai.performance.stability.crash.monitor.anr.extra.RuntimeStat;

public class LogRecordQueue	// class@000df6
{
    public List a;
    public Map b;
    public boolean c;
    public boolean d;
    public int e;
    public final long f;
    public final AnrMonitorConfig g;
    public LogRecordQueue$PackedRecord h;
    public LogRecordQueue$PackedRecordExtra i;
    public e j;

    public void LogRecordQueue(AnrMonitorConfig p0){
       super();
       this.c = false;
       this.d = false;
       this.e = 0;
       this.g = p0;
       this.f = (long)p0.queuePackWall;
       this.a = new ArrayList(p0.maxQueueSize);
       this.b = new HashMap();
       this.i = new LogRecordQueue$PackedRecordExtra();
    }
    public void a(long p0,long p1,String p2,boolean p3,boolean p4){
       LogRecordQueue logRecordQue = this;
       if (logRecordQue.a.size() < 200) {
          logRecordQue.a.add(new LogRecordQueue$PackedRecord());
       }
       long l = System.currentTimeMillis();
       LogRecordQueue$PackedRecordExtra packedRecord = logRecordQue.a.get(logRecordQue.e);
       int i = packedRecord.logTypeFlag(p2, p0, logRecordQue.f, p3, p4, logRecordQue.g);
       int i1 = 0xffff0000 & i;
       i = i & 0xffff;
       int i2 = 0;
       int i3 = 1;
       boolean b = (!(0x40000000 & i1) && (p3 || p4))? true: false;
       LogRecordQueue logRecordQue1 = (i1 & Integer.MIN_VALUE)? 1: null;
       LogRecordQueue i4 = logRecordQue.i;
       if (logRecordQue1) {
          i1 = logRecordQue.e + i3;
          logRecordQue.e = i1;
          if (i1 >= 200) {
             logRecordQue.e = i2;
             logRecordQue.d = i3;
          }
          logRecordQue1 = logRecordQue.j;
          if (logRecordQue1 != null) {
             logRecordQue1.a(packedRecord);
          }
          LogRecordQueue$PackedRecord packedRecord1 = logRecordQue.a.get(logRecordQue.e);
          if (logRecordQue.d != null) {
             packedRecord1.clear();
          }
          logRecordQue.i = new LogRecordQueue$PackedRecordExtra();
          if (packedRecord.count - 1) {
             packedRecord.extra = new LogRecordQueue$PackedRecordExtra();
          }
          if (logRecordQue.g.withLogPage != null) {
             String page = (b.c().y != null)? b.c().y.getPage(): null;
             logRecordQue.i.startPage = page;
             packedRecord.extra.endPage = page;
          }
          packedRecord.extra.jvmtiInfo = AnrWithJvmtiHelper.b();
          packedRecord = packedRecord1;
       }
       if (p3) {
          i = i | 0x01;
       }
       if (p4) {
          i = i | 0x02;
       }
       if (logRecordQue.b.size()) {
          i = i | 0x04;
       }
       packedRecord.setNow(l);
       packedRecord.addRecord(p0, p1, p2, b, i);
       packedRecord.extra = i4;
       packedRecord.updateIdleRecords(logRecordQue.b, logRecordQue.g);
       if (p3) {
          logRecordQue.h = packedRecord.copy();
       }
       return;
    }
    public int b(){
       return this.e;
    }
    public void c(boolean p0){
       this.c = p0;
    }
    public List d(){
       ArrayList uArrayList = new ArrayList();
       if (this.d != null) {
          LogRecordQueue ta = this.a;
          uArrayList.addAll(ta.subList((this.e + 1), ta.size()));
       }
       uArrayList.addAll(this.a.subList(0, (this.e + 1)));
       return uArrayList;
    }
    public void e(d$c p0){
       if (this.c != null) {
          return;
       }
       this.i.update(p0, this.g);
       return;
    }
    public void f(RuntimeStat p0){
       this.i.update(p0);
    }
    public void g(String p0){
       this.i.update(p0, this.g);
    }
}
