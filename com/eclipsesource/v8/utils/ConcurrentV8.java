package com.eclipsesource.v8.utils.ConcurrentV8;
import java.lang.Object;
import com.eclipsesource.v8.V8;
import com.eclipsesource.v8.V8Locker;
import com.eclipsesource.v8.V8Value;
import com.eclipsesource.v8.utils.ConcurrentV8$1;
import com.eclipsesource.v8.utils.V8Runnable;

public final class ConcurrentV8	// class@001013
{
    public V8 v8;

    public void ConcurrentV8(){
       super();
       this.v8 = null;
       V8 v8 = V8.createV8Runtime();
       this.v8 = v8;
       v8.getLocker().release();
    }
    public V8 getV8(){
       return this.v8;
    }
    public void release(){
       ConcurrentV8 tv8 = this.v8;
       if (tv8 != null && !tv8.isReleased()) {
          this.run(new ConcurrentV8$1(this));
       }
       return;
    }
    public synchronized void run(V8Runnable p0){
       this.v8.getLocker().acquire();
       p0.run(this.v8);
       ConcurrentV8 tv8 = this.v8;
       if (tv8 != null && (tv8.getLocker() != null && this.v8.getLocker().hasLock())) {
          this.v8.getLocker().release();
       }
    label_002e :
       return;
    }
}
