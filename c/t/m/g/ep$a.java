package c.t.m.g.ep$a;
import android.os.Handler;
import c.t.m.g.ep;
import android.os.Looper;
import android.os.Message;
import java.lang.Object;
import c.t.m.g.en;
import c.t.m.g.ex;
import java.lang.String;
import java.lang.Throwable;

public class ep$a extends Handler	// class@000c74
{
    public final ep a;

    public void ep$a(ep p0,Looper p1){
       this.a = p0;
       super(p1);
    }
    public final void a(Message p0){
       if (p0.what != 0x2716) {
       }else {
          this.removeCallbacksAndMessages(null);
          ep$a ta = this.a;
          ep.a(ta, ep.b(ta));
          this.a.b.sendEmptyMessageDelayed(0x2716, 0xea60);
          ep.c(this.a);
          en.a().d();
       }
       return;
    }
    public void handleMessage(Message p0){
       this.a(p0);
       return;
    }
}
