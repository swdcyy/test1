package k99.d0$b;
import androidx.viewpager.widget.ViewPager$l;
import k99.d0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.Objects;
import xtd.g;

public final class d0$b extends ViewPager$l	// class@002b6f
{
    public final d0 b;

    public void d0$b(d0 p0){
       this.b = p0;
       super();
    }
    public void onPageSelected(int p0){
       d0$b uob = d0$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "1")) {
          return;
       }
       d0 q = this.b.q;
       if (q == null) {
          a.S("mPhoto");
       }
       if (p0 == (q.getAtlasListSize() - 1)) {
          this.b.P8();
       }else {
          d0$b tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(null, tb, d0.class, "5")) {
             d0 p = tb.p;
             if (p != null) {
                p.detach();
             }
          }
       }
       return;
    }
}
