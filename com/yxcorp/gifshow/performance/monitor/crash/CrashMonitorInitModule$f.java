package com.yxcorp.gifshow.performance.monitor.crash.CrashMonitorInitModule$f;
import lg7.j;
import java.lang.Object;
import com.kwai.performance.stability.crash.monitor.message.ExceptionMessage;
import java.io.File;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.performance.monitor.crash.CrashMonitorInitModule$f$a;
import java.lang.Runnable;
import t45.c;
import twb.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Runtime;
import kotlin.jvm.internal.a;
import yf7.h;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Date;
import com.google.gson.JsonObject;
import java.lang.System;
import java.lang.Long;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Thread;
import yf7.i;
import com.google.gson.JsonElement;
import com.kwai.performance.stability.oom.monitor.OOMHeapDumper;
import xg7.a;
import xg7.b;
import com.kwai.performance.stability.hprof.dump.ForkJvmHeapDumper;
import com.kwai.performance.stability.hprof.dump.StripHprofHeapDumper;
import xg7.c;

public final class CrashMonitorInitModule$f implements j	// class@0012a8
{

    public void CrashMonitorInitModule$f(){
       super();
    }
    public void a(int p0,ExceptionMessage p1,File p2){
       if (PatchProxy.isSupport(CrashMonitorInitModule$f.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, CrashMonitorInitModule$f.class, "2")) {
          return;
       }
       if (p0 == 1 || p0 == 4) {
          c.a(new CrashMonitorInitModule$f$a(p1));
       }
       return;
    }
    public void b(int p0,ExceptionMessage p1){
       float f;
       CrashMonitorInitModule$f uof = CrashMonitorInitModule$f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uof, "1")) {
          return;
       }
       a h = a.h;
       Objects.requireNonNull(h);
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || (!PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, h, uoa, "2") && a.b)) {
          Thread obj = PatchProxy.apply(null, h, uoa, "5");
          if (obj != PatchProxyResult.class) {
             f = obj.floatValue();
          }else {
             long l = Runtime.getRuntime().maxMemory();
             f = (!l - null)? 0: ((float)(Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) * 0x3f800000) / (float)l;
          }
          if (f - a.e >= 0) {
             int i = 1;
             if (p0 == i && (p1 != null && a.g(p1.mCrashType, p1.getTypeHeapOOM()))) {
                h.d("OOMHprofHelper", "try dump hprof, upload next launch");
                ExceptionMessage mLogUUID = p1.mLogUUID;
                if (mLogUUID == null) {
                   mLogUUID = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss_SSS", Locale.CHINESE).format(new Date());
                   p1.mLogUUID = mLogUUID;
                }
                p1.mDumpCrashHprof = i;
                JsonObject jsonObject = new JsonObject();
                jsonObject.c0("uuid", mLogUUID);
                jsonObject.a0("timestamp", Long.valueOf(System.currentTimeMillis()));
                jsonObject.c0("state", "trigger");
                jsonObject.H("fork", Boolean.valueOf(a.c));
                jsonObject.H("strip", Boolean.valueOf(a.d));
                jsonObject.H("waitpid", Boolean.valueOf(a.f));
                jsonObject.a0("ratio", Float.valueOf(f));
                obj = Thread.currentThread();
                a.o(obj, "Thread.currentThread\(\)");
                jsonObject.c0("thread", obj.getName());
                boolean b = false;
                i.a.c("OOM_HPROF_DUMP", jsonObject.toString(), b);
                boolean c = a.c;
                String str = "OOMHeapDumper";
                if (c && a.d) {
                   h.d(str, "forkDumpStrip");
                   OOMHeapDumper.a.a(new a(a.f), 3, mLogUUID);
                }else if(c && !a.d){
                   h.d(str, "forkDump");
                   OOMHeapDumper.a.a(new ForkJvmHeapDumper(a.f), i, mLogUUID);
                }else if(a.d){
                   h.d(str, "dumpStripHprof");
                   OOMHeapDumper.a.a(new StripHprofHeapDumper(), 2, mLogUUID);
                }else {
                   h.d(str, "simpleDump");
                   OOMHeapDumper.a.a(new c(), b, mLogUUID);
                }
             }
          }
       }
    label_016b :
       return;
    }
}
