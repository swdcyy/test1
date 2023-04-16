package com.kuaishou.liveclient.resourcemanager.download.task.LiveMaterialResourceDownloadTask$notifyAllListenerIfNeeded$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
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
import com.kuaishou.liveclient.resourcemanager.download.task.LiveMaterialResourceDownloadTask$TaskState;
import java.util.Iterator;
import java.lang.Iterable;
import dr3.a;
import java.lang.Throwable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.lang.IllegalStateException;

public final class LiveMaterialResourceDownloadTask$notifyAllListenerIfNeeded$1 extends SuspendLambda implements p	// class@00108d
{
    public int label;
    public final LiveMaterialResourceDownloadTask this$0;

    public void LiveMaterialResourceDownloadTask$notifyAllListenerIfNeeded$1(LiveMaterialResourceDownloadTask p0,c p1){
       this.this$0 = p0;
       super(2, p1);
    }
    public final c create(Object p0,c p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, LiveMaterialResourceDownloadTask$notifyAllListenerIfNeeded$1.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       a.p(p1, "completion");
       return new LiveMaterialResourceDownloadTask$notifyAllListenerIfNeeded$1(this.this$0, p1);
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveMaterialResourceDownloadTask$notifyAllListenerIfNeeded$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       a obj = PatchProxy.applyOneRefs(p0, this, LiveMaterialResourceDownloadTask$notifyAllListenerIfNeeded$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b.h();
       if (this.label != null) {
          throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
       }
       j0.n(p0);
       if (this.this$0.i() == LiveMaterialResourceDownloadTask$TaskState.FAILED || this.this$0.i() == LiveMaterialResourceDownloadTask$TaskState.FINISH) {
          p0 = this.this$0.a.iterator();
          while (p0.hasNext()) {
             obj = p0.next();
             if (this.this$0.i() == LiveMaterialResourceDownloadTask$TaskState.FAILED) {
                obj.a(this.this$0.c(), this.this$0.n);
             }else {
                obj.b(this.this$0);
             }
          }
          this.this$0.a.clear();
       }
       return l1.a;
    }
}
