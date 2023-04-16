package cb2.q$b;
import androidx.viewpager.widget.ViewPager$l;
import cb2.q;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import fb2.i;

public class q$b extends ViewPager$l	// class@000515
{
    public final q b;

    public void q$b(q p0){
       this.b = p0;
       super();
    }
    public void onPageScrolled(int p0,float p1,int p2){
       if (PatchProxy.isSupport(q$b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, q$b.class, "1")) {
          return;
       }
       if (p1 - 0x3c23d70a > 0) {
          q$b tb = this.b;
          if (tb.r == null) {
             tb.r = true;
             tb.p.a();
          }
       }
       return;
    }
}
