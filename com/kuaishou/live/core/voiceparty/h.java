package com.kuaishou.live.core.voiceparty.h;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.VoicePartyAudienceManagerAssembler;
import t02.a0;
import co2.f2;
import co2.r;
import com.kuaishou.live.core.voiceparty.playway.shared.model.audience.AudienceMicSeatsDataManager;
import brd.t;
import yx2.g;
import crd.a;
import com.kuaishou.live.core.voiceparty.h$a;
import com.kuaishou.live.core.voiceparty.f;
import co2.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager;
import com.kuaishou.live.core.voiceparty.g;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager$c;
import zo2.o;
import zo2.u;
import android.app.Application;
import o56.a;
import android.content.Context;
import ekd.r0;
import java.lang.Boolean;
import mrd.a;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCMicSeatsLeft;
import co2.i;
import lf3.g;
import hf3.a;
import com.kuaishou.socket.nano.SocketMessages$SCVoicePartyAboardApplyResult;
import co2.h;
import co2.k;
import erd.g;
import crd.b;
import co2.m;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import co2.n;
import co2.j;
import erd.a;
import com.kuaishou.live.core.voiceparty.c;
import java.lang.CharSequence;
import e17.i;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import s91.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import com.kwai.framework.network.monitor.NetworkTypeMonitor$a;
import com.kwai.framework.network.monitor.NetworkTypeMonitor$c;
import com.kwai.framework.network.monitor.NetworkTypeMonitor$d;

public class h	// class@0014fd
{
    public final g a;
    public final a0 b;
    public final f2 c;
    public final QLivePlayConfig d;
    public r e;
    public boolean f;
    public final a g;
    public final AudienceMicSeatsDataManager h;
    public b i;
    public h$a j;
    public final a k;
    public final g l;
    public final VoicePartyAudienceManagerAssembler m;
    public int n;
    public static final Object o;

    static {
       h.o = new Object();
    }
    public void h(VoicePartyAudienceManagerAssembler p0,a0 p1,f2 p2,r p3,AudienceMicSeatsDataManager p4,t p5,t p6){
       super();
       this.a = new g(false);
       a uoa = new a();
       this.g = uoa;
       this.j = new h$a(null);
       this.l = new f(this);
       this.n = 0;
       this.m = p0;
       if (PatchProxy.applyVoid(null, this, h.class, "9")) {
       }else {
          p0.c().b(new g(this));
       }
       if (!PatchProxy.applyVoid(null, this, h.class, "8")) {
          p0.b().a(new f(this));
       }
       this.c = p2;
       p2.c = 2;
       this.e = p3;
       this.d = p1.e;
       this.b = p1;
       this.h = p4;
       a uoa1 = a.h(Boolean.valueOf(r0.d(a.b())));
       this.k = uoa1;
       p1 = p1.C;
       if (!PatchProxy.applyVoidOneRefs(p1, this, h.class, "7")) {
          p1.u0(433, LiveStreamMessages$SCMicSeatsLeft.class, new i(this));
          p1.u0(763, SocketMessages$SCVoicePartyAboardApplyResult.class, new h(this));
       }
       if (!PatchProxy.applyVoidOneRefs(p5, this, h.class, "1")) {
          uoa.c(p5.subscribe(new k(this)));
       }
       if (!PatchProxy.applyVoidOneRefs(p6, this, h.class, "2")) {
          uoa.c(p6.subscribe(new m(this)));
       }
       if (!PatchProxy.applyVoid(null, this, h.class, "3") && a.t().u("SOURCE_LIVE").d("checkOnBoardStateWhenNetworkChangedInVoiceParty", false)) {
          uoa.c(uoa1.doOnSubscribe(new n(this)).doOnDispose(new j(this)).distinctUntilChanged().subscribe(new c(this)));
       }
       return;
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "14")) {
          return;
       }
       if (this.c.l != null) {
          if (a.d()) {
             i.d(R.style.arg_RES_7f110668, "离线状态不能上麦");
          }else {
             b.j0(LiveVoicePartyLogTag.AUDIENCE, "离线状态不能上麦");
          }
          return;
       }else {
          this.m.c().c(p0, h.o);
          return;
       }
    }
    public final void b(int p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oh, "13")) {
          return;
       }
       this.m.c().h(p0, h.o);
       return;
    }
    public final int c(int p0){
       a0 obj;
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oh, "23");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = this.b.C2;
       if (obj != null && obj.b()) {
          p0 = 4;
       }
       return p0;
    }
    public final ClientContent$LiveStreamPackage d(){
       Object obj = PatchProxy.apply(null, this, h.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.Z2.a();
    }
    public boolean e(){
       return this.f;
    }
    public void f(int p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oh, "12")) {
          return;
       }
       this.m.c().h(p0, h.o);
       return;
    }
    public final void onEventMainThread(NetworkTypeMonitor$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "4")) {
          return;
       }
       this.k.onNext(Boolean.TRUE);
       return;
    }
    public final void onEventMainThread(NetworkTypeMonitor$c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "6")) {
          return;
       }
       this.k.onNext(Boolean.FALSE);
       return;
    }
    public final void onEventMainThread(NetworkTypeMonitor$d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "5")) {
          return;
       }
       this.k.onNext(Boolean.TRUE);
       return;
    }
}
