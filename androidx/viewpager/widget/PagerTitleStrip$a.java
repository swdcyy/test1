package androidx.viewpager.widget.PagerTitleStrip$a;
import androidx.viewpager.widget.ViewPager$i;
import androidx.viewpager.widget.ViewPager$h;
import android.database.DataSetObserver;
import androidx.viewpager.widget.PagerTitleStrip;
import androidx.viewpager.widget.ViewPager;
import h3.a;

public class PagerTitleStrip$a extends DataSetObserver implements ViewPager$i, ViewPager$h	// class@000a07
{
    public int b;
    public final PagerTitleStrip c;

    public void PagerTitleStrip$a(PagerTitleStrip p0){
       this.c = p0;
       super();
    }
    public void a(ViewPager p0,a p1,a p2){
       this.c.b(p1, p2);
    }
    public void onChanged(){
       PagerTitleStrip$a tc = this.c;
       tc.c(tc.b.getCurrentItem(), this.c.b.getAdapter());
       tc = this.c;
       PagerTitleStrip g = tc.g;
       if (g - null >= 0) {
       }else {
          g = 0;
       }
       tc.d(tc.b.getCurrentItem(), g, true);
       return;
    }
    public void onPageScrollStateChanged(int p0){
       this.b = p0;
    }
    public void onPageScrolled(int p0,float p1,int p2){
       if (p1 - 0x3f000000 > 0) {
          p0++;
       }
       this.c.d(p0, p1, false);
       return;
    }
    public void onPageSelected(int p0){
       if (this.b == null) {
          PagerTitleStrip$a tc = this.c;
          tc.c(tc.b.getCurrentItem(), this.c.b.getAdapter());
          tc = this.c;
          PagerTitleStrip g = tc.g;
          if (g - null < 0) {
             g = 0;
          }
          tc.d(tc.b.getCurrentItem(), g, true);
       }
       return;
    }
}
