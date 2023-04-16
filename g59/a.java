package g59.a;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.model.ReportAdLogActionParam;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import mxb.j0;
import mxb.i0;
import g59.a$a;
import erd.g;
import java.util.Map;

public final class a	// class@0023f4
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public static final void a(BaseFeed p0,ReportAdLogActionParam p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "1")) {
          return;
       }
       a.p(p0, "baseFeed");
       a.p(p1, "params");
       i0.a().e(p1.mAdActionType, p0).d(new a$a(p1)).o(p1.mClientExtData).a();
       return;
    }
}
