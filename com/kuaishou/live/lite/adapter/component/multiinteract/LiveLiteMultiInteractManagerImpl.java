package com.kuaishou.live.lite.adapter.component.multiinteract.LiveLiteMultiInteractManagerImpl;
import sz1.m;
import com.kwai.video.waynelive.LivePlayerController;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.adapter.component.multiinteract.LiveLiteMultiInteractManagerImpl$mDependenceProvider$1;
import com.kuaishou.live.lite.adapter.component.multiinteract.LiveLiteMultiInteractManagerImpl$h;
import com.kuaishou.live.lite.adapter.component.multiinteract.LiveLiteMultiInteractManagerImpl$d;
import com.kuaishou.live.lite.adapter.component.multiinteract.LiveLiteMultiInteractManagerImpl$e;
import com.kuaishou.live.lite.adapter.component.multiinteract.LiveLiteMultiInteractManagerImpl$c;
import com.kuaishou.live.lite.adapter.component.multiinteract.LiveLiteMultiInteractManagerImpl$f;
import com.kuaishou.live.lite.adapter.component.multiinteract.LiveLiteMultiInteractManagerImpl$g;
import com.kuaishou.live.lite.adapter.component.multiinteract.LiveLiteMultiInteractManagerImpl$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lp3.e;
import lp3.a;
import sa1.b;
import lp3.c;
import lh3.b;
import xg3.a;
import com.kuaishou.live.multiinteract.rtc.b;
import lh3.i0;
import com.kwai.video.waynelive.listeners.LivePlayerTypeChangeListener;
import com.kwai.video.waynelive.ILivePlayerStatusMonitor;
import mq5.b;
import mq5.h;
import lz1.g;
import com.kuaishou.protobuf.livestage.nano.LiveStageProto$LayoutConfig;
import sa1.b$a;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveSeiInfoListener;
import gh3.a;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.lite.adapter.component.multiinteract.LiveLiteMultiInteractManagerImpl$a;

public final class LiveLiteMultiInteractManagerImpl extends m	// class@001e06
{
    public b A;
    public b B;
    public final LiveLiteMultiInteractManagerImpl$d C;
    public final LiveLiteMultiInteractManagerImpl$e D;
    public a E;
    public final i0 F;
    public final IKwaiMediaPlayer$OnLiveSeiInfoListener G;
    public final LiveLiteMultiInteractManagerImpl$g H;
    public final LivePlayerTypeChangeListener I;
    public final LivePlayerController J;
    public b y;
    public final h z;

    public void LiveLiteMultiInteractManagerImpl(LivePlayerController p0){
       a.p(p0, "livePlayerController");
       super();
       this.J = p0;
       this.y = new LiveLiteMultiInteractManagerImpl$mDependenceProvider$1(this);
       this.z = new LiveLiteMultiInteractManagerImpl$h(this);
       this.C = new LiveLiteMultiInteractManagerImpl$d();
       this.D = new LiveLiteMultiInteractManagerImpl$e(this);
       this.F = new LiveLiteMultiInteractManagerImpl$c(this);
       this.G = new LiveLiteMultiInteractManagerImpl$f(this);
       this.H = new LiveLiteMultiInteractManagerImpl$g(this);
       this.I = new LiveLiteMultiInteractManagerImpl$b(this);
    }
    public void Qo(){
       if (PatchProxy.applyVoid(null, this, LiveLiteMultiInteractManagerImpl.class, "1")) {
          return;
       }
       super.Qo();
       c uoc = this.Po().a(b.class);
       a.o(uoc, "serviceManager.getServic¡­foDispatcher::class.java\)");
       this.B = uoc;
       m tk = this.k;
       a.o(tk, "liveInteractController");
       tk.d().m(this.F);
       this.J.addLivePlayerTypeChangeListener(this.I);
       uoc = this.Po().a(b.class);
       a.o(uoc, "serviceManager.getServic¡­ceEndManager::class.java\)");
       this.A = uoc;
       if (uoc == null) {
          a.S("endService");
       }
       uoc.Km(this.z);
       if (g.a.c()) {
          LiveLiteMultiInteractManagerImpl tB = this.B;
          if (tB == null) {
             a.S("liveSeiInfoDispatcher");
          }
          tB.nk(1, LiveStageProto$LayoutConfig.class, this.H);
       }else {
          this.J.addLiveSeiListener(this.G);
       }
       return;
    }
    public void Ro(){
       if (PatchProxy.applyVoid(null, this, LiveLiteMultiInteractManagerImpl.class, "2")) {
          return;
       }
       super.Ro();
       this.gc().h(this.D);
       LiveLiteMultiInteractManagerImpl tA = this.A;
       if (tA == null) {
          a.S("endService");
       }
       tA.le(this.z);
       this.J.removeLivePlayerTypeChangeListener(this.I);
       if (g.a.c()) {
          tA = this.B;
          if (tA == null) {
             a.S("liveSeiInfoDispatcher");
          }
          tA.ve(1, this.H);
       }else {
          this.J.removeLiveSeiListener(this.G);
       }
       return;
    }
    public a To(){
       Object obj = PatchProxy.apply(null, this, LiveLiteMultiInteractManagerImpl.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveLiteMultiInteractManagerImpl$a();
    }
    public void Uo(){
       if (PatchProxy.applyVoid(null, this, LiveLiteMultiInteractManagerImpl.class, "4")) {
          return;
       }
       this.gc().m(this.D);
       return;
    }
}
