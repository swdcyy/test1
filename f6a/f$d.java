package f6a.f$d;
import android.view.View$OnTouchListener;
import f6a.f;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.GestureDetector;
import kotlin.jvm.internal.a;

public final class f$d implements View$OnTouchListener	// class@0022ce
{
    public final f b;

    public void f$d(f p0){
       this.b = p0;
       super();
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       boolean b;
       p0 = PatchProxy.applyTwoRefsWithListener(p0, p1, this, f$d.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       if (!this.b.G.onTouchEvent(p1)) {
          a.o(p1, "event");
          if (!this.b.d9(p1)) {
             b = false;
          label_002e :
             PatchProxy.onMethodExit(f$d.class, "1");
             return b;
          }
       }
       b = true;
       goto label_002e ;
    }
}
