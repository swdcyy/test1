package mg.k$c;
import erd.o;
import com.kwai.feature.post.api.feature.bridge.JsGetEditDraftDataParams;
import java.lang.Object;
import om6.d;
import java.lang.String;
import kotlin.jvm.internal.a;
import brd.t;

public final class k$c implements o	// class@00261b
{
    public final JsGetEditDraftDataParams b;

    public void k$c(JsGetEditDraftDataParams p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       a.p(p0, "it");
       k$c tb = this.b;
       return p0.DT(tb.mCount, tb.mPeriod, 500);
    }
}
