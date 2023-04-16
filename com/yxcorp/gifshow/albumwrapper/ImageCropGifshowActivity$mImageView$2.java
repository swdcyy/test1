package com.yxcorp.gifshow.albumwrapper.ImageCropGifshowActivity$mImageView$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.albumwrapper.ImageCropGifshowActivity;
import com.yxcorp.gifshow.image.KwaiZoomImageView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import android.app.Activity;

public final class ImageCropGifshowActivity$mImageView$2 extends Lambda implements a	// class@001b52
{
    public final ImageCropGifshowActivity this$0;

    public void ImageCropGifshowActivity$mImageView$2(ImageCropGifshowActivity p0){
       this.this$0 = p0;
       super(0);
    }
    public final KwaiZoomImageView invoke(){
       Object obj = PatchProxy.apply(null, this, ImageCropGifshowActivity$mImageView$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.this$0.findViewById(0x7f0a1365);
    }
    public Object invoke(){
       return this.invoke();
    }
}
