package com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$f;
import java.util.concurrent.Callable;
import android.graphics.Bitmap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$b;
import android.graphics.Bitmap$Config;
import com.yxcorp.gifshow.util.BitmapUtil;

public final class MultiTakePictureController$f implements Callable	// class@000ed1
{
    public final Bitmap b;

    public void MultiTakePictureController$f(Bitmap p0){
       this.b = p0;
       super();
    }
    public Object call(){
       Bitmap uBitmap = PatchProxy.apply(null, this, MultiTakePictureController$f.class, "1");
       if (uBitmap != PatchProxyResult.class) {
       }else {
          MultiTakePictureController$b v = MultiTakePictureController.V;
          uBitmap = BitmapUtil.U(this.b, v.a(), (int)((float)v.a() * (((float)this.b.getHeight() * 0x3f800000) / (float)this.b.getWidth())), this.b.getConfig(), false);
       }
       return uBitmap;
    }
}
