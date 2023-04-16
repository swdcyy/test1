package mg.k$f;
import erd.o;
import com.kwai.feature.post.api.feature.bridge.JSGetEligibleDraftDataParams;
import java.lang.Object;
import om6.d;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.List;
import brd.t;

public final class k$f implements o	// class@00261e
{
    public final JSGetEligibleDraftDataParams b;

    public void k$f(JSGetEligibleDraftDataParams p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       Object obj = p0;
       a.p(obj, "it");
       p0 = this.b;
       return obj.V50(p0.mStartTime, p0.mEndTime, p0.mLimitNumber, p0.mPublishIntervalTime, p0.mFilterAutoSaved, p0.mFilterPublished, p0.mFilterBlackList, p0.mExtraParams);
    }
}
