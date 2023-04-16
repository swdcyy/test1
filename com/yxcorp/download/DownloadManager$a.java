package com.yxcorp.download.DownloadManager$a;
import com.yxcorp.download.k;
import com.yxcorp.download.DownloadManager;
import com.yxcorp.download.DownloadTask;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Throwable;
import com.yxcorp.download.DownloadConfig;

public class DownloadManager$a extends k	// class@0011a8
{
    public final DownloadManager c;

    public void DownloadManager$a(DownloadManager p0){
       this.c = p0;
       super();
    }
    public void b(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DownloadManager$a.class, "2")) {
          return;
       }
       this.c.d(p0);
       return;
    }
    public void c(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DownloadManager$a.class, "1")) {
          return;
       }
       this.c.d(p0);
       return;
    }
    public void e(DownloadTask p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DownloadManager$a.class, "3")) {
          return;
       }
       if (DownloadManager.h.k == null && p0.getNotificationVisibility()) {
          return;
       }
       this.c.d(p0);
       return;
    }
}
