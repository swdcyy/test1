package hn1.c0$b;
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

public final class c0$b implements a	// class@002713
{

    public void c0$b(){
       super();
    }
    public final Object apply(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c0$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.mLiveStreamView.mLiveStreamModel.getLiveCoverWidgetModel(2);
    }
}
