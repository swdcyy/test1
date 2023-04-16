package awd.d;
import android.os.Handler;
import org.greenrobot.eventbus.a;
import android.os.Looper;
import awd.g;
import android.os.Message;
import android.os.SystemClock;
import awd.f;
import org.greenrobot.eventbus.EventBusException;
import java.lang.String;

public final class d extends Handler	// class@000293
{
    public final g a;
    public final int b;
    public final a c;
    public boolean d;

    public void d(a p0,Looper p1,int p2){
       super(p1);
       this.c = p0;
       this.b = p2;
       this.a = new g();
    }
    public void handleMessage(Message p0){
       boolean b = false;
       long l = SystemClock.uptimeMillis();
       while (true) {
          f uof = this.a.b();
          if (uof == null) {
             _monitor_enter(this);
             uof = this.a.b();
             if (uof == null) {
                this.d = b;
                _monitor_exit(this);
                this.d = b;
                return;
             }else {
                _monitor_exit(this);
             }
          }
          this.c.g(uof);
          long l1 = SystemClock.uptimeMillis() - l;
          if (l1 - (long)this.b >= 0) {
             if (this.sendMessage(this.obtainMessage())) {
                this.d = true;
                return;
             }else {
                break ;
             }
          }
       }
       throw new EventBusException("Could not send handler message");
    }
}
