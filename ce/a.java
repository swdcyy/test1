package ce.a;
import android.view.View$MeasureSpec;
import com.facebook.yoga.YogaMeasureMode;
import java.lang.Float;
import ze.p;

public class a	// class@000d06
{

    public static float a(int p0){
       p0 = View$MeasureSpec.getSize(p0);
       float f = (!View$MeasureSpec.getMode(p0))? Float.POSITIVE_INFINITY: (float)p0;
       return f;
    }
    public static float b(int p0){
       p0 = View$MeasureSpec.getSize(p0);
       float f = (View$MeasureSpec.getMode(p0) == 0x40000000)? (float)p0: 0;
       return f;
    }
    public static YogaMeasureMode c(float p0,float p1){
       if (!p0 - p1) {
          return YogaMeasureMode.EXACTLY;
       }
       if (Float.isInfinite(p1)) {
          return YogaMeasureMode.UNDEFINED;
       }
       return YogaMeasureMode.AT_MOST;
    }
    public static float d(float p0,float p1){
       if (!p0 - p1) {
          return p.c(p1);
       }
       if (Float.isInfinite(p1)) {
          return Float.POSITIVE_INFINITY;
       }
       return p.c(p1);
    }
}
