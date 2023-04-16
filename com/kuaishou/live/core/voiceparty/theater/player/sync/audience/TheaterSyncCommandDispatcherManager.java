package com.kuaishou.live.core.voiceparty.theater.player.sync.audience.TheaterSyncCommandDispatcherManager;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager$c;
import xw2.d;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager;
import com.kuaishou.live.core.voiceparty.player.VoicePartyPlayerController;
import q12.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import zo2.n0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import com.kuaishou.protobuf.livestream.nano.LiveAryaBroadcastProto$LiveAryaBroadcastMessage;
import qrd.l1;
import java.util.Set;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import xw2.c;
import ee1.a;
import xw2.b;
import com.kuaishou.live.core.voiceparty.theater.player.sync.audience.TheaterSyncCommandDispatcherManager$createStatusManager$$inlined$also$lambda$1;
import msd.p;

public final class TheaterSyncCommandDispatcherManager extends d implements RtcManager$c	// class@0019c2
{
    public d c;
    public final TheaterManager d;
    public final RtcManager e;
    public final VoicePartyPlayerController f;
    public final c g;

    public void TheaterSyncCommandDispatcherManager(TheaterManager p0,RtcManager p1,VoicePartyPlayerController p2,c p3){
       a.p(p0, "theaterManager");
       a.p(p1, "rtcManager");
       a.p(p2, "livePlayerController");
       super();
       this.d = p0;
       this.e = p1;
       this.f = p2;
       this.g = p3;
    }
    public void H(){
       n0.f(this);
    }
    public void I(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TheaterSyncCommandDispatcherManager.class, "1")) {
          return;
       }
       this.i();
       return;
    }
    public void N(Object p0,Map p1){
       n0.e(this, p0, p1);
    }
    public void X(LiveAryaBroadcastProto$LiveAryaBroadcastMessage p0){
       n0.g(this, p0);
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, TheaterSyncCommandDispatcherManager.class, "3")) {
          return;
       }
       d uod = this.h(this.e.g());
       uod.d();
       this.c = uod;
       this.e.b(this);
       return;
    }
    public void e(Set p0){
       n0.a(this, p0);
    }
    public void f(Object p0,int p1){
       if (PatchProxy.isSupport(TheaterSyncCommandDispatcherManager.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, TheaterSyncCommandDispatcherManager.class, "2")) {
          return;
       }
       this.i();
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, TheaterSyncCommandDispatcherManager.class, "4")) {
          return;
       }
       super.g();
       this.e.i(this);
       TheaterSyncCommandDispatcherManager tc = this.c;
       if (tc != null) {
          tc.g();
          this.c = null;
       }
       return;
    }
    public final d h(boolean p0){
       TheaterSyncCommandDispatcherManager theaterSyncC = TheaterSyncCommandDispatcherManager.class;
       if (PatchProxy.isSupport(theaterSyncC)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, theaterSyncC, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       c uoc = (p0)? new c(this.d, this.e.f()): new b(this.d, this.f, this.g);
       uoc.a(new TheaterSyncCommandDispatcherManager$createStatusManager$$inlined$also$lambda$1(this));
       return uoc;
    }
    public final void i(){
       if (PatchProxy.applyVoid(null, this, TheaterSyncCommandDispatcherManager.class, "5")) {
          return;
       }
       TheaterSyncCommandDispatcherManager tc = this.c;
       if (tc != null) {
          tc.g();
       }
       d uod = this.h(this.e.g());
       uod.d();
       this.c = uod;
       return;
    }
    public void i0(Object p0){
       n0.c(this, p0);
    }
}
