package androidx.core.view.ScrollStrategyViewPager$a;
import androidx.viewpager.widget.ViewPager$l;
import androidx.core.view.ScrollStrategyViewPager;
import androidx.core.view.ScrollStrategy;

public class ScrollStrategyViewPager$a extends ViewPager$l	// class@00071a
{
    public final ScrollStrategyViewPager b;

    public void ScrollStrategyViewPager$a(ScrollStrategyViewPager p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
       if (p0 == 1) {
          ScrollStrategyViewPager$a tb = this.b;
          if (tb.p == ScrollStrategy.ONLY_FIRST_TWO_TOUCH_SCROLL) {
             tb.w();
          }
       }
       return;
    }
}
