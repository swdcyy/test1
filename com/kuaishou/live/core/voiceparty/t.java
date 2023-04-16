package com.kuaishou.live.core.voiceparty.t;
import zo2.u;
import com.kuaishou.live.core.voiceparty.s;
import java.lang.Object;
import zo2.n;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import co2.f2;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import t02.a0;
import e57.a;
import android.graphics.PointF;
import qc2.a;
import com.kuaishou.live.core.voiceparty.g0;
import java.util.Objects;
import com.kuaishou.live.core.voiceparty.playway.shared.service.LiveVoicePartyPlayViewServiceImpl;
import hp2.c$c;
import hp2.c;
import hu2.g;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import qu2.d;
import co2.c2;
import com.kuaishou.live.core.voiceparty.VoicePartyAudienceManagerAssembler;
import co2.n1;
import ee1.a;
import lp3.c;
import lp3.i;
import qu2.a;
import qu2.c;
import hf3.a;
import com.kuaishou.live.core.voiceparty.player.VoicePartyPlayerController;
import com.kuaishou.live.core.voiceparty.a;
import brd.t;
import co2.e2;
import lo2.d;
import aq5.d;
import hu2.j;
import ru2.d;
import qx1.a;
import com.kuaishou.live.core.voiceparty.playway.shared.model.audience.AudienceMicSeatsDataManager;
import com.kuaishou.live.core.voiceparty.h;
import mrd.c;
import hu2.k;
import wu2.c;
import n91.f;
import com.kuaishou.live.core.voiceparty.r;
import nc1.k;
import xu2.a;
import ry1.b;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import or5.d;
import co2.s0;
import i81.g;
import n91.e;
import mz1.b;
import com.kuaishou.live.livestage.g;
import com.kwai.feature.api.live.service.voiceparty.LiveVoicePartyPlayViewService;
import w02.g;
import wu2.b;
import pq5.c;
import g81.c;
import vq5.d;
import x61.c;
import fs2.a;
import wu2.a;
import com.kuaishou.live.core.show.share.f$b;
import lk2.c;
import ws5.c;
import i81.f;
import com.kuaishou.live.comments.bulletin.LiveBulletinLayoutManager;
import ks5.c;
import msd.a;
import fo2.d;
import zq5.b;
import com.kuaishou.live.common.core.component.topbar.topuser.l;
import q92.a;
import x43.a;
import ja2.a;
import hu2.i;
import com.kuaishou.live.core.voiceparty.s$c;
import com.kuaishou.live.core.voiceparty.s$b;
import zo2.j;
import co2.g1;
import hu2.o;
import hu2.a;
import lp3.e;
import com.kuaishou.live.core.voiceparty.playway.VoicePartyAudienceViewController;
import com.kuaishou.live.core.voiceparty.core.shared.CloseReasonProvider;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import android.view.ViewGroup;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.common.core.basic.livepresenter.LiveVCHostPresenter;
import m91.b;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;
import rt2.d;
import co2.v0;
import java.lang.Runnable;
import ekd.k1;
import com.kuaishou.live.core.basic.bulletin.BulletinUtils;

public class t implements u	// class@001916
{
    public final s b;

    public void t(s p0){
       this.b = p0;
       super();
    }
    public void a0(n p0){
       boolean b;
       a uoa2;
       t obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, t.class, "1")) {
          return;
       }
       obj.b.d1.Q();
       b.Z(LiveLogTag.LIVE_VOICE_PARTY, "onEnterVoiceParty");
       a0 q1 = obj.b.R.q1;
       b = false;
       if (q1 != null) {
          q1.d(b);
       }
       q1 = obj.b.R.j1;
       if (q1 != null) {
          q1.a(new PointF(0xbf800000, 0x3f933333));
       }
       Object obj2 = null;
       obj.b.d1.t.a(3, obj2);
       s e = obj.b.E;
       Objects.requireNonNull(e);
       if (!PatchProxy.applyVoid(obj2, e, LiveVoicePartyPlayViewServiceImpl.class, "8")) {
          e.m();
          e.b = b;
       }
       t b1 = obj.b;
       Objects.requireNonNull(b1);
       if (!PatchProxy.applyVoidOneRefs(obj1, b1, s.class, "7")) {
          b1.W8(c$c.d);
          d uod = v5;
          d uod1 = new d(b1.R.Z2);
          c2 uoc2 = v7;
          c2 uoc21 = new c2(b1.z, b1.g1);
          s r = b1.R;
          obj = b1;
          g og = new g(b1.getActivity(), b1.R.Z2.b(), uod, b1.d1, uoc2, b1.N, b1.B, b1.T.a(a.class), b1.h1, r, p0, b1.x, obj.m1, obj.K, false, obj.k1, r.Y0);
          j oj = new j(obj.V0, obj.i1, obj.I, new d(true), obj.T.a(a.class));
          c uoc = og;
          c uoc1 = new c(true);
          e = obj.R;
          r or = e;
          r or1 = new r(obj);
          a uoa = or1;
          a uoa1 = new a(obj.getActivity());
          s0 os0 = uoa1;
          s0 os01 = new s0(obj);
          k ok = new k(obj.E, obj.R.I2, uoc, obj.T.a(f.class), e.j2, e.H, obj.X0, obj.Y0, or, obj.T.a(k.class), uoa, obj.R.o1, obj.T.a(b.class), obj.T.a(LiveSlidePlayService.class), obj.T.a(d.class), obj.a1, obj.W, obj.R.j1, obj.Y, obj.Z, obj.U0, os0, obj.J, obj.T.a(g.class), obj.g1, obj.b1, obj.T.a(e.class), obj.W0, obj.S, obj.T.a(b.class).Z3(), obj.c1, obj.X);
          i oi = new i(v19, uod, uod1, obj.z, obj.e1, new s$c(obj), new s$b(obj), obj.T);
          s y = obj.y;
          Objects.requireNonNull(y);
          CloseReasonProvider uCloseReason = CloseReasonProvider.class;
          if (PatchProxy.isSupport(uCloseReason)) {
             uoa2 = PatchProxy.applyOneRefs(Integer.valueOf(0), y, uCloseReason, "3");
             if (uoa2 != PatchProxyResult.class) {
             label_0214 :
                obj.A = new VoicePartyAudienceViewController(os01, uoa2);
                obj.E2(obj.m8().findViewById(R.id.live_play_voice_party_vc_container), obj.A);
             }
          }
          uoa2 = CloseReasonProvider.b(y, 0, null, 2, null);
          goto label_0214 ;
       }
       return;
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "2")) {
          return;
       }
       a0 j1 = this.b.R.j1;
       if (j1 != null) {
          j1.a(new PointF(0xbf800000, 0xbf800000));
       }
       this.b.R.N().yj(AudienceBizRelation.VOICE_PARTY_GUEST);
       this.b.F.d();
       s d1 = this.b.d1;
       Objects.requireNonNull(d1);
       k1.r(new v0(d1), 0);
       this.b.W8(p0);
       t tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, s.class, "5")) {
          g og = tb.T.a(g.class);
          if (og.R6()) {
             BulletinUtils.b(og);
          }
       }
       return;
    }
}
