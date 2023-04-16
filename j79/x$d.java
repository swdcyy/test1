package j79.x$d;
import erd.g;
import j79.x;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.album.preview.PreviewViewPager;
import com.yxcorp.gifshow.album.viewbinder.AbsPreviewFragmentViewBinder;
import h3.a;
import androidx.viewpager.widget.ViewPager;
import com.yxcorp.gifshow.album.preview.d;
import u79.o;
import u79.a;
import com.yxcorp.gifshow.album.widget.preview.f;

public final class x$d implements g	// class@00279b
{
    public final x b;

    public void x$d(x p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x$d.class, "1")) {
       }else {
          a.h(p0, "open");
          f uof = null;
          if (p0.booleanValue()) {
             p0 = this.b.m.p();
             p0 = (p0 != null)? p0.getAdapter(): uof;
             if (!p0 instanceof d) {
                p0 = uof;
             }
             p0 = (p0 != null)? p0.C(): uof;
             if (p0 instanceof f) {
                uof = p0;
             }
             if (uof != null) {
                uof.t();
             }
          }else {
             p0 = this.b.m.p();
             p0 = (p0 != null)? p0.getAdapter(): uof;
             if (!p0 instanceof d) {
                p0 = uof;
             }
             p0 = (p0 != null)? p0.C(): uof;
             if (p0 instanceof f) {
                uof = p0;
             }
             if (uof != null) {
                uof.p();
             }
          }
       }
       return;
    }
}
