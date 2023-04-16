package a0c.c$a;
import io.reactivex.g;
import java.io.File;
import jd.c;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.net.Uri;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import uc.d;
import com.facebook.imagepipeline.request.ImageRequest;
import a0c.c$a$a;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.yxcorp.image.fresco.wrapper.a;

public final class c$a implements g	// class@000009
{
    public final File b;
    public final c c;
    public final int d;
    public final int e;

    public void c$a(File p0,c p1,int p2,int p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "1")) {
          return;
       }
       a.p(p0, "emitter");
       ImageRequestBuilder imageRequest = ImageRequestBuilder.k(Uri.fromFile(this.b));
       imageRequest.r(this.c);
       if (this.d > null && this.e > null) {
          a.o(imageRequest, "imageRequestBuilder");
          imageRequest.v(new d(this.d, this.e));
       }
       a.d(imageRequest.a(), new c$a$a(this, p0));
       return;
    }
}
