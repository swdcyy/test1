package com.kwai.performance.fluency.jank.monitor.collector.StackTraceCollector;
import android.view.Choreographer$FrameCallback;
import android.os.Handler$Callback;
import com.kwai.performance.fluency.jank.monitor.LogRecordQueue$b;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.lang.Object;
import java.util.List;
import com.kwai.performance.fluency.jank.monitor.LogRecordQueue$PackedRecord;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.os.Handler;
import android.os.Message;
import qrd.l1;
import af7.b;
import java.util.Objects;
import android.os.Looper;
import android.os.HandlerThread;
import android.view.Choreographer;
import com.kwai.performance.fluency.jank.monitor.JankMonitor;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.Pair;
import java.lang.Number;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.performance.fluency.jank.monitor.LogRecordQueue$PackedRecordExtra;
import org.json.JSONArray;
import com.kwai.performance.fluency.jank.monitor.collector.StackTraceCollector$handleMessage$2$1;
import msd.l;
import trd.y;
import java.lang.System;
import java.lang.Thread;
import java.lang.Long;

public final class StackTraceCollector implements Choreographer$FrameCallback, Handler$Callback, LogRecordQueue$b	// class@00108e
{
    public static final StackTraceCollector b;
    public static Handler c;
    public static final List d;
    public static final CopyOnWriteArrayList e;
    public static Object f;

    static {
       StackTraceCollector.b = new StackTraceCollector();
       StackTraceCollector.d = new ArrayList();
       StackTraceCollector.e = new CopyOnWriteArrayList();
       StackTraceCollector.f = new Object();
    }
    public void StackTraceCollector(){
       super();
    }
    public static synchronized final boolean c(){
       _monitor_enter(StackTraceCollector.class);
       _monitor_exit(StackTraceCollector.class);
       return StackTraceCollector.d.isEmpty();
    }
    public void a(LogRecordQueue$PackedRecord p0){
       a.p(p0, "record");
       if (StackTraceCollector.e.isEmpty()) {
          return;
       }
       Message message = Message.obtain();
       message.what = 2;
       this.b().sendMessage(message);
       return;
    }
    public final Handler b(){
       if (StackTraceCollector.c == null) {
          b b = b.b;
          Objects.requireNonNull(b);
          a.p(this, "callback");
          StackTraceCollector.c = new Handler(b.getLooper(), this);
       }
       Handler c = StackTraceCollector.c;
       a.m(c);
       return c;
    }
    public final Message d(int p0,Object p1){
       Message message = Message.obtain();
       message.what = 1;
       message.arg1 = p0;
       message.obj = p1;
       return message;
    }
    public void doFrame(long p0){
       Message message = this.d(1, new Object());
       a.o(message, "obtainStackTraceMsg\(1, Any\(\)\)");
       this.e(1, message);
       if (!StackTraceCollector.c()) {
          Choreographer.getInstance().postFrameCallback(this);
       }
       return;
    }
    public synchronized final boolean e(boolean p0,Message p1){
       Message obj;
       int i = 1;
       if (p0) {
          obj = p1.obj;
          a.o(obj, "msg.obj");
          StackTraceCollector.f = obj;
          this.b().removeMessages(i);
          this.b().sendMessageDelayed(p1, 84);
          return i;
       }else if(!a.g(p1.obj, StackTraceCollector.f)){
          return false;
       }else {
          CopyOnWriteArrayList e = StackTraceCollector.e;
          if (!e.isEmpty()) {
             LogRecordQueue$PackedRecord packedRecord = JankMonitor.topMessage(false);
             if (packedRecord != null && packedRecord.getNow() - CollectionsKt___CollectionsKt.Y2(e).getFirst().longValue() <= 0) {
                e = false;
             label_0057 :
                if (p1.arg1 <= 10) {
                   Handler handler = this.b();
                   Message arg1 = p1.arg1;
                   if (!e) {
                      i = 0;
                   }
                   p1 = p1.obj;
                   a.o(p1, "msg.obj");
                   handler.sendMessageDelayed(this.d((arg1 + i), p1), 84);
                }
                return e;
             }
          }
          e = true;
          goto label_0057 ;
       }
    }
    public boolean handleMessage(Message p0){
       a.p(p0, "msg");
       Message what = p0.what;
       boolean b = false;
       if (what != true) {
          int i = 2;
          if (what == i) {
             Iterator iterator = StackTraceCollector.e.iterator();
             while (iterator.hasNext()) {
                Pair pair = iterator.next();
                LogRecordQueue$PackedRecord packedRecord = JankMonitor.searchMessage$default(pair.getFirst().longValue(), b, i, null);
                if (packedRecord == null) {
                   continue ;
                }
                packedRecord.setExtra(new LogRecordQueue$PackedRecordExtra());
                LogRecordQueue$PackedRecordExtra extra = packedRecord.getExtra();
                a.m(extra);
                extra.setStacks(pair.getSecond());
             }
             LogRecordQueue$PackedRecord packedRecord1 = JankMonitor.topMessage(b);
             if (packedRecord1 != null) {
                y.K0(StackTraceCollector.e, new StackTraceCollector$handleMessage$2$1(packedRecord1));
             }
          }
       }else if(this.e(b, p0)){
          Thread thread = Looper.getMainLooper().getThread();
          a.o(thread, "getMainLooper\(\).thread");
          StackTraceCollector.e.add(new Pair(Long.valueOf(System.currentTimeMillis()), JankMonitor.getStackTrace(thread, b, b)));
       }
       return true;
    }
}
