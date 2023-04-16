package k59.z0$c;
import android.view.View$OnTouchListener;
import k59.z0;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import yx.j0;
import java.lang.Runnable;
import ekd.k1;

public final class z0$c implements View$OnTouchListener	// class@002b3b
{
    public final z0 b;

    public void z0$c(z0 p0){
       this.b = p0;
       super();
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, z0$c.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       z0$c tb = this.b;
       if (tb.u == null) {
          tb.u = true;
          Object[] objArray = new Object[0];
          j0.f("AdWebAutoJumpPresenter", "touch webView", objArray);
          this.b.P8();
          k1.m(this.b.y);
       }
       return 0;
    }
}
