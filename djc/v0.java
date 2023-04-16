package djc.v0;
import io.reactivex.g;
import com.yxcorp.gifshow.share.widget.ForwordPosterFragment;
import java.lang.Object;
import brd.v;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.sharelib.jsshare.StartShareParam$JsShareParam;
import java.util.Objects;
import android.graphics.Bitmap;
import djc.x0;
import com.kwai.sharelib.jsshare.StartShareParam$PosterConfig;
import djc.x0$a;
import java.lang.Throwable;
import brd.g;
import qsd.d;
import lnc.a1;
import java.lang.Double;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment;
import java.lang.Integer;
import com.kwai.sharelib.model.ShareInitResponse$PanelPoster;
import android.graphics.Bitmap$Config;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Paint;

public final class v0 implements g	// class@002226
{
    public final ForwordPosterFragment b;
    public final int c;
    public final int d;

    public void v0(ForwordPosterFragment p0,int p1,int p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void subscribe(v p0){
       float f;
       double d;
       Bitmap uBitmap1;
       Object obj = this;
       Object obj1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, v0.class, "1")) {
          return;
       }
       a.p(obj1, "emitter");
       v0 b = obj.b;
       StartShareParam$JsShareParam mPosterConfi = ForwordPosterFragment.hi(b).mPosterConfig;
       a.o(mPosterConfi, "jsParam.mPosterConfig");
       Objects.requireNonNull(b);
       Bitmap uBitmap = PatchProxy.applyOneRefs(mPosterConfi, b, ForwordPosterFragment.class, "6");
       if (uBitmap != patchProxyRe) {
       }else {
          a.p(mPosterConfi, "posterConfig");
          uBitmap = x0$a.a(b, mPosterConfi);
       }
       if (uBitmap == null) {
          obj1.onError(new Throwable("no posterBitmap"));
       }else {
          int width = uBitmap.getWidth();
          int height = uBitmap.getHeight();
          if (obj.c > null && obj.d > null) {
             if (ForwordPosterFragment.hi(obj.b).mPosterConfig.mPosterShowType == null) {
                f = (float)obj.c / (float)width;
                width = d.H0(((float)uBitmap.getWidth() * f));
                height = d.H0(((float)uBitmap.getHeight() * f));
             }else {
                v0 c = obj.c;
                v0 d1 = obj.d;
                float f1 = (float)width;
                f = (float)height;
                f1 = (((float)c / (float)d1) - (f1 / f) >= 0)? (float)d1 / f: (float)c / f1;
                height = d.H0(((float)uBitmap.getHeight() * f1));
                width = d.H0(((float)uBitmap.getWidth() * f1));
             }
          }
          int i = a1.d(R.dimen.arg_RES_7f070d53);
          d = (double)0;
          if (Double.compare(ForwordPosterFragment.hi(obj.b).mPosterConfig.mQrImageRelativeWidth, d) > 0 && Double.compare(ForwordPosterFragment.hi(obj.b).mPosterConfig.mQrImageRelativeWidth, (double)1) < 0) {
             i = d.G0(((double)width * ForwordPosterFragment.hi(obj.b).mPosterConfig.mQrImageRelativeWidth));
          }
          v0 b1 = obj.b;
          ForwardGridSectionFragment h = b1.H;
          if (h != null) {
             Objects.requireNonNull(b1);
             if (PatchProxy.isSupport(ForwordPosterFragment.class)) {
                uBitmap1 = PatchProxy.applyTwoRefs(h, Integer.valueOf(i), b1, ForwordPosterFragment.class, "7");
                if (uBitmap1 != patchProxyRe) {
                }
             }
             a.p(h, "panelPoster");
             uBitmap1 = x0$a.b(b1, h, i);
          }else {
             uBitmap1 = null;
          }
          if (uBitmap1 == null) {
             obj1.onError(new Throwable("no qrCodeBitmap"));
          }else {
             int height1 = uBitmap1.getHeight();
             if (Double.compare(ForwordPosterFragment.hi(obj.b).mPosterConfig.mQrImageAspectRatio, d) > 0) {
                height1 = d.G0(((double)i / ForwordPosterFragment.hi(obj.b).mPosterConfig.mQrImageAspectRatio));
             }
             Bitmap uBitmap2 = Bitmap.createBitmap(width, height, uBitmap1.getConfig());
             Canvas uCanvas = new Canvas(uBitmap2);
             width = d.G0(((double)width * ForwordPosterFragment.hi(obj.b).mPosterConfig.mQrImageRelativeX));
             height = d.G0(((double)height * ForwordPosterFragment.hi(obj.b).mPosterConfig.mQrImageRelativeY));
             Rect rect = new Rect(width, height, (i + width), (height1 + height));
             uCanvas.drawBitmap(uBitmap, null, new Rect(0, 0, width, height), obj.b.d1);
             uCanvas.drawBitmap(uBitmap1, null, rect, obj.b.d1);
             if (uBitmap2 != null) {
                obj1.onNext(uBitmap2);
             }
             p0.onComplete();
          }
       }
       return;
    }
}
