package h63.j$b;
import h47.a;
import h63.j;
import java.lang.Object;
import com.kwai.live.gzone.common.LiveGzoneConfigResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import java.util.List;
import java.lang.Throwable;

public class j$b implements a	// class@002c83
{
    public final j a;

    public void j$b(j p0){
       this.a = p0;
       super();
    }
    public void a(LiveGzoneConfigResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j$b.class, "1")) {
          return;
       }
       if (q.f(p0.mTabs)) {
          j$b ta = this.a;
          ta.R8(ta.P8());
       }else {
          this.a.R8(p0.mTabs);
       }
       return;
    }
    public void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j$b.class, "2")) {
          return;
       }
       j$b ta = this.a;
       ta.R8(ta.P8());
       return;
    }
}
