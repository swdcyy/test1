package xq.d$b;
import java.lang.Runnable;
import xq.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Process;

public class d$b implements Runnable	// class@00281b
{
    public final int b;
    public final Runnable c;
    public final d d;

    public void d$b(d p0,Runnable p1,int p2){
       this.d = p0;
       super();
       this.c = p1;
       this.b = p2;
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, d$b.class, "1")) {
          return;
       }
       Process.setThreadPriority(this.b);
       this.c.run();
       return;
    }
}
