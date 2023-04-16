package com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvAudienceStageViewController;
import cp2.d;
import com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvStageViewController;
import com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvAudienceStageViewController$a;
import nsd.u;
import fs2.l;
import com.kuaishou.live.core.voiceparty.core.audience.ktv.AudienceKtvManager;
import do2.a;
import tt2.b;
import com.kuaishou.live.core.voiceparty.music.util.LiveVoicePartyKtvMusicDownloadHelper;
import fs2.h;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import hf3.a;
import fs2.p;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager;
import com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvAudienceStageViewController$audienceMvController$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvAudienceStageViewController$singerMvController$2;
import com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvAudienceStageViewController$b;
import com.kuaishou.live.common.core.basic.widget.LiveRedDotLayout;
import com.kuaishou.livestream.message.nano.KtvMusicOrderInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Long;
import com.kuaishou.live.core.voiceparty.customview.stage.LiveVoicePartyStageView;
import cp2.a;
import jp2.a;
import zo2.e;
import com.kuaishou.livestream.message.nano.SCKtvNextMusicOrderInfo;
import wu2.a;
import android.view.View;
import jv1.b;
import oq5.c;
import brd.t;
import qs5.d;
import gxc.b;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import lnc.qa;
import com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvAudienceStageViewController$e;
import brd.w;
import erd.c;
import com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvAudienceStageViewController$f;
import com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvAudienceStageViewController$g;
import erd.g;
import crd.b;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.core.voiceparty.theater.util.AutoDisposeKt;
import com.yxcorp.gifshow.model.Lyrics;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import ms2.b;
import com.kwai.robust.PatchProxyResult;
import cy2.h;
import com.kuaishou.live.camerahost.view.LiveCameraView;
import com.kuaishou.live.core.voiceparty.a;
import ee1.a;
import com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvAudienceStageViewController$initVideoStreamer$videoStreamer$1;
import com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvAudienceStageViewController$initVideoStreamer$videoStreamer$2;
import cy2.b;
import ay2.e;
import msd.l;
import mrd.a;
import com.kuaishou.live.core.voiceparty.ktv.KtvSingMode;
import yt2.d;
import hs2.y;
import hs2.l;
import java.util.Objects;
import lnc.b9;
import cy2.d;
import d61.c;
import com.google.common.base.Optional;
import com.kuaishou.live.core.voiceparty.player.VoicePartyPlayerController;
import fu2.f;
import co2.f2;
import qu2.a;
import fs2.f;
import java.lang.StringBuilder;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import java.lang.CharSequence;
import q00.b;
import java.util.List;
import bs2.b;
import com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi;
import hp2.e;
import com.kuaishou.live.core.voiceparty.core.shared.a;
import cjd.e;
import erd.o;
import java.util.concurrent.TimeUnit;
import do2.b;
import do2.c;
import crd.a;
import krd.a;
import com.kuaishou.live.common.core.basic.arya.SoundEffectItem;
import com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvAudienceStageViewController$c;
import erd.r;
import brd.x;
import com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvAudienceStageViewController$d;
import java.lang.Integer;
import cy2.l;
import com.kwai.video.waynelive.listeners.LivePlayerTypeChangeListener;

public final class VoicePartyKtvAudienceStageViewController extends VoicePartyKtvStageViewController implements d	// class@001541
{
    public boolean A;
    public final p B;
    public final p C;
    public b D;
    public h E;
    public final c F;
    public final l G;
    public final AudienceKtvManager H;
    public final a I;
    public static final VoicePartyKtvAudienceStageViewController$a J;

    static {
       VoicePartyKtvAudienceStageViewController.J = new VoicePartyKtvAudienceStageViewController$a(null);
    }
    public void VoicePartyKtvAudienceStageViewController(l p0,AudienceKtvManager p1,a p2,b p3,LiveVoicePartyKtvMusicDownloadHelper p4,h p5){
       a.p(p0, "dependency");
       a.p(p1, "ktvManager");
       a.p(p2, "applauseManager");
       a.p(p3, "orderMusicService");
       a.p(p4, "musicDownloadHelper");
       a.p(p5, "orderMusicDelegate");
       super(p1, p0.i(), p0, p3, p4, p5);
       this.G = p0;
       this.H = p1;
       this.I = p2;
       this.B = s.c(new VoicePartyKtvAudienceStageViewController$audienceMvController$2(this));
       this.C = s.c(new VoicePartyKtvAudienceStageViewController$singerMvController$2(this));
       this.F = new VoicePartyKtvAudienceStageViewController$b(this);
    }
    public static final void p3(VoicePartyKtvAudienceStageViewController p0,LiveRedDotLayout p1){
       super.G0(p1);
    }
    public void C1(KtvMusicOrderInfo p0,boolean p1,long p2){
       if (PatchProxy.isSupport(VoicePartyKtvAudienceStageViewController.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Long.valueOf(p2), this, VoicePartyKtvAudienceStageViewController.class, "13")) {
          return;
       }
       a.p(p0, "music");
       super.C1(p0, p1, p2);
       this.a3().j(this.H.u().h(), false);
       return;
    }
    public void F2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, VoicePartyKtvAudienceStageViewController.class, "3")) {
          return;
       }
       super.F2();
       this.a3().setAnchor(false);
       SCKtvNextMusicOrderInfo sCKtvNextMus = this.G.x().b();
       if (sCKtvNextMus != null) {
          objArray = sCKtvNextMus.ktvMusicOrderInfo;
       }
       this.o3(objArray);
       a uoa = this.G.v();
       if (uoa != null) {
          View emptyRecomme = this.a3().getEmptyRecommendView();
          a.o(emptyRecomme, "stageView.emptyRecommendView");
          uoa.b(emptyRecomme);
       }
       b uob = this.G.r();
       if (uob != null) {
          uob.W0(this.F, false);
       }
       return;
    }
    public void G0(LiveRedDotLayout p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyKtvAudienceStageViewController.class, "16")) {
          return;
       }
       a.p(p0, "redDotLayout");
       b uob = t.combineLatest(d.a("live_anchor_plugin", 40), qa.s(b.class, LoadPolicy.DIALOG).d0(), VoicePartyKtvAudienceStageViewController$e.a).subscribe(new VoicePartyKtvAudienceStageViewController$f(this, p0), VoicePartyKtvAudienceStageViewController$g.b);
       a.o(uob, "Observable.combineLatest…oad plugin fail\"\)\n      }");
       AutoDisposeKt.b(uob, this);
       return;
    }
    public void J(KtvMusicOrderInfo p0,Lyrics p1){
       VoicePartyKtvAudienceStageViewController voicePartyKt = VoicePartyKtvAudienceStageViewController.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, voicePartyKt, "11")) {
          return;
       }
       a.p(p0, "music");
       super.J(p0, p1);
       if (!PatchProxy.applyVoid(null, this, voicePartyKt, "23") && this.D == null) {
          b.Z(LiveVoicePartyLogTag.KTV, "init VideoStreamer");
          LiveVoicePartyStageView liveVoicePar = this.a3();
          voicePartyKt = PatchProxy.applyOneRefs(liveVoicePar, this, voicePartyKt, "24");
          if (voicePartyKt != PatchProxyResult.class) {
          }else {
             voicePartyKt = this.E;
             if (voicePartyKt == null) {
                LiveCameraView cameraView = liveVoicePar.getCameraView();
                a.o(cameraView, "stageView.cameraView");
                h oh = new h(cameraView, this.G.a(), this.G.j(), liveVoicePar.e());
                this.E = oh;
             }
          }
          Object obj = voicePartyKt;
          b uob = new b(false, obj, this.G.j(), null, new VoicePartyKtvAudienceStageViewController$initVideoStreamer$videoStreamer$1(this), new VoicePartyKtvAudienceStageViewController$initVideoStreamer$videoStreamer$2(this));
          this.D = LiveVoicePartyLogTag.KTV;
       }
       if (this.Y2().i() == KtvSingMode.VIDEO) {
          this.u3(3);
       }else {
          this.u3(true);
       }
       KtvSingMode ktvSingMode = this.Y2().i();
       if (ktvSingMode != null) {
          a.o(ktvSingMode, "singModeSubject.value ?: return");
          this.s3(ktvSingMode);
          d uod = this.G.n();
          if (uod != null) {
             uod.h(true);
          }
       }
       return;
    }
    public void J2(){
       boolean b;
       Object[] objArray = null;
       String str = "4";
       if (PatchProxy.applyVoid(objArray, this, VoicePartyKtvAudienceStageViewController.class, str)) {
          return;
       }
       super.J2();
       this.r3().c();
       l ol = this.q3();
       Objects.requireNonNull(ol);
       if (!PatchProxy.applyVoid(objArray, ol, l.class, "2")) {
          b.Z(LiveVoicePartyLogTag.KTV, "[MV] release");
          b9.a(ol.d);
          l c = ol.c;
          Objects.requireNonNull(c);
          Object obj = PatchProxy.apply(objArray, c, d.class, "6");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             d c1 = c.c;
             Objects.requireNonNull(c1);
             Optional optional = PatchProxy.apply(objArray, c1, c.class, str);
             if (optional != PatchProxyResult.class) {
             }else {
                optional = Optional.fromNullable(c1.a);
             }
             b = optional.isPresent();
          }
          if (b) {
             ol = ol.b;
             Objects.requireNonNull(ol);
             if (!PatchProxy.applyVoid(objArray, ol, VoicePartyPlayerController.class, "38")) {
                ol.h.d();
             }
          }
       }
    label_007d :
       VoicePartyKtvAudienceStageViewController tE = this.E;
       if (tE != null) {
          tE.c();
       }
       this.E = objArray;
       b uob = this.G.r();
       if (uob != null) {
          uob.Q0(this.F);
       }
       a uoa = this.G.v();
       if (uoa != null) {
          View emptyRecomme = this.a3().getEmptyRecommendView();
          a.o(emptyRecomme, "stageView.emptyRecommendView");
          uoa.a(emptyRecomme);
       }
       return;
    }
    public void K1(KtvMusicOrderInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyKtvAudienceStageViewController.class, "10")) {
          return;
       }
       a.p(p0, "music");
       super.K1(p0);
       this.u3(0);
       return;
    }
    public void L1(){
       if (PatchProxy.applyVoid(null, this, VoicePartyKtvAudienceStageViewController.class, "15")) {
          return;
       }
       if (this.A == null) {
          b.Z(LiveVoicePartyLogTag.KTV, "showApplaudButton");
          this.A = true;
          f.g(false, this.G.l(), this.G.h());
       }
       return;
    }
    public void S0(KtvMusicOrderInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyKtvAudienceStageViewController.class, "12")) {
          return;
       }
       a.p(p0, "music");
       super.S0(p0);
       this.u3(0);
       this.D = null;
       if (a.g(this.H.u().i(), Boolean.TRUE)) {
          d uod = this.G.n();
          if (uod != null) {
             uod.h(0);
          }
       }
       return;
    }
    public void S1(boolean p0){
       VoicePartyKtvAudienceStageViewController voicePartyKt = VoicePartyKtvAudienceStageViewController.class;
       if (PatchProxy.isSupport(voicePartyKt) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, voicePartyKt, "9")) {
          return;
       }
       b.Z(LiveVoicePartyLogTag.KTV, "[SM] onWatchStatusChange: isGuest="+p0);
       this.t3(p0);
       return;
    }
    public boolean V2(KtvSingMode p0,KtvSingMode p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, VoicePartyKtvAudienceStageViewController.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "currentMode");
       a.p(p1, "newMode");
       boolean b = super.V2(p0, p1);
       if (b && (this.H.u().h() && this.H.u().b())) {
          if (p1 == KtvSingMode.MV) {
             this.u3(1);
             this.s3(p1);
          }else if(p1 == KtvSingMode.VIDEO){
             this.u3(3);
             this.s3(p1);
          }
       }
       return b;
    }
    public void b2(KtvMusicOrderInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyKtvAudienceStageViewController.class, "7")) {
          return;
       }
       a.p(p0, "music");
       super.b2(p0);
       this.o3(p0);
       this.a3().setLoadingText(this.G.d().getString(R.string.arg_RES_7f10254b));
       return;
    }
    public void d3(boolean p0){
       b uob;
       VoicePartyKtvAudienceStageViewController voicePartyKt = VoicePartyKtvAudienceStageViewController.class;
       if (PatchProxy.isSupport(voicePartyKt) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, voicePartyKt, "19")) {
          return;
       }
       super.d3(p0);
       if (p0) {
          uob = this.G.a().k();
          if (uob != null) {
             uob.y();
          }
       }else {
          uob = this.G.a().k();
          if (uob != null) {
             uob.P();
          }
       }
       return;
    }
    public void f2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, VoicePartyKtvAudienceStageViewController.class, "14")) {
          return;
       }
       LiveVoicePartyLogTag kTV = LiveVoicePartyLogTag.KTV;
       b.Z(kTV, "onApplaudClick");
       f.g(true, this.G.l(), this.G.h());
       VoicePartyKtvAudienceStageViewController tI = this.I;
       Objects.requireNonNull(tI);
       if (!PatchProxy.applyVoid(objArray, tI, a.class, "2")) {
          tI.a();
          KtvMusicOrderInfo ktvMusicOrde = tI.m.e().A();
          if (ktvMusicOrde != null) {
             b.P(kTV.appendTag("VoicePartyApplauseAudienceController"), "观众自己鼓掌，发送鼓掌请求");
             b uob = LiveVoicePartyApi.c().B(tI.k.getLiveStreamId(), tI.l.f().g0(), tI.m.e().d(), ktvMusicOrde.musicOrderId).map(new e()).throttleFirst(1, TimeUnit.SECONDS).subscribe(new b(tI), c.b);
             a.o(uob, "LiveVoicePartyApi.voiceP…    it\n        \)\n      }\)");
             a.b(tI.g, uob);
          }
       }
       return;
    }
    public void h3(SoundEffectItem p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyKtvAudienceStageViewController.class, "18")) {
          return;
       }
       a.p(p0, "soundEffect");
       super.h3(p0);
       b uob = this.G.a().k();
       if (uob != null) {
          uob.F(p0.mReverbLevel);
          f.f(this.G.l(), this.G.h(), p0.mReverbLevel);
       }
       return;
    }
    public void q2(KtvMusicOrderInfo p0,Lyrics p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VoicePartyKtvAudienceStageViewController.class, "8")) {
          return;
       }
       a.p(p0, "music");
       super.q2(p0, p1);
       this.a3().j(false, false);
       this.t3(a.g(Boolean.TRUE, this.H.u().i()));
       return;
    }
    public final l q3(){
       Object obj = PatchProxy.apply(null, this, VoicePartyKtvAudienceStageViewController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.B.getValue();
    }
    public final y r3(){
       Object obj = PatchProxy.apply(null, this, VoicePartyKtvAudienceStageViewController.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.C.getValue();
    }
    public final void s3(KtvSingMode p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyKtvAudienceStageViewController.class, "20")) {
          return;
       }
       b.Z(LiveVoicePartyLogTag.KTV, "notifyAnchorSingMode: "+p0);
       t.interval(0, 1, TimeUnit.SECONDS).takeUntil(VoicePartyKtvAudienceStageViewController$c.b).compose(AutoDisposeKt.a(this)).subscribe(new VoicePartyKtvAudienceStageViewController$d(this, p0));
       return;
    }
    public void t2(boolean p0){
       VoicePartyKtvAudienceStageViewController voicePartyKt = VoicePartyKtvAudienceStageViewController.class;
       if (PatchProxy.isSupport(voicePartyKt) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, voicePartyKt, "17")) {
          return;
       }
       super.t2(p0);
       if (p0) {
          b.Z(LiveVoicePartyLogTag.KTV, "playNext");
          this.H.n();
       }
       return;
    }
    public final void t3(boolean p0){
       VoicePartyKtvAudienceStageViewController voicePartyKt = VoicePartyKtvAudienceStageViewController.class;
       if (PatchProxy.isSupport(voicePartyKt) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, voicePartyKt, "21")) {
          return;
       }
       if (p0) {
          this.u3(1);
       }else {
          this.u3(2);
       }
       return;
    }
    public void u1(){
       if (PatchProxy.applyVoid(null, this, VoicePartyKtvAudienceStageViewController.class, "6")) {
          return;
       }
       super.u1();
       this.a3().g();
       this.u3(0);
       return;
    }
    public final void u3(int p0){
       VoicePartyKtvAudienceStageViewController tD;
       VoicePartyKtvAudienceStageViewController voicePartyKt = VoicePartyKtvAudienceStageViewController.class;
       if (PatchProxy.isSupport(voicePartyKt) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, voicePartyKt, "22")) {
          return;
       }
       int i = 1;
       if (p0 == i) {
          b.Z(LiveVoicePartyLogTag.KTV, "[Stage] show Guest Video");
          tD = this.D;
          if (tD != null) {
             tD.e();
          }
          this.q3().b();
          this.r3().b();
       }else {
          Object[] objArray = null;
          if (p0 == 2) {
             LiveVoicePartyLogTag kTV = LiveVoicePartyLogTag.KTV;
             b.Z(kTV, "[Stage] show Audience Video");
             VoicePartyKtvAudienceStageViewController tD1 = this.D;
             if (tD1 != null) {
                tD1.e();
             }
             this.r3().a();
             l ol = this.q3();
             Objects.requireNonNull(ol);
             if (!PatchProxy.applyVoid(objArray, ol, l.class, "4") && ol.e == null) {
                ol.e = i;
                b.Z(kTV, "[MV] onStartSing");
                ol.b.k(ol);
                ol.c.a();
             }
          }else if(p0 == 3){
             b.Z(LiveVoicePartyLogTag.KTV, "[Stage] show Camera Preview");
             this.r3().a();
             this.q3().b();
             tD = this.E;
             if (tD != null) {
                tD.e = this.a3().e();
             }
             tD = this.D;
             if (tD != null) {
                l.d(tD, false, i, objArray);
             }
          }else {
             b.Z(LiveVoicePartyLogTag.KTV, "[Stage] hide all");
             tD = this.D;
             if (tD != null) {
                tD.e();
             }
             this.q3().b();
             this.r3().a();
          }
       }
       return;
    }
}
