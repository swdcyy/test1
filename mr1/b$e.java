package mr1.b$e;
import android.view.GestureDetector$SimpleOnGestureListener;
import mr1.b;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import sq1.a;
import sq1.f$b;
import sq1.f;
import j83.b;

public final class b$e extends GestureDetector$SimpleOnGestureListener	// class@0031f2
{
    public final b b;

    public void b$e(b p0){
       this.b = p0;
       super();
    }
    public boolean onDoubleTap(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b$e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "e");
       this.b.h.A(p0);
       return super.onDoubleTap(p0);
    }
    public boolean onSingleTapConfirmed(MotionEvent p0){
       b obj = PatchProxy.applyOneRefs(p0, this, b$e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "e");
       obj = this.b.b;
       if (obj != null) {
          obj.g(f$b.a);
       }
       return super.onSingleTapConfirmed(p0);
    }
}
