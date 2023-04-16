package com.kuaishou.live.core.voiceparty.playway.crosspk.VoicePartyAudienceCrossRoomPkController;
import com.kuaishou.live.viewcontroller.ViewController;
import iu2.a;
import ru2.c;
import msd.t;
import eu2.g;
import com.kuaishou.live.core.voiceparty.playway.crosspk.VoicePartyAudienceCrossRoomPkController$a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kuaishou.live.core.voiceparty.crossroompk.stageview.VoicePartyCrossRoomPkStageView;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import java.util.Objects;
import crd.b;
import ws5.c;
import com.kuaishou.live.core.voiceparty.playway.crosspk.VoicePartyAudienceCrossRoomPkController$onCreate$1;
import androidx.lifecycle.LifecycleOwner;
import msd.a;
import u63.a;
import t02.a0;
import ee1.a;
import com.kwai.robust.PatchProxyResult;
import tp2.b;
import iu2.g;
import sp2.a;
import co2.f2;
import wp2.f;
import iu2.e;
import zo2.c;
import hp2.f;
import hf3.a;
import com.kuaishou.live.core.voiceparty.playway.crosspk.VoicePartyAudienceCrossRoomPkController$onCreate$2;
import ss2.e;
import ss2.e$a;
import ss2.e$b;
import ss2.h;
import mrd.a;
import brd.t;
import ss2.c;
import com.kuaishou.live.core.voiceparty.playway.crosspk.VoicePartyAudienceCrossRoomPkController$onCreate$selfDataManager$1;
import msd.l;
import com.kuaishou.live.core.voiceparty.playway.crosspk.VoicePartyAudienceCrossRoomPkController$onCreate$selfDataManager$2;
import com.kuaishou.live.core.voiceparty.playway.crosspk.VoicePartyAudienceCrossRoomPkController$onCreate$selfDataManager$3;
import com.kuaishou.live.core.voiceparty.playway.crosspk.VoicePartyAudienceCrossRoomPkController$onCreate$selfDataManager$4;
import com.kuaishou.live.core.voiceparty.playway.crosspk.VoicePartyAudienceCrossRoomPkController$onCreate$selfDataManager$5;
import com.kuaishou.live.core.voiceparty.playway.crosspk.VoicePartyAudienceCrossRoomPkController$onCreate$opponentDataManager$1;
import com.kuaishou.live.core.voiceparty.playway.crosspk.VoicePartyAudienceCrossRoomPkController$onCreate$opponentDataManager$2;
import com.kuaishou.live.core.voiceparty.playway.crosspk.VoicePartyAudienceCrossRoomPkController$onCreate$opponentDataManager$3;
import iu2.c;
import com.kuaishou.live.core.voiceparty.playway.crosspk.VoicePartyAudienceCrossRoomPkController$onCreate$chatViewController$1;
import m91.b;
import com.kuaishou.live.core.voiceparty.b;
import qs2.a;
import x61.c;
import vq5.d;
import com.kuaishou.live.core.voiceparty.apply.VoicePartyAudienceMicApplyButtonViewController;
import com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager;
import wu2.a;
import lnc.a1;
import com.kuaishou.livestream.message.nano.SCLiveVoicePartyPkOpMicSeats;
import pr2.a;
import wp2.e;
import wa1.h;

public final class VoicePartyAudienceCrossRoomPkController extends ViewController	// class@001859
{
    public final String j;
    public ViewGroup k;
    public VoicePartyCrossRoomPkStageView l;
    public ViewGroup m;
    public b n;
    public a o;
    public e p;
    public final a q;
    public final c r;
    public final t s;
    public final t t;
    public final g u;
    public VoicePartyAudienceCrossRoomPkController$a v;

    public void VoicePartyAudienceCrossRoomPkController(a p0,c p1,t p2,t p3,g p4,VoicePartyAudienceCrossRoomPkController$a p5){
       a.p(p0, "dependence");
       a.p(p1, "micSeatDependency");
       a.p(p2, "selfPendantsFactory");
       a.p(p3, "opponentPendantsFactory");
       a.p(p5, "crossRoomPKStateListener");
       super();
       this.q = p0;
       this.r = p1;
       this.s = p2;
       this.t = p3;
       this.u = p4;
       this.v = p5;
       String name = VoicePartyAudienceCrossRoomPkController.class.getName();
       a.o(name, "javaClass.name");
       this.j = name;
    }
    public static final VoicePartyCrossRoomPkStageView V2(VoicePartyAudienceCrossRoomPkController p0){
       p0 = p0.l;
       if (p0 == null) {
          a.S("stageView");
       }
       return p0;
    }
    public void F2(){
       VoicePartyAudienceCrossRoomPkController voicePartyAu = VoicePartyAudienceCrossRoomPkController.class;
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, this, voicePartyAu, str)) {
          return;
       }
       LiveVoicePartyLogTag cROSS_ROOM_T = LiveVoicePartyLogTag.CROSS_ROOM_TEAM_PK;
       b.Z(cROSS_ROOM_T, this.j+" onCreate");
       View view = LayoutInflater.from(this.B2()).inflate(R.layout.arg_RES_7f0d0e35, objArray);
       Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
       this.k = view;
       view = view.findViewById(R.id.live_voice_party_audience_cross_room_pk_stage_view);
       a.o(view, "container.findViewById<V¡­cross_room_pk_stage_view\)");
       this.l = view;
       VoicePartyAudienceCrossRoomPkController tk = this.k;
       String str1 = "container";
       if (tk == null) {
          a.S(str1);
       }
       view = tk.findViewById(R.id.live_voice_party_cross_room_team_pk_chat_view_container);
       a.o(view, "container.findViewById\(R¡­m_pk_chat_view_container\)");
       this.m = view;
       tk = this.k;
       if (tk == null) {
          a.S(str1);
       }
       this.R2(tk);
       a k = this.q.k;
       VoicePartyAudienceCrossRoomPkController tk1 = this.k;
       if (tk1 == null) {
          a.S(str1);
       }
       View view1 = tk1.findViewById(R.id.live_voice_party_audience_cross_room_pk_top_bar_place_holder);
       a.o(view1, "container.findViewById<V¡­_pk_top_bar_place_holder\)");
       b uob = k.a(view1);
       a.a(this, new VoicePartyAudienceCrossRoomPkController$onCreate$1(uob));
       if (this.q.i() != null && this.q.j() != null) {
          g og = PatchProxy.apply(objArray, this, voicePartyAu, "3");
          if (og != PatchProxyResult.class) {
          }else {
             og = new g(this);
          }
          this.n = og;
          a.m(og);
          a uoa = new a(this.q.j, og);
          this.o = uoa;
          a.m(uoa);
          uoa.d();
       }else {
          this.p = new e(this.q.h().a(), this.q.f(), new VoicePartyAudienceCrossRoomPkController$onCreate$2(this));
       }
       e$b d = e.d;
       c uoc = new c(d.a().b(c.b(this.r.d().a())).c(new VoicePartyAudienceCrossRoomPkController$onCreate$selfDataManager$1(this)).c(new VoicePartyAudienceCrossRoomPkController$onCreate$selfDataManager$2(this)).c(new VoicePartyAudienceCrossRoomPkController$onCreate$selfDataManager$3(this)).c(new VoicePartyAudienceCrossRoomPkController$onCreate$selfDataManager$4(this)).c(VoicePartyAudienceCrossRoomPkController$onCreate$selfDataManager$5.INSTANCE).a(), this.s, d.a().b(c.b(this.r.d().b())).c(VoicePartyAudienceCrossRoomPkController$onCreate$opponentDataManager$1.INSTANCE).c(VoicePartyAudienceCrossRoomPkController$onCreate$opponentDataManager$2.INSTANCE).c(VoicePartyAudienceCrossRoomPkController$onCreate$opponentDataManager$3.INSTANCE).a(), this.t, this.q.h().b(), new VoicePartyAudienceCrossRoomPkController$onCreate$chatViewController$1(this));
       VoicePartyAudienceCrossRoomPkController tm = this.m;
       String str2 = "chatViewContainer";
       if (tm == null) {
          a.S(str2);
       }
       this.y2(tm, d);
       if (this.q.b() != null && (this.r.c() != null && (this.r.b() != null && (this.q.c() != null && this.q.d() != null)))) {
          VoicePartyAudienceMicApplyButtonViewController voicePartyAu1 = new VoicePartyAudienceMicApplyButtonViewController(this.q.b(), this.r.c(), this.q.g(), this.r.f(), this.r.b(), this.q.c(), this.q.d());
          this.z2(d);
       }
    label_01d9 :
       a uoa1 = this.q.e();
       if (uoa1 != null) {
          tm = this.m;
          if (tm == null) {
             a.S(str2);
          }
          uoa1.b(tm);
       }
       b.Z(cROSS_ROOM_T, this.j+" init");
       voicePartyAu = this.u;
       if (voicePartyAu != null) {
          voicePartyAu.e(a1.p(R.string.arg_RES_7f1050d5));
       }
       voicePartyAu = this.o;
       if (voicePartyAu != null) {
          SCLiveVoicePartyPkOpMicSeats sCLiveVoiceP = this.q.h().c();
          uoc = this.q.h().d;
          if (!PatchProxy.applyVoidTwoRefs(sCLiveVoiceP, uoc, voicePartyAu, a.class, str)) {
             b.Z(cROSS_ROOM_T, "VoicePartyCrossRoomPkAudienceController startPK");
             if (sCLiveVoiceP == null) {
                sCLiveVoiceP = uoc;
             }
             voicePartyAu.e(a.class).g(1, sCLiveVoiceP);
          }
       }
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, VoicePartyAudienceCrossRoomPkController.class, "2")) {
          return;
       }
       LiveVoicePartyLogTag cROSS_ROOM_T = LiveVoicePartyLogTag.CROSS_ROOM_TEAM_PK;
       String str = " onDestroy";
       b.Z(cROSS_ROOM_T, this.j+str);
       a uoa = this.q.e();
       if (uoa != null) {
          VoicePartyAudienceCrossRoomPkController tm = this.m;
          if (tm == null) {
             a.S("chatViewContainer");
          }
          uoa.a(tm);
       }
       b.Z(cROSS_ROOM_T, this.j+str);
       VoicePartyAudienceCrossRoomPkController tu = this.u;
       if (tu != null) {
          tu.m();
       }
       tu = this.o;
       if (tu != null) {
          tu.unbind();
       }
       tu = this.o;
       if (tu != null) {
          tu.destroy();
       }
       this.o = null;
       tu = this.p;
       if (tu != null && !PatchProxy.applyVoid(null, tu, e.class, "1")) {
          tu.a.b();
       }
       this.n = null;
       return;
    }
}
