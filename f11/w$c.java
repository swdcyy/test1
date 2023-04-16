package f11.w$c;
import android.view.GestureDetector$SimpleOnGestureListener;
import f11.w;
import f11.w$a;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class w$c extends GestureDetector$SimpleOnGestureListener	// class@002288
{
    public final w b;

    public void w$c(w p0){
       this.b = p0;
       super();
    }
    public void w$c(w p0,w$a p1){
       super(p0);
    }
    public boolean onDoubleTap(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, w$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.b.P8(p0, true);
       return true;
    }
    public boolean onSingleTapConfirmed(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, w$c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.b.z.onSingleTapConfirmed(p0);
       return super.onSingleTapConfirmed(p0);
    }
    public boolean onSingleTapUp(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, w$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.b.z.onSingleTapUp(p0);
       return super.onSingleTapUp(p0);
    }
}
