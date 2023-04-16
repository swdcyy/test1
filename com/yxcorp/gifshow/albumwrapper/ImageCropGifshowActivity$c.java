package com.yxcorp.gifshow.albumwrapper.ImageCropGifshowActivity$c;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.yxcorp.gifshow.albumwrapper.ImageCropGifshowActivity;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.image.KwaiZoomImageView;
import android.widget.ImageView;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap;
import java.util.Objects;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.albumwrapper.ImageCropGifshowActivity$d;
import kotlin.jvm.internal.a;
import gp.a;
import com.yxcorp.gifshow.albumwrapper.ImageCropGifshowActivity$a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Math;
import java.lang.Exception;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import m0d.l;

public final class ImageCropGifshowActivity$c implements ImageCallback	// class@001b4b
{
    public final ImageCropGifshowActivity b;

    public void ImageCropGifshowActivity$c(ImageCropGifshowActivity p0){
       this.b = p0;
       super();
    }
    public void onCompleted(Drawable p0){
       RectF rectF;
       RectF obj3;
       float f;
       float f1;
       float f2;
       Object obj = this;
       ImageCropGifshowActivity$c obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, ImageCropGifshowActivity$c.class, "1")) {
          return;
       }
       float rotation = obj.b.z3().getRotation();
       Matrix matrix = new Matrix();
       matrix.setRotate(rotation);
       RectF displayRect = obj.b.z3().getDisplayRect();
       if (obj1 != null && (obj1 instanceof BitmapDrawable && displayRect != null)) {
          Object obj2 = obj1;
          if (obj2.getBitmap() != null) {
             obj1 = obj.b;
             Objects.requireNonNull(obj1);
             int i = 1;
             if (PatchProxy.isSupport(ImageCropGifshowActivity.class)) {
                rectF = PatchProxy.applyTwoRefs(displayRect, Float.valueOf(rotation), obj1, ImageCropGifshowActivity.class, "15");
                if (rectF != PatchProxyResult.class) {
                label_005f :
                   obj3 = rectF;
                   Bitmap bitmap = obj2.getBitmap();
                   a.o(bitmap, "drawable.bitmap");
                   int width = bitmap.getWidth();
                   bitmap = obj2.getBitmap();
                   a.o(bitmap, "drawable.bitmap");
                   Bitmap uBitmap = Bitmap.createBitmap(obj2.getBitmap(), 0, 0, width, bitmap.getHeight(), matrix, false);
                   if (uBitmap == null) {
                      Bitmap bitmap1 = obj2.getBitmap();
                      a.o(bitmap1, "drawable.bitmap");
                      bitmap1 = obj2.getBitmap();
                      a.o(bitmap1, "drawable.bitmap");
                      Object[] objArray = new Object[0];
                      a.C().t(ImageCropGifshowActivity.a1.a(), "params of createBitmap \(width = "+bitmap1.getWidth()+", height = "+bitmap1.getHeight()+", matrixRot = "+matrix+"\)", objArray);
                      return;
                   }else {
                      f = 0x3f800000;
                      rotation = ((float)uBitmap.getWidth() * f) / obj3.width();
                      RectF rectF1 = obj.b.U0.a();
                      f1 = (rectF1.left - obj3.left) * rotation;
                      f2 = (rectF1.top - obj3.top) * rotation;
                      Matrix matrix1 = new Matrix();
                      ImageCropGifshowActivity$c b = obj.b;
                      ImageCropGifshowActivity m = b.M;
                      if (m != null && b.N != null) {
                         b.O = Math.min(((((float)m * f) / rectF1.width()) / rotation), ((((float)obj.b.N * f) / rectF1.height()) / rotation));
                      }
                      ImageCropGifshowActivity o = obj.b.O;
                      if (o - (float)i < 0) {
                         matrix1.setScale(o, o);
                      }
                      try{
                         int i1 = (int)Math.max(0, f1);
                         width = (int)Math.max(0, f2);
                         obj.b.C3(Bitmap.createBitmap(uBitmap, i1, width, (int)Math.min(obj.b.B3((rectF1.width() * rotation), ((rectF1.right - obj3.left) * rotation)), (float)(uBitmap.getWidth() - i1)), (int)Math.min(obj.b.B3((rectF1.height() * rotation), ((rectF1.bottom - obj3.top) * rotation)), (float)(uBitmap.getHeight() - width)), matrix1, false));
                      }catch(java.lang.Exception e0){
                         Bitmap bitmap2 = obj2.getBitmap();
                         a.o(bitmap2, "drawable.bitmap");
                         bitmap2 = obj2.getBitmap();
                         a.o(bitmap2, "drawable.bitmap");
                         ExceptionHandler.handleCaughtException(new Exception("load size:"+bitmap2.getWidth()+"-"+bitmap2.getHeight()+";"+"clip rect:"+rectF1.toString()+";"+"display rect:"+displayRect.toString()+";"+"scale:"+rotation+";", e0));
                      }
                   }
                }
             }
             int i2 = 2;
             if (obj1.Q != null) {
                obj3 = obj1.U0.a();
                rectF = obj3.left;
                f2 = (float)i2;
                f = rectF + ((obj3.right - rectF) / f2);
                RectF top = obj3.top;
                f1 = top + ((obj3.bottom - top) / f2);
             }else {
                f = (float)(obj1.z3().getWidth() / i2);
                f1 = (float)(obj1.z3().getHeight() / i2);
             }
             int i3 = 4;
             float[] uofloatArray = new float[i3];
             uofloatArray[0] = f - displayRect.left;
             uofloatArray[i] = f1 - displayRect.top;
             uofloatArray[i2] = (- f) + displayRect.right;
             int i4 = 3;
             uofloatArray[i4] = (- f1) + displayRect.bottom;
             int i5 = ((int)(rotation / (float)90) % i3) + i3;
             if (i5 != i2) {
                int i6 = uofloatArray[0];
                int i7 = 0;
                int i8 = 0;
                while (i7 <= i4) {
                   i8 = i8 + i5;
                   i8 = i8 % i3;
                   int i9 = uofloatArray[i8];
                   uofloatArray[i8] = i6;
                   i7 = i7 + 1;
                   i6 = i9;
                }
             }else {
                i5 = uofloatArray[i];
                uofloatArray[i] = uofloatArray[i4];
                uofloatArray[i4] = i5;
                i5 = uofloatArray[0];
                uofloatArray[0] = uofloatArray[i2];
                uofloatArray[i2] = i5;
             }
             float[] uofloatArray1 = new float[i3];
             uofloatArray1[0] = f - uofloatArray[0];
             uofloatArray1[i] = f1 - uofloatArray[i];
             uofloatArray1[i2] = f + uofloatArray[i2];
             uofloatArray1[i4] = f1 + uofloatArray[i4];
             rectF = new RectF(uofloatArray1[0], uofloatArray1[i], uofloatArray1[i2], uofloatArray1[i4]);
             goto label_005f ;
          }
       }
    }
    public void onCompletedBitmap(Bitmap p0){
       l.b(this, p0);
    }
    public void onProgress(float p0){
    }
}
