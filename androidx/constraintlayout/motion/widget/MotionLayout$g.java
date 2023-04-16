package androidx.constraintlayout.motion.widget.MotionLayout$g;
import androidx.constraintlayout.motion.widget.MotionLayout$f;
import java.lang.Object;
import android.view.VelocityTracker;
import android.view.MotionEvent;

public class MotionLayout$g implements MotionLayout$f	// class@00066e
{
    public VelocityTracker a;
    public static MotionLayout$g b;

    static {
       MotionLayout$g.b = new MotionLayout$g();
    }
    public void MotionLayout$g(){
       super();
    }
    public static MotionLayout$g h(){
       MotionLayout$g.b.a = VelocityTracker.obtain();
       return MotionLayout$g.b;
    }
    public float a(int p0){
       if (this.a != null) {
          return this.a(p0);
       }
       return 0;
    }
    public float b(){
       MotionLayout$g ta = this.a;
       if (ta != null) {
          return ta.getYVelocity();
       }
       return 0;
    }
    public void c(int p0){
       MotionLayout$g ta = this.a;
       if (ta != null) {
          ta.computeCurrentVelocity(p0);
       }
       return;
    }
    public void clear(){
       MotionLayout$g ta = this.a;
       if (ta != null) {
          ta.clear();
       }
       return;
    }
    public void d(MotionEvent p0){
       MotionLayout$g ta = this.a;
       if (ta != null) {
          ta.addMovement(p0);
       }
       return;
    }
    public void e(int p0,float p1){
       MotionLayout$g ta = this.a;
       if (ta != null) {
          ta.computeCurrentVelocity(p0, p1);
       }
       return;
    }
    public float f(){
       MotionLayout$g ta = this.a;
       if (ta != null) {
          return ta.getXVelocity();
       }
       return 0;
    }
    public float g(int p0){
       MotionLayout$g ta = this.a;
       if (ta != null) {
          return ta.getXVelocity(p0);
       }
       return 0;
    }
    public void recycle(){
       MotionLayout$g ta = this.a;
       if (ta != null) {
          ta.recycle();
          this.a = null;
       }
       return;
    }
}
