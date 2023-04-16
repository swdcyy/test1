package com.facebook.react.bridge.queue.MessageQueueThreadImpl$4;
import java.lang.Runnable;
import java.lang.String;
import com.facebook.react.common.futures.SimpleSettableFuture;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.os.Process;
import java.lang.StringBuilder;
import java.lang.Thread;
import com.facebook.base.tracing.TracingManager;
import android.os.Looper;
import com.facebook.react.bridge.queue.MessageQueueThreadPerfStats;
import android.os.SystemClock;
import com.facebook.react.bridge.queue.MessageQueueThreadImpl;
import android.util.Pair;
import com.facebook.react.bridge.queue.ReactThreadMonitor;

public final class MessageQueueThreadImpl$4 implements Runnable	// class@00124a
{
    public final SimpleSettableFuture val$dataFuture;
    public final String val$name;

    public void MessageQueueThreadImpl$4(String p0,SimpleSettableFuture p1){
       this.val$name = p0;
       this.val$dataFuture = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, MessageQueueThreadImpl$4.class, "1")) {
          return;
       }
       Process.setThreadPriority(-4);
       TracingManager.g(this.val$name+":"+Thread.currentThread().getId());
       Looper.prepare();
       MessageQueueThreadPerfStats messageQueue = new MessageQueueThreadPerfStats();
       MessageQueueThreadImpl.assignToPerfStats(messageQueue, SystemClock.uptimeMillis(), SystemClock.currentThreadTimeMillis());
       this.val$dataFuture.q(new Pair(Looper.myLooper(), messageQueue));
       ReactThreadMonitor.increase(this.val$name);
       Looper.loop();
       return;
    }
}
