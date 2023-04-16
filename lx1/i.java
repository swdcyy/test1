package lx1.i;
import java.lang.Runnable;
import com.kuaishou.live.common.core.component.sceneactivitywidget.container.SceneActivityWidgetBannerView;
import java.lang.Object;
import androidx.viewpager.widget.ViewPager$l;

public final class i implements Runnable	// class@003074
{
    public final SceneActivityWidgetBannerView b;

    public void i(SceneActivityWidgetBannerView p0){
       this.b = p0;
    }
    public final void run(){
       this.b.l.onPageSelected(0);
    }
}
