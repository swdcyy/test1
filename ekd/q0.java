package ekd.q0;
import android.os.Handler;
import android.os.Looper;
import android.content.Context;
import android.os.Message;
import com.yxcorp.utility.NetworkUtilsCached;

public class q0 extends Handler	// class@000d6f
{
    public final long a;
    public final Context b;

    public void q0(Looper p0,long p1,Context p2){
       this.a = p1;
       this.b = p2;
       super(p0);
    }
    public void handleMessage(Message p0){
       p0 = p0.what;
       if (p0 != null) {
          if (p0 == 1) {
             NetworkUtilsCached.o(this.b);
             this.sendEmptyMessage(0);
          }
       }else {
          this.sendEmptyMessageDelayed(1, this.a);
       }
       return;
    }
}
