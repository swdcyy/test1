package androidx.lifecycle.LiveDataReactiveStreams$PublisherLiveData$LiveDataSubscriber;
import cxd.c;
import java.util.concurrent.atomic.AtomicReference;
import androidx.lifecycle.LiveDataReactiveStreams$PublisherLiveData;
import java.lang.Object;
import cxd.d;
import java.lang.Throwable;
import x0.a;
import androidx.lifecycle.LiveDataReactiveStreams$PublisherLiveData$LiveDataSubscriber$1;
import java.lang.Runnable;
import x0.c;
import androidx.lifecycle.LiveData;

public final class LiveDataReactiveStreams$PublisherLiveData$LiveDataSubscriber extends AtomicReference implements c	// class@0007e2
{
    public final LiveDataReactiveStreams$PublisherLiveData this$0;

    public void LiveDataReactiveStreams$PublisherLiveData$LiveDataSubscriber(LiveDataReactiveStreams$PublisherLiveData p0){
       this.this$0 = p0;
       super();
    }
    public void cancelSubscription(){
       d uod = this.get();
       if (uod != null) {
          uod.cancel();
       }
       return;
    }
    public void onComplete(){
       this.this$0.mSubscriber.compareAndSet(this, null);
    }
    public void onError(Throwable p0){
       this.this$0.mSubscriber.compareAndSet(this, null);
       a.f().b(new LiveDataReactiveStreams$PublisherLiveData$LiveDataSubscriber$1(this, p0));
    }
    public void onNext(Object p0){
       this.this$0.postValue(p0);
    }
    public void onSubscribe(d p0){
       if (this.compareAndSet(null, p0)) {
          p0.request(Long.MAX_VALUE);
       }else {
          p0.cancel();
       }
       return;
    }
}
