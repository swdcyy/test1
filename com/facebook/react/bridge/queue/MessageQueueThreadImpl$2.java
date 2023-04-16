package com.facebook.react.bridge.queue.MessageQueueThreadImpl$2;
import java.lang.Runnable;
import com.facebook.react.bridge.queue.MessageQueueThreadImpl;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.SystemClock;
import com.facebook.react.bridge.queue.MessageQueueThreadPerfStats;

public class MessageQueueThreadImpl$2 implements Runnable	// class@001248
{
    public final MessageQueueThreadImpl this$0;

    public void MessageQueueThreadImpl$2(MessageQueueThreadImpl p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, MessageQueueThreadImpl$2.class, "1")) {
          return;
       }
       MessageQueueThreadImpl.assignToPerfStats(this.this$0.mPerfStats, SystemClock.uptimeMillis(), SystemClock.currentThreadTimeMillis());
       return;
    }
}
