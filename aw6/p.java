package aw6.p;
import tl8.g;
import tw6.e;
import java.lang.Object;
import com.kwai.library.groot.slide.viewpager.KwaiGrootViewPager;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.kwai.library.groot.framework.viewpager.GrootTouchViewPager;
import java.util.List;

public final class p implements g	// class@000395
{
    public final e a;

    public void p(e p0){
       this.a = p0;
    }
    public final void apply(Object p0){
       p ta = this.a;
       if (!p0.C1.contains(ta)) {
          p0.C1.add(ta);
       }
       return;
    }
}
