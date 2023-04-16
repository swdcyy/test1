package com.facebook.react.bridge.SharedResourceAllocator;
import java.lang.Object;
import java.util.concurrent.locks.ReentrantLock;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import com.facebook.react.bridge.SharedResourceAllocator$Holder;
import com.facebook.react.bridge.JavaScriptExecutor$Type;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.Enum;
import java.lang.Number;
import com.facebook.react.bridge.SharedResourceAllocator$RefCountedObject;
import java.lang.Long;
import cb.a;
import android.os.Looper;
import java.lang.AssertionError;

public class SharedResourceAllocator	// class@001239
{
    public final ConcurrentHashMap mIsolateHandlers;
    public final HashMap mJSQueues;
    public final ReentrantLock mThreadLock;

    public void SharedResourceAllocator(){
       super();
       this.mThreadLock = new ReentrantLock();
       this.mJSQueues = new HashMap();
       this.mIsolateHandlers = new ConcurrentHashMap();
    }
    public static SharedResourceAllocator getInstance(){
       return SharedResourceAllocator$Holder.sInstance;
    }
    public final String buildKey(int p0,JavaScriptExecutor$Type p1){
       SharedResourceAllocator sharedResour = SharedResourceAllocator.class;
       if (PatchProxy.isSupport(sharedResour)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, sharedResour, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return p1.name()+"+"+p0;
    }
    public int getSharedCount(int p0,JavaScriptExecutor$Type p1){
       SharedResourceAllocator sharedResour = SharedResourceAllocator.class;
       if (PatchProxy.isSupport(sharedResour)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, sharedResour, "8");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       SharedResourceAllocator$RefCountedObject refCountedOb = this.mIsolateHandlers.get(this.buildKey(p0, p1));
       refCountedOb = (refCountedOb != null)? refCountedOb.refCount: 1;
       return refCountedOb;
    }
    public long getSharedIsolateHandler(int p0,JavaScriptExecutor$Type p1){
       SharedResourceAllocator sharedResour = SharedResourceAllocator.class;
       if (PatchProxy.isSupport(sharedResour)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, sharedResour, "5");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       long l = 0;
       if (!p0) {
          return l;
       }else {
          SharedResourceAllocator$RefCountedObject refCountedOb = this.mIsolateHandlers.get(this.buildKey(p0, p1));
          if (refCountedOb != null) {
             l = refCountedOb.getAndRef().longValue();
          }
          StringBuilder str = "getSharedIsolateHandler "+p0+":"+p1.name()+":return:";
          String str1 = (refCountedOb != null)? refCountedOb.toString(): null;
          a.g("SharedResourceAllocator", str+str1+":isolate:"+Long.toHexString(l));
          return l;
       }
    }
    public Looper lockAndGetThread(int p0,JavaScriptExecutor$Type p1){
       Looper obj;
       String str2;
       SharedResourceAllocator sharedResour = SharedResourceAllocator.class;
       if (PatchProxy.isSupport(sharedResour)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, sharedResour, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = null;
       if (!p0) {
          return obj;
       }else {
          this.mThreadLock.lock();
          SharedResourceAllocator$RefCountedObject refCountedOb = this.mJSQueues.get(this.buildKey(p0, p1));
          Looper andRef = (refCountedOb != null)? refCountedOb.getAndRef(): obj;
          if (andRef != null) {
             this.mJSQueues.put(this.buildKey(p0, p1), refCountedOb);
          }
          String str = ":";
          StringBuilder str1 = "lockAndGetThread "+p0+str+p1.name()+":return:"+andRef+str;
          if (refCountedOb != null) {
             str2 = refCountedOb.toString();
          }
          a.k("SharedResourceAllocator", str1+str2);
          return andRef;
       }
    }
    public int lockAndUnref(int p0,JavaScriptExecutor$Type p1){
       SharedResourceAllocator sharedResour = SharedResourceAllocator.class;
       if (PatchProxy.isSupport(sharedResour)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, sharedResour, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int i = 0;
       if (!p0) {
          return i;
       }else {
          this.mThreadLock.lock();
          SharedResourceAllocator$RefCountedObject refCountedOb = this.mJSQueues.get(this.buildKey(p0, p1));
          if (refCountedOb != null) {
             i = refCountedOb.unRef();
             this.mJSQueues.put(this.buildKey(p0, p1), refCountedOb);
          }
          if (!i) {
             this.mJSQueues.remove(this.buildKey(p0, p1));
          }
          StringBuilder str = "lockAndUnref "+p0+":"+p1.name()+":result:";
          String str1 = (refCountedOb != null)? refCountedOb.toString(): null;
          a.k("SharedResourceAllocator", str+str1);
          return i;
       }
    }
    public void registerAndUnlockThread(int p0,JavaScriptExecutor$Type p1,Looper p2){
       if (PatchProxy.isSupport(SharedResourceAllocator.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, SharedResourceAllocator.class, "2")) {
          return;
       }
       a.k("SharedResourceAllocator", "registerAndUnlockThread "+p0+":"+p1.name()+":"+p2);
       if (!p0) {
          return;
       }
       if (p2 != null) {
          this.mJSQueues.put(this.buildKey(p0, p1), new SharedResourceAllocator$RefCountedObject(this, p2));
       }
       this.mThreadLock.unlock();
       return;
    }
    public void registerSharedIsolateHandler(int p0,JavaScriptExecutor$Type p1,long p2){
       if (PatchProxy.isSupport(SharedResourceAllocator.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, Long.valueOf(p2), this, SharedResourceAllocator.class, "6")) {
          return;
       }
       if (!p0) {
          return;
       }
       String str = this.buildKey(p0, p1);
       SharedResourceAllocator$RefCountedObject refCountedOb = this.mIsolateHandlers.get(str);
       if (refCountedOb == null) {
          refCountedOb = new SharedResourceAllocator$RefCountedObject(this, Long.valueOf(p2));
       }else {
          refCountedOb.getAndRef();
       }
       this.mIsolateHandlers.put(str, refCountedOb);
       a.g("SharedResourceAllocator", "registerSharedIsolateHandler "+p0+":"+p1.name()+":return:"+refCountedOb+":isolate:"+Long.toHexString(p2));
       return;
    }
    public void unlockReleasedThread(int p0,JavaScriptExecutor$Type p1){
       SharedResourceAllocator sharedResour = SharedResourceAllocator.class;
       if (PatchProxy.isSupport(sharedResour) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, sharedResour, "4")) {
          return;
       }
       if (!p0) {
          return;
       }
       a.g("SharedResourceAllocator", "unlockReleasedThread "+p0+":"+p1.name());
       this.mThreadLock.unlock();
       return;
    }
    public int unregisterSharedIsolateHandler(int p0,JavaScriptExecutor$Type p1,long p2){
       String obj;
       if (PatchProxy.isSupport(SharedResourceAllocator.class)) {
          obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, Long.valueOf(p2), this, SharedResourceAllocator.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (!p0) {
          return 0;
       }else {
          obj = this.buildKey(p0, p1);
          SharedResourceAllocator$RefCountedObject refCountedOb = this.mIsolateHandlers.get(obj);
          if (refCountedOb != null) {
             int i = refCountedOb.unRef();
             if (i) {
                this.mIsolateHandlers.put(obj, refCountedOb);
             }else {
                this.mIsolateHandlers.remove(obj);
             }
             a.g("SharedResourceAllocator", "unregisterSharedIsolateHandler "+p0+":"+p1.name()+":return:"+refCountedOb+":isolate:"+Long.toHexString(p2));
             return i;
          }else {
             throw new AssertionError();
          }
       }
    }
}
