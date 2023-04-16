package com.yxcorp.gifshow.albumwrapper.ImageCropGifshowActivity$e;
import kxa.c$a;
import com.yxcorp.gifshow.albumwrapper.ImageCropGifshowActivity;
import java.lang.Object;
import android.graphics.RectF;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.albumwrapper.ImageCropGifshowActivity$d;
import android.graphics.Matrix;

public final class ImageCropGifshowActivity$e implements c$a	// class@001b4d
{
    public final ImageCropGifshowActivity a;

    public void ImageCropGifshowActivity$e(ImageCropGifshowActivity p0){
       this.a = p0;
       super();
    }
    public RectF a(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ImageCropGifshowActivity$e uoe = ImageCropGifshowActivity$e.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, uoe, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       RectF rectF = PatchProxy.apply(objArray, this, uoe, "1");
       if (rectF != patchProxyRe) {
       }else {
          RectF rectF1 = this.a.U0.a();
          rectF = new RectF(rectF1);
          Matrix matrix = new Matrix();
          float f = (float)2;
          matrix.postScale(0x3faaaaab, 0x3f400000, (rectF1.left + (rectF1.width() / f)), (rectF1.top + (rectF1.height() / f)));
          matrix.mapRect(rectF);
       }
       return rectF;
    }
}
