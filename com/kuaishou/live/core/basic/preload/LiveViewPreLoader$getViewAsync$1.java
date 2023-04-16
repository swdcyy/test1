package com.kuaishou.live.core.basic.preload.LiveViewPreLoader$getViewAsync$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.kuaishou.live.core.basic.preload.LiveViewPreLoader;
import com.kuaishou.live.core.basic.preload.LiveViewPreLoader$b;
import r12.f$a;
import java.util.ArrayList;
import ftd.z1;
import r12.e$a;
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

public final class LiveViewPreLoader$getViewAsync$1 extends SuspendLambda implements p	// class@0008ca
{
    public final boolean $attachToRoot;
    public final z1 $job;
    public final e$a $l;
    public final boolean $merge;
    public final LiveViewPreLoader$b $task;
    public final f$a $taskId;
    public final ArrayList $tasksForCurrentContext;
    public int I$0;
    public Object L$0;
    public int label;
    public k0 p$;
    public final LiveViewPreLoader this$0;

    public void LiveViewPreLoader$getViewAsync$1(LiveViewPreLoader p0,LiveViewPreLoader$b p1,f$a p2,ArrayList p3,z1 p4,boolean p5,boolean p6,e$a p7,c p8){
       this.this$0 = p0;
       this.$task = p1;
       this.$taskId = p2;
       this.$tasksForCurrentContext = p3;
       this.$job = p4;
       this.$attachToRoot = p5;
       this.$merge = p6;
       this.$l = p7;
       super(2, p8);
    }
    public final c create(Object p0,c p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveViewPreLoader$getViewAsync$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       LiveViewPreLoader$getViewAsync$1 ogetViewAsyn = new LiveViewPreLoader$getViewAsync$1(this.this$0, this.$task, this.$taskId, this.$tasksForCurrentContext, this.$job, this.$attachToRoot, this.$merge, this.$l, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveViewPreLoader$getViewAsync$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       StringBuilder str1;
       int i;
       LiveViewPreLoader$getViewAsync$1 obj = PatchProxy.applyOneRefs(p0, this, LiveViewPreLoader$getViewAsync$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = b.h();
          LiveViewPreLoader$getViewAsync$1 tlabel = this.label;
          LiveViewPreLoader$getViewAsync$1 ogetViewAsyn = 1;
          String str = "getViewAsync: job canceled ";
          if (tlabel != null) {
             if (tlabel == ogetViewAsyn) {
                obj = this.I$0;
                j0.n(p0);
             label_0050 :
                tlabel = obj;
                try{
                label_0051 :
                   this.this$0.e("getViewAsync: job done "+this.$taskId.b());
                   this.$tasksForCurrentContext.remove(this.$task);
                   if (tlabel != null || this.$job.isCancelled()) {
                      p0 = this.this$0;
                      str1 = "";
                   }else {
                   label_007f :
                      this.this$0.h(this.$task, this.$attachToRoot, this.$merge, this.$l);
                   label_011f :
                      return l1.a;
                   }
                }catch( e0){
                }
             }else {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
             }
          }else {
             j0.n(p0);
             p0 = this.p$;
             tlabel = 0;
             z1 oz1 = this.$task.b();
             if (oz1 != null) {
                this.L$0 = p0;
                this.I$0 = tlabel;
                this.label = ogetViewAsyn;
                if (oz1.p(this) == obj) {
                   return obj;
                }else {
                   str1 = null;
                   goto label_0050 ;
                }
             }else {
                goto label_0051 ;
             }
          }
       }catch(java.util.concurrent.CancellationException e0){
          this.this$0.e("getViewAsync: CancellationException "+this.$taskId.b());
          this.$tasksForCurrentContext.remove(this.$task);
          p0 = this.this$0;
          str1 = "";
       }catch(java.lang.Exception e6){
          i = obj;
       }catch(java.lang.Exception e6){
          i = null;
       }
       this.this$0.e("getViewAsync: failed "+this.$taskId.b()+' '+e6);
       this.$tasksForCurrentContext.remove(this.$task);
       if (i || this.$job.isCancelled()) {
          p0 = this.this$0;
          str1 = "";
       }else {
          goto label_007f ;
       }
    }
}
