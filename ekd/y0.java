package ekd.y0;
import android.os.Handler;
import java.lang.Runnable;
import android.os.Looper;
import android.os.Message;

public class y0 extends Handler	// class@000d87
{
    public final long a;
    public final Runnable b;
    public boolean c;

    public void y0(long p0,Runnable p1){
       super();
       this.c = true;
       this.a = p0;
       this.b = p1;
    }
    public void y0(Looper p0,long p1,Runnable p2){
       super(p0);
       this.c = true;
       this.a = p1;
       this.b = p2;
    }
    public void a(){
       this.b(this.a);
    }
    public void b(long p0){
       if (this.c == null) {
          return;
       }
       this.c = false;
       this.sendEmptyMessageDelayed(false, p0);
       return;
    }
    public boolean c(){
       return (this.c ^ 0x01);
    }
    public void d(){
       if (this.c == null) {
          return;
       }
       this.c = false;
       this.sendEmptyMessage(false);
       return;
    }
    public void e(){
       this.c = true;
       this.removeMessages(0);
    }
    public void handleMessage(Message p0){
       if (this.c != null) {
          return;
       }
       this.b.run();
       this.sendEmptyMessageDelayed(0, this.a);
       return;
    }
}
