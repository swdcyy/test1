package com.kuaishou.live.redpacket.feature.common.popup.skin.prefetch.downloader.c;
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
import java.lang.Integer;
import brd.t;
import java.util.concurrent.TimeUnit;
import wo3.b;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;

public class c extends b	// class@000f48
{
    public final a a;
    public final long b;
    public final ImageRequest c;
    public final String d;
    public final a$a e;
    public final f f;

    public void c(f p0,a p1,long p2,ImageRequest p3,String p4,a$a p5){
       this.f = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       this.e = p5;
       super();
    }
    public void onFailureImpl(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       c tf = this.f;
       c tb = this.b;
       ResourceDownloadFailType sAVE_FRESCO_ = ResourceDownloadFailType.SAVE_FRESCO_INNER_ERROR;
       int i = (p0 == null)? 0: p0.e();
       tf.d(tb, sAVE_FRESCO_, i, this.e, this.a);
       return;
    }
    public void onNewResultImpl(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       b uob = new b(this, this.a, this.b, this.c, this.d, this.e);
       t.just(Integer.valueOf(1)).take(100, TimeUnit.MILLISECONDS).subscribe(v8, Functions.d());
       return;
    }
}
