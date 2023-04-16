package hn1.c;
import z0.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ln1.b;
import java.util.Objects;
import com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotLiveViewData;

public final class c implements a	// class@002718
{

    public void c(){
       super();
    }
    public final Object apply(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(p0, "null cannot be cast to non-null type com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotLiveViewData");
       return p0;
    }
}
