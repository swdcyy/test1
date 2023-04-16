package f11.y;
import iq5.b;
import f11.w;
import f11.w$c;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.GestureDetector$SimpleOnGestureListener;
import t02.a0;
import lo1.c;

public class y extends b	// class@00228c
{
    public final w$c b;
    public final w c;

    public void y(w p0,w$c p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public boolean onDoubleTap(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, y.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.onDoubleTap(p0);
    }
    public boolean onDoubleTapEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, y.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.onDoubleTapEvent(p0);
    }
    public boolean onSingleTapConfirmed(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, y.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.onSingleTapConfirmed(p0);
    }
    public boolean onSingleTapUp(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, y.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.c.r.T1.c(p0, true);
       return this.b.onSingleTapUp(p0);
    }
}
