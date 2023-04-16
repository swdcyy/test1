package androidx.viewpager2.widget.ViewPager2$b;
import androidx.viewpager2.widget.ViewPager2$h;
import androidx.viewpager2.widget.ViewPager2;
import androidx.viewpager2.widget.ViewPager2$e;

public class ViewPager2$b extends ViewPager2$h	// class@000a2f
{
    public final ViewPager2 a;

    public void ViewPager2$b(ViewPager2 p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       if (!p0) {
          this.a.s();
       }
       return;
    }
    public void c(int p0){
       ViewPager2$b ta = this.a;
       if (ta.e != p0) {
          ta.e = p0;
          ta.u.p();
       }
       return;
    }
}
