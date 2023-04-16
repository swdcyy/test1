package com.kuaishou.live.redpacket.feature.common.popup.skin.prefetch.downloader.b;
import kb.b;
import com.kuaishou.live.redpacket.feature.common.popup.skin.prefetch.downloader.f;
import xo3.a;
import com.facebook.imagepipeline.request.ImageRequest;
import java.lang.String;
import com.kuaishou.live.redpacket.feature.common.popup.skin.prefetch.downloader.a$a;
import kb.c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.redpacket.feature.common.popup.skin.prefetch.downloader.ResourceDownloadFailType;
import java.lang.Throwable;
import java.lang.StringBuilder;
import java.lang.System;

public class b extends b	// class@000f47
{
    public final long a;
    public final a b;
    public final ImageRequest c;
    public final String d;
    public final a$a e;
    public final f f;

    public void b(f p0,long p1,a p2,ImageRequest p3,String p4,a$a p5){
       this.f = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       this.e = p5;
       super();
    }
    public void onFailureImpl(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       b tf = this.f;
       b ta = this.a;
       ResourceDownloadFailType sAVE_FRESCO_ = ResourceDownloadFailType.SAVE_FRESCO_INNER_ERROR;
       int i = (p0 == null)? 0: p0.e();
       tf.d(ta, sAVE_FRESCO_, i, this.e, this.b);
       return;
    }
    public void onNewResultImpl(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       this.f.h("prefetchToDiskCache success , costTime: "+(System.currentTimeMillis() - this.a)+", mEnableCdnTransform: "+this.f.e+", config: "+this.b.toString());
       this.f.i(this.a, this.c, this.d, this.e, this.b);
       return;
    }
}
