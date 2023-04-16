package ek9.e1;
import io.reactivex.a;
import com.yxcorp.gifshow.comment.g;
import java.lang.String;
import java.lang.Object;
import brd.c;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Exception;
import java.lang.Throwable;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.request.ImageRequest;
import kb.c;
import java.io.File;
import android.net.Uri;
import com.facebook.datasource.a;
import com.facebook.common.references.a;
import eb.f;
import com.facebook.common.memory.PooledByteBuffer;
import java.io.InputStream;
import com.facebook.imageformat.a;
import com.facebook.imageformat.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import android.os.Environment;
import o56.a;
import java.lang.System;
import com.yxcorp.gifshow.comment.utils.a;

public final class e1 implements a	// class@002178
{
    public final g a;
    public final String b;
    public final String c;

    public void e1(g p0,String p1,String p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final void a(c p0){
       e1 ta = this.a;
       e1 tb = this.b;
       e1 tc = this.c;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoidThreeRefs(p0, tb, tc, ta, g.class, "4")) {
       }else if(tb == null && tc == null){
          p0.onError(new Exception());
       }else {
          c uoc = null;
          if (tb != null && !tb.isEmpty()) {
             uoc = Fresco.getImagePipeline().fetchEncodedImage(ImageRequest.c(tb), uoc);
          }else if(tc != null && !tc.isEmpty()){
             uoc = Fresco.getImagePipeline().fetchEncodedImage(ImageRequest.b(Uri.fromFile(new File(tc))), uoc);
          }
          if (uoc == null) {
             p0.onError(new Exception());
          }else {
             a.b(uoc);
             a result = uoc.getResult();
             if (result == null) {
                p0.onError(new Exception());
             }else {
                f uof = new f(result.j());
                result = b.a(uof);
                String str = (result == null)? "": result.a();
                if (result != null && (TextUtils.x(str) || a.c.equals(result))) {
                   p0.onError(new Exception());
                }else if(a.a(uof, Environment.DIRECTORY_PICTURES+File.separator+a.w, "image_download_"+System.currentTimeMillis()+"."+str, "feed_comment_picture_save")){
                   p0.onComplete();
                }else {
                   p0.onError(new Exception("fail to download image"));
                }
             }
             uoc.close();
          }
       }
       return;
    }
}
