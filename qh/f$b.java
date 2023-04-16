package qh.f$b;
import androidx.viewpager.widget.ViewPager$i;
import qh.f;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import ef5.d;
import ef5.e;
import java.util.Objects;
import ef5.a;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.Float;

public final class f$b implements ViewPager$i	// class@0029dd
{
    public final f b;

    public void f$b(f p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
       f$b uob = f$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "3")) {
          return;
       }
       d uod = this.b.u.b();
       Objects.requireNonNull(uod);
       d uod1 = d.class;
       if (!PatchProxy.isSupport(uod1) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), uod, uod1, "4")) {
          Iterator iterator = uod.a.iterator();
          while (iterator.hasNext()) {
             iterator.next().onPageScrollStateChanged(p0);
          }
       }
       return;
    }
    public void onPageScrolled(int p0,float p1,int p2){
       if (PatchProxy.isSupport(f$b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, f$b.class, "1")) {
          return;
       }
       d uod = this.b.u.b();
       Objects.requireNonNull(uod);
       if (!PatchProxy.isSupport(d.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), uod, d.class, "2")) {
          Iterator iterator = uod.a.iterator();
          while (iterator.hasNext()) {
             iterator.next().onPageScrolled(p0, p1, p2);
          }
       }
       return;
    }
    public void onPageSelected(int p0){
       f$b uob = f$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "2")) {
          return;
       }
       d uod = this.b.u.b();
       Objects.requireNonNull(uod);
       d uod1 = d.class;
       if (!PatchProxy.isSupport(uod1) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), uod, uod1, "3")) {
          uod.b = p0;
          Iterator iterator = uod.a.iterator();
          while (iterator.hasNext()) {
             iterator.next().onPageSelected(p0);
          }
       }
       return;
    }
}
