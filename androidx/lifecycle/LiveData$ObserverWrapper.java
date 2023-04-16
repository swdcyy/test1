package androidx.lifecycle.LiveData$ObserverWrapper;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;

public abstract class LiveData$ObserverWrapper	// class@0007d9
{
    public boolean mActive;
    public int mLastVersion;
    public final Observer mObserver;
    public final LiveData this$0;

    public void LiveData$ObserverWrapper(LiveData p0,Observer p1){
       this.this$0 = p0;
       super();
       this.mLastVersion = -1;
       this.mObserver = p1;
    }
    public void activeStateChanged(boolean p0){
       if (p0 == this.mActive) {
          return;
       }
       this.mActive = p0;
       LiveData$ObserverWrapper tthis$0 = this.this$0;
       LiveData mActiveCount = tthis$0.mActiveCount;
       int i = 1;
       int i1 = (mActiveCount == null)? 1: 0;
       if (!p0) {
          i = -1;
       }
       tthis$0.mActiveCount = mActiveCount + i;
       if (i1 && p0) {
          tthis$0.onActive();
       }
       LiveData$ObserverWrapper tthis$01 = this.this$0;
       if (tthis$01.mActiveCount == null && this.mActive == null) {
          tthis$01.onInactive();
       }
       if (this.mActive != null) {
          this.this$0.dispatchingValue(this);
       }
       return;
    }
    public void detachObserver(){
    }
    public boolean isAttachedTo(LifecycleOwner p0){
       return false;
    }
    public abstract boolean shouldBeActive();
}
