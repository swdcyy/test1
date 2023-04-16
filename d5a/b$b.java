package d5a.b$b;
import tyc.k3;
import d5a.b;
import java.lang.Object;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;

public final class b$b implements k3	// class@001e78
{
    public final b a;

    public void b$b(b p0){
       this.a = p0;
       super();
    }
    public final void onDispatchTouchEvent(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "1")) {
          return;
       }
       b$b ta = this.a;
       Integer integer = (p0 != null)? Integer.valueOf(p0.getAction()): null;
       boolean b = true;
       if (integer != null && (integer.intValue() == b || (integer != null && integer.intValue() == 3))) {
          b = false;
       }
       ta.D = b;
       return;
    }
}
