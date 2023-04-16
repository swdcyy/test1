package i21.d$b;
import erd.o;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse$LiveCohesionPkJoinState;
import kotlin.jvm.internal.a;

public final class d$b implements o	// class@00280e
{
    public static final d$b b;

    static {
       d$b.b = new d$b();
    }
    public void d$b(){
       super();
    }
    public Object apply(Object p0){
       LiveTimeConsumingUserStatusResponse liveTimeCons = PatchProxy.applyOneRefs(p0, this, d$b.class, "1");
       if (liveTimeCons != PatchProxyResult.class) {
       }else {
          a.p(p0, "response");
          liveTimeCons = p0.mLiveCohesionPkJoinState;
       }
       return liveTimeCons;
    }
}
