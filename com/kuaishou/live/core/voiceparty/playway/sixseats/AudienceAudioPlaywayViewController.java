package com.kuaishou.live.core.voiceparty.playway.sixseats.AudienceAudioPlaywayViewController;
import com.kuaishou.live.core.voiceparty.playway.sixseats.BaseAudioPlaywayViewController;
import co2.f2;
import qu2.a;
import ws5.c;
import com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager;
import ru2.a;
import wu2.a;
import qc2.a;
import i81.f;
import com.kuaishou.live.comments.bulletin.LiveBulletinLayoutManager;
import ru2.c;
import msd.t;
import m91.b;
import x61.c;
import vq5.d;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.g0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.b;
import qs2.a;
import com.kuaishou.live.core.voiceparty.apply.VoicePartyAudienceMicApplyButtonViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import android.widget.FrameLayout;
import android.view.View;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import co2.q1;
import java.lang.StringBuilder;
import z12.e;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ResultPackage;
import java.lang.System;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import yx2.n$a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import yx2.n;
import com.kwai.robust.PatchProxyResult;
import bv2.a;
import ss2.e;
import ss2.e$a;
import ss2.e$b;
import ss2.h;
import mrd.a;
import brd.t;
import ss2.c;
import com.kuaishou.live.core.voiceparty.playway.sixseats.AudienceAudioPlaywayViewController$createChatViewController$1;
import msd.l;
import com.kuaishou.live.core.voiceparty.playway.sixseats.AudienceAudioPlaywayViewController$createChatViewController$2;
import com.kuaishou.live.core.voiceparty.playway.sixseats.AudienceAudioPlaywayViewController$createChatViewController$3;

public final class AudienceAudioPlaywayViewController extends BaseAudioPlaywayViewController	// class@0018aa
{
    public final c A;
    public final d B;
    public final f2 t;
    public final a u;
    public final a v;
    public final a w;
    public final c x;
    public final t y;
    public final b z;

    public void AudienceAudioPlaywayViewController(f2 p0,a p1,c p2,MicSeatsDataManager p3,a p4,a p5,a p6,f p7,LiveBulletinLayoutManager p8,c p9,t p10,b p11,c p12,d p13){
       int i = this;
       f2 uof2 = p0;
       Object obj = p9;
       Object obj1 = p10;
       a.p(p0, "voicePartyContext");
       a.p(p1, "liveContextWrapper");
       Object obj2 = p3;
       a.p(obj2, "micSeatsDataManager");
       Object obj3 = p4;
       a.p(obj3, "micSeatActionDelegate");
       a.p(obj, "micSeatDependency");
       a.p(obj1, "micSeatPendantsFactory");
       f2 t = uof2.t;
       a.o(t, "voicePartyContext.mModuleSubject");
       super(t, obj2, obj3, p2, p6, p7, p8);
       i.t = uof2;
       i.u = p1;
       i.v = p5;
       i.w = p6;
       i.x = obj;
       i.y = obj1;
       i.z = p11;
       i.A = p12;
       i.B = p13;
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, AudienceAudioPlaywayViewController.class, "1")) {
          return;
       }
       super.F2();
       if (this.x.c() != null && (this.z != null && (this.A != null && (this.x.b() != null && this.B != null)))) {
          VoicePartyAudienceMicApplyButtonViewController voicePartyAu = new VoicePartyAudienceMicApplyButtonViewController(this.z, this.x.c(), this.n, this.t, this.x.b(), this.A, this.B);
          this.z2(v0);
       }
    label_004a :
       AudienceAudioPlaywayViewController tv = this.v;
       if (tv != null) {
          tv.b(this.X2());
       }
       return;
    }
    public void J2(){
       AudienceAudioPlaywayViewController uAudienceAud = AudienceAudioPlaywayViewController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uAudienceAud, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uAudienceAud, "4")) {
          e0 uoe0 = this.u.c();
          AudienceAudioPlaywayViewController tt = this.t;
          ClientContent$LiveStreamPackage liveStreamPa = this.u.a();
          if (!PatchProxy.applyVoidThreeRefs(uoe0, tt, liveStreamPa, null, q1.class, "42")) {
             String[] stringArray = new String[0];
             e.c("LiveVoicePartyLogger", "VOICE_PARTY_AUDIO_PULL start:"+tt.z()+" end:"+tt.v(), stringArray);
             ClientEvent$ResultPackage resultPackag = new ClientEvent$ResultPackage();
             resultPackag.timeCost = System.currentTimeMillis() - tt.j();
             b.Z(LiveVoicePartyLogTag.AUDIENCE, "VOICE_PARTY_AUDIO_PULL timeCost: "+resultPackag.timeCost);
             n$a uoa = new n$a();
             uoa.h(n.h(tt));
             uoa.f(liveStreamPa);
             uoa.i(resultPackag);
             n.A(uoe0, 10, "VOICE_PARTY_AUDIO_PULL", uoa);
          }
       }
       uAudienceAud = this.v;
       if (uAudienceAud != null) {
          uAudienceAud.a(this.X2());
       }
       return;
    }
    public ViewController W2(){
       Object obj = PatchProxy.apply(null, this, AudienceAudioPlaywayViewController.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(this.y, e.d.a().b(c.b(this.x.d().a())).c(new AudienceAudioPlaywayViewController$createChatViewController$1(this)).c(new AudienceAudioPlaywayViewController$createChatViewController$2(this)).c(new AudienceAudioPlaywayViewController$createChatViewController$3(this)).a());
    }
}
