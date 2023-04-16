package i21.d$d;
import erd.o;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.basic.model.LivePkRecommendGiftInfo;
import kotlin.jvm.internal.a;

public final class d$d implements o	// class@002810
{
    public static final d$d b;

    static {
       d$d.b = new d$d();
    }
    public void d$d(){
       super();
    }
    public Object apply(Object p0){
       LiveTimeConsumingUserStatusResponse liveTimeCons = PatchProxy.applyOneRefs(p0, this, d$d.class, "1");
       if (liveTimeCons != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          liveTimeCons = p0.mLivePkRecommendGiftInfo;
       }
       return liveTimeCons;
    }
}
