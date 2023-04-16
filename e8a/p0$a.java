package e8a.p0$a;
import com.yxcorp.gifshow.widget.m;
import e8a.p0;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.framework.model.user.User;
import com.kwai.feature.api.router.social.profile.ProfileStartParam;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import tkd.b;
import tkd.d;
import vu5.b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class p0$a extends m	// class@0020ca
{
    public final p0 c;

    public void p0$a(p0 p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p0$a.class, "1")) {
          return;
       }
       p0$a tc = this.c;
       Objects.requireNonNull(tc);
       p0 op0 = p0.class;
       if (!PatchProxy.applyVoid(null, tc, op0, "5")) {
          p0 s = tc.s;
          if (!PatchProxy.applyVoidOneRefs(s, tc, op0, "6")) {
             ProfileStartParam profileStart = ProfileStartParam.l(s);
             if (tc.getActivity() instanceof GifshowActivity) {
                d.a(-1718536792).Y7(tc.getActivity(), profileStart);
             }
          }
          if (!PatchProxy.applyVoid(null, tc, op0, "7")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "USER_PROFILE_RECOMMENDED";
             uElementPack.params = tc.t;
             u1.u(1, uElementPack, null);
          }
       }
       return;
    }
}
