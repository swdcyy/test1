package fn8.n;
import fn8.b;
import fn8.n$a;
import android.os.Handler;
import java.lang.Object;
import java.lang.Runnable;
import android.view.MotionEvent;
import fn8.f;
import java.lang.Math;

public class n extends b	// class@002332
{
    public float B;
    public float C;
    public float D;
    public long E;
    public long F;
    public int G;
    public int H;
    public int I;
    public float J;
    public float K;
    public float L;
    public float M;
    public float N;
    public float O;
    public Handler P;
    public int Q;
    public final Runnable R;
    public static float S = 0.000000;

    public void n(){
       super();
       float s = n.S;
       this.B = s;
       this.C = s;
       this.D = s;
       this.E = 500;
       this.F = 500;
       this.G = 1;
       this.H = 1;
       this.I = 1;
       this.R = new n$a(this);
       this.v(1);
    }
    public final void A(){
       n tP = this.P;
       if (tP == null) {
          this.P = new Handler();
       }else {
          tP.removeCallbacksAndMessages(null);
       }
       this.P.postDelayed(this.R, this.E);
       return;
    }
    public void q(){
       n tP = this.P;
       if (tP != null) {
          tP.removeCallbacksAndMessages(null);
       }
       return;
    }
    public void r(MotionEvent p0){
       float f;
       int i = this.k();
       int actionMasked = p0.getActionMasked();
       if (!i) {
          this.L = 0;
          this.M = 0;
          this.J = p0.getRawX();
          this.K = p0.getRawY();
       }
       if (actionMasked == 6 || actionMasked == 5) {
          this.L = this.L + (this.N - this.J);
          this.M = this.M + (this.O - this.K);
          this.N = f.a(p0, true);
          f = f.b(p0, true);
          this.O = f;
          this.J = this.N;
          this.K = f;
       }else {
          this.N = f.a(p0, true);
          this.O = f.b(p0, true);
       }
       if (this.I < p0.getPointerCount()) {
          this.I = p0.getPointerCount();
       }
       float f1 = (this.N - this.J) + this.L;
       if (!this.B - n.S || Math.abs(f1) - this.B <= 0) {
          f = (this.O - this.K) + this.M;
          if (!this.C - n.S || Math.abs(f) - this.C <= 0) {
             f = (f * f) + (f1 * f1);
             n tP = this.D;
             if (!tP - n.S || f - tP <= 0) {
                int i1 = 0;
             label_00ae :
                if (f1) {
                   this.f();
                }else if(!i){
                   if (!actionMasked) {
                      this.b();
                   }
                   this.A();
                }else if(i == 2){
                   if (actionMasked == 1) {
                      tP = this.P;
                      if (tP == null) {
                         this.P = new Handler();
                      }else {
                         tP.removeCallbacksAndMessages(null);
                      }
                      i1 = this.Q + true;
                      this.Q = i1;
                      if (i1 == this.G && this.I >= this.H) {
                         this.a();
                         this.e();
                      }else {
                         this.P.postDelayed(this.R, this.F);
                      }
                   }else if(!actionMasked){
                      this.A();
                   }
                }
                return;
             }
          }
       }
       f1 = 1;
       goto label_00ae ;
    }
    public void s(){
       this.Q = 0;
       this.I = 0;
       n tP = this.P;
       if (tP != null) {
          tP.removeCallbacksAndMessages(null);
       }
       return;
    }
}
