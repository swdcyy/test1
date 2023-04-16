package com.kuaishou.live.core.voiceparty.theater.VoicePartyTheaterAudienceController;
import com.kuaishou.live.viewcontroller.ViewController;
import zo2.g;
import co2.f2;
import kw2.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import ru2.c;
import ru2.f;
import msd.a;
import msd.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import mw2.f;
import kw2.b;
import qu2.a;
import com.kuaishou.live.core.voiceparty.theater.VoicePartyTheaterAudienceController$a;
import io.reactivex.subjects.PublishSubject;
import iw2.a;
import vw2.a;
import com.kuaishou.live.core.voiceparty.core.audience.theater.AudienceTheaterManager;
import dw2.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.view.View;
import android.view.ViewGroup;
import android.app.Activity;
import com.kuaishou.live.core.voiceparty.player.VoicePartyPlayerController;
import com.kuaishou.live.core.voiceparty.theater.VoicePartyTheaterAudienceController$onCreate$1;
import brd.t;
import hf3.a;
import java.util.Objects;
import zw2.c;
import dw2.d;
import kw2.e;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager;
import q12.c;
import kw2.f;
import gq5.f;
import dt5.c;
import kw2.a;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager;
import iw2.a$b;
import android.view.GestureDetector;
import android.content.Context;
import android.view.GestureDetector$OnGestureListener;
import iw2.b;
import android.view.View$OnTouchListener;
import dw2.l;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterDisplayMode;
import op2.j;
import com.kuaishou.live.core.voiceparty.theater.VoicePartyTheaterAudienceController$setupPlayControls$1;
import androidx.lifecycle.LifecycleOwner;
import u63.a;
import com.kuaishou.live.core.voiceparty.theater.VoicePartyTheaterAudiencePlayerController;
import vq5.d;
import wj2.r0;
import tq5.c;
import pq5.c;
import com.kuaishou.live.core.voiceparty.theater.tube.VoicePartyTheaterAudiencePanelController;
import m91.b;
import com.kuaishou.live.core.voiceparty.b;
import kw2.d;
import qs2.a;
import x61.c;
import com.kuaishou.live.core.voiceparty.apply.VoicePartyAudienceMicApplyButtonViewController;
import com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager;
import com.kuaishou.live.core.voiceparty.theater.chat.TheaterAudienceChatViewLogic;
import eq3.d;
import com.kuaishou.live.core.voiceparty.g0;
import gw2.a;
import j47.a;
import wu2.a;
import i81.f;
import android.content.Intent;
import android.net.Uri;
import java.lang.Integer;
import yx2.d;
import lk2.c;
import com.kuaishou.live.core.voiceparty.playway.shared.widget.StickerhelperKt;
import w02.g;
import op2.e;
import com.kuaishou.live.comments.bulletin.LiveBulletinLayoutManager;
import com.kuaishou.live.comments.bulletin.LiveBulletinStageType;
import i81.c;
import ss2.e;
import gq5.c;
import dt5.b;
import op2.d;
import op2.g;
import java.lang.Runnable;
import ekd.k1;
import d61.y;
import oq5.b;
import hp2.c;
import m56.f;
import java.lang.Boolean;
import m56.g;

public final class VoicePartyTheaterAudienceController extends ViewController	// class@001955
{
    public final f A;
    public final a B;
    public final l C;
    public final f j;
    public AudienceTheaterManager k;
    public c l;
    public a m;
    public a n;
    public ViewController o;
    public final VoicePartyTheaterAudienceController$a p;
    public final PublishSubject q;
    public ViewGroup r;
    public TheaterAudienceChatViewLogic s;
    public final g t;
    public final f2 u;
    public final c v;
    public final Fragment w;
    public final c x;
    public final c y;
    public final c z;

    public void VoicePartyTheaterAudienceController(g p0,f2 p1,c p2,Fragment p3,c p4,c p5,c p6,f p7,a p8,l p9){
       a.p(p0, "param");
       a.p(p1, "voicePartyContext");
       a.p(p2, "dependence");
       a.p(p3, "currentFragment");
       a.p(p5, "childFragmentManager");
       a.p(p6, "micSeatDependency");
       a.p(p7, "micSeatPendantDependency");
       a.p(p8, "closeReasonFetcher");
       a.p(p9, "contextDataSetter");
       super();
       this.t = p0;
       this.u = p1;
       this.v = p2;
       this.w = p3;
       this.x = p4;
       this.y = p5;
       this.z = p6;
       this.A = p7;
       this.B = p8;
       this.C = p9;
       this.j = new f(p2.a().a(), p1);
       this.p = new VoicePartyTheaterAudienceController$a(this);
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<Boolean>\(\)");
       this.q = publishSubje;
    }
    public static final a V2(VoicePartyTheaterAudienceController p0){
       p0 = p0.m;
       if (p0 == null) {
          a.S("clearScreenManager");
       }
       return p0;
    }
    public static final a W2(VoicePartyTheaterAudienceController p0){
       p0 = p0.n;
       if (p0 == null) {
          a.S("qualitySwitchDelegate");
       }
       return p0;
    }
    public static final AudienceTheaterManager X2(VoicePartyTheaterAudienceController p0){
       p0 = p0.k;
       if (p0 == null) {
          a.S("theaterManager");
       }
       return p0;
    }
    public static final c Y2(VoicePartyTheaterAudienceController p0){
       p0 = p0.l;
       if (p0 == null) {
          a.S("theaterPlayerControllerManager");
       }
       return p0;
    }
    public void F2(){
       VoicePartyTheaterAudienceController k1;
       int i;
       String queryParamet;
       ViewGroup viewGroup = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       VoicePartyTheaterAudienceController voicePartyTh = VoicePartyTheaterAudienceController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, viewGroup, voicePartyTh, "3")) {
          return;
       }
       b.Z(LiveVoicePartyLogTag.THEATER, "VoicePartyTheaterAudienceController onCreate");
       viewGroup.Q2(R.layout.arg_RES_7f0d0e36);
       viewGroup.r = viewGroup.A2(0x7f0a4515);
       Activity uActivity = this.B2();
       VoicePartyTheaterAudienceController r = viewGroup.r;
       if (r == null) {
          a.S("playerViewContainer");
       }
       c uoc = new c(uActivity, r, viewGroup.v.a().a(), viewGroup.v.a().c(), viewGroup.q, new VoicePartyTheaterAudienceController$onCreate$1(viewGroup));
       viewGroup.l = v4;
       a uoa = viewGroup.v.a().a();
       VoicePartyTheaterAudienceController u = viewGroup.u;
       VoicePartyTheaterAudienceController t = viewGroup.t;
       a uoa1 = viewGroup.v.a().b();
       b e = viewGroup.v.a().e;
       VoicePartyPlayerController voicePartyPl = viewGroup.v.a().c();
       VoicePartyTheaterAudienceController l = viewGroup.l;
       if (l == null) {
          a.S("theaterPlayerControllerManager");
       }
       Objects.requireNonNull(l);
       d uod = PatchProxy.apply(objArray, l, c.class, "4");
       if (uod != patchProxyRe) {
       }else {
          uod = new d(l);
       }
       AudienceTheaterManager uAudienceThe = new AudienceTheaterManager(uoa, u, t, uoa1, e, voicePartyPl, uod, viewGroup.v.a().f, viewGroup.v.c().b);
       viewGroup.k = v4;
       VoicePartyTheaterAudienceController k = viewGroup.k;
       if (k == null) {
          a.S("theaterManager");
       }
       a uoa2 = new a(k, viewGroup.j, viewGroup.v.d().d(), viewGroup.v.d().d, viewGroup.v.d().k);
       viewGroup.m = v4;
       k = viewGroup.k;
       if (k == null) {
          a.S("theaterManager");
       }
       viewGroup.n = new a(k, objArray);
       String str = "clearScreenManager";
       if (!PatchProxy.applyVoid(objArray, viewGroup, voicePartyTh, "10")) {
          View view3 = viewGroup.A2(R.id.voice_party_theater_audience_player_place_holder);
          r = viewGroup.m;
          if (r == null) {
             a.S(str);
          }
          Objects.requireNonNull(r);
          if (!PatchProxy.applyVoidOneRefs(view3, r, a.class, "2")) {
             a.p(view3, "targetView");
             r.j = view3;
             r.i = new a$b(r);
             view3.setOnTouchListener(new b(new GestureDetector(view3.getContext(), r.i)));
          }
       }
       if (!PatchProxy.applyVoid(objArray, viewGroup, voicePartyTh, "9")) {
          l ol = new l(viewGroup);
          ol.k(TheaterDisplayMode.HALF_SCREEN);
          r = viewGroup.k;
          if (r == null) {
             a.S("theaterManager");
          }
          r.a(ol);
          a.a(viewGroup, new VoicePartyTheaterAudienceController$setupPlayControls$1(viewGroup, ol));
       }
       if (!PatchProxy.applyVoid(objArray, viewGroup, voicePartyTh, "5")) {
          int i2 = 0x7f0a094a;
          a uoa3 = viewGroup.v.a().b();
          VoicePartyTheaterAudienceController k2 = viewGroup.k;
          if (k2 == null) {
             a.S("theaterManager");
          }
          viewGroup.x2(i2, new VoicePartyTheaterAudiencePlayerController(uoa3, k2));
          if (viewGroup.v.c().h() != null && (viewGroup.v.c().f() != null && (viewGroup.v.c().g() != null && (viewGroup.v.d().e() != null && viewGroup.v.d().f != null)))) {
             a uoa4 = viewGroup.v.a().a();
             VoicePartyTheaterAudienceController u1 = viewGroup.u;
             VoicePartyTheaterAudienceController k3 = viewGroup.k;
             if (k3 == null) {
                a.S("theaterManager");
             }
             VoicePartyTheaterAudiencePanelController voicePartyTh1 = new VoicePartyTheaterAudiencePanelController(uoa4, u1, k3, viewGroup.v.c().h(), viewGroup.v.c().f(), viewGroup.v.c().g(), viewGroup.v.d().e(), viewGroup.w, viewGroup.x, viewGroup.y);
             viewGroup.z2(i2);
          }
       label_0221 :
          if (viewGroup.v.c().a() != null && (viewGroup.z.c() != null && (viewGroup.v.b().a() != null && (viewGroup.v.c().b() != null && viewGroup.v.c().h() != null)))) {
             VoicePartyAudienceMicApplyButtonViewController voicePartyAu = new VoicePartyAudienceMicApplyButtonViewController(viewGroup.v.c().a(), viewGroup.z.c(), viewGroup.v.b().b, viewGroup.u, viewGroup.v.b().a(), viewGroup.v.c().b(), viewGroup.v.c().h());
             viewGroup.z2(objArray);
          }
       }
    label_029a :
       TheaterAudienceChatViewLogic theaterAudie = PatchProxy.apply(null, viewGroup, voicePartyTh, "8");
       if (theaterAudie != patchProxyRe) {
       }else {
          Activity uActivity1 = this.B2();
          d uod1 = this.E2();
          View view = viewGroup.A2(0x7f0a27de);
          View view1 = viewGroup.A2(0x7f0a27d9);
          View view2 = viewGroup.A2(0x7f0a27d7);
          k1 = viewGroup.k;
          if (k1 == null) {
             a.S("theaterManager");
          }
          f2 t1 = viewGroup.u.t;
          VoicePartyTheaterAudienceController m = viewGroup.m;
          if (m == null) {
             a.S(str);
          }
          TheaterAudienceChatViewLogic theaterAudie1 = new TheaterAudienceChatViewLogic(uActivity1, uod1, view, view1, view2, k1, t1, m, viewGroup.v.d().d(), viewGroup.v.d().h, viewGroup.v.d().i, viewGroup.v.d().n, viewGroup.z, viewGroup.A);
       }
       viewGroup.s = theaterAudie;
       if (theaterAudie == null) {
          a.S("theaterChatViewLogic");
       }
       theaterAudie.a();
       if (!PatchProxy.applyVoid(null, viewGroup, voicePartyTh, "12")) {
          try{
             Intent intent = this.B2().getIntent();
             if (intent != null) {
                Uri data = intent.getData();
                if (data != null) {
                   queryParamet = data.getQueryParameter("sourceType");
                   if (queryParamet != null) {
                   label_0350 :
                      i = Integer.parseInt(queryParamet);
                   }
                }
             }
             queryParamet = "";
             goto label_0350 ;
          }catch(java.lang.Exception e0){
             i = 0;
          }
          if (i == 207 || (i == 208 || i == 220)) {
             k1 = e0.j;
             int i1 = 7;
             Objects.requireNonNull(k1);
             f uof = f.class;
             if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i1), k1, uof, "4")) {
                new d("JUMP_NEW_ROOM", k1.b, k1.a).h(i1);
                b.Z(LiveVoicePartyLogTag.THEATER, "theater log JUMP_NEW_ROOM");
             }
          }
       }
    label_0391 :
       f j = viewGroup.v.d().j;
       if (j != null) {
          StickerhelperKt.a(j, viewGroup.A2(R.id.live_voice_party_theater_half_screen_chat_view_container), viewGroup);
       }
       g og = viewGroup.v.c().d();
       if (og != null) {
          og.a(viewGroup);
       }
       k1 = viewGroup.k;
       if (k1 == null) {
          a.S("theaterManager");
       }
       k1.a(viewGroup.p);
       k1 = viewGroup.k;
       if (k1 == null) {
          a.S("theaterManager");
       }
       k1.w();
       k1 = viewGroup.C;
       voicePartyTh = viewGroup.k;
       if (voicePartyTh == null) {
          a.S("theaterManager");
       }
       k1.invoke(voicePartyTh.e());
       LiveBulletinLayoutManager liveBulletin = viewGroup.v.d().b();
       if (liveBulletin != null) {
          liveBulletin.i(LiveBulletinStageType.Theater, null);
       }
       return;
    }
    public void J2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, VoicePartyTheaterAudienceController.class, "4")) {
          return;
       }
       VoicePartyTheaterAudienceController ts = this.s;
       if (ts == null) {
          a.S("theaterChatViewLogic");
       }
       Objects.requireNonNull(ts);
       String str = "2";
       if (!PatchProxy.applyVoid(objArray, ts, TheaterAudienceChatViewLogic.class, str)) {
          TheaterAudienceChatViewLogic x = ts.x;
          if (x != null) {
             x.a(ts.q);
             x.a(ts.r);
             x.a(ts.s);
          }
          ts.p.d();
       }
       g og = this.v.c().d();
       if (og != null) {
          og.b(this);
       }
       ts = this.k;
       String str1 = "theaterManager";
       if (ts == null) {
          a.S(str1);
       }
       ts.o(this.p);
       ts = this.m;
       if (ts == null) {
          a.S("clearScreenManager");
       }
       Objects.requireNonNull(ts);
       if (!PatchProxy.applyVoid(objArray, ts, a.class, "1")) {
          a j = ts.j;
          if (j != null) {
             j.setOnTouchListener(objArray);
          }
          j = ts.i;
          if (j != null) {
             j.c = true;
          }
          ts.l.o(ts.c);
          j = ts.n;
          if (j != null) {
             j.l(ts.d);
          }
          j = ts.o;
          if (j != null) {
             j.d(ts.e);
          }
          j = ts.l;
          a k = ts.k;
          Objects.requireNonNull(j);
          if (!PatchProxy.applyVoidOneRefs(k, j, AudienceTheaterManager.class, str)) {
             a.p(k, "timer");
             j.g.g(k);
          }
          k1.m(ts.f);
       }
       if (y.d(this.B2())) {
          b uob = this.v.c().e();
          if (uob != null) {
             uob.d();
          }
       }
       this.C.invoke(objArray);
       ts = this.k;
       if (ts == null) {
          a.S(str1);
       }
       ts.n(this.B.invoke());
       ts = this.l;
       if (ts == null) {
          a.S("theaterPlayerControllerManager");
       }
       Objects.requireNonNull(ts);
       if (!PatchProxy.applyVoid(objArray, ts, c.class, "3")) {
          ts.d.removeAllViews();
       }
       return;
    }
    public final void Z2(){
       if (PatchProxy.applyVoid(null, this, VoicePartyTheaterAudienceController.class, "7")) {
          return;
       }
       VoicePartyTheaterAudienceController to = this.o;
       if (to != null) {
          this.O2(to);
          this.o = null;
       }
       return;
    }
    public final void onEnterBackground(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyTheaterAudienceController.class, "2")) {
          return;
       }
       this.q.onNext(Boolean.TRUE);
       return;
    }
    public final void onEnterForeground(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyTheaterAudienceController.class, "1")) {
          return;
       }
       this.q.onNext(Boolean.FALSE);
       return;
    }
}
