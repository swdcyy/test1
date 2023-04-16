package f79.h;
import android.view.ScaleGestureDetector$OnScaleGestureListener;
import android.content.Context;
import f79.f;
import java.lang.Object;
import android.view.ScaleGestureDetector;
import android.view.ViewConfiguration;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import a2.q;
import java.lang.Boolean;
import java.lang.Float;

public class h implements ScaleGestureDetector$OnScaleGestureListener	// class@0022dc
{
    public final float a;
    public final float b;
    public final ScaleGestureDetector c;
    public final f d;
    public VelocityTracker e;
    public boolean f;
    public float g;
    public float h;
    public int i;
    public int j;

    public void h(Context p0,f p1){
       super();
       this.i = -1;
       this.j = 0;
       this.c = new ScaleGestureDetector(p0, this);
       this.d = p1;
       ViewConfiguration viewConfigur = ViewConfiguration.get(p0);
       this.b = (float)viewConfigur.getScaledMinimumFlingVelocity();
       this.a = (float)viewConfigur.getScaledTouchSlop();
    }
    public final float a(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       try{
          return q.f(p0, this.j);
       }catch(java.lang.Exception e0){
          return p0.getX();
       }
    }
    public final float b(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       try{
          return q.g(p0, this.j);
       }catch(java.lang.Exception e0){
          return p0.getY();
       }
    }
    public boolean c(){
       return this.f;
    }
    public boolean d(){
       Object obj = PatchProxy.apply(null, this, h.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.c.isInProgress();
    }
    public boolean onScale(ScaleGestureDetector p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       float scaleFactor = p0.getScaleFactor();
       if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
          return false;
       }
       this.d.h(scaleFactor, p0.getFocusX(), p0.getFocusY());
       return true;
    }
    public boolean onScaleBegin(ScaleGestureDetector p0){
       return true;
    }
    public void onScaleEnd(ScaleGestureDetector p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "2")) {
          return;
       }
       this.d.a();
       return;
    }
}
