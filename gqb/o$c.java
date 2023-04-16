package gqb.o$c;
import androidx.viewpager.widget.ViewPager$i;
import gqb.o;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.animation.ObjectAnimator;

public final class o$c implements ViewPager$i	// class@002b83
{
    public final o b;

    public void o$c(o p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
       o t;
       o$c uoc = o$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "1")) {
          return;
       }
       if (p0) {
          if (p0 != 1) {
             if (p0 == 2) {
                t = this.b.t;
                if (t != null) {
                   t.start();
                }
             }
          }else {
             t = this.b.s;
             if (t != null) {
                t.start();
             }
          }
       }else {
          this.b.R8();
       }
       return;
    }
    public void onPageScrolled(int p0,float p1,int p2){
    }
    public void onPageSelected(int p0){
    }
}
