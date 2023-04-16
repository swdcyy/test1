package fn8.m;
import fn8.b;
import fn8.m$a;
import android.view.MotionEvent;
import fn8.l;
import fn8.l$a;

public class m extends b	// class@002330
{
    public l B;
    public double C;
    public double D;
    public l$a E;

    public void m(){
       super();
       this.E = new m$a(this);
       this.v(false);
    }
    public void r(MotionEvent p0){
       l i2;
       int i = this.k();
       if (!i) {
          this.D = 0;
          this.C = 0;
          this.B = new l(this.E);
          this.b();
       }
       m tB = this.B;
       if (tB != null) {
          int actionMasked = p0.getActionMasked();
          int i1 = 0;
          if (actionMasked) {
             if (actionMasked != 1) {
                if (actionMasked != 2) {
                   if (actionMasked != 5) {
                      if (actionMasked == 6 && tB.g != null) {
                         actionMasked = p0.getPointerId(p0.getActionIndex());
                         l h = tB.h;
                         if (actionMasked == h[i1] || actionMasked == h[1]) {
                            tB.a();
                         }
                      }
                   }else if(tB.g == null){
                      tB.h[1] = p0.getPointerId(p0.getActionIndex());
                      tB.g = true;
                      tB.b = p0.getEventTime();
                      tB.c = Double.NaN;
                      tB.b(p0);
                      i2 = tB.i;
                      if (i2 != null) {
                         i2.c(tB);
                      }
                   }
                }else if(tB.g != null){
                   tB.b(p0);
                   i2 = tB.i;
                   if (i2 != null) {
                      i2.b(tB);
                   }
                }
             }else {
                tB.a();
             }
          }else {
             tB.g = i1;
             tB.h[i1] = p0.getPointerId(p0.getActionIndex());
             tB.h[1] = -1;
          }
       }
       if (p0.getActionMasked() == 1) {
          if (i == 4) {
             this.e();
          }else {
             this.f();
          }
       }
       return;
    }
    public void s(){
       this.B = null;
       this.D = 0;
       this.C = 0;
    }
}
