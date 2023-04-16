package k99.r$d;
import java.lang.Runnable;
import k99.r;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tp7.a;
import kotlin.jvm.internal.a;
import com.kwai.feature.api.feed.detail.router.biz.normal.NormalDetailBizParam;
import com.yxcorp.gifshow.entity.QPhoto;
import nsd.u;

public final class r$d implements Runnable	// class@002b92
{
    public final r b;

    public void r$d(r p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, r$d.class, "1")) {
          return;
       }
       r$d tb = this.b;
       r f = tb.F;
       if (f == null) {
          a.S("mNormalDetailBizParam");
       }
       a uoa = new a(f.mStartImageIndex, r.S8(this.b).getAtlasListSize(), false, 0, 12, null);
       tb.a9(v1);
       PatchProxy.onMethodExit(r$d.class, "1");
       return;
    }
}
