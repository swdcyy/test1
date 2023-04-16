package lz9.b0$h;
import androidx.viewpager.widget.ViewPager$i;
import lz9.b0;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Float;
import java.lang.String;
import qp7.x0;
import qp7.b;
import ks7.h0;

public class b0$h implements ViewPager$i	// class@002ed2
{
    public final b0 b;

    public void b0$h(b0 p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
       this.b.M = p0;
    }
    public void onPageScrolled(int p0,float p1,int p2){
       if (PatchProxy.isSupport(b0$h.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, b0$h.class, "1")) {
          return;
       }
       b0$h tb = this.b;
       if (tb.M == true) {
          tb.E().i(true);
          this.b.E().g(false);
       }
       return;
    }
    public void onPageSelected(int p0){
    }
}
