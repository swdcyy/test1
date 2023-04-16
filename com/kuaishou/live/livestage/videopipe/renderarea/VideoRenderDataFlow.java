package com.kuaishou.live.livestage.videopipe.renderarea.VideoRenderDataFlow;
import brd.t;
import se3.n;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.LinkedHashSet;
import java.util.Set;
import trd.d1;
import mrd.a;
import com.kuaishou.live.livestage.videopipe.renderarea.VideoRenderDataFlow$onNewRenderCreated$1;
import java.util.ArrayList;
import qrd.l1;
import com.kuaishou.live.livestage.utils.ReactiveExtensionKt;
import com.kuaishou.live.livestage.videopipe.renderarea.VideoRenderDataFlow$b;
import brd.w;
import erd.c;
import re3.o;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import oe3.e;
import java.lang.StringBuilder;
import java.lang.Throwable;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import pe3.a;
import com.kuaishou.live.livestage.RenderType;
import pe3.c;
import je3.a;
import android.content.Context;
import android.view.ViewGroup;
import fe3.f;
import je3.j;
import je3.n;
import ue3.a;
import je3.f;
import ue3.c;
import je3.h;
import com.kuaishou.live.livestage.videopipe.renderarea.VideoRenderDataFlow$a;
import erd.g;
import crd.b;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import fe3.c;
import fe3.c$c;
import com.kuaishou.live.livestage.basic.LayoutConfig;
import java.util.Iterator;
import fe3.a;
import fe3.e;
import fe3.g;
import fe3.d;
import com.kuaishou.live.livestage.VideoScaleMode;
import nsd.u;
import msd.l;
import re3.o$a;

public final class VideoRenderDataFlow	// class@000c0b
{
    public final Set a;
    public final a b;
    public c c;
    public a d;
    public a e;
    public LayoutConfig f;
    public l g;
    public final ArrayList h;
    public o i;
    public final a j;
    public final a k;
    public b l;
    public final t m;
    public b n;
    public final t o;
    public final t p;
    public final t q;
    public final n r;

    public void VideoRenderDataFlow(t p0,t p1,n p2){
       a.p(p0, "renderLayoutConfig");
       a.p(p1, "layoutConfigFromStream");
       super();
       this.q = p0;
       this.r = p2;
       this.a = new LinkedHashSet();
       a uoa = a.h(d1.k());
       a.o(uoa, "BehaviorSubject.createDe¡­ult\(emptySet<WindowId>\(\)\)");
       this.b = uoa;
       this.g = VideoRenderDataFlow$onNewRenderCreated$1.INSTANCE;
       this.h = new ArrayList();
       a uoa1 = a.h(l1.a);
       a.o(uoa1, "BehaviorSubject.createDefault\(Unit\)");
       this.j = uoa1;
       uoa1 = a.g();
       a.o(uoa1, "BehaviorSubject.create<List<VideoSmallRender>>\(\)");
       this.k = uoa1;
       p0 = t.combineLatest(ReactiveExtensionKt.e(p1), p0, VideoRenderDataFlow$b.a);
       a.o(p0, "Observable.combineLatest¡­toSet\(\)\)\n\n    windows\n  }");
       this.m = p0;
       this.o = uoa.distinctUntilChanged();
       this.p = uoa1.distinctUntilChanged();
    }
    public static void g(VideoRenderDataFlow p0,o p1,boolean p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = true;
       }
       p0.f(p1, p2);
       return;
    }
    public synchronized final void a(Set p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VideoRenderDataFlow.class, "19")) {
          return;
       }
       if (a.g(p0, this.a) ^ 0x01) {
          this.a.clear();
          this.a.addAll(p0);
          e.d(e.d, "LiveStage", "[Render] "+"bulkUpdateRenderStatus\("+p1+"\), windowHasFrame:"+p0, null, 4, null);
          this.b.onNext(CollectionsKt___CollectionsKt.L5(this.a));
       }
       return;
    }
    public final void b(o p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VideoRenderDataFlow.class, "8")) {
          return;
       }
       this.d = null;
       if (!PatchProxy.applyVoidOneRefs(p1, p0, o.class, "9")) {
          a.p(p1, "frame");
          RenderType rTC_VIEW = RenderType.RTC_VIEW;
          p0.j(p1);
          if (p0.c() == null) {
             e.d(e.d, "LiveStage", "[Render] "+"Render create "+rTC_VIEW+": "+p0, null, 4, null);
             o g = p0.g;
             if (g == null) {
                a.S("renderViewFactory");
             }
             o f = p0.f;
             if (f == null) {
                a.S("container");
             }
             Context context = f.getContext();
             a.o(context, "container.context");
             boolean b = (p0.f().a())? true: false;
             p0.g(g.c(context, b), rTC_VIEW);
          }
          p0.h(p1);
       }
       this.h(p0.f());
       return;
    }
    public final void c(o p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VideoRenderDataFlow.class, "9")) {
          return;
       }
       this.e = null;
       if (!PatchProxy.applyVoidOneRefs(p1, p0, o.class, "10")) {
          a.p(p1, "frame");
          RenderType cAMERA_VIEW = RenderType.CAMERA_VIEW;
          p0.j(p1);
          if (p0.c() == null) {
             e.d(e.d, "LiveStage", "[Render] "+"Render create "+cAMERA_VIEW+": "+p0, null, 4, null);
             o g = p0.g;
             if (g == null) {
                a.S("renderViewFactory");
             }
             o f = p0.f;
             if (f == null) {
                a.S("container");
             }
             Context context = f.getContext();
             a.o(context, "container.context");
             boolean b = (p0.f().a())? true: false;
             p0.g(g.a(context, b), cAMERA_VIEW);
          }
          p0.h(p1);
       }
       this.h(p0.f());
       return;
    }
    public final void d(o p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VideoRenderDataFlow.class, "7")) {
          return;
       }
       this.c = null;
       if (!PatchProxy.applyVoidOneRefs(p1, p0, o.class, "8")) {
          a.p(p1, "frame");
          RenderType pLAYER_VIEW = RenderType.PLAYER_VIEW;
          p0.j(p1);
          if (p0.c() == null) {
             e.d(e.d, "LiveStage", "[Render] "+"Render create "+pLAYER_VIEW+": "+p0, null, 4, null);
             o g = p0.g;
             if (g == null) {
                a.S("renderViewFactory");
             }
             o f = p0.f;
             if (f == null) {
                a.S("container");
             }
             Context context = f.getContext();
             a.o(context, "container.context");
             p0.g(g.e(context), pLAYER_VIEW);
          }
          p0.h(p1);
       }
       if (this.n == null) {
          this.n = ReactiveExtensionKt.f(this.m, new VideoRenderDataFlow$a(this));
       }
       return;
    }
    public final ArrayList e(){
       return this.h;
    }
    public final void f(o p0,boolean p1){
       VideoRenderDataFlow videoRenderD = VideoRenderDataFlow.class;
       if (PatchProxy.isSupport(videoRenderD) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, videoRenderD, "13")) {
          return;
       }
       if (p0 != null) {
          e.d(e.d, "LiveStage", "[Render] "+"Invalidate Render: "+p0+", release="+p1, null, 4, null);
          if (p1 && !PatchProxy.applyVoid(null, p0, o.class, "17")) {
             p0.i();
          }
       }
       return;
    }
    public final void h(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoRenderDataFlow.class, "17")) {
          return;
       }
       if (this.a.add(p0)) {
          e.d(e.d, "LiveStage", "[Render] "+"start render window "+p0+", windowHasFrame:"+this.a, null, 4, null);
          this.b.onNext(CollectionsKt___CollectionsKt.L5(this.a));
       }
       return;
    }
    public final o i(c p0){
       o oo;
       Iterator obj = PatchProxy.applyOneRefs(p0, this, VideoRenderDataFlow.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a.g(p0.getStreamId(), c$c.b)) {
          if (this.i == null) {
             this.j(this.f, this.r);
             if (this.i != null) {
                this.j.onNext(l1.a);
             }
          }
          return this.i;
       }else {
          obj = this.h.iterator();
          do {
             if (obj.hasNext()) {
             }else {
                oo = null;
                break ;
             }
             oo = obj.next();
          } while (a.g(oo.e(), p0.getStreamId()));
          return oo;
       }
    }
    public final void j(LayoutConfig p0,n p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VideoRenderDataFlow.class, "15")) {
          return;
       }
       if (this.i != null) {
          return;
       }
       if (p0 == null) {
          e.d(e.d, "LiveStage", "[Render] no latest layout defer add player render", null, 4, null);
          return;
       }else {
          e d = e.d;
          e.d(d, "LiveStage", "[Render] add player render", null, 4, null);
          a uoa = p0.d();
          e uoe = new e(new f(-1), c$c.b, new g(0, 0, uoa.d(), uoa.c()), null, null, 16, null);
          o oo = new o(v9, uoa);
          this.g.invoke(oo);
          if (p1 != null) {
             n on = PatchProxy.apply(null, p1, n.class, "1");
             if (on != PatchProxyResult.class) {
             }else {
                on = p1.b;
                if (on != null) {
                   e.d(d, "LiveStage", "[Render] "+"consumed State: "+p1.b, null, 4, null);
                   p1.b = null;
                }
             }
             if (on != null) {
                oo.k(on);
             }
          }
          this.i = oo;
          return;
       }
    }
}
