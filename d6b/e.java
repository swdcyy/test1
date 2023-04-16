package d6b.e;
import android.view.View$OnTouchListener;
import d6b.g;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import d6b.d;
import com.airbnb.lottie.LottieAnimationView;

public final class e implements View$OnTouchListener	// class@002460
{
    public final g b;

    public void e(g p0){
       this.b = p0;
       super();
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, e.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       d u = this.b.a.u;
       if (u != null && u.p() == true) {
          u = this.b.a.u;
          if (u != null) {
             u.f();
          }
       }
       return true;
    }
}
