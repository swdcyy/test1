package ekd.t$a;
import android.os.Handler;
import ekd.t;
import android.os.Looper;
import android.os.Message;

public class t$a extends Handler	// class@000d79
{
    public final t a;

    public void t$a(t p0,Looper p1){
       this.a = p0;
       super(p1);
    }
    public void handleMessage(Message p0){
       t$a ta = this.a;
       _monitor_enter(ta);
       t$a ta1 = this.a;
       if (ta1.d != null) {
          _monitor_exit(ta);
          return;
       }else {
          t c = ta1.c;
          if (c == null) {
             ta1.e = false;
             ta1.d();
          }else {
             ta1.e(c);
             ta1 = this.a;
             ta1.c = ta1.c - 1;
             this.sendMessageDelayed(this.obtainMessage(1), (long)this.a.a);
          }
          _monitor_exit(ta);
          return;
       }
    }
}
