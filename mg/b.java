package mg.b;
import android.app.Activity;
import com.kwai.feature.post.api.feature.bridge.JsDeleteCacheVideoByPhotoIdParams;
import f55.g;
import og.l;
import java.lang.Object;
import java.lang.String;
import q87.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.os.Bundle;
import wkd.b;
import j80.c;
import java.io.File;
import lnc.d4;
import java.lang.StringBuilder;
import w46.b;
import com.yxcorp.gifshow.webview.bridge.JsSuccessResult;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import java.lang.Exception;

public class b	// class@0025d4
{

    public static void a(Activity p0,JsDeleteCacheVideoByPhotoIdParams p1,g p2){
       int i;
       boolean b;
       Object[] objArray = new Object[0];
       l.D().w("JsDelCacheVideo", "deleteCacheVideoByPhotoId", objArray);
       if (TextUtils.x(p1.mPhotoId)) {
          p2.a(0x1e84f, "mPhotoId is empty", null);
          return;
       }else {
          File uFile = new File(b.a(-1504323719).c(".video_cache"), d4.a(p1.mPhotoId));
          try{
             i = -1;
             Object[] objArray1 = new Object[0];
             l.D().w("JsDelCacheVideo", "deleteCacheVideoByPhotoId\(\) called with: gifshowActivity = ["+p0+"], params = ["+p1+"] photoID:"+p1.mPhotoId, objArray1);
             objArray1 = new Object[0];
             l.D().w("JsDelCacheVideo", "delete file is : dest"+uFile.getAbsolutePath(), objArray1);
             if (uFile.exists() && uFile.isFile()) {
                b = uFile.delete();
                objArray1 = new Object[0];
                l.D().w("JsDelCacheVideo", "deleteCacheVideoByPhotoId result "+b, objArray1);
                if (!b) {
                   Object[] objArray2 = new Object[0];
                   l.D().t("JsDelCacheVideo", "deleteCacheVideoByPhotoId result "+b+"photoID:"+p1.mPhotoId, objArray2);
                   p2.a(i, "delete file failed", null);
                }else {
                   p2.onSuccess(new JsSuccessResult());
                }
             }else {
                p2.onSuccess(new JsSuccessResult());
             }
          }catch(java.lang.SecurityException e9){
             l.D().e("JsDelCacheVideo", "SecurityException", e9);
             p2.a(i, "SecurityException exception", null);
          }catch(java.lang.Exception e9){
             PostUtils.D("JsDelCacheVideo", "delete File failed", e9);
             p2.a(i, "IO exception "+e9.getMessage(), null);
          }
          return;
       }
    }
}
