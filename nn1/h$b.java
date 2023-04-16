package nn1.h$b;
import z0.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotLiveViewData;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.android.live.model.LiveCoverWidgetModel;
import com.kuaishou.android.live.model.LiveStreamModel;

public final class h$b implements a	// class@003384
{

    public void h$b(){
       super();
    }
    public final Object apply(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = p0.mLiveStreamView;
       if (p0 != null) {
          p0 = p0.mLiveStreamModel;
          if (p0 != null) {
             p0 = p0.getLiveCoverWidgetModel(2);
          label_001e :
             return p0;
          }
       }
       p0 = null;
       goto label_001e ;
    }
}
