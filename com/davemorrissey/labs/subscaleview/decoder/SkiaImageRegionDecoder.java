package com.davemorrissey.labs.subscaleview.decoder.SkiaImageRegionDecoder;
import com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder;
import android.graphics.Bitmap$Config;
import java.lang.Object;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import android.graphics.Rect;
import android.graphics.Bitmap;
import java.util.concurrent.locks.Lock;
import android.graphics.BitmapRegionDecoder;
import android.graphics.BitmapFactory$Options;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.IllegalStateException;
import java.util.concurrent.locks.ReadWriteLock;
import android.content.Context;
import android.net.Uri;
import android.graphics.Point;
import android.content.res.Resources;
import android.content.pm.PackageManager;
import java.util.List;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Integer;
import java.io.InputStream;
import android.content.res.AssetManager;
import com.kwai.plugin.dva.split.SplitAssetHelper;
import android.content.ContentResolver;

public class SkiaImageRegionDecoder implements ImageRegionDecoder	// class@000fc1
{
    public final Bitmap$Config bitmapConfig;
    public BitmapRegionDecoder decoder;
    public final ReadWriteLock decoderLock;

    public void SkiaImageRegionDecoder(){
       super(null);
    }
    public void SkiaImageRegionDecoder(Bitmap$Config p0){
       super();
       this.decoderLock = new ReentrantReadWriteLock(true);
       Bitmap$Config preferredBit = SubsamplingScaleImageView.getPreferredBitmapConfig();
       if (p0 != null) {
          this.bitmapConfig = p0;
       }else if(preferredBit != null){
          this.bitmapConfig = preferredBit;
       }else {
          this.bitmapConfig = Bitmap$Config.RGB_565;
       }
       return;
    }
    public Bitmap decodeRegion(Rect p0,int p1){
       this.getDecodeLock().lock();
       SkiaImageRegionDecoder tdecoder = this.decoder;
       if (tdecoder == null || tdecoder.isRecycled()) {
          throw new IllegalStateException("Cannot decode region after decoder has been recycled");
       }
       BitmapFactory$Options options = new BitmapFactory$Options();
       options.inSampleSize = p1;
       options.inPreferredConfig = this.bitmapConfig;
       Bitmap uBitmap = this.decoder.decodeRegion(p0, options);
       if (uBitmap == null) {
          throw new RuntimeException("Skia image decoder returned null bitmap - image format may not be supported");
       }
       this.getDecodeLock().unlock();
       return uBitmap;
    }
    public final Lock getDecodeLock(){
       return this.decoderLock.readLock();
    }
    public Point init(Context p0,Uri p1){
       int identifier;
       try{
          String str = p1.toString();
          if (str.startsWith("android.resource://")) {
             str = p1.getAuthority();
             Resources resources = ((p0.getPackageName()).equals(str))? p0.getResources(): p0.getPackageManager().getResourcesForApplication(str);
             List pathSegments = p1.getPathSegments();
             int i = pathSegments.size();
             if (i == 2 && (pathSegments.get(0)).equals("drawable")) {
                identifier = resources.getIdentifier(pathSegments.get(1), "drawable", str);
             }else if(i == 1 && TextUtils.isDigitsOnly(pathSegments.get(0))){
                try{
                   identifier = Integer.parseInt(pathSegments.get(0));
                }catch(java.lang.NumberFormatException e0){
                   identifier = 0;
                }
             }else {
                goto label_0066 ;
             }
          }else if(str.startsWith("file:///android_asset/")){
             this.decoder = BitmapRegionDecoder.newInstance(SplitAssetHelper.open(p0.getAssets(), str.substring(22), 1), 0);
          }else if(str.startsWith("file://")){
             this.decoder = BitmapRegionDecoder.newInstance(str.substring(7), 0);
          }else {
             InputStream inputStream = p0.getContentResolver().openInputStream(p1);
             this.decoder = BitmapRegionDecoder.newInstance(inputStream, 0);
             if (inputStream != null) {
                inputStream.close();
             }
          }
          return new Point(this.decoder.getWidth(), this.decoder.getHeight());
       }catch(java.lang.Exception e0){
       }
    }
    public synchronized boolean isReady(){
       SkiaImageRegionDecoder tdecoder = this.decoder;
       boolean b = (tdecoder != null && !tdecoder.isRecycled())? true: false;
       return b;
    }
    public synchronized void recycle(){
       this.decoderLock.writeLock().lock();
       this.decoder.recycle();
       this.decoder = null;
       this.decoderLock.writeLock().unlock();
    }
}
