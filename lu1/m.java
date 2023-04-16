package lu1.m;
import android.view.View$OnTouchListener;
import lu1.q;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import android.view.GestureDetector;

public final class m implements View$OnTouchListener	// class@003045
{
    public final q b;

    public void m(q p0){
       this.b = p0;
       super();
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, m.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       q f = this.b.F;
       if (f == null) {
          a.S("pkCellViewGestureDetector");
       }
       return f.onTouchEvent(p1);
    }
}
