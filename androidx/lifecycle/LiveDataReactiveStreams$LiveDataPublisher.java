package androidx.lifecycle.LiveDataReactiveStreams$LiveDataPublisher;
import cxd.b;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import java.lang.Object;
import cxd.c;
import androidx.lifecycle.LiveDataReactiveStreams$LiveDataPublisher$LiveDataSubscription;
import cxd.d;

public final class LiveDataReactiveStreams$LiveDataPublisher implements b	// class@0007e0
{
    public final LifecycleOwner mLifecycle;
    public final LiveData mLiveData;

    public void LiveDataReactiveStreams$LiveDataPublisher(LifecycleOwner p0,LiveData p1){
       super();
       this.mLifecycle = p0;
       this.mLiveData = p1;
    }
    public void subscribe(c p0){
       p0.onSubscribe(new LiveDataReactiveStreams$LiveDataPublisher$LiveDataSubscription(p0, this.mLifecycle, this.mLiveData));
    }
}
