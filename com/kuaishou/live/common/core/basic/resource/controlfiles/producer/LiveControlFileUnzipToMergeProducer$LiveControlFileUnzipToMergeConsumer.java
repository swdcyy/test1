package com.kuaishou.live.common.core.basic.resource.controlfiles.producer.LiveControlFileUnzipToMergeProducer$LiveControlFileUnzipToMergeConsumer;
import ftd.k0;
import ka1.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ja1.e;
import kotlinx.coroutines.CoroutineDispatcher;
import ftd.z0;
import com.kuaishou.live.common.core.basic.resource.controlfiles.producer.LiveControlFileUnzipToMergeProducer$LiveControlFileUnzipToMergeConsumer$onNewResult$1;
import asd.c;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import msd.p;
import ftd.z1;
import kotlinx.coroutines.a;
import com.kuaishou.live.common.core.basic.resource.controlfiles.producer.LiveControlFileUnzipToMergeProducer$LiveControlFileUnzipToMergeConsumer$unzipMainPack$1;
import csd.b;
import java.io.IOException;
import java.io.File;
import ja1.f;
import qrd.j0;
import java.lang.IllegalStateException;
import com.kuaishou.live.common.core.basic.resource.controlfiles.utils.LiveControlFileUtil;
import java.util.Objects;
import com.kuaishou.live.common.core.basic.resource.controlfiles.utils.LiveControlFileUtil$a;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.util.u0;
import com.kuaishou.gifshow.files.a;
import ftd.j2;
import com.kuaishou.live.common.core.basic.resource.controlfiles.producer.LiveControlFileUnzipToMergeProducer$LiveControlFileUnzipToMergeConsumer$unzipMainPack$$inlined$let$lambda$1;
import java.lang.Boolean;
import dsd.a;
import com.kuaishou.live.common.core.basic.resource.controlfiles.producer.LiveControlFileUnzipToMergeProducer$LiveControlFileUnzipToMergeConsumer$a;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlin.coroutines.CoroutineContext$b;
import asd.a;

public final class LiveControlFileUnzipToMergeProducer$LiveControlFileUnzipToMergeConsumer extends a implements k0	// class@000edb
{

    public void LiveControlFileUnzipToMergeProducer$LiveControlFileUnzipToMergeConsumer(a p0){
       a.p(p0, "upstreamConsumer");
       super(p0);
    }
    public void b(Throwable p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveControlFileUnzipToMergeProducer$LiveControlFileUnzipToMergeConsumer.class, "1")) {
          return;
       }
       a.p(p0, "throwable");
       a.p(p1, "failedReason");
       a uoa = this.a();
       if (uoa != null) {
          uoa.b(p0, p1);
       }
       return;
    }
    public void c(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveControlFileUnzipToMergeProducer$LiveControlFileUnzipToMergeConsumer.class, "3")) {
          return;
       }
       a.p(p0, "task");
       a.f(this, z0.f(), null, new LiveControlFileUnzipToMergeProducer$LiveControlFileUnzipToMergeConsumer$onNewResult$1(this, p0, null), 2, null);
       return;
    }
    public final Object d(e p0,c p1){
       LiveControlFileUnzipToMergeProducer$LiveControlFileUnzipToMergeConsumer$unzipMainPack$1 liveControlF1;
       LiveControlFileUnzipToMergeProducer$LiveControlFileUnzipToMergeConsumer$unzipMainPack$1 liveControlF2;
       f uof;
       Object obj1;
       String str;
       f b;
       File uFile;
       LiveControlFileUnzipToMergeProducer$LiveControlFileUnzipToMergeConsumer liveControlF = this;
       c uoc = p1;
       if (uoc instanceof LiveControlFileUnzipToMergeProducer$LiveControlFileUnzipToMergeConsumer$unzipMainPack$1) {
          liveControlF1 = uoc;
          LiveControlFileUnzipToMergeProducer$LiveControlFileUnzipToMergeConsumer$unzipMainPack$1 label = liveControlF1.label;
          if (label & Integer.MIN_VALUE) {
             liveControlF1.label = label - Integer.MIN_VALUE;
             try{
             label_001c :
                liveControlF2 = liveControlF1;
                LiveControlFileUnzipToMergeProducer$LiveControlFileUnzipToMergeConsumer$unzipMainPack$1 result = liveControlF2.result;
                b.h();
                liveControlF1 = liveControlF2.label;
                if (liveControlF1 != null) {
                   if (liveControlF1 == 1) {
                      liveControlF1 = liveControlF2.L$4;
                      j0.n(result);
                   }else {
                      throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                   }
                }else {
                   j0.n(result);
                   uof = p0.b();
                   if (uof != null) {
                      LiveControlFileUtil$a e = LiveControlFileUtil.e;
                      Objects.requireNonNull(e);
                      String obj = PatchProxy.applyOneRefs(uof, e, LiveControlFileUtil$a.class, "8");
                      if (obj != PatchProxyResult.class) {
                         obj1 = obj;
                      }else {
                         a.p(uof, "taskUnit");
                         obj = uof.b();
                         uFile = (obj == null || !obj.length())? 1: null;
                         if (!uFile) {
                            uFile = new File(obj);
                            if (uFile.exists()) {
                               obj1 = uFile;
                            }
                         }
                         obj1 = null;
                      }
                      if (obj1 != null && uof.h()) {
                         str = uof.e();
                         if (str != null) {
                            b = uof.b;
                            if (b != null) {
                               u0.j(obj1, str, b);
                               a.a(new File(str));
                               obj1.delete();
                            }else {
                               return a.a(false);
                            }
                         }else {
                            return a.a(false);
                         }
                      }
                   }
                label_0112 :
                   return a.a(true);
                }
             }catch(java.io.IOException e0){
                LiveControlFileUnzipToMergeProducer$LiveControlFileUnzipToMergeConsumer$unzipMainPack$$inlined$let$lambda$1 liveControlF3 = v5;
                LiveControlFileUnzipToMergeProducer$LiveControlFileUnzipToMergeConsumer$unzipMainPack$$inlined$let$lambda$1 liveControlF4 = v5;
                liveControlF3 = new LiveControlFileUnzipToMergeProducer$LiveControlFileUnzipToMergeConsumer$unzipMainPack$$inlined$let$lambda$1(e0, uof, null, this, liveControlF2, p0);
                liveControlF2.L$0 = liveControlF;
                liveControlF2.L$1 = p0;
                liveControlF2.L$2 = uof;
                liveControlF2.L$3 = uof;
                liveControlF2.L$4 = obj1;
                liveControlF2.L$5 = str;
                liveControlF2.L$6 = b;
                liveControlF2.L$7 = e0;
                liveControlF2.label = 1;
                if (a.i(z0.g(), liveControlF4, liveControlF2) == v10) {
                   return v10;
                }else {
                   uFile = obj1;
                }
             }
             liveControlF1.delete();
             return a.a(false);
          }
       }
       liveControlF1 = new LiveControlFileUnzipToMergeProducer$LiveControlFileUnzipToMergeConsumer$unzipMainPack$1(liveControlF, uoc);
       goto label_001c ;
    }
    public CoroutineContext getCoroutineContext(){
       Object obj = PatchProxy.apply(null, this, LiveControlFileUnzipToMergeProducer$LiveControlFileUnzipToMergeConsumer.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return z0.f().plus(new LiveControlFileUnzipToMergeProducer$LiveControlFileUnzipToMergeConsumer$a(CoroutineExceptionHandler.u0));
    }
}
