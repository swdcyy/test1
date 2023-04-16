package nn1.h$d;
import z0.a;
import java.lang.Object;
import com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotLiveViewData;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kwai.framework.model.user.User;

public final class h$d implements a	// class@003386
{

    public void h$d(){
       super();
    }
    public final Object apply(Object p0){
       p0 = p0.mLiveStreamView;
       if (p0 != null) {
          p0 = p0.mUser;
          if (p0 != null) {
             p0 = p0.mName;
          label_000e :
             if (p0 == null) {
                p0 = "";
             }
             return p0;
          }
       }
       p0 = null;
       goto label_000e ;
    }
}
