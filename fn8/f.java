package fn8.f;
import android.view.MotionEvent;

public class f	// class@002325
{

    public static float a(MotionEvent p0,boolean p1){
       float f = p0.getRawX() - p0.getX();
       int i = -1;
       int actionIndex = (p0.getActionMasked() == 6)? p0.getActionIndex(): -1;
       if (p1) {
          float f1 = 0;
          i = p0.getPointerCount();
          int i1 = 0;
          int i2 = 0;
          while (i1 < i) {
             if (i1 != actionIndex) {
                float f2 = p0.getX(i1) + f;
                f1 = f1 + f2;
                i2 = i2 + 1;
             }
             i1 = i1 + 1;
          }
          return (f1 / (float)i2);
       }else {
          int i3 = p0.getPointerCount() + i;
          if (i3 == actionIndex) {
             i3--;
          }
          return (p0.getX(i3) + f);
       }
    }
    public static float b(MotionEvent p0,boolean p1){
       float f = p0.getRawY() - p0.getY();
       int i = -1;
       int actionIndex = (p0.getActionMasked() == 6)? p0.getActionIndex(): -1;
       if (p1) {
          float f1 = 0;
          i = p0.getPointerCount();
          int i1 = 0;
          int i2 = 0;
          while (i1 < i) {
             if (i1 != actionIndex) {
                float f2 = p0.getY(i1) + f;
                f1 = f1 + f2;
                i2 = i2 + 1;
             }
             i1 = i1 + 1;
          }
          return (f1 / (float)i2);
       }else {
          int i3 = p0.getPointerCount() + i;
          if (i3 == actionIndex) {
             i3--;
          }
          return (p0.getY(i3) + f);
       }
    }
}
