package mn1.d$a;
import z0.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotDetailItemData;
import fg6.a;
import kotlin.Result;
import com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotNormalMediaAreaData;
import com.google.gson.Gson;
import java.lang.Throwable;
import qrd.j0;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class d$a implements a	// class@0031d0
{

    public void d$a(){
       super();
    }
    public final Object apply(Object p0){
       Throwable obj = PatchProxy.applyOneRefs(p0, this, d$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = Result.constructor-impl(a.a.h(p0.content, LiveHotSpotNormalMediaAreaData.class));
       obj = Result.exceptionOrNull-impl(p0);
       if (obj != null) {
          b.Z(LiveLogTag.LIVE_HOT_SPOT, "DetailNormalMediaArea json parse error: "+obj);
          p0 = null;
       }
       return p0;
    }
}
