package androidx.core.content.ContextCompat$b;
import java.util.concurrent.Executor;
import android.os.Handler;
import java.lang.Object;
import java.lang.Runnable;
import java.util.concurrent.RejectedExecutionException;
import java.lang.StringBuilder;
import java.lang.String;

public class ContextCompat$b implements Executor	// class@00070a
{
    public final Handler b;

    public void ContextCompat$b(Handler p0){
       super();
       this.b = p0;
    }
    public void execute(Runnable p0){
       if (this.b.post(p0)) {
          return;
       }
       throw new RejectedExecutionException(this.b+" is shutting down");
    }
}
