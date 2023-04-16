package com.yxcorp.gifshow.album.preview.a$b;
import com.yxcorp.gifshow.album.preview.MediaPreviewGenerateCoverManager$a;
import java.lang.String;
import android.graphics.Bitmap;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o79.i;
import android.graphics.BitmapFactory$Options;
import ekd.b0;
import kc7.a;
import android.graphics.BitmapFactory;
import java.lang.Math;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import java.lang.RuntimeException;
import java.lang.Throwable;
import ic7.b;
import android.graphics.Matrix;

public class a$b extends MediaPreviewGenerateCoverManager$a	// class@001a48
{

    public void a$b(int p0,String p1,String p2){
       super(p0, p1, p2);
    }
    public Bitmap a(){
       b0 a;
       Object obj = PatchProxy.apply(null, this, a$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = i.j();
       int i1 = i.k();
       BitmapFactory$Options options = new BitmapFactory$Options();
       if (!this.b()) {
          this.d = a.d(this.b);
          if (!this.b()) {
             options.inSampleSize = 4;
             return BitmapFactory.decodeFile(this.b, options);
          }
       }
       MediaPreviewGenerateCoverManager$a td = this.d;
       b0 b = td.b;
       a = td.a;
       float f = (((float)b / (float)a) - 0x3f800000 < 0)? (float)a / (float)Math.min(i1, a): (float)b / (float)Math.min(i, b);
       options.inSampleSize = Math.round(f) * 2;
       Log.g("AlbumImagePreviewItem", "get image cover, inSampleSize = "+options.inSampleSize);
       Bitmap uBitmap = BitmapFactory.decodeFile(this.b, options);
       if (uBitmap == null) {
          b.a(new RuntimeException("AlbumImagePreviewItem failed to decode image file "+this.b));
          return null;
       }else {
          i = a.e(this.b);
          if (i) {
             Matrix matrix = new Matrix();
             matrix.setRotate((float)i);
             return Bitmap.createBitmap(uBitmap, 0, 0, uBitmap.getWidth(), uBitmap.getHeight(), matrix, false);
          }else {
             return uBitmap;
          }
       }
    }
    public final boolean b(){
       MediaPreviewGenerateCoverManager$a td = this.d;
       boolean b = (td != null && (td.a > null && td.b > null))? true: false;
       return b;
    }
}
