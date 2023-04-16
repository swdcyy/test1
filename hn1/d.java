package hn1.d;
import z0.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ln1.b;
import java.util.Objects;
import com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotPhotoViewData;

public final class d implements a	// class@00271e
{

    public void d(){
       super();
    }
    public final Object apply(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(p0, "null cannot be cast to non-null type com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotPhotoViewData");
       return p0;
    }
}
