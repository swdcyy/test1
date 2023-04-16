package androidx.lifecycle.ComputableLiveData;
import java.util.concurrent.Executor;
import x0.a;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import androidx.lifecycle.ComputableLiveData$2;
import androidx.lifecycle.ComputableLiveData$3;
import androidx.lifecycle.ComputableLiveData$1;
import androidx.lifecycle.LiveData;
import java.lang.Runnable;
import x0.c;

public abstract class ComputableLiveData	// class@0007bf
{
    public final AtomicBoolean mComputing;
    public final Executor mExecutor;
    public final AtomicBoolean mInvalid;
    public final Runnable mInvalidationRunnable;
    public final LiveData mLiveData;
    public final Runnable mRefreshRunnable;

    public void ComputableLiveData(){
       super(a.e());
    }
    public void ComputableLiveData(Executor p0){
       super();
       this.mInvalid = new AtomicBoolean(true);
       this.mComputing = new AtomicBoolean(false);
       this.mRefreshRunnable = new ComputableLiveData$2(this);
       this.mInvalidationRunnable = new ComputableLiveData$3(this);
       this.mExecutor = p0;
       this.mLiveData = new ComputableLiveData$1(this);
    }
    public abstract Object compute();
    public LiveData getLiveData(){
       return this.mLiveData;
    }
    public void invalidate(){
       a.f().b(this.mInvalidationRunnable);
    }
}
