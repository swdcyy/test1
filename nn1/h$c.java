package nn1.h$c;
import z0.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotLiveViewData;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kwai.framework.model.user.User;

public final class h$c implements a	// class@003385
{

    public void h$c(){
       super();
    }
    public final Object apply(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = p0.mLiveStreamView;
       if (p0 != null) {
          p0 = p0.mUser;
          if (p0 != null) {
             p0 = p0.getAvatars();
          label_001d :
             if (p0 == null) {
                p0 = new CDNUrl[0];
             }
             return p0;
          }
       }
       p0 = null;
       goto label_001d ;
    }
}
