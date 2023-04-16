package d6a.w$a;
import android.view.GestureDetector$SimpleOnGestureListener;
import d6a.w;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Float;
import android.os.SystemClock;
import android.view.View;

public final class w$a extends GestureDetector$SimpleOnGestureListener	// class@001eb1
{
    public final w b;

    public void w$a(w p0){
       this.b = p0;
       super();
    }
    public boolean onDown(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, w$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.b.a = false;
       return super.onDown(p0);
    }
    public boolean onScroll(MotionEvent p0,MotionEvent p1,float p2,float p3){
       MotionEvent obj;
       if (PatchProxy.isSupport(w$a.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, Float.valueOf(p2), Float.valueOf(p3), this, w$a.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       this.b.a = true;
       if (p0 != null) {
          long l = SystemClock.uptimeMillis();
          obj = MotionEvent.obtain(l, l, 3, p0.getX(), p0.getY(), 0);
          this.b.b(obj);
          obj.recycle();
       }
       return super.onScroll(p0, p1, p2, p3);
    }
    public boolean onSingleTapUp(MotionEvent p0){
       w$a obj = PatchProxy.applyOneRefs(p0, this, w$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null) {
          return false;
       }
       if (this.b.b(p0)) {
          long l = SystemClock.uptimeMillis();
          p0 = MotionEvent.obtain(l, l, 3, p0.getX(), p0.getY(), 0);
          obj = this.b;
          obj.c(obj.d, p0);
          p0.recycle();
       }else {
          obj = this.b;
          obj.c(obj.d, p0);
       }
       return true;
    }
}
