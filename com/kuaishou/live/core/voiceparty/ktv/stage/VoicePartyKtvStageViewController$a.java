package com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvStageViewController$a;
import com.kuaishou.live.core.voiceparty.ktv.singersetting.LiveVoicePartyKtvSingerSettingDialog$a;
import com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvStageViewController;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import co2.f2;
import fs2.p;
import qu2.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import co2.q1;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveVoicePartyPackage;
import yx2.n;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveMusicPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import java.util.Objects;
import java.lang.Float;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.voiceparty.a;
import q00.b;
import java.lang.Boolean;
import k91.e;
import com.kuaishou.live.common.core.basic.arya.SoundEffectItem;
import kotlin.jvm.internal.a;
import jp2.a;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager;
import com.kuaishou.livestream.message.nano.KtvMusicOrderInfo;
import com.kuaishou.livestream.message.nano.KtvMusicInfo;

public final class VoicePartyKtvStageViewController$a implements LiveVoicePartyKtvSingerSettingDialog$a	// class@001542
{
    public final VoicePartyKtvStageViewController a;

    public void VoicePartyKtvStageViewController$a(VoicePartyKtvStageViewController p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       VoicePartyKtvStageViewController$a uoa = VoicePartyKtvStageViewController$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "4")) {
          return;
       }
       f2 uof2 = this.a.w.l();
       ClientContent$LiveStreamPackage liveStreamPa = this.a.w.h().a();
       if (!PatchProxy.applyVoidTwoRefs(uof2, liveStreamPa, null, q1.class, "85")) {
          n.p(0x77b3, n.g(uof2), null, liveStreamPa, null, n.e(uof2));
       }
       uoa = this.a;
       float f = (float)p0 / (float)100;
       Objects.requireNonNull(uoa);
       VoicePartyKtvStageViewController voicePartyKt = VoicePartyKtvStageViewController.class;
       if (!PatchProxy.isSupport(voicePartyKt) || !PatchProxy.applyVoidOneRefs(Float.valueOf(f), uoa, voicePartyKt, "29")) {
          b.Z(LiveVoicePartyLogTag.KTV, "setVoiceVolume:"+f);
          b uob = uoa.w.a().k();
          if (uob != null) {
             uob.L(f);
          }
       }
       return;
    }
    public void b(boolean p0){
       VoicePartyKtvStageViewController$a uoa = VoicePartyKtvStageViewController$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "8")) {
          return;
       }
       uoa = this.a;
       Objects.requireNonNull(uoa);
       VoicePartyKtvStageViewController voicePartyKt = VoicePartyKtvStageViewController.class;
       if (!PatchProxy.isSupport(voicePartyKt) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), uoa, voicePartyKt, "33")) {
          b.Z(LiveVoicePartyLogTag.KTV, "setAudioNoiseSuppressEnable: "+p0);
          b uob = uoa.w.a().k();
          if (uob != null) {
             e.d(uob, p0);
          }
       }
       return;
    }
    public void c(int p0){
       VoicePartyKtvStageViewController$a uoa = VoicePartyKtvStageViewController$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "7")) {
          return;
       }
       this.a.f3(p0);
       return;
    }
    public void d(boolean p0){
       VoicePartyKtvStageViewController$a uoa = VoicePartyKtvStageViewController$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "9")) {
          return;
       }
       this.a.d3(p0);
       return;
    }
    public void e(SoundEffectItem p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyKtvStageViewController$a.class, "6")) {
          return;
       }
       a.p(p0, "soundEffect");
       this.a.h3(p0);
       return;
    }
    public void f(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, VoicePartyKtvStageViewController$a.class, "3")) {
          return;
       }
       f2 uof2 = this.a.w.l();
       ClientContent$LiveStreamPackage liveStreamPa = this.a.w.h().a();
       KtvMusicOrderInfo ktvMusicOrde = this.a.v.e().A();
       if (ktvMusicOrde != null) {
          ktvMusicOrde = ktvMusicOrde.musicInfo;
          if (ktvMusicOrde != null) {
             objArray = ktvMusicOrde.musicIdStr;
          }
       }
       Object[] objArray1 = objArray;
       boolean b = this.a.v.e().h();
       if (!PatchProxy.isSupport(q1.class) || !PatchProxy.applyVoidFourRefs(uof2, liveStreamPa, objArray1, Boolean.valueOf(b), null, q1.class, "51")) {
          ClientContentWrapper$LiveVoicePartyPackage liveVoicePar = n.g(uof2);
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          double d = (b)? 0x3ff0000000000000: 2.00f;
          uElementPack.value = d;
          n.p(0x77b2, liveVoicePar, uElementPack, liveStreamPa, null, n.e(uof2));
       }
       this.a.t2(true);
       return;
    }
    public void g(int p0){
       VoicePartyKtvStageViewController$a uoa = VoicePartyKtvStageViewController$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "5")) {
          return;
       }
       f2 uof2 = this.a.w.l();
       ClientContent$LiveStreamPackage liveStreamPa = this.a.w.h().a();
       if (!PatchProxy.applyVoidTwoRefs(uof2, liveStreamPa, null, q1.class, "86")) {
          n.p(0x77b4, n.g(uof2), null, liveStreamPa, null, n.e(uof2));
       }
       uoa = this.a;
       float f = (float)p0 / (float)100;
       Objects.requireNonNull(uoa);
       VoicePartyKtvStageViewController voicePartyKt = VoicePartyKtvStageViewController.class;
       if (!PatchProxy.isSupport(voicePartyKt) || !PatchProxy.applyVoidOneRefs(Float.valueOf(f), uoa, voicePartyKt, "30")) {
          b.Z(LiveVoicePartyLogTag.KTV, "setAccompanyVolume: "+f);
          b uob = uoa.w.a().k();
          if (uob != null) {
             uob.K(f);
          }
       }
       return;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, VoicePartyKtvStageViewController$a.class, "1")) {
          return;
       }
       b.Z(LiveVoicePartyLogTag.KTV, "onOpenOriginal");
       VoicePartyKtvStageViewController$a ta = this.a;
       ta.k = true;
       ta.v.b(0);
       q1.k(this.a.w.l(), this.a.w.h().a(), true);
       return;
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, VoicePartyKtvStageViewController$a.class, "2")) {
          return;
       }
       b.Z(LiveVoicePartyLogTag.KTV, "onOpenAccompany");
       VoicePartyKtvStageViewController$a ta = this.a;
       ta.k = false;
       ta.v.b(1);
       q1.k(this.a.w.l(), this.a.w.h().a(), false);
       return;
    }
}
