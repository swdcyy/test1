package aw6.f;
import tl8.g;
import java.lang.Object;
import com.kwai.library.widget.viewpager.VerticalViewPager;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;

public final class f implements g	// class@00038b
{
    public final int a;

    public void f(int p0){
       this.a = p0;
    }
    public final void apply(Object p0){
       p0.setOffscreenPageLimit(this.a);
    }
}
