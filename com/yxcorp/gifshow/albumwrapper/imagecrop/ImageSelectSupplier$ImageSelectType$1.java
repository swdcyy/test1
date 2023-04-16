package com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$ImageSelectType$1;
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

public final class ImageSelectSupplier$ImageSelectType$1 extends ImageSelectSupplier$ImageSelectType	// class@001b56
{

    public void ImageSelectSupplier$ImageSelectType$1(String p0,int p1,int p2){
       super(p0, p1, p2, null);
    }
    public Bundle getCropPrams(){
       Bundle obj = PatchProxy.apply(null, this, ImageSelectSupplier$ImageSelectType$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Bundle();
       obj.putString("crop", "true");
       obj.putInt("aspectX", 1);
       obj.putInt("aspectY", 1);
       obj.putInt("outputX", 750);
       obj.putInt("outputY", 750);
       obj.putString("outputFormat", Bitmap$CompressFormat.PNG.toString());
       obj.putBoolean("return-data", false);
       obj.putBoolean("darkTheme", 1);
       obj.putBoolean("imageReverse", false);
       return obj;
    }
    public boolean skipMixImport(QMedia p0){
       return false;
    }
}
