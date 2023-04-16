package com.kuaishou.live.core.voiceparty.simpleplay.LivePreviewVoicePartyLogic;
import ot5.b;
import com.kuaishou.live.core.voiceparty.simpleplay.LivePreviewVoicePartyLogic$a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import hf3.a;
import com.kuaishou.live.core.voiceparty.player.VoicePartyPlayerController;
import aq5.d;
import mrd.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.core.shared.CloseReasonProvider;
import qv2.a;
import com.kuaishou.live.core.voiceparty.simpleplay.LivePreviewVoicePartyLogic$f;
import erd.o;
import brd.t;
import com.kuaishou.live.core.voiceparty.simpleplay.LivePreviewVoicePartyLogic$g;
import com.kuaishou.live.livestage.g;
import xo1.i;
import com.kuaishou.live.core.voiceparty.simpleplay.LivePreviewVoicePartyLogic$liveStageManager$1;
import ee1.a;
import xo1.a;
import msd.a;
import ns2.a;
import com.kuaishou.live.common.core.component.livestage.a;
import com.kuaishou.live.core.voiceparty.simpleplay.LivePreviewVoicePartyLogic$liveStageManager$2;
import msd.l;
import com.kuaishou.live.common.core.component.livestage.a$a;
import com.kuaishou.live.common.core.component.livestage.LiveStageRenderViewFactory;
import com.kuaishou.live.common.core.component.livestage.LiveStageRenderViewFactory$a;
import com.kuaishou.live.core.voiceparty.simpleplay.LivePreviewVoicePartyLogic$d;
import com.kuaishou.live.core.voiceparty.simpleplay.LivePreviewVoicePartyLogic$e;
import oe3.f;
import nsd.u;
import com.kuaishou.live.livestage.g$a;
import je3.i;
import je3.k;
import je3.g;
import je3.c;
import je3.n;
import ee3.f;
import ee3.z;
import ee3.g;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import yx2.e;
import com.kuaishou.live.core.voiceparty.simpleplay.LivePreviewVoicePartyLogic$b;
import co2.f2;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.android.live.model.LiveStreamModel;
import com.kuaishou.live.core.voiceparty.d0;
import qrd.l1;
import com.kuaishou.live.core.voiceparty.simpleplay.VoicePartyAudienceSimplePlayManagerAssembler;
import com.kuaishou.live.core.voiceparty.simpleplay.LivePreviewVoicePartyLogic$2;
import com.kuaishou.live.core.voiceparty.simpleplay.LivePreviewVoicePartyLogic$3;
import qu2.a;
import zo2.u;
import zo2.o;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.playway.shared.model.audience.AudienceMicSeatsDataManager;
import sv2.a;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.comments.bulletin.LiveBulletinLayoutManager;
import java.util.Objects;
import bp2.c;
import wa1.h;
import com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import i81.f;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kwai.feature.api.live.service.voiceparty.LiveVoicePartyPlayViewService;
import n91.f;
import ws5.c;
import fu2.h;
import zo2.n;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.FragmentActivity;
import hu2.g;
import com.kuaishou.live.core.voiceparty.simpleplay.LivePreviewVoicePartyLogic$c;
import pv2.a;
import qu2.c;
import com.kuaishou.live.core.voiceparty.a;
import t02.a0;
import co2.e2;
import lo2.d;
import hu2.k;
import wu2.c;
import com.kuaishou.live.core.voiceparty.simpleplay.LivePreviewVoicePartyLogic$createController$serviceDependence$1;
import w02.g;
import wu2.b;
import pq5.c;
import g81.c;
import vq5.d;
import x61.c;
import fs2.a;
import nc1.k;
import wu2.a;
import com.kuaishou.live.core.show.share.f$b;
import ry1.b;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import or5.d;
import lk2.c;
import qc2.a;
import ks5.c;
import fo2.d;
import i81.g;
import co2.n1;
import zq5.b;
import n91.e;
import com.kuaishou.live.common.core.component.topbar.topuser.l;
import q92.a;
import x43.a;
import ja2.a;
import hu2.j;
import mrd.a;
import ru2.d;
import com.kuaishou.live.core.voiceparty.h;
import qx1.a;
import co2.g1;
import com.kuaishou.live.core.voiceparty.simpleplay.LivePreviewVoicePartyLogic$createController$voicePartyServiceProxy$1;
import hu2.i;
import pv2.b;
import zo2.j;
import hu2.o;
import hu2.a;
import lp3.e;
import com.kuaishou.live.core.voiceparty.playway.VoicePartyAudienceViewController;
import hp2.c;
import com.kwai.framework.plugin.PluginManager;
import android.content.res.Resources;
import android.app.Activity;
import com.kuaishou.live.common.core.component.follow.cache.c;
import java.lang.StringBuilder;
import com.kuaishou.live.core.voiceparty.simpleplay.LivePreviewVoicePartyLogic$onExitVoiceParty$1;

public abstract class LivePreviewVoicePartyLogic implements b	// class@00190c
{
    public final CloseReasonProvider a;
    public final LivePreviewVoicePartyLogic$b b;
    public final f2 c;
    public final a d;
    public final t e;
    public final VoicePartyAudienceSimplePlayManagerAssembler f;
    public AudienceMicSeatsDataManager g;
    public ViewController h;
    public final a i;
    public final LivePreviewVoicePartyLogic$g j;
    public final g k;
    public final LivePreviewVoicePartyLogic$a l;
    public final BaseFragment m;
    public final a n;
    public final VoicePartyPlayerController o;
    public final d p;

    public void LivePreviewVoicePartyLogic(LivePreviewVoicePartyLogic$a p0,BaseFragment p1,a p2,VoicePartyPlayerController p3,d p4,c p5,c p6){
       LivePreviewVoicePartyLogic livePreviewV = this;
       LivePreviewVoicePartyLogic$b obj = p0;
       f2 obj1 = p1;
       Object obj2 = p2;
       Object obj3 = p3;
       VoicePartyAudienceSimplePlayManagerAssembler obj4 = p5;
       a.p(obj, "bizParam");
       a.p(obj1, "fragment");
       a.p(obj2, "liveLongConnection");
       a.p(obj3, "voicePartyPlayerController");
       a.p(obj4, "offlineSignal");
       Object obj5 = p6;
       a.p(obj5, "liveEndSignal");
       super();
       livePreviewV.l = obj;
       livePreviewV.m = obj1;
       livePreviewV.n = obj2;
       livePreviewV.o = obj3;
       livePreviewV.p = p4;
       livePreviewV.a = new CloseReasonProvider();
       livePreviewV.d = new a(obj2);
       t ot = obj4.map(LivePreviewVoicePartyLogic$f.b);
       a.o(ot, "offlineSignal.map { _off¡­Signal\(_offline, false\) }");
       livePreviewV.e = ot;
       LivePreviewVoicePartyLogic$g og = new LivePreviewVoicePartyLogic$g(livePreviewV);
       livePreviewV.j = og;
       livePreviewV.k = g$a.d(g.a, null, new i(null, null, LivePreviewVoicePartyLogic$liveStageManager$1.INSTANCE), new a(obj3), a.d.b(new LivePreviewVoicePartyLogic$liveStageManager$2(livePreviewV)), LiveStageRenderViewFactory.e.c(), new LivePreviewVoicePartyLogic$d(livePreviewV), LivePreviewVoicePartyLogic$e.a, null, new f(true, false, 2, null), 128, null);
       b.Z(LiveVoicePartyLogTag.LIVE_PREVIEW, "doCreate");
       p3.f();
       LivePreviewVoicePartyLogic$b uob = new LivePreviewVoicePartyLogic$b(livePreviewV);
       livePreviewV.b = uob;
       f2 uof2 = new f2();
       uof2.e = d0.q(p0.a().mLiveStreamModel);
       uof2.c = 2;
       livePreviewV.c = uof2;
       LiveStreamFeed mLiveStreamM = p0.a().mLiveStreamModel;
       a.o(mLiveStreamM, "bizParam.feed.mLiveStreamModel");
       obj4 = v12;
       f2 uof21 = uof2;
       LivePreviewVoicePartyLogic$b uob1 = uob;
       obj1 = uof2;
       obj = uob;
       LivePreviewVoicePartyLogic$b uob2 = obj;
       VoicePartyAudienceSimplePlayManagerAssembler voicePartyAu = v12;
       f2 uof22 = obj1;
       a uoa = null;
       obj4 = new VoicePartyAudienceSimplePlayManagerAssembler(uof21, uob1, mLiveStreamM, obj.c, p2, obj3, obj5, ot, new LivePreviewVoicePartyLogic$2(livePreviewV), new LivePreviewVoicePartyLogic$3(livePreviewV));
       livePreviewV.f = voicePartyAu;
       voicePartyAu.e.a(og);
       if (PatchProxy.applyVoid(uoa, voicePartyAu, VoicePartyAudienceSimplePlayManagerAssembler.class, "1")) {
       }else {
          voicePartyAu.e.c(voicePartyAu.j);
       }
       livePreviewV.g = new AudienceMicSeatsDataManager(uob2, uof22, obj2, uoa);
       livePreviewV.i = new a(p1);
       return;
    }
    public static final AudienceMicSeatsDataManager a(LivePreviewVoicePartyLogic p0){
       p0 = p0.g;
       if (p0 == null) {
          a.S("micSeatsDataManager");
       }
       return p0;
    }
    public abstract void b(ViewController p0);
    public abstract void c(ViewController p0);
    public abstract LiveBulletinLayoutManager d();
    public void destroy(){
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, this, LivePreviewVoicePartyLogic.class, str)) {
          return;
       }
       LivePreviewVoicePartyLogic tf = this.f;
       Objects.requireNonNull(tf);
       if (!PatchProxy.applyVoid(objArray, tf, VoicePartyAudienceSimplePlayManagerAssembler.class, "2")) {
          tf.e.d();
          tf.d.e();
       }
       tf = this.d;
       Objects.requireNonNull(tf);
       if (!PatchProxy.applyVoid(objArray, tf, a.class, "3")) {
          tf.b.b();
       }
       tf = this.g;
       if (tf == null) {
          a.S("micSeatsDataManager");
       }
       tf.c();
       tf = this.i;
       Objects.requireNonNull(tf);
       if (!PatchProxy.applyVoid(objArray, tf, a.class, str)) {
          tf.e();
          tf.f();
          a d = tf.d;
          a c = tf.c;
          if (!PatchProxy.applyVoidTwoRefs(d, c, tf, a.class, "3")) {
             SlidePlayViewModel slidePlayVie = SlidePlayViewModel.S0(d.getParentFragment());
             if (slidePlayVie != null) {
                slidePlayVie.D(d, c);
             }
          }
       }
       this.o.g();
       tf = this.h;
       if (tf != null) {
          this.o(tf);
       }
       return;
    }
    public abstract f e();
    public abstract ClientContent$LiveStreamPackage f();
    public abstract LiveVoicePartyPlayViewService g();
    public abstract f h();
    public abstract c i();
    public final f2 j(){
       return this.c;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, LivePreviewVoicePartyLogic.class, "4")) {
          return;
       }
       if (h.c(this.g())) {
          this.g().d();
       }
       this.g().j();
       return;
    }
    public void l(n p0){
       boolean b;
       Object obj = this;
       Object obj1 = p0;
       LivePreviewVoicePartyLogic livePreviewV = LivePreviewVoicePartyLogic.class;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, livePreviewV, "2")) {
          return;
       }
       a.p(obj1, "param");
       LiveVoicePartyLogTag lIVE_PREVIEW = LiveVoicePartyLogTag.LIVE_PREVIEW;
       b.Z(lIVE_PREVIEW, "onEnterVoiceParty");
       VoicePartyAudienceViewController voicePartyAu = PatchProxy.applyOneRefs(obj1, obj, livePreviewV, "5");
       if (voicePartyAu != PatchProxyResult.class) {
       }else {
          FragmentActivity uFragmentAct = obj.m.requireActivity();
          FragmentActivity uFragmentAct1 = uFragmentAct;
          a.o(uFragmentAct, "fragment.requireActivity\(\)");
          LivePreviewVoicePartyLogic$c uoc = v7;
          LivePreviewVoicePartyLogic$c uoc1 = new LivePreviewVoicePartyLogic$c(obj.f);
          a uoa = v11;
          a uoa1 = new a();
          FragmentActivity uFragmentAct2 = uFragmentAct;
          LiveVoicePartyLogTag liveVoicePar = lIVE_PREVIEW;
          g og = new g(uFragmentAct1, obj.m, obj.b, obj.c, uoc, obj.n, obj.o, 0, uoa, null, p0, obj.e, true, 0, true, null, obj.p);
          c uoc2 = uFragmentAct1;
          b = false;
          c uoc3 = new c(b);
          LivePreviewVoicePartyLogic$createController$serviceDependence$1 uocreateCont = uoc3;
          LivePreviewVoicePartyLogic$createController$serviceDependence$1 uocreateCont1 = new LivePreviewVoicePartyLogic$createController$serviceDependence$1(obj);
          k ok = new k(this.g(), obj.i, uoc2, this.h(), null, null, null, null, null, null, null, null, null, null, null, null, this.i(), null, this.e(), this.d(), null, uocreateCont, null, null, null, null, null, obj.d, null, obj.k, null, null);
          LivePreviewVoicePartyLogic g = obj.g;
          if (g == null) {
             a.S("micSeatsDataManager");
          }
          a uoa2 = a.g();
          a.o(uoa2, "BehaviorSubject.create\(\)");
          j oj = new j(g, null, uoa2, new d(b), null);
          i oi = new i(v19, v18, og, obj.f, new g1(obj.c, new LivePreviewVoicePartyLogic$createController$voicePartyServiceProxy$1(obj)), new b(obj), null, null);
          voicePartyAu = new VoicePartyAudienceViewController(oj, CloseReasonProvider.b(obj.a, b, null, 2, null));
          b.Z(liveVoicePar, "createController");
          PluginManager.K(PluginManager.H, uFragmentAct2.getResources(), b, 2, null);
          c.b().f(obj.b.getLiveStreamId(), obj.b.U());
       }
       obj.c(voicePartyAu);
       obj.h = voicePartyAu;
       return;
    }
    public void m(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePreviewVoicePartyLogic.class, "3")) {
          return;
       }
       a.p(p0, "reason");
       b.Z(LiveVoicePartyLogTag.LIVE_PREVIEW, "onExitVoiceParty "+p0);
       this.a.c(0, p0, new LivePreviewVoicePartyLogic$onExitVoiceParty$1(this));
       return;
    }
    public abstract void n(ViewController p0);
    public abstract void o(ViewController p0);
}
