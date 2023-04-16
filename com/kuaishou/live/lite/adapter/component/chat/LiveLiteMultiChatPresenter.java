package com.kuaishou.live.lite.adapter.component.chat.LiveLiteMultiChatPresenter;
import b93.d;
import b73.b;
import com.kuaishou.live.lite.adapter.component.chat.LiveLiteMultiChatPresenter$a;
import vb3.n;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.lite.adapter.component.chat.model.LiveLiteMultiChatModel;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatUserInfo;
import lf3.g;
import hf3.a;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatClosed;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveInterActiveListener;
import com.kwai.video.waynelive.ILivePlayerStatusMonitor;
import com.kwai.video.waynelive.listeners.LivePlayerTypeChangeListener;
import a73.c;
import w63.a;
import xp5.g;
import a73.a;
import vb3.m;
import eq3.d;
import com.kuaishou.live.viewcontroller.ViewController;
import e83.b;
import v51.a;
import cc3.a;
import java.util.Iterator;
import java.lang.Iterable;
import crd.b;
import oh3.j;
import ekd.k1;
import c93.b;
import d93.a;
import ga1.e;
import com.kwai.video.waynelive.LivePlayerController;
import d93.b;
import b73.a;
import a73.b;
import java.lang.Runnable;

public final class LiveLiteMultiChatPresenter extends d	// class@001d6c
{
    public a A;
    public final b B;
    public LiveLiteMultiChatModel C;
    public a D;
    public final LiveLiteMultiChatPresenter$a E;
    public a v;
    public e w;
    public n x;
    public m y;
    public g z;

    public void LiveLiteMultiChatPresenter(){
       super();
       this.B = new b();
       this.E = new LiveLiteMultiChatPresenter$a(this);
    }
    public static final n c9(LiveLiteMultiChatPresenter p0){
       p0 = p0.x;
       if (p0 == null) {
          a.S("viewProviderService");
       }
       return p0;
    }
    public void F8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveLiteMultiChatPresenter.class, "4")) {
          return;
       }
       super.F8();
       LiveLiteMultiChatPresenter tC = this.C;
       String str = "multiChatModel";
       if (tC == null) {
          a.S(str);
       }
       Objects.requireNonNull(tC);
       LiveLiteMultiChatModel liveLiteMult = LiveLiteMultiChatModel.class;
       if (!PatchProxy.applyVoid(objArray, tC, liveLiteMult, "2")) {
          if (!PatchProxy.applyVoid(objArray, tC, liveLiteMult, "3")) {
             tC.j.u0(774, SCInteractiveChatUserInfo.class, tC.f);
             tC.j.u0(776, SCInteractiveChatClosed.class, tC.g);
          }
          if (!PatchProxy.applyVoid(objArray, tC, liveLiteMult, "7")) {
             tC.k.addLiveInterActiveTsptListener(tC.i);
             tC.k.addLivePlayerTypeChangeListener(tC.h);
          }
       }
       tC = this.C;
       if (tC == null) {
          a.S(str);
       }
       tC.q(this.E);
       LiveLiteMultiChatPresenter tC1 = this.C;
       if (tC1 == null) {
          a.S(str);
       }
       LiveLiteMultiChatPresenter ty = this.y;
       if (ty == null) {
          a.S("stageChangeService");
       }
       LiveLiteMultiChatPresenter tz = this.z;
       if (tz == null) {
          a.S("liveInfoManager");
       }
       this.D = new a(tC1, ty, tz.d());
       d uod = this.P8();
       tC1 = this.D;
       if (tC1 == null) {
          a.S("multiChatLogicController");
       }
       uod.xg(tC1);
       uod = this.P8();
       ty = this.v;
       if (ty == null) {
          a.S("longConnectManager");
       }
       tz = this.A;
       if (tz == null) {
          a.S("merchantForbiddenService");
       }
       uod.xg(new b(ty, tz));
       return;
    }
    public void H8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveLiteMultiChatPresenter.class, "6")) {
          return;
       }
       LiveLiteMultiChatPresenter tC = this.C;
       String str = "multiChatModel";
       if (tC == null) {
          a.S(str);
       }
       tC.r(this.E);
       tC = this.C;
       if (tC == null) {
          a.S(str);
       }
       Objects.requireNonNull(tC);
       LiveLiteMultiChatModel liveLiteMult = LiveLiteMultiChatModel.class;
       if (!PatchProxy.applyVoid(objArray, tC, liveLiteMult, "12")) {
          Iterator iterator = tC.a.iterator();
          while (iterator.hasNext()) {
             j.a(iterator.next());
          }
          k1.n(tC);
          if (!PatchProxy.applyVoid(objArray, tC, liveLiteMult, "13")) {
             tC.j.o(774, tC.f);
             tC.j.o(776, tC.g);
          }
          if (!PatchProxy.applyVoid(objArray, tC, liveLiteMult, "14")) {
             tC.k.removeLivePlayerTypeChangeListener(tC.h);
             tC.k.removeLiveInterActiveTsptListener(tC.i);
          }
       }
       return;
    }
    public void X8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteMultiChatPresenter.class, "2")) {
          return;
       }
       a.p(p0, "provider");
       this.v = p0.a(a.class);
       this.z = p0.a(g.class);
       return;
    }
    public void Y8(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteMultiChatPresenter.class, "3")) {
          return;
       }
       a.p(p0, "provider");
       this.w = p0.a(e.class);
       this.x = p0.a(n.class);
       this.y = p0.a(m.class);
       this.A = p0.a(a.class);
       LiveLiteMultiChatPresenter tv = this.v;
       if (tv == null) {
          a.S("longConnectManager");
       }
       a uoa = tv.u();
       a.o(uoa, "longConnectManager.liveLongConnection");
       LiveLiteMultiChatPresenter tw = this.w;
       if (tw == null) {
          a.S("playerService");
       }
       LivePlayerController livePlayerCo = tw.Vc();
       a.o(livePlayerCo, "playerService.livePlayerController");
       LiveLiteMultiChatModel liveLiteMult = new LiveLiteMultiChatModel(uoa, livePlayerCo);
       this.C = liveLiteMult;
       tv = this.B;
       Objects.requireNonNull(tv);
       if (!PatchProxy.applyVoidOneRefs(liveLiteMult, tv, b.class, "1")) {
          a.p(liveLiteMult, "multiChatModel");
          tv.a = liveLiteMult;
       }
       return;
    }
    public void Z8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteMultiChatPresenter.class, "1")) {
          return;
       }
       a.p(p0, "register");
       p0.d(a.class, this.B);
       return;
    }
    public void onResume(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveLiteMultiChatPresenter.class, "5")) {
          return;
       }
       LiveLiteMultiChatPresenter tC = this.C;
       if (tC == null) {
          a.S("multiChatModel");
       }
       Objects.requireNonNull(tC);
       if (!PatchProxy.applyVoid(objArray, tC, LiveLiteMultiChatModel.class, "4")) {
          k1.s(new b(tC), tC, 10);
       }
       return;
    }
}
