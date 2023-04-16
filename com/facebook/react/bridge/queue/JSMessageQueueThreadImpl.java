package com.facebook.react.bridge.queue.JSMessageQueueThreadImpl;
import com.facebook.react.bridge.queue.MessageQueueThreadImpl;
import java.lang.String;
import android.os.Looper;
import com.facebook.react.bridge.queue.QueueThreadExceptionHandler;
import com.facebook.react.bridge.JavaScriptExecutor$Type;
import com.facebook.react.bridge.queue.MessageQueueThreadPerfStats;
import ud.a;
import java.lang.Runnable;
import android.os.AsyncTask;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.facebook.react.bridge.SharedResourceAllocator;
import java.lang.StringBuilder;
import cb.a;
import java.lang.Thread;
import java.lang.RuntimeException;
import com.facebook.react.bridge.queue.ReactThreadMonitor;
import com.facebook.react.bridge.queue.MessageQueueThreadHandler;
import android.os.Handler;

public class JSMessageQueueThreadImpl extends MessageQueueThreadImpl	// class@001244
{
    public final JavaScriptExecutor$Type mType;

    public void JSMessageQueueThreadImpl(String p0,Looper p1,QueueThreadExceptionHandler p2){
       super(p0, p1, p2, null, 0, JavaScriptExecutor$Type.UNKNOWN);
    }
    public void JSMessageQueueThreadImpl(String p0,Looper p1,QueueThreadExceptionHandler p2,MessageQueueThreadPerfStats p3,int p4,JavaScriptExecutor$Type p5){
       super(p0, p1, p2, p3, p4);
       this.mType = p5;
    }
    private void lambda$quitSynchronous$0(){
       AsyncTask.execute(new a(this));
    }
    public final void killThreadSynchronous(){
       if (PatchProxy.applyVoid(null, this, JSMessageQueueThreadImpl.class, "3")) {
          return;
       }
       if (!SharedResourceAllocator.getInstance().lockAndUnref(this.mGroupId, this.mType)) {
          try{
             a.g("ReactNativeDestroy", this+":"+this.getName()+" thread join looper "+this.mLooper);
             this.mLooper.quit();
             this.mLooper.getThread().join();
          }catch(java.lang.InterruptedException e0){
             throw new RuntimeException("Got interrupted waiting to join thread "+this.mName);
          }
       }
       SharedResourceAllocator.getInstance().unlockReleasedThread(this.mGroupId, this.mType);
       return;
    }
    public void quitSynchronous(){
       if (PatchProxy.applyVoid(null, this, JSMessageQueueThreadImpl.class, "2")) {
          return;
       }
       boolean b = true;
       if (this.mIsFinished == null && SharedResourceAllocator.getInstance().getSharedCount(this.mGroupId, this.mType) == b) {
          ReactThreadMonitor.decrease(this.getName());
       }
       this.mIsFinished = b;
       this.mHandler.setIsFinished(b);
       a.g("ReactNativeDestroy", this+":"+this.getName()+" thread quit looper "+this.mLooper);
       if (this.mLooper.getThread() != Thread.currentThread()) {
          this.killThreadSynchronous();
       }
       return;
    }
    public void runOnQueue(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, JSMessageQueueThreadImpl.class, "1")) {
          return;
       }
       if (this.mIsFinished != null) {
          a.x("ReactNative", "Tried to enqueue runnable on already finished thread: \'"+this.getName()+"... dropping Runnable.");
          return;
       }else {
          this.mHandler.post(p0);
          return;
       }
    }
}
