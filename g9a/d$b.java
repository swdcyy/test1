package g9a.d$b;
import android.view.GestureDetector$SimpleOnGestureListener;
import g9a.d;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.graphics.Rect;
import java.util.Iterator;
import java.util.ArrayList;
import android.os.SystemClock;
import uw9.o;
import q87.c;
import g9a.e;

public final class d$b extends GestureDetector$SimpleOnGestureListener	// class@002415
{
    public final d b;
    public final View c;

    public void d$b(d p0,View p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onLongPress(MotionEvent p0){
       Object[] obj;
       boolean b;
       d a;
       if (PatchProxy.applyVoidOneRefs(p0, this, d$b.class, "1")) {
          return;
       }
       a.p(p0, "e");
       super.onLongPress(p0);
       d$b tb = this.b;
       int i = 0;
       if (tb.d != null) {
          Objects.requireNonNull(tb);
          obj = PatchProxy.applyOneRefs(p0, tb, d.class, "6");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             Rect rect = new Rect();
             Iterator iterator = tb.c.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   iterator.next().getGlobalVisibleRect(rect);
                   if (rect.contains((int)p0.getRawX(), (int)p0.getRawY())) {
                      b = true;
                   }
                }else {
                   b = false;
                }
             }
          }
          if (b) {
             return;
          }
       }
       long l = SystemClock.uptimeMillis();
       Objects.requireNonNull(d.k);
       d.j = true;
       obj = new Object[i];
       o.C().w("PressControlSpeedHelper", "´¥·¢³¤°´", obj);
       this.c.dispatchTouchEvent(MotionEvent.obtain(l, l, 2, p0.getX(), p0.getY(), 0));
       a = this.b.a;
       if (a != null) {
          a.a(true, p0.getRawX(), p0.getRawY());
       }
       return;
    }
}
