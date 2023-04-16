package com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.controller.TheaterPlayerController;
import java.lang.Object;
import wa1.i;
import ow2.a;
import yw2.o;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.controller.TheaterPlayerController$retryLogic$1;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.controller.TheaterPlayerController$retryLogic$2;
import msd.a;
import mrd.a;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.TheaterPlayer;
import msd.l;
import msd.p;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.TheaterPlayer$Event;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.controller.TheaterPlayerController$a;
import java.lang.Runnable;
import ekd.k1;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.controller.TheaterPlayerController$b;
import com.kwai.video.waynelive.quality.LiveQualityItem;
import java.util.List;
import com.google.common.base.Optional;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.controller.TheaterPlayerController$c;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.TheaterPlayer$State;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.controller.TheaterPlayerController$d;
import ht.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Boolean;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Objects;
import org.greenrobot.eventbus.a;
import java.lang.Throwable;

public abstract class TheaterPlayerController	// class@0019d9
{
    public final i a;
    public final i b;
    public final i c;
    public final i d;
    public final i e;
    public final i f;
    public final a g;
    public final o h;
    public c i;
    public final a j;

    public void TheaterPlayerController(){
       super();
       this.a = new i();
       this.b = new i();
       this.c = new i();
       this.d = new i();
       this.e = new i();
       this.f = new i();
       this.g = new a();
       this.h = new o(new TheaterPlayerController$retryLogic$1(this), new TheaterPlayerController$retryLogic$2(this));
       a uoa = a.g();
       a.o(uoa, "BehaviorSubject.create<O¡­ional<LiveQualityItem>>\(\)");
       this.j = uoa;
    }
    public abstract void A(float p0);
    public void B(long p0){
       TheaterPlayerController theaterPlaye = TheaterPlayerController.class;
       if (PatchProxy.isSupport(theaterPlaye) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, theaterPlaye, "19")) {
          return;
       }
       this.l().e();
       if (p0 - null > 0) {
          this.l().seekTo(p0);
       }
       return;
    }
    public final void a(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TheaterPlayerController.class, "4")) {
          return;
       }
       a.p(p0, "listener");
       this.b.add(p0);
       return;
    }
    public final void b(p p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TheaterPlayerController.class, "6")) {
          return;
       }
       a.p(p0, "listener");
       this.c.add(p0);
       return;
    }
    public final void c(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TheaterPlayerController.class, "2")) {
          return;
       }
       a.p(p0, "listener");
       this.a.add(p0);
       return;
    }
    public final void d(p p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TheaterPlayerController.class, "8")) {
          return;
       }
       a.p(p0, "listener");
       this.d.add(p0);
       return;
    }
    public final void e(TheaterPlayer$Event p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TheaterPlayerController.class, "15")) {
          return;
       }
       a.p(p0, "event");
       k1.o(new TheaterPlayerController$a(this, p0));
       return;
    }
    public final void f(long p0,long p1){
       TheaterPlayerController theaterPlaye = TheaterPlayerController.class;
       if (PatchProxy.isSupport(theaterPlaye) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, theaterPlaye, "16")) {
          return;
       }
       TheaterPlayerController$b uob = new TheaterPlayerController$b(this, p0, p1);
       k1.o(theaterPlaye);
       return;
    }
    public final void g(LiveQualityItem p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TheaterPlayerController.class, "18")) {
          return;
       }
       a.p(p1, "qualityList");
       Optional obj = null;
       if (p1.isEmpty()) {
          p0 = obj;
       }
       Optional optional = this.j.i();
       if (optional != null) {
          obj = optional.orNull();
       }
       if (a.g(obj, p0) ^ 0x01) {
          TheaterPlayerController tj = this.j;
          obj = (p0 == null)? Optional.absent(): Optional.of(p0);
          tj.onNext(obj);
          k1.o(new TheaterPlayerController$c(this, p0, p1));
       }
       return;
    }
    public final void h(TheaterPlayer$State p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TheaterPlayerController.class, "14")) {
          return;
       }
       a.p(p0, "state");
       k1.o(new TheaterPlayerController$d(this, p0));
       return;
    }
    public final c i(){
       return this.i;
    }
    public final long j(){
       Object obj = PatchProxy.apply(null, this, TheaterPlayerController.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.l().getCurrentPosition();
    }
    public final a k(){
       return this.j;
    }
    public abstract TheaterPlayer l();
    public final List m(){
       List obj = PatchProxy.apply(null, this, TheaterPlayerController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.l().getQualityList();
       if (obj == null) {
          obj = CollectionsKt__CollectionsKt.E();
       }
       return obj;
    }
    public abstract boolean n();
    public final boolean o(){
       Object obj = PatchProxy.apply(null, this, TheaterPlayerController.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.l().g();
    }
    public void p(){
       if (PatchProxy.applyVoid(null, this, TheaterPlayerController.class, "23")) {
          return;
       }
       b.Z(LiveVoicePartyLogTag.THEATER, "PlayerController pause");
       this.l().pause();
       TheaterPlayerController ti = this.i;
       if (ti != null) {
          ti.b();
       }
       return;
    }
    public void q(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TheaterPlayerController.class, "26")) {
          return;
       }
       this.r();
       TheaterPlayerController tg = this.g;
       Objects.requireNonNull(tg);
       if (!PatchProxy.applyVoid(objArray, tg, a.class, "1")) {
          a.d().t(tg);
       }
       return;
    }
    public abstract void r();
    public final void s(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TheaterPlayerController.class, "5")) {
          return;
       }
       a.p(p0, "listener");
       this.b.remove(p0);
       return;
    }
    public final void t(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TheaterPlayerController.class, "3")) {
          return;
       }
       a.p(p0, "listener");
       this.a.remove(p0);
       return;
    }
    public abstract void u();
    public void v(){
       if (PatchProxy.applyVoid(null, this, TheaterPlayerController.class, "24")) {
          return;
       }
       b.Z(LiveVoicePartyLogTag.THEATER, "PlayerController resume");
       this.l().resume();
       TheaterPlayerController ti = this.i;
       if (ti != null) {
          ti.h();
       }
       return;
    }
    public void w(long p0){
       TheaterPlayerController theaterPlaye = TheaterPlayerController.class;
       if (PatchProxy.isSupport(theaterPlaye) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, theaterPlaye, "25")) {
          return;
       }
       try{
          this.l().seekTo(p0);
       }catch(java.lang.IllegalStateException e4){
          b.I(LiveVoicePartyLogTag.THEATER, "PlayerController seek failed", e4);
       }
       return;
    }
    public final void x(c p0){
       this.i = p0;
    }
    public abstract void y(float p0);
    public final void z(LiveQualityItem p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TheaterPlayerController.class, "27")) {
          return;
       }
       a.p(p0, "quality");
       this.j.onNext(Optional.of(p0));
       this.l().b(p0);
       return;
    }
}
