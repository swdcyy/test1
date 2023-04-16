package androidx.viewpager.widget.OptimizedViewPager$a;
import androidx.viewpager.widget.ViewPager$i;
import androidx.viewpager.widget.OptimizedViewPager;
import java.lang.Object;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class OptimizedViewPager$a implements ViewPager$i	// class@000a01
{
    public final OptimizedViewPager b;

    public void OptimizedViewPager$a(OptimizedViewPager p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
       OptimizedViewPager g = this.b.g;
       if (g != null) {
          Iterator iterator = g.iterator();
          while (iterator.hasNext()) {
             iterator.next().onPageScrollStateChanged(p0);
          }
       }
       return;
    }
    public void onPageScrolled(int p0,float p1,int p2){
       OptimizedViewPager g = this.b.g;
       if (g != null) {
          Iterator iterator = g.iterator();
          while (iterator.hasNext()) {
             iterator.next().onPageScrolled(p0, p1, p2);
          }
       }
       return;
    }
    public void onPageSelected(int p0){
       this.b.n(p0);
       OptimizedViewPager g = this.b.g;
       if (g != null) {
          Iterator iterator = g.iterator();
          while (iterator.hasNext()) {
             iterator.next().onPageSelected(p0);
          }
       }
       return;
    }
}
