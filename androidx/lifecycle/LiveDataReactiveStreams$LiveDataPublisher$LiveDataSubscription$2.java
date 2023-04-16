package androidx.lifecycle.LiveDataReactiveStreams$LiveDataPublisher$LiveDataSubscription$2;
import java.lang.Runnable;
import androidx.lifecycle.LiveDataReactiveStreams$LiveDataPublisher$LiveDataSubscription;
import java.lang.Object;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;

public class LiveDataReactiveStreams$LiveDataPublisher$LiveDataSubscription$2 implements Runnable	// class@0007de
{
    public final LiveDataReactiveStreams$LiveDataPublisher$LiveDataSubscription this$0;

    public void LiveDataReactiveStreams$LiveDataPublisher$LiveDataSubscription$2(LiveDataReactiveStreams$LiveDataPublisher$LiveDataSubscription p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       LiveDataReactiveStreams$LiveDataPublisher$LiveDataSubscription$2 tthis$0 = this.this$0;
       if (tthis$0.mObserving != null) {
          tthis$0.mLiveData.removeObserver(tthis$0);
          this.this$0.mObserving = false;
       }
       this.this$0.mLatest = null;
       return;
    }
}
