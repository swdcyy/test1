package com.yxcorp.download.DownloadDispatcher$a;
import com.yxcorp.download.k;
import com.yxcorp.download.DownloadDispatcher;
import com.yxcorp.download.DownloadTask;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Throwable;
import java.lang.Long;

public class DownloadDispatcher$a extends k	// class@0011a5
{
    public final DownloadDispatcher c;

    public void DownloadDispatcher$a(DownloadDispatcher p0){
       this.c = p0;
       super();
    }
    public void b(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DownloadDispatcher$a.class, "5")) {
          return;
       }
       this.c.g(p0);
       return;
    }
    public void c(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DownloadDispatcher$a.class, "1")) {
          return;
       }
       this.c.g(p0);
       return;
    }
    public void e(DownloadTask p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DownloadDispatcher$a.class, "4")) {
          return;
       }
       this.c.g(p0);
       return;
    }
    public void i(DownloadTask p0,long p1,long p2){
       if (PatchProxy.isSupport(DownloadDispatcher$a.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, DownloadDispatcher$a.class, "3")) {
          return;
       }
       this.c.e(p0);
       return;
    }
    public void o(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DownloadDispatcher$a.class, "2")) {
          return;
       }
       this.c.f(p0);
       return;
    }
}
