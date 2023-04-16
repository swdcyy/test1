package com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView$TileLoadTask;
import android.os.AsyncTask;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView$Tile;
import java.lang.ref.WeakReference;
import java.lang.Object;
import java.lang.Void;
import android.graphics.Bitmap;
import java.lang.Integer;
import java.lang.String;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import android.graphics.Rect;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.lang.Exception;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView$OnImageEventListener;

public class SubsamplingScaleImageView$TileLoadTask extends AsyncTask	// class@000fb9
{
    public final WeakReference decoderRef;
    public Exception exception;
    public final WeakReference tileRef;
    public final WeakReference viewRef;

    public void SubsamplingScaleImageView$TileLoadTask(SubsamplingScaleImageView p0,ImageRegionDecoder p1,SubsamplingScaleImageView$Tile p2){
       super();
       this.viewRef = new WeakReference(p0);
       this.decoderRef = new WeakReference(p1);
       this.tileRef = new WeakReference(p2);
       p2.loading = true;
    }
    public Bitmap doInBackground(Void[] p0){
       try{
          SubsamplingScaleImageView subsamplingS = this.viewRef.get();
          ImageRegionDecoder imageRegionD = this.decoderRef.get();
          SubsamplingScaleImageView$Tile tile = this.tileRef.get();
          int i = 0;
          if (imageRegionD != null && (tile != null && (subsamplingS != null && (imageRegionD.isReady() && tile.visible != null)))) {
             Object[] objArray = new Object[]{tile.sRect,Integer.valueOf(tile.sampleSize)};
             subsamplingS.debug("TileLoadTask.doInBackground, tile.sRect=%s, tile.sampleSize=%d", objArray);
             subsamplingS.decoderLock.readLock().lock();
             if (imageRegionD.isReady()) {
                subsamplingS.fileSRect(tile.sRect, tile.fileSRect);
                SubsamplingScaleImageView sRegion = subsamplingS.sRegion;
                if (sRegion != null) {
                   tile.fileSRect.offset(sRegion.left, sRegion.top);
                }
                subsamplingS.decoderLock.readLock().unlock();
                return imageRegionD.decodeRegion(tile.fileSRect, tile.sampleSize);
             }else {
                tile.loading = i;
                subsamplingS.decoderLock.readLock().unlock();
             }
          }else if(tile != null){
             tile.loading = i;
          }
       }catch(java.lang.Exception e8){
          this.exception = e8;
       }catch(java.lang.OutOfMemoryError e8){
          this.exception = new RuntimeException(e8);
       }
       return null;
    }
    public Object doInBackground(Object[] p0){
       return this.doInBackground(p0);
    }
    public void onPostExecute(Bitmap p0){
       SubsamplingScaleImageView subsamplingS = this.viewRef.get();
       SubsamplingScaleImageView$Tile tile = this.tileRef.get();
       if (subsamplingS != null && tile != null) {
          if (p0 != null) {
             tile.bitmap = p0;
             tile.loading = false;
             subsamplingS.onTileLoaded();
          }else {
             SubsamplingScaleImageView$TileLoadTask texception = this.exception;
             if (texception != null) {
                subsamplingS = subsamplingS.onImageEventListener;
                if (subsamplingS != null) {
                   subsamplingS.onTileLoadError(texception);
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
