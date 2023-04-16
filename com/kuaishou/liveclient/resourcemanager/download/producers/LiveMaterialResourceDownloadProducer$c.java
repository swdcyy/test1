package com.kuaishou.liveclient.resourcemanager.download.producers.LiveMaterialResourceDownloadProducer$c;
import com.yxcorp.download.k;
import kotlin.jvm.internal.Ref$BooleanRef;
import asd.c;
import com.kuaishou.liveclient.resourcemanager.download.task.LiveMaterialResourceDownloadTask;
import com.yxcorp.download.DownloadTask;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import java.lang.Boolean;
import kotlin.Result;
import java.lang.Throwable;
import com.yxcorp.retrofit.model.KwaiException;
import java.lang.Long;

public final class LiveMaterialResourceDownloadProducer$c extends k	// class@001077
{
    public final Ref$BooleanRef c;
    public final c d;
    public final LiveMaterialResourceDownloadTask e;

    public void LiveMaterialResourceDownloadProducer$c(Ref$BooleanRef p0,c p1,LiveMaterialResourceDownloadTask p2){
       this.c = p0;
       this.d = p1;
       this.e = p2;
       super();
    }
    public void c(DownloadTask p0){
       String tarFilePath;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, LiveMaterialResourceDownloadProducer$c.class, "1")) {
          return;
       }
       if (this.c.element != null) {
          PatchProxy.onMethodExit(LiveMaterialResourceDownloadProducer$c.class, "1");
          return;
       }else if(p0 != null){
          tarFilePath = p0.getTargetFilePath();
       }else {
          tarFilePath = null;
       }
       Result$a uoa = 1;
       LiveMaterialResourceDownloadProducer$c uoc = (tarFilePath == null || !tarFilePath.length())? 1: null;
       if (uoc) {
          this.d.resumeWith(Result.constructor-impl(Boolean.FALSE));
          PatchProxy.onMethodExit(LiveMaterialResourceDownloadProducer$c.class, "1");
          return;
       }else {
          uoc = this.e;
          uoc.i = tarFilePath;
          uoc.m(p0.getSoFarBytes());
          this.e.l(p0.getCostTime());
          this.d.resumeWith(Result.constructor-impl(Boolean.TRUE));
          p0.element = uoa;
          PatchProxy.onMethodExit(LiveMaterialResourceDownloadProducer$c.class, "1");
          return;
       }
    }
    public void e(DownloadTask p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, LiveMaterialResourceDownloadProducer$c.class, "3")) {
          return;
       }
       if (this.c.element != null) {
          PatchProxy.onMethodExit(LiveMaterialResourceDownloadProducer$c.class, "3");
          return;
       }else {
          this.e.k("DOWN_LOAD_FAILED", p1);
          LiveMaterialResourceDownloadProducer$c te = this.e;
          long costTime = (p0 != null)? p0.getCostTime(): 0;
          te.l(costTime);
          if (p1 instanceof KwaiException) {
             p0.k = String.valueOf(p1.getErrorCode());
          }
          this.d.resumeWith(Result.constructor-impl(Boolean.FALSE));
          p0.element = true;
          PatchProxy.onMethodExit(LiveMaterialResourceDownloadProducer$c.class, "3");
          return;
       }
    }
    public void k(DownloadTask p0,long p1,long p2){
       if (PatchProxy.isSupport2(LiveMaterialResourceDownloadProducer$c.class, "2") && PatchProxy.applyVoidThreeRefsWithListener(p0, Long.valueOf(p1), Long.valueOf(p2), this, LiveMaterialResourceDownloadProducer$c.class, "2")) {
          return;
       }
       this.e.m(p1);
       PatchProxy.onMethodExit(LiveMaterialResourceDownloadProducer$c.class, "2");
       return;
    }
}
