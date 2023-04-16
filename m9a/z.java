package m9a.z;
import erd.g;
import com.yxcorp.gifshow.detail.util.e$a;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.drawee.backends.pipeline.Fresco;
import android.net.Uri;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import uc.d;
import com.facebook.imagepipeline.request.ImageRequest;
import kb.c;
import com.yxcorp.gifshow.detail.util.d;
import android.os.AsyncTask;
import kb.e;
import java.util.concurrent.Executor;

public final class z implements g	// class@002f9d
{
    public final e$a b;
    public final Context c;

    public void z(e$a p0,Context p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       z tb = this.b;
       p0 = ImageRequestBuilder.k(Uri.parse(p0));
       p0.v(new d(150, 150));
       p0 = Fresco.getImagePipeline().fetchDecodedImage(p0.a(), null);
       tb.c = p0;
       p0.f(new d(this.c, tb), AsyncTask.THREAD_POOL_EXECUTOR);
    }
}
