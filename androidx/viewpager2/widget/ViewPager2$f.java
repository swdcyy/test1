package androidx.viewpager2.widget.ViewPager2$f;
import androidx.viewpager2.widget.ViewPager2$e;
import androidx.viewpager2.widget.ViewPager2;
import androidx.viewpager2.widget.ViewPager2$a;
import b2.d;
import b2.d$a;
import java.lang.IllegalStateException;
import java.lang.CharSequence;

public class ViewPager2$f extends ViewPager2$e	// class@000a33
{
    public final ViewPager2 b;

    public void ViewPager2$f(ViewPager2 p0){
       this.b = p0;
       super(p0, null);
    }
    public boolean b(int p0){
       boolean b = (p0 == 8192 || (p0 == 4096 && !this.b.h()))? true: false;
       return b;
    }
    public void j(d p0){
       if (!this.b.h()) {
          p0.R(d$a.r);
          p0.R(d$a.q);
          p0.w0(false);
       }
       return;
    }
    public boolean k(int p0){
       if (this.b(p0)) {
          return false;
       }
       throw new IllegalStateException();
    }
    public CharSequence n(){
       if (this.d()) {
          return "androidx.viewpager.widget.ViewPager";
       }
       throw new IllegalStateException();
    }
}
