package com.kuaishou.live.common.core.basic.resource.controlfiles.producer.LiveControlFileMd5CheckProducer$LiveControlFileMd5CheckConsumer$onNewResult$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.kuaishou.live.common.core.basic.resource.controlfiles.producer.LiveControlFileMd5CheckProducer$LiveControlFileMd5CheckConsumer;
import ja1.e;
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
import ja1.f;
import qrd.j0;
import java.lang.IllegalStateException;
import ftd.j2;
import ftd.z0;
import com.kuaishou.live.common.core.basic.resource.controlfiles.producer.LiveControlFileMd5CheckProducer$LiveControlFileMd5CheckConsumer$onNewResult$1$invokeSuspend$$inlined$let$lambda$1;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.a;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import ka1.a;

public final class LiveControlFileMd5CheckProducer$LiveControlFileMd5CheckConsumer$onNewResult$1 extends SuspendLambda implements p	// class@000ed0
{
    public final e $task;
    public Object L$0;
    public Object L$1;
    public int label;
    public k0 p$;
    public final LiveControlFileMd5CheckProducer$LiveControlFileMd5CheckConsumer this$0;

    public void LiveControlFileMd5CheckProducer$LiveControlFileMd5CheckConsumer$onNewResult$1(LiveControlFileMd5CheckProducer$LiveControlFileMd5CheckConsumer p0,e p1,c p2){
       this.this$0 = p0;
       this.$task = p1;
       super(2, p2);
    }
    public final c create(Object p0,c p1){
       LiveControlFileMd5CheckProducer$LiveControlFileMd5CheckConsumer$onNewResult$1 obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveControlFileMd5CheckProducer$LiveControlFileMd5CheckConsumer$onNewResult$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new LiveControlFileMd5CheckProducer$LiveControlFileMd5CheckConsumer$onNewResult$1(this.this$0, this.$task, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveControlFileMd5CheckProducer$LiveControlFileMd5CheckConsumer$onNewResult$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveControlFileMd5CheckProducer$LiveControlFileMd5CheckConsumer$onNewResult$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.h();
       LiveControlFileMd5CheckProducer$LiveControlFileMd5CheckConsumer$onNewResult$1 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel == 1) {
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          p0 = this.p$;
          f uof = this.$task.b();
          if (uof != null && !this.this$0.d(uof)) {
             this.L$0 = p0;
             this.L$1 = uof;
             this.label = 1;
             if (a.i(z0.g(), new LiveControlFileMd5CheckProducer$LiveControlFileMd5CheckConsumer$onNewResult$1$invokeSuspend$$inlined$let$lambda$1(uof, null, this), this) == obj) {
                return obj;
             }
          }else {
             p0 = this.$task.c().iterator();
             while (p0.hasNext()) {
                this.this$0.d(p0.next());
             }
             p0 = this.this$0.a();
             if (p0 != null) {
                p0.c(this.$task);
             }
             return l1.a;
          }
       }
       return l1.a;
    }
}
