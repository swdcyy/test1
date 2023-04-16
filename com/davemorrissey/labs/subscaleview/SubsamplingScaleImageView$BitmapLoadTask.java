package com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView$BitmapLoadTask;
import android.os.AsyncTask;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import android.content.Context;
import com.davemorrissey.labs.subscaleview.decoder.DecoderFactory;
import android.net.Uri;
import java.lang.ref.WeakReference;
import java.lang.Object;
import java.lang.Void;
import java.lang.Integer;
import java.lang.String;
import com.davemorrissey.labs.subscaleview.decoder.ImageDecoder;
import android.graphics.Bitmap;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.lang.Exception;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView$OnImageEventListener;

public class SubsamplingScaleImageView$BitmapLoadTask extends AsyncTask	// class@000fb0
{
    public Bitmap bitmap;
    public final WeakReference contextRef;
    public final WeakReference decoderFactoryRef;
    public Exception exception;
    public final boolean preview;
    public final Uri source;
    public final WeakReference viewRef;

    public void SubsamplingScaleImageView$BitmapLoadTask(SubsamplingScaleImageView p0,Context p1,DecoderFactory p2,Uri p3,boolean p4){
       super();
       this.viewRef = new WeakReference(p0);
       this.contextRef = new WeakReference(p1);
       this.decoderFactoryRef = new WeakReference(p2);
       this.source = p3;
       this.preview = p4;
    }
    public Integer doInBackground(Void[] p0){
       try{
          String str = this.source.toString();
          Context uContext = this.contextRef.get();
          DecoderFactory uDecoderFact = this.decoderFactoryRef.get();
          SubsamplingScaleImageView subsamplingS = this.viewRef.get();
          if (uContext != null && (uDecoderFact != null && subsamplingS != null)) {
             Object[] objArray = new Object[0];
             subsamplingS.debug("BitmapLoadTask.doInBackground", objArray);
             this.bitmap = uDecoderFact.make().decode(uContext, this.source);
             return Integer.valueOf(subsamplingS.getExifOrientation(uContext, str));
          }
       }catch(java.lang.Exception e6){
          this.exception = e6;
       }catch(java.lang.OutOfMemoryError e6){
          this.exception = new RuntimeException(e6);
       }
       return null;
    }
    public Object doInBackground(Object[] p0){
       return this.doInBackground(p0);
    }
    public void onPostExecute(Integer p0){
       SubsamplingScaleImageView subsamplingS = this.viewRef.get();
       if (subsamplingS != null) {
          SubsamplingScaleImageView$BitmapLoadTask tbitmap = this.bitmap;
          if (tbitmap != null && p0 != null) {
             if (this.preview != null) {
                subsamplingS.onPreviewLoaded(tbitmap);
             }else {
                subsamplingS.onImageLoaded(tbitmap, p0.intValue(), false);
             }
          }else {
             SubsamplingScaleImageView$BitmapLoadTask texception = this.exception;
             if (texception != null) {
                subsamplingS = subsamplingS.onImageEventListener;
                if (subsamplingS != null) {
                   if (this.preview != null) {
                      subsamplingS.onPreviewLoadError(texception);
                   }else {
                      subsamplingS.onImageLoadError(texception);
                   }
                }
             }
          }
       }
       return;
    }
    public void onPostExecute(Object p0){
       this.onPostExecute(p0);
    }
}
