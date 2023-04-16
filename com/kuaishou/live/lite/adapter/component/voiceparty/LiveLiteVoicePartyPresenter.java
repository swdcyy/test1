package com.kuaishou.live.lite.adapter.component.voiceparty.LiveLiteVoicePartyPresenter;
import py2.a;
import b93.d;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.adapter.component.voiceparty.LiveLiteVoicePartyPresenter$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.livestream.message.nano.LiveCommonEffectInfo;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import wd3.a;
import c93.b;
import v51.a;
import or5.d;
import n91.f;
import xp5.i;
import mq5.b;
import aq5.d;
import d93.a;
import vb3.m;
import rc3.d;
import vb3.n;
import e93.c;
import vb3.k;
import vb3.j;
import com.kuaishou.live.lite.gesture.LiveLiteGestureService;
import h03.a;
import n83.b;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import or5.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import hf3.a;
import com.kwai.video.waynelive.LivePlayerController;
import ga1.e;
import n83.a;
import ws5.c;
import mrd.c;
import java.util.Objects;
import wd3.b;
import qrd.l1;
import mq5.h;

public final class LiveLiteVoicePartyPresenter extends d implements a	// class@001e27
{
    public c A;
    public f B;
    public i C;
    public b D;
    public k E;
    public j F;
    public LiveLiteGestureService G;
    public m H;
    public d I;
    public a J;
    public a K;
    public b L;
    public final PublishSubject M;
    public final h N;
    public a v;
    public d w;
    public n x;
    public m y;
    public d z;

    public void LiveLiteVoicePartyPresenter(){
       super();
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<Unit>\(\)");
       this.M = publishSubje;
       this.N = new LiveLiteVoicePartyPresenter$a(this);
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, LiveLiteVoicePartyPresenter.class, "3")) {
          return;
       }
       super.F8();
       this.c9(false);
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, LiveLiteVoicePartyPresenter.class, "6")) {
          return;
       }
       this.d9();
       return;
    }
    public boolean L3(LiveCommonEffectInfo p0){
       LiveLiteVoicePartyPresenter obj = PatchProxy.applyOneRefs(p0, this, LiveLiteVoicePartyPresenter.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "commonEffectInfo");
       obj = this.J;
       if (obj == null) {
          a.S("voicePartyService");
       }
       boolean b = (obj.wd() && p0.isFaceFollowingEffect != null)? true: false;
       return b;
    }
    public void X8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteVoicePartyPresenter.class, "1")) {
          return;
       }
       a.p(p0, "provider");
       this.v = p0.a(a.class);
       this.z = p0.a(d.class);
       this.B = p0.a(f.class);
       this.C = p0.a(i.class);
       this.D = p0.a(b.class);
       this.I = p0.a(d.class);
       return;
    }
    public void Y8(a p0){
       m om = m.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteVoicePartyPresenter.class, "2")) {
          return;
       }
       a.p(p0, "provider");
       this.w = p0.a(d.class);
       this.x = p0.a(n.class);
       this.y = p0.a(om);
       this.A = p0.a(c.class);
       this.E = p0.a(k.class);
       this.F = p0.a(j.class);
       this.G = p0.a(LiveLiteGestureService.class);
       this.H = p0.a(om);
       this.J = p0.a(a.class);
       this.K = p0.a(a.class);
       return;
    }
    public void a9(){
       if (PatchProxy.applyVoid(null, this, LiveLiteVoicePartyPresenter.class, "4")) {
          return;
       }
       this.c9(true);
       return;
    }
    public void b9(){
       if (PatchProxy.applyVoid(null, this, LiveLiteVoicePartyPresenter.class, "5")) {
          return;
       }
       this.d9();
       return;
    }
    public final void c9(boolean p0){
       b uob = this;
       LiveLiteVoicePartyPresenter liveLiteVoic = LiveLiteVoicePartyPresenter.class;
       if (PatchProxy.isSupport(liveLiteVoic) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), uob, liveLiteVoic, "7")) {
          return;
       }
       if (uob.L != null) {
          return;
       }
       LiveLiteVoicePartyPresenter z = uob.z;
       if (z == null) {
          a.S("liveInfoManager");
       }
       LiveStreamFeed liveStreamFe = z.j0();
       a.m(liveStreamFe);
       a.o(liveStreamFe, "liveInfoManager.liveStreamFeed!!");
       LiveLiteVoicePartyPresenter c = uob.C;
       if (c == null) {
          a.S("logPackageProvider");
       }
       z = uob.A;
       if (z == null) {
          a.S("fragmentService");
       }
       BaseFragment uBaseFragmen = z.a();
       z = uob.v;
       if (z == null) {
          a.S("longConnectManager");
       }
       a uoa = z.u();
       a.o(uoa, "longConnectManager.liveLongConnection");
       z = uob.w;
       String str = "playerService";
       if (z == null) {
          a.S(str);
       }
       LivePlayerController livePlayerCo = z.Vc();
       String str1 = "playerService.livePlayerController";
       a.o(livePlayerCo, str1);
       LiveLiteVoicePartyPresenter w = uob.w;
       if (w == null) {
          a.S(str);
       }
       LivePlayerController livePlayerCo1 = w.Vc();
       a.o(livePlayerCo1, str1);
       a uoa1 = new a(livePlayerCo1);
       w = uob.w;
       if (w == null) {
          a.S(str);
       }
       LiveLiteVoicePartyPresenter i = uob.I;
       if (i == null) {
          a.S("liveBizManager");
       }
       LiveLiteVoicePartyPresenter e = uob.E;
       if (e == null) {
          a.S("playerViewService");
       }
       z = uob.F;
       if (z == null) {
          a.S("viewTrackerProvider");
       }
       c uoc = z.b();
       LiveLiteVoicePartyPresenter x = uob.x;
       if (x == null) {
          a.S("viewProviderService");
       }
       LiveLiteVoicePartyPresenter g = uob.G;
       if (g == null) {
          a.S("gestureService");
       }
       LiveLiteVoicePartyPresenter h = uob.H;
       if (h == null) {
          a.S("stageNotifyService");
       }
       z = uob.B;
       if (z == null) {
          a.S("serverTimeProvider");
       }
       b uob1 = new b(liveStreamFe, p0, c, uBaseFragmen, uoa, livePlayerCo, uoa1, w, i, e, uoc, x, g, h, z, uob.M);
       z = uob.J;
       if (z == null) {
          a.S("voicePartyService");
       }
       Objects.requireNonNull(z, "null cannot be cast to non-null type com.kuaishou.live.lite.voiceparty.LiveVoicePartyServiceProxy");
       z.Yn(liveLiteVoic.s());
       uob.L = liveLiteVoic;
       liveLiteVoic = uob.D;
       if (liveLiteVoic == null) {
          a.S("audienceEndService");
       }
       liveLiteVoic.Km(uob.N);
       liveLiteVoic = uob.K;
       if (liveLiteVoic == null) {
          a.S("effectEngineService");
       }
       liveLiteVoic.a(uob);
       return;
    }
    public final void d9(){
       if (PatchProxy.applyVoid(null, this, LiveLiteVoicePartyPresenter.class, "8")) {
          return;
       }
       LiveLiteVoicePartyPresenter tK = this.K;
       if (tK == null) {
          a.S("effectEngineService");
       }
       tK.b(this);
       tK = this.J;
       if (tK == null) {
          a.S("voicePartyService");
       }
       Objects.requireNonNull(tK, "null cannot be cast to non-null type com.kuaishou.live.lite.voiceparty.LiveVoicePartyServiceProxy");
       tK.Yn(null);
       tK = this.D;
       if (tK == null) {
          a.S("audienceEndService");
       }
       tK.le(this.N);
       tK = this.L;
       if (tK != null) {
          tK.destroy();
       }
       this.L = null;
       return;
    }
}
