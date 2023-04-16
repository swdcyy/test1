package on1.c$b;
import z0.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotDetailRelatedAnchorData;
import java.util.ArrayList;
import com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotDetailRelatedAnchorData$AuthorInfo;
import java.util.Collection;
import trd.y;

public final class c$b implements a	// class@003545
{

    public void c$b(){
       super();
    }
    public final Object apply(Object p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, c$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       p0 = (p0 != null)? p0.authorInfos: null;
       if (p0 == null) {
          p0 = new LiveHotSpotDetailRelatedAnchorData$AuthorInfo[0];
       }
       y.s0(obj, p0);
       return obj;
    }
}
