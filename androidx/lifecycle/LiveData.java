package androidx.lifecycle.LiveData;
import java.lang.Object;
import y0.b;
import androidx.lifecycle.LiveData$1;
import java.lang.String;
import x0.a;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import androidx.lifecycle.LiveData$ObserverWrapper;
import androidx.lifecycle.Observer;
import y0.b$d;
import java.util.Map$Entry;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle$State;
import androidx.lifecycle.LiveData$LifecycleBoundObserver;
import java.lang.IllegalArgumentException;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LiveData$AlwaysActiveObserver;
import java.lang.Runnable;
import java.util.Iterator;
import y0.b$e;

public abstract class LiveData	// class@0007da
{
    public int mActiveCount;
    public Object mData;
    public final Object mDataLock;
    public boolean mDispatchInvalidated;
    public boolean mDispatchingValue;
    public b mObservers;
    public Object mPendingData;
    public final Runnable mPostValueRunnable;
    public int mVersion;
    public static final Object NOT_SET;

    static {
       LiveData.NOT_SET = new Object();
    }
    public void LiveData(){
       super();
       this.mDataLock = new Object();
       this.mObservers = new b();
       this.mActiveCount = 0;
       Object nOT_SET = LiveData.NOT_SET;
       this.mPendingData = nOT_SET;
       this.mPostValueRunnable = new LiveData$1(this);
       this.mData = nOT_SET;
       this.mVersion = -1;
    }
    public void LiveData(Object p0){
       super();
       this.mDataLock = new Object();
       this.mObservers = new b();
       this.mActiveCount = 0;
       this.mPendingData = LiveData.NOT_SET;
       this.mPostValueRunnable = new LiveData$1(this);
       this.mData = p0;
       this.mVersion = 0;
    }
    public static void assertMainThread(String p0){
       if (a.f().c()) {
          return;
       }
       throw new IllegalStateException("Cannot invoke "+p0+" on a background thread");
    }
    public final void considerNotify(LiveData$ObserverWrapper p0){
       if (p0.mActive == null) {
          return;
       }
       if (!p0.shouldBeActive()) {
          p0.activeStateChanged(false);
          return;
       }else {
          LiveData tmVersion = this.mVersion;
          if (p0.mLastVersion >= tmVersion) {
             return;
          }
          p0.mLastVersion = tmVersion;
          p0.mObserver.onChanged(this.mData);
          return;
       }
    }
    public void dispatchingValue(LiveData$ObserverWrapper p0){
       boolean b = true;
       if (this.mDispatchingValue != null) {
          this.mDispatchInvalidated = b;
          return;
       }else {
          this.mDispatchingValue = b;
          do {
             this.mDispatchInvalidated = false;
             if (p0 != null) {
                this.considerNotify(p0);
                p0 = null;
             }else {
                b$d uod = this.mObservers.l();
                while (uod.hasNext()) {
                   this.considerNotify(uod.next().getValue());
                   if (this.mDispatchInvalidated == null) {
                   }
                }
             }
          } while (this.mDispatchInvalidated == null);
          this.mDispatchingValue = false;
          return;
       }
    }
    public Object getValue(){
       LiveData tmData = this.mData;
       if (tmData != LiveData.NOT_SET) {
          return tmData;
       }
       return null;
    }
    public int getVersion(){
       return this.mVersion;
    }
    public boolean hasActiveObservers(){
       boolean b = (this.mActiveCount > null)? true: false;
       return b;
    }
    public boolean hasObservers(){
       boolean b = (this.mObservers.size() > 0)? true: false;
       return b;
    }
    public void observe(LifecycleOwner p0,Observer p1){
       LiveData.assertMainThread("observe");
       if (p0.getLifecycle().getCurrentState() == Lifecycle$State.DESTROYED) {
          return;
       }
       LiveData$LifecycleBoundObserver lifecycleBou = new LiveData$LifecycleBoundObserver(this, p0, p1);
       LiveData$ObserverWrapper observerWrap = this.mObservers.p(p1, lifecycleBou);
       if (observerWrap != null && !observerWrap.isAttachedTo(p0)) {
          throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
       }
       if (observerWrap != null) {
          return;
       }
       p0.getLifecycle().addObserver(lifecycleBou);
       return;
    }
    public void observeForever(Observer p0){
       LiveData.assertMainThread("observeForever");
       LiveData$AlwaysActiveObserver uAlwaysActiv = new LiveData$AlwaysActiveObserver(this, p0);
       LiveData$ObserverWrapper observerWrap = this.mObservers.p(p0, uAlwaysActiv);
       if (observerWrap instanceof LiveData$LifecycleBoundObserver) {
          throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
       }
       if (observerWrap != null) {
          return;
       }
       uAlwaysActiv.activeStateChanged(true);
       return;
    }
    public void onActive(){
    }
    public void onInactive(){
    }
    public void postValue(Object p0){
       LiveData tmDataLock = this.mDataLock;
       _monitor_enter(tmDataLock);
       int i = (this.mPendingData == LiveData.NOT_SET)? 1: 0;
       this.mPendingData = p0;
       _monitor_exit(tmDataLock);
       if (!i) {
          return;
       }else {
          a.f().d(this.mPostValueRunnable);
          return;
       }
    }
    public void removeObserver(Observer p0){
       LiveData.assertMainThread("removeObserver");
       LiveData$ObserverWrapper observerWrap = this.mObservers.q(p0);
       if (observerWrap == null) {
          return;
       }
       observerWrap.detachObserver();
       observerWrap.activeStateChanged(false);
       return;
    }
    public void removeObservers(LifecycleOwner p0){
       LiveData.assertMainThread("removeObservers");
       Iterator iterator = this.mObservers.iterator();
       Iterator iterator1 = iterator;
       while (iterator1.hasNext()) {
          Map$Entry uEntry = iterator1.next();
          if (uEntry.getValue().isAttachedTo(p0)) {
             this.removeObserver(uEntry.getKey());
          }
       }
       return;
    }
    public void setValue(Object p0){
       LiveData.assertMainThread("setValue");
       this.mVersion = this.mVersion + 1;
       this.mData = p0;
       this.dispatchingValue(null);
    }
}
