package jn1.e$e;
import z0.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotDetailExplainData;
import java.lang.Integer;

public final class e$e implements a	// class@002bd5
{

    public void e$e(){
       super();
    }
    public final Object apply(Object p0){
       int i;
       Object obj = PatchProxy.applyOneRefs(p0, this, e$e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = (p0 != null)? p0.mDisplayRowCount: 0;
       return Integer.valueOf(p0);
    }
}
