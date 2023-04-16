package cg7.c;
import java.lang.String;
import nsd.u;
import java.lang.System;
import kotlin.Result;
import android.os.Looper;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Thread;
import java.lang.StackTraceElement;
import com.kwai.performance.overhead.gpu.monitor.StackTrace$1$1;
import java.lang.CharSequence;
import msd.l;
import kotlin.collections.ArraysKt___ArraysKt;
import java.lang.Throwable;
import qrd.j0;

public final class c	// class@00054d
{
    public long endTimestamp;
    public int repeatCount;
    public boolean runIdle;
    public final String stackTraceDetail;
    public final long startTimestamp;

    public void c(){
       super(0, null, 3, null);
    }
    public void c(long p0,String p1,int p2,u p3){
       Thread thread;
       if (p2 & 0x01) {
          p0 = System.currentTimeMillis();
       }
       if (p2 & 0x02) {
          Looper mainLooper = Looper.getMainLooper();
          a.h(mainLooper, "Looper.getMainLooper\(\)");
          thread = mainLooper.getThread();
          a.h(thread, "Looper.getMainLooper\(\).thread");
          StackTraceElement[] stackTrace = thread.getStackTrace();
          a.h(stackTrace, "Looper.getMainLooper\(\).thread.stackTrace");
          thread = Result.constructor-impl(ArraysKt___ArraysKt.Gg(stackTrace, "\n", "\n", "\n", 0, null, StackTrace$1$1.INSTANCE, 24, null));
          if (Result.exceptionOrNull-impl(thread) != null) {
             thread = "";
          }
       }else {
          p1 = null;
       }
       a.q(thread, "stackTraceDetail");
       super();
       this.startTimestamp = p0;
       this.stackTraceDetail = thread;
       this.endTimestamp = p0;
       this.repeatCount = 1;
       return;
    }
}
