package k99.r$f;
import java.lang.Runnable;
import k99.r;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.widget.viewpager.PhotosViewPager;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager$i;

public final class r$f implements Runnable	// class@002b94
{
    public final r b;

    public void r$f(r p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, r$f.class, "1")) {
          return;
       }
       r$f tb = this.b;
       tb.O.onPageSelected(r.V8(tb).getCurrentItem());
       return;
    }
}
