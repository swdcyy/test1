package com.kuaishou.live.redpacket.feature.common.popup.skin.prefetch.downloader.e;
import com.yxcorp.image.fresco.wrapper.a$h;
import com.kuaishou.live.redpacket.feature.common.popup.skin.prefetch.downloader.f;
import com.kuaishou.live.redpacket.feature.common.popup.skin.prefetch.downloader.a$a;
import xo3.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.redpacket.feature.common.popup.skin.prefetch.downloader.ResourceDownloadFailType;
import java.lang.Boolean;
import java.lang.RuntimeException;

public class e implements a$h	// class@000f4a
{
    public final long a;
    public final a$a b;
    public final a c;
    public final String d;
    public final f e;

    public void e(f p0,long p1,a$a p2,a p3,String p4){
       this.e = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       super();
    }
    public void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       this.e.d(this.a, ResourceDownloadFailType.DOWNLOAD_FRESCO_INNER_ERROR, p0, this.b, this.c);
       return;
    }
    public void onResult(boolean p0){
       e uoe = this;
       e uoe1 = e.class;
       if (PatchProxy.isSupport(uoe1) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoe1, "2")) {
          return;
       }
       if (p0) {
          uoe.e.e("download success", uoe.a, uoe.d, uoe.b, uoe.c);
       }else {
          uoe.e.d(uoe.a, ResourceDownloadFailType.DOWNLOAD_FRESCO_INNER_ERROR, new RuntimeException("fresco internal error."), uoe.b, uoe.c);
       }
       return;
    }
}
