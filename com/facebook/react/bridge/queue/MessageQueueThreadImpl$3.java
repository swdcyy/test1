package com.facebook.react.bridge.queue.MessageQueueThreadImpl$3;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.os.Process;
import java.lang.StringBuilder;
import java.lang.Thread;
import com.facebook.base.tracing.TracingManager;

public final class MessageQueueThreadImpl$3 implements Runnable	// class@001249
{
    public final String val$name;

    public void MessageQueueThreadImpl$3(String p0){
       this.val$name = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, MessageQueueThreadImpl$3.class, "1")) {
          return;
       }
       Process.setThreadPriority(-4);
       TracingManager.g(this.val$name+":"+Thread.currentThread().getId());
       return;
    }
}
