package com.facebook.react.bridge.queue.MessageQueueThreadImpl;
import com.facebook.react.bridge.queue.MessageQueueThread;
import java.lang.String;
import android.os.Looper;
import com.facebook.react.bridge.queue.QueueThreadExceptionHandler;
import com.facebook.react.bridge.queue.MessageQueueThreadPerfStats;
import java.lang.Object;
import com.facebook.react.bridge.queue.MessageQueueThreadHandler;
import java.lang.StringBuilder;
import com.facebook.react.bridge.queue.MessageQueueThreadSpec;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.bridge.JavaScriptExecutor$Type;
import java.lang.Integer;
import com.facebook.react.bridge.queue.MessageQueueThreadImpl$5;
import com.facebook.react.bridge.queue.MessageQueueThreadSpec$ThreadType;
import java.lang.Enum;
import java.lang.RuntimeException;
import com.facebook.react.bridge.UiThreadUtil;
import android.os.Process;
import java.lang.Thread;
import com.facebook.base.tracing.TracingManager;
import com.facebook.react.bridge.queue.MessageQueueThreadImpl$3;
import java.lang.Runnable;
import java.lang.Long;
import yd.e;
import com.facebook.react.bridge.SharedResourceAllocator;
import android.util.Pair;
import com.facebook.react.bridge.queue.JSMessageQueueThreadImpl;
import cb.a;
import com.facebook.react.common.futures.SimpleSettableFuture;
import com.facebook.react.bridge.queue.MessageQueueThreadImpl$4;
import java.lang.ThreadGroup;
import java.lang.Throwable;
import com.facebook.react.bridge.SoftAssertions;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import com.facebook.react.bridge.queue.MessageQueueThreadImpl$1;
import java.lang.Boolean;
import com.facebook.react.bridge.queue.ReactThreadMonitor;
import com.facebook.react.bridge.queue.MessageQueueThreadImpl$2;
import android.os.Handler;

public class MessageQueueThreadImpl implements MessageQueueThread	// class@00124c
{
    public final String mAssertionErrorMessage;
    public final int mGroupId;
    public final MessageQueueThreadHandler mHandler;
    public boolean mIsFinished;
    public final Looper mLooper;
    public final String mName;
    public MessageQueueThreadPerfStats mPerfStats;

    public void MessageQueueThreadImpl(String p0,Looper p1,QueueThreadExceptionHandler p2){
       super(p0, p1, p2, null, 0);
    }
    public void MessageQueueThreadImpl(String p0,Looper p1,QueueThreadExceptionHandler p2,MessageQueueThreadPerfStats p3,int p4){
       super();
       this.mIsFinished = false;
       this.mName = p0;
       this.mLooper = p1;
       this.mHandler = new MessageQueueThreadHandler(p1, p2);
       this.mPerfStats = p3;
       this.mAssertionErrorMessage = "Expected to be called from the \'"+this.getName()+"\' thread!";
       this.mGroupId = p4;
    }
    public static void assignToPerfStats(MessageQueueThreadPerfStats p0,long p1,long p2){
       p0.wallTime = p1;
       p0.cpuTime = p2;
    }
    public static MessageQueueThreadImpl create(MessageQueueThreadSpec p0,QueueThreadExceptionHandler p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, MessageQueueThreadImpl.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MessageQueueThreadImpl.create(p0, p1, 0, JavaScriptExecutor$Type.UNKNOWN);
    }
    public static MessageQueueThreadImpl create(MessageQueueThreadSpec p0,QueueThreadExceptionHandler p1,int p2,JavaScriptExecutor$Type p3){
       if (PatchProxy.isSupport(MessageQueueThreadImpl.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), p3, null, MessageQueueThreadImpl.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = MessageQueueThreadImpl$5.$SwitchMap$com$facebook$react$bridge$queue$MessageQueueThreadSpec$ThreadType[p0.getThreadType().ordinal()];
       if (i != 1) {
          if (i == 2) {
             return MessageQueueThreadImpl.startNewBackgroundThread(p0.getName(), p0.getStackSize(), p1, p2, p3);
          }else {
             throw new RuntimeException("Unknown thread type: "+p0.getThreadType());
          }
       }else {
          return MessageQueueThreadImpl.createForMainThread(p0.getName(), p1);
       }
    }
    public static MessageQueueThreadImpl createForMainThread(String p0,QueueThreadExceptionHandler p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, MessageQueueThreadImpl.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       MessageQueueThreadImpl messageQueue = new MessageQueueThreadImpl(p0, Looper.getMainLooper(), p1);
       if (UiThreadUtil.isOnUiThread()) {
          Process.setThreadPriority(-4);
          TracingManager.g(p0+":"+Thread.currentThread().getId());
       }else {
          UiThreadUtil.runOnUiThread(new MessageQueueThreadImpl$3(p0));
       }
       return messageQueue;
    }
    public static MessageQueueThreadImpl startNewBackgroundThread(String p0,long p1,QueueThreadExceptionHandler p2,int p3,JavaScriptExecutor$Type p4){
       Looper obj1;
       Looper looper;
       object oobject = p0;
       int i = p3;
       object oobject1 = p4;
       MessageQueueThreadImpl messageQueue = MessageQueueThreadImpl.class;
       Object obj = null;
       if (PatchProxy.isSupport(messageQueue)) {
          Object[] objArray = new Object[]{oobject,Long.valueOf(p1),p2,Integer.valueOf(p3),oobject1};
          obj1 = PatchProxy.apply(objArray, obj, messageQueue, "11");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       if (e.z && p0.equals("js")) {
          obj1 = SharedResourceAllocator.getInstance().lockAndGetThread(i, oobject1);
          if (obj1 != null) {
             SharedResourceAllocator.getInstance().registerAndUnlockThread(i, oobject1, obj);
          }else {
             Pair first = MessageQueueThreadImpl.startNewBackgroundThreadImpl(p0, p1).first;
             SharedResourceAllocator.getInstance().registerAndUnlockThread(i, oobject1, first);
          }
          looper = obj1;
          JSMessageQueueThreadImpl jSMessageQue = new JSMessageQueueThreadImpl(p0, looper, p2, null, p3, p4);
          a.x("ReactNativeDestroy", p0+" Thread:"+v12+":looper:"+looper);
       }else {
          Pair pair = MessageQueueThreadImpl.startNewBackgroundThreadImpl(p0, p1);
          messageQueue = new MessageQueueThreadImpl(p0, pair.first, p2, pair.second, 0);
          a.x("ReactNativeDestroy", p0+" Thread:"+v12+":looper:"+pair.first);
       }
       return v12;
    }
    public static Pair startNewBackgroundThreadImpl(String p0,long p1){
       SimpleSettableFuture obj;
       MessageQueueThreadImpl messageQueue = MessageQueueThreadImpl.class;
       if (PatchProxy.isSupport(messageQueue)) {
          obj = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), null, messageQueue, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new SimpleSettableFuture();
       Thread thread = new Thread(null, new MessageQueueThreadImpl$4(p0, obj), "mqt_"+p0, p1);
       try{
          v7.start();
          return obj.get();
       }catch(java.lang.InterruptedException e8){
       }catch(java.util.concurrent.ExecutionException e8){
       }
       throw new RuntimeException(e8);
    }
    public void assertIsOnThread(){
       if (PatchProxy.applyVoid(null, this, MessageQueueThreadImpl.class, "4")) {
          return;
       }
       SoftAssertions.assertCondition(this.isOnThread(), this.mAssertionErrorMessage);
       return;
    }
    public void assertIsOnThread(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MessageQueueThreadImpl.class, "5")) {
          return;
       }
       SoftAssertions.assertCondition(this.isOnThread(), this.mAssertionErrorMessage+" "+p0);
       return;
    }
    public Future callOnQueue(Callable p0){
       SimpleSettableFuture obj = PatchProxy.applyOneRefs(p0, this, MessageQueueThreadImpl.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new SimpleSettableFuture();
       this.runOnQueue(new MessageQueueThreadImpl$1(this, obj, p0));
       return obj;
    }
    public Looper getLooper(){
       return this.mLooper;
    }
    public String getName(){
       return this.mName;
    }
    public MessageQueueThreadPerfStats getPerfStats(){
       return this.mPerfStats;
    }
    public boolean isOnThread(){
       Object obj = PatchProxy.apply(null, this, MessageQueueThreadImpl.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.mLooper.getThread() == Thread.currentThread())? true: false;
       return b;
    }
    public void quitSynchronous(){
       if (PatchProxy.applyVoid(null, this, MessageQueueThreadImpl.class, "6")) {
          return;
       }
       StringBuilder str = "Thread::quitSynchronous "+this.getName()+":";
       boolean b = (this.mLooper.getThread() != Thread.currentThread())? true: false;
       a.x("ReactNativeDestroy", str+b);
       if (this.mIsFinished == null) {
          ReactThreadMonitor.decrease(this.getName());
       }
       this.mIsFinished = true;
       this.mLooper.quit();
       if (this.mLooper.getThread() != Thread.currentThread()) {
          try{
             this.mLooper.getThread().join();
          }catch(java.lang.InterruptedException e0){
             throw new RuntimeException("Got interrupted waiting to join thread "+this.mName);
          }
       }
       return;
    }
    public void resetPerfStats(){
       if (PatchProxy.applyVoid(null, this, MessageQueueThreadImpl.class, "7")) {
          return;
       }
       MessageQueueThreadImpl.assignToPerfStats(this.mPerfStats, -1, -1);
       this.runOnQueue(new MessageQueueThreadImpl$2(this));
       return;
    }
    public void runOnQueue(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MessageQueueThreadImpl.class, "1")) {
          return;
       }
       if (this.mIsFinished != null) {
          a.x("ReactNative", "Tried to enqueue runnable on already finished thread: \'"+this.getName()+"... dropping Runnable.");
       }
       this.mHandler.post(p0);
       return;
    }
}
