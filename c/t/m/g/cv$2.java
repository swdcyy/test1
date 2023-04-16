package c.t.m.g.cv$2;
import java.lang.Runnable;
import c.t.m.g.cv;
import java.lang.Object;
import c.t.m.g.cv$b;
import c.t.m.g.ed;
import java.lang.String;
import c.t.m.g.ce;
import android.os.HandlerThread;
import android.os.Looper;
import java.lang.Throwable;

public class cv$2 implements Runnable	// class@000c26
{
    public final cv a;

    public void cv$2(cv p0){
       this.a = p0;
       super();
    }
    public void run(){
       cv.a(this.a, cv$b.b);
       if (ed.a) {
          ed.b("TxLocationManagerImpl", "daemon is running");
       }
       cv$2 ta = this.a;
       cv.a(ta, cv.a(ta).j().getLooper());
       return;
    }
}
