package androidx.lifecycle.LiveDataReactiveStreams$PublisherLiveData;
import androidx.lifecycle.LiveData;
import cxd.b;
import java.util.concurrent.atomic.AtomicReference;
import androidx.lifecycle.LiveDataReactiveStreams$PublisherLiveData$LiveDataSubscriber;
import java.lang.Object;
import cxd.c;

public class LiveDataReactiveStreams$PublisherLiveData extends LiveData	// class@0007e3
{
    public final b mPublisher;
    public final AtomicReference mSubscriber;

    public void LiveDataReactiveStreams$PublisherLiveData(b p0){
       super();
       this.mPublisher = p0;
       this.mSubscriber = new AtomicReference();
    }
    public void onActive(){
       super.onActive();
       LiveDataReactiveStreams$PublisherLiveData$LiveDataSubscriber publisherLiv = new LiveDataReactiveStreams$PublisherLiveData$LiveDataSubscriber(this);
       this.mSubscriber.set(publisherLiv);
       this.mPublisher.subscribe(publisherLiv);
    }
    public void onInactive(){
       super.onInactive();
       LiveDataReactiveStreams$PublisherLiveData$LiveDataSubscriber andSet = this.mSubscriber.getAndSet(null);
       if (andSet != null) {
          andSet.cancelSubscription();
       }
       return;
    }
}
