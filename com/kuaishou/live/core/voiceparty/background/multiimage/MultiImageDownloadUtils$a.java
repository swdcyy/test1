package com.kuaishou.live.core.voiceparty.background.multiimage.MultiImageDownloadUtils$a;
import com.kuaishou.live.common.core.basic.tools.g$a;
import asd.c;
import java.lang.Object;
import com.yxcorp.download.DownloadTask;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import qrd.l1;
import kotlin.Result;
import java.lang.Throwable;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import java.io.IOException;
import qrd.j0;

public final class MultiImageDownloadUtils$a implements g$a	// class@00135f
{
    public boolean a;
    public final c b;

    public void MultiImageDownloadUtils$a(c p0){
       this.b = p0;
       super();
    }
    public void a(DownloadTask p0,long p1,long p2){
    }
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MultiImageDownloadUtils$a.class, "1")) {
          return;
       }
       if (this.a == null) {
          this.a = true;
          b.c0(LiveLogTag.LIVE_VOICE_PARTY, "bg download onComplete", "file", p0);
          this.b.resumeWith(Result.constructor-impl(l1.a));
       }
       return;
    }
    public void c(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MultiImageDownloadUtils$a.class, "3")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_VOICE_PARTY, "bg download onStart");
       return;
    }
    public void d(Throwable p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MultiImageDownloadUtils$a.class, "2")) {
          return;
       }
       a.p(p0, "throwable");
       a.p(p1, "failReason");
       if (this.a == null) {
          this.a = true;
          b.k0(LiveLogTag.LIVE_VOICE_PARTY, "bg download error "+p1, p0);
          this.b.resumeWith(Result.constructor-impl(j0.a(new IOException(p0))));
       }
       return;
    }
}
