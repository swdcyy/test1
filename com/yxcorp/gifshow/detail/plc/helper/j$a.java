package com.yxcorp.gifshow.detail.plc.helper.j$a;
import v3a.d;
import com.yxcorp.gifshow.detail.plc.helper.j;
import f4a.b0;
import f4a.l;
import com.yxcorp.download.DownloadTask;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.plc.helper.ApkDownloadHelper$a;
import java.lang.Long;

public class j$a extends d	// class@00167d
{
    public final j d;

    public void j$a(j p0,b0 p1){
       this.d = p0;
       super(p1);
       p1.h(false);
    }
    public void c(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j$a.class, "3")) {
          return;
       }
       super.c(p0);
       this.d.c.b();
       return;
    }
    public void i(DownloadTask p0,long p1,long p2){
       if (PatchProxy.isSupport(j$a.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, j$a.class, "1")) {
          return;
       }
       super.i(p0, p1, p2);
       this.d.c.e(p1, p2, 0);
       return;
    }
    public void k(DownloadTask p0,long p1,long p2){
       if (PatchProxy.isSupport(j$a.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, j$a.class, "2")) {
          return;
       }
       this.d.c.c(p1, p2, 0);
       return;
    }
}
