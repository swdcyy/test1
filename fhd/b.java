package fhd.b;
import fhd.d;
import jhc.d;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.settings.stencil.entity.SettingItemStencil;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import jhc.c;
import java.util.Collection;

public final class b extends d	// class@000e3b
{
    public final d a;

    public void b(d p0){
       a.p(p0, "offlineItemStencilParser");
       super();
       this.a = p0;
    }
    public List c(BaseFragment p0,SettingItemStencil p1,String p2){
       List obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "targetFragment");
       a.p(p1, "data");
       a.p(p2, "pageKey");
       obj = this.a.e(p0, p1, p2);
       if (obj.isEmpty() ^ 0x01) {
          return obj;
       }
       return super.c(p0, p1, p2);
    }
    public List e(BaseFragment p0,Object p1,String p2){
       return this.c(p0, p1, p2);
    }
}
