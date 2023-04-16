package fia.z$c;
import androidx.viewpager.widget.ViewPager$i;
import fia.z;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;

public final class z$c implements ViewPager$i	// class@00293f
{
    public final z b;

    public void z$c(z p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
       z$c tb = this.b;
       boolean b = (!p0)? true: false;
       tb.K = b;
       return;
    }
    public void onPageScrolled(int p0,float p1,int p2){
    }
    public void onPageSelected(int p0){
       if (PatchProxy.isSupport(z$c.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, z$c.class, "1")) {
          return;
       }
       this.b.a9();
       this.b.V8();
       return;
    }
}
