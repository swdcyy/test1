package com.horcrux.svg.ImageView;
import com.horcrux.svg.RenderableView;
import com.facebook.react.bridge.ReactContext;
import java.util.concurrent.atomic.AtomicBoolean;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Bitmap;
import android.graphics.RectF;
import java.lang.String;
import android.graphics.Matrix;
import com.horcrux.svg.ViewBox;
import android.graphics.Path;
import com.horcrux.svg.VirtualView;
import android.graphics.Rect;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.drawee.backends.pipeline.Fresco;
import qf.a;
import android.content.Context;
import android.net.Uri;
import com.facebook.imagepipeline.request.ImageRequest;
import android.graphics.Path$Direction;
import com.horcrux.svg.SVGLength;
import java.lang.Object;
import kb.c;
import com.horcrux.svg.ImageView$1;
import ya.i;
import kb.e;
import java.util.concurrent.Executor;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableMap;
import qf.c;
import com.facebook.common.references.a;
import com.facebook.imagepipeline.image.a;
import bd.b;
import java.lang.IllegalStateException;
import java.lang.Throwable;

public class ImageView extends RenderableView	// class@0005aa
{
    public String mAlign;
    public SVGLength mH;
    public int mImageHeight;
    public int mImageWidth;
    public final AtomicBoolean mLoading;
    public int mMeetOrSlice;
    public SVGLength mW;
    public SVGLength mX;
    public SVGLength mY;
    public String uriString;

    public void ImageView(ReactContext p0){
       super(p0);
       this.mLoading = new AtomicBoolean(false);
    }
    public final void doRender(Canvas p0,Paint p1,Bitmap p2,float p3){
       if (this.mImageWidth == null || this.mImageHeight == null) {
          this.mImageWidth = p2.getWidth();
          this.mImageHeight = p2.getHeight();
       }
       RectF rectF = new RectF(0, 0, (float)this.mImageWidth, (float)this.mImageHeight);
       ViewBox.getTransform(rectF, this.getRect(), this.mAlign, this.mMeetOrSlice).mapRect(rectF);
       p0.clipPath(this.getPath(p0, p1));
       Path clipPath = this.getClipPath(p0, p1);
       if (clipPath != null) {
          p0.clipPath(clipPath);
       }
       clipPath = new Paint();
       clipPath.setAlpha((int)(p3 * 0x437f0000));
       p0.drawBitmap(p2, null, rectF, clipPath);
       this.mCTM.mapRect(rectF);
       this.setClientRect(rectF);
       return;
    }
    public void draw(Canvas p0,Paint p1,float p2){
       if (!this.mLoading.get()) {
          ImagePipeline imagePipelin = Fresco.getImagePipeline();
          ImageRequest imageRequest = ImageRequest.b(new a(this.mContext, this.uriString).c());
          if (imagePipelin.isInBitmapMemoryCache(imageRequest)) {
             this.tryRenderFromBitmapCache(imagePipelin, imageRequest, p0, p1, (p2 * this.mOpacity));
          }else {
             this.loadBitmap(imagePipelin, imageRequest);
          }
       }
       return;
    }
    public Path getPath(Canvas p0,Paint p1){
       Path path = new Path();
       this.mPath = path;
       path.addRect(this.getRect(), Path$Direction.CW);
       return this.mPath;
    }
    public final RectF getRect(){
       double d = this.relativeOnWidth(this.mX);
       double d1 = this.relativeOnHeight(this.mY);
       double d2 = this.relativeOnWidth(this.mW);
       double d3 = this.relativeOnHeight(this.mH);
       RectF rectF = null;
       if (!d2 - rectF) {
          d2 = (double)((float)this.mImageWidth * this.mScale);
       }
       if (!d3 - rectF) {
          d3 = (double)((float)this.mImageHeight * this.mScale);
       }
       return new RectF((float)d, (float)d1, (float)(d + d2), (float)(d1 + d3));
    }
    public final void loadBitmap(ImagePipeline p0,ImageRequest p1){
       this.mLoading.set(true);
       p0.fetchDecodedImage(p1, this.mContext).f(new ImageView$1(this), i.d());
    }
    public void setAlign(String p0){
       this.mAlign = p0;
       this.invalidate();
    }
    public void setHeight(Dynamic p0){
       this.mH = SVGLength.from(p0);
       this.invalidate();
    }
    public void setMeetOrSlice(int p0){
       this.mMeetOrSlice = p0;
       this.invalidate();
    }
    public void setSrc(ReadableMap p0){
       if (p0 != null) {
          String str = p0.getString("uri");
          this.uriString = str;
          if (str != null && !str.isEmpty()) {
             str = "width";
             if (p0.hasKey(str)) {
                String str1 = "height";
                if (p0.hasKey(str1)) {
                   this.mImageWidth = p0.getInt(str);
                   this.mImageHeight = p0.getInt(str1);
                label_0035 :
                   if (Uri.parse(this.uriString).getScheme() == null) {
                      c.a().d(this.mContext, this.uriString);
                   }
                }
             }
             int i = 0;
             this.mImageWidth = i;
             this.mImageHeight = i;
             goto label_0035 ;
          }
       }
       return;
    }
    public void setWidth(Dynamic p0){
       this.mW = SVGLength.from(p0);
       this.invalidate();
    }
    public void setX(Dynamic p0){
       this.mX = SVGLength.from(p0);
       this.invalidate();
    }
    public void setY(Dynamic p0){
       this.mY = SVGLength.from(p0);
       this.invalidate();
    }
    public final void tryRenderFromBitmapCache(ImagePipeline p0,ImageRequest p1,Canvas p2,Paint p3,float p4){
       c uoc = p0.fetchImageFromBitmapCache(p1, this.mContext);
       try{
          a result = uoc.getResult();
          if (result == null) {
             uoc.close();
             return;
          }else {
             try{
                a uoa = result.j();
                if (!uoa instanceof b) {
                   a.f(result);
                   uoc.close();
                   return;
                }else {
                   Bitmap uBitmap = uoa.g();
                   if (uBitmap == null) {
                      a.f(result);
                      uoc.close();
                      return;
                   }else {
                      this.doRender(p2, p3, uBitmap, p4);
                      a.f(result);
                      uoc.close();
                      return;
                   }
                }
             }catch(java.lang.Exception e5){
                throw new IllegalStateException(e5);
             }catch(java.lang.Exception e4){
                throw new IllegalStateException(e4);
             }
          }
       }catch(java.lang.Exception e4){
       }
    }
}
