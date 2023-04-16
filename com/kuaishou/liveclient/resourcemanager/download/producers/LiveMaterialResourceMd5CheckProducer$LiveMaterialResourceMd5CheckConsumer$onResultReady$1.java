package com.kuaishou.liveclient.resourcemanager.download.producers.LiveMaterialResourceMd5CheckProducer$LiveMaterialResourceMd5CheckConsumer$onResultReady$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.kuaishou.liveclient.resourcemanager.download.producers.LiveMaterialResourceMd5CheckProducer$LiveMaterialResourceMd5CheckConsumer;
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
import ekd.a0;
import java.lang.CharSequence;
import cr3.a;
import java.lang.Exception;
import java.lang.Throwable;
import java.lang.IllegalStateException;

public final class LiveMaterialResourceMd5CheckProducer$LiveMaterialResourceMd5CheckConsumer$onResultReady$1 extends SuspendLambda implements p	// class@00107c
{
    public final LiveMaterialResourceDownloadTask $task;
    public int label;
    public final LiveMaterialResourceMd5CheckProducer$LiveMaterialResourceMd5CheckConsumer this$0;

    public void LiveMaterialResourceMd5CheckProducer$LiveMaterialResourceMd5CheckConsumer$onResultReady$1(LiveMaterialResourceMd5CheckProducer$LiveMaterialResourceMd5CheckConsumer p0,LiveMaterialResourceDownloadTask p1,c p2){
       this.this$0 = p0;
       this.$task = p1;
       super(2, p2);
    }
    public final c create(Object p0,c p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, LiveMaterialResourceMd5CheckProducer$LiveMaterialResourceMd5CheckConsumer$onResultReady$1.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       a.p(p1, "completion");
       return new LiveMaterialResourceMd5CheckProducer$LiveMaterialResourceMd5CheckConsumer$onResultReady$1(this.this$0, this.$task, p1);
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveMaterialResourceMd5CheckProducer$LiveMaterialResourceMd5CheckConsumer$onResultReady$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       String obj = PatchProxy.applyOneRefs(p0, this, LiveMaterialResourceMd5CheckProducer$LiveMaterialResourceMd5CheckConsumer$onResultReady$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b.h();
       if (this.label != null) {
          throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
       }
       j0.n(p0);
       p0 = this.$task.b();
       if (p0 == null || !p0.exists()) {
          this.$task.k("111006", new Exception("111006"));
          p0 = this.this$0.a();
          if (p0 != null) {
             p0.b(this.$task);
          }
       }else {
          obj = this.$task.e();
          String str = a0.b(p0);
          int i = 0;
          int i1 = (obj == null || !obj.length())? 1: 0;
          if (!i1) {
             if (str == null || !str.length()) {
                i = 1;
             }
             if (!i && a.g(obj, str)) {
                p0 = this.this$0.a();
                if (p0 != null) {
                   p0.c(this.$task);
                }
             }
          }
       label_005f :
          p0.delete();
          this.$task.k("111003", new Exception("111003"));
          p0 = this.this$0.a();
          if (p0 != null) {
             p0.b(this.$task);
          }
       }
    label_0095 :
       return l1.a;
    }
}
