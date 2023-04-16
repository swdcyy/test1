package g19.p0$a;
import android.view.GestureDetector$SimpleOnGestureListener;
import g19.p0;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import rf5.u;

public final class p0$a extends GestureDetector$SimpleOnGestureListener	// class@0023d1
{
    public final p0 b;

    public void p0$a(p0 p0){
       this.b = p0;
       super();
    }
    public boolean onSingleTapConfirmed(MotionEvent p0){
       p0 = PatchProxy.applyOneRefs(p0, this, p0$a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       if (!p0.P8(this.b).v()) {
          p0.P8(this.b).l();
       }
       return true;
    }
}
