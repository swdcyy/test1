package eia.a0;
import eia.w;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideUnFollowPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;

public class a0 extends w	// class@002688
{

    public void a0(NasaSlideParam p0){
       super(p0);
    }
    public void P8(NasaSlideParam p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a0.class, "1")) {
          return;
       }
       this.U7(new FollowSlideUnFollowPresenter());
       return;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(a0.class, null);
       return objectsByTag;
    }
}
