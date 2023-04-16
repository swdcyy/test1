package mx0.a;
import io.reactivex.g;
import java.lang.String;
import java.lang.Object;
import brd.v;
import mx0.d;
import mx0.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.net.Uri;
import ekd.w0;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.common.Priority;
import kb.c;
import android.os.AsyncTask;
import kb.e;
import java.util.concurrent.Executor;

public final class a implements g	// class@003236
{
    public final String b;

    public void a(String p0){
       this.b = p0;
    }
    public final void subscribe(v p0){
       a tb = this.b;
       d uod = new d(p0, tb);
       if (PatchProxy.applyVoidTwoRefs(tb, uod, null, e.class, "3")) {
       }else {
          Fresco.getImagePipeline().prefetchToDiskCache(ImageRequestBuilder.k(w0.f(tb)).a(), null, Priority.HIGH).f(uod, AsyncTask.THREAD_POOL_EXECUTOR);
       }
       return;
    }
}
