package com.tkruntime.v8.V8Locker$DeprecatedV8Locker;
import com.tkruntime.v8.V8Locker;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Error;
import java.lang.Thread;

public class V8Locker$DeprecatedV8Locker extends V8Locker	// class@000fbb
{
    public boolean released;
    public Thread thread;

    public void V8Locker$DeprecatedV8Locker(long p0){
       super(p0);
       this.thread = null;
       this.released = false;
    }
    public synchronized void acquire(){
       this.released = false;
    }
    public void checkThread(){
       if (PatchProxy.applyVoid(null, this, V8Locker$DeprecatedV8Locker.class, "1")) {
          return;
       }
       if (this.released == null) {
          return;
       }
       throw new Error("Invalid V8 thread access: the locker has been released!");
    }
    public Thread getThread(){
       return this.thread;
    }
    public boolean hasLock(){
       return true;
    }
    public synchronized void release(){
       this.released = true;
       this.thread = null;
    }
    public synchronized boolean tryAcquire(){
       this.released = false;
       return true;
    }
}
