package androidx.work.CoroutineWorker$a;
import java.lang.Runnable;
import androidx.work.CoroutineWorker;
import java.lang.Object;
import w3.a;
import androidx.work.impl.utils.futures.AbstractFuture;
import ftd.w;
import ftd.z1;
import java.util.concurrent.CancellationException;
import ftd.z1$a;

public final class CoroutineWorker$a implements Runnable	// class@000a46
{
    public final CoroutineWorker b;

    public void CoroutineWorker$a(CoroutineWorker p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (this.b.d().isCancelled()) {
          z1$a.b(this.b.f(), null, 1, null);
       }
       return;
    }
}
