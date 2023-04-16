package ek9.b;
import io.reactivex.a;
import ek9.e;
import com.kwai.emotionsdk.bean.EmotionInfo;
import java.lang.Object;
import brd.c;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Exception;
import java.lang.Throwable;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.request.ImageRequest;
import kb.c;
import com.facebook.datasource.a;
import com.facebook.common.references.a;
import eb.f;
import com.facebook.common.memory.PooledByteBuffer;
import java.io.InputStream;
import com.facebook.imageformat.a;
import com.facebook.imageformat.b;
import java.lang.StringBuilder;
import android.os.Environment;
import java.io.File;
import o56.a;
import java.lang.System;
import com.yxcorp.gifshow.comment.utils.a;

public final class b implements a	// class@002170
{
    public final e a;
    public final EmotionInfo b;

    public void b(e p0,EmotionInfo p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(c p0){
       CDNUrl mUrl;
       b ta = this.a;
       b tb = this.b;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoidTwoRefs(p0, tb, ta, e.class, "4")) {
       }else {
          Exception uException = null;
          if (tb != null && !q.f(tb.mEmotionImageBigUrl)) {
             Iterator iterator = tb.mEmotionImageBigUrl.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   CDNUrl uCDNUrl = iterator.next();
                   if (!TextUtils.x(uCDNUrl.mUrl)) {
                      mUrl = uCDNUrl.mUrl;
                   label_003c :
                      if (mUrl == null) {
                         p0.onError(new Exception());
                         break ;
                      }else {
                         c uoc = Fresco.getImagePipeline().fetchEncodedImage(ImageRequest.c(mUrl), uException);
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
                            }else if(a.a(uof, Environment.DIRECTORY_PICTURES+File.separator+a.w, "emotion_download_"+System.currentTimeMillis()+"."+str, "feed_comment_emotion_save")){
                               p0.onComplete();
                            }else {
                               p0.onError(new Exception("fail to download emotion"));
                            }
                         }
                         uoc.close();
                         break ;
                      }
                   }
                }
             }
          }
          mUrl = uException;
          goto label_003c ;
       }
       return;
    }
}
