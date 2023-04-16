package ay9.z;
import java.lang.Runnable;
import ay9.a0;
import com.kwai.component.photo.detail.core.tag.TagPackageListHelper;
import java.util.Map;
import java.lang.Object;
import ay9.q;
import java.util.List;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import ay9.k0;

public final class z implements Runnable	// class@000311
{
    public final a0 b;
    public final TagPackageListHelper c;
    public final Map d;

    public void z(a0 p0,TagPackageListHelper p1,Map p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       z tb = this.b;
       k0.a(tb.v, this.c.c(), this.d, tb.w);
    }
}
