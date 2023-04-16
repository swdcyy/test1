package c5a.l$a;
import androidx.viewpager.widget.ViewPager$l;
import c5a.l;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;

public class l$a extends ViewPager$l	// class@000554
{
    public final l b;

    public void l$a(l p0){
       this.b = p0;
       super();
    }
    public void onPageSelected(int p0){
       if (PatchProxy.isSupport(l$a.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, l$a.class, "1")) {
          return;
       }
       this.b.P8();
       return;
    }
}
