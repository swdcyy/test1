package be8.n;
import io.reactivex.g;
import java.lang.String;
import java.lang.Object;
import brd.v;
import be8.r;
import com.mini.utils.h;
import android.graphics.Bitmap;
import com.mini.utils.FrescoImageUtils;
import brd.g;
import java.lang.Throwable;
import android.net.Uri;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.drawee.backends.pipeline.Fresco;
import android.app.Application;
import zi8.p;
import kb.c;
import be8.q;
import ya.i;
import kb.e;
import java.util.concurrent.Executor;

public final class n implements g	// class@00033b
{
    public final String b;

    public void n(String p0){
       this.b = p0;
    }
    public final void subscribe(v p0){
       n tb = this.b;
       if (r.b(tb)) {
          if (!h.c()) {
             p0.onNext(FrescoImageUtils.a(tb));
             p0.onComplete();
          }else {
             Fresco.getImagePipeline().fetchDecodedImage(ImageRequest.b(Uri.parse(tb)), p.a()).f(new q(p0), i.d());
          }
       }
       return;
    }
}
