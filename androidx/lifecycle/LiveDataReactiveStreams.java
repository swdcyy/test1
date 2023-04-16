package androidx.lifecycle.LiveDataReactiveStreams;
import java.lang.Object;
import cxd.b;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataReactiveStreams$PublisherLiveData;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveDataReactiveStreams$LiveDataPublisher;

public final class LiveDataReactiveStreams	// class@0007e4
{

    public void LiveDataReactiveStreams(){
       super();
    }
    public static LiveData fromPublisher(b p0){
       return new LiveDataReactiveStreams$PublisherLiveData(p0);
    }
    public static b toPublisher(LifecycleOwner p0,LiveData p1){
       return new LiveDataReactiveStreams$LiveDataPublisher(p0, p1);
    }
}
