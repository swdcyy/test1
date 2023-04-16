package com.kuaishou.liveclient.resourcemanager.download.LiveMaterialResourceDownloadManager$downloadMaterialResource$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.kuaishou.liveclient.resourcemanager.download.LiveMaterialResourceDownloadManager;
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
import java.util.Objects;
import java.lang.Boolean;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.concurrent.CopyOnWriteArrayList;
import ftd.r1;
import kotlinx.coroutines.CoroutineDispatcher;
import ftd.z0;
import com.kuaishou.liveclient.resourcemanager.download.task.LiveMaterialResourceDownloadTask$addListeners$1;
import ftd.k0;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import ftd.z1;
import kotlinx.coroutines.a;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import com.yxcorp.download.DownloadManager;
import java.lang.Integer;
import com.kuaishou.liveclient.resourcemanager.LiveMaterialResourceLocalFileManager;
import com.kuaishou.liveclient.resourcemanager.LiveMaterialResourceLocalFileManager$a;
import java.io.File;
import com.kuaishou.liveclient.resourcemanager.download.task.LiveMaterialResourceDownloadTask$TaskState;
import java.util.Map;
import cr3.c;
import com.kuaishou.liveclient.resourcemanager.download.producers.LiveMaterialResourceDownloadProducer;
import com.kuaishou.liveclient.resourcemanager.download.producers.LiveMaterialResourceMd5CheckProducer;
import com.kuaishou.liveclient.resourcemanager.download.producers.LiveMaterialResourceUnzipProducer;
import com.kuaishou.liveclient.resourcemanager.download.producers.LiveMaterialResourceWriteCacheProducer;
import cr3.b;
import com.kuaishou.liveclient.resourcemanager.download.LiveMaterialResourceDownloadManager$downloadMaterialResource$1$a;
import cr3.a;
import java.lang.IllegalStateException;

public final class LiveMaterialResourceDownloadManager$downloadMaterialResource$1 extends SuspendLambda implements p	// class@001073
{
    public final LiveMaterialResourceDownloadTask $task;
    public int label;
    public final LiveMaterialResourceDownloadManager this$0;

    public void LiveMaterialResourceDownloadManager$downloadMaterialResource$1(LiveMaterialResourceDownloadManager p0,LiveMaterialResourceDownloadTask p1,c p2){
       this.this$0 = p0;
       this.$task = p1;
       super(2, p2);
    }
    public final c create(Object p0,c p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, LiveMaterialResourceDownloadManager$downloadMaterialResource$1.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       a.p(p1, "completion");
       return new LiveMaterialResourceDownloadManager$downloadMaterialResource$1(this.this$0, this.$task, p1);
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveMaterialResourceDownloadManager$downloadMaterialResource$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       int b;
       LiveMaterialResourceDownloadTask a;
       Object obj = this;
       LiveMaterialResourceDownloadManager liveMaterial = LiveMaterialResourceDownloadManager.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveMaterialResourceDownloadManager$downloadMaterialResource$1 obj1 = PatchProxy.applyOneRefs(p0, obj, LiveMaterialResourceDownloadManager$downloadMaterialResource$1.class, "1");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       b.h();
       if (obj.label != null) {
          throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
       }
       j0.n(p0);
       obj1 = obj.this$0;
       LiveMaterialResourceDownloadManager$downloadMaterialResource$1 $task = obj.$task;
       Objects.requireNonNull(obj1);
       File obj2 = PatchProxy.applyOneRefs($task, obj1, liveMaterial, "2");
       int i = 0;
       int i1 = 1;
       if (obj2 != patchProxyRe) {
          b = obj2.booleanValue();
       }else {
          LiveMaterialResourceDownloadTask liveMaterial1 = obj1.b.get($task.h());
          if (liveMaterial1 != null) {
             LiveMaterialResourceDownloadTask h = liveMaterial1.h;
             if (h != null) {
                LiveMaterialResourceDownloadTask liveMaterial2 = LiveMaterialResourceDownloadTask.class;
                if (!PatchProxy.applyVoidOneRefs($task, liveMaterial1, liveMaterial2, "9")) {
                   a.p($task, "mergedTask");
                   a = $task.a;
                   if (!PatchProxy.applyVoidOneRefs(a, liveMaterial1, liveMaterial2, "5")) {
                      a.p(a, "listeners");
                      liveMaterial1.a.addAll(a);
                      a.f(r1.b, z0.f(), null, new LiveMaterialResourceDownloadTask$addListeners$1(liveMaterial1, null), 2, null);
                   }
                   if (!PatchProxy.applyVoid(null, $task, liveMaterial2, "8")) {
                      $task.a.clear();
                   }
                }
                if ($task.c == DownloadTask$DownloadTaskType.IMMEDIATE) {
                   DownloadManager.n().F(h.intValue());
                }
                b = true;
             }
          }
          b = false;
       }
       if (b) {
          return l1.a;
       }else {
          obj1 = obj.this$0;
          $task = obj.$task;
          Objects.requireNonNull(obj1);
          LiveMaterialResourceLocalFileManager$a obj3 = PatchProxy.applyOneRefs($task, obj1, liveMaterial, "4");
          if (obj3 != patchProxyRe) {
             b = obj3.booleanValue();
          }else {
             obj3 = LiveMaterialResourceLocalFileManager.d;
             obj2 = obj3.a().a($task.f());
             if (obj2.exists() && obj2.isDirectory()) {
                File[] uFileArray = obj2.listFiles();
                if (uFileArray != null) {
                   String str = (!uFileArray.length)? 1: null;
                   if (!str) {
                   label_00e8 :
                      if (!i) {
                         i1 = i1 ^ a.g($task.e(), obj3.a().c($task.f()));
                      }
                   }
                }
                i = 1;
                goto label_00e8 ;
             }
          label_00ff :
             b = i1;
          }
          if (!b) {
             obj.$task.n(LiveMaterialResourceDownloadTask$TaskState.FINISH);
             obj.$task.j();
             return l1.a;
          }else {
             obj.this$0.b().put(obj.$task.h(), obj.$task);
             obj1 = obj.this$0;
             Objects.requireNonNull(obj1);
             c uoc = PatchProxy.apply(null, obj1, liveMaterial, "5");
             if (uoc != patchProxyRe) {
             }else {
                uoc = new LiveMaterialResourceDownloadProducer().b(new LiveMaterialResourceMd5CheckProducer()).b(new LiveMaterialResourceUnzipProducer()).b(new LiveMaterialResourceWriteCacheProducer()).b(new b());
             }
             uoc.c(obj.$task, new LiveMaterialResourceDownloadManager$downloadMaterialResource$1$a(obj, null));
             return l1.a;
          }
       }
    }
}
