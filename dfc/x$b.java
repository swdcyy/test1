package dfc.x$b;
import androidx.viewpager.widget.ViewPager$l;
import dfc.x;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.lang.Runnable;
import ekd.k1;

public class x$b extends ViewPager$l	// class@0021ba
{
    public final x b;

    public void x$b(x p0){
       this.b = p0;
       super();
    }
    public void onPageSelected(int p0){
       x$b uob = x$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "1")) {
          return;
       }
       k1.m(this.b.s);
       this.b.R8(p0);
       return;
    }
}
