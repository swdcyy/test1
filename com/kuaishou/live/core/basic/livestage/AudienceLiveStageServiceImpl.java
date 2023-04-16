package com.kuaishou.live.core.basic.livestage.AudienceLiveStageServiceImpl;
import mz1.b;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.framework.activitycontext.ActivityContext;
import ee3.g$b$b;
import ee3.g$b$a;
import mrd.a;
import xo1.i;
import mz1.a;
import com.kuaishou.live.livestage.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lp3.e;
import com.kuaishou.live.common.core.component.livestage.a;
import com.kuaishou.live.core.basic.livestage.AudienceLiveStageServiceImpl$create$liveStageCamera$1;
import msd.l;
import com.kuaishou.live.common.core.component.livestage.a$a;
import ee1.a;
import lp3.c;
import n91.f;
import ga1.e;
import com.kuaishou.live.core.basic.livestage.AudienceLiveStageServiceImpl$create$1;
import xo1.a;
import msd.a;
import xo1.f;
import com.kwai.video.waynelive.LivePlayerController;
import com.kuaishou.live.common.core.component.livestage.LiveStageRenderViewFactory;
import com.kuaishou.live.common.core.component.livestage.LiveStageRenderViewFactory$a;
import com.kuaishou.live.core.basic.livestage.AudienceLiveStageServiceImpl$a;
import com.kuaishou.live.core.basic.livestage.AudienceLiveStageServiceImpl$b;
import ee3.g;
import brd.t;
import oe3.f;
import nsd.u;
import je3.i;
import je3.k;
import je3.g;
import je3.c;
import je3.n;
import ee3.f;
import ee3.z;
import com.kuaishou.live.livestage.g$a;
import lnc.u1;
import q00.b;
import m56.f;
import m56.g;

public final class AudienceLiveStageServiceImpl implements b	// class@000844
{
    public b b;
    public g c;
    public final a d;
    public final Context e;

    public void AudienceLiveStageServiceImpl(Context p0){
       g$b$b a;
       a.p(p0, "context");
       super();
       this.e = p0;
       ActivityContext uActivityCon = ActivityContext.g();
       a.o(uActivityCon, "ActivityContext.getInstance\(\)");
       a = (uActivityCon.h())? g$b$b.a: g$b$a.a;
       a uoa = a.h(a);
       a.o(uoa, "BehaviorSubject.createDe¡­eStatus.AppBackground\n  \)");
       this.d = uoa;
       return;
    }
    public i B5(){
       return a.a(this);
    }
    public g Z3(){
       AudienceLiveStageServiceImpl obj = PatchProxy.apply(null, this, AudienceLiveStageServiceImpl.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       if (obj == null) {
          a.S("liveStageManager");
       }
       return obj;
    }
    public void create(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AudienceLiveStageServiceImpl.class, "2")) {
          return;
       }
       a.p(p0, "serviceManager");
       c uoc = p0.a(a.class);
       a.o(uoc, "serviceManager.getServic¡­veRTCManager::class.java\)");
       c uoc1 = p0.a(f.class);
       a.o(uoc1, "serviceManager.getServic¡­TimeProvider::class.java\)");
       c uoc2 = p0.a(e.class);
       a.o(uoc2, "serviceManager.getServic¡­layerService::class.java\)");
       i oi = new i(uoc, null, AudienceLiveStageServiceImpl$create$1.INSTANCE);
       LivePlayerController livePlayerCo = uoc2.Vc();
       a.o(livePlayerCo, "livePlayerService.livePlayerController");
       f uof = new f(livePlayerCo);
       AudienceLiveStageServiceImpl$a uoa = new AudienceLiveStageServiceImpl$a(uoc1);
       this.c = g.a.c(null, oi, uof, a.d.b(new AudienceLiveStageServiceImpl$create$liveStageCamera$1(this)), LiveStageRenderViewFactory.e.c(), uoa, AudienceLiveStageServiceImpl$b.a, new g(this.d), new f(true, false, 2, null));
       u1.a(this);
       return;
    }
    public void destroy(){
       if (PatchProxy.applyVoid(null, this, AudienceLiveStageServiceImpl.class, "3")) {
          return;
       }
       AudienceLiveStageServiceImpl tc = this.c;
       if (tc == null) {
          a.S("liveStageManager");
       }
       tc.release();
       tc = this.b;
       if (tc != null) {
          tc.release();
       }
       u1.b(this);
       return;
    }
    public final void onAppBackground(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AudienceLiveStageServiceImpl.class, "4")) {
          return;
       }
       this.d.onNext(g$b$a.a);
       return;
    }
    public final void onAppForeground(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AudienceLiveStageServiceImpl.class, "5")) {
          return;
       }
       this.d.onNext(g$b$b.a);
       return;
    }
}
