package com.kuaishou.live.lite.longconnection.v2.LiveLiteLongConnectionManager;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager;
import com.kuaishou.live.lite.longconnection.v2.LiveLiteLongConnectionManager$a;
import nsd.u;
import com.kuaishou.live.lite.LiveLiteParam;
import androidx.lifecycle.Lifecycle;
import com.kwai.video.waynelive.LivePlayerController;
import xp5.i;
import ds5.a;
import com.kuaishou.live.lite.framework.basicservice.LiveLiteScatterLoadManager;
import brd.t;
import mrd.c;
import mrd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import ac3.a;
import ac3.i;
import com.kuaishou.live.lite.longconnection.v2.LiveLiteLongConnectionManager$lifecycleObserver$1;
import com.kuaishou.live.lite.longconnection.v2.LiveLiteLongConnectionManager$livePlayConfigListener$1;
import crd.a;
import ac3.g;
import erd.g;
import crd.b;
import krd.a;
import ac3.h;
import androidx.lifecycle.LifecycleObserver;
import ds5.c;
import com.kwai.statechart.StateChart$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.lite.longconnection.v2.LiveLiteLongConnectionManager$EnterDetail;
import com.kuaishou.live.lite.longconnection.v2.LiveLiteLongConnectionManager$b;
import com.kwai.statechart.a;
import ut7.o;
import ac3.j;
import ac3.f;

public final class LiveLiteLongConnectionManager extends LiveBaseLongConnectionManager	// class@000a29
{
    public final LiveLiteScatterLoadManager A;
    public final boolean B;
    public final c C;
    public boolean u;
    public final LifecycleEventObserver v;
    public final LiveLiteLongConnectionManager$livePlayConfigListener$1 w;
    public final LiveLiteParam x;
    public final Lifecycle y;
    public final a z;
    public static final LiveLiteLongConnectionManager$a D;

    static {
       LiveLiteLongConnectionManager.D = new LiveLiteLongConnectionManager$a(null);
    }
    public void LiveLiteLongConnectionManager(LiveLiteParam p0,Lifecycle p1,LivePlayerController p2,i p3,a p4,LiveLiteScatterLoadManager p5,t p6,boolean p7,t p8,c p9,int p10,u p11){
       a uoa;
       int i = this;
       Object obj = p0;
       Object obj1 = p1;
       Object obj2 = p4;
       Object obj3 = p5;
       Object obj4 = p6;
       Object obj5 = p8;
       if (p10 & 0x0200) {
          uoa = a.g();
          a.o(uoa, "BehaviorSubject.create\(\)");
       }else {
          uoa = null;
       }
       a uoa1 = uoa;
       a.p(obj, "liteParam");
       a.p(obj1, "lifecycle");
       Object obj6 = p2;
       a.p(obj6, "livePlayerController");
       Object obj7 = p3;
       a.p(obj7, "logPackageProvider");
       a.p(obj2, "liveBasePlayConfigManager");
       a.p(obj3, "scatterLoadManager");
       a.p(obj4, "enterDetailSignal");
       a.p(obj5, "scatterLoadStatusObservable");
       a.p(uoa1, "configUpdateSignal");
       LiveStreamFeed liveStreamFe = p0.getLiveStreamFeed();
       a.o(liveStreamFe, "liteParam.liveStreamFeed");
       LiveStreamFeed liveStreamFe1 = p0.getLiveStreamFeed();
       a.o(liveStreamFe1, "liteParam.liveStreamFeed");
       a uoa2 = new a(liveStreamFe1, p0.getStartPlaySourceType());
       super(liveStreamFe, uoa2, p1, obj6, obj7, uoa1);
       i.x = obj;
       i.y = obj1;
       i.z = obj2;
       i.A = obj3;
       i.B = p7;
       i.C = uoa1;
       LiveLiteLongConnectionManager$lifecycleObserver$1 olifecycleOb = new LiveLiteLongConnectionManager$lifecycleObserver$1(this);
       i.v = olifecycleOb;
       LiveLiteLongConnectionManager$livePlayConfigListener$1 olivePlayCon = new LiveLiteLongConnectionManager$livePlayConfigListener$1(this);
       i.w = olivePlayCon;
       b uob = obj4.subscribe(new g(this));
       a.o(uob, "enterDetailSignal.subscr¡­ isEnterDetail = it\n    }");
       a.b(this.P(), uob);
       uob = obj5.subscribe(new h(this));
       a.o(uob, "scatterLoadStatusObserva¡­CacheMessage\(false\)\n    }");
       a.b(this.P(), uob);
       obj1.addObserver(olifecycleOb);
       obj2.gd(olivePlayCon);
       return;
    }
    public StateChart$b r(){
       StateChart$b obj = PatchProxy.apply(null, this, LiveLiteLongConnectionManager.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.r();
       obj.h("enter_detail", this.n, this.m, LiveLiteLongConnectionManager$EnterDetail.class, LiveLiteLongConnectionManager$b.a);
       return obj;
    }
    public j y1(){
       Object obj = PatchProxy.apply(null, this, LiveLiteLongConnectionManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new f(this.B);
    }
}
