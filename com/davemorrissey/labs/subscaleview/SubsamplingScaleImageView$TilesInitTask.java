package com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView$TilesInitTask;
import android.os.AsyncTask;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import android.content.Context;
import com.davemorrissey.labs.subscaleview.decoder.DecoderFactory;
import android.net.Uri;
import java.lang.ref.WeakReference;
import java.lang.Object;
import java.lang.Void;
import java.lang.String;
import com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder;
import android.graphics.Point;
import android.graphics.Rect;
import java.lang.Math;
import java.lang.Exception;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView$OnImageEventListener;

public class SubsamplingScaleImageView$TilesInitTask extends AsyncTask	// class@000fba
{
    public final WeakReference contextRef;
    public ImageRegionDecoder decoder;
    public final WeakReference decoderFactoryRef;
    public Exception exception;
    public final Uri source;
    public final WeakReference viewRef;

    public void SubsamplingScaleImageView$TilesInitTask(SubsamplingScaleImageView p0,Context p1,DecoderFactory p2,Uri p3){
       super();
       this.viewRef = new WeakReference(p0);
       this.contextRef = new WeakReference(p1);
       this.decoderFactoryRef = new WeakReference(p2);
       this.source = p3;
    }
    public Object doInBackground(Object[] p0){
       return this.doInBackground(p0);
    }
    public int[] doInBackground(Void[] p0){
       int i;
       try{
          String str = this.source.toString();
          Context uContext = this.contextRef.get();
          DecoderFactory uDecoderFact = this.decoderFactoryRef.get();
          SubsamplingScaleImageView subsamplingS = this.viewRef.get();
          if (uContext != null && (uDecoderFact != null && subsamplingS != null)) {
             Object[] objArray = new Object[0];
             subsamplingS.debug("TilesInitTask.doInBackground", objArray);
             ImageRegionDecoder imageRegionD = uDecoderFact.make();
             this.decoder = imageRegionD;
             Point point = imageRegionD.init(uContext, this.source);
             Point x = point.x;
             point = point.y;
             int exifOrientat = subsamplingS.getExifOrientation(uContext, str);
             SubsamplingScaleImageView sRegion = subsamplingS.sRegion;
             if (sRegion != null) {
                sRegion.left = Math.max(0, sRegion.left);
                sRegion = subsamplingS.sRegion;
                sRegion.top = Math.max(0, sRegion.top);
                sRegion = subsamplingS.sRegion;
                sRegion.right = Math.min(x, sRegion.right);
                sRegion = subsamplingS.sRegion;
                sRegion.bottom = Math.min(point, sRegion.bottom);
                x = subsamplingS.sRegion.width();
                i = subsamplingS.sRegion.height();
             }
             int[] ointArray = new int[]{x,i,exifOrientat};
             return ointArray;
          }
       }catch(java.lang.Exception e7){
          this.exception = e7;
       }
       return null;
    }
    public void onPostExecute(Object p0){
       this.onPostExecute(p0);
    }
    public void onPostExecute(int[] p0){
       SubsamplingScaleImageView subsamplingS = this.viewRef.get();
       if (subsamplingS != null) {
          SubsamplingScaleImageView$TilesInitTask tdecoder = this.decoder;
          if (tdecoder != null && (p0 != null && p0.length == 3)) {
             subsamplingS.onTilesInited(tdecoder, p0[0], p0[1], p0[2]);
          }else {
             SubsamplingScaleImageView$TilesInitTask texception = this.exception;
             if (texception != null) {
                subsamplingS = subsamplingS.onImageEventListener;
                if (subsamplingS != null) {
                   subsamplingS.onImageLoadError(texception);
                }
             }
          }
       }
       return;
    }
}
