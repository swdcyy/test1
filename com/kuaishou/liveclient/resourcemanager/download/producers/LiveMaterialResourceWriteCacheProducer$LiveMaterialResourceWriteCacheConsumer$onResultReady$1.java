package com.kuaishou.liveclient.resourcemanager.download.producers.LiveMaterialResourceWriteCacheProducer$LiveMaterialResourceWriteCacheConsumer$onResultReady$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.kuaishou.liveclient.resourcemanager.download.producers.LiveMaterialResourceWriteCacheProducer$LiveMaterialResourceWriteCacheConsumer;
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
import com.kuaishou.liveclient.resourcemanager.LiveMaterialResourceLocalFileManager;
import com.kuaishou.liveclient.resourcemanager.LiveMaterialResourceLocalFileManager$a;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import cr3.a;
import java.lang.IllegalStateException;

public final class LiveMaterialResourceWriteCacheProducer$LiveMaterialResourceWriteCacheConsumer$onResultReady$1 extends SuspendLambda implements p	// class@001085
{
    public final LiveMaterialResourceDownloadTask $task;
    public int label;
    public final LiveMaterialResourceWriteCacheProducer$LiveMaterialResourceWriteCacheConsumer this$0;

    public void LiveMaterialResourceWriteCacheProducer$LiveMaterialResourceWriteCacheConsumer$onResultReady$1(LiveMaterialResourceWriteCacheProducer$LiveMaterialResourceWriteCacheConsumer p0,LiveMaterialResourceDownloadTask p1,c p2){
       this.this$0 = p0;
       this.$task = p1;
       super(2, p2);
    }
    public final c create(Object p0,c p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, LiveMaterialResourceWriteCacheProducer$LiveMaterialResourceWriteCacheConsumer$onResultReady$1.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       a.p(p1, "completion");
       return new LiveMaterialResourceWriteCacheProducer$LiveMaterialResourceWriteCacheConsumer$onResultReady$1(this.this$0, this.$task, p1);
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveMaterialResourceWriteCacheProducer$LiveMaterialResourceWriteCacheConsumer$onResultReady$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       LiveMaterialResourceLocalFileManager b;
       String obj = PatchProxy.applyOneRefs(p0, this, LiveMaterialResourceWriteCacheProducer$LiveMaterialResourceWriteCacheConsumer$onResultReady$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b.h();
       if (this.label != null) {
          throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
       }
       j0.n(p0);
       p0 = LiveMaterialResourceLocalFileManager.d.a();
       obj = this.$task.f();
       String str = this.$task.e();
       Objects.requireNonNull(p0);
       if (!PatchProxy.applyVoidTwoRefs(obj, str, p0, LiveMaterialResourceLocalFileManager.class, "8") && (obj != null && str != null)) {
          b = p0.b;
          if (b != null) {
             obj = b.put(obj, str);
          }
          p0.d();
       }
    label_0048 :
       p0 = this.this$0.a();
       if (p0 != null) {
          p0.c(this.$task);
       }
       return l1.a;
    }
}
