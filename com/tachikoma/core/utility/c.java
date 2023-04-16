package com.tachikoma.core.utility.c;
import io.reactivex.i;
import s0d.e;
import java.lang.Object;
import brd.c0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.request.ImageRequest;
import kb.c;
import com.tachikoma.core.utility.c$a;
import android.os.AsyncTask;
import kb.e;
import java.util.concurrent.Executor;

public final class c implements i	// class@000dd7
{
    public final e a;
    public final Object b;

    public void c(e p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(c0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       Fresco.getImagePipeline().fetchDecodedImage(this.a, this.b).f(new c$a(this, p0), AsyncTask.THREAD_POOL_EXECUTOR);
       return;
    }
}
