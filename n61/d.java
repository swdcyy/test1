package n61.d;
import java.lang.Runnable;
import java.lang.Object;
import android.os.Handler;
import android.os.Looper;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class d	// class@0032b3
{
    public final Runnable a;
    public final Handler b;
    public final Object c;
    public boolean d;

    public void d(Runnable p0){
       super();
       this.c = new Object();
       this.d = false;
       this.b = new Handler(Looper.getMainLooper());
       this.a = p0;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       d tc = this.c;
       _monitor_enter(tc);
       this.d = false;
       _monitor_exit(tc);
       this.b.removeCallbacksAndMessages(this);
       return;
    }
}
