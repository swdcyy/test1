package androidx.constraintlayout.motion.widget.MotionLayout$c;
import e1.q;
import androidx.constraintlayout.motion.widget.MotionLayout;

public class MotionLayout$c extends q	// class@00066a
{
    public float a;
    public float b;
    public float c;
    public final MotionLayout d;

    public void MotionLayout$c(MotionLayout p0){
       this.d = p0;
       super();
       this.a = 0;
       this.b = 0;
    }
    public float a(){
       return this.d.D;
    }
    public void b(float p0,float p1,float p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public float getInterpolation(float p0){
       float f;
       MotionLayout$c tb;
       MotionLayout$c ta = this.a;
       if (ta > 0) {
          MotionLayout$c tc = this.c;
          if ((ta / tc) - p0 < 0) {
             p0 = ta / tc;
          }
          this.d.D = ta - (tc * p0);
          f = (ta * p0) - (((tc * p0) * p0) / 2.00f);
          tb = this.b;
       }else {
          MotionLayout$c tc1 = this.c;
          if (((- ta) / tc1) - p0 < 0) {
             p0 = (- ta) / tc1;
          }
          this.d.D = (tc1 * p0) + ta;
          f = (ta * p0) + (((tc1 * p0) * p0) / 2.00f);
          tb = this.b;
       }
       return (f + tb);
    }
}
