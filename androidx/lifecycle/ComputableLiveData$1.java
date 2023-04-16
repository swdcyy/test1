package androidx.lifecycle.ComputableLiveData$1;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ComputableLiveData;
import java.lang.Runnable;
import java.util.concurrent.Executor;

public class ComputableLiveData$1 extends LiveData	// class@0007bc
{
    public final ComputableLiveData this$0;

    public void ComputableLiveData$1(ComputableLiveData p0){
       this.this$0 = p0;
       super();
    }
    public void onActive(){
       ComputableLiveData$1 tthis$0 = this.this$0;
       tthis$0.mExecutor.execute(tthis$0.mRefreshRunnable);
    }
}
