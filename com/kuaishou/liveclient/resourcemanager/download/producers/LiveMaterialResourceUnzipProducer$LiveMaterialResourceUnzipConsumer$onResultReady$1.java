package com.kuaishou.liveclient.resourcemanager.download.producers.LiveMaterialResourceUnzipProducer$LiveMaterialResourceUnzipConsumer$onResultReady$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.kuaishou.liveclient.resourcemanager.download.producers.LiveMaterialResourceUnzipProducer$LiveMaterialResourceUnzipConsumer;
import com.kuaishou.liveclient.resourcemanager.download.task.LiveMaterialResourceDownloadTask;
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
import java.io.File;
import java.lang.CharSequence;
import er3.b;
import cr3.a;
import java.lang.Exception;
import java.lang.Throwable;
import java.lang.IllegalStateException;

public final class LiveMaterialResourceUnzipProducer$LiveMaterialResourceUnzipConsumer$onResultReady$1 extends SuspendLambda implements p	// class@001080
{
    public final LiveMaterialResourceDownloadTask $task;
    public int label;
    public final LiveMaterialResourceUnzipProducer$LiveMaterialResourceUnzipConsumer this$0;

    public void LiveMaterialResourceUnzipProducer$LiveMaterialResourceUnzipConsumer$onResultReady$1(LiveMaterialResourceUnzipProducer$LiveMaterialResourceUnzipConsumer p0,LiveMaterialResourceDownloadTask p1,c p2){
       this.this$0 = p0;
       this.$task = p1;
       super(2, p2);
    }
    public final c create(Object p0,c p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, LiveMaterialResourceUnzipProducer$LiveMaterialResourceUnzipConsumer$onResultReady$1.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       a.p(p1, "completion");
       return new LiveMaterialResourceUnzipProducer$LiveMaterialResourceUnzipConsumer$onResultReady$1(this.this$0, this.$task, p1);
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveMaterialResourceUnzipProducer$LiveMaterialResourceUnzipConsumer$onResultReady$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       String str = "111004";
       String obj = PatchProxy.applyOneRefs(p0, this, LiveMaterialResourceUnzipProducer$LiveMaterialResourceUnzipConsumer$onResultReady$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b.h();
       if (this.label != null) {
          throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
       }
       j0.n(p0);
       p0 = this.$task.b();
       obj = this.$task.g();
       if (p0 != null) {
          int i = 1;
          if (p0.exists() == i) {
             if (obj != null && obj.length()) {
                i = 0;
             }
             if (!i) {
                try{
                   b.h(p0, this.$task.g());
                   a uoa = this.this$0.a();
                   if (uoa != null) {
                      uoa.c(this.$task);
                   }
                }catch(java.io.IOException e0){
                   this.$task.k(e0, new Exception(e0));
                   a uoa1 = this.this$0.a();
                   if (uoa1 != null) {
                      uoa1.b(this.$task);
                   }
                }
                p0.delete();
             label_008b :
                return l1.a;
             }
          }
       }
       this.$task.k("111006", new Exception("111006"));
       p0 = this.this$0.a();
       if (p0 != null) {
          p0.b(this.$task);
          goto label_008b ;
       }else {
          goto label_008b ;
       }
    }
}
