package com.kuaishou.live.common.core.basic.resource.controlfiles.producer.LiveControlFileMd5CheckProducer$LiveControlFileMd5CheckConsumer$onNewResult$1$invokeSuspend$$inlined$let$lambda$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ja1.f;
import asd.c;
import com.kuaishou.live.common.core.basic.resource.controlfiles.producer.LiveControlFileMd5CheckProducer$LiveControlFileMd5CheckConsumer$onNewResult$1;
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
import la1.a;
import ja1.e;
import java.util.Objects;
import com.kuaishou.live.common.core.basic.resource.controlfiles.producer.LiveControlFileMd5CheckProducer$LiveControlFileMd5CheckConsumer;
import ka1.a;
import com.kuaishou.live.common.core.basic.resource.controlfiles.exceptions.LiveControlFileException;
import java.lang.Throwable;
import ma1.a;
import ma1.a$a;
import java.lang.IllegalStateException;

public final class LiveControlFileMd5CheckProducer$LiveControlFileMd5CheckConsumer$onNewResult$1$invokeSuspend$$inlined$let$lambda$1 extends SuspendLambda implements p	// class@000ecf
{
    public final f $it;
    public int label;
    public k0 p$;
    public final LiveControlFileMd5CheckProducer$LiveControlFileMd5CheckConsumer$onNewResult$1 this$0;

    public void LiveControlFileMd5CheckProducer$LiveControlFileMd5CheckConsumer$onNewResult$1$invokeSuspend$$inlined$let$lambda$1(f p0,c p1,LiveControlFileMd5CheckProducer$LiveControlFileMd5CheckConsumer$onNewResult$1 p2){
       this.$it = p0;
       this.this$0 = p2;
       super(2, p1);
    }
    public final c create(Object p0,c p1){
       LiveControlFileMd5CheckProducer$LiveControlFileMd5CheckConsumer$onNewResult$1$invokeSuspend$$inlined$let$lambda$1 obj = PatchProxy.applyTwoRefsWithListener(p0, p1, this, LiveControlFileMd5CheckProducer$LiveControlFileMd5CheckConsumer$onNewResult$1$invokeSuspend$$inlined$let$lambda$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new LiveControlFileMd5CheckProducer$LiveControlFileMd5CheckConsumer$onNewResult$1$invokeSuspend$$inlined$let$lambda$1(this.$it, p1, this.this$0);
       obj.p$ = p0;
       PatchProxy.onMethodExit(LiveControlFileMd5CheckProducer$LiveControlFileMd5CheckConsumer$onNewResult$1$invokeSuspend$$inlined$let$lambda$1.class, "2");
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefsWithListener(p0, p1, this, LiveControlFileMd5CheckProducer$LiveControlFileMd5CheckConsumer$onNewResult$1$invokeSuspend$$inlined$let$lambda$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(LiveControlFileMd5CheckProducer$LiveControlFileMd5CheckConsumer$onNewResult$1$invokeSuspend$$inlined$let$lambda$1.class, "3");
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       LiveControlFileMd5CheckProducer$LiveControlFileMd5CheckConsumer$onNewResult$1 obj = PatchProxy.applyOneRefsWithListener(p0, this, LiveControlFileMd5CheckProducer$LiveControlFileMd5CheckConsumer$onNewResult$1$invokeSuspend$$inlined$let$lambda$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b.h();
       if (this.label == null) {
          j0.n(p0);
          p0 = this.this$0;
          obj = p0.this$0;
          LiveControlFileMd5CheckProducer$LiveControlFileMd5CheckConsumer$onNewResult$1$invokeSuspend$$inlined$let$lambda$1 t$it = this.$it;
          p0 = p0.$task.a();
          Objects.requireNonNull(obj);
          if (!PatchProxy.applyVoidTwoRefs(t$it, p0, obj, LiveControlFileMd5CheckProducer$LiveControlFileMd5CheckConsumer.class, "3")) {
             a uoa = obj.a();
             if (uoa != null) {
                uoa.b(new LiveControlFileException("main pack md5 check error", t$it.a()), "md5NotRight");
             }
             if (p0 != null) {
                p0.d(t$it.a(), "md5NotRight");
             }
             a.a.a(t$it, false);
          }
          PatchProxy.onMethodExit(LiveControlFileMd5CheckProducer$LiveControlFileMd5CheckConsumer$onNewResult$1$invokeSuspend$$inlined$let$lambda$1.class, "1");
          return l1.a;
       }else {
          PatchProxy.onMethodExit(LiveControlFileMd5CheckProducer$LiveControlFileMd5CheckConsumer$onNewResult$1$invokeSuspend$$inlined$let$lambda$1.class, "1");
          throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
       }
    }
}
