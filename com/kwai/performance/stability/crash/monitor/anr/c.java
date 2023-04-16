package com.kwai.performance.stability.crash.monitor.anr.c;
import yf7.w;
import com.kwai.performance.stability.crash.monitor.anr.LogRecordQueue;
import com.kwai.performance.stability.crash.monitor.anr.config.AnrMonitorConfig;
import java.lang.Object;
import java.lang.String;
import com.kwai.performance.stability.crash.monitor.anr.LogRecordQueue$PackedRecord;
import java.lang.StringBuilder;
import com.kwai.performance.stability.crash.monitor.anr.c$a;
import android.os.SystemClock;
import android.os.Looper;
import vg7.a;
import java.lang.System;
import com.kwai.performance.stability.crash.monitor.anr.LogRecordQueue$PackedRecordExtra;
import com.kwai.performance.stability.crash.monitor.util.AnrWithJvmtiHelper$JvmtiInfo;
import com.kwai.performance.stability.crash.monitor.util.AnrWithJvmtiHelper;
import com.kwai.performance.stability.crash.monitor.anr.d$c;
import com.kwai.performance.stability.crash.monitor.anr.extra.RuntimeStat;

public class c implements w	// class@000e01
{
    public boolean a;
    public boolean b;
    public long c;
    public long d;
    public long e;
    public long f;
    public String g;
    public final LogRecordQueue h;
    public final AnrMonitorConfig i;
    public c$a j;

    public void c(LogRecordQueue p0,AnrMonitorConfig p1){
       super();
       this.a = false;
       this.b = false;
       this.c = -1;
       this.d = -1;
       this.e = -1;
       this.f = -1;
       this.h = p0;
       this.i = p1;
    }
    public void a(long p0,long p1,long p2,String p3){
       c uoc = this;
       long l = p1;
       long l1 = p2;
       String str = p3;
       int i = 1;
       uoc.b = uoc.b ^ i;
       if (str.charAt(0) == '>') {
          uoc.b = i;
       }else if(str.charAt(0) == '<'){
          uoc.b = false;
       }
       if (uoc.b != null) {
          uoc.d = l;
          uoc.c = l1;
          c f = uoc.f;
          c e = uoc.e;
          uoc.g = str;
          long l2 = l - f;
          if (l2 - (long)uoc.i.idleTimeThreshold > 0 && f - -1) {
             uoc.h.a(l2, (l1 - e), "IDLE", uoc.a, true);
          }
       }else {
          uoc.f = l;
          uoc.e = l1;
          uoc.h.a((l - uoc.d), (l1 - uoc.c), uoc.g, uoc.a, false);
       }
       if (uoc.a != null && uoc.j != null) {
          LogRecordQueue h = uoc.h.h;
          if (h == null) {
             h = this.d();
             h.processOnParse();
             h.msg = h.msg+" \(getLastAnrRecord return null to backup\)";
          }
          uoc.j.a(h);
       }
       uoc.a = false;
       return;
    }
    public long b(){
       c td = (this.b != null)? this.d: -1;
       return td;
    }
    public long c(){
       long l = (this.b != null)? -1: this.f;
       return l;
    }
    public final LogRecordQueue$PackedRecord d(){
       LogRecordQueue$PackedRecord packedRecord = new LogRecordQueue$PackedRecord();
       c td = this.d;
       c tf = this.f;
       c tc = this.c;
       c te = this.e;
       c tb = this.b;
       if (tb != null) {
          tf = SystemClock.elapsedRealtime();
          te = SystemClock.currentThreadTimeMillis();
          if (Looper.myLooper() != Looper.getMainLooper()) {
             te = a.b();
          }
       }else {
          td = SystemClock.elapsedRealtime();
          tc = SystemClock.currentThreadTimeMillis();
          if (Looper.myLooper() != Looper.getMainLooper()) {
             tc = a.b();
          }
       }
       packedRecord.setNow(System.currentTimeMillis());
       packedRecord.extra.update(this.h.i);
       if (tb != null) {
          packedRecord.addRecord((tf - td), (te - tc), this.g, true, 1);
       }else {
          tb = 3;
          if (packedRecord.getIdleRecordCount()) {
             tb = 7;
          }
          packedRecord.addRecord((td - tf), (tc - te), "IDLE", true, tb);
       }
       packedRecord.isFullPack = false;
       packedRecord.extra.jvmtiInfo = AnrWithJvmtiHelper.b();
       return packedRecord;
    }
    public void e(c$a p0){
       this.j = p0;
    }
    public void f(d$c p0){
       if (!this.d - p0.i) {
          this.h.e(p0);
       }
       return;
    }
    public void g(d$c p0){
       if (!this.f - p0.i) {
          this.h.e(p0);
       }
       return;
    }
    public void h(boolean p0,RuntimeStat p1){
       if (p0 && !this.d - p1.dispatchToken) {
          this.h.f(p1);
       }else if(!p0 && !this.f - p1.idleToken){
          this.h.f(p1);
       }
       return;
    }
}
