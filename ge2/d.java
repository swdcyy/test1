package ge2.d;
import androidx.viewpager.widget.ViewPager$j;
import lnc.a1;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import java.lang.Math;

public class d implements ViewPager$j	// class@002b08
{
    public static final int a;

    static {
       d.a = a1.e(6.00f);
    }
    public void d(){
       super();
    }
    public void a(View p0,float p1){
       double d;
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, uod, "1")) {
          return;
       }
       float f = ((float)p0.getWidth() * 0x3ea8f5c2) / 2.00f;
       float f1 = 0x3f2b851f;
       if (p1 - 0xbf800000 <= 0) {
          this.b(p0, f1, (f + (float)d.a));
       }else {
          d = (double)p1;
          if (d - 0x3ff0000000000000 <= 0) {
             float f2 = Math.max(f1, (0x3f800000 - Math.abs(p1)));
             f = (- f) * p1;
             f1 = Math.abs((Math.abs(p1) - 0x3f000000));
             if (d - 0xbfe0000000000000 <= 0) {
                this.b(p0, f2, (f + (((float)d.a * f1) * 2.00f)));
             }else if(p1 <= 0){
                this.b(p0, f2, f);
             }else if(d - 0x3fe0000000000000 >= 0){
                this.b(p0, f2, (f - (((float)d.a * f1) * 2.00f)));
             }else {
                this.b(p0, f2, f);
             }
          }else {
             this.b(p0, f1, ((- f) - (float)d.a));
          }
       }
       return;
    }
    public final void b(View p0,float p1,float p2){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), this, d.class, "2")) {
          return;
       }
       p0.setScaleX(p1);
       p0.setScaleY(p1);
       p0.setTranslationX(p2);
       return;
    }
}
