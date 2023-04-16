package djc.x0$a;
import djc.x0;
import com.kwai.sharelib.jsshare.StartShareParam$PosterConfig;
import android.graphics.Bitmap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import jp7.a;
import com.yxcorp.image.request.a;
import s0d.e;
import com.yxcorp.image.fresco.wrapper.c;
import com.facebook.imagepipeline.request.ImageRequest;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.yxcorp.image.fresco.wrapper.a;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.BitmapDrawable;
import java.util.concurrent.ExecutionException;
import java.lang.InterruptedException;
import com.kwai.sharelib.model.ShareInitResponse$PanelPoster;
import java.lang.Integer;
import zic.j0;

public final class x0$a	// class@00222a
{

    public static Bitmap a(x0 p0,StartShareParam$PosterConfig p1){
       Bitmap uBitmap1;
       Bitmap uBitmap = null;
       p0 = PatchProxy.applyTwoRefs(p0, p1, uBitmap, x0$a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       a.p(p1, "posterConfig");
       StartShareParam$PosterConfig mPosterImage = p1.mPosterImageBytes;
       String str = null;
       if (mPosterImage != null) {
          mPosterImage = (mPosterImage.length() > 0)? 1: null;
          if (mPosterImage == 1) {
             uBitmap1 = a.a(p1.mPosterImageBytes);
          label_002e :
             if (uBitmap1 == null) {
                StartShareParam$PosterConfig mPosterImage1 = p1.mPosterImageUrl;
                if (mPosterImage1 != null) {
                   if (mPosterImage1.length() > 0) {
                      str = 1;
                   }
                   if (str == 1) {
                      p1 = p1.mPosterImageUrl;
                      a.o(p1, "posterConfig.mPosterImageUrl");
                      e uoe = a.u(p1).q();
                      c uoc = c.w();
                      try{
                         a.d(uoe, uoc);
                         Drawable uDrawable = uoc.q();
                         if (uDrawable != null && uDrawable instanceof BitmapDrawable) {
                            uBitmap1 = uDrawable.getBitmap();
                            if (uBitmap1 != null) {
                               uBitmap = uBitmap1;
                            }
                            uBitmap1 = uBitmap;
                         }
                      }catch(java.lang.InterruptedException e5){
                         e5.printStackTrace();
                      }catch(java.util.concurrent.ExecutionException e5){
                         e5.printStackTrace();
                      }
                   }
                }
             }
          }
       }
       uBitmap1 = uBitmap;
       goto label_002e ;
    }
    public static Bitmap b(x0 p0,ShareInitResponse$PanelPoster p1,int p2){
       if (PatchProxy.isSupport(x0$a.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), null, x0$a.class, "2");
          if (p0 != PatchProxyResult.class) {
             return p0;
          }
       }
       a.p(p1, "panelPoster");
       Bitmap uBitmap = null;
       ShareInitResponse$PanelPoster mQrBytes = p1.mQrBytes;
       if (mQrBytes != null) {
          int i = (!mQrBytes.length)? 1: 0;
          if ((i ^ 1) == 1) {
             uBitmap = a.a(mQrBytes[0]);
          }
       }
       if (uBitmap == null) {
          p1 = p1.mQrShareUrls;
          if (p1 != null) {
             int i1 = (!p1.length)? 1: 0;
             if ((i1 ^ 1) == 1) {
                object oobject = p1[0];
                a.o(oobject, "it");
                uBitmap = j0.a(oobject, p2, 0);
             }
          }
       }
       return uBitmap;
    }
}
