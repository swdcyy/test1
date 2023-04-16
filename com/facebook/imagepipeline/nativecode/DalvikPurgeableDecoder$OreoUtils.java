package com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder$OreoUtils;
import java.lang.Object;
import android.graphics.BitmapFactory$Options;
import android.graphics.ColorSpace;
import android.graphics.ColorSpace$Named;

public class DalvikPurgeableDecoder$OreoUtils	// class@001108
{

    public void DalvikPurgeableDecoder$OreoUtils(){
       super();
    }
    public static void a(BitmapFactory$Options p0,ColorSpace p1){
       if (p1 == null) {
          p1 = ColorSpace.get(ColorSpace$Named.SRGB);
       }
       p0.inPreferredColorSpace = p1;
       return;
    }
}
