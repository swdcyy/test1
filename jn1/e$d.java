package jn1.e$d;
import z0.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotDetailExplainData;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class e$d implements a	// class@002bd4
{

    public void e$d(){
       super();
    }
    public final Object apply(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = (p0 != null)? p0.mRelatedHotSpots: null;
       if (p0 == null) {
          p0 = CollectionsKt__CollectionsKt.E();
       }
       return p0;
    }
}
