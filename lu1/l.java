package lu1.l;
import android.view.GestureDetector$SimpleOnGestureListener;
import lu1.q;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class l extends GestureDetector$SimpleOnGestureListener	// class@003044
{
    public final q b;

    public void l(q p0){
       this.b = p0;
       super();
    }
    public boolean onDoubleTap(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, l.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "e");
       this.b.r3(true, p0);
       return super.onDoubleTap(p0);
    }
    public boolean onSingleTapConfirmed(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, l.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "e");
       this.b.r3(false, p0);
       return super.onSingleTapConfirmed(p0);
    }
}
