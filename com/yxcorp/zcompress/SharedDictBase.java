package com.yxcorp.zcompress.SharedDictBase;
import java.io.Closeable;
import java.lang.Class;
import java.lang.String;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.lang.Object;
import java.lang.IllegalStateException;

public abstract class SharedDictBase implements Closeable	// class@000a03
{
    public int sharedLock;
    public static final AtomicIntegerFieldUpdater SHARED_LOCK_UPDATER;

    static {
       SharedDictBase.SHARED_LOCK_UPDATER = AtomicIntegerFieldUpdater.newUpdater(SharedDictBase.class, "sharedLock");
    }
    public void SharedDictBase(){
       super();
    }
    public void acquireSharedLock(){
       while (true) {
          SharedDictBase tsharedLock = this.sharedLock;
          if (tsharedLock < null) {
             throw new IllegalStateException("ZstdDictCompress is closed");
          }
          if (tsharedLock == Integer.MAX_VALUE) {
             throw new IllegalStateException("ZstdDictCompress shared lock overflow");
          }
          int i = tsharedLock + 1;
          if (SharedDictBase.SHARED_LOCK_UPDATER.compareAndSet(this, tsharedLock, i)) {
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
       }else if(SharedDictBase.SHARED_LOCK_UPDATER.compareAndSet(this, 0, i)){
          this.doClose();
          _monitor_exit(this);
          return;
       }else {
          throw new IllegalStateException("Attempt to close ZstdDictCompress while it\'s in use");
       }
    }
    public abstract void doClose();
    public void finalize(){
       this.close();
    }
    public void releaseSharedLock(){
       while (true) {
          SharedDictBase tsharedLock = this.sharedLock;
          if (tsharedLock < null) {
             throw new IllegalStateException("ZstdDictCompress is closed");
          }
          if (tsharedLock == null) {
             throw new IllegalStateException("ZstdDictCompress shared lock underflow");
          }
          int i = tsharedLock - 1;
          if (SharedDictBase.SHARED_LOCK_UPDATER.compareAndSet(this, tsharedLock, i)) {
             break ;
          }
       }
       return;
    }
    public void storeFence(){
       this.sharedLock = 0;
    }
}
