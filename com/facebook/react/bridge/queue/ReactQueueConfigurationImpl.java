package com.facebook.react.bridge.queue.ReactQueueConfigurationImpl;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.bridge.queue.MessageQueueThreadImpl;
import java.lang.Object;
import com.facebook.react.bridge.queue.ReactQueueConfigurationSpec;
import com.facebook.react.bridge.queue.QueueThreadExceptionHandler;
import com.facebook.react.bridge.JavaScriptExecutor$Type;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;
import vd.d;
import com.facebook.react.bridge.queue.MessageQueueThreadSpec;
import android.os.Looper;
import com.facebook.react.bridge.queue.MessageQueueThread;

public class ReactQueueConfigurationImpl implements ReactQueueConfiguration	// class@001253
{
    public final MessageQueueThreadImpl mJSQueueThread;
    public final MessageQueueThreadImpl mNativeModulesQueueThread;
    public final MessageQueueThreadImpl mUIQueueThread;

    public void ReactQueueConfigurationImpl(MessageQueueThreadImpl p0,MessageQueueThreadImpl p1,MessageQueueThreadImpl p2){
       super();
       this.mUIQueueThread = p0;
       this.mNativeModulesQueueThread = p1;
       this.mJSQueueThread = p2;
    }
    public static ReactQueueConfigurationImpl create(ReactQueueConfigurationSpec p0,QueueThreadExceptionHandler p1,int p2,JavaScriptExecutor$Type p3){
       HashMap obj;
       if (PatchProxy.isSupport(ReactQueueConfigurationImpl.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), p3, null, ReactQueueConfigurationImpl.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = d.b();
       MessageQueueThreadSpec messageQueue = MessageQueueThreadSpec.mainThreadSpec();
       MessageQueueThreadImpl messageQueue1 = MessageQueueThreadImpl.create(messageQueue, p1);
       obj.put(messageQueue, messageQueue1);
       MessageQueueThreadImpl messageQueue2 = obj.get(p0.getJSQueueThreadSpec());
       if (messageQueue2 == null) {
          messageQueue2 = MessageQueueThreadImpl.create(p0.getJSQueueThreadSpec(), p1, p2, p3);
       }
       MessageQueueThreadImpl messageQueue3 = obj.get(p0.getNativeModulesQueueThreadSpec());
       if (messageQueue3 == null) {
          messageQueue3 = MessageQueueThreadImpl.create(p0.getNativeModulesQueueThreadSpec(), p1);
       }
       return new ReactQueueConfigurationImpl(messageQueue1, messageQueue3, messageQueue2);
    }
    public void destroy(){
       if (PatchProxy.applyVoid(null, this, ReactQueueConfigurationImpl.class, "1")) {
          return;
       }
       if (this.mNativeModulesQueueThread.getLooper() != Looper.getMainLooper()) {
          this.mNativeModulesQueueThread.quitSynchronous();
       }
       if (this.mJSQueueThread.getLooper() != Looper.getMainLooper()) {
          this.mJSQueueThread.quitSynchronous();
       }
       return;
    }
    public void destroyJSThread(){
       if (PatchProxy.applyVoid(null, this, ReactQueueConfigurationImpl.class, "3")) {
          return;
       }
       if (this.mJSQueueThread.getLooper() != Looper.getMainLooper()) {
          this.mJSQueueThread.quitSynchronous();
       }
       return;
    }
    public void destroyNativeModulesThread(){
       if (PatchProxy.applyVoid(null, this, ReactQueueConfigurationImpl.class, "2")) {
          return;
       }
       if (this.mNativeModulesQueueThread.getLooper() != Looper.getMainLooper()) {
          this.mNativeModulesQueueThread.quitSynchronous();
       }
       return;
    }
    public MessageQueueThread getJSQueueThread(){
       return this.mJSQueueThread;
    }
    public MessageQueueThread getNativeModulesQueueThread(){
       return this.mNativeModulesQueueThread;
    }
    public MessageQueueThread getUIQueueThread(){
       return this.mUIQueueThread;
    }
}
