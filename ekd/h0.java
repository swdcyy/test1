package ekd.h0;
import java.lang.Object;
import java.lang.String;
import android.graphics.BitmapFactory$Options;
import kotlin.jvm.internal.a;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import java.lang.Exception;

public final class h0	// class@000d4d
{
    public static final h0 a;

    static {
       h0.a = new h0();
    }
    public void h0(){
       super();
    }
    public static final BitmapFactory$Options a(String p0){
       a.p(p0, "imagePath");
       BitmapFactory$Options options = new BitmapFactory$Options();
       boolean b = true;
       options.inJustDecodeBounds = b;
       BitmapFactory.decodeFile(p0, options);
       try{
          int i = 0;
          int attributeInt = new ExifInterface(p0).getAttributeInt("Orientation", i);
          if (attributeInt == 6 || attributeInt == 8) {
          label_0029 :
             BitmapFactory$Options outHeight = (b)? options.outHeight: options.outWidth;
             BitmapFactory$Options outWidth = (b)? options.outWidth: options.outHeight;
             options.outHeight = outWidth;
             options.outWidth = outHeight;
             return options;
          }
       }catch(java.lang.Exception e4){
          e4.printStackTrace();
       }
       b = false;
       goto label_0029 ;
    }
}
