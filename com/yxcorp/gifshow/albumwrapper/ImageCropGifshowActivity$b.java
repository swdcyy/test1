package com.yxcorp.gifshow.albumwrapper.ImageCropGifshowActivity$b;
import x79.g;
import com.yxcorp.gifshow.albumwrapper.ImageCropGifshowActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Throwable;
import kotlin.jvm.internal.a;
import x79.g$a;
import android.net.Uri;
import java.lang.Integer;
import android.os.Bundle;
import android.content.Intent;
import android.app.Activity;
import android.graphics.Bitmap;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class ImageCropGifshowActivity$b implements g	// class@001b4a
{
    public final ImageCropGifshowActivity a;

    public void ImageCropGifshowActivity$b(ImageCropGifshowActivity p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, ImageCropGifshowActivity$b.class, "2")) {
          return;
       }
       this.a.finish();
       return;
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ImageCropGifshowActivity$b.class, "3")) {
          return;
       }
       a.p(p0, "e");
       g$a.b(this, p0);
       return;
    }
    public void c(int p0,int p1,Uri p2){
       if (PatchProxy.isSupport(ImageCropGifshowActivity$b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, ImageCropGifshowActivity$b.class, "1")) {
          return;
       }
       a.p(p2, "saveUri");
       Bundle uBundle = new Bundle();
       uBundle.putInt("outputX", p0);
       uBundle.putInt("outputY", p1);
       ImageCropGifshowActivity h = this.a.H;
       a.m(h);
       this.a.setResult(-1, new Intent(h.toString()).putExtras(uBundle));
       return;
    }
    public boolean d(Bitmap p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ImageCropGifshowActivity$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "corpBitmap");
       return g$a.a(this, p0);
    }
}
