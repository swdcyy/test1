package d5c.j0;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$e;
import d5c.t0;
import java.lang.Object;
import android.widget.LinearLayout;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import android.widget.HorizontalScrollView;
import android.view.View;

public final class j0 implements PagerSlidingTabStrip$e	// class@0020fb
{
    public final t0 a;

    public void j0(t0 p0){
       this.a = p0;
    }
    public final void a(){
       j0 ta = this.a;
       t0 v = ta.v;
       if (v != null && ta.w != null) {
          int i = (v.getTabsContainer().getWidth() - ta.v.getWidth()) - 3;
          if (ta.v.getScrollX() >= i) {
             ta.w.setVisibility(8);
             ta.B = false;
          }else if(ta.v.getScrollX() < i){
             ta.w.setVisibility(false);
             ta.B = true;
          }
       }
       return;
    }
}
