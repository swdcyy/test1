package com.davemorrissey.labs.subscaleview.decoder.SkiaPooledImageRegionDecoder;
import com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder;
import android.graphics.Bitmap$Config;
import java.lang.Object;
import com.davemorrissey.labs.subscaleview.decoder.SkiaPooledImageRegionDecoder$DecoderPool;
import com.davemorrissey.labs.subscaleview.decoder.SkiaPooledImageRegionDecoder$1;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import android.graphics.Point;
import java.util.concurrent.atomic.AtomicBoolean;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.lang.String;
import java.lang.StringBuilder;
import android.graphics.Rect;
import android.graphics.Bitmap;
import java.lang.Thread;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import android.graphics.BitmapRegionDecoder;
import android.graphics.BitmapFactory$Options;
import java.lang.RuntimeException;
import java.lang.IllegalStateException;
import java.io.File;
import com.davemorrissey.labs.subscaleview.decoder.SkiaPooledImageRegionDecoder$1CpuFilter;
import java.io.FileFilter;
import java.lang.Runtime;
import android.content.Context;
import android.net.Uri;
import android.content.res.Resources;
import android.content.pm.PackageManager;
import java.util.List;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Integer;
import android.content.res.AssetFileDescriptor;
import java.io.InputStream;
import android.content.res.AssetManager;
import com.kwai.plugin.dva.split.SplitAssetHelper;
import android.content.ContentResolver;
import android.app.ActivityManager;
import android.app.ActivityManager$MemoryInfo;

public class SkiaPooledImageRegionDecoder implements ImageRegionDecoder	// class@000fc5
{
    public final Bitmap$Config bitmapConfig;
    public Context context;
    public final ReadWriteLock decoderLock;
    public SkiaPooledImageRegionDecoder$DecoderPool decoderPool;
    public long fileLength;
    public Point imageDimensions;
    public final AtomicBoolean lazyInited;
    public Uri uri;
    public static final String TAG = "SkiaPooledImageRegionDecoder";
    public static boolean debug;

    public void SkiaPooledImageRegionDecoder(){
       super(null);
    }
    public void SkiaPooledImageRegionDecoder(Bitmap$Config p0){
       super();
       this.decoderPool = new SkiaPooledImageRegionDecoder$DecoderPool(null);
       this.decoderLock = new ReentrantReadWriteLock(true);
       this.fileLength = Long.MAX_VALUE;
       this.imageDimensions = new Point(0, 0);
       this.lazyInited = new AtomicBoolean(0);
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
    public static void setDebug(boolean p0){
       SkiaPooledImageRegionDecoder.debug = p0;
    }
    public boolean allowAdditionalDecoder(int p0,long p1){
       if (p0 >= 4) {
          this.debug("No additional decoders allowed, reached hard limit \(4\)");
          return false;
       }else {
          long l = (long)p0 * p1;
          if (l - 0x1400000 > 0) {
             this.debug("No additional encoders allowed, reached hard memory limit \(20Mb\)");
             return false;
          }else if(p0 >= this.getNumberOfCores()){
             this.debug("No additional encoders allowed, limited by CPU cores \("+this.getNumberOfCores()+"\)");
             return false;
          }else if(this.isLowMemory()){
             this.debug("No additional encoders allowed, memory is low");
             return false;
          }else {
             this.debug("Additional decoder allowed, current count is "+p0+", estimated native memory "+(l / 0x100000)+"Mb");
             return true;
          }
       }
    }
    public void debug(String p0){
    }
    public Bitmap decodeRegion(Rect p0,int p1){
       this.debug("Decode region "+p0+" on thread "+Thread.currentThread().getName());
       if (p0.width() < this.imageDimensions.x || p0.height() < this.imageDimensions.y) {
          this.lazyInit();
       }
       this.decoderLock.readLock().lock();
       SkiaPooledImageRegionDecoder tdecoderPool = this.decoderPool;
       if (tdecoderPool != null) {
          BitmapRegionDecoder uBitmapRegio = tdecoderPool.acquire();
          if (uBitmapRegio != null && !uBitmapRegio.isRecycled()) {
             BitmapFactory$Options options = new BitmapFactory$Options();
             options.inSampleSize = p1;
             options.inPreferredConfig = this.bitmapConfig;
             Bitmap uBitmap = uBitmapRegio.decodeRegion(p0, options);
             if (uBitmap != null) {
                this.decoderPool.release(uBitmapRegio);
                this.decoderLock.readLock().unlock();
                return uBitmap;
             }else {
                throw new RuntimeException("Skia image decoder returned null bitmap - image format may not be supported");
             }
          }else if(uBitmapRegio != null){
             this.decoderPool.release(uBitmapRegio);
          }
       }
       throw new IllegalStateException("Cannot decode region after decoder has been recycled");
    }
    public final int getNumCoresOldPhones(){
       try{
          return new File("/sys/devices/system/cpu/").listFiles(new SkiaPooledImageRegionDecoder$1CpuFilter(this)).length;
       }catch(java.lang.Exception e0){
          return 1;
       }
    }
    public final int getNumberOfCores(){
       return Runtime.getRuntime().availableProcessors();
    }
    public Point init(Context p0,Uri p1){
       this.context = p0;
       this.uri = p1;
       this.initialiseDecoder();
       return this.imageDimensions;
    }
    public void initialiseDecoder(){
       int identifier;
       BitmapRegionDecoder uBitmapRegio;
       SkiaPooledImageRegionDecoder tdecoderPool;
       String str = this.uri.toString();
       int i = 1;
       int i1 = 0;
       long l = Long.MAX_VALUE;
       if (str.startsWith("android.resource://")) {
          str = this.uri.getAuthority();
          Resources resources = ((this.context.getPackageName()).equals(str))? this.context.getResources(): this.context.getPackageManager().getResourcesForApplication(str);
          List pathSegments = this.uri.getPathSegments();
          int i2 = pathSegments.size();
          if (i2 == 2 && (pathSegments.get(i1)).equals("drawable")) {
             identifier = resources.getIdentifier(pathSegments.get(i), "drawable", str);
          }else if(i2 == i && TextUtils.isDigitsOnly(pathSegments.get(i1))){
             try{
                identifier = Integer.parseInt(pathSegments.get(i1));
             }catch(java.lang.NumberFormatException e0){
                identifier = 0;
             }
          }else {
             goto label_0077 ;
          }
       }else if(str.startsWith("file:///android_asset/")){
          str = str.substring(22);
          l = SplitAssetHelper.openFd(this.context.getAssets(), str).getLength();
          uBitmapRegio = BitmapRegionDecoder.newInstance(SplitAssetHelper.open(this.context.getAssets(), e0, i), i1);
       }else if(str.startsWith("file://")){
          BitmapRegionDecoder uBitmapRegio1 = BitmapRegionDecoder.newInstance(str.substring(7), i1);
          File uFile = new File(str);
          if (uFile.exists()) {
             l = uFile.length();
          }
          uBitmapRegio = uBitmapRegio1;
       }else {
          ContentResolver contentResol = this.context.getContentResolver();
          InputStream inputStream = contentResol.openInputStream(this.uri);
          BitmapRegionDecoder uBitmapRegio2 = BitmapRegionDecoder.newInstance(inputStream, i1);
          try{
             AssetFileDescriptor uAssetFileDe = contentResol.openAssetFileDescriptor(this.uri, "r");
             if (uAssetFileDe != null) {
                l = uAssetFileDe.getLength();
             }
          }catch(java.lang.Exception e0){
          }
          if (e0 != null) {
             e0.close();
          }
          uBitmapRegio = uBitmapRegio2;
       }
    }
    public final boolean isLowMemory(){
       ActivityManager systemServic = this.context.getSystemService("activity");
       if (systemServic == null) {
          return true;
       }
       ActivityManager$MemoryInfo memoryInfo = new ActivityManager$MemoryInfo();
       systemServic.getMemoryInfo(memoryInfo);
       return memoryInfo.lowMemory;
    }
    public synchronized boolean isReady(){
       SkiaPooledImageRegionDecoder tdecoderPool = this.decoderPool;
       boolean b = (tdecoderPool != null && !tdecoderPool.isEmpty())? true: false;
       return b;
    }
    public final void lazyInit(){
       if (this.lazyInited.compareAndSet(false, true) && this.fileLength - Long.MAX_VALUE < 0) {
          this.debug("Starting lazy init of additional decoders");
          new SkiaPooledImageRegionDecoder$1(this).start();
       }
       return;
    }
    public synchronized void recycle(){
       this.decoderLock.writeLock().lock();
       SkiaPooledImageRegionDecoder tdecoderPool = this.decoderPool;
       if (tdecoderPool != null) {
          tdecoderPool.recycle();
          SkiaPooledImageRegionDecoder$DecoderPool uDecoderPool = null;
          this.decoderPool = uDecoderPool;
          this.context = uDecoderPool;
          this.uri = uDecoderPool;
       }
       this.decoderLock.writeLock().unlock();
       return;
    }
}
