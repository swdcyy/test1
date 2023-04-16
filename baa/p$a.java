package baa.p$a;
import io.reactivex.g;
import java.lang.String;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.facebook.imagepipeline.request.ImageRequest;
import baa.e;
import kb.c;
import nsd.u;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.drawee.backends.pipeline.Fresco;
import baa.p$a$a;
import dd.d;
import brd.g;
import baa.p;

public final class p$a implements g	// class@000440
{
    public final String b;

    public void p$a(String p0){
       this.b = p0;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p$a.class, "1")) {
          return;
       }
       a.p(p0, "emitter");
       p$a tb = this.b;
       if (tb != null) {
          e uoe = new e(null, 1, null);
          uoe.a = Fresco.getImagePipeline().prefetchToDiskCache(ImageRequest.c(tb), null, new p$a$a(uoe, p0));
       }else {
          p.a(p0);
       }
       return;
    }
}
