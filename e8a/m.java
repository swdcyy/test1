package e8a.m;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.e;
import java.lang.Object;
import dm6.f;
import com.kwai.library.groot.slide.viewpager.KwaiGrootViewPager;
import java.lang.Class;
import com.kwai.library.widget.viewpager.VerticalViewPager;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import fx6.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import e8a.n;
import ew6.b;

public final class m implements g	// class@0020c1
{
    public final e b;

    public void m(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       m tb = this.b;
       b uob = tb.P8();
       p0.r(tb.p, tb.q.d1(KwaiGrootViewPager.class), uob);
       if (uob == null) {
          tb.q.R(new n(tb, p0));
       }
       return;
    }
}
