package c.t.m.g.bo$1;
import java.util.TimerTask;
import android.os.HandlerThread;
import android.os.Handler;
import java.util.Timer;
import c.t.m.g.bo;
import c.t.m.g.bt;
import java.lang.String;
import java.lang.Throwable;

public final class bo$1 extends TimerTask	// class@000bed
{
    public final HandlerThread a;
    public final Handler b;
    public final boolean c;
    public final Timer d;

    public void bo$1(HandlerThread p0,Handler p1,boolean p2,Timer p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void run(){
       bo.a(this.a, this.b, this.c);
       bo$1 td = this.d;
       if (td != null) {
          td.cancel();
       }
    label_001f :
       return;
    }
}
