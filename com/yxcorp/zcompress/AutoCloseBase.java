package com.yxcorp.zcompress.AutoCloseBase;
import java.io.Closeable;
import java.lang.Class;
import java.lang.String;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.lang.Object;
import java.lang.IllegalStateException;

public abstract class AutoCloseBase implements Closeable	// class@000a00
{
    public boolean finalize;
    public int sharedLock;
    public static final AtomicIntegerFieldUpdater SHARED_LOCK_UPDATER;

    static {
       AutoCloseBase.SHARED_LOCK_UPDATER = AtomicIntegerFieldUpdater.newUpdater(AutoCloseBase.class, "sharedLock");
    }
    public void AutoCloseBase(){
       super();
       this.finalize = true;
    }
    public void acquireSharedLock(){
       while (true) {
          AutoCloseBase tsharedLock = this.sharedLock;
          if (tsharedLock < null) {
             throw new IllegalStateException("Closed");
          }
          if (tsharedLock == Integer.MAX_VALUE) {
             throw new IllegalStateException("Shared lock overflow");
          }
          int i = tsharedLock + 1;
          if (AutoCloseBase.SHARED_LOCK_UPDATER.compareAndSet(this, tsharedLock, i)) {
             break ;
          }
       }
       return;
    }
    public void close(){
       _monitor_enter(this);
       int i = -1;
       if (this.sharedLock == i) {
          _monitor_exit(this);
          return;
       }else if(AutoCloseBase.SHARED_LOCK_UPDATER.compareAndSet(this, 0, i)){
          this.doClose();
          _monitor_exit(this);
          return;
       }else {
          throw new IllegalStateException("Attempt to close while in use");
       }
    }
    public abstract void doClose();
    public void finalize(){
       if (this.finalize != null) {
          this.close();
       }
       return;
    }
    public void releaseSharedLock(){
       while (true) {
          AutoCloseBase tsharedLock = this.sharedLock;
          if (tsharedLock < null) {
             throw new IllegalStateException("Closed");
          }
          if (tsharedLock == null) {
             throw new IllegalStateException("Shared lock underflow");
          }
          int i = tsharedLock - 1;
          if (AutoCloseBase.SHARED_LOCK_UPDATER.compareAndSet(this, tsharedLock, i)) {
             break ;
          }
       }
       return;
    }
    public void setFinalize(boolean p0){
       this.finalize = p0;
    }
    public void storeFence(){
       this.sharedLock = 0;
    }
}
