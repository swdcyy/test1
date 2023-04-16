package ie0.e;
import io.reactivex.g;
import s0d.e;
import java.lang.String;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.drawee.backends.pipeline.Fresco;
import ie0.e$a;
import com.facebook.imagepipeline.request.ImageRequest;
import dd.d;
import kb.c;

public final class e implements g	// class@0028a4
{
    public final e b;
    public final String c;

    public void e(e p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       a.p(p0, "emitter");
       Fresco.getImagePipeline().prefetchToDiskCache(this.b, null, new e$a(this, p0));
       return;
    }
}
