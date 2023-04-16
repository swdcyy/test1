package bh0.c;
import com.yxcorp.gifshow.widget.m;
import bh0.a;
import com.kuaishou.house.live.lottery.HouseLotteryPendantData;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import bh0.a$a;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.b;
import java.util.Objects;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import fq5.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import sr5.a;
import ah0.c;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.e0;
import k2b.u1;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;
import tkd.b;
import tkd.d;
import ou5.b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.feature.api.social.login.model.LoginParams$a;
import lnc.a1;
import com.kwai.feature.api.social.login.model.LoginParams;
import bh0.d;
import android.content.Context;
import n3d.a;

public final class c extends m	// class@000386
{
    public final a c;
    public final HouseLotteryPendantData d;

    public void c(a p0,HouseLotteryPendantData p1){
       this.c = p0;
       this.d = p1;
       super();
    }
    public void a(View p0){
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, c.class, "1")) {
          return;
       }
       b.P(a.G.a(), "click pendant with url : "+this.d.getMActionUrl());
       c tc = this.c;
       Objects.requireNonNull(tc);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, tc, uoa, "17")) {
          a v = tc.v;
          ClientContent$LiveStreamPackage liveStreamPa = (v != null)? v.a(): objArray;
          a v1 = tc.v;
          BaseFragment uBaseFragmen = (v1 != null)? v1.b(): objArray;
          if (uBaseFragmen != null && liveStreamPa != null) {
             a w = tc.w;
             if (w != null) {
                objArray = w.c0();
             }
             if (!PatchProxy.applyVoidThreeRefs(liveStreamPa, uBaseFragmen, objArray, null, c.class, "14")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "HOUSE_LOTTERY_PENDENT";
                ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                uContentPack.liveStreamPackage = liveStreamPa;
                u1.B(new ClickMetaData().setType(1).setLogPage(uBaseFragmen).setElementPackage(uElementPack).setContentPackage(uContentPack).setFeedLogCtx(objArray));
             }
          }
       }
    label_0099 :
       tc = this.c;
       c td = this.d;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoidOneRefs(td, tc, uoa, "13")) {
          QCurrentUser mE = QCurrentUser.ME;
          a.o(mE, "QCurrentUser.ME");
          if (!mE.isLogined()) {
             LoginParams$a uoa1 = new LoginParams$a();
             uoa1.d(a1.p(R.string.arg_RES_7f103078));
             d.a(-1712118428).x00(tc.getActivity(), 0, uoa1.a(), new d(tc, td));
          }else {
             tc.W8(td);
          }
       }
       PatchProxy.onMethodExit(c.class, "1");
       return;
    }
}
