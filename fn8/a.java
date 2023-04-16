package fn8.a;
import fn8.b;
import fn8.a$a;
import android.view.MotionEvent;
import java.lang.Object;
import android.os.Handler;
import java.lang.Runnable;

public class a extends b	// class@00231f
{
    public long B;
    public long C;
    public int D;
    public int E;
    public float F;
    public float G;
    public Handler H;
    public int I;
    public final Runnable J;

    public void a(){
       super();
       this.B = 800;
       this.C = 160;
       this.D = 1;
       this.E = 1;
       this.J = new a$a(this);
    }
    public final boolean A(MotionEvent p0){
       if (this.I != this.E || ((this.D & 1) && ((p0.getRawX() - this.F) - (float)this.C > 0 || ((this.D & 0x02) && ((this.F - p0.getRawX()) - (float)this.C > 0 || ((this.D & 0x04) && ((this.G - p0.getRawY()) - (float)this.C <= 0 && (!(this.D & 0x08) || (p0.getRawY() - this.G) - (float)this.C <= 0)))))))) {
          return false;
       }
       this.H.removeCallbacksAndMessages(null);
       this.a();
       this.e();
       return 1;
    }
    public void q(){
       a tH = this.H;
       if (tH != null) {
          tH.removeCallbacksAndMessages(null);
       }
       return;
    }
    public void r(MotionEvent p0){
       int i = this.k();
       if (!i) {
          this.F = p0.getRawX();
          this.G = p0.getRawY();
          this.b();
          this.I = 1;
          a tH = this.H;
          if (tH == null) {
             this.H = new Handler();
          }else {
             tH.removeCallbacksAndMessages(null);
          }
          this.H.postDelayed(this.J, this.B);
       }
       if (i == 2) {
          this.A(p0);
          if (p0.getPointerCount() > this.I) {
             this.I = p0.getPointerCount();
          }
          if (p0.getActionMasked() == 1 && !this.A(p0)) {
             this.f();
          }
       }
    label_0054 :
       return;
    }
    public void s(){
       a tH = this.H;
       if (tH != null) {
          tH.removeCallbacksAndMessages(null);
       }
       return;
    }
}
