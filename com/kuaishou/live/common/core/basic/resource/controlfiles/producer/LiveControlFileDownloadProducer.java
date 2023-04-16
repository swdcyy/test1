package com.kuaishou.live.common.core.basic.resource.controlfiles.producer.LiveControlFileDownloadProducer;
import ftd.k0;
import na1.a;
import ja1.e;
import ka1.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.basic.resource.controlfiles.producer.LiveControlFileDownloadProducer$produceResult$1;
import asd.c;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import msd.p;
import ftd.z1;
import kotlinx.coroutines.a;
import ja1.f;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import java.util.List;
import com.kuaishou.live.common.core.basic.resource.controlfiles.producer.LiveControlFileDownloadProducer$a;
import com.kuaishou.live.common.core.basic.resource.controlfiles.producer.LiveControlFileDownloadProducer$downLoadBatchRes$1;
import csd.b;
import ftd.r0;
import java.util.Iterator;
import java.lang.Iterable;
import qrd.j0;
import java.lang.IllegalStateException;
import java.util.ArrayList;
import trd.u;
import com.kuaishou.live.common.core.basic.resource.controlfiles.producer.LiveControlFileDownloadProducer$downLoadBatchRes$$inlined$map$lambda$1;
import qrd.l1;
import asd.h;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.Ref$BooleanRef;
import java.util.Objects;
import com.yxcorp.download.DownloadTask$DownloadRequest;
import com.yxcorp.download.DownloadTask$DownloadBizExtra;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import kotlin.Result;
import com.yxcorp.download.DownloadManager;
import com.yxcorp.download.b;
import com.kuaishou.live.common.core.basic.resource.controlfiles.producer.LiveControlFileDownloadProducer$c;
import dsd.e;
import com.kuaishou.live.common.core.basic.resource.controlfiles.producer.LiveControlFileDownloadProducer$downloadSingleTaskWithRetry$1;
import dsd.a;
import ftd.j2;
import ftd.z0;
import com.kuaishou.live.common.core.basic.resource.controlfiles.producer.LiveControlFileDownloadProducer$b;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlin.coroutines.CoroutineContext$b;
import asd.a;

public final class LiveControlFileDownloadProducer extends a implements k0	// class@000ecd
{

    public void LiveControlFileDownloadProducer(){
       super();
    }
    public void c(e p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveControlFileDownloadProducer.class, "2")) {
          return;
       }
       a.p(p0, "controlFileTask");
       a.p(p1, "consumer");
       a.f(this, null, null, new LiveControlFileDownloadProducer$produceResult$1(this, p0, p1, null), 3, null);
       return;
    }
    public final boolean d(f p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveControlFileDownloadProducer.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       String str = (p0 != null)? p0.b(): null;
       int i = (str == null || !str.length())? 1: 0;
       return (i ^ 1);
    }
    public final Object e(List p0,LiveControlFileDownloadProducer$a p1,c p2){
       LiveControlFileDownloadProducer$downLoadBatchRes$1 uodownLoadBa;
       LiveControlFileDownloadProducer$downLoadBatchRes$1 l$4;
       LiveControlFileDownloadProducer$downLoadBatchRes$1 l$1;
       LiveControlFileDownloadProducer$downLoadBatchRes$1 l$0;
       if (p2 instanceof LiveControlFileDownloadProducer$downLoadBatchRes$1) {
          uodownLoadBa = p2;
          LiveControlFileDownloadProducer$downLoadBatchRes$1 label = uodownLoadBa.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             uodownLoadBa.label = label - i;
          label_0018 :
             LiveControlFileDownloadProducer$downLoadBatchRes$1 result = uodownLoadBa.result;
             Object obj = b.h();
             LiveControlFileDownloadProducer$downLoadBatchRes$1 label1 = uodownLoadBa.label;
             LiveControlFileDownloadProducer$downLoadBatchRes$1 uodownLoadBa1 = null;
             if (label1 != null) {
                if (label1 == 1) {
                   l$4 = uodownLoadBa.L$4;
                   label1 = uodownLoadBa.L$3;
                   uodownLoadBa1 = uodownLoadBa.L$2;
                   l$1 = uodownLoadBa.L$1;
                   l$0 = uodownLoadBa.L$0;
                   j0.n(result);
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                ArrayList uArrayList = new ArrayList(u.Y(p0, 10));
                Iterator iterator = p0.iterator();
                while (iterator.hasNext()) {
                   uArrayList.add(a.b(this, this.getCoroutineContext(), null, new LiveControlFileDownloadProducer$downLoadBatchRes$$inlined$map$lambda$1(iterator.next(), uodownLoadBa1, this, uodownLoadBa1), 2, null));
                }
                l$0 = this;
                l$1 = p0;
                l$4 = uArrayList.iterator();
             }
             while (true) {
                if (!l$4.hasNext()) {
                   return l1.a;
                }
                result = l$4.next();
                Object obj1 = result;
                uodownLoadBa.L$0 = l$0;
                uodownLoadBa.L$1 = l$1;
                uodownLoadBa.L$2 = uodownLoadBa1;
                uodownLoadBa.L$3 = label1;
                uodownLoadBa.L$4 = l$4;
                uodownLoadBa.L$5 = result;
                uodownLoadBa.L$6 = obj1;
                uodownLoadBa.label = 1;
                if (obj1.C(uodownLoadBa) == obj) {
                   break ;
                }
             }
             return obj;
          }
       }
       uodownLoadBa = new LiveControlFileDownloadProducer$downLoadBatchRes$1(this, p2);
       goto label_0018 ;
    }
    public final Object f(f p0,LiveControlFileDownloadProducer$a p1,c p2){
       h oh = new h(IntrinsicsKt__IntrinsicsJvmKt.d(p2));
       Ref$BooleanRef uBooleanRef = new Ref$BooleanRef();
       uBooleanRef.element = false;
       Objects.requireNonNull(p0);
       Object[] objArray = null;
       f obj = PatchProxy.apply(objArray, p0, f.class, "5");
       int i = 1;
       if (obj != PatchProxyResult.class) {
          objArray = obj;
       }else {
          obj = p0.e;
          if (obj != null) {
             int i1 = p0.k + i;
             p0.k = i1;
             if (i1 <= (obj.length - i)) {
                DownloadTask$DownloadRequest uDownloadReq = new DownloadTask$DownloadRequest(obj[i1]);
                obj = p0.f;
                String str = (obj == null || !obj.length())? 1: null;
                if (str) {
                   uDownloadReq.setBizInfo(":ks-features:ft-live:live-external:live-lite-api", "live_download", objArray);
                }else {
                   uDownloadReq.setBizInfo(":ks-features:ft-live:live-external:live-lite-api", p0.g, objArray);
                }
                uDownloadReq.setAllowedNetworkTypes(3);
                uDownloadReq.setDestinationDir(p0.a);
                uDownloadReq.setInstallAfterDownload(false);
                uDownloadReq.setDownloadTaskType(p0.h);
                if (p0.h == DownloadTask$DownloadTaskType.PRE_DOWNLOAD && p0.i != null) {
                   uDownloadReq.setDownloadHostType(6);
                }
                objArray = uDownloadReq;
             }
          }
       }
       if (objArray == null) {
          b.Z(LiveLogTag.LIVE_DOWNLOAD_UTILS, "nextDownloadRequest is null");
          oh.resumeWith(Result.constructor-impl(p0));
       }else {
          b[] uobArray = new b[i];
          uobArray[0] = new LiveControlFileDownloadProducer$c(uBooleanRef, oh, p0, p1);
          DownloadManager.n().E(objArray, uobArray);
       }
       p0 = oh.b();
       if (p0 == b.h()) {
          e.c(p2);
       }
       return p0;
    }
    public final Object g(f p0,LiveControlFileDownloadProducer$a p1,c p2){
       LiveControlFileDownloadProducer$downloadSingleTaskWithRetry$1 uodownloadSi;
       LiveControlFileDownloadProducer$downloadSingleTaskWithRetry$1 l$1;
       LiveControlFileDownloadProducer$downloadSingleTaskWithRetry$1 l$0;
       if (p2 instanceof LiveControlFileDownloadProducer$downloadSingleTaskWithRetry$1) {
          uodownloadSi = p2;
          LiveControlFileDownloadProducer$downloadSingleTaskWithRetry$1 label = uodownloadSi.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             uodownloadSi.label = label - i;
          label_0018 :
             LiveControlFileDownloadProducer$downloadSingleTaskWithRetry$1 result = uodownloadSi.result;
             Object obj = b.h();
             LiveControlFileDownloadProducer$downloadSingleTaskWithRetry$1 label1 = uodownloadSi.label;
             if (label1 != null) {
                if (label1 != 1) {
                   if (label1 == 2) {
                      l$1 = uodownloadSi.L$1;
                      l$0 = uodownloadSi.L$0;
                      j0.n(result);
                   }else {
                      throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                   }
                }else {
                   l$1 = uodownloadSi.L$1;
                   j0.n(result);
                   result = uodownloadSi.L$2;
                   l$0 = uodownloadSi.L$0;
                label_0067 :
                   if (!l$0.d(l$1)) {
                      uodownloadSi.L$0 = l$0;
                      uodownloadSi.L$1 = l$1;
                      uodownloadSi.L$2 = result;
                      uodownloadSi.label = 2;
                      if (l$0.f(l$1, result, uodownloadSi) == obj) {
                         return obj;
                      }
                   }
                }
             }else {
                j0.n(result);
                uodownloadSi.L$0 = this;
                uodownloadSi.L$1 = p0;
                uodownloadSi.L$2 = p1;
                uodownloadSi.label = 1;
                if (this.f(p0, p1, uodownloadSi) == obj) {
                   return obj;
                }else {
                   result = p1;
                   l$0 = this;
                   goto label_0067 ;
                }
             }
             return a.a(l$0.d(l$1));
          }
       }
       uodownloadSi = new LiveControlFileDownloadProducer$downloadSingleTaskWithRetry$1(this, p2);
       goto label_0018 ;
    }
    public CoroutineContext getCoroutineContext(){
       Object obj = PatchProxy.apply(null, this, LiveControlFileDownloadProducer.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return z0.g().plus(new LiveControlFileDownloadProducer$b(CoroutineExceptionHandler.u0));
    }
}
