package androidx.viewpager.widget.OptimizedViewPager$b;
import androidx.viewpager.widget.ViewPager$l;
import androidx.viewpager.widget.OptimizedViewPager;

public class OptimizedViewPager$b extends ViewPager$l	// class@000a02
{
    public final OptimizedViewPager b;

    public void OptimizedViewPager$b(OptimizedViewPager p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
       OptimizedViewPager$b tb = this.b;
       tb.b = p0;
       tb.j();
    }
}
