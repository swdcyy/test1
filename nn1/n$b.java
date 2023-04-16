package nn1.n$b;
import z0.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotPhotoViewData;
import com.yxcorp.gifshow.entity.QPhoto;

public final class n$b implements a	// class@00338e
{

    public void n$b(){
       super();
    }
    public final Object apply(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, n$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = p0.mPhotoFeedView;
       p0 = (p0 != null)? p0.getCaption(): null;
       if (p0 == null) {
          p0 = "";
       }
       return p0;
    }
}
