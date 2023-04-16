package g72.n;
import c12.f;
import com.kuaishou.live.core.basic.model.LiveUserStatusResponse;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import t02.a0;
import tl2.a;
import com.kwai.framework.model.user.UserExtraInfo;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.show.template.a$e;
import com.kuaishou.live.core.show.wealthgrade.b$c;
import java.lang.Boolean;
import brd.t;
import ry1.b;
import g72.l;
import brd.w;
import erd.c;
import g72.m;
import erd.g;
import crd.b;

public class n extends f	// class@002a8c
{
    public a0 K;
    public a$e L;
    public b$c M;
    public static String sLivePresenterClassName = "LiveSelfEnterRoomPresenter";

    public void n(){
       super();
    }
    public final UserInfo a9(LiveUserStatusResponse p0){
       UserInfo obj = PatchProxy.applyOneRefs(p0, this, n.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.a(this.K);
       obj.mExtraInfo.mAssistantType = p0.mAssistantType;
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, n.class, "1")) {
          return;
       }
       super.j8();
       this.K = this.q8(a0.class);
       this.L = this.s8(a$e.class);
       this.M = this.s8(b$c.class);
       return;
    }
    public void x(boolean p0){
       n on = n.class;
       if (PatchProxy.isSupport(on) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, on, "2")) {
          return;
       }
       this.X7(t.zip(this.K.b3.T3(), this.K.b3.W(), new l(this)).subscribe(new m(this)));
       return;
    }
}
