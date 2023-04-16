package com.reactnativecommunity.imageeditor.ImageEditorModule$b;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactContext;
import java.lang.String;
import com.facebook.react.bridge.Promise;
import com.reactnativecommunity.imageeditor.ImageEditorModule$a;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import java.lang.Object;
import java.lang.Integer;
import android.graphics.BitmapFactory$Options;
import android.graphics.Bitmap;
import od.a;
import com.reactnativecommunity.imageeditor.ImageEditorModule;
import java.io.InputStream;
import android.graphics.Rect;
import android.graphics.BitmapFactory;
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
import android.graphics.BitmapRegionDecoder;
import java.io.File;
import java.lang.Throwable;

public class ImageEditorModule$b extends GuardedAsyncTask	// class@000b5e
{
    public final Context a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final String g;
    public int h;
    public int i;
    public final Promise j;

    public void ImageEditorModule$b(ReactContext p0,String p1,int p2,int p3,int p4,int p5,String p6,Promise p7,ImageEditorModule$a p8){
       super(p0);
       this.h = 0;
       this.i = 0;
       if (p2 >= 0 && (p3 >= 0 && (p4 > 0 && p5 > 0))) {
          this.a = p0;
          this.b = p1;
          this.c = p2;
          this.d = p3;
          this.e = p4;
          this.f = p5;
          this.g = p6;
          this.j = p7;
          return;
       }else {
          Object[] objArray = new Object[]{Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5)};
          throw new JSApplicationIllegalArgumentException(String.format("Invalid crop rectangle: [%d, %d, %d, %d]", objArray));
       }
    }
    public final Bitmap a(int p0,int p1,BitmapFactory$Options p2){
       float f7;
       ImageEditorModule$b uob = this;
       int i = p0;
       int i1 = p1;
       BitmapFactory$Options options = p2;
       a.c(p2);
       ImageEditorModule$b e = uob.e;
       float f = (float)e;
       ImageEditorModule$b f1 = uob.f;
       float f2 = (float)f1;
       float f3 = (float)i;
       float f4 = (float)i1;
       float f5 = f3 / f4;
       float f6 = 2.00f;
       if ((f / f2) - f5 > 0) {
          f5 = f5 * f2;
          f7 = (float)uob.c + ((f - f5) / f6);
          f = (float)uob.d;
          f4 = f4 / f2;
       }else {
          f7 = f / f5;
          f5 = f;
          f = ((f2 - f7) / f6) + (float)uob.d;
          f2 = f7;
          f7 = (float)uob.c;
          f4 = f3 / f;
       }
       options.inSampleSize = ImageEditorModule.getDecodeSampleSize(e, f1, i, i1);
       InputStream inputStream = this.b();
       Bitmap uBitmap = BitmapFactory.decodeStream(inputStream, null, options);
       if (uBitmap != null) {
          inputStream.close();
          Matrix matrix = new Matrix();
          matrix.setScale((f4 * (float)options.inSampleSize), (f4 * (float)options.inSampleSize));
          return Bitmap.createBitmap(uBitmap, Math.round((f7 / (float)options.inSampleSize)), Math.round((f / (float)options.inSampleSize)), Math.round((f5 / (float)options.inSampleSize)), Math.round((f2 / (float)options.inSampleSize)), matrix, true);
       }else {
          throw new IOException("Cannot decode bitmap: "+uob.b);
       }
    }
    public final InputStream b(){
       InputStream inputStream = (ImageEditorModule.isLocalUri(this.b))? this.a.getContentResolver().openInputStream(Uri.parse(this.b)): new URL(this.b).openConnection().getInputStream();
       if (inputStream != null) {
          return inputStream;
       }else {
          throw new IOException("Cannot open bitmap: "+this.b);
       }
    }
    public void doInBackgroundGuarded(Object[] p0){
       Bitmap uBitmap;
       try{
          BitmapFactory$Options options = new BitmapFactory$Options();
          ImageEditorModule$b th = this.h;
          ImageEditorModule$b uob = null;
          Rect rect = (th > null && this.i > null)? 1: null;
          if (rect) {
             uBitmap = this.a(th, this.i, options);
          }else {
             InputStream inputStream = this.b();
             BitmapRegionDecoder uBitmapRegio = BitmapRegionDecoder.newInstance(inputStream, uob);
             ImageEditorModule$b tc = this.c;
             ImageEditorModule$b td = this.d;
             inputStream.close();
             uBitmapRegio.recycle();
             uBitmap = uBitmapRegio.decodeRegion(new Rect(tc, td, (this.e + tc), (this.f + td)), options);
          }
          options = options.outMimeType;
          if (options != null && !options.isEmpty()) {
             String str = (this.g != null)? "."+this.g: ImageEditorModule.getFileExtensionForType(options);
             File uFile = ImageEditorModule.createTempFile(this.a, str);
             ImageEditorModule.writeCompressedBitmapToFile(uBitmap, str, uFile);
             if (str.equals(".jpg")) {
                ImageEditorModule.copyExif(this.a, Uri.parse(this.b), uFile);
             }
             this.j.resolve(Uri.fromFile(uFile).toString());
          }else {
             throw new IOException("Could not determine MIME type");
          }
       }catch(java.lang.Exception e8){
          this.j.reject(e8);
       }
       return;
    }
}
