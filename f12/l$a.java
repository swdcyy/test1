package f12.l$a;
import androidx.viewpager.widget.ViewPager$l;
import f12.l;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Iterator;
import java.util.List;
import androidx.viewpager.widget.ViewPager$i;
import java.lang.Float;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;

public class l$a extends ViewPager$l	// class@00283c
{
    public final l b;

    public void l$a(l p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
       l$a uoa = l$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "3")) {
          return;
       }
       Iterator iterator = this.b.c.iterator();
       while (iterator.hasNext()) {
          iterator.next().onPageScrollStateChanged(p0);
       }
       return;
    }
    public void onPageScrolled(int p0,float p1,int p2){
       if (PatchProxy.isSupport(l$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, l$a.class, "1")) {
          return;
       }
       l a = this.b.a;
       if (a != null) {
          p0 = a.q(p0);
       }
       Iterator iterator = this.b.c.iterator();
       while (iterator.hasNext()) {
          iterator.next().onPageScrolled(p0, p1, p2);
       }
       return;
    }
    public void onPageSelected(int p0){
       l$a uoa = l$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "2")) {
          return;
       }
       l a = this.b.a;
       if (a != null) {
          p0 = a.q(p0);
       }
       Iterator iterator = this.b.c.iterator();
       while (iterator.hasNext()) {
          iterator.next().onPageSelected(p0);
       }
       return;
    }
}
