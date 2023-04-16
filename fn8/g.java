package fn8.g;
import fn8.b;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.view.MotionEvent;
import android.os.Handler;
import fn8.g$a;
import java.lang.Runnable;
import java.lang.Object;

public class g extends b	// class@002327
{
    public long B;
    public float C;
    public float D;
    public float E;
    public Handler F;
    public static float G = 0.000000;

    public void g(Context p0){
       super();
       this.B = 500;
       this.v(true);
       this.C = g.G * c.c(p0.getResources()).density;
    }
    public void r(MotionEvent p0){
       if (!this.k()) {
          this.b();
          this.D = p0.getRawX();
          this.E = p0.getRawY();
          Handler handler = new Handler();
          this.F = handler;
          handler.postDelayed(new g$a(this), this.B);
       }
       if (p0.getActionMasked() == 1) {
          g tF = this.F;
          if (tF != null) {
             tF.removeCallbacksAndMessages(null);
             this.F = null;
          }
          if (this.k() == 4) {
             this.e();
          }else {
             this.f();
          }
       }else if((((p0.getRawX() - this.D) * (p0.getRawX() - this.D)) + ((p0.getRawY() - this.E) * (p0.getRawY() - this.E))) - this.C > 0){
          if (this.k() == 4) {
             this.c();
          }else {
             this.f();
          }
       }
       return;
    }
    public void t(int p0,int p1){
       g tF = this.F;
       if (tF != null) {
          tF.removeCallbacksAndMessages(null);
          this.F = null;
       }
       return;
    }
}
