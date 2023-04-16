package c.t.m.g.dn$1;
import java.lang.Runnable;
import c.t.m.g.dn;
import java.lang.Object;
import android.os.Handler;
import android.os.HandlerThread;

public class dn$1 implements Runnable	// class@000c4b
{
    public final dn a;

    public void dn$1(dn p0){
       this.a = p0;
       super();
    }
    public void run(){
       if (dn.a(this.a)) {
          dn.a(this.a, false);
          dn.b(this.a).removeCallbacksAndMessages(null);
          dn.c(this.a).quit();
       }
       return;
    }
}
