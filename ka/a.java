package ka.a;
import android.view.GestureDetector$SimpleOnGestureListener;
import com.contrarywind.view.WheelView;
import android.view.MotionEvent;
import la.a;
import java.util.concurrent.TimeUnit;
import java.lang.Runnable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;

public final class a extends GestureDetector$SimpleOnGestureListener	// class@002494
{
    public final WheelView b;

    public void a(WheelView p0){
       super();
       this.b = p0;
    }
    public final boolean onFling(MotionEvent p0,MotionEvent p1,float p2,float p3){
       a tb = this.b;
       tb.a();
       tb.j = tb.i.scheduleWithFixedDelay(new a(tb, p3), 0, 5, TimeUnit.MILLISECONDS);
       return true;
    }
}
