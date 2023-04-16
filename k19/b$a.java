package k19.b$a;
import com.kwai.library.widget.viewpager.RecyclerViewPager$c;
import k19.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.widget.LinearLayout;
import java.lang.StringBuilder;
import yx.j0;
import com.kwai.library.widget.pageindicator.PagerIndicator;
import android.os.Handler;
import com.kwai.library.widget.viewpager.RecyclerViewPager$b;

public class b$a implements RecyclerViewPager$c	// class@002a79
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public void a(int p0,int p1){
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       b$a ta = this.a;
       ta.d = p0;
       ta = ta.a(p0, ta.b.getChildCount());
       Object[] objArray = new Object[0];
       j0.a("AdDetailECommerceBannerCycleHelper", "onPageSelected pos: "+p0+", realIndex: "+ta, objArray);
       this.a.b.g(ta);
       this.a.i.removeMessages(0);
       b$a ta1 = this.a;
       ta1.i.sendEmptyMessageDelayed(0, ta1.g);
       b f = this.a.f;
       if (f != null) {
          f.c(ta);
       }
       return;
    }
    public void onPageScrollStateChanged(int p0){
    }
    public void onPageScrolled(int p0,float p1,int p2){
    }
}
