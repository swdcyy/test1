package com.kwai.component.taskdispatcher.slide.strategy.SlideTaskDispatcher;
import eh5.g;
import com.kwai.component.taskdispatcher.slide.strategy.SlideTaskDispatcher$a;
import nsd.u;
import lh5.a;
import ih5.z;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.component.taskdispatcher.slide.strategy.SlideTaskDispatcher$mAsyncScatter$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.component.taskdispatcher.slide.strategy.SlideTaskDispatcher$mStageScatter$2;
import com.kwai.component.taskdispatcher.slide.strategy.SlideTaskDispatcher$mMainScatter$2;
import mh5.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Long;
import java.util.Objects;
import eh5.u;
import eh5.r;
import com.kwai.component.taskdispatcher.slide.strategy.SlideStageScatter;
import eh5.a;
import xf6.d;
import eh5.q;
import java.lang.Number;
import com.kwai.component.taskdispatcher.utils.DispatchLogger;
import java.lang.StringBuilder;
import eh5.v;
import eh5.n;
import eh5.i;
import eh5.j;
import eh5.w;
import eh5.b;
import eh5.m;
import java.lang.Boolean;
import java.util.Arrays;
import eh5.g$a;
import eh5.r$a;
import xf6.l;

public final class SlideTaskDispatcher implements g	// class@000ba8
{
    public final p b;
    public final p c;
    public final p d;
    public final a e;
    public z f;
    public static final SlideTaskDispatcher$a g;

    static {
       SlideTaskDispatcher.g = new SlideTaskDispatcher$a(null);
    }
    public void SlideTaskDispatcher(a p0,z p1){
       a.p(p0, "mSlideConfig");
       super();
       this.e = p0;
       this.f = p1;
       this.b = s.c(SlideTaskDispatcher$mAsyncScatter$2.INSTANCE);
       this.c = s.c(SlideTaskDispatcher$mStageScatter$2.INSTANCE);
       this.d = s.c(new SlideTaskDispatcher$mMainScatter$2(this));
    }
    public final a b(){
       Object obj = PatchProxy.apply(null, this, SlideTaskDispatcher.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
    public void c(long p0){
       SlideTaskDispatcher slideTaskDis = SlideTaskDispatcher.class;
       if (PatchProxy.isSupport(slideTaskDis) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, slideTaskDis, "7")) {
          return;
       }
       Objects.requireNonNull(this.b());
       this.k().c(p0);
       this.m().c(p0);
       return;
    }
    public void d(long p0,a p1){
       SlideTaskDispatcher slideTaskDis = SlideTaskDispatcher.class;
       if (PatchProxy.isSupport(slideTaskDis) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, slideTaskDis, "6")) {
          return;
       }
       if (!d.a()) {
          Objects.requireNonNull(this.b());
          this.k().d(p0, p1);
          this.m().d(p0, p1);
       }
       return;
    }
    public long e(q p0){
       long l;
       v obj = PatchProxy.applyOneRefs(p0, this, SlideTaskDispatcher.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       a.p(p0, "task");
       DispatchLogger.d.E("SlideTaskDispatcher", "putTask: Title:"+p0.f()+" Type:"+p0.g()+" Id:"+p0.d()+" BatchId:"+p0.b()+" Discardable:"+p0.c());
       obj = p0.g();
       if (obj instanceof n) {
          l = this.m().f(p0);
       }else if(a.g(obj, i.a) || obj instanceof j){
          l = this.k().f(p0);
       }else if(a.g(obj, w.a)){
          l = this.k().f(p0);
       }else if(a.g(obj, b.a)){
          l = this.b().f(p0);
       }else if(a.g(obj, m.a)){
          this.m().f(p0);
          this.k().f(p0);
          l = this.b().f(p0);
       }else {
          DispatchLogger.D("SlideTaskDispatcher", "无效的Task类型, "+p0.g());
          l = -1;
       }
       return l;
    }
    public void i(boolean p0,long[] p1){
       SlideTaskDispatcher slideTaskDis = SlideTaskDispatcher.class;
       if (PatchProxy.isSupport(slideTaskDis) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, slideTaskDis, "8")) {
          return;
       }
       a.p(p1, "taskIds");
       this.b().i(p0, Arrays.copyOf(p1, p1.length));
       this.k().i(p0, Arrays.copyOf(p1, p1.length));
       this.m().i(p0, Arrays.copyOf(p1, p1.length));
       return;
    }
    public void j(long p0){
       SlideTaskDispatcher slideTaskDis = SlideTaskDispatcher.class;
       if (PatchProxy.isSupport(slideTaskDis) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, slideTaskDis, "10")) {
          return;
       }
       g$a uoa = g$a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(this, Long.valueOf(p0), null, uoa, "1")) {
          r$a.a(this, p0);
       }
       return;
    }
    public final u k(){
       Object obj = PatchProxy.apply(null, this, SlideTaskDispatcher.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.getValue();
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, SlideTaskDispatcher.class, "5")) {
          return;
       }
       if (!l.c("KEY_DISABLE_CANCEL_TASK_WHEN_QUIT", false)) {
          this.m().h(true);
          Objects.requireNonNull(this.b());
          this.k().h(true);
       }
       return;
    }
    public final SlideStageScatter m(){
       Object obj = PatchProxy.apply(null, this, SlideTaskDispatcher.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.getValue();
    }
}
