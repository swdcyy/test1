package c.t.m.g.bo;
import android.os.HandlerThread;
import android.os.Handler;
import java.util.Timer;
import java.lang.String;
import c.t.m.g.bo$1;
import java.util.TimerTask;
import c.t.m.g.bp;
import c.t.m.g.bt;
import java.lang.Throwable;

public class bo	// class@000bee
{

    public static void a(HandlerThread p0,Handler p1,long p2,boolean p3){
       if (p0 == null && p1 == null) {
          return;
       }
       if (p2 - null <= 0) {
          bo.b(p0, p1, p3);
       }else {
          Timer timer = new Timer("th_loc_tmp");
          timer.schedule(new bo$1(p0, p1, p3, timer), p2);
       }
       return;
    }
    public static void a(HandlerThread p0,Handler p1,boolean p2){
       bo.b(p0, p1, p2);
    }
    public static void b(HandlerThread p0,Handler p1,boolean p2){
       if (p2) {
          bp.b(p1);
       }
       if (p0 != null) {
          p0.quitSafely();
       }
    label_001b :
       return;
    }
}
