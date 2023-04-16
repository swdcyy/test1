package com.kuaishou.live.core.show.wealthgrade.privilegedetail.o$b;
import com.kuaishou.live.core.show.wealthgrade.privilegedetail.p$a;
import com.kuaishou.live.core.show.wealthgrade.privilegedetail.o;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qm2.a;
import qm2.i0;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import t02.a0;
import p91.m;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import lp3.e;
import w91.a;
import lp3.c;
import java.util.Map;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import com.kuaishou.live.common.core.component.recharge.d;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import hm2.k;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.u1;
import brd.t;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import pm2.a;
import o02.e;
import t45.d;
import brd.z;
import cjd.e;
import erd.o;
import qm2.a0;
import erd.g;
import qm2.b0;
import com.kuaishou.live.core.show.wealthgrade.http.LiveWealthGradePrivilegeResponse$LiveWealthGradePrivilegeInfo;
import com.kuaishou.live.core.show.wealthgrade.http.LiveWealthGradeProtectionInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import pm8.a;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import io.reactivex.subjects.ReplaySubject;
import qm2.y;
import mrd.c;
import qm2.z;
import java.util.Objects;
import u07.t$a;
import lnc.a1;
import com.kuaishou.live.core.show.wealthgrade.privilegedetail.m;
import ya1.l;
import ya1.j;
import ya1.j$b;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import android.text.TextUtils;
import w07.n;
import w07.l;
import w07.i;
import com.kwai.library.widget.popup.common.PopupInterface$g;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c$b;
import u07.u;
import android.view.ViewGroup;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;

public class o$b implements p$a	// class@00127a
{
    public final o a;

    public void o$b(o p0){
       this.a = p0;
       super();
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, o$b.class, "3")) {
          return;
       }
       o b = this.a.B;
       a c = b.c;
       if (c != null) {
          a e = b.e;
          if (e != null) {
             e.a();
          }
          d.f("LIVE_ROOM_GRADE_PRIVILEGE", this.a.getActivity(), c.Z2.getLiveStreamId(), c.Z2.d(), c.p, c.c.getExpTag(), c.Z2.t5().a(a.class).d6());
       }
       ClientContent$LiveStreamPackage liveStreamPa = this.a.P8();
       if (!PatchProxy.applyVoidOneRefs(liveStreamPa, objArray, k.class, "15") && liveStreamPa != null) {
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "PRIVILEGE_SETTING_LACK_OF_BALANCE_CARD";
          u1.u(1, uElementPack, uContentPack);
       }
       return;
    }
    public t b(boolean p0){
       o$b uob = o$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.a.B.c == null) {
          return t.just(Boolean.valueOf((p0 ^ 0x01)));
       }else {
          return e.q().c(this.a.B.c.Z2.getLiveStreamId(), Boolean.valueOf(p0)).observeOn(d.a).map(new e()).doOnNext(new a0(this, p0)).map(new b0(p0));
       }
    }
    public t c(){
       LiveWealthGradeProtectionInfo mProtectionD;
       o$b a;
       m a1;
       Object obj = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       o obj1 = PatchProxy.apply(objArray, obj, o$b.class, "2");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       obj1 = obj.a.A;
       if (obj1 != null) {
          mProtectionD = obj1.mWealthGradeProtectionInfo.mProtectionDescription;
          if (mProtectionD != null) {
          label_0020 :
             if (TextUtils.x(mProtectionD) || a.a.getBoolean(b.d("user")+"isWealthGradeProtectionReconfirmTipsDialogShowDisabled", false)) {
                return t.just(Boolean.TRUE);
             }else {
                ClientContent$LiveStreamPackage liveStreamPa = obj.a.P8();
                ReplaySubject replaySubjec = ReplaySubject.i(1);
                a = obj.a;
                y oy = new y(replaySubjec, liveStreamPa);
                z oz = new z(replaySubjec, liveStreamPa);
                Objects.requireNonNull(a);
                z oz1 = oz;
                z oz2 = oz;
                if (!PatchProxy.applyVoidThreeRefs(mProtectionD, oy, oz1, a, o.class, "14") && a.getActivity() != null) {
                   t$a uoa = new t$a(a.getActivity());
                   String str = a1.p(R.string.arg_RES_7f1022a3);
                   a1 = m.a;
                   Object obj2 = PatchProxy.applyThreeRefs(uoa, str, a1, null, l.class, "1");
                   if (obj2 != patchProxyRe) {
                      uoa = obj2;
                   }else {
                      uoa.v0(new j(uoa, a1));
                      CharSequence[] uCharSequenc = new CharSequence[1];
                      if (TextUtils.isEmpty(str)) {
                         str = a1.p(R.string.arg_RES_7f103297);
                      }
                      uCharSequenc[0] = str;
                      uoa.P0(uCharSequenc);
                      uoa.N0(R.layout.arg_RES_7f0d0ab4);
                      uoa.a0(new n());
                      uoa.a0(new i());
                      uoa.L(new PopupInterface$g(R.layout.arg_RES_7f0d02ec));
                   }
                   uoa.T0(a1.p(R.string.arg_RES_7f1022a4));
                   uoa.R0(a1.p(R.string.arg_RES_7f1022a2));
                   uoa.X0(mProtectionD);
                   uoa.u0(oy);
                   uoa.t0(oz2);
                   uoa.a0(a.D);
                   uoa.C(a.p);
                   uoa.Y(PopupInterface.a);
                }
                if (!PatchProxy.applyVoidOneRefs(liveStreamPa, null, k.class, "10") && liveStreamPa != null) {
                   ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                   uContentPack.liveStreamPackage = liveStreamPa;
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action2 = "KWAI_USER_LEVEL_PROTECT_CARD";
                   u1.u0(9, uElementPack, uContentPack);
                }
                return replaySubjec;
             }
          }
       }
       mProtectionD = objArray;
       goto label_0020 ;
    }
}
