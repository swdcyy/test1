package cb2.h$b;
import androidx.viewpager.widget.ViewPager$i;
import cb2.h;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;

public class h$b implements ViewPager$i	// class@000508
{
    public final h b;

    public void h$b(h p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
       h$b uob = h$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "1")) {
          return;
       }
       if (p0 == 1) {
          this.b.a9();
       }
       return;
    }
    public void onPageScrolled(int p0,float p1,int p2){
    }
    public void onPageSelected(int p0){
    }
}
