package e3.b;
import e3.b0;
import java.lang.Math;
import android.view.ViewGroup;
import androidx.transition.Transition;
import e3.o;
import android.graphics.Rect;

public class b extends b0	// class@001edd
{
    public float b;

    public void b(){
       super();
       this.b = 3.00f;
    }
    public static float h(float p0,float p1,float p2,float p3){
       return (float)Math.sqrt((double)(((p2 - p0) * (p2 - p0)) + ((p3 - p1) * (p3 - p1))));
    }
    public long c(ViewGroup p0,Transition p1,o p2,o p3){
       int i1;
       int i4;
       long l = 0;
       if (p2 == null && p3 == null) {
          return l;
       }
       int i = 1;
       if (p3 == null || !this.e(p2)) {
          i1 = -1;
       }else {
          p2 = p3;
          i1 = 1;
       }
       int i2 = this.f(p2);
       int i3 = this.g(p2);
       Rect rect = p1.s();
       if (rect != null) {
          i = rect.centerX();
          i4 = rect.centerY();
       }else {
          int[] ointArray = new int[2];
          p0.getLocationOnScreen(ointArray);
          i4 = Math.round(((float)(ointArray[i] + (p0.getHeight() / 2)) + p0.getTranslationY()));
          i = Math.round(((float)(ointArray[0] + (p0.getWidth() / 2)) + p0.getTranslationX()));
       }
       float f = b.h((float)i2, (float)i3, (float)i, (float)i4) / b.h(0, 0, (float)p0.getWidth(), (float)p0.getHeight());
       long l1 = p1.r();
       if (l1 - l < 0) {
          l1 = 300;
       }
       return (long)Math.round((((float)(l1 * (long)i1) / this.b) * f));
    }
}
