package k6a.a;
import z0.a;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.c;
import java.lang.Object;
import com.kwai.framework.model.user.RecoUser;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.entity.NasaRecommendUserFeed;
import java.util.List;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.entity.RecommendUserMeta;

public final class a implements a	// class@002be8
{
    public final c a;

    public void a(c p0){
       this.a = p0;
    }
    public final Object apply(Object p0){
       boolean b;
       a ta = this.a;
       Objects.requireNonNull(ta);
       RecoUser mUser = p0.mUser;
       Object obj = PatchProxy.applyOneRefsWithListener(mUser, ta, c.class, "3");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(ta.n.mRecommendUserMeta.getUsers() == null){
          b = false;
          PatchProxy.onMethodExit(c.class, "3");
       }else {
          b = ta.n.mRecommendUserMeta.getUsers().contains(mUser);
          PatchProxy.onMethodExit(c.class, "3");
       }
       p0 = (b)? null: p0.mUser;
       return p0;
    }
}
