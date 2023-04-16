package androidx.lifecycle.ComputableLiveData$3;
import java.lang.Runnable;
import androidx.lifecycle.ComputableLiveData;
import java.lang.Object;
import androidx.lifecycle.LiveData;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.Executor;

public class ComputableLiveData$3 implements Runnable	// class@0007be
{
    public final ComputableLiveData this$0;

    public void ComputableLiveData$3(ComputableLiveData p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       boolean b = this.this$0.mLiveData.hasActiveObservers();
       if (this.this$0.mInvalid.compareAndSet(false, true) && b) {
          ComputableLiveData$3 tthis$0 = this.this$0;
          tthis$0.mExecutor.execute(tthis$0.mRefreshRunnable);
       }
       return;
    }
}
