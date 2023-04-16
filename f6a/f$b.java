package f6a.f$b;
import android.view.GestureDetector$SimpleOnGestureListener;
import f6a.f;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class f$b extends GestureDetector$SimpleOnGestureListener	// class@0022cc
{
    public final f b;

    public void f$b(f p0){
       this.b = p0;
       super();
    }
    public boolean onSingleTapUp(MotionEvent p0){
       p0 = PatchProxy.applyOneRefsWithListener(p0, this, f$b.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       f$b tb = this.b;
       tb.R8(tb.C);
       PatchProxy.onMethodExit(f$b.class, "1");
       return true;
    }
}
