package com.kuaishou.live.common.core.basic.resource.controlfiles.producer.LiveControlFileDownloadProducer$c;
import com.yxcorp.download.k;
import kotlin.jvm.internal.Ref$BooleanRef;
import asd.c;
import ja1.f;
import com.kuaishou.live.common.core.basic.resource.controlfiles.producer.LiveControlFileDownloadProducer$a;
import com.yxcorp.download.DownloadTask;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.Result;
import java.lang.Throwable;
import java.lang.Long;
import java.lang.System;

public final class LiveControlFileDownloadProducer$c extends k	// class@000ec7
{
    public final Ref$BooleanRef c;
    public final c d;
    public final f e;
    public final LiveControlFileDownloadProducer$a f;

    public void LiveControlFileDownloadProducer$c(Ref$BooleanRef p0,c p1,f p2,LiveControlFileDownloadProducer$a p3){
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       super();
    }
    public void c(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, LiveControlFileDownloadProducer$c.class, "2")) {
          return;
       }
       if (this.c.element != null) {
          PatchProxy.onMethodExit(LiveControlFileDownloadProducer$c.class, "2");
          return;
       }else {
          this.e.j(true);
          LiveControlFileDownloadProducer$c te = this.e;
          String tarFilePath = (p0 != null)? p0.getTargetFilePath(): null;
          te.j = tarFilePath;
          this.d.resumeWith(Result.constructor-impl(this.e));
          tarFilePath.element = true;
          PatchProxy.onMethodExit(LiveControlFileDownloadProducer$c.class, "2");
          return;
       }
    }
    public void e(DownloadTask p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, LiveControlFileDownloadProducer$c.class, "3")) {
          return;
       }
       if (this.c.element != null) {
          PatchProxy.onMethodExit(LiveControlFileDownloadProducer$c.class, "3");
          return;
       }else {
          this.e.j(false);
          this.e.i("downloadError");
          this.d.resumeWith(Result.constructor-impl(this.e));
          p0.element = true;
          PatchProxy.onMethodExit(LiveControlFileDownloadProducer$c.class, "3");
          return;
       }
    }
    public void k(DownloadTask p0,long p1,long p2){
       if (PatchProxy.isSupport2(LiveControlFileDownloadProducer$c.class, "4") && PatchProxy.applyVoidThreeRefsWithListener(p0, Long.valueOf(p1), Long.valueOf(p2), this, LiveControlFileDownloadProducer$c.class, "4")) {
          return;
       }
       LiveControlFileDownloadProducer$c tf = this.f;
       if (tf != null) {
          tf.a(p0, p1, p2);
       }
       p0.q = p2;
       PatchProxy.onMethodExit(LiveControlFileDownloadProducer$c.class, "4");
       return;
    }
    public void o(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, LiveControlFileDownloadProducer$c.class, "1")) {
          return;
       }
       p0.r = System.currentTimeMillis();
       PatchProxy.onMethodExit(LiveControlFileDownloadProducer$c.class, "1");
       return;
    }
}
