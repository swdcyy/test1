package com.tkruntime.v8.V8Locker;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Thread;
import java.lang.Error;
import java.lang.StringBuilder;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class V8Locker	// class@000fbc
{
    public final long mIsolatePtr;
    public long mLockerPtr;
    public boolean released;
    public Thread thread;

    public void V8Locker(long p0){
       super();
       this.thread = null;
       this.released = false;
       this.mLockerPtr = 0;
       this.mIsolatePtr = p0;
       this.acquire();
    }
    public synchronized void acquire(){
       if (PatchProxy.applyVoid(null, this, V8Locker.class, "1")) {
          return;
       }
       V8Locker tthread = this.thread;
       if (tthread != null && tthread != Thread.currentThread()) {
          throw new Error("Invalid V8 thread access: current thread is "+Thread.currentThread()+" while the locker has thread "+this.thread);
       }
       if (this.thread == Thread.currentThread()) {
          return;
       }
       this.thread = Thread.currentThread();
       this.released = false;
       return;
    }
    public void checkThread(){
       if (PatchProxy.applyVoid(null, this, V8Locker.class, "4")) {
          return;
       }
       if (this.released != null && this.thread == null) {
          throw new Error("Invalid V8 thread access: the locker has been released!");
       }
       if (this.thread == Thread.currentThread()) {
          return;
       }
       throw new Error("Invalid V8 thread access: current thread is "+Thread.currentThread()+" while the locker has thread "+this.thread);
    }
    public Thread getThread(){
       return this.thread;
    }
    public boolean hasLock(){
       Object obj = PatchProxy.apply(null, this, V8Locker.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.thread == Thread.currentThread())? true: false;
       return b;
    }
    public synchronized void release(){
       if (PatchProxy.applyVoid(null, this, V8Locker.class, "3")) {
          return;
       }
       if (this.released == null || (this.thread != null && (!this.mIsolatePtr || !this.mLockerPtr))) {
          return;
       }
       this.checkThread();
       this.thread = null;
       this.released = true;
       return;
    }
    public synchronized boolean tryAcquire(){
       V8Locker obj = PatchProxy.apply(null, this, V8Locker.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.thread;
       if (obj != null && obj != Thread.currentThread()) {
          return false;
       }
       if (this.thread == Thread.currentThread()) {
          return true;
       }
       this.thread = Thread.currentThread();
       this.released = false;
       return true;
    }
}
