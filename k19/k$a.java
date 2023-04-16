package k19.k$a;
import com.kwai.library.widget.viewpager.RecyclerViewPager$b;
import k19.k;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import yx.j0;
import mxb.j0;
import com.yxcorp.gifshow.photoad.o;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import k19.j;
import erd.g;

public class k$a extends RecyclerViewPager$b	// class@002a84
{
    public final k a;

    public void k$a(k p0){
       this.a = p0;
       super();
    }
    public void c(int p0){
       k$a uoa = k$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       uoa = this.a;
       uoa.D = p0;
       if (uoa.I.contains(Integer.valueOf(p0))) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.a("AdDetailECommercePresenter", "log current item show", objArray);
       o.z().e(140, this.a.p.mEntity).d(new j(this, p0)).a();
       this.a.I.add(Integer.valueOf(p0));
       return;
    }
}
