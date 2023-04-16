package androidx.lifecycle.LiveData$1;
import java.lang.Runnable;
import androidx.lifecycle.LiveData;
import java.lang.Object;

public class LiveData$1 implements Runnable	// class@0007d6
{
    public final LiveData this$0;

    public void LiveData$1(LiveData p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       LiveData mDataLock = this.this$0.mDataLock;
       _monitor_enter(mDataLock);
       this.this$0.mPendingData = LiveData.NOT_SET;
       _monitor_exit(mDataLock);
       this.this$0.setValue(this.this$0.mPendingData);
    }
}
