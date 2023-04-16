package com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$ImageSelectType$2;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$ImageSelectType;
import java.lang.String;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$a;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.graphics.Bitmap$CompressFormat;
import com.yxcorp.gifshow.models.QMedia;

public final class ImageSelectSupplier$ImageSelectType$2 extends ImageSelectSupplier$ImageSelectType	// class@001b57
{

    public void ImageSelectSupplier$ImageSelectType$2(String p0,int p1,int p2){
       super(p0, p1, p2, null);
    }
    public Bundle getCropPrams(){
       Bundle obj = PatchProxy.apply(null, this, ImageSelectSupplier$ImageSelectType$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Bundle();
       obj.putString("crop", "true");
       obj.putInt("aspectX", 8);
       obj.putInt("aspectY", 5);
       obj.putString("outputFormat", Bitmap$CompressFormat.JPEG.toString());
       obj.putBoolean("imageReverse", true);
       obj.putBoolean("return-data", false);
       return obj;
    }
    public boolean skipMixImport(QMedia p0){
       boolean b = (p0.duration - 1000 < 0)? true: false;
       return b;
    }
}
