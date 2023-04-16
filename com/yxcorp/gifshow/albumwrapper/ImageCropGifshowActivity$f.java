package com.yxcorp.gifshow.albumwrapper.ImageCropGifshowActivity$f;
import java.lang.Runnable;
import com.yxcorp.gifshow.albumwrapper.ImageCropGifshowActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import e17.i;
import crd.b;

public final class ImageCropGifshowActivity$f implements Runnable	// class@001b4e
{
    public final ImageCropGifshowActivity b;

    public void ImageCropGifshowActivity$f(ImageCropGifshowActivity p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, ImageCropGifshowActivity$f.class, "1")) {
          return;
       }
       this.b.v3();
       i.a(R.style.arg_RES_7f110668, 0x7f1043cb);
       ImageCropGifshowActivity y = this.b.Y;
       if (y != null) {
          y.dispose();
       }
       this.b.Y = null;
       return;
    }
}
