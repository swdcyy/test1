package gn8.g$a;
import fn8.b;
import gn8.g;
import android.os.SystemClock;
import android.view.MotionEvent;
import com.facebook.react.ReactRootView;
import com.facebook.react.views.modal.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.views.modal.ReactModalHostView$DialogRootViewGroup;

public class g$a extends b	// class@00249d
{
    public final g B;

    public void g$a(g p0){
       this.B = p0;
       super();
    }
    public void q(){
       this.B.e = true;
       long l = SystemClock.uptimeMillis();
       MotionEvent motionEvent = MotionEvent.obtain(l, l, 3, 0, 0, 0);
       motionEvent.setAction(3);
       g d = this.B.d;
       if (d instanceof ReactRootView) {
          d.f(motionEvent);
       }else if(PatchProxy.applyVoidTwoRefs(d, motionEvent, null, a.class, "1")){
          d.f(motionEvent);
       }
       return;
    }
    public void r(MotionEvent p0){
       if (!this.k()) {
          this.b();
          this.B.e = false;
       }
       if (p0.getActionMasked() == 1) {
          this.e();
       }
       return;
    }
}
