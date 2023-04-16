package dfc.z$a;
import androidx.viewpager.widget.ViewPager$l;
import dfc.z;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import hf5.e;
import com.yxcorp.gifshow.entity.QPhoto;
import sy6.a;

public class z$a extends ViewPager$l	// class@0021be
{
    public final z b;

    public void z$a(z p0){
       this.b = p0;
       super();
    }
    public void onPageSelected(int p0){
       z$a uoa = z$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       if (!this.b.p.i4() - null) {
          z$a tb = this.b;
          z u = tb.u;
          if (u == null) {
             return;
          }else {
             tb.P8(u);
             tb.u = null;
          }
       }else {
          uoa = this.b;
          if (p0 > uoa.t) {
             z u1 = uoa.u;
             if (u1 != null) {
                uoa.P8(u1);
             }
             uoa = this.b;
             uoa.u = uoa.r.getCurrentPhoto();
          }
          this.b.t = p0;
       }
       return;
    }
}
