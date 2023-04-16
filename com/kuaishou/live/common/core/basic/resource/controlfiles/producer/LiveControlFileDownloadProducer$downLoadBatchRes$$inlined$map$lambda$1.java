package com.kuaishou.live.common.core.basic.resource.controlfiles.producer.LiveControlFileDownloadProducer$downLoadBatchRes$$inlined$map$lambda$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ja1.f;
import asd.c;
import com.kuaishou.live.common.core.basic.resource.controlfiles.producer.LiveControlFileDownloadProducer;
import com.kuaishou.live.common.core.basic.resource.controlfiles.producer.LiveControlFileDownloadProducer$a;
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
import java.lang.IllegalStateException;

public final class LiveControlFileDownloadProducer$downLoadBatchRes$$inlined$map$lambda$1 extends SuspendLambda implements p	// class@000ec8
{
    public final f $it;
    public final LiveControlFileDownloadProducer$a $onProgress$inlined;
    public Object L$0;
    public int label;
    public k0 p$;
    public final LiveControlFileDownloadProducer this$0;

    public void LiveControlFileDownloadProducer$downLoadBatchRes$$inlined$map$lambda$1(f p0,c p1,LiveControlFileDownloadProducer p2,LiveControlFileDownloadProducer$a p3){
       this.$it = p0;
       this.this$0 = p2;
       this.$onProgress$inlined = p3;
       super(2, p1);
    }
    public final c create(Object p0,c p1){
       LiveControlFileDownloadProducer$downLoadBatchRes$$inlined$map$lambda$1 obj = PatchProxy.applyTwoRefsWithListener(p0, p1, this, LiveControlFileDownloadProducer$downLoadBatchRes$$inlined$map$lambda$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new LiveControlFileDownloadProducer$downLoadBatchRes$$inlined$map$lambda$1(this.$it, p1, this.this$0, this.$onProgress$inlined);
       obj.p$ = p0;
       PatchProxy.onMethodExit(LiveControlFileDownloadProducer$downLoadBatchRes$$inlined$map$lambda$1.class, "2");
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefsWithListener(p0, p1, this, LiveControlFileDownloadProducer$downLoadBatchRes$$inlined$map$lambda$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(LiveControlFileDownloadProducer$downLoadBatchRes$$inlined$map$lambda$1.class, "3");
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, LiveControlFileDownloadProducer$downLoadBatchRes$$inlined$map$lambda$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.h();
       LiveControlFileDownloadProducer$downLoadBatchRes$$inlined$map$lambda$1 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel == 1) {
             j0.n(p0);
          }else {
             PatchProxy.onMethodExit(LiveControlFileDownloadProducer$downLoadBatchRes$$inlined$map$lambda$1.class, "1");
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          this.L$0 = this.p$;
          this.label = 1;
          p0 = this.this$0.g(this.$it, this.$onProgress$inlined, this);
          if (p0 == obj) {
             PatchProxy.onMethodExit(LiveControlFileDownloadProducer$downLoadBatchRes$$inlined$map$lambda$1.class, "1");
             return obj;
          }
       }
       PatchProxy.onMethodExit(LiveControlFileDownloadProducer$downLoadBatchRes$$inlined$map$lambda$1.class, "1");
       return p0;
    }
}
