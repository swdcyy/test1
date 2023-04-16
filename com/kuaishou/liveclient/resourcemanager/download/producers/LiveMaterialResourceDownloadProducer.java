package com.kuaishou.liveclient.resourcemanager.download.producers.LiveMaterialResourceDownloadProducer;
import ftd.k0;
import cr3.c;
import com.kuaishou.liveclient.resourcemanager.download.producers.LiveMaterialResourceDownloadProducer$a;
import nsd.u;
import com.kuaishou.liveclient.resourcemanager.download.task.LiveMaterialResourceDownloadTask;
import cr3.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.liveclient.resourcemanager.download.producers.LiveMaterialResourceDownloadProducer$produceResult$1;
import asd.c;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import msd.p;
import ftd.z1;
import kotlinx.coroutines.a;
import com.kuaishou.liveclient.resourcemanager.download.producers.LiveMaterialResourceDownloadProducer$downloadResWithRetry$1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.Boolean;
import dsd.a;
import asd.h;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.Ref$BooleanRef;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.download.DownloadTask$DownloadRequest;
import java.util.List;
import com.yxcorp.download.DownloadTask$DownloadBizExtra;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import kotlin.Result;
import com.yxcorp.download.DownloadManager;
import com.yxcorp.download.b;
import com.kuaishou.liveclient.resourcemanager.download.producers.LiveMaterialResourceDownloadProducer$c;
import java.lang.Integer;
import dsd.e;
import kotlinx.coroutines.CoroutineDispatcher;
import ftd.z0;
import com.kuaishou.liveclient.resourcemanager.download.producers.LiveMaterialResourceDownloadProducer$b;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlin.coroutines.CoroutineContext$b;
import asd.a;

public final class LiveMaterialResourceDownloadProducer extends c implements k0	// class@00107a
{
    public static final LiveMaterialResourceDownloadProducer$a c;

    static {
       LiveMaterialResourceDownloadProducer.c = new LiveMaterialResourceDownloadProducer$a(null);
    }
    public void LiveMaterialResourceDownloadProducer(){
       super();
    }
    public void c(LiveMaterialResourceDownloadTask p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveMaterialResourceDownloadProducer.class, "2")) {
          return;
       }
       a.p(p0, "task");
       a.f(this, null, null, new LiveMaterialResourceDownloadProducer$produceResult$1(this, p0, p1, null), 3, null);
       return;
    }
    public final Object d(LiveMaterialResourceDownloadTask p0,c p1){
       LiveMaterialResourceDownloadProducer$downloadResWithRetry$1 uodownloadRe;
       boolean b;
       LiveMaterialResourceDownloadProducer$downloadResWithRetry$1 l$1;
       if (p1 instanceof LiveMaterialResourceDownloadProducer$downloadResWithRetry$1) {
          uodownloadRe = p1;
          LiveMaterialResourceDownloadProducer$downloadResWithRetry$1 label = uodownloadRe.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             uodownloadRe.label = label - i;
          label_0018 :
             LiveMaterialResourceDownloadProducer$downloadResWithRetry$1 result = uodownloadRe.result;
             Object obj = b.h();
             LiveMaterialResourceDownloadProducer$downloadResWithRetry$1 label1 = uodownloadRe.label;
             if (label1 != null) {
                if (label1 != 1) {
                   if (label1 == 2) {
                      j0.n(result);
                   label_0067 :
                      b = result.booleanValue();
                   label_006d :
                      return a.a(b);
                   }else {
                      throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                   }
                }else {
                   l$1 = uodownloadRe.L$1;
                   label1 = uodownloadRe.L$0;
                   j0.n(result);
                }
             }else {
                j0.n(result);
                uodownloadRe.L$0 = this;
                uodownloadRe.L$1 = p0;
                uodownloadRe.label = 1;
                result = this.e(p0, uodownloadRe);
                if (result == obj) {
                   return obj;
                }else {
                   LiveMaterialResourceDownloadProducer liveMaterial = this;
                }
             }
             b = result.booleanValue();
             if (!b) {
                uodownloadRe.L$0 = 0;
                uodownloadRe.L$1 = 0;
                uodownloadRe.label = 2;
                result = label1.e(l$1, uodownloadRe);
                if (result == obj) {
                   return obj;
                }else {
                   goto label_0067 ;
                }
             }else {
                goto label_006d ;
             }
          }
       }
       uodownloadRe = new LiveMaterialResourceDownloadProducer$downloadResWithRetry$1(this, p1);
       goto label_0018 ;
    }
    public final Object e(LiveMaterialResourceDownloadTask p0,c p1){
       h oh = new h(IntrinsicsKt__IntrinsicsJvmKt.d(p1));
       Ref$BooleanRef uBooleanRef = new Ref$BooleanRef();
       uBooleanRef.element = false;
       Objects.requireNonNull(p0);
       Object[] objArray = null;
       LiveMaterialResourceDownloadTask obj = PatchProxy.apply(objArray, p0, LiveMaterialResourceDownloadTask.class, "11");
       int i = 1;
       if (obj != PatchProxyResult.class) {
          objArray = obj;
       }else {
          obj = p0.b;
          if (obj != null) {
             int i1 = p0.o + i;
             p0.o = i1;
             if (i1 <= (obj.size() - i)) {
                DownloadTask$DownloadRequest uDownloadReq = new DownloadTask$DownloadRequest(obj.get(p0.o));
                obj = p0.q;
                String str = (obj == null || !obj.length())? 1: null;
                if (str) {
                   uDownloadReq.setBizInfo("com.kuaishou.liveclient.resourcemanager", "live_download", objArray);
                }else {
                   uDownloadReq.setBizInfo("com.kuaishou.liveclient.resourcemanager", p0.q, objArray);
                }
                uDownloadReq.setAllowedNetworkTypes(3);
                if (p0.r != null) {
                   uDownloadReq.setDownloadHostType(6);
                }
                uDownloadReq.setDestinationDir(p0.g);
                uDownloadReq.setInstallAfterDownload(false);
                uDownloadReq.setDownloadTaskType(p0.c);
                objArray = uDownloadReq;
             }
          }
       }
       if (objArray == null) {
          oh.resumeWith(Result.constructor-impl(a.a(false)));
       }else {
          b[] uobArray = new b[i];
          uobArray[0] = new LiveMaterialResourceDownloadProducer$c(uBooleanRef, oh, p0);
          p0.h = a.f(DownloadManager.n().E(objArray, uobArray));
       }
       p0 = oh.b();
       if (p0 == b.h()) {
          e.c(p1);
       }
       return p0;
    }
    public CoroutineContext getCoroutineContext(){
       Object obj = PatchProxy.apply(null, this, LiveMaterialResourceDownloadProducer.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return z0.f().plus(new LiveMaterialResourceDownloadProducer$b(CoroutineExceptionHandler.u0));
    }
}
