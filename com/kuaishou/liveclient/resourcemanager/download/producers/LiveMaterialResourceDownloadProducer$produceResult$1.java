package com.kuaishou.liveclient.resourcemanager.download.producers.LiveMaterialResourceDownloadProducer$produceResult$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.kuaishou.liveclient.resourcemanager.download.producers.LiveMaterialResourceDownloadProducer;
import com.kuaishou.liveclient.resourcemanager.download.task.LiveMaterialResourceDownloadTask;
import cr3.a;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.Boolean;

public final class LiveMaterialResourceDownloadProducer$produceResult$1 extends SuspendLambda implements p	// class@001079
{
    public final a $consumer;
    public final LiveMaterialResourceDownloadTask $task;
    public int label;
    public final LiveMaterialResourceDownloadProducer this$0;

    public void LiveMaterialResourceDownloadProducer$produceResult$1(LiveMaterialResourceDownloadProducer p0,LiveMaterialResourceDownloadTask p1,a p2,c p3){
       this.this$0 = p0;
       this.$task = p1;
       this.$consumer = p2;
       super(2, p3);
    }
    public final c create(Object p0,c p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, LiveMaterialResourceDownloadProducer$produceResult$1.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       a.p(p1, "completion");
       return new LiveMaterialResourceDownloadProducer$produceResult$1(this.this$0, this.$task, this.$consumer, p1);
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveMaterialResourceDownloadProducer$produceResult$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveMaterialResourceDownloadProducer$produceResult$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.h();
       LiveMaterialResourceDownloadProducer$produceResult$1 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel == 1) {
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          this.label = 1;
          p0 = this.this$0.d(this.$task, this);
          if (p0 == obj) {
             return obj;
          }
       }
       if (p0.booleanValue()) {
          p0 = this.$consumer;
          if (p0 != null) {
             p0.c(this.$task);
          }
       }else {
          p0 = this.$consumer;
          if (p0 != null) {
             p0.b(this.$task);
          }
       }
       return l1.a;
    }
}
