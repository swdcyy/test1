package nd.a;
import z1.g;
import java.io.InputStream;
import nd.b;
import java.lang.Object;
import ab.e;
import java.nio.ByteBuffer;
import android.graphics.BitmapFactory$Options;
import android.graphics.Rect;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build$VERSION;
import android.graphics.ColorSpace;
import android.graphics.Bitmap$Config;
import nd.a$a;
import java.lang.UnsupportedOperationException;
import java.lang.String;

public final class a	// class@0026ee
{
    public static final g a;

    static {
       a.a = new g(12);
    }
    public static b a(InputStream p0){
       e.d(p0);
       g a = a.a;
       ByteBuffer uByteBuffer = a.q();
       if (uByteBuffer == null) {
          uByteBuffer = ByteBuffer.allocate(0x4000);
       }
       BitmapFactory$Options options = new BitmapFactory$Options();
       options.inJustDecodeBounds = true;
       options.inTempStorage = uByteBuffer.array();
       Rect rect = null;
       BitmapFactory.decodeStream(p0, rect, options);
       if (Build$VERSION.SDK_INT >= 26) {
          rect = options.outColorSpace;
       }
       a.a(uByteBuffer);
       return new b(options.outWidth, options.outHeight, rect);
    }
    public static int b(Bitmap$Config p0){
       int i = 2;
       switch (a$a.a[p0.ordinal()]){
           case 1:
             return 4;
           case 2:
             return 1;
           case 3:
           case 4:
             return i;
           case 5:
             return 8;
           case 6:
             return 4;
           default:
             throw new UnsupportedOperationException("The provided Bitmap.Config is not supported");
       }
    }
    public static int c(int p0,int p1,Bitmap$Config p2){
       return ((p0 * p1) * a.b(p2));
    }
    public static int d(Bitmap p0){
       if (p0 == null) {
          return 0;
       }
       try{
          int allocationBy = p0.getAllocationByteCount();
          return allocationBy;
       }catch(java.lang.NullPointerException e0){
          return e0.getByteCount();
       }
    }
}
