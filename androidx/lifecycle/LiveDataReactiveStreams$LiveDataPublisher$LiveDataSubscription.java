package androidx.lifecycle.LiveDataReactiveStreams$LiveDataPublisher$LiveDataSubscription;
import cxd.d;
import androidx.lifecycle.Observer;
import cxd.c;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import java.lang.Object;
import x0.a;
import androidx.lifecycle.LiveDataReactiveStreams$LiveDataPublisher$LiveDataSubscription$2;
import java.lang.Runnable;
import x0.c;
import androidx.lifecycle.LiveDataReactiveStreams$LiveDataPublisher$LiveDataSubscription$1;

public final class LiveDataReactiveStreams$LiveDataPublisher$LiveDataSubscription implements d, Observer	// class@0007df
{
    public boolean mCanceled;
    public Object mLatest;
    public final LifecycleOwner mLifecycle;
    public final LiveData mLiveData;
    public boolean mObserving;
    public long mRequested;
    public final c mSubscriber;

    public void LiveDataReactiveStreams$LiveDataPublisher$LiveDataSubscription(c p0,LifecycleOwner p1,LiveData p2){
       super();
       this.mSubscriber = p0;
       this.mLifecycle = p1;
       this.mLiveData = p2;
    }
    public void cancel(){
       if (this.mCanceled != null) {
          return;
       }
       this.mCanceled = true;
       a.f().b(new LiveDataReactiveStreams$LiveDataPublisher$LiveDataSubscription$2(this));
       return;
    }
    public void onChanged(Object p0){
       if (this.mCanceled != null) {
          return;
       }
       if (this.mRequested > 0) {
          this.mLatest = null;
          this.mSubscriber.onNext(p0);
          LiveDataReactiveStreams$LiveDataPublisher$LiveDataSubscription tmRequested = this.mRequested;
          if (tmRequested - Long.MAX_VALUE) {
             this.mRequested = tmRequested - 1;
          }
       }else {
          this.mLatest = p0;
       }
       return;
    }
    public void request(long p0){
       if (this.mCanceled != null) {
          return;
       }
       a.f().b(new LiveDataReactiveStreams$LiveDataPublisher$LiveDataSubscription$1(this, p0));
       return;
    }
}
