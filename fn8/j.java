package fn8.j;
import fn8.b;
import android.content.Context;
import android.view.ViewConfiguration;
import android.view.VelocityTracker;
import android.view.MotionEvent;
import fn8.f;

public class j extends b	// class@00232a
{
    public float B;
    public float C;
    public float D;
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public float K;
    public float L;
    public float M;
    public int N;
    public int O;
    public float P;
    public float Q;
    public float R;
    public float S;
    public float T;
    public float U;
    public float V;
    public float W;
    public VelocityTracker X;
    public boolean Y;
    public static float Z = 340282346638528860000000000000000000000.000000;
    public static float a0 = 0.000000;
    public static int b0 = 1;
    public static int c0 = 10;

    public void j(Context p0){
       super();
       float a0 = j.a0;
       this.B = a0;
       float z = j.Z;
       this.C = z;
       this.D = a0;
       this.E = a0;
       this.F = z;
       this.G = z;
       this.H = a0;
       this.I = a0;
       this.J = z;
       this.K = z;
       this.L = z;
       this.M = z;
       this.N = j.b0;
       this.O = j.c0;
       this.B = (float)(ViewConfiguration.get(p0).getScaledTouchSlop() * ViewConfiguration.get(p0).getScaledTouchSlop());
    }
    public static void A(VelocityTracker p0,MotionEvent p1){
       float f = p1.getRawX() - p1.getX();
       float f1 = p1.getRawY() - p1.getY();
       p1.offsetLocation(f, f1);
       p0.addMovement(p1);
       float f2 = - f;
       p1.offsetLocation(f2, (- f1));
    }
    public j B(float p0){
       this.B = p0 * p0;
       return this;
    }
    public void r(MotionEvent p0){
       float f;
       VelocityTracker velocityTrac;
       int i = this.k();
       int actionMasked = p0.getActionMasked();
       int i1 = 5;
       int i2 = 6;
       if (actionMasked == i2 || actionMasked == i1) {
          this.R = this.R + (this.T - this.P);
          this.S = this.S + (this.U - this.Q);
          this.T = f.a(p0, this.Y);
          f = f.b(p0, this.Y);
          this.U = f;
          this.P = this.T;
          this.Q = f;
       }else {
          this.T = f.a(p0, this.Y);
          this.U = f.b(p0, this.Y);
       }
       f = 0;
       if (!i && p0.getPointerCount() >= this.N) {
          this.P = this.T;
          this.Q = this.U;
          this.R = f;
          this.S = f;
          velocityTrac = VelocityTracker.obtain();
          this.X = velocityTrac;
          j.A(velocityTrac, p0);
          this.b();
       }else {
          j tX = this.X;
          if (tX != null) {
             j.A(tX, p0);
             this.X.computeCurrentVelocity(1000);
             this.V = this.X.getXVelocity();
             this.W = this.X.getYVelocity();
          }
       }
       velocityTrac = 2;
       int i3 = 4;
       int i4 = 1;
       if (actionMasked == i4) {
          if (i == i3 || i == velocityTrac) {
             this.e();
          }else {
             this.f();
          }
       }else if(actionMasked == i1 && p0.getPointerCount() > this.O){
          if (i == i3) {
             this.c();
          }else {
             this.f();
          }
       }else if(actionMasked == i2 && (i == i3 && p0.getPointerCount() < this.N)){
          this.f();
       }else if(i == velocityTrac){
          j tT = this.T;
          float f1 = (tT - this.P) + this.R;
          j tE = this.E;
          float a0 = j.a0;
          if (!tE - a0 || f1 - tE >= 0) {
             tE = this.F;
             float z = j.Z;
             if (!tE - z || f1 - tE <= 0) {
                float f2 = (this.U - this.Q) + this.S;
                j tG = this.I;
                if (!tG - a0 || f2 - tG >= 0) {
                   tG = this.J;
                   if (!tG - z || f2 - tG <= 0) {
                      tE = null;
                   label_010d :
                      if (tE) {
                         this.f();
                      }else {
                         tE = this.C;
                         z = j.Z;
                         if (!tE - z || f1 - tE >= 0) {
                            tE = this.D;
                            if (!tE - a0 || f1 - tE <= 0) {
                               f2 = (this.U - this.Q) + this.S;
                               tG = this.G;
                               if (!tG - z || f2 - tG >= 0) {
                                  tG = this.H;
                                  if (!tG - a0 || f2 - tG <= 0) {
                                     f1 = (f1 * f1) + (f2 * f2);
                                     tE = this.B;
                                     if (!tE - z || f1 - tE < 0) {
                                        j tV = this.V;
                                        tE = this.K;
                                        if (!tE - z || (tE - f < 0 && (tV - tE > 0 && (tE - f < 0 || tV - tE < 0)))) {
                                           tE = this.W;
                                           j tL = this.L;
                                           if (!tL - z || (tL - f < 0 && (tV - tL > 0 && (tL - f < 0 || tV - tL < 0)))) {
                                              f1 = (tV * tV) + (tE * tE);
                                              tE = this.M;
                                              if (!tE - z || f1 - tE < 0) {
                                                 i4 = 0;
                                              }
                                           }
                                        }
                                     }
                                  }
                               }
                            }
                         }
                         if (i4) {
                            this.P = tT;
                            this.Q = this.U;
                            this.a();
                         }
                      }
                   }
                }
             }
          }
          tE = 1;
          goto label_010d ;
       }
       return;
    }
    public void s(){
       j tX = this.X;
       if (tX != null) {
          tX.recycle();
          this.X = null;
       }
       return;
    }
}
