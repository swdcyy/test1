package c.t.m.g.t$1;
import java.util.TimerTask;
import java.util.Timer;
import c.t.m.g.t$a;
import java.lang.String;
import java.lang.Runnable;
import c.t.m.g.bn;

public final class t$1 extends TimerTask	// class@000ca7
{
    public final Timer a;

    public void t$1(Timer p0){
       this.a = p0;
       super();
    }
    public void run(){
       bn.a("th_loc_task_t_consume", new t$a(null));
       this.a.cancel();
    }
}
