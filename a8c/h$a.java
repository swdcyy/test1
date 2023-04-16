package a8c.h$a;
import android.view.View$OnTouchListener;
import a8c.h;
import android.view.View;
import java.lang.Object;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Objects;
import com.kwai.library.widget.popup.common.c;

public class h$a implements View$OnTouchListener	// class@0000a0
{
    public final View b;
    public final h c;

    public void h$a(h p0,View p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public boolean onTouch(View p0,MotionEvent p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, h$a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       h$a tc = this.c;
       h$a tb = this.b;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoidTwoRefs(tb, p1, tc, h.class, "5") && p1.getActionMasked() == 1) {
          float x = p1.getX();
          float y = p1.getY();
          int left = tb.getLeft();
          int top = tb.getTop();
          if (y - (float)top < 0 || (y - (float)(top + tb.getMeasuredHeight()) < 0 && (x - (float)left < 0 || x - (float)(left + tb.getMeasuredWidth()) > 0))) {
             tc.d.q(2);
          }
       }
       return true;
    }
}
