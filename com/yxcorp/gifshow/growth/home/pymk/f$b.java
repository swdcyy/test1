package com.yxcorp.gifshow.growth.home.pymk.f$b;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.growth.home.pymk.f;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.framework.model.user.User;
import k6a.u;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import tkd.b;
import tkd.d;
import vu5.b;
import com.kwai.feature.api.router.social.profile.ProfileStartParam;

public class f$b extends m	// class@0013a2
{
    public final f c;

    public void f$b(f p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$b.class, "1")) {
          return;
       }
       f$b tc = this.c;
       Objects.requireNonNull(tc);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, tc, f.class, "18") && tc.getActivity() != null) {
          f m = tc.M;
          User mId = tc.E.mId;
          if (!PatchProxy.applyVoidTwoRefsWithListener(m, mId, objArray, u.class, "20")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "AVATAR_RECOMMEND_PYMK_ENTER_PROFILE_BUTTON";
             i3 oi3 = i3.f();
             oi3.d("click_user_id", mId);
             uElementPack.params = oi3.e();
             u1.M(null, m, 1, uElementPack, null, null);
             PatchProxy.onMethodExit(u.class, "20");
          }
          ProfileStartParam profileStart = ProfileStartParam.m(tc.E.mId);
          profileStart.r(tc.t);
          d.a(-1718536792).Kp(tc.getActivity(), profileStart);
       }
       return;
    }
}
