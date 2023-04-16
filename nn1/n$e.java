package nn1.n$e;
import z0.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotPhotoViewData;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPhoto;

public final class n$e implements a	// class@003391
{

    public void n$e(){
       super();
    }
    public final Object apply(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, n$e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = p0.mPhotoFeedView;
       p0 = (p0 != null)? p0.getUser(): null;
       return p0;
    }
}
