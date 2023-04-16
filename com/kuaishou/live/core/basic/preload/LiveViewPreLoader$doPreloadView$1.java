package com.kuaishou.live.core.basic.preload.LiveViewPreLoader$doPreloadView$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.kuaishou.live.core.basic.preload.LiveViewPreLoader;
import r12.f$a;
import com.kuaishou.live.core.basic.preload.LiveViewPreLoader$b;
import android.content.Context;
import android.view.ViewGroup;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ftd.k0;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import r12.f;
import android.view.View;

public final class LiveViewPreLoader$doPreloadView$1 extends SuspendLambda implements p	// class@0008c9
{
    public final ViewGroup $container;
    public final Context $context;
    public final LiveViewPreLoader$b $task;
    public final f$a $taskId;
    public Object L$0;
    public Object L$1;
    public int label;
    public k0 p$;
    public final LiveViewPreLoader this$0;

    public void LiveViewPreLoader$doPreloadView$1(LiveViewPreLoader p0,f$a p1,LiveViewPreLoader$b p2,Context p3,ViewGroup p4,c p5){
       this.this$0 = p0;
       this.$taskId = p1;
       this.$task = p2;
       this.$context = p3;
       this.$container = p4;
       super(2, p5);
    }
    public final c create(Object p0,c p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveViewPreLoader$doPreloadView$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       LiveViewPreLoader$doPreloadView$1 uodoPreloadV = new LiveViewPreLoader$doPreloadView$1(this.this$0, this.$taskId, this.$task, this.$context, this.$container, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveViewPreLoader$doPreloadView$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       LiveViewPreLoader$doPreloadView$1 obj = PatchProxy.applyOneRefs(p0, this, LiveViewPreLoader$doPreloadView$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.h();
       LiveViewPreLoader$doPreloadView$1 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel == 1) {
             obj = this.L$1;
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          this.this$0.e("preloadView: start load: "+this.$taskId.b());
          tlabel = this.$task;
          this.L$0 = this.p$;
          this.L$1 = tlabel;
          this.label = 1;
          p0 = this.this$0.d.a(this.$context, this.$taskId, this.$container, this);
          if (p0 == obj) {
             return obj;
          }else {
             obj = tlabel;
          }
       }
       obj.f(p0);
       this.this$0.e("preloadView: end load: "+this.$taskId.b()+' '+this.$task.d());
       return l1.a;
    }
}
