package la.b;
import android.os.Handler;
import com.contrarywind.view.WheelView;
import android.os.Message;
import ma.a;
import java.lang.Runnable;
import android.view.View;
import com.contrarywind.view.WheelView$ACTION;

public final class b extends Handler	// class@00253b
{
    public final WheelView a;

    public void b(WheelView p0){
       super();
       this.a = p0;
    }
    public final void handleMessage(Message p0){
       p0 = p0.what;
       if (p0 != 1000) {
          if (p0 != 2000) {
             if (p0 == 3000) {
                b ta = this.a;
                if (ta.f != null) {
                   ta.postDelayed(new a(ta), 200);
                }
             }
          }else {
             this.a.k(WheelView$ACTION.FLING);
          }
       }else {
          this.a.invalidate();
       }
       return;
    }
}
