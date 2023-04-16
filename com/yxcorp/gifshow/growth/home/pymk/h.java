package com.yxcorp.gifshow.growth.home.pymk.h;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.growth.home.pymk.i;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.ja;
import java.util.Objects;
import qvb.a;
import com.kwai.framework.model.user.User;
import jga.f$a;
import jga.c;
import wca.b;
import jga.f;
import brd.t;
import com.yxcorp.gifshow.entity.helper.FollowHelper;
import vna.v;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.framework.model.user.User$FollowStatus;
import lu7.f;
import com.yxcorp.gifshow.entity.helper.FollowHelper$a;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import java.lang.Integer;
import io.reactivex.subjects.PublishSubject;
import k6a.u;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public class h extends m	// class@0013a6
{
    public final i c;

    public void h(i p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
          return;
       }
       ja.a();
       h tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, i.class, "7") && !tc.p.isEmpty()) {
          User user = tc.P8();
          if (user != null) {
             f$a uoa = new f$a(user, String.valueOf(187));
             uoa.i(b.h(user.getId(), 74));
             uoa.l(String.valueOf(187));
             uoa = uoa.h(user.mFollowActionReasonTextId);
             b = true;
             uoa.q(b);
             f uof = uoa.b();
             String str = null;
             if (user.isFollowingOrFollowRequesting()) {
                tc.X7(FollowHelper.k(uof).subscribe(new v(tc)));
                f.m(user, User$FollowStatus.UNFOLLOW);
                b = 0;
             }else {
                FollowHelper.c(uof, tc.x);
                f.m(user, User$FollowStatus.FOLLOWING);
                i.e(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f101020), str);
                tc.R8();
                tc.r.onNext(Integer.valueOf(300));
             }
             i w = tc.w;
             String id = user.getId();
             if (!PatchProxy.isSupport2(u.class, "22") || !PatchProxy.applyVoidThreeRefsWithListener(w, id, Integer.valueOf(b), null, u.class, "22")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "RECOMMEND_PYMK_CARD_FOLLOW_BUTTON";
                i3 oi3 = i3.f();
                oi3.d("follow_user_id", id);
                id = (!b)? "unfollow": "follow";
                oi3.d("follow_status", id);
                uElementPack.params = oi3.e();
                u1.M(null, w, 1, uElementPack, null, null);
                PatchProxy.onMethodExit(u.class, "22");
             }
          }
       }
       return;
    }
}
