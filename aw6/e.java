package aw6.e;
import tl8.g;
import java.lang.Object;
import com.kwai.library.groot.slide.viewpager.KwaiGrootViewPager;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.kwai.library.groot.framework.viewpager.GrootTouchViewPager;
import java.util.Collection;
import ow6.a;
import java.util.Iterator;
import java.util.List;
import tw6.e;

public final class e implements g	// class@00038a
{
    public final int a;

    public void e(int p0){
       this.a = p0;
    }
    public final void apply(Object p0){
       e ta = this.a;
       if (a.c(p0.C1)) {
       }else {
          p0 = p0.C1.iterator();
          while (p0.hasNext()) {
             p0.next().a(ta);
          }
       }
       return;
    }
}
