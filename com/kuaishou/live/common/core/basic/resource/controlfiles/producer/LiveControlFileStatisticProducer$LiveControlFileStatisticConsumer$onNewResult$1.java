package com.kuaishou.live.common.core.basic.resource.controlfiles.producer.LiveControlFileStatisticProducer$LiveControlFileStatisticConsumer$onNewResult$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.kuaishou.live.common.core.basic.resource.controlfiles.producer.LiveControlFileStatisticProducer$LiveControlFileStatisticConsumer;
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
import qrd.j0;
import ja1.f;
import la1.a;
import ma1.a;
import ma1.a$a;
import java.util.Objects;
import java.lang.Boolean;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import ka1.a;
import com.kuaishou.live.common.core.basic.resource.controlfiles.exceptions.LiveControlFileException;
import java.lang.Throwable;
import java.lang.IllegalStateException;

public final class LiveControlFileStatisticProducer$LiveControlFileStatisticConsumer$onNewResult$1 extends SuspendLambda implements p	// class@000ed4
{
    public final e $task;
    public int label;
    public k0 p$;
    public final LiveControlFileStatisticProducer$LiveControlFileStatisticConsumer this$0;

    public void LiveControlFileStatisticProducer$LiveControlFileStatisticConsumer$onNewResult$1(LiveControlFileStatisticProducer$LiveControlFileStatisticConsumer p0,e p1,c p2){
       this.this$0 = p0;
       this.$task = p1;
       super(2, p2);
    }
    public final c create(Object p0,c p1){
       LiveControlFileStatisticProducer$LiveControlFileStatisticConsumer$onNewResult$1 obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveControlFileStatisticProducer$LiveControlFileStatisticConsumer$onNewResult$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new LiveControlFileStatisticProducer$LiveControlFileStatisticConsumer$onNewResult$1(this.this$0, this.$task, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveControlFileStatisticProducer$LiveControlFileStatisticConsumer$onNewResult$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f obj = PatchProxy.applyOneRefs(p0, this, LiveControlFileStatisticProducer$LiveControlFileStatisticConsumer$onNewResult$1.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       b.h();
       if (this.label != null) {
          throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
       }
       j0.n(p0);
       p0 = this.$task;
       String str = null;
       if (p0.g != null) {
          p0 = p0.b();
          if (p0 == null || p0.g() != true) {
             p0 = null;
          label_002f :
             if (p0) {
                obj = this.$task.b();
                if (obj != null) {
                   a uoa = this.$task.a();
                   if (uoa != null) {
                      uoa.f(obj.a(), obj.f(), this.$task.e());
                   }
                   a.a.a(obj, true);
                }
             }
             LiveControlFileStatisticProducer$LiveControlFileStatisticConsumer$onNewResult$1 tthis$0 = this.this$0;
             LiveControlFileStatisticProducer$LiveControlFileStatisticConsumer$onNewResult$1 t$task = this.$task;
             Objects.requireNonNull(tthis$0);
             a obj1 = PatchProxy.applyOneRefs(t$task, tthis$0, LiveControlFileStatisticProducer$LiveControlFileStatisticConsumer.class, "3");
             if (obj1 != patchProxyRe) {
                b = obj1.booleanValue();
             }else {
                Iterator iterator = t$task.d().iterator();
                obj1 = 1;
                while (iterator.hasNext()) {
                   f uof = iterator.next();
                   if (uof.g()) {
                      a uoa1 = t$task.a();
                      if (uoa1 != null) {
                         uoa1.f(uof.a(), uof.f(), t$task.e());
                      }
                      a.a.a(uof, true);
                   }else {
                      obj1 = t$task.a();
                      if (obj1 != null) {
                         obj1.d(uof.a(), uof.c());
                      }
                      a.a.a(uof, str);
                      obj1 = null;
                   }
                }
                b = obj1;
             }
             if (p0 && b != null) {
                p0 = this.$task.a();
                if (p0 != null) {
                   p0.e(this.$task.e());
                }
             }else {
                p0 = this.this$0.a();
                if (p0 != null) {
                   p0.b(new LiveControlFileException("main pack download error", null), "downloadError");
                }
             }
             return l1.a;
          }
       }
       p0 = 1;
       goto label_002f ;
    }
}
