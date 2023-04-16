package c.t.m.g.ew$1;
import java.lang.Runnable;
import c.t.m.g.ew;
import java.lang.Object;
import android.os.Handler;
import android.os.HandlerThread;

public class ew$1 implements Runnable	// class@000c7e
{
    public final ew a;

    public void ew$1(ew p0){
       this.a = p0;
       super();
    }
    public void run(){
       if (ew.a(this.a)) {
          ew.a(this.a, false);
          ew.b(this.a).removeCallbacksAndMessages(null);
          ew.c(this.a).quit();
       }
       return;
    }
}
