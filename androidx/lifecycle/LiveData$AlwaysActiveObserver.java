package androidx.lifecycle.LiveData$AlwaysActiveObserver;
import androidx.lifecycle.LiveData$ObserverWrapper;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;

public class LiveData$AlwaysActiveObserver extends LiveData$ObserverWrapper	// class@0007d7
{
    public final LiveData this$0;

    public void LiveData$AlwaysActiveObserver(LiveData p0,Observer p1){
       this.this$0 = p0;
       super(p0, p1);
    }
    public boolean shouldBeActive(){
       return true;
    }
}
