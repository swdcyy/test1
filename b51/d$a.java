package b51.d$a;
import androidx.viewpager.widget.ViewPager$l;
import b51.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Iterator;
import java.util.List;
import androidx.viewpager.widget.ViewPager$i;
import java.lang.Float;
import com.kuaishou.live.basic.liveslide.a;
import cw6.b;

public class d$a extends ViewPager$l	// class@000315
{
    public final d b;

    public void d$a(d p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
       d$a uoa = d$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "3")) {
          return;
       }
       Iterator iterator = this.b.p.iterator();
       while (iterator.hasNext()) {
          iterator.next().onPageScrollStateChanged(p0);
       }
       return;
    }
    public void onPageScrolled(int p0,float p1,int p2){
       if (PatchProxy.isSupport(d$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, d$a.class, "1")) {
          return;
       }
       Iterator iterator = this.b.p.iterator();
       while (iterator.hasNext()) {
          iterator.next().onPageScrolled(this.b.o().l0(p0), p1, p2);
       }
       return;
    }
    public void onPageSelected(int p0){
       d$a uoa = d$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "2")) {
          return;
       }
       Iterator iterator = this.b.p.iterator();
       while (iterator.hasNext()) {
          iterator.next().onPageSelected(this.b.o().l0(p0));
       }
       return;
    }
}
