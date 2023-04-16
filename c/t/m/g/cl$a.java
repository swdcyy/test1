package c.t.m.g.cl$a;
import android.os.Handler;
import c.t.m.g.cl;
import android.os.Looper;
import android.os.Message;
import java.lang.String;
import android.content.Context;
import android.content.Intent;

public final class cl$a extends Handler	// class@000c13
{
    public final cl a;

    public void cl$a(cl p0,Looper p1){
       this.a = p0;
       super(p1);
    }
    public void handleMessage(Message p0){
       p0 = p0.what;
       boolean b = true;
       if (p0 != b) {
          if (p0 == 2) {
             cl.b("handleMessage: mock alarm --> wakeup");
             cl.b(this.a).sendBroadcast(cl.a(this.a));
          }
       }else {
          cl.a(this.a, b);
       }
       return;
    }
}
