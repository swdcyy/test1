package com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.d;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.b$a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.framework.model.user.User;
import jga.f$a;
import jga.c;
import wca.b;
import jga.f;
import com.yxcorp.gifshow.entity.helper.FollowHelper;
import com.kwai.framework.model.user.User$FollowStatus;
import lu7.f;
import m6a.w;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public class d extends m	// class@001791
{
    public final b$a c;

    public void d(b$a p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, d.class, "1")) {
          return;
       }
       d tc = this.c;
       Objects.requireNonNull(tc);
       Object[] objArray = null;
       if (!PatchProxy.applyVoidWithListener(objArray, tc, b$a.class, "12")) {
          if (tc.p.isFollowingOrFollowRequesting()) {
             PatchProxy.onMethodExit(b$a.class, "12");
          }else {
             int i = 224;
             f$a uoa = new f$a(tc.p, String.valueOf(i));
             uoa.i(b.h(tc.p.getId(), 74));
             uoa.l(String.valueOf(i));
             uoa = uoa.h(tc.p.mFollowActionReasonTextId);
             uoa.q(true);
             FollowHelper.b(uoa.b());
             f.m(tc.p, User$FollowStatus.FOLLOWING);
             b$a p = tc.p;
             if (!PatchProxy.applyVoidOneRefsWithListener(p, objArray, w.class, "3")) {
                if (p == null || ("empty").equals(p.mId)) {
                   PatchProxy.onMethodExit(w.class, "3");
                }else {
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action2 = "USER_RECO_CARD_BUTTON";
                   i3 oi3 = i3.f();
                   oi3.d("live_id", p.mLiveStreamId);
                   oi3.d("user_id", p.mId);
                   uElementPack.params = oi3.e();
                   u1.M(null, null, 1, uElementPack, null, null);
                   PatchProxy.onMethodExit(w.class, "3");
                }
             }
             PatchProxy.onMethodExit(b$a.class, "12");
          }
       }
       PatchProxy.onMethodExit(d.class, "1");
       return;
    }
}
