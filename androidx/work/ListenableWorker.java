package androidx.work.ListenableWorker;
import android.content.Context;
import androidx.work.WorkerParameters;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.util.concurrent.Executor;
import java.util.UUID;
import androidx.work.a;
import android.net.Network;
import java.util.Set;
import x3.a;
import java.util.List;
import k3.n;
import k3.d;
import xk.d;
import k3.e;
import k3.j;

public abstract class ListenableWorker	// class@000a4f
{
    public Context mAppContext;
    public boolean mRunInForeground;
    public boolean mStopped;
    public boolean mUsed;
    public WorkerParameters mWorkerParams;

    public void ListenableWorker(Context p0,WorkerParameters p1){
       super();
       if (p0 == null) {
          throw new IllegalArgumentException("Application Context is null");
       }
       if (p1 == null) {
          throw new IllegalArgumentException("WorkerParameters is null");
       }
       this.mAppContext = p0;
       this.mWorkerParams = p1;
       return;
    }
    public final Context getApplicationContext(){
       return this.mAppContext;
    }
    public Executor getBackgroundExecutor(){
       return this.mWorkerParams.a();
    }
    public final UUID getId(){
       return this.mWorkerParams.c();
    }
    public final a getInputData(){
       return this.mWorkerParams.d();
    }
    public final Network getNetwork(){
       return this.mWorkerParams.e();
    }
    public final int getRunAttemptCount(){
       return this.mWorkerParams.g();
    }
    public final Set getTags(){
       return this.mWorkerParams.h();
    }
    public a getTaskExecutor(){
       return this.mWorkerParams.i();
    }
    public final List getTriggeredContentAuthorities(){
       return this.mWorkerParams.j();
    }
    public final List getTriggeredContentUris(){
       return this.mWorkerParams.k();
    }
    public n getWorkerFactory(){
       return this.mWorkerParams.l();
    }
    public boolean isRunInForeground(){
       return this.mRunInForeground;
    }
    public final boolean isStopped(){
       return this.mStopped;
    }
    public final boolean isUsed(){
       return this.mUsed;
    }
    public void onStopped(){
    }
    public final d setForegroundAsync(d p0){
       this.mRunInForeground = true;
       return this.mWorkerParams.b().a(this.getApplicationContext(), this.getId(), p0);
    }
    public final d setProgressAsync(a p0){
       return this.mWorkerParams.f().a(this.getApplicationContext(), this.getId(), p0);
    }
    public final void setUsed(){
       this.mUsed = true;
    }
    public abstract d startWork();
    public final void stop(){
       this.mStopped = true;
       this.onStopped();
    }
}
