package com.kuaishou.live.common.core.basic.tools.g$c$a;
import com.yxcorp.download.k;
import com.kuaishou.live.common.core.basic.tools.g$c;
import com.yxcorp.download.DownloadTask;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.basic.tools.i;
import java.lang.Runnable;
import e93.f;
import java.lang.Throwable;
import va1.r;
import java.lang.Long;
import va1.q;
import va1.p;

public class g$c$a extends k	// class@000ef0
{
    public final g$c c;

    public void g$c$a(g$c p0){
       this.c = p0;
       super();
    }
    public void c(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$c$a.class, "2")) {
          return;
       }
       f.h("LiveDownload.completed", new i(this, p0));
       return;
    }
    public void e(DownloadTask p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g$c$a.class, "3")) {
          return;
       }
       f.h("LiveDownload.error", new r(this, p1));
       return;
    }
    public void k(DownloadTask p0,long p1,long p2){
       if (PatchProxy.isSupport(g$c$a.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, g$c$a.class, "4")) {
          return;
       }
       q oq = new q(this, p0, p1, p2);
       f.h("LiveDownload.progress", v0);
       return;
    }
    public void o(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$c$a.class, "1")) {
          return;
       }
       f.h("LiveDownload.started", new p(this, p0));
       return;
    }
}
