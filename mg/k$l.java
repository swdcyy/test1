package mg.k$l;
import erd.o;
import com.kwai.feature.post.api.feature.bridge.JsGetPublishedDataParams;
import java.lang.Object;
import om6.d;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.List;
import brd.t;

public final class k$l implements o	// class@002624
{
    public final JsGetPublishedDataParams b;

    public void k$l(JsGetPublishedDataParams p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       a.p(p0, "it");
       k$l tb = this.b;
       return p0.w9(tb.mLimitNumber, tb.mExtraParams);
    }
}
