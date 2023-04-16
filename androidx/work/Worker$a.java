package androidx.work.Worker$a;
import java.lang.Runnable;
import androidx.work.Worker;
import java.lang.Object;
import androidx.work.ListenableWorker$a;
import w3.a;
import java.lang.Throwable;

public class Worker$a implements Runnable	// class@000a54
{
    public final Worker b;

    public void Worker$a(Worker p0){
       this.b = p0;
       super();
    }
    public void run(){
       this.b.mFuture.J(this.b.doWork());
       return;
    }
}
