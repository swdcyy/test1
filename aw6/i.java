package aw6.i;
import tl8.g;
import java.lang.Object;
import com.kwai.library.widget.viewpager.VerticalViewPager;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;

public final class i implements g	// class@00038e
{
    public final int a;
    public final boolean b;

    public void i(int p0,boolean p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void apply(Object p0){
       p0.I(this.a, this.b);
    }
}
