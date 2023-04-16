package d92.b;
import d92.q;
import d92.a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.util.List;
import iq5.b;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.GestureDetector$SimpleOnGestureListener;
import java.lang.Float;
import t02.a0;
import j47.a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d61.y;

public class b extends q	// class@0024a4
{
    public final a j;

    public void b(a p0,View p1){
       this.j = p0;
       super(p1);
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, b.class, "7")) {
          return;
       }
       Iterator iterator = this.j.u.iterator();
       while (iterator.hasNext()) {
          b uob = iterator.next();
       }
       return;
    }
    public boolean c(MotionEvent p0){
       Iterator obj = PatchProxy.applyOneRefs(p0, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.j.u.iterator();
       while (obj.hasNext()) {
          b uob = obj.next();
          if (uob != null) {
             uob.onDoubleTap(p0);
          }
       }
       return true;
    }
    public boolean d(MotionEvent p0){
       Iterator obj = PatchProxy.applyOneRefs(p0, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.j.u.iterator();
       while (obj.hasNext()) {
          b uob = obj.next();
          if (uob != null) {
             uob.onDoubleTapEvent(p0);
          }
       }
       return true;
    }
    public void e(MotionEvent p0,MotionEvent p1,float p2,float p3,float p4,float p5){
       if (PatchProxy.isSupport(b.class)) {
          Object[] objArray = new Object[]{p0,p1,Float.valueOf(p2),Float.valueOf(p3),Float.valueOf(p4),Float.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, b.class, "6")) {
             return;
          }
       }
       Iterator iterator = this.j.u.iterator();
       while (iterator.hasNext()) {
          b uob = iterator.next();
       }
       return;
    }
    public void f(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "8")) {
          return;
       }
       Iterator iterator = this.j.u.iterator();
       while (iterator.hasNext()) {
          b uob = iterator.next();
          if (uob != null) {
             uob.onLongPress(p0);
          }
       }
       return;
    }
    public boolean g(MotionEvent p0,MotionEvent p1,float p2,float p3){
       boolean b;
       if (PatchProxy.isSupport(b.class)) {
          p0 = PatchProxy.applyFourRefs(p0, p1, Float.valueOf(p2), Float.valueOf(p3), this, b.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       b = (this.j.s.E1.uk() || !y.d(this.j.getActivity()))? true: false;
       return b;
    }
    public boolean h(MotionEvent p0){
       Iterator obj = PatchProxy.applyOneRefs(p0, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.j.u.iterator();
       while (obj.hasNext()) {
          b uob = obj.next();
          if (uob != null) {
             uob.onSingleTapConfirmed(p0);
          }
       }
       return true;
    }
    public boolean i(MotionEvent p0){
       Iterator obj = PatchProxy.applyOneRefs(p0, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.j.u.iterator();
       while (obj.hasNext()) {
          b uob = obj.next();
          if (uob != null) {
             uob.onSingleTapUp(p0);
          }
       }
       return true;
    }
    public boolean onTouch(View p0,MotionEvent p1){
       Iterator obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.j.u.iterator();
       while (obj.hasNext()) {
          b uob = obj.next();
          if (uob != null) {
             uob.a(p0, p1);
          }
       }
       return super.onTouch(p0, p1);
    }
}
