package djc.c0$a;
import android.view.View$OnTouchListener;
import djc.c0;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class c0$a implements View$OnTouchListener	// class@0021d5
{
    public final c0 b;

    public void c0$a(c0 p0){
       this.b = p0;
       super();
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       p0 = PatchProxy.applyTwoRefsWithListener(p0, p1, this, c0$a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       a.o(p1, "event");
       if (!(p1.getAction() & 0x00ff)) {
          c0$a tb = this.b;
          tb.b(tb.d, tb.e);
       }
       PatchProxy.onMethodExit(c0$a.class, "1");
       return false;
    }
}
