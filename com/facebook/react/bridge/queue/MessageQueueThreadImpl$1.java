package com.facebook.react.bridge.queue.MessageQueueThreadImpl$1;
import java.lang.Runnable;
import com.facebook.react.bridge.queue.MessageQueueThreadImpl;
import com.facebook.react.common.futures.SimpleSettableFuture;
import java.util.concurrent.Callable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.concurrent.CountDownLatch;

public class MessageQueueThreadImpl$1 implements Runnable	// class@001247
{
    public final MessageQueueThreadImpl this$0;
    public final Callable val$callable;
    public final SimpleSettableFuture val$future;

    public void MessageQueueThreadImpl$1(MessageQueueThreadImpl p0,SimpleSettableFuture p1,Callable p2){
       this.this$0 = p0;
       this.val$future = p1;
       this.val$callable = p2;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, MessageQueueThreadImpl$1.class, "1")) {
          return;
       }
       try{
          this.val$future.q(this.val$callable.call());
       }catch(java.lang.Exception e0){
          MessageQueueThreadImpl$1 tval$future = this.val$future;
          tval$future.m();
          tval$future.d = e0;
          tval$future.b.countDown();
       }
       return;
    }
}
