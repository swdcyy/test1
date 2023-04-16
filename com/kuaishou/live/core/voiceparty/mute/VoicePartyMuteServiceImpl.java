package com.kuaishou.live.core.voiceparty.mute.VoicePartyMuteServiceImpl;
import yt2.d;
import yx2.i;
import qu2.a;
import co2.f2;
import com.kuaishou.live.core.voiceparty.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import mrd.a;
import yt2.a;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import msd.a;
import java.lang.Integer;
import bs2.a;
import com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi;
import brd.x;
import com.kuaishou.live.core.voiceparty.mute.VoicePartyMuteServiceImpl$b;
import sfc.a;
import erd.g;
import crd.b;
import com.kuaishou.live.core.voiceparty.mute.VoicePartyMuteServiceImpl$a;
import yt2.b;
import com.kuaishou.live.core.voiceparty.mute.MuteState;
import java.lang.Boolean;
import q00.b;
import com.kuaishou.live.core.voiceparty.mute.VoicePartyMuteServiceImpl$c;
import com.kuaishou.live.core.voiceparty.mute.VoicePartyMuteServiceImpl$forceUnmuteSelf$1;
import com.kuaishou.live.core.voiceparty.mute.VoicePartyMuteServiceImpl$unmuteSelf$1;
import com.kuaishou.live.core.voiceparty.mute.VoicePartyMuteServiceImpl$muteSelf$1;

public class VoicePartyMuteServiceImpl extends i implements d	// class@0017fe
{
    public final a d;
    public boolean e;
    public boolean f;
    public final a g;
    public final b h;
    public final a i;
    public final f2 j;
    public final a k;

    public void VoicePartyMuteServiceImpl(a p0,f2 p1,a p2){
       a.p(p0, "liveBaseContext");
       a.p(p1, "voicePartyContext");
       a.p(p2, "aryaProvider");
       super();
       this.i = p0;
       this.j = p1;
       this.k = p2;
       p0 = a.g();
       a.o(p0, "BehaviorSubject.create<MuteState>\(\)");
       this.d = p0;
       p0 = new a();
       this.g = p0;
       this.h = p0;
    }
    public t A(){
       t obj = PatchProxy.apply(null, this, VoicePartyMuteServiceImpl.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d.hide();
       a.o(obj, "muteState.hide\(\)");
       return obj;
    }
    public void C(int p0,a p1){
       VoicePartyMuteServiceImpl voicePartyMu = VoicePartyMuteServiceImpl.class;
       if (PatchProxy.isSupport(voicePartyMu) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, voicePartyMu, "7")) {
          return;
       }
       a.p(p1, "onSuccess");
       LiveVoicePartyApi.b().o(this.i.getLiveStreamId(), this.j.y(), p0).compose(this.L()).subscribe(new VoicePartyMuteServiceImpl$b(p1), new a());
       return;
    }
    public void E(int p0,a p1){
       VoicePartyMuteServiceImpl voicePartyMu = VoicePartyMuteServiceImpl.class;
       if (PatchProxy.isSupport(voicePartyMu) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, voicePartyMu, "6")) {
          return;
       }
       a.p(p1, "onSuccess");
       LiveVoicePartyApi.b().x0(this.i.getLiveStreamId(), this.j.y(), p0).compose(this.L()).subscribe(new VoicePartyMuteServiceImpl$a(p1), new a());
       return;
    }
    public b K(){
       return this.h;
    }
    public void N(){
       if (PatchProxy.applyVoid(null, this, VoicePartyMuteServiceImpl.class, "1")) {
          return;
       }
       this.S(false);
       return;
    }
    public final void P(MuteState p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyMuteServiceImpl.class, "10")) {
          return;
       }
       this.d.onNext(p0);
       return;
    }
    public final a Q(){
       return this.i;
    }
    public final f2 R(){
       return this.j;
    }
    public final void S(boolean p0){
       b uob;
       VoicePartyMuteServiceImpl voicePartyMu = VoicePartyMuteServiceImpl.class;
       if (PatchProxy.isSupport(voicePartyMu) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, voicePartyMu, "9")) {
          return;
       }
       if (p0) {
          uob = this.k.k();
          if (uob != null) {
             uob.j();
          }
       }else {
          uob = this.k.k();
          if (uob != null) {
             uob.f();
          }
       }
       return;
    }
    public final void T(boolean p0,boolean p1,a p2){
       t ot;
       t ot1;
       if (PatchProxy.isSupport(VoicePartyMuteServiceImpl.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), p2, this, VoicePartyMuteServiceImpl.class, "8")) {
          return;
       }
       a.p(p2, "onComplete");
       if (!p0) {
          ot = t.just(new Object());
          a.o(ot, "Observable.just\(Any\(\)\)");
       }else {
          String str = "LiveVoicePartyApi.voiceP¡­text.voicePartyId\n      \)";
          if (p1) {
             ot1 = LiveVoicePartyApi.b().W(this.i.getLiveStreamId(), this.j.y());
             a.o(ot1, str);
          }else {
             ot1 = LiveVoicePartyApi.b().M(this.i.getLiveStreamId(), this.j.y());
             a.o(ot1, str);
          }
          ot = ot1;
       }
       ot.compose(this.L()).subscribe(new VoicePartyMuteServiceImpl$c(this, p1, p2));
       return;
    }
    public boolean a(){
       boolean b = (this.f == null && this.e != null)? true: false;
       return b;
    }
    public void h(boolean p0){
       VoicePartyMuteServiceImpl voicePartyMu = VoicePartyMuteServiceImpl.class;
       if (PatchProxy.isSupport(voicePartyMu) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, voicePartyMu, "5")) {
          return;
       }
       this.f = p0;
       this.T(false, this.a(), new VoicePartyMuteServiceImpl$forceUnmuteSelf$1(this, p0));
       return;
    }
    public void s(boolean p0){
       VoicePartyMuteServiceImpl voicePartyMu = VoicePartyMuteServiceImpl.class;
       if (PatchProxy.isSupport(voicePartyMu) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, voicePartyMu, "4")) {
          return;
       }
       this.T(p0, false, new VoicePartyMuteServiceImpl$unmuteSelf$1(this));
       return;
    }
    public void u(boolean p0){
       VoicePartyMuteServiceImpl voicePartyMu = VoicePartyMuteServiceImpl.class;
       if (PatchProxy.isSupport(voicePartyMu) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, voicePartyMu, "3")) {
          return;
       }
       this.T(p0, true, new VoicePartyMuteServiceImpl$muteSelf$1(this));
       return;
    }
}
