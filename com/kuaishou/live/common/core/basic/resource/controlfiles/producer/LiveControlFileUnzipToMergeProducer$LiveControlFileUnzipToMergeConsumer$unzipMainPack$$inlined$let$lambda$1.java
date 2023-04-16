package com.kuaishou.live.common.core.basic.resource.controlfiles.producer.LiveControlFileUnzipToMergeProducer$LiveControlFileUnzipToMergeConsumer$unzipMainPack$$inlined$let$lambda$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import java.io.IOException;
import ja1.f;
import asd.c;
import com.kuaishou.live.common.core.basic.resource.controlfiles.producer.LiveControlFileUnzipToMergeProducer$LiveControlFileUnzipToMergeConsumer;
import ja1.e;
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
import ka1.a;
import java.lang.Throwable;
import la1.a;
import ma1.a;
import ma1.a$a;
import java.lang.IllegalStateException;

public final class LiveControlFileUnzipToMergeProducer$LiveControlFileUnzipToMergeConsumer$unzipMainPack$$inlined$let$lambda$1 extends SuspendLambda implements p	// class@000ed9
{
    public final c $continuation$inlined;
    public final IOException $e;
    public final f $it;
    public final e $task$inlined;
    public int label;
    public k0 p$;
    public final LiveControlFileUnzipToMergeProducer$LiveControlFileUnzipToMergeConsumer this$0;

    public void LiveControlFileUnzipToMergeProducer$LiveControlFileUnzipToMergeConsumer$unzipMainPack$$inlined$let$lambda$1(IOException p0,f p1,c p2,LiveControlFileUnzipToMergeProducer$LiveControlFileUnzipToMergeConsumer p3,c p4,e p5){
       this.$e = p0;
       this.$it = p1;
       this.this$0 = p3;
       this.$continuation$inlined = p4;
       this.$task$inlined = p5;
       super(2, p2);
    }
    public final c create(Object p0,c p1){
       Object obj = PatchProxy.applyTwoRefsWithListener(p0, p1, this, LiveControlFileUnzipToMergeProducer$LiveControlFileUnzipToMergeConsumer$unzipMainPack$$inlined$let$lambda$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       LiveControlFileUnzipToMergeProducer$LiveControlFileUnzipToMergeConsumer$unzipMainPack$$inlined$let$lambda$1 liveControlF = new LiveControlFileUnzipToMergeProducer$LiveControlFileUnzipToMergeConsumer$unzipMainPack$$inlined$let$lambda$1(this.$e, this.$it, p1, this.this$0, this.$continuation$inlined, this.$task$inlined);
       obj.p$ = p0;
       PatchProxy.onMethodExit(LiveControlFileUnzipToMergeProducer$LiveControlFileUnzipToMergeConsumer$unzipMainPack$$inlined$let$lambda$1.class, "2");
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefsWithListener(p0, p1, this, LiveControlFileUnzipToMergeProducer$LiveControlFileUnzipToMergeConsumer$unzipMainPack$$inlined$let$lambda$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(LiveControlFileUnzipToMergeProducer$LiveControlFileUnzipToMergeConsumer$unzipMainPack$$inlined$let$lambda$1.class, "3");
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, LiveControlFileUnzipToMergeProducer$LiveControlFileUnzipToMergeConsumer$unzipMainPack$$inlined$let$lambda$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b.h();
       if (this.label == null) {
          j0.n(p0);
          p0 = this.this$0.a();
          if (p0 != null) {
             p0.b(this.$e, "unzipError");
          }
          p0 = this.$task$inlined.a();
          if (p0 != null) {
             p0.d(this.$it.a(), this.$task$inlined.e());
          }
          a.a.a(this.$it, false);
          PatchProxy.onMethodExit(LiveControlFileUnzipToMergeProducer$LiveControlFileUnzipToMergeConsumer$unzipMainPack$$inlined$let$lambda$1.class, "1");
          return l1.a;
       }else {
          PatchProxy.onMethodExit(LiveControlFileUnzipToMergeProducer$LiveControlFileUnzipToMergeConsumer$unzipMainPack$$inlined$let$lambda$1.class, "1");
          throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
       }
    }
}
