package androidx.recyclerview.widget.d$c;
import java.util.concurrent.Executor;
import java.lang.Object;
import android.os.Handler;
import android.os.Looper;
import java.lang.Runnable;

public class d$c implements Executor	// class@0008f8
{
    public final Handler b;

    public void d$c(){
       super();
       this.b = new Handler(Looper.getMainLooper());
    }
    public void execute(Runnable p0){
       this.b.post(p0);
    }
}
