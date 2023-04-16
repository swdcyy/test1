package iq8.b;
import java.lang.Object;
import java.io.InputStream;
import android.graphics.Bitmap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.graphics.BitmapFactory;
import java.lang.Integer;
import java.lang.Boolean;
import iq8.d;
import android.graphics.BitmapFactory$Options;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.util.Base64;
import java.lang.Throwable;
import zp8.a;

public class b	// class@00270b
{

    public void b(){
       super();
    }
    public static Bitmap a(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return BitmapFactory.decodeStream(p0);
    }
    public static Bitmap b(String p0,int p1,int p2,boolean p3){
       boolean b;
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Boolean.valueOf(p3), null, b.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!d.a(p0)) {
          return null;
       }else if(p3){
          BitmapFactory$Options options = new BitmapFactory$Options();
          b = true;
          options.inJustDecodeBounds = b;
          BitmapFactory.decodeFile(p0, options);
          BitmapFactory$Options outHeight = options.outHeight;
          BitmapFactory$Options outWidth = options.outWidth;
          if (p1 <= 0 || (p2 > 0 && (outHeight > p2 || outWidth > p1))) {
             int i = outHeight / 2;
             int i1 = outWidth / 2;
             int i2 = i / b;
             while (i2 >= p2) {
                i2 = i1 / b;
                if (i2 >= p1) {
                   b = b * 2;
                }
             }
          }
          options.inSampleSize = b;
          options.inJustDecodeBounds = false;
          return BitmapFactory.decodeFile(p0, options);
       }else {
          return BitmapFactory.decodeFile(p0);
       }
    }
    public static Bitmap c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(p0)) {
          return null;
       }
       byte[] uobyteArray = Base64.decode(p0.split(",")[1], 0);
       return BitmapFactory.decodeByteArray(uobyteArray, 0, uobyteArray.length);
    }
}
