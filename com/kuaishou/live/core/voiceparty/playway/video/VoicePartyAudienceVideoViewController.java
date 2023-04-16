package com.kuaishou.live.core.voiceparty.playway.video.VoicePartyAudienceVideoViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.core.voiceparty.playway.video.VoicePartyAudienceVideoViewController$a;
import nsd.u;
import qu2.a;
import co2.f2;
import ss2.e;
import msd.t;
import brd.t;
import com.kuaishou.live.livestage.g;
import fe3.b;
import msd.p;
import ee3.a0;
import com.kwai.feature.api.live.service.voiceparty.LiveVoicePartyPlayViewService;
import com.kuaishou.live.core.voiceparty.playway.video.camera.CameraRequestApi;
import qs2.a;
import hf3.a;
import androidx.fragment.app.c;
import w02.g;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.playway.video.VoicePartyAudienceVideoViewController$magicEffectLoggerManager$2;
import msd.a;
import qrd.p;
import qrd.s;
import mrd.a;
import iv2.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.kuaishou.live.livestage.videopipe.renderarea.ui.RenderAreaView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$l;
import android.content.Context;
import ekd.r;
import kv2.a;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView$n;
import com.kuaishou.live.core.voiceparty.playway.video.VoicePartyAudienceVideoViewController$initRenderAreaView$1;
import msd.l;
import com.kuaishou.live.core.voiceparty.playway.video.VoicePartyAudienceVideoViewController$initRenderAreaView$2;
import le3.a;
import le3.d;
import le3.f;
import fe3.d;
import com.kwai.framework.model.user.QCurrentUser;
import dv2.b;
import le3.f$a;
import le3.e;
import dv2.c;
import le3.e$a;
import le3.b;
import dv2.d;
import le3.b$a;
import le3.c;
import dv2.e;
import le3.c$a;
import qrd.l1;
import ge3.i;
import java.lang.StringBuilder;
import ev2.c;
import com.kuaishou.live.core.voiceparty.playway.video.VoicePartyAudienceVideoViewController$onCreate$2;
import com.kuaishou.live.core.voiceparty.playway.video.VoicePartyAudienceVideoViewController$onCreate$3;
import ge3.f;
import je3.i;
import ns2.c;
import ts2.f;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.IMicSeatStateServiceKt;
import dv2.f;
import brd.w;
import erd.c;
import dv2.g;
import erd.r;
import ke3.d;
import java.lang.Boolean;
import com.kuaishou.live.livestage.f;
import com.kuaishou.live.livestage.f$a$b;
import com.kuaishou.live.livestage.f$b;
import com.kuaishou.live.livestage.f$a;
import re3.c;
import ee3.e;
import com.kuaishou.live.livestage.VideoRenderMode;
import xo1.c;
import je3.b;
import ee3.d0;
import dv2.a;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import us2.d;
import rs2.c;
import android.app.Activity;
import us2.a;
import androidx.lifecycle.LiveData;
import us2.b;
import androidx.lifecycle.LifecycleOwner;
import jv2.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import ts2.h;
import android.view.ViewGroup;
import java.lang.Iterable;
import java.util.Iterator;
import com.kuaishou.live.core.voiceparty.playway.video.camera.AudienceVideoCameraControlViewController;
import com.kuaishou.live.core.voiceparty.playway.video.VoicePartyAudienceVideoViewController$onCreate$$inlined$let$lambda$1;
import com.kuaishou.live.core.voiceparty.playway.video.VoicePartyAudienceVideoViewController$b;
import erd.o;
import ev2.k;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import co2.q1;
import z12.e;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ResultPackage;
import java.lang.System;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import yx2.n$a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import yx2.n;
import cy2.h;
import u71.c;
import cy2.h$a;
import dp1.d;

public final class VoicePartyAudienceVideoViewController extends ViewController	// class@0018b9
{
    public final t A;
    public final t B;
    public final a0 C;
    public final LiveVoicePartyPlayViewService D;
    public final CameraRequestApi E;
    public final a F;
    public final a G;
    public final c H;
    public final g I;
    public final p j;
    public c k;
    public f l;
    public i m;
    public final a n;
    public Rect o;
    public a p;
    public final b q;
    public final a r;
    public final f2 s;
    public final e t;
    public final t u;
    public final t v;
    public final g w;
    public final b x;
    public final p y;
    public final p z;
    public static final VoicePartyAudienceVideoViewController$a J;

    static {
       VoicePartyAudienceVideoViewController.J = new VoicePartyAudienceVideoViewController$a(null);
    }
    public void VoicePartyAudienceVideoViewController(a p0,f2 p1,e p2,t p3,t p4,g p5,b p6,p p7,p p8,t p9,t p10,a0 p11,LiveVoicePartyPlayViewService p12,CameraRequestApi p13,a p14,a p15,c p16,g p17){
       Object obj = p0;
       Object obj1 = p1;
       a obj2 = p2;
       Object obj3 = p3;
       Object obj4 = p4;
       Object obj5 = p5;
       Object obj6 = p6;
       Object obj7 = p7;
       Object obj8 = p8;
       Object obj9 = p9;
       Object obj10 = p10;
       Object obj11 = p11;
       Object obj12 = p12;
       Object obj13 = p13;
       a.p(obj, "liveBaseContext");
       a.p(obj1, "voicePartyContext");
       a.p(obj2, "micSeatDataManager");
       a.p(obj3, "micSeatPendantsFactory");
       a.p(obj4, "openVideoUsers");
       a.p(obj5, "liveStageManager");
       a.p(obj6, "stageBiz");
       a.p(obj7, "layoutConfigDelegateFactory");
       a.p(obj8, "layoutConfigBuilder");
       a.p(obj9, "rtcStatus");
       a.p(obj10, "muteUsers");
       a.p(obj11, "placeholderImageFactory");
       a.p(obj12, "livePlayViewService");
       a.p(obj13, "cameraRequestApi");
       a.p(p15, "liveLongConnection");
       a.p(p16, "fragmentManager");
       a.p(p17, "eventBusService");
       super();
       ViewController viewControll = this;
       viewControll.r = obj;
       viewControll.s = obj1;
       viewControll.t = obj2;
       viewControll.u = obj3;
       viewControll.v = obj4;
       viewControll.w = obj5;
       viewControll.x = obj6;
       viewControll.y = obj7;
       viewControll.z = obj8;
       viewControll.A = obj9;
       viewControll.B = obj10;
       viewControll.C = obj11;
       viewControll.D = obj12;
       viewControll.E = obj13;
       viewControll.F = p14;
       viewControll.G = p15;
       viewControll.H = p16;
       viewControll.I = p17;
       viewControll.j = s.c(new VoicePartyAudienceVideoViewController$magicEffectLoggerManager$2(viewControll));
       obj2 = a.g();
       a.o(obj2, "BehaviorSubject.create<Set<WindowId>>\(\)");
       viewControll.n = obj2;
       viewControll.q = new b(obj1, obj);
    }
    public void F2(){
       f uof;
       VoicePartyAudienceVideoViewController r;
       VoicePartyAudienceVideoViewController t;
       VoicePartyAudienceVideoViewController e;
       String id;
       a uoa = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       VoicePartyAudienceVideoViewController voicePartyAu = VoicePartyAudienceVideoViewController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, uoa, voicePartyAu, "2")) {
          return;
       }
       uoa.Q2(R.layout.arg_RES_7f0d16fa);
       RenderAreaView renderAreaVi = uoa.A2(R.id.live_voice_party_video_chat_rtc_render_area);
       if (!PatchProxy.applyVoidOneRefs(renderAreaVi, uoa, voicePartyAu, "7")) {
          renderAreaVi.getOverlayRecyclerView().setItemAnimator(objArray);
          renderAreaVi.getOverlayRecyclerView().addItemDecoration(new a(new ColorDrawable(r.b(this.D2(), R.color.arg_RES_7f0620b1))));
          renderAreaVi.setPlayerViewPositionObserver(new VoicePartyAudienceVideoViewController$initRenderAreaView$1(uoa));
          renderAreaVi.setPlayerViewVisibilityObserver(new VoicePartyAudienceVideoViewController$initRenderAreaView$2(uoa));
       }
       a uoa1 = PatchProxy.apply(objArray, uoa, voicePartyAu, "8");
       int i = 3;
       int i1 = 1;
       l1 ol1 = 4;
       int i2 = 2;
       boolean b = false;
       if (uoa1 != patchProxyRe) {
       }else {
          d[] uodArray = new d[ol1];
          QCurrentUser mE = QCurrentUser.ME;
          String str = "QCurrentUser.ME";
          a.o(mE, str);
          id = mE.getId();
          a.o(id, "QCurrentUser.ME.id");
          d uod3 = new d(id);
          uodArray[b] = new f(uod3, new b(uoa));
          mE = QCurrentUser.ME;
          a.o(mE, str);
          id = mE.getId();
          a.o(id, "QCurrentUser.ME.id");
          uod3 = new d(id);
          uodArray[i1] = new e(uod3, new c(uoa));
          mE = QCurrentUser.ME;
          a.o(mE, str);
          id = mE.getId();
          a.o(id, "QCurrentUser.ME.id");
          uod3 = new d(id);
          uodArray[i2] = new b(uod3, b, new d(uoa));
          mE = QCurrentUser.ME;
          a.o(mE, str);
          id = mE.getId();
          a.o(id, "QCurrentUser.ME.id");
          uodArray[i] = new c(new d(id), new e(uoa));
          uoa1 = new a(uodArray);
       }
       uoa1.b();
       uoa.p = uoa1;
       i oi = new i("AudienceVoicePartyCameraId_"+uoa.s.h(), b, i2, objArray);
       uoa.k = new c(oi, new VoicePartyAudienceVideoViewController$onCreate$2(uoa), new VoicePartyAudienceVideoViewController$onCreate$3(uoa), b);
       c uoc = PatchProxy.apply(objArray, uoa, voicePartyAu, "6");
       if (uoc != patchProxyRe) {
       }else {
          t ot1 = t.combineLatest(IMicSeatStateServiceKt.a(uoa.t), uoa.v, new f(uoa)).filter(g.b);
          a.o(ot1, "Observable.combineLatest¡­dows.isNotEmpty\(\)\n      }");
          c uoc3 = new c(ot1, uoa.A, uoa.B, null, 8, null);
       }
       uoa.m = uoc;
       VoicePartyAudienceVideoViewController x = uoa.x;
       if (uoc == null) {
          a.S("liveStageRtcClient");
       }
       d uod = uoa.y.invoke(uoa.t, uoa.z);
       VoicePartyAudienceVideoViewController c = uoa.C;
       VoicePartyAudienceVideoViewController k = uoa.k;
       if (k == null) {
          a.S("cameraController");
       }
       boolean b1 = k.d();
       if (PatchProxy.isSupport(voicePartyAu)) {
          Object[] objArray1 = new Object[]{renderAreaVi,x,uoc,uod,c,oi,Boolean.valueOf(b1)};
          uof = PatchProxy.apply(objArray1, uoa, voicePartyAu, "5");
          if (uof != patchProxyRe) {
          label_0210 :
             uoa.l = uof;
             VoicePartyAudienceVideoViewController w = uoa.w;
             if (uof == null) {
                a.S("liveStage");
             }
             w.e(uof);
             d uod1 = new d(this.D2(), uoa.t);
             c uoc1 = new c(uoa, this.B2(), b.a(uod1), renderAreaVi.getOverlayRecyclerView());
             a uoa2 = new a(uoc1, renderAreaVi.getOverlayContainer());
             d uod2 = uod1;
             c uoc2 = uoc1;
             Iterator iterator = uoa.u.invoke(this, uoa.t, uod2, uoc2, uoa.n, uoa2).iterator();
             while (iterator.hasNext()) {
                uoa.z2(iterator.next());
             }
             w = uoa.F;
             if (w != null) {
                r = uoa.r;
                VoicePartyAudienceVideoViewController s = uoa.s;
                t = uoa.t;
                e = uoa.E;
                VoicePartyAudienceVideoViewController k1 = uoa.k;
                if (k1 == null) {
                   a.S("cameraController");
                }
                t ot = uoa.v.map(VoicePartyAudienceVideoViewController$b.b);
                a.o(ot, "openVideoUsers.map { it.¡­s\(QCurrentUser.me\(\).id\) }");
                AudienceVideoCameraControlViewController uAudienceVid = new AudienceVideoCameraControlViewController(r, s, w, t, e, k1, new VoicePartyAudienceVideoViewController$onCreate$$inlined$let$lambda$1(uoa), uoa.G, ot, uoa.H, uoa.I, uoa.q);
                uoa.z2(v1);
             }
             return;
          }
       }
       f$a$b uoa$b = f.s.b().b(x).w(renderAreaVi).x(uoc).C(e.c).u(uod).A(VideoRenderMode.ALWAYS).v(c).d(uoa.V2(b1)).a(oi);
       d0[] uod0Array = new d0[i2];
       uod0Array[b] = new a(uoa);
       r = uoa.p;
       if (r == null) {
          a.S("liveStageLogger");
       }
       uod0Array[i1] = r;
       uof = uoa$b.z(CollectionsKt__CollectionsKt.L(uod0Array)).c();
       goto label_0210 ;
    }
    public void J2(){
       VoicePartyAudienceVideoViewController voicePartyAu = VoicePartyAudienceVideoViewController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, voicePartyAu, "3")) {
          return;
       }
       VoicePartyAudienceVideoViewController tk = this.k;
       if (tk == null) {
          a.S("cameraController");
       }
       tk.i();
       tk = this.w;
       VoicePartyAudienceVideoViewController tl = this.l;
       if (tl == null) {
          a.S("liveStage");
       }
       tk.a(tl);
       tk = this.m;
       if (tk == null) {
          a.S("liveStageRtcClient");
       }
       tk.release();
       this.E.f();
       this.t.d();
       tk = this.p;
       if (tk == null) {
          a.S("liveStageLogger");
       }
       tk.c();
       if (this.s.M() && !PatchProxy.applyVoid(objArray, this, voicePartyAu, "9")) {
          e0 uoe0 = this.r.c();
          VoicePartyAudienceVideoViewController ts = this.s;
          ClientContent$LiveStreamPackage liveStreamPa = this.r.a();
          if (!PatchProxy.applyVoidThreeRefs(uoe0, ts, liveStreamPa, null, q1.class, "40")) {
             String[] stringArray = new String[0];
             e.c("LiveVoicePartyLogger", "VOICE_PARTY_VIDEO_PULL start:"+ts.B()+" end:"+ts.x(), stringArray);
             ClientEvent$ResultPackage resultPackag = new ClientEvent$ResultPackage();
             resultPackag.timeCost = System.currentTimeMillis() - ts.j();
             b.Z(LiveVoicePartyLogTag.AUDIENCE, "VOICE_PARTY_VIDEO_PULL timeCost: "+resultPackag.timeCost);
             n$a uoa = new n$a();
             uoa.h(n.h(ts));
             uoa.f(liveStreamPa);
             uoa.i(resultPackag);
             n.A(uoe0, 10, "VOICE_PARTY_VIDEO_PULL", uoa);
          }
       }
       return;
    }
    public final c V2(boolean p0){
       VoicePartyAudienceVideoViewController voicePartyAu = VoicePartyAudienceVideoViewController.class;
       if (PatchProxy.isSupport(voicePartyAu)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, voicePartyAu, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new c(h.f.a(p0));
    }
    public final d W2(){
       Object obj = PatchProxy.apply(null, this, VoicePartyAudienceVideoViewController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j.getValue();
    }
}
