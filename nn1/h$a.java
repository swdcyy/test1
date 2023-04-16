package nn1.h$a;
import z0.a;
import java.lang.Object;
import com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotLiveViewData;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.android.model.mix.CoverMeta;
import com.yxcorp.gifshow.model.CDNUrl;

public final class h$a implements a	// class@003383
{

    public void h$a(){
       super();
    }
    public final Object apply(Object p0){
       p0 = p0.mLiveStreamView;
       if (p0 != null) {
          p0 = p0.mCoverMeta;
          if (p0 != null) {
             p0 = p0.mCoverThumbnailUrls;
          label_000e :
             if (p0 == null) {
                p0 = new CDNUrl[0];
             }
             return p0;
          }
       }
       p0 = null;
       goto label_000e ;
    }
}
