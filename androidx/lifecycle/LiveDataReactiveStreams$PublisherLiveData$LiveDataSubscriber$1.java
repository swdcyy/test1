package androidx.lifecycle.LiveDataReactiveStreams$PublisherLiveData$LiveDataSubscriber$1;
import java.lang.Runnable;
import androidx.lifecycle.LiveDataReactiveStreams$PublisherLiveData$LiveDataSubscriber;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.RuntimeException;
import java.lang.String;

public class LiveDataReactiveStreams$PublisherLiveData$LiveDataSubscriber$1 implements Runnable	// class@0007e1
{
    public final LiveDataReactiveStreams$PublisherLiveData$LiveDataSubscriber this$1;
    public final Throwable val$ex;

    public void LiveDataReactiveStreams$PublisherLiveData$LiveDataSubscriber$1(LiveDataReactiveStreams$PublisherLiveData$LiveDataSubscriber p0,Throwable p1){
       this.this$1 = p0;
       this.val$ex = p1;
       super();
    }
    public void run(){
       throw new RuntimeException("LiveData does not handle errors. Errors from publishers should be handled upstream and propagated as state", this.val$ex);
    }
}
