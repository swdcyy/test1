package fn8.k;
import fn8.b;
import fn8.k$a;
import android.view.MotionEvent;
import android.view.View;
import android.content.Context;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector$OnScaleGestureListener;
import android.view.ViewConfiguration;

public class k extends b	// class@00232c
{
    public ScaleGestureDetector B;
    public double C;
    public double D;
    public float E;
    public float F;
    public ScaleGestureDetector$OnScaleGestureListener G;

    public void k(){
       super();
       this.G = new k$a(this);
       this.v(false);
    }
    public void r(MotionEvent p0){
       if (!this.k()) {
          Context context = this.m().getContext();
          this.D = 0;
          this.C = 0x3ff0000000000000;
          this.B = new ScaleGestureDetector(context, this.G);
          this.F = (float)ViewConfiguration.get(context).getScaledTouchSlop();
          this.b();
       }
       k tB = this.B;
       if (tB != null) {
          tB.onTouchEvent(p0);
       }
       int pointerCount = p0.getPointerCount();
       if (p0.getActionMasked() == 6) {
          pointerCount = pointerCount - 1;
       }
       if (this.k() == 4 && pointerCount < 2) {
          this.e();
       }else if(p0.getActionMasked() == 1){
          this.f();
       }
       return;
    }
    public void s(){
       this.B = null;
       this.D = 0;
       this.C = 0x3ff0000000000000;
    }
}
