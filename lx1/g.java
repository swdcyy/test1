package lx1.g;
import erd.g;
import com.kuaishou.live.common.core.component.sceneactivitywidget.container.SceneActivityWidgetBannerView;
import java.lang.Object;
import java.lang.Long;
import java.util.List;
import com.kwai.library.widget.viewpager.VerticalViewPager;

public final class g implements g	// class@003072
{
    public final SceneActivityWidgetBannerView b;

    public void g(SceneActivityWidgetBannerView p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       g tb = this.b;
       if (tb.b == null && tb.g.size() > 1) {
          p0 = tb.h;
          p0.I((p0.getCurrentItem() + 1), 1);
       }
       return;
    }
}
