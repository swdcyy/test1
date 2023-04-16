package androidx.work.Worker;
import androidx.work.ListenableWorker;
import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.ListenableWorker$a;
import xk.d;
import w3.a;
import java.util.concurrent.Executor;
import androidx.work.Worker$a;
import java.lang.Runnable;

public abstract class Worker extends ListenableWorker	// class@000a55
{
    public a mFuture;

    public void Worker(Context p0,WorkerParameters p1){
       super(p0, p1);
    }
    public abstract ListenableWorker$a doWork();
    public final d startWork(){
       this.mFuture = a.N();
       this.getBackgroundExecutor().execute(new Worker$a(this));
       return this.mFuture;
    }
}
