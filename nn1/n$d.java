package nn1.n$d;
import z0.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotPhotoViewData;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.entity.QPhoto;

public final class n$d implements a	// class@003390
{

    public void n$d(){
       super();
    }
    public final Object apply(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, n$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = p0.mPhotoFeedView;
       p0 = (p0 != null)? p0.getCoverThumbnailUrls(): null;
       if (p0 == null) {
          p0 = new CDNUrl[0];
       }
       return p0;
    }
}
