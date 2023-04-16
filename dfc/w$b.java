package dfc.w$b;
import androidx.viewpager.widget.ViewPager$l;
import dfc.w;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import android.view.View;

public class w$b extends ViewPager$l	// class@0021b7
{
    public final w b;

    public void w$b(w p0){
       this.b = p0;
       super();
    }
    public void onPageScrolled(int p0,float p1,int p2){
       w$b tb;
       if (PatchProxy.isSupport(w$b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, w$b.class, "1")) {
          return;
       }
       boolean b = this.b.P8(p0);
       p0++;
       if (b != this.b.P8(p0)) {
          if (b) {
             tb = this.b;
             tb.s.setTranslationY(((0x3f800000 - p1) * (float)tb.t));
          }else {
             tb = this.b;
             tb.s.setTranslationY((p1 * (float)tb.t));
          }
       }
       return;
    }
    public void onPageSelected(int p0){
       w$b uob = w$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "2")) {
          return;
       }
       if (this.b.P8(p0)) {
          w$b tb = this.b;
          tb.s.setTranslationY((float)tb.t);
       }
       return;
    }
}
