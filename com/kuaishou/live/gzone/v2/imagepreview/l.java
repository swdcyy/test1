package com.kuaishou.live.gzone.v2.imagepreview.l;
import io.reactivex.g;
import com.facebook.imagepipeline.request.ImageRequest;
import java.lang.String;
import java.lang.Object;
import brd.v;
import a63.q;
import com.kuaishou.live.gzone.v2.imagepreview.n;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.drawee.backends.pipeline.Fresco;
import kb.c;
import a63.u;
import com.yxcorp.image.fresco.wrapper.a$g;
import android.os.AsyncTask;
import kb.e;
import java.util.concurrent.Executor;

public final class l implements g	// class@001cd1
{
    public final ImageRequest b;
    public final String c;
    public final boolean d;

    public void l(ImageRequest p0,String p1,boolean p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void subscribe(v p0){
       l tb = this.b;
       l tc = this.c;
       l td = this.d;
       q oq = new q(p0);
       if (!PatchProxy.isSupport(n.class) || !PatchProxy.applyVoidFourRefs(tb, tc, Boolean.valueOf(td), oq, null, n.class, "22")) {
          c uoc = Fresco.getImagePipeline().fetchEncodedImage(tb, null);
          uoc.f(new u(oq, uoc, td, tc), AsyncTask.THREAD_POOL_EXECUTOR);
       }
       return;
    }
}
