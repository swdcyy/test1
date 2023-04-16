package aw6.h;
import tl8.g;
import java.lang.Object;
import com.kwai.library.widget.viewpager.VerticalViewPager;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import android.view.ViewGroup;

public final class h implements g	// class@00038d
{
    public final int a;
    public final int b;

    public void h(int p0,int p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void apply(Object p0){
       p0.scrollTo(this.a, this.b);
    }
}
