package com.facebook.react.bridge.queue.MessageQueueThreadHandler;
import android.os.Handler;
import android.os.Looper;
import com.facebook.react.bridge.queue.QueueThreadExceptionHandler;
import java.util.concurrent.atomic.AtomicBoolean;
import android.os.Message;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Exception;
import java.lang.Boolean;

public class MessageQueueThreadHandler extends Handler	// class@001246
{
    public final QueueThreadExceptionHandler mExceptionHandler;
    public AtomicBoolean mIsFinished;

    public void MessageQueueThreadHandler(Looper p0,QueueThreadExceptionHandler p1){
       super(p0);
       this.mExceptionHandler = p1;
       this.mIsFinished = new AtomicBoolean(false);
    }
    public void dispatchMessage(Message p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MessageQueueThreadHandler.class, "2")) {
          return;
       }
       if (this.mIsFinished.get()) {
          return;
       }
       try{
          super.dispatchMessage(p0);
       }catch(java.lang.Exception e3){
          this.mExceptionHandler.handleException(e3);
       }
       return;
    }
    public void setIsFinished(boolean p0){
       if (PatchProxy.isSupport(MessageQueueThreadHandler.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, MessageQueueThreadHandler.class, "1")) {
          return;
       }
       this.mIsFinished.set(p0);
       return;
    }
}
