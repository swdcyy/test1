package m6a.w;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import k2b.e0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public class w	// class@002f64
{

    public void w(){
       super();
    }
    public static void a(User p0,e0 p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, null, w.class, "1")) {
          return;
       }
       if (p0 == null || ("empty").equals(p0.mId)) {
          PatchProxy.onMethodExit(w.class, "1");
          return;
       }else {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "USER_RECO_CARD";
          i3 oi3 = i3.f();
          oi3.d("live_id", p0.mLiveStreamId);
          oi3.d("user_id", p0.mId);
          uElementPack.params = oi3.e();
          u1.D0(null, p1, 3, uElementPack, null, null);
          PatchProxy.onMethodExit(w.class, "1");
          return;
       }
    }
}
