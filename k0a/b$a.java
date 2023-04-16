package k0a.b$a;
import androidx.viewpager.widget.ViewPager$i;
import k0a.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import sy6.a;

public class b$a implements ViewPager$i	// class@002b90
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
    }
    public void onPageScrolled(int p0,float p1,int p2){
    }
    public void onPageSelected(int p0){
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       this.b.P8(this.b.v.a0());
       return;
    }
}
