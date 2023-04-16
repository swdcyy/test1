package androidx.constraintlayout.motion.widget.MotionLayout$h;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.Object;
import androidx.constraintlayout.motion.widget.MotionLayout$TransitionState;
import java.lang.Float;
import android.os.Bundle;
import java.lang.String;

public class MotionLayout$h	// class@00066f
{
    public float a;
    public float b;
    public int c;
    public int d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final MotionLayout i;

    public void MotionLayout$h(MotionLayout p0){
       this.i = p0;
       super();
       this.a = Float.NaN;
       this.b = Float.NaN;
       this.c = -1;
       this.d = -1;
       this.e = "motion.progress";
       this.f = "motion.velocity";
       this.g = "motion.StartState";
       this.h = "motion.EndState";
    }
    public void a(){
       MotionLayout$h tc = this.c;
       MotionLayout$h oh = -1;
       if (tc != oh || this.d != oh) {
          if (tc == oh) {
             this.i.n0(this.d);
          }else {
             MotionLayout$h td = this.d;
             if (td == oh) {
                this.i.h0(tc, oh, oh);
             }else {
                this.i.i0(tc, td);
             }
          }
          this.i.setState(MotionLayout$TransitionState.SETUP);
       }
       if (Float.isNaN(this.b)) {
          if (Float.isNaN(this.a)) {
             return;
          }else {
             this.i.setProgress(this.a);
             return;
          }
       }else {
          this.i.g0(this.a, this.b);
          this.a = Float.NaN;
          this.b = Float.NaN;
          this.c = oh;
          this.d = oh;
          return;
       }
    }
    public Bundle b(){
       Bundle uBundle = new Bundle();
       uBundle.putFloat("motion.progress", this.a);
       uBundle.putFloat("motion.velocity", this.b);
       uBundle.putInt("motion.StartState", this.c);
       uBundle.putInt("motion.EndState", this.d);
       return uBundle;
    }
    public void c(){
       MotionLayout$h ti = this.i;
       this.d = ti.G;
       this.c = ti.E;
       this.b = ti.getVelocity();
       this.a = this.i.getProgress();
    }
    public void d(int p0){
       this.d = p0;
    }
    public void e(float p0){
       this.a = p0;
    }
    public void f(int p0){
       this.c = p0;
    }
    public void g(Bundle p0){
       this.a = p0.getFloat("motion.progress");
       this.b = p0.getFloat("motion.velocity");
       this.c = p0.getInt("motion.StartState");
       this.d = p0.getInt("motion.EndState");
    }
    public void h(float p0){
       this.b = p0;
    }
}
