package com.eclipsesource.v8.utils.V8Thread;
import java.lang.Thread;
import com.eclipsesource.v8.utils.V8Runnable;
import com.eclipsesource.v8.V8;
import com.eclipsesource.v8.V8Locker;

public class V8Thread extends Thread	// class@001022
{
    public V8 runtime;
    public final V8Runnable target;

    public void V8Thread(V8Runnable p0){
       super();
       this.target = p0;
    }
    public void run(){
       V8 v8 = V8.createV8Runtime();
       this.runtime = v8;
       this.target.run(v8);
       _monitor_enter(this);
       if (this.runtime.getLocker().hasLock()) {
          this.runtime.close();
          this.runtime = null;
       }
       _monitor_exit(this);
       return;
    }
}
