package iq8.m;
import android.os.Handler;
import java.lang.Runnable;
import android.os.Message;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class m extends Handler	// class@002716
{
    public final long a;
    public final Runnable b;
    public boolean c;

    public void m(long p0,Runnable p1){
       super();
       this.c = true;
       this.a = p0;
       this.b = p1;
    }
    public void handleMessage(Message p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "1")) {
          return;
       }
       if (this.c != null) {
          return;
       }
       this.b.run();
       this.sendEmptyMessageDelayed(0, this.a);
       return;
    }
}
