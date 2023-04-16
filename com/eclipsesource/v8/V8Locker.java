package com.eclipsesource.v8.V8Locker;
import com.eclipsesource.v8.V8;
import java.lang.Object;
import java.lang.Thread;
import java.lang.Error;
import java.lang.StringBuilder;
import java.lang.String;
import com.eclipsesource.v8.V8Value;

public class V8Locker	// class@000fe0
{
    public boolean released;
    public V8 runtime;
    public Thread thread;

    public void V8Locker(V8 p0){
       super();
       this.thread = null;
       this.released = false;
       this.runtime = p0;
       this.acquire();
    }
    public synchronized void acquire(){
       V8Locker tthread = this.thread;
       if (tthread != null && tthread != Thread.currentThread()) {
          throw new Error("Invalid V8 thread access: current thread is "+Thread.currentThread()+" while the locker has thread "+this.thread);
       }
       if (this.thread == Thread.currentThread()) {
          return;
       }
       tthread = this.runtime;
       tthread.acquireLock(tthread.getV8RuntimePtr());
       this.thread = Thread.currentThread();
       this.released = false;
       return;
    }
    public void checkThread(){
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
       boolean b = (this.thread == Thread.currentThread())? true: false;
       return b;
    }
    public synchronized void release(){
       if (this.released == null || (this.thread == null || this.runtime.isReleased())) {
          return;
       }
       this.checkThread();
       V8Locker truntime = this.runtime;
       truntime.releaseLock(truntime.getV8RuntimePtr());
       this.thread = null;
       this.released = true;
       return;
    }
    public synchronized boolean tryAcquire(){
       V8Locker tthread = this.thread;
       if (tthread != null && tthread != Thread.currentThread()) {
          return false;
       }
       if (this.thread == Thread.currentThread()) {
          return true;
       }
       tthread = this.runtime;
       tthread.acquireLock(tthread.getV8RuntimePtr());
       this.thread = Thread.currentThread();
       this.released = false;
       return true;
    }
}
