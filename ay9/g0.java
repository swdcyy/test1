package ay9.g0;
import java.lang.Runnable;
import ay9.h0;
import com.kwai.component.photo.detail.core.tag.TagPackageListHelper;
import java.util.Map;
import java.lang.Object;
import ay9.q;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import ay9.k0;

public final class g0 implements Runnable	// class@0002f6
{
    public final h0 b;
    public final TagPackageListHelper c;
    public final Map d;

    public void g0(h0 p0,TagPackageListHelper p1,Map p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       g0 tb = this.b;
       g0 td = this.d;
       q v = tb.v;
       ArrayList uArrayList = new ArrayList(this.c.c());
       q w = tb.w;
       if (PatchProxy.applyVoidFourRefs(v, uArrayList, td, w, null, h0.class, "7")) {
       }else {
          k0.a(v, uArrayList, td, w);
       }
       return;
    }
}
