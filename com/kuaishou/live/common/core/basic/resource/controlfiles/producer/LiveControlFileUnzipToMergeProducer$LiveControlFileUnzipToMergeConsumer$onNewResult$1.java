package com.kuaishou.live.common.core.basic.resource.controlfiles.producer.LiveControlFileUnzipToMergeProducer$LiveControlFileUnzipToMergeConsumer$onNewResult$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.kuaishou.live.common.core.basic.resource.controlfiles.producer.LiveControlFileUnzipToMergeProducer$LiveControlFileUnzipToMergeConsumer;
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
import java.lang.IllegalStateException;
import java.lang.Boolean;
import java.util.List;
import java.lang.StringBuilder;
import java.io.File;
import java.util.Objects;
import java.util.Iterator;
import ja1.f;
import java.lang.System;
import com.yxcorp.gifshow.util.u0;
import com.kuaishou.live.common.core.basic.resource.controlfiles.utils.LiveControlFileUtil;
import com.kuaishou.live.common.core.basic.resource.controlfiles.utils.LiveControlFileUtil$a;
import qkd.b;
import ka1.a;

public final class LiveControlFileUnzipToMergeProducer$LiveControlFileUnzipToMergeConsumer$onNewResult$1 extends SuspendLambda implements p	// class@000ed8
{
    public final e $task;
    public Object L$0;
    public int label;
    public k0 p$;
    public final LiveControlFileUnzipToMergeProducer$LiveControlFileUnzipToMergeConsumer this$0;

    public void LiveControlFileUnzipToMergeProducer$LiveControlFileUnzipToMergeConsumer$onNewResult$1(LiveControlFileUnzipToMergeProducer$LiveControlFileUnzipToMergeConsumer p0,e p1,c p2){
       this.this$0 = p0;
       this.$task = p1;
       super(2, p2);
    }
    public final c create(Object p0,c p1){
       LiveControlFileUnzipToMergeProducer$LiveControlFileUnzipToMergeConsumer$onNewResult$1 obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveControlFileUnzipToMergeProducer$LiveControlFileUnzipToMergeConsumer$onNewResult$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new LiveControlFileUnzipToMergeProducer$LiveControlFileUnzipToMergeConsumer$onNewResult$1(this.this$0, this.$task, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveControlFileUnzipToMergeProducer$LiveControlFileUnzipToMergeConsumer$onNewResult$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       File uFile1;
       List obj = PatchProxy.applyOneRefs(p0, this, LiveControlFileUnzipToMergeProducer$LiveControlFileUnzipToMergeConsumer$onNewResult$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.h();
       LiveControlFileUnzipToMergeProducer$LiveControlFileUnzipToMergeConsumer$onNewResult$1 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel == 1) {
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          this.L$0 = this.p$;
          this.label = 1;
          p0 = this.this$0.d(this.$task, this);
          if (p0 == obj) {
             return obj;
          }
       }
       if (p0.booleanValue()) {
          p0 = this.this$0;
          obj = this.$task.c();
          String str = this.$task.c+File.separator+this.$task.d;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoidTwoRefs(obj, str, p0, LiveControlFileUnzipToMergeProducer$LiveControlFileUnzipToMergeConsumer.class, "4")) {
             p0 = new File(str);
             Iterator iterator = obj.iterator();
             while (iterator.hasNext()) {
                f uof = iterator.next();
                String str1 = uof.b();
                int i = (str1 == null || !str1.length())? 1: 0;
                if (i) {
                   continue ;
                }else {
                   File uFile = new File(str1);
                   if (!uFile.exists()) {
                      continue ;
                   }else if(!uof.h()){
                      uFile.delete();
                   }else {
                      str1 = uof.e()+"_folder_"+System.currentTimeMillis();
                      try{
                         u0.j(uFile, str1, "");
                         LiveControlFileUtil.e.c(p0, new File(str1));
                         uFile1 = new File(str1);
                      }catch(java.io.IOException e0){
                         uFile1.j(0);
                         uFile1.i("unzipError");
                         uFile1 = new File(str1);
                      }
                      b.m(uFile1);
                      uFile1.delete();
                      uFile.delete();
                   }
                }
             }
          }
       }
       p0 = this.this$0.a();
       if (p0 != null) {
          p0.c(this.$task);
       }
       return l1.a;
    }
}
