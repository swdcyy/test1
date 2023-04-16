package com.kuaishou.live.core.voiceparty.s;
import im8.g;
import com.kuaishou.live.common.core.basic.livepresenter.LiveVCHostPresenter;
import io.reactivex.subjects.PublishSubject;
import com.kuaishou.live.core.voiceparty.core.shared.CloseReasonProvider;
import co2.f2;
import co2.g1;
import co2.o0;
import msd.a;
import co2.n1;
import com.kuaishou.live.core.voiceparty.s$a;
import co2.m0;
import lo2.d;
import co2.n0;
import com.kuaishou.live.core.voiceparty.y;
import mrd.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import bu2.l;
import com.kuaishou.live.core.voiceparty.f0;
import com.kuaishou.live.core.voiceparty.aryaroomswitch.c;
import fy2.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import a51.c;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import com.kuaishou.android.live.model.LiveStreamModel;
import com.kuaishou.live.core.voiceparty.d0;
import mq5.h;
import mq5.b;
import com.kuaishou.live.core.voiceparty.b;
import co2.u0;
import co2.r;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import zo2.o;
import com.kuaishou.live.core.voiceparty.VoicePartyAudienceManagerAssembler;
import com.kuaishou.live.core.voiceparty.t;
import zo2.u;
import com.kuaishou.live.core.voiceparty.h;
import t02.a0;
import com.kuaishou.live.core.voiceparty.playway.shared.model.audience.AudienceMicSeatsDataManager;
import brd.t;
import o63.a;
import lp3.c;
import lp3.i;
import com.kuaishou.live.bridge.LiveJsKwaiLiveCommands;
import o63.k;
import o63.j;
import h71.j;
import com.kuaishou.live.core.voiceparty.playway.shared.service.LiveVoicePartyPlayViewServiceImpl;
import android.view.View;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView;
import android.view.ViewGroup;
import mw1.c;
import com.kuaishou.live.core.voiceparty.p$a;
import ie2.i;
import co2.e2;
import android.content.Context;
import vq5.d;
import rt2.d;
import ty1.c;
import p91.m;
import pq5.c;
import cw1.l0;
import java.lang.StringBuilder;
import z12.e;
import crd.a;
import lf3.g;
import hf3.a;
import bp2.c;
import hp2.c$c;
import hp2.c;
import com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager;
import yx2.e;
import ie2.b;
import androidx.lifecycle.LifecycleOwner;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.live.viewcontroller.lifecycle.LifecyclesExt;
import co2.r0;
import d61.h;
import ekd.m1;
import co2.e1;
import java.util.Map;
import java.util.HashMap;
import kotlin.jvm.internal.a;
import lb2.i;
import q92.a;
import com.kuaishou.live.common.core.component.topbar.topuser.l;
import u32.k;
import x61.c;
import lk2.c;
import ws5.c;
import ja2.a;
import ks5.c;
import i81.g;
import i81.f;
import com.kuaishou.live.comments.bulletin.LiveBulletinLayoutManager;
import com.kuaishou.live.core.voiceparty.player.VoicePartyPlayerController;
import fu2.b;
import com.kwai.video.waynelive.LivePlayerController;
import fu2.f;
import co2.p0;
import co2.q0;
import qu2.d;
import qu2.a;
import co2.l0;
import fo2.d;
import zq5.b;
import x43.a;

public class s extends LiveVCHostPresenter implements g	// class@0018fd
{
    public VoicePartyAudienceViewController A;
    public VoicePartyPlayerController B;
    public LivePlayTextureView C;
    public ViewGroup D;
    public LiveVoicePartyPlayViewServiceImpl E;
    public d F;
    public i G;
    public p$a H;
    public PublishSubject I;
    public d J;
    public e2 K;
    public LiveBizParam L;
    public LiveStreamModel M;
    public a N;
    public b O;
    public PublishSubject P;
    public i Q;
    public a0 R;
    public a S;
    public i T;
    public a U;
    public c U0;
    public j V;
    public AudienceMicSeatsDataManager V0;
    public c W;
    public l W0;
    public a X;
    public d X0;
    public f Y;
    public c Y0;
    public LiveBulletinLayoutManager Z;
    public k Z0;
    public c a1;
    public b b1;
    public a c1;
    public final f2 d1;
    public g1 e1;
    public i0 f1;
    public final n1 g1;
    public a h1;
    public h i1;
    public x j1;
    public d k1;
    public final h l1;
    public boolean m1;
    public final c w;
    public final c x;
    public CloseReasonProvider y;
    public VoicePartyAudienceManagerAssembler z;
    public static String sLivePresenterClassName = "LiveAudienceVoicePartyPresenter";

    public void s(boolean p0){
       super();
       this.w = PublishSubject.g();
       PublishSubject publishSubje = PublishSubject.g();
       this.x = publishSubje;
       this.y = new CloseReasonProvider();
       this.I = PublishSubject.g();
       f2 uof2 = new f2();
       this.d1 = uof2;
       g1 og1 = new g1(uof2, new o0(this));
       this.e1 = og1;
       this.f1 = og1;
       this.g1 = new n1();
       this.h1 = new s$a(this);
       this.j1 = new m0(this);
       this.k1 = new d();
       this.l1 = new n0(this);
       this.m1 = p0;
       this.U7(new y(publishSubje));
       this.U7(new l());
       this.U7(new f0());
       this.U7(new c());
       this.U7(new c());
    }
    public void E8(){
       s os = s.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, os, "3")) {
          return;
       }
       super.E8();
       s tk1 = this.k1;
       tk1.a = this.Q;
       tk1.b = this.P;
       tk1.c = this.L.mSlidePlayId;
       this.d1.e = d0.q(this.M);
       String str = "1";
       if (!PatchProxy.applyVoid(objArray, this, os, "4")) {
          this.O.Km(this.l1);
          this.g1.a().a(new u0(this));
          os = this.g1;
          Objects.requireNonNull(os);
          o oo = PatchProxy.apply(objArray, os, n1.class, str);
          if (oo != PatchProxyResult.class) {
          }else {
             oo = os.a.b();
          }
          oo.a(new t(this));
       }
       h oh = new h(this.z, this.R, this.d1, this.g1.a().a, this.V0, this.w, this.x);
       this.i1 = os;
       a uoa = this.T.a(a.class);
       this.U = uoa;
       j oj = uoa.B9(LiveJsKwaiLiveCommands.Logger);
       this.V = oj;
       oj.n(this.d1);
       os = this.z;
       Objects.requireNonNull(os);
       if (!PatchProxy.applyVoid(objArray, os, VoicePartyAudienceManagerAssembler.class, str)) {
          os.e.c(os.l);
       }
       LiveVoicePartyPlayViewServiceImpl liveVoicePar = new LiveVoicePartyPlayViewServiceImpl(this.d1, this.m8(), this.C, this.D, this.R.F2, this.H, this.G);
       this.E = os;
       this.K = new e2(this.X0, this.getContext(), this.M);
       d uod = new d(this.d1);
       this.F = uod;
       this.R.Z2.E(uod);
       l0.a(this.R.j2);
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, s.class, "6")) {
          return;
       }
       s ti1 = this.i1;
       Objects.requireNonNull(ti1);
       if (!PatchProxy.applyVoid(objArray, ti1, h.class, "16")) {
          ti1.b(5);
          String[] stringArray = new String[false];
          e.c("VoicePartyCoreAudience", "release: "+ti1, stringArray);
          ti1.e = objArray;
          ti1.g.dispose();
          ti1.b.C.o(763, ti1.l);
       }
       ti1 = this.z;
       Objects.requireNonNull(ti1);
       if (!PatchProxy.applyVoid(objArray, ti1, VoicePartyAudienceManagerAssembler.class, "2")) {
          ti1.e.d();
          ti1.d.e();
       }
       this.V.n(objArray);
       this.W8(c$c.d);
       this.V0.c();
       this.B.g();
       ti1 = this.E;
       Objects.requireNonNull(ti1);
       if (!PatchProxy.applyVoid(objArray, ti1, LiveVoicePartyPlayViewServiceImpl.class, "1")) {
          LiveVoicePartyPlayViewServiceImpl j = ti1.j;
          if (j != null) {
             j.a(ti1.c);
          }
          ti1.b = false;
       }
       l0.b(this.R.j2);
       super.J8();
       return;
    }
    public LifecycleOwner V8(){
       Object obj = PatchProxy.apply(null, this, s.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LifecyclesExt.a(this, this.R.Z2.b());
    }
    public void W8(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "8")) {
          return;
       }
       this.y.c(0, p0, new r0(this));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "2")) {
          return;
       }
       h.i(p0.findViewById(R.id.live_voice_party_team_pk_container_view));
       this.C = m1.f(p0, 0x7f0a30e0);
       this.D = m1.f(p0, 0x7f0a30e6);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, s.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e1();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, s.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(s.class, new e1());
       }else {
          obj.put(s.class, null);
       }
       return obj;
    }
    public void j8(){
       String str = "1";
       if (PatchProxy.applyVoid(null, this, s.class, str)) {
          return;
       }
       a0 uoa0 = this.q8(a0.class);
       this.R = uoa0;
       s te1 = this.e1;
       Objects.requireNonNull(te1);
       if (!PatchProxy.applyVoidOneRefs(uoa0, te1, g1.class, str)) {
          a.p(uoa0, "callerContext");
          te1.b = uoa0;
       }
       this.N = this.r8("LIVE_LONG_CONNECTION");
       this.O = this.r8("LIVE_AUDIENCE_LIVE_END_SERVICE");
       this.T = this.r8("LIVE_SERVICE_MANAGER");
       this.L = this.q8(LiveBizParam.class);
       this.Q = this.s8(i.class);
       this.S = this.s8(a.class);
       this.M = this.s8(LiveStreamModel.class);
       this.P = this.t8("LIVE_SQUARE_REPLACE_PAGE_LIST_PUBLISHER");
       this.W0 = this.r8("LIVE_TOP_USER_SERVICE");
       this.X0 = this.r8("LIVE_ROUTER_SERVICE");
       this.Z0 = this.r8("LIVE_AUDIENCE_BOTTOM_BAR_SERVICE");
       this.Y0 = this.T.a(c.class);
       this.a1 = this.s8(c.class);
       this.W = this.q8(c.class);
       this.X = this.q8(a.class);
       this.U0 = this.q8(c.class);
       g og = this.T.a(g.class);
       this.Y = og.nc();
       this.Z = og.i7();
       te1 = this.R;
       VoicePartyPlayerController voicePartyPl = new VoicePartyPlayerController(te1.E, new b(te1.F2));
       this.B = voicePartyPl;
       voicePartyPl.f();
       VoicePartyAudienceManagerAssembler voicePartyAu = new VoicePartyAudienceManagerAssembler(this.d1, this.M, this.R, this.N, this.x, this.w, new p0(this), new q0(this));
       this.z = voicePartyPl;
       this.g1.a = voicePartyPl;
       s td1 = this.d1;
       AudienceMicSeatsDataManager uAudienceMic = new AudienceMicSeatsDataManager(new d(this.R.Z2), td1, this.R.C, td1.o);
       this.V0 = uAudienceMic;
       this.g1.b = uAudienceMic;
       this.d1.r = new l0(this);
       this.G = this.t8("LIVE_AUDIENCE_PLAYER_REUSE_SERVICE");
       this.H = this.r8("LIVE_VOICE_PARTY_PLAY_VIEW_SERVICE");
       this.J = this.q8(d.class);
       this.b1 = this.T.c(b.class);
       this.c1 = this.s8(a.class);
       return;
    }
}
