package h0d.c$a;
import java.lang.Runnable;
import h0d.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Process;

public class c$a implements Runnable	// class@00171e
{
    public final int b;
    public final Runnable c;
    public final c d;

    public void c$a(c p0,Runnable p1,int p2){
       this.d = p0;
       super();
       this.c = p1;
       this.b = p2;
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, c$a.class, "1")) {
          return;
       }
       Process.setThreadPriority(this.b);
       this.c.run();
       return;
    }
}
