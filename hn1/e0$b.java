package hn1.e0$b;
import z0.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotPhotoViewData;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.entity.QPhoto;

public final class e0$b implements a	// class@002720
{

    public void e0$b(){
       super();
    }
    public final Object apply(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e0$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = p0.mPhotoFeedView;
       a.o(p0, "it.mPhotoFeedView");
       return p0.getCoverThumbnailUrls();
    }
}
