package hn1.f$c;
import z0.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailCoreMediaData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class f$c implements a	// class@00272b
{

    public void f$c(){
       super();
    }
    public final Object apply(Object p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, f$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          obj = new ArrayList();
          LiveHotSpotDetailCoreMediaData liveViews = p0.liveViews;
          if (liveViews != null) {
             obj.addAll(liveViews);
          }
          p0 = p0.photoViews;
          if (p0 != null) {
             obj.addAll(p0);
          }
       }else {
          obj = null;
       }
       return obj;
    }
}
