package e72.q;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import wkd.b;
import com.kwai.framework.perf.phonelevel.d;
import com.yxcorp.utility.SystemUtil;
import yp.x;
import com.yxcorp.gifshow.model.LivePlayConfig;
import com.yxcorp.gifshow.follow.config.util.FollowConfigUtil;
import kp.r1;

public class q	// class@002691
{

    public void q(){
       super();
    }
    public static boolean a(BaseFeed p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       q oq = q.class;
       Object obj = PatchProxy.applyOneRefs(p0, null, oq, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (b.a(-404437045).g()) {
          return b;
       }
       Object obj1 = PatchProxy.apply(null, null, oq, "2");
       boolean b1 = (obj1 != patchProxyRe)? obj1.booleanValue(): SystemUtil.a(21);
       if (b1 && (x.t(p0) && (FollowConfigUtil.o() != null && (r1.P2(p0) || r1.f0(p0))))) {
          b = true;
       }
    label_0055 :
       return b;
    }
}
