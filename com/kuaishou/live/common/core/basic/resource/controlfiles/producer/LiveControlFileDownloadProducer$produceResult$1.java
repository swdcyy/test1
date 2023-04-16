package com.kuaishou.live.common.core.basic.resource.controlfiles.producer.LiveControlFileDownloadProducer$produceResult$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.kuaishou.live.common.core.basic.resource.controlfiles.producer.LiveControlFileDownloadProducer;
import ja1.e;
import ka1.a;
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
import com.kuaishou.live.common.core.basic.resource.controlfiles.producer.LiveControlFileDownloadProducer$produceResult$1$a;
import qrd.j0;
import java.lang.IllegalStateException;
import ja1.f;
import la1.a;
import com.kuaishou.live.common.core.basic.resource.controlfiles.producer.LiveControlFileDownloadProducer$a;
import java.lang.Boolean;
import java.util.Objects;
import com.kuaishou.live.common.core.basic.resource.controlfiles.exceptions.LiveControlFileException;
import java.lang.Throwable;
import ma1.a;
import ma1.a$a;
import java.util.List;

public final class LiveControlFileDownloadProducer$produceResult$1 extends SuspendLambda implements p	// class@000ecc
{
    public final a $consumer;
    public final e $controlFileTask;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public k0 p$;
    public final LiveControlFileDownloadProducer this$0;

    public void LiveControlFileDownloadProducer$produceResult$1(LiveControlFileDownloadProducer p0,e p1,a p2,c p3){
       this.this$0 = p0;
       this.$controlFileTask = p1;
       this.$consumer = p2;
       super(2, p3);
    }
    public final c create(Object p0,c p1){
       LiveControlFileDownloadProducer$produceResult$1 obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveControlFileDownloadProducer$produceResult$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new LiveControlFileDownloadProducer$produceResult$1(this.this$0, this.$controlFileTask, this.$consumer, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveControlFileDownloadProducer$produceResult$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       boolean b;
       LiveControlFileDownloadProducer$produceResult$1 tL$0;
       a obj = PatchProxy.applyOneRefs(p0, this, LiveControlFileDownloadProducer$produceResult$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.h();
       LiveControlFileDownloadProducer$produceResult$1 tlabel = this.label;
       b = 2;
       LiveControlFileDownloadProducer$produceResult$1 oproduceResu = 1;
       if (tlabel != null) {
          if (tlabel != oproduceResu) {
             if (tlabel == b) {
                j0.n(p0);
             label_00cd :
                this.$consumer.c(this.$controlFileTask);
                return l1.a;
             }else {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
             }
          }else {
             tlabel = this.L$2;
             oproduceResu = this.L$1;
             tL$0 = this.L$0;
             j0.n(p0);
          }
       }else {
          j0.n(p0);
          tL$0 = this.p$;
          p0 = new LiveControlFileDownloadProducer$produceResult$1$a(this);
          a uoa = this.$controlFileTask.a();
          if (uoa != null) {
             uoa.b();
          }
          f uof = this.$controlFileTask.b();
          if (uof != null) {
             this.L$0 = tL$0;
             this.L$1 = p0;
             this.L$2 = uof;
             this.label = oproduceResu;
             LiveControlFileDownloadProducer$produceResult$1$a obj1 = this.this$0.g(uof, p0, this);
             if (obj1 == obj) {
                return obj;
             }else {
                obj1 = p0;
                p0 = obj1;
             }
          }else {
          label_00b7 :
             this.L$0 = tL$0;
             this.L$1 = p0;
             this.label = b;
             if (this.this$0.e(this.$controlFileTask.d(), null, this) == obj) {
                return obj;
             }else {
                goto label_00cd ;
             }
          }
       }
       if (!p0.booleanValue()) {
          LiveControlFileDownloadProducer$produceResult$1 tthis$0 = this.this$0;
          p0 = this.$consumer;
          obj = this.$controlFileTask.a();
          Objects.requireNonNull(tthis$0);
          if (!PatchProxy.applyVoidThreeRefs(tlabel, p0, obj, tthis$0, LiveControlFileDownloadProducer.class, "3")) {
             p0.b(new LiveControlFileException("main pack download error", tlabel.a()), "downloadError");
             if (obj != null) {
                obj.d(tlabel.a(), "downloadError");
             }
             a.a.a(tlabel, false);
          }
          return l1.a;
       }else {
          p0 = oproduceResu;
          goto label_00b7 ;
       }
    }
}
