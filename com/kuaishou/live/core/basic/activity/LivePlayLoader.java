package com.kuaishou.live.core.basic.activity.LivePlayLoader;
import com.kuaishou.live.core.basic.activity.LivePlayLoader$b;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import java.lang.Object;
import com.kuaishou.live.core.basic.activity.y;
import com.kuaishou.live.core.basic.activity.LivePlayLoader$d;
import java.util.LinkedList;
import com.kuaishou.live.core.basic.activity.LivePlayLoader$a;
import com.kuaishou.android.live.model.QLivePlayConfig;
import java.lang.Boolean;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;
import yj3.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import en8.c;
import java.lang.Double;
import java.lang.reflect.Type;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.basic.utils.e;
import com.kuaishou.live.presenterscatter.taskdispatcher.LiveMainThreadTaskDispatcher$VsyncStrategy;
import com.kuaishou.live.presenterscatter.taskdispatcher.LiveMainThreadTaskDispatcher$c;
import en8.a;
import com.kuaishou.live.core.basic.activity.a0;
import msd.l;
import com.kuaishou.live.core.basic.activity.i0;
import com.kuaishou.live.core.basic.activity.m0;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.core.basic.activity.q0;
import com.kuaishou.live.core.basic.activity.c;
import com.kuaishou.live.core.basic.activity.e0;
import n51.a;
import com.kuaishou.live.core.basic.activity.a;
import xj3.d;
import com.kuaishou.live.core.basic.activity.b0;
import com.stage.LiveLoadingStage;
import java.lang.Runnable;
import java.lang.StringBuilder;
import m02.z0;
import msd.a;

public class LivePlayLoader	// class@001818
{
    public final c a;
    public a b;
    public m0 c;
    public c d;
    public q0 e;
    public LivePlayLoader$d f;
    public LivePlayLoader$b g;
    public LiveBizParam h;
    public LivePlayerController i;
    public String j;
    public a k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public LinkedList r;
    public LivePlayerRenderListener s;

    public void LivePlayLoader(LivePlayLoader$b p0,LiveAudienceParam p1,LiveStreamFeedWrapper p2,LiveBizParam p3,boolean p4,boolean p5,boolean p6,boolean p7){
       b uob;
       double d;
       Object obj2;
       boolean b3;
       int i1;
       LivePlayLoader livePlayLoad = this;
       Object obj = p1;
       boolean b = p6;
       boolean b1 = p7;
       LivePlayLoader livePlayLoad1 = LivePlayLoader.class;
       super();
       y b2 = y.b;
       livePlayLoad.a = b2;
       livePlayLoad.f = new LivePlayLoader$d();
       livePlayLoad.r = new LinkedList();
       livePlayLoad.s = new LivePlayLoader$a(livePlayLoad);
       livePlayLoad.g = p0;
       livePlayLoad.h = p3;
       livePlayLoad.j = p2.getLivePlayConfig().mLiveStreamId;
       livePlayLoad.m = b1;
       livePlayLoad.n = b;
       b.f0(b2, "init LivePlayLoader", "isBasicPresenterScatter", Boolean.valueOf(p7), "isBizPresenterScatter", Boolean.valueOf(p6), "liveStreamId", livePlayLoad.j, "isCurrentOnScreen", Boolean.valueOf(p0.P()));
       if (b) {
          uob = b.class;
          long l = 0;
          if (!PatchProxy.isSupport(livePlayLoad1) || !PatchProxy.applyVoidTwoRefs(obj, Boolean.valueOf(p4), livePlayLoad, livePlayLoad1, "26")) {
             int i = livePlayLoad.g.P() ^ 1;
             if (obj.mIsPlayViewReused != null || i) {
                l = b.a();
             }else {
                Object obj3 = PatchProxy.apply(l, l, uob, "1");
                if (obj3 != PatchProxyResult.class) {
                   l = obj3.longValue();
                }else {
                   l = 50;
                   long l1 = a.t().u("SOURCE_LIVE").b("liveInitTaskDispatcherLoopDuration", l);
                   if (l1 >= 0) {
                      l = l1;
                   }
                }
             }
             Object obj1 = PatchProxy.apply(null, null, uob, "3");
             if (obj1 != PatchProxyResult.class) {
                d = obj1.doubleValue();
             }else {
                obj2 = a.t().u("SOURCE_LIVE").getValue("liveTaskDispatcherLogRate", Double.TYPE, Double.valueOf(0));
                a.o(obj2, "SwitchConfigManager.getI¡­ Double::class.java, 0.0\)");
                d = obj2.doubleValue();
             }
             livePlayLoad.b = new c(l, d);
             if (i) {
                obj2 = PatchProxy.apply(null, null, e.class, "33");
                if (obj2 != PatchProxyResult.class) {
                   b3 = obj2.booleanValue();
                }else if(a.t().u("SOURCE_LIVE").a("livePlayOnSlideScatterStrategy", 2) == 1){
                   i1 = 1;
                }else {
                   i1 = 0;
                }
                b3 = i1;
                if (b3) {
                   b.c0(b2, "LiveMainThreadTaskDispatcher use VsyncStrategy", "liveStreamId", livePlayLoad.j);
                   livePlayLoad.b.a(new LiveMainThreadTaskDispatcher$VsyncStrategy());
                }
             }
             livePlayLoad.b.d(new a0(livePlayLoad, p4, obj, i));
             livePlayLoad.b.resume();
          }
          if (!PatchProxy.applyVoid(null, livePlayLoad, livePlayLoad1, "27")) {
             livePlayLoad.k = new i0(livePlayLoad);
          }
       }
       livePlayLoad.c = new m0(p0.b(), livePlayLoad.j, b1);
       livePlayLoad.e = new q0(livePlayLoad.b, livePlayLoad.j);
       c uoc = new c(p0, p1, p2, p3, p5, p6);
       livePlayLoad.d = uob;
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, LivePlayLoader.class, "18")) {
          return;
       }
       b.c0(this.a, "flushToDidShowComponentLoadded", "liveStreamId", this.j);
       LivePlayLoader tb = this.b;
       if (tb != null) {
          tb.g(e0.b);
       }
       return;
    }
    public a b(){
       return this.k;
    }
    public a c(){
       Object obj = PatchProxy.apply(null, this, LivePlayLoader.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e.d;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, LivePlayLoader.class, "25")) {
          return;
       }
       if (this.b != null) {
          while (!this.r.isEmpty()) {
             this.b.f(this.r.remove());
          }
       }
       return;
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, LivePlayLoader.class, "24")) {
          return;
       }
       this.l = false;
       this.r.clear();
       LivePlayLoader tb = this.b;
       if (tb != null) {
          tb.b(b0.b);
       }
       return;
    }
    public final void f(LiveLoadingStage p0,boolean p1,Runnable p2){
       if (PatchProxy.isSupport(LivePlayLoader.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, LivePlayLoader.class, "22")) {
          return;
       }
       if (this.b != null && p1) {
          this.b.h(p0, new z0(new d(500, "load-stage:"+p0, null, p2)), null);
       }else {
          p2.run();
       }
       return;
    }
}
