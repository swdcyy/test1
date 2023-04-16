package com.yxcorp.gifshow.albumwrapper.ImageCropGifshowActivity$h;
import erd.g;
import com.yxcorp.gifshow.albumwrapper.ImageCropGifshowActivity;
import android.graphics.Bitmap;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.net.Uri;
import x79.g;
import com.albinmathew.photocrop.cropoverlay.CropOverlayView;
import android.graphics.Rect;
import com.yxcorp.gifshow.albumcontrol.a;
import android.content.ContentResolver;
import android.content.Intent;
import android.app.Activity;
import gp.a;
import com.yxcorp.gifshow.albumwrapper.ImageCropGifshowActivity$a;
import java.lang.Throwable;
import q87.c;
import java.lang.Runnable;
import android.os.Handler;
import crd.b;

public final class ImageCropGifshowActivity$h implements g	// class@001b50
{
    public final ImageCropGifshowActivity b;
    public final Bitmap c;
    public final Bundle d;

    public void ImageCropGifshowActivity$h(ImageCropGifshowActivity p0,Bitmap p1,Bundle p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ImageCropGifshowActivity$h.class, "1")) {
       }else {
          a.o(p0, "success");
          if (p0.booleanValue()) {
             p0 = this.b.Z;
             if (p0 != null) {
                ImageCropGifshowActivity h = this.b.H;
                a.m(h);
                p0.c(this.c.getWidth(), this.c.getHeight(), h);
             }
          }else {
             p0 = this.d;
             CropOverlayView uCropOverlay = this.b.y3();
             Rect imageBounds = (uCropOverlay != null)? uCropOverlay.getImageBounds(): null;
             String str = imageBounds.toString();
             String str1 = "rect";
             try{
                p0.putString(str1, str);
                ImageCropGifshowActivity j = this.b.J;
                a.m(j);
                this.b.setResult(-1, new Intent().setAction(a.b.e("post_image_crop", j, this.c, "Cropped", "Cropped")).putExtras(this.d));
             }catch(java.lang.Exception e10){
                a.C().e(ImageCropGifshowActivity.a1.a(), "store image fail, continue anyway", e10);
                ImageCropGifshowActivity z = this.b.Z;
                if (z != null) {
                   z.b(e10);
                }
             }
          }
       }
       return;
    }
}
