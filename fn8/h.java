package fn8.h;
import fn8.b;
import android.view.View;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.os.SystemClock;

public class h extends b	// class@002328
{
    public boolean B;
    public boolean C;

    public void h(){
       super();
       this.v(true);
    }
    public static boolean A(View p0,MotionEvent p1){
       if (p0 instanceof ViewGroup && p0.onInterceptTouchEvent(p1)) {
          return true;
       }
       return false;
    }
    public void q(){
       long l = SystemClock.uptimeMillis();
       MotionEvent motionEvent = MotionEvent.obtain(l, l, 3, 0, 0, 0);
       motionEvent.setAction(3);
       this.m().onTouchEvent(motionEvent);
    }
    public void r(MotionEvent p0){
       View view = this.m();
       int i = this.k();
       if (p0.getActionMasked() == 1) {
          view.onTouchEvent(p0);
          if (!i || (i == 2 && view.isPressed())) {
             this.a();
          }
          this.e();
       }else if(!i || i == 2){
          if (this.B != null) {
             h.A(view, p0);
             view.onTouchEvent(p0);
             this.a();
          }else if(h.A(view, p0)){
             view.onTouchEvent(p0);
             this.a();
          }else if(i != 2){
             this.b();
          }
       }else if(i == 4){
          view.onTouchEvent(p0);
       }
       return;
    }
    public boolean x(b p0){
       return (this.C ^ 0x01);
    }
    public boolean y(b p0){
       boolean b = false;
       if (p0 instanceof h) {
          b uob = p0;
          if (uob.k() == 4 && uob.C != null) {
             return b;
          }
       }
       int i = this.C ^ 1;
       int i1 = this.k();
       int i2 = p0.k();
       if (i1 == 4 && (i2 == 4 && i)) {
          return b;
       }else if(i1 == 4 && i){
          b = true;
       }
       return b;
    }
    public boolean z(b p0){
       return super.z(p0);
    }
}
