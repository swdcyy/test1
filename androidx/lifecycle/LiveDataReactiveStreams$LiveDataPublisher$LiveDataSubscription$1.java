package androidx.lifecycle.LiveDataReactiveStreams$LiveDataPublisher$LiveDataSubscription$1;
import java.lang.Runnable;
import androidx.lifecycle.LiveDataReactiveStreams$LiveDataPublisher$LiveDataSubscription;
import java.lang.Object;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.lang.Throwable;
import cxd.c;
import androidx.lifecycle.LifecycleOwner;

public class LiveDataReactiveStreams$LiveDataPublisher$LiveDataSubscription$1 implements Runnable	// class@0007dd
{
    public final LiveDataReactiveStreams$LiveDataPublisher$LiveDataSubscription this$0;
    public final long val$n;

    public void LiveDataReactiveStreams$LiveDataPublisher$LiveDataSubscription$1(LiveDataReactiveStreams$LiveDataPublisher$LiveDataSubscription p0,long p1){
       this.this$0 = p0;
       this.val$n = p1;
       super();
    }
    public void run(){
       if (this.this$0.mCanceled != null) {
          return;
       }
       LiveDataReactiveStreams$LiveDataPublisher$LiveDataSubscription$1 tval$n = this.val$n;
       if (tval$n - null <= 0) {
          this.this$0.mCanceled = true;
          tval$n = this.this$0;
          if (tval$n.mObserving != null) {
             tval$n.mLiveData.removeObserver(tval$n);
             this.this$0.mObserving = false;
          }
          tval$n = this.this$0;
          tval$n.mLatest = null;
          tval$n.mSubscriber.onError(new IllegalArgumentException("Non-positive request"));
          return;
       }else {
          LiveDataReactiveStreams$LiveDataPublisher$LiveDataSubscription$1 tthis$0 = this.this$0;
          LiveDataReactiveStreams$LiveDataPublisher$LiveDataSubscription mRequested = tthis$0.mRequested;
          long l = ((mRequested + tval$n) - mRequested >= 0)? mRequested + tval$n: Long.MAX_VALUE;
          tthis$0.mRequested = l;
          if (tthis$0.mObserving == null) {
             tthis$0.mObserving = true;
             tthis$0.mLiveData.observe(tthis$0.mLifecycle, tthis$0);
          }else {
             LiveDataReactiveStreams$LiveDataPublisher$LiveDataSubscription mLatest = tthis$0.mLatest;
             if (mLatest != null) {
                tthis$0.onChanged(mLatest);
                this.this$0.mLatest = null;
             }
          }
          return;
       }
    }
}
