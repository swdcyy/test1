package com.facebook.react.modules.camera.ImageEditingManager$c;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactContext;
import java.lang.String;
import com.facebook.react.bridge.Callback;
import com.facebook.react.modules.camera.ImageEditingManager$a;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import java.lang.Object;
import java.lang.Integer;
import android.graphics.BitmapFactory$Options;
import android.graphics.Bitmap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.io.InputStream;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import od.a;
import android.graphics.BitmapFactory;
import com.facebook.react.modules.camera.ImageEditingManager;
import java.lang.Math;
import android.graphics.Matrix;
import java.io.IOException;
import java.lang.StringBuilder;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.net.URL;
import java.net.URLConnection;
import java.lang.Void;
import java.io.File;
import java.lang.Exception;

public class ImageEditingManager$c extends GuardedAsyncTask	// class@001283
{
    public final Context a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public int g;
    public int h;
    public final Callback i;
    public final Callback j;

    public void ImageEditingManager$c(ReactContext p0,String p1,int p2,int p3,int p4,int p5,Callback p6,Callback p7,ImageEditingManager$a p8){
       super(p0);
       this.g = 0;
       this.h = 0;
       if (p2 >= 0 && (p3 >= 0 && (p4 > 0 && p5 > 0))) {
          this.a = p0;
          this.b = p1;
          this.c = p2;
          this.d = p3;
          this.e = p4;
          this.f = p5;
          this.i = p6;
          this.j = p7;
          return;
       }else {
          Object[] objArray = new Object[]{Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5)};
          throw new JSApplicationIllegalArgumentException(String.format("Invalid crop rectangle: [%d, %d, %d, %d]", objArray));
       }
    }
    public final Bitmap a(BitmapFactory$Options p0){
       InputStream obj = PatchProxy.applyOneRefs(p0, this, ImageEditingManager$c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c();
       BitmapRegionDecoder uBitmapRegio = BitmapRegionDecoder.newInstance(obj, false);
       ImageEditingManager$c tc = this.c;
       ImageEditingManager$c td = this.d;
       Bitmap uBitmap = uBitmapRegio.decodeRegion(new Rect(tc, td, (this.e + tc), (this.f + td)), p0);
       if (obj != null) {
          obj.close();
       }
       uBitmapRegio.recycle();
       return uBitmap;
    }
    public final Bitmap b(int p0,int p1,BitmapFactory$Options p2){
       BitmapFactory$Options obj;
       float this;
       float f6;
       ImageEditingManager$c uoc = this;
       int i = p0;
       int i1 = p1;
       BitmapFactory$Options options = p2;
       if (PatchProxy.isSupport(ImageEditingManager$c.class)) {
          obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, ImageEditingManager$c.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.c(p2);
       obj = new BitmapFactory$Options();
       obj.inJustDecodeBounds = true;
       InputStream inputStream = this.c();
       Rect rect = null;
       BitmapFactory.decodeStream(inputStream, rect, obj);
       if (inputStream != null) {
          inputStream.close();
       }
       ImageEditingManager$c e = uoc.e;
       this = (float)e;
       ImageEditingManager$c f = uoc.f;
       float f1 = (float)f;
       float f2 = (float)i;
       float f3 = (float)i1;
       float f4 = f2 / f3;
       float f5 = 2.00f;
       if ((this / f1) - f4 > 0) {
          f4 = f4 * f1;
          f2 = f3 / f1;
          f3 = (float)uoc.c + ((this - f4) / f5);
          f6 = f1;
          f1 = (float)uoc.d;
          this = f4;
       }else {
          f6 = this / f4;
          f3 = (float)uoc.c;
          f1 = ((f1 - f6) / f5) + (float)uoc.d;
          f2 = f2 / this;
       }
       options.inSampleSize = ImageEditingManager.getDecodeSampleSize(e, f, i, i1);
       obj.inJustDecodeBounds = false;
       InputStream inputStream1 = this.c();
       Bitmap uBitmap = BitmapFactory.decodeStream(inputStream1, rect, options);
       if (uBitmap != null) {
          if (inputStream1 != null) {
             inputStream1.close();
          }
          Matrix matrix = new Matrix();
          matrix.setScale((f2 * (float)options.inSampleSize), (f2 * (float)options.inSampleSize));
          return Bitmap.createBitmap(uBitmap, (int)Math.floor((double)(f3 / (float)options.inSampleSize)), (int)Math.floor((double)(f1 / (float)options.inSampleSize)), (int)Math.floor((double)(this / (float)options.inSampleSize)), (int)Math.floor((double)(f6 / (float)options.inSampleSize)), matrix, true);
       }else {
          throw new IOException("Cannot decode bitmap: "+uoc.b);
       }
    }
    public final InputStream c(){
       InputStream obj = PatchProxy.apply(null, this, ImageEditingManager$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (ImageEditingManager.isLocalUri(this.b))? this.a.getContentResolver().openInputStream(Uri.parse(this.b)): new URL(this.b).openConnection().getInputStream();
       if (obj != null) {
          return obj;
       }else {
          throw new IOException("Cannot open bitmap: "+this.b);
       }
    }
    public void doInBackgroundGuarded(Object[] p0){
       int i;
       int i1;
       try{
          if (PatchProxy.applyVoidOneRefs(p0, this, ImageEditingManager$c.class, "3")) {
          }else {
             i = 1;
             i1 = 0;
             BitmapFactory$Options options = new BitmapFactory$Options();
             ImageEditingManager$c tg = this.g;
             ImageEditingManager$c uoc = (tg > null && this.h > null)? 1: null;
             Bitmap uBitmap = (uoc)? this.b(tg, this.h, options): this.a(options);
             options = options.outMimeType;
             if (options != null && !options.isEmpty()) {
                File uFile = ImageEditingManager.createTempFile(this.a, options);
                ImageEditingManager.writeCompressedBitmapToFile(uBitmap, options, uFile);
                if (options.equals("image/jpeg")) {
                   ImageEditingManager.copyExif(this.a, Uri.parse(this.b), uFile);
                }
                Object[] objArray = new Object[i];
                objArray[i1] = Uri.fromFile(uFile).toString();
                this.i.invoke(objArray);
             }else {
                throw new IOException("Could not determine MIME type");
             }
          }
       }catch(java.lang.Exception e1){
          i = new Object[i];
          i[i1] = e1.getMessage();
          this.j.invoke(i);
       }
       return;
    }
}
