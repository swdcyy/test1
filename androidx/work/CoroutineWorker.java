package androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import android.content.Context;
import androidx.work.WorkerParameters;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ftd.z1;
import ftd.w;
import ftd.c2;
import w3.a;
import androidx.work.CoroutineWorker$a;
import x3.a;
import v3.i;
import java.lang.Runnable;
import java.util.concurrent.Executor;
import androidx.work.impl.utils.futures.AbstractFuture;
import kotlinx.coroutines.CoroutineDispatcher;
import ftd.z0;
import asd.c;
import xk.d;
import kotlin.coroutines.CoroutineContext;
import asd.a;
import ftd.k0;
import ftd.l0;
import androidx.work.CoroutineWorker$startWork$1;
import kotlinx.coroutines.CoroutineStart;
import msd.p;
import kotlinx.coroutines.a;

public abstract class CoroutineWorker extends ListenableWorker	// class@000a48
{
    public final w a;
    public final a b;
    public final CoroutineDispatcher c;

    public void CoroutineWorker(Context p0,WorkerParameters p1){
       a.q(p0, "appContext");
       a.q(p1, "params");
       super(p0, p1);
       this.a = c2.d(null, 1, null);
       a uoa = a.N();
       a.h(uoa, "SettableFuture.create\(\)");
       this.b = uoa;
       a taskExecutor = this.getTaskExecutor();
       a.h(taskExecutor, "taskExecutor");
       uoa.u(new CoroutineWorker$a(this), taskExecutor.b());
       this.c = z0.e();
    }
    public abstract Object a(c p0);
    public CoroutineDispatcher b(){
       return this.c;
    }
    public final a d(){
       return this.b;
    }
    public final w f(){
       return this.a;
    }
    public final void onStopped(){
       super.onStopped();
       this.b.cancel(false);
    }
    public final d startWork(){
       a.f(l0.a(this.b().plus(this.a)), null, null, new CoroutineWorker$startWork$1(this, null), 3, null);
       return this.b;
    }
}
