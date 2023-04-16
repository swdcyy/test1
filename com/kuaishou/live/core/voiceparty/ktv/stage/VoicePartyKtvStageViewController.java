package com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvStageViewController;
import jp2.r;
import com.kuaishou.live.core.voiceparty.customview.stage.LiveVoicePartyStageView$b;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager;
import hf3.a;
import fs2.p;
import tt2.b;
import com.kuaishou.live.core.voiceparty.music.util.LiveVoicePartyKtvMusicDownloadHelper;
import fs2.h;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvStageViewController$stageView$2;
import msd.a;
import qrd.p;
import qrd.s;
import ix2.c;
import ix2.d;
import fs2.e;
import co2.f2;
import qu2.a;
import com.kuaishou.live.core.voiceparty.ktv.KtvSingMode;
import mrd.a;
import com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvStageViewController$stageStickerCoverInterceptor$2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import e17.i;
import fs2.f;
import yx2.d;
import fs2.g;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Objects;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$SingRefrain;
import ut7.e;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import co2.q1;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveVoicePartyPackage;
import yx2.n;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveMusicPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.kuaishou.livestream.message.nano.KtvMusicOrderInfo;
import java.lang.Long;
import com.kuaishou.live.core.voiceparty.customview.stage.LiveVoicePartyStageView;
import java.lang.Integer;
import com.kuaishou.live.core.voiceparty.customview.LiveVoicePartyKtvLyricsView;
import com.kuaishou.live.core.voiceparty.customview.LiveVoicePartyKtvLyricsCountDownView;
import android.view.View;
import android.widget.LinearLayout;
import java.util.List;
import com.kuaishou.live.core.voiceparty.customview.LiveVoicePartyKtvLyricsView$b;
import com.yxcorp.plugin.live.widget.LiveLyricsLineView;
import jp2.a;
import jp2.w;
import java.lang.StringBuilder;
import android.widget.RelativeLayout;
import com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvStageViewController$b;
import erd.g;
import crd.b;
import brd.t;
import com.kuaishou.live.core.voiceparty.theater.util.AutoDisposeKt;
import lk2.c;
import fk2.b;
import android.content.Context;
import com.yxcorp.gifshow.util.hardware.HeadsetPlugMonitor;
import ls2.d;
import com.kuaishou.livestream.message.nano.SCActionSignal;
import com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvStageViewController$c;
import lf3.g;
import com.kuaishou.live.common.core.basic.widget.LiveRedDotLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import com.kuaishou.live.core.basic.widget.LivePlayGLSurfaceView;
import android.opengl.GLSurfaceView;
import com.kuaishou.live.basic.dialog.LiveSafeDialogFragment;
import u71.a;
import cy2.h;
import u71.c;
import cy2.h$a;
import com.kuaishou.live.core.voiceparty.ktv.VoicePartyKtvSingModeBottomDialogFragment;
import com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvStageViewController$showSwitchModePanel$1;
import com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvStageViewController$showSwitchModePanel$2;
import msd.l;
import ls2.e;
import android.content.DialogInterface$OnDismissListener;
import androidx.fragment.app.KwaiDialogFragment;
import qrd.l1;
import d61.l0;
import yx2.h;
import com.yxcorp.gifshow.model.Lyrics;
import com.kuaishou.livestream.message.nano.KtvMusicInfo;
import com.kuaishou.live.core.voiceparty.ktv.singersetting.LiveVoicePartyKtvSingerSettingDialog;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;
import pm8.a;
import tr2.j;
import com.kwai.robust.PatchProxyResult;
import ls2.c;
import java.lang.Enum;
import java.lang.Number;
import jp2.q;
import com.kuaishou.live.core.voiceparty.a;
import q00.b;
import android.widget.FrameLayout;
import com.kuaishou.live.core.voiceparty.ktv.emptyrecommend.LiveVoicePartyEmptyRecommendView;
import com.kuaishou.live.common.core.basic.arya.SoundEffectItem;
import tt2.w;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvStageViewController$a;
import com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvStageViewController$d;
import android.content.DialogInterface$OnShowListener;
import com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvStageViewController$e;
import com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvStageViewController$f;
import android.content.DialogInterface$OnCancelListener;
import com.kuaishou.live.dialog.base.LiveBaseDialogFragment;
import com.kuaishou.live.core.voiceparty.d0;
import bs2.b;
import com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi;
import com.kuaishou.live.core.voiceparty.core.shared.a;
import hp2.e;
import brd.x;
import xa1.f;
import ls2.b;
import erd.o;
import com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvStageViewController$g;
import com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvStageViewController$h;
import gs2.g;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lnc.i3;

public class VoicePartyKtvStageViewController extends ViewController implements r, LiveVoicePartyStageView$b	// class@001550
{
    public final p j;
    public boolean k;
    public LiveVoicePartyKtvSingerSettingDialog l;
    public LiveVoicePartyKtvSingerSettingDialog$b m;
    public boolean n;
    public final c o;
    public final e p;
    public VoicePartyKtvSingModeBottomDialogFragment q;
    public boolean r;
    public boolean s;
    public final a t;
    public final p u;
    public final KtvManager v;
    public final p w;
    public final b x;
    public final LiveVoicePartyKtvMusicDownloadHelper y;
    public final h z;

    public void VoicePartyKtvStageViewController(KtvManager p0,a p1,p p2,b p3,LiveVoicePartyKtvMusicDownloadHelper p4,h p5){
       a.p(p0, "ktvManager");
       a.p(p1, "liveLongConnection");
       a.p(p2, "dependency");
       a.p(p3, "orderMusicService");
       a.p(p4, "musicDownloadHelper");
       a.p(p5, "orderMusicDelegate");
       super();
       this.v = p0;
       this.w = p2;
       this.x = p3;
       this.y = p4;
       this.z = p5;
       this.j = s.c(new VoicePartyKtvStageViewController$stageView$2(this));
       this.o = d.a(p1);
       this.p = new e(p2.l(), p2.h());
       a uoa = a.h(KtvSingMode.OFF);
       a.o(uoa, "BehaviorSubject.createDefault\(KtvSingMode.OFF\)");
       this.t = uoa;
       this.u = s.c(new VoicePartyKtvStageViewController$stageStickerCoverInterceptor$2(this));
    }
    public static void n3(VoicePartyKtvStageViewController p0,KtvSingMode p1,a p2,int p3,Object p4){
       p0.m3(p1, null);
    }
    public void A0(boolean p0,boolean p1){
       VoicePartyKtvStageViewController voicePartyKt = VoicePartyKtvStageViewController.class;
       if (PatchProxy.isSupport(voicePartyKt) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, voicePartyKt, "21")) {
          return;
       }
       if (!p1) {
          i.a(R.style.arg_RES_7f11066a, 0x7f10253d);
          return;
       }else {
          f2 uof2 = this.w.l();
          a uoa = this.w.h();
          if (!PatchProxy.applyVoidTwoRefs(uof2, uoa, null, f.class, "10")) {
             a.p(uof2, "voicePartyContext");
             a.p(uoa, "liveBasicContext");
             g.a(new d("VOICEPARTY_KTV_SING_SET_CLICK", uof2, uoa)).f();
          }
          this.k3();
          return;
       }
    }
    public void A1(){
       ClientContentWrapper$ContentWrapper uContentWrap;
       ClientEvent$ElementPackage uElementPack;
       ClientContent$ContentPackage uContentPack;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, VoicePartyKtvStageViewController.class, "23")) {
          return;
       }
       b.Z(LiveVoicePartyLogTag.KTV, "skip to Refrain");
       VoicePartyKtvStageViewController tv = this.v;
       Objects.requireNonNull(tv);
       if (!PatchProxy.applyVoid(objArray, tv, KtvManager.class, "10")) {
          tv.r(new KtvManager$SingRefrain());
       }
       f2 uof2 = this.w.l();
       ClientContent$LiveStreamPackage liveStreamPa = this.w.h().a();
       if (!PatchProxy.applyVoidTwoRefs(uof2, liveStreamPa, objArray, q1.class, "73")) {
          String str = "VOICE_PARTY_KTV_SING_HOT";
          ClientContentWrapper$LiveVoicePartyPackage liveVoicePar = n.g(uof2);
          ClientContentWrapper$LiveMusicPackage liveMusicPac = n.e(uof2);
          if (PatchProxy.isSupport(n.class)) {
             Object[] objArray1 = new Object[]{str,liveVoicePar,objArray,liveStreamPa,objArray,liveMusicPac};
             if (!PatchProxy.applyVoid(objArray1, objArray, n.class, "12")) {
             }
          }else {
          }
       }
    label_0094 :
       return;
    }
    public void C1(KtvMusicOrderInfo p0,boolean p1,long p2){
       if (PatchProxy.isSupport(VoicePartyKtvStageViewController.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Long.valueOf(p2), this, VoicePartyKtvStageViewController.class, "19")) {
          return;
       }
       a.p(p0, "music");
       LiveVoicePartyStageView liveVoicePar = this.a3();
       int i = (int)p2;
       Objects.requireNonNull(liveVoicePar);
       if (!PatchProxy.isSupport(LiveVoicePartyStageView.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), liveVoicePar, LiveVoicePartyStageView.class, "29")) {
          liveVoicePar = liveVoicePar.p;
          Objects.requireNonNull(liveVoicePar);
          if (!PatchProxy.isSupport(LiveVoicePartyKtvLyricsView.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), liveVoicePar, LiveVoicePartyKtvLyricsView.class, "3")) {
             int i1 = liveVoicePar.b(i);
             if (liveVoicePar.e(i1)) {
                LiveLyricsLineView int i2 = liveVoicePar.getFirstLineStartTime() - i;
                int i3 = 4;
                LiveVoicePartyKtvLyricsCountDownView liveVoicePar1 = 3000;
                String str = 4000;
                if (i2 < str && i2 > liveVoicePar1) {
                   liveVoicePar.f(i3);
                }else {
                   int i4 = 3;
                   if (i2 > 2000 && i2 < liveVoicePar1) {
                      liveVoicePar.f(i4);
                   }else if(i2 >= str){
                      LiveVoicePartyKtvLyricsView i21 = liveVoicePar.f;
                      Objects.requireNonNull(i21);
                      if (!PatchProxy.isSupport(LiveVoicePartyKtvLyricsCountDownView.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i3), i21, LiveVoicePartyKtvLyricsCountDownView.class, "2")) {
                         for (; i4 >= 0; i4 = i4 - 1) {
                            i21.getChildAt(i4).setVisibility(false);
                         }
                      }
                   }else {
                      liveVoicePar.f.a();
                   }
                }
                i2 = i1 + 1;
                if (liveVoicePar.e(i2) && (liveVoicePar.b.get(i1).c - i) < 2000) {
                   liveVoicePar.a(liveVoicePar.c(i2), liveVoicePar.b.get(i2));
                }
                if (!PatchProxy.isSupport(LiveVoicePartyKtvLyricsView.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), liveVoicePar, LiveVoicePartyKtvLyricsView.class, "8")) {
                   i1 = liveVoicePar.b(i);
                   if (liveVoicePar.e(i1) && i >= liveVoicePar.b.get(i1).b) {
                      i2 = liveVoicePar.c(i1);
                      if (liveVoicePar.b.get(i1).d == null) {
                         liveVoicePar.a(i2, liveVoicePar.b.get(i1));
                      }
                      i2.setSelected(true);
                      i2.r(i);
                   }
                }
             }
          }
       }
       if (p1 && this.n == null) {
          w ow = this.v.e().e();
          if (ow != null && ow.a()) {
             ow = (p2 - ow.b >= 0)? 1: 0;
             if (ow) {
                this.n = true;
                this.e3(false);
             }
          }
       }
    label_0154 :
       return;
    }
    public void F2(){
       VoicePartyKtvStageViewController voicePartyKt = VoicePartyKtvStageViewController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, voicePartyKt, "3")) {
          return;
       }
       b.Z(LiveVoicePartyLogTag.KTV, "[SM] onCreate@"+this);
       this.Q2(R.layout.arg_RES_7f0d0e79);
       this.a3().b();
       this.a3().setVisibility(0);
       this.a3().setOnStageViewClickListener(this);
       KtvSingMode mV = KtvSingMode.MV;
       this.t.onNext(mV);
       this.g3();
       p d = this.w.d;
       if (d != null) {
          b uob = d.subscribe(new VoicePartyKtvStageViewController$b(this));
          if (uob != null) {
             AutoDisposeKt.b(uob, this);
          }
       }
       VoicePartyKtvStageViewController.n3(this, mV, objArray, 2, objArray);
       q1.l(this.w.l(), this.w.h().a());
       this.v.a(this);
       c uoc = this.w.k();
       if (uoc != null) {
          uoc.d(this.Z2());
       }
       if (!PatchProxy.applyVoid(objArray, this, voicePartyKt, "28")) {
          b uob1 = HeadsetPlugMonitor.c(this.D2(), true).subscribe(new d(this));
          a.o(uob1, "HeadsetPlugMonitor\n     ¡­Changed\(aBoolean\)\n      }");
          AutoDisposeKt.b(uob1, this);
       }
       this.o.a(510, SCActionSignal.class, new VoicePartyKtvStageViewController$c(this));
       return;
    }
    public void G0(LiveRedDotLayout p0){
       boolean b = this;
       Object[] obj = p0;
       VoicePartyKtvStageViewController voicePartyKt = VoicePartyKtvStageViewController.class;
       if (PatchProxy.applyVoidOneRefs(obj, b, voicePartyKt, "16")) {
          return;
       }
       a.p(obj, "redDotLayout");
       if (!PatchProxy.applyVoidOneRefs(obj, b, voicePartyKt, "18")) {
          boolean b1 = false;
          obj.setRedDotEnabled(b1);
          obj = null;
          if (!PatchProxy.applyVoid(obj, b, voicePartyKt, "34")) {
             c fragmentMana = b.w.f().getFragmentManager();
             if (fragmentMana != null) {
                a.o(fragmentMana, "dependency.fragment.fragmentManager ?: return");
                Object obj1 = b.t.i();
                if (obj1 != null) {
                   a.o(obj1, "singModeSubject.value ?: return");
                   b.Z(LiveVoicePartyLogTag.KTV, "showSwitchModePanel");
                   LivePlayGLSurfaceView voicePartyMv = this.a3().getVoicePartyMvView();
                   String str = "stageView.voicePartyMvView";
                   a.o(voicePartyMv, str);
                   double d = (double)voicePartyMv.getWidth();
                   voicePartyMv = this.a3().getVoicePartyMvView();
                   a.o(voicePartyMv, str);
                   double d1 = (double)voicePartyMv.getHeight();
                   VoicePartyKtvStageViewController q = b.q;
                   if (q != null) {
                      q.dismissAllowingStateLoss();
                   }
                   a liveCamera = this.a3().getLiveCamera();
                   c uoc = h.f.a(this.a3().e());
                   if (obj1 != KtvSingMode.VIDEO || !b.v.e().h()) {
                      b1 = 1;
                   }
                   VoicePartyKtvSingModeBottomDialogFragment voicePartyKt1 = new VoicePartyKtvSingModeBottomDialogFragment(liveCamera, uoc, obj1, b1, (d1 / d), b.p, new VoicePartyKtvStageViewController$showSwitchModePanel$1(b, obj1), new VoicePartyKtvStageViewController$showSwitchModePanel$2(b));
                   v15.k0(new e(b, fragmentMana));
                   v15.show(fragmentMana, obj);
                   b.s = true;
                   b.q = v15;
                }
             }
          }
          l0.d("voicePartyKtvSingModeOpened").i(Boolean.TRUE);
          b.p.e("VOICE_PARTY_KTV_ANCHOR_SING_MODE").f();
       }
       return;
    }
    public void J(KtvMusicOrderInfo p0,Lyrics p1){
       boolean b;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VoicePartyKtvStageViewController.class, "10")) {
          return;
       }
       a.p(p0, "music");
       LiveVoicePartyLogTag kTV = LiveVoicePartyLogTag.KTV;
       b.Z(kTV, "[SM] onSing");
       if (p1 != null) {
          this.a3().c(p1);
       }else {
          StringBuilder str = "VPKeyEvent onSing no lyric ";
          p0 = p0.musicInfo;
          KtvMusicInfo musicName = (p0 != null)? p0.musicName: null;
          b.j0(kTV, str+musicName);
       }
       b = false;
       this.k = b;
       VoicePartyKtvStageViewController tl = this.l;
       if (tl == null || (tl.d() && !PatchProxy.applyVoid(null, tl, LiveVoicePartyKtvSingerSettingDialog.class, "5"))) {
          tl.Ah();
       }
    label_0059 :
       this.f3(b);
       this.l3();
       if (this.r != null) {
          this.a3().setSingModeButtonBackground(true);
       }
       if (this.t.i() == KtvSingMode.VIDEO) {
          VoicePartyKtvStageViewController tq = this.q;
          if (tq != null && (tq.I == true && tq != null)) {
             tq.dismissAllowingStateLoss();
          }
       }
       w ow = this.v.e().e();
       if (ow != null) {
          this.e3(ow.a());
       }
       return;
    }
    public void J2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, VoicePartyKtvStageViewController.class, "4")) {
          return;
       }
       this.o.b();
       b.Z(LiveVoicePartyLogTag.KTV, "[SM] onDestroy@"+this);
       VoicePartyKtvStageViewController tl = this.l;
       if (tl != null) {
          if (tl.d()) {
             tl.dismissAllowingStateLoss();
          }
          this.l = objArray;
       }
       tl = this.q;
       if (tl != null) {
          tl.dismissAllowingStateLoss();
       }
       VoicePartyKtvStageViewController.n3(this, KtvSingMode.MV, objArray, 2, objArray);
       this.v.q(this);
       c uoc = this.w.k();
       if (uoc != null) {
          uoc.b(this.Z2());
       }
       a.c2(-1);
       return;
    }
    public void K1(KtvMusicOrderInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyKtvStageViewController.class, "9")) {
          return;
       }
       a.p(p0, "music");
       b.Z(LiveVoicePartyLogTag.KTV, "[SM] onWatchOver");
       if (this.r != null) {
          this.a3().setSingModeButtonBackground(false);
       }
       return;
    }
    public void L1(){
       j.b(this);
    }
    public void S0(KtvMusicOrderInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyKtvStageViewController.class, "17")) {
          return;
       }
       a.p(p0, "music");
       b.Z(LiveVoicePartyLogTag.KTV, "[SM] onSingOver");
       this.k = false;
       this.n = false;
       VoicePartyKtvStageViewController tl = this.l;
       if (tl != null && tl.d()) {
          tl.dismissAllowingStateLoss();
       }
       if (this.r != null) {
          this.a3().setSingModeButtonBackground(false);
       }
       return;
    }
    public boolean V2(KtvSingMode p0,KtvSingMode p1){
       Number number;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, VoicePartyKtvStageViewController.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "currentMode");
       a.p(p1, "newMode");
       b.Z(LiveVoicePartyLogTag.KTV, "singMode changed from "+p0+" to "+p1);
       int i = c.a[p1.ordinal()];
       if (i != 1) {
          number = (i != 2)? null: Integer.valueOf(R.string.arg_RES_7f101b72);
       }else {
          number = Integer.valueOf(R.string.arg_RES_7f101b73);
       }
       if (number != null) {
          i.a(R.style.arg_RES_7f11066a, number.intValue());
       }
       this.t.onNext(KtvSingMode.OFF);
       this.t.onNext(p1);
       return true;
    }
    public final LiveVoicePartyKtvMusicDownloadHelper W2(){
       return this.y;
    }
    public final b X2(){
       return this.x;
    }
    public final a Y2(){
       return this.t;
    }
    public void Z(KtvMusicOrderInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyKtvStageViewController.class, "6")) {
          return;
       }
       a.p(p0, "music");
       b.Z(LiveVoicePartyLogTag.KTV, "[SM] onPrepareWatch");
       this.o3(p0);
       return;
    }
    public final b Z2(){
       Object obj = PatchProxy.apply(null, this, VoicePartyKtvStageViewController.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.u.getValue();
    }
    public final LiveVoicePartyStageView a3(){
       Object obj = PatchProxy.apply(null, this, VoicePartyKtvStageViewController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j.getValue();
    }
    public void b2(KtvMusicOrderInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyKtvStageViewController.class, "7")) {
          return;
       }
       a.p(p0, "music");
       q.c(this, p0);
       b.Z(LiveVoicePartyLogTag.KTV, "[SM] onPrepareSing");
       return;
    }
    public final boolean b3(){
       return this.s;
    }
    public void c3(boolean p0){
       VoicePartyKtvStageViewController tl;
       VoicePartyKtvStageViewController voicePartyKt = VoicePartyKtvStageViewController.class;
       if (PatchProxy.isSupport(voicePartyKt) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, voicePartyKt, "15")) {
          return;
       }
       LiveVoicePartyLogTag kTV = LiveVoicePartyLogTag.KTV;
       b.Z(kTV, "onHeadsetPlugChanged: "+p0);
       if (p0) {
          if (this.v.e().h()) {
             this.l3();
          }
          tl = this.l;
          if (tl != null && tl.d()) {
             b.Z(kTV, "enableOpenOriginalSong");
             tl.xh();
          }
       }else {
          tl = this.l;
          if (tl != null && tl.d()) {
             b.Z(kTV, "disableOpenOriginalSong");
             tl.wh(true);
          }
          if (this.v.e().h() && this.k != null) {
             this.k = false;
             this.v.b(true);
          }
       }
    label_007a :
       return;
    }
    public void d3(boolean p0){
       VoicePartyKtvStageViewController voicePartyKt = VoicePartyKtvStageViewController.class;
       if (PatchProxy.isSupport(voicePartyKt) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, voicePartyKt, "37")) {
          return;
       }
       b.Z(LiveVoicePartyLogTag.KTV, "setAudioPreviewEnable: "+p0);
       return;
    }
    public final void e3(boolean p0){
       boolean b;
       VoicePartyKtvStageViewController voicePartyKt = VoicePartyKtvStageViewController.class;
       if (PatchProxy.isSupport(voicePartyKt) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, voicePartyKt, "11")) {
          return;
       }
       b.Z(LiveVoicePartyLogTag.KTV, "setEnableRefrain: "+p0);
       LiveVoicePartyStageView liveVoicePar = this.a3();
       Objects.requireNonNull(liveVoicePar);
       Object[] objArray = null;
       ClientContent$LiveStreamPackage obj = PatchProxy.apply(objArray, liveVoicePar, LiveVoicePartyStageView.class, "25");
       b = (obj != PatchProxyResult.class)? obj.booleanValue(): liveVoicePar.w.isEnabled();
       if (b == p0) {
          return;
       }else if(p0){
          f2 uof2 = this.w.l();
          obj = this.w.h().a();
          if (!PatchProxy.applyVoidTwoRefs(uof2, obj, objArray, q1.class, "72")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "VOICE_PARTY_KTV_SING_HOT";
             n.u(9, n.g(uof2), uElementPack, obj);
          }
       }
       this.a3().setSingRefrainButtonEnable(p0);
       return;
    }
    public void f2(){
       j.a(this);
    }
    public final void f3(int p0){
       VoicePartyKtvStageViewController voicePartyKt = VoicePartyKtvStageViewController.class;
       if (PatchProxy.isSupport(voicePartyKt) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, voicePartyKt, "32")) {
          return;
       }
       b.Z(LiveVoicePartyLogTag.KTV, "setPitchLevel: "+p0);
       b uob = this.w.a().k();
       if (uob != null) {
          uob.a(p0);
       }
       return;
    }
    public final void g3(){
       if (PatchProxy.applyVoid(null, this, VoicePartyKtvStageViewController.class, "24")) {
          return;
       }
       String str = null;
       int i = 8;
       int i1 = (this.r != null)? 0: 8;
       int i2 = l0.d("voicePartyKtvSingModeOpened").b(Boolean.FALSE).booleanValue() ^ 0x01;
       b.Z(LiveVoicePartyLogTag.KTV, "setSingModeButtonVisible:"+this.r);
       LiveVoicePartyStageView liveVoicePar = this.a3();
       Objects.requireNonNull(liveVoicePar);
       if (!PatchProxy.isSupport(LiveVoicePartyStageView.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i1), Boolean.valueOf(i2), liveVoicePar, LiveVoicePartyStageView.class, "31")) {
          liveVoicePar.z.setRedDotEnabled(i2);
          liveVoicePar.z.setVisibility(i1);
          liveVoicePar.B.setVisibility(i1);
          if (!i1) {
             liveVoicePar.l.setOrderSongViewIndicatorVisibility(i);
          }else {
             liveVoicePar.l.setOrderSongViewIndicatorVisibility(str);
          }
       }
       if (!i1) {
          this.p.e("VOICE_PARTY_KTV_ANCHOR_SING_MODE").g();
       }
       return;
    }
    public void h3(SoundEffectItem p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyKtvStageViewController.class, "31")) {
          return;
       }
       a.p(p0, "soundEffect");
       b.Z(LiveVoicePartyLogTag.KTV, "setSoundEffect: "+p0.mReverbLevel);
       return;
    }
    public final void j3(){
       if (PatchProxy.applyVoid(null, this, VoicePartyKtvStageViewController.class, "26")) {
          return;
       }
       this.a3().h(this.w.h(), this.x, this.y, this.w.l());
       return;
    }
    public final void k3(){
       boolean b;
       c obj;
       boolean b1;
       LiveVoicePartyKtvSingerSettingDialog liveVoicePar;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       VoicePartyKtvStageViewController voicePartyKt = VoicePartyKtvStageViewController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, voicePartyKt, "13")) {
          return;
       }
       b.Z(LiveVoicePartyLogTag.KTV, "show setting dialog");
       SharedPreferences$Editor uEditor = a.a.edit();
       b = true;
       uEditor.putBoolean("has_shown_voice_party_ktv_singer_setting_fragment", b);
       g.a(uEditor);
       if (this.l == null) {
          obj = PatchProxy.apply(objArray, this, voicePartyKt, "27");
          if (obj != patchProxyRe) {
             b1 = obj.booleanValue();
          }else {
             b uob = this.w.a().k();
             b1 = (uob != null)? uob.G(): false;
          }
          if (PatchProxy.isSupport(LiveVoicePartyKtvSingerSettingDialog.class)) {
             liveVoicePar = PatchProxy.applyOneRefs(Boolean.valueOf(b1), objArray, LiveVoicePartyKtvSingerSettingDialog.class, "2");
             if (liveVoicePar != patchProxyRe) {
             label_006f :
                liveVoicePar.G = new VoicePartyKtvStageViewController$a(this);
                liveVoicePar.ph(new VoicePartyKtvStageViewController$d(liveVoicePar, this));
                liveVoicePar.k0(new VoicePartyKtvStageViewController$e(liveVoicePar, this));
                liveVoicePar.oh(new VoicePartyKtvStageViewController$f(this));
                this.l = liveVoicePar;
             }
          }
          liveVoicePar = new LiveVoicePartyKtvSingerSettingDialog();
          liveVoicePar.mh("SUPPORT_AUDIO_PREVIEW", b1);
          goto label_006f ;
       }
       VoicePartyKtvStageViewController tl = this.l;
       if (tl != null) {
          tl.H = this.k;
       }
       if (tl) {
          tl.I = this.v.e().h() ^ b;
       }
       tl = this.l;
       if (tl != null) {
          if (this.w.l().E() || this.v.e().h()) {
             b = false;
          }
          tl.J = b;
       }
       tl = this.l;
       if (tl != null) {
          obj = this.w.f().getChildFragmentManager();
          a.o(obj, "dependency.fragment.childFragmentManager");
          tl.show(obj, "singerSettingDialog");
       }
       return;
    }
    public final void l3(){
       if (PatchProxy.applyVoid(null, this, VoicePartyKtvStageViewController.class, "14")) {
          return;
       }
       if (a.a.getBoolean("has_shown_voice_party_ktv_singer_setting_fragment", false)) {
          return;
       }
       if (d0.m()) {
          b.Z(LiveVoicePartyLogTag.KTV, "Setting dialog Appear FirstTime");
          this.k3();
       }
       return;
    }
    public final void m3(KtvSingMode p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VoicePartyKtvStageViewController.class, "36")) {
          return;
       }
       b uob = LiveVoicePartyApi.c();
       String liveStreamId = this.w.h().getLiveStreamId();
       String str = this.w.m().f().g0();
       String str1 = this.v.e().d();
       int i = 1;
       if (c.b[p0.ordinal()] != i) {
          i = 0;
       }
       t ot = uob.C(liveStreamId, str, str1, i).compose(AutoDisposeKt.a(this));
       f uof = (p1 != null)? new f(): new b();
       ot.retryWhen(uof).subscribe(new VoicePartyKtvStageViewController$g(p0, p1), new VoicePartyKtvStageViewController$h(p1, p0));
       return;
    }
    public void o2(boolean p0){
       VoicePartyKtvStageViewController voicePartyKt = VoicePartyKtvStageViewController.class;
       if (PatchProxy.isSupport(voicePartyKt) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, voicePartyKt, "20")) {
          return;
       }
       if (p0) {
          ClientContent$LiveStreamPackage liveStreamPa = this.w.h().a();
          f2 uof2 = this.w.l();
          if (!PatchProxy.applyVoidTwoRefs(liveStreamPa, uof2, null, g.class, "3")) {
             n.q("CURE_LRC_KTV_CHOOSE_OTHER_SOOG_CLICK", n.g(uof2), null, liveStreamPa);
          }
       }else {
          q1.n(this.w.l(), this.w.h().a(), 1);
       }
       b.Z(LiveVoicePartyLogTag.KTV, "showKtvMusicDialog");
       this.z.a0(1);
       return;
    }
    public final void o3(KtvMusicOrderInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyKtvStageViewController.class, "25")) {
          return;
       }
       if (p0 == null) {
          this.a3().h(this.w.h(), this.x, this.y, this.w.l());
          return;
       }else {
          this.a3().setPrepareSongView(false);
          LiveVoicePartyStageView liveVoicePar = this.a3();
          KtvMusicOrderInfo user = p0.user;
          UserInfos$UserInfo userName = (user != null)? user.userName: null;
          liveVoicePar.setActorName(userName);
          this.a3().setActorAvatar(UserInfo.convertFromProto(p0.user));
          this.a3().g();
          return;
       }
    }
    public void p0(KtvMusicOrderInfo p0){
       q.d(this, p0);
    }
    public void q2(KtvMusicOrderInfo p0,Lyrics p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VoicePartyKtvStageViewController.class, "8")) {
          return;
       }
       a.p(p0, "music");
       b.Z(LiveVoicePartyLogTag.KTV, "[SM] onWatch");
       if (p1 != null) {
          this.a3().c(p1);
       }
       if (this.r != null) {
          this.a3().setSingModeButtonBackground(true);
       }
       return;
    }
    public void t2(boolean p0){
       int i;
       Integer integer;
       VoicePartyKtvStageViewController voicePartyKt = VoicePartyKtvStageViewController.class;
       if (PatchProxy.isSupport(voicePartyKt) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, voicePartyKt, "22")) {
          return;
       }
       if (!p0) {
          i.a(R.style.arg_RES_7f11066a, 0x7f10253d);
          return;
       }else {
          f2 uof2 = this.w.l();
          a uoa = this.w.h();
          if (!PatchProxy.applyVoidTwoRefs(uof2, uoa, null, f.class, "12")) {
             a.p(uof2, "voicePartyContext");
             a.p(uoa, "liveBasicContext");
             i = 1;
             if (uof2.i() != null) {
                QCurrentUser qCurrentUser = QCurrentUser.me();
                a.o(qCurrentUser, "QCurrentUser.me\(\)");
                if (TextUtils.n(String.valueOf(uof2.i().userId), qCurrentUser.getId())) {
                   integer = 1;
                label_006a :
                   d uod = g.a(new d("VOICE_PARTY_KTV_PANEL_CUT_1", uof2, uoa));
                   i3 oi3 = i3.f();
                   if (!integer) {
                      i = 2;
                   }
                   oi3.c("value", Integer.valueOf(i));
                   String str = oi3.e();
                   a.o(str, "JsonStringBuilder.newIns¡­Builder\)\n        .build\(\)");
                   uod.a(str);
                   uod.f();
                }
             }
             integer = null;
             goto label_006a ;
          }
          return;
       }
    }
    public void u1(){
       if (PatchProxy.applyVoid(null, this, VoicePartyKtvStageViewController.class, "5")) {
          return;
       }
       b.Z(LiveVoicePartyLogTag.KTV, "[SM] onIdle");
       this.j3();
       return;
    }
    public void x1(KtvMusicOrderInfo p0){
       q.f(this, p0);
    }
}
