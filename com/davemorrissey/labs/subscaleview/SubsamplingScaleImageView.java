package com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import android.view.View;
import java.lang.Integer;
import java.lang.Object;
import java.util.List;
import java.util.Arrays;
import android.content.Context;
import android.util.AttributeSet;
import android.os.AsyncTask;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import com.davemorrissey.labs.subscaleview.decoder.CompatDecoderFactory;
import com.davemorrissey.labs.subscaleview.decoder.SkiaImageDecoder;
import java.lang.Class;
import com.davemorrissey.labs.subscaleview.decoder.SkiaImageRegionDecoder;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.os.Handler;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView$1;
import android.os.Handler$Callback;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.String;
import com.davemorrissey.labs.subscaleview.ImageSource;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View$OnLongClickListener;
import android.graphics.Bitmap$Config;
import android.graphics.PointF;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView$AnimationBuilder;
import java.lang.Math;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView$OnImageEventListener;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.Void;
import java.util.concurrent.Executor;
import android.graphics.Rect;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView$ScaleAndTranslate;
import android.content.ContentResolver;
import android.net.Uri;
import android.database.Cursor;
import j2.a;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.RectF;
import com.davemorrissey.labs.subscaleview.ImageViewState;
import com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView$BitmapLoadTask;
import com.davemorrissey.labs.subscaleview.decoder.DecoderFactory;
import java.util.Map;
import java.util.Iterator;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView$Tile;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView$TileLoadTask;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.Set;
import java.util.Map$Entry;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView$Anim;
import java.lang.System;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView$OnAnimationEventListener;
import android.graphics.Matrix;
import android.graphics.Bitmap;
import java.util.Locale;
import java.lang.Float;
import android.view.View$MeasureSpec;
import android.view.MotionEvent;
import android.view.GestureDetector;
import android.view.ViewParent;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView$OnStateChangedListener;
import java.lang.IllegalArgumentException;
import java.util.Objects;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView$2;
import android.view.GestureDetector$OnGestureListener;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView$3;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView$TilesInitTask;

public class SubsamplingScaleImageView extends View	// class@000fbb
{
    public SubsamplingScaleImageView$Anim anim;
    public Bitmap bitmap;
    public DecoderFactory bitmapDecoderFactory;
    public boolean bitmapIsCached;
    public boolean bitmapIsPreview;
    public Paint bitmapPaint;
    public boolean debug;
    public Paint debugLinePaint;
    public Paint debugTextPaint;
    public ImageRegionDecoder decoder;
    public final ReadWriteLock decoderLock;
    public float density;
    public GestureDetector detector;
    public int doubleTapZoomDuration;
    public float doubleTapZoomScale;
    public int doubleTapZoomStyle;
    public float[] dstArray;
    public boolean eagerLoadingEnabled;
    public Executor executor;
    public int fullImageSampleSize;
    public Handler handler;
    public boolean imageLoadedSent;
    public boolean isPanning;
    public boolean isQuickScaling;
    public boolean isZooming;
    public Matrix matrix;
    public float maxScale;
    public int maxTileHeight;
    public int maxTileWidth;
    public int maxTouchCount;
    public float minScale;
    public int minimumScaleType;
    public int minimumTileDpi;
    public SubsamplingScaleImageView$OnImageEventListener onImageEventListener;
    public View$OnLongClickListener onLongClickListener;
    public SubsamplingScaleImageView$OnStateChangedListener onStateChangedListener;
    public int orientation;
    public Rect pRegion;
    public boolean panEnabled;
    public int panLimit;
    public Float pendingScale;
    public boolean quickScaleEnabled;
    public float quickScaleLastDistance;
    public boolean quickScaleMoved;
    public PointF quickScaleSCenter;
    public final float quickScaleThreshold;
    public PointF quickScaleVLastPoint;
    public PointF quickScaleVStart;
    public boolean readySent;
    public DecoderFactory regionDecoderFactory;
    public int sHeight;
    public int sOrientation;
    public PointF sPendingCenter;
    public RectF sRect;
    public Rect sRegion;
    public PointF sRequestedCenter;
    public int sWidth;
    public SubsamplingScaleImageView$ScaleAndTranslate satTemp;
    public float scale;
    public float scaleStart;
    public GestureDetector singleDetector;
    public float[] srcArray;
    public Paint tileBgPaint;
    public Map tileMap;
    public Uri uri;
    public PointF vCenterStart;
    public float vDistStart;
    public PointF vTranslate;
    public PointF vTranslateBefore;
    public PointF vTranslateStart;
    public boolean zoomEnabled;
    public static final String TAG;
    public static int TILE_SIZE_AUTO;
    public static final List VALID_EASING_STYLES;
    public static final List VALID_ORIENTATIONS;
    public static final List VALID_PAN_LIMITS;
    public static final List VALID_SCALE_TYPES;
    public static final List VALID_ZOOM_STYLES;
    public static Bitmap$Config preferredBitmapConfig;

    static {
       SubsamplingScaleImageView.TAG = "SubsamplingScaleImageView";
       Integer[] integerArray = new Integer[]{Integer.valueOf(0),Integer.valueOf(90),Integer.valueOf(180),Integer.valueOf(270),Integer.valueOf(-1)};
       Integer integer = Integer.valueOf(1);
       Integer integer1 = Integer.valueOf(2);
       Integer integer2 = Integer.valueOf(3);
       SubsamplingScaleImageView.VALID_ORIENTATIONS = Arrays.asList(integerArray);
       integerArray = new Integer[]{integer,integer1,integer2};
       SubsamplingScaleImageView.VALID_ZOOM_STYLES = Arrays.asList(integerArray);
       integerArray = new Integer[]{integer1,integer};
       SubsamplingScaleImageView.VALID_EASING_STYLES = Arrays.asList(integerArray);
       integerArray = new Integer[]{integer,integer1,integer2};
       SubsamplingScaleImageView.VALID_PAN_LIMITS = Arrays.asList(integerArray);
       integerArray = new Integer[]{integer1,integer,integer2,Integer.valueOf(4)};
       SubsamplingScaleImageView.VALID_SCALE_TYPES = Arrays.asList(integerArray);
       SubsamplingScaleImageView.TILE_SIZE_AUTO = Integer.MAX_VALUE;
    }
    public void SubsamplingScaleImageView(Context p0){
       super(p0, null);
    }
    public void SubsamplingScaleImageView(Context p0,AttributeSet p1){
       super(p0, p1);
       int i = 0;
       this.orientation = i;
       this.maxScale = 2.00f;
       this.minScale = this.minScale();
       this.minimumTileDpi = -1;
       this.panLimit = 1;
       this.minimumScaleType = 1;
       int tILE_SIZE_AU = SubsamplingScaleImageView.TILE_SIZE_AUTO;
       this.maxTileWidth = tILE_SIZE_AU;
       this.maxTileHeight = tILE_SIZE_AU;
       this.executor = AsyncTask.THREAD_POOL_EXECUTOR;
       this.eagerLoadingEnabled = true;
       this.panEnabled = true;
       this.zoomEnabled = true;
       this.quickScaleEnabled = true;
       this.doubleTapZoomScale = 0x3f800000;
       this.doubleTapZoomStyle = 1;
       this.doubleTapZoomDuration = 500;
       this.decoderLock = new ReentrantReadWriteLock(1);
       this.bitmapDecoderFactory = new CompatDecoderFactory(SkiaImageDecoder.class);
       this.regionDecoderFactory = new CompatDecoderFactory(SkiaImageRegionDecoder.class);
       float[] uofloatArray = new float[8];
       this.srcArray = uofloatArray;
       float[] uofloatArray1 = new float[8];
       this.dstArray = uofloatArray1;
       this.density = c.c(this.getResources()).density;
       this.setMinimumDpi(160);
       this.setDoubleTapZoomDpi(160);
       this.setMinimumTileDpi(320);
       this.setGestureDetector(p0);
       this.handler = new Handler(new SubsamplingScaleImageView$1(this));
       if (p1 != null) {
          TypedArray typedArray = this.getContext().obtainStyledAttributes(p1, c$b.z5);
          if (typedArray.hasValue(i)) {
             String str = typedArray.getString(i);
             if (str != null && str.length() > 0) {
                this.setImage(ImageSource.asset(str).tilingEnabled());
             }
          }
          tILE_SIZE_AU = 3;
          if (typedArray.hasValue(tILE_SIZE_AU)) {
             tILE_SIZE_AU = typedArray.getResourceId(tILE_SIZE_AU, i);
             if (tILE_SIZE_AU > 0) {
                this.setImage(ImageSource.resource(tILE_SIZE_AU).tilingEnabled());
             }
          }
          if (typedArray.hasValue(1)) {
             this.setPanEnabled(typedArray.getBoolean(1, 1));
          }
          tILE_SIZE_AU = 5;
          if (typedArray.hasValue(tILE_SIZE_AU)) {
             this.setZoomEnabled(typedArray.getBoolean(tILE_SIZE_AU, 1));
          }
          tILE_SIZE_AU = 2;
          if (typedArray.hasValue(tILE_SIZE_AU)) {
             this.setQuickScaleEnabled(typedArray.getBoolean(tILE_SIZE_AU, 1));
          }
          if (typedArray.hasValue(4)) {
             this.setTileBackgroundColor(typedArray.getColor(4, Color.argb(i, i, i, i)));
          }
          typedArray.recycle();
       }
       this.quickScaleThreshold = TypedValue.applyDimension(1, 20.00f, c.c(p0.getResources()));
       return;
    }
    public static void access$201(SubsamplingScaleImageView p0,View$OnLongClickListener p1){
       super.setOnLongClickListener(p1);
    }
    public static void access$301(SubsamplingScaleImageView p0,View$OnLongClickListener p1){
       super.setOnLongClickListener(p1);
    }
    public static Bitmap$Config getPreferredBitmapConfig(){
       return SubsamplingScaleImageView.preferredBitmapConfig;
    }
    public static void setPreferredBitmapConfig(Bitmap$Config p0){
       SubsamplingScaleImageView.preferredBitmapConfig = p0;
    }
    public SubsamplingScaleImageView$AnimationBuilder animateCenter(PointF p0){
       if (!this.isReady()) {
          return null;
       }
       return new SubsamplingScaleImageView$AnimationBuilder(this, p0, null);
    }
    public SubsamplingScaleImageView$AnimationBuilder animateScale(float p0){
       if (!this.isReady()) {
          return null;
       }
       return new SubsamplingScaleImageView$AnimationBuilder(this, p0, null);
    }
    public SubsamplingScaleImageView$AnimationBuilder animateScaleAndCenter(float p0,PointF p1){
       if (!this.isReady()) {
          return null;
       }
       return new SubsamplingScaleImageView$AnimationBuilder(this, p0, p1, null);
    }
    public final int calculateInSampleSize(float p0){
       float f;
       float f1;
       if (this.minimumTileDpi > null) {
          DisplayMetrics uDisplayMetr = c.c(this.getResources());
          f = uDisplayMetr.xdpi + uDisplayMetr.ydpi;
          f = f / 2.00f;
          f1 = (float)this.minimumTileDpi / f;
          p0 = p0 * f1;
       }
       f1 = (float)this.sWidth() * p0;
       int i = (int)f1;
       f = (float)this.sHeight() * p0;
       int i1 = (int)f;
       if (!i || !i1) {
          return 32;
       }else {
          int i2 = 1;
          if (this.sHeight() > i1 || this.sWidth() > i) {
             f = (float)this.sHeight() / (float)i1;
             i1 = Math.round(f);
             f = (float)this.sWidth() / (float)i;
             i = Math.round(f);
             if (i1 >= i) {
                i1 = i;
             }
          }else {
             i1 = 1;
          }
          i = i2 * 2;
          while (i < i1) {
             i2 = i;
          }
          return i2;
       }
    }
    public final boolean checkImageLoaded(){
       boolean b = this.isBaseLayerReady();
       if (this.imageLoadedSent == null && b) {
          this.preDraw();
          this.imageLoadedSent = true;
          this.onImageLoaded();
          SubsamplingScaleImageView tonImageEven = this.onImageEventListener;
          if (tonImageEven != null) {
             tonImageEven.onImageLoaded();
          }
       }
       return b;
    }
    public final boolean checkReady(){
       boolean b = true;
       boolean b1 = (this.getWidth() > 0 && (this.getHeight() > 0 && (this.sWidth > null && (this.sHeight > null && (this.bitmap != null || this.isBaseLayerReady())))))? true: false;
       if (this.readySent == null && b1) {
          this.preDraw();
          this.readySent = b;
          this.onReady();
          SubsamplingScaleImageView tonImageEven = this.onImageEventListener;
          if (tonImageEven != null) {
             tonImageEven.onReady();
          }
       }
       return b1;
    }
    public final void createPaints(){
       Paint paint;
       boolean b = true;
       if (this.bitmapPaint == null) {
          paint = new Paint();
          this.bitmapPaint = paint;
          paint.setAntiAlias(b);
          this.bitmapPaint.setFilterBitmap(b);
          this.bitmapPaint.setDither(b);
       }
       if (this.debugTextPaint == null || (this.debugLinePaint == null && this.debug != null)) {
          paint = new Paint();
          this.debugTextPaint = paint;
          paint.setTextSize((float)this.px(12));
          this.debugTextPaint.setColor(-65281);
          this.debugTextPaint.setStyle(Paint$Style.FILL);
          paint = new Paint();
          this.debugLinePaint = paint;
          paint.setColor(-65281);
          this.debugLinePaint.setStyle(Paint$Style.STROKE);
          this.debugLinePaint.setStrokeWidth((float)this.px(b));
       }
       return;
    }
    public void debug(String p0,Object[] p1){
       if (this.debug != null) {
          String.format(p0, p1);
       }
       return;
    }
    public final float distance(float p0,float p1,float p2,float p3){
       return (float)Math.sqrt((double)(((p0 - p1) * (p0 - p1)) + ((p2 - p3) * (p2 - p3))));
    }
    public void doubleTapZoom(PointF p0,PointF p1){
       SubsamplingScaleImageView tsRequestedC;
       SubsamplingScaleImageView subsamplingS = 2;
       if (this.panEnabled == null) {
          tsRequestedC = this.sRequestedCenter;
          if (tsRequestedC != null) {
             p0.x = tsRequestedC.x;
             p0.y = tsRequestedC.y;
          }else {
             p0.x = (float)(this.sWidth() / subsamplingS);
             p0.y = (float)(this.sHeight() / subsamplingS);
          }
       }
       float f = Math.min(this.maxScale, this.doubleTapZoomScale);
       SubsamplingScaleImageView tscale = this.scale;
       tscale = ((double)tscale - ((double)f * 0x3feccccccccccccd) <= 0 || !tscale - this.minScale)? 1: 0;
       if (!tscale) {
          f = this.minScale();
       }
       float f1 = f;
       tsRequestedC = this.doubleTapZoomStyle;
       if (tsRequestedC == 3) {
          this.setScaleAndCenter(f1, p0);
       }else if(tsRequestedC != subsamplingS && (!tscale || this.panEnabled == null)){
          new SubsamplingScaleImageView$AnimationBuilder(this, f1, p0, null).withInterruptible(false).withDuration((long)this.doubleTapZoomDuration).withOrigin(4).start();
       }else if(tsRequestedC == 1){
          SubsamplingScaleImageView$AnimationBuilder uAnimationBu = new SubsamplingScaleImageView$AnimationBuilder(this, f1, p0, p1, null);
          v7.withInterruptible(false).withDuration((long)this.doubleTapZoomDuration).withOrigin(4).start();
       }
       this.invalidate();
       return;
    }
    public final float ease(int p0,long p1,float p2,float p3,long p4){
       if (p0 == 1) {
          return this.easeOutQuad(p1, p2, p3, p4);
       }
       if (p0 == 2) {
          return this.easeInOutQuad(p1, p2, p3, p4);
       }
       throw new IllegalStateException("Unexpected easing type: "+p0);
    }
    public final float easeInOutQuad(long p0,float p1,float p2,long p3){
       float f = 2.00f;
       float f1 = (float)p0 / ((float)p3 / f);
       if (f1 - 0x3f800000 < 0) {
          p2 = (p2 / f) * f1;
       }else {
          f1 = f1 - 0x3f800000;
          p2 = (- p2) / f;
          f1 = (f1 * (f1 - f)) - 0x3f800000;
       }
       return ((p2 * f1) + p1);
    }
    public final float easeOutQuad(long p0,float p1,float p2,long p3){
       float f = (float)p0 / (float)p3;
       float f1 = (- p2) * f;
       return ((f1 * (f - 2.00f)) + p1);
    }
    public final void execute(AsyncTask p0){
       Void[] voidArray = new Void[0];
       p0.executeOnExecutor(this.executor, voidArray);
    }
    public void fileSRect(Rect p0,Rect p1){
       SubsamplingScaleImageView tsWidth;
       int i1;
       if (!this.getRequiredRotation()) {
          p1.set(p0);
       }else if(this.getRequiredRotation() == 90){
          SubsamplingScaleImageView tsHeight = this.sHeight;
          int i = tsHeight - p0.right;
          p1.set(p0.top, i, p0.bottom, (tsHeight - p0.left));
       }else if(this.getRequiredRotation() == 180){
          tsWidth = this.sWidth;
          i1 = tsWidth - p0.right;
          SubsamplingScaleImageView tsHeight1 = this.sHeight;
          int i2 = tsHeight1 - p0.bottom;
          p1.set(i1, i2, (tsWidth - p0.left), (tsHeight1 - p0.top));
       }else {
          tsWidth = this.sWidth;
          i1 = tsWidth - p0.bottom;
          p1.set(i1, p0.left, (tsWidth - p0.top), p0.right);
       }
       return;
    }
    public final void fitToBounds(boolean p0){
       int i;
       float f = 0;
       if (this.vTranslate == null) {
          i = 1;
          this.vTranslate = new PointF(f, f);
       }else {
          i = 0;
       }
       if (this.satTemp == null) {
          this.satTemp = new SubsamplingScaleImageView$ScaleAndTranslate(f, new PointF(f, f), null);
       }
       SubsamplingScaleImageView tsatTemp = this.satTemp;
       tsatTemp.scale = this.scale;
       tsatTemp.vTranslate.set(this.vTranslate);
       this.fitToBounds(p0, this.satTemp);
       SubsamplingScaleImageView tsatTemp1 = this.satTemp;
       this.scale = tsatTemp1.scale;
       this.vTranslate.set(tsatTemp1.vTranslate);
       if (i && this.minimumScaleType != 4) {
          this.vTranslate.set(this.vTranslateForSCenter((float)(this.sWidth() / 2), (float)(this.sHeight() / 2), this.scale));
       }
       return;
    }
    public void fitToBounds(boolean p0,SubsamplingScaleImageView$ScaleAndTranslate p1){
       float f4;
       float f5;
       int i = 0;
       int i1 = 2;
       if (this.panLimit == i1 && this.isReady()) {
          int i2 = 0;
       }
       SubsamplingScaleImageView$ScaleAndTranslate vTranslate = p1.vTranslate;
       float f = this.limitedScale(p1.scale);
       float f1 = (float)this.sWidth() * f;
       float f2 = (float)this.sHeight() * f;
       boolean b = 3;
       if (this.panLimit == b && this.isReady()) {
          vTranslate.x = Math.max(vTranslate.x, ((float)(this.getWidth() / i1) - f1));
          vTranslate.y = Math.max(vTranslate.y, ((float)(this.getHeight() / i1) - f2));
       }else if(i2){
          vTranslate.x = Math.max(vTranslate.x, ((float)this.getWidth() - f1));
          vTranslate.y = Math.max(vTranslate.y, ((float)this.getHeight() - f2));
       }else {
          vTranslate.x = Math.max(vTranslate.x, (- f1));
          vTranslate.y = Math.max(vTranslate.y, (- f2));
       }
       int i3 = 0x3f000000;
       float f3 = (this.getPaddingLeft() > 0 || this.getPaddingRight() > 0)? (float)this.getPaddingLeft() / (float)(this.getPaddingLeft() + this.getPaddingRight()): 0x3f000000;
       if (this.getPaddingTop() > 0 || this.getPaddingBottom() > 0) {
          i3 = (float)this.getPaddingTop() / (float)(this.getPaddingTop() + this.getPaddingBottom());
       }
       if (this.panLimit == b && this.isReady()) {
          f4 = (float)Math.max(i, (this.getWidth() / i1));
          i = Math.max(i, (this.getHeight() / i1));
       }else if(i2){
          f4 = Math.max(0, (((float)this.getWidth() - f1) * f3));
          f5 = Math.max(0, (((float)this.getHeight() - f2) * i3));
       label_0108 :
          vTranslate.x = Math.min(vTranslate.x, f4);
          vTranslate.y = Math.min(vTranslate.y, f5);
          p1.scale = f;
          return;
       }else {
          f4 = (float)Math.max(i, this.getWidth());
          i = Math.max(i, this.getHeight());
       }
       f5 = (float)i;
       goto label_0108 ;
    }
    public final int getAppliedOrientation(){
       return this.getRequiredRotation();
    }
    public final PointF getCenter(){
       return this.viewToSourceCoord((float)(this.getWidth() / 2), (float)(this.getHeight() / 2));
    }
    public int getExifOrientation(Context p0,String p1){
       int intx;
       int i = 0;
       if (p1.startsWith("content")) {
          Cursor uCursor = null;
          try{
             String[] stringArray = new String[]{"orientation"};
             uCursor = p0.getContentResolver().query(Uri.parse(p1), stringArray, null, null, null);
             if (uCursor != null && uCursor.moveToFirst()) {
                intx = uCursor.getInt(i);
                if (SubsamplingScaleImageView.VALID_ORIENTATIONS.contains(Integer.valueOf(intx)) && intx != -1) {
                   i = intx;
                }
             }
             if (uCursor != null) {
             }
          }catch(java.lang.Exception e0){
             if (e0) {
             }
          }
          e0.close();
       }else if(p1.startsWith("file:///") && !p1.startsWith("file:///android_asset/")){
          try{
             intx = new a(p1.substring(7)).f("Orientation", 1);
             if (intx != 1 && intx) {
                if (intx == 6) {
                   i = 90;
                }else if(intx == 3){
                   i = 180;
                }else if(intx == 8){
                   i = 270;
                }
             }
          }catch(java.lang.Exception e0){
          }
       }
       return i;
    }
    public final Point getMaxBitmapDimensions(Canvas p0){
       return new Point(Math.min(p0.getMaximumBitmapWidth(), this.maxTileWidth), Math.min(p0.getMaximumBitmapHeight(), this.maxTileHeight));
    }
    public float getMaxScale(){
       return this.maxScale;
    }
    public final float getMinScale(){
       return this.minScale();
    }
    public final int getOrientation(){
       return this.orientation;
    }
    public final void getPanRemaining(RectF p0){
       if (!this.isReady()) {
          return;
       }
       float f = this.scale * (float)this.sWidth();
       float f1 = this.scale * (float)this.sHeight();
       SubsamplingScaleImageView tpanLimit = this.panLimit;
       if (tpanLimit == 3) {
          p0.top = Math.max(0, (- (this.vTranslate.y - (float)(this.getHeight() / 2))));
          p0.left = Math.max(0, (- (this.vTranslate.x - (float)(this.getWidth() / 2))));
          p0.bottom = Math.max(0, (this.vTranslate.y - ((float)(this.getHeight() / 2) - f1)));
          p0.right = Math.max(0, (this.vTranslate.x - ((float)(this.getWidth() / 2) - f)));
       }else if(tpanLimit == 2){
          p0.top = Math.max(0, (- (this.vTranslate.y - (float)this.getHeight())));
          p0.left = Math.max(0, (- (this.vTranslate.x - (float)this.getWidth())));
          p0.bottom = Math.max(0, (this.vTranslate.y + f1));
          p0.right = Math.max(0, (this.vTranslate.x + f));
       }else {
          p0.top = Math.max(0, (- this.vTranslate.y));
          p0.left = Math.max(0, (- this.vTranslate.x));
          p0.bottom = Math.max(0, ((f1 + this.vTranslate.y) - (float)this.getHeight()));
          p0.right = Math.max(0, ((f + this.vTranslate.x) - (float)this.getWidth()));
       }
       return;
    }
    public final int getRequiredRotation(){
       SubsamplingScaleImageView torientation = this.orientation;
       if (torientation == -1) {
          torientation = this.sOrientation;
       }
       return torientation;
    }
    public final int getSHeight(){
       return this.sHeight;
    }
    public final int getSWidth(){
       return this.sWidth;
    }
    public final float getScale(){
       return this.scale;
    }
    public final ImageViewState getState(){
       if (this.vTranslate != null && (this.sWidth > null && this.sHeight > null)) {
          return new ImageViewState(this.getScale(), this.getCenter(), this.getOrientation());
       }
       return null;
    }
    public boolean hasImage(){
       boolean b = (this.uri != null || this.bitmap != null)? true: false;
       return b;
    }
    public synchronized final void initialiseBaseLayer(Point p0){
       int i = 2;
       Object[] objArray = new Object[i];
       objArray[0] = Integer.valueOf(p0.x);
       objArray[1] = Integer.valueOf(p0.y);
       this.debug("initialiseBaseLayer maxTileDimensions=%dx%d", objArray);
       SubsamplingScaleImageView$ScaleAndTranslate scaleAndTran = new SubsamplingScaleImageView$ScaleAndTranslate(0, new PointF(0, 0), null);
       this.satTemp = scaleAndTran;
       this.fitToBounds(1, scaleAndTran);
       int i1 = this.calculateInSampleSize(this.satTemp.scale);
       this.fullImageSampleSize = i1;
       if (i1 > 1) {
          this.fullImageSampleSize = i1 / i;
       }
       if (this.fullImageSampleSize == 1 && (this.sRegion == null && (this.sWidth() < p0.x && this.sHeight() < p0.y))) {
          this.decoder.recycle();
          this.decoder = null;
          SubsamplingScaleImageView$BitmapLoadTask uBitmapLoadT = new SubsamplingScaleImageView$BitmapLoadTask(this, this.getContext(), this.bitmapDecoderFactory, this.uri, false);
          this.execute(this.decoder);
       }else {
          this.initialiseTileMap(p0);
          Iterator iterator = this.tileMap.get(Integer.valueOf(this.fullImageSampleSize)).iterator();
          while (iterator.hasNext()) {
             this.execute(new SubsamplingScaleImageView$TileLoadTask(this, this.decoder, iterator.next()));
          }
          this.refreshRequiredTiles(1);
       }
       return;
    }
    public final void initialiseTileMap(Point p0){
       int i3;
       int i4;
       int i5;
       int i6;
       double d;
       SubsamplingScaleImageView subsamplingS = this;
       Point point = p0;
       Object[] objArray = new Object[]{Integer.valueOf(point.x),Integer.valueOf(point.y)};
       int i = 1;
       subsamplingS.debug("initialiseTileMap maxTileDimensions=%dx%d", objArray);
       subsamplingS.tileMap = new LinkedHashMap();
       SubsamplingScaleImageView fullImageSam = subsamplingS.fullImageSampleSize;
       int i1 = 1;
       int i2 = 1;
       while (true) {
          i3 = this.sWidth() / i1;
          i4 = this.sHeight() / i2;
          i5 = i3 / fullImageSam;
          i6 = i4 / fullImageSam;
          break ;
       }
       int i7 = i5 + i1;
       i7 = i7 + i;
       while (i7 > point.x) {
       label_00f0 :
          i1 = i1 + 1;
          i3 = this.sWidth() / i1;
          i5 = i3 / fullImageSam;
          i = 1;
       }
       d = 0x3ff4000000000000;
       double d1 = (double)this.getWidth() * d;
       if ((double)i5 - d1 > 0 && fullImageSam < subsamplingS.fullImageSampleSize) {
          goto label_00f0 ;
       }else {
          i5 = i6 + i2;
          i5 = i5 + i;
          while (i5 > point.y) {
          label_00e1 :
             i2 = i2 + 1;
             i4 = this.sHeight() / i2;
             i6 = i4 / fullImageSam;
             i = 1;
          }
          double d2 = (double)this.getHeight() * d;
          if ((double)i6 - d2 > 0 && fullImageSam < subsamplingS.fullImageSampleSize) {
             goto label_00e1 ;
          }else {
             i6 = i1 * i2;
             ArrayList uArrayList = new ArrayList(i6);
             i6 = 0;
             while (i6 < i1) {
                i7 = 0;
                while (i7 < i2) {
                   SubsamplingScaleImageView$Tile tile = new SubsamplingScaleImageView$Tile(null);
                   tile.sampleSize = fullImageSam;
                   boolean b = (fullImageSam == subsamplingS.fullImageSampleSize)? true: false;
                   tile.visible = b;
                   int i8 = i6 * i3;
                   int i9 = i7 * i4;
                   i = i1 - 1;
                   if (i6 == i) {
                      i = this.sWidth();
                   }else {
                      i = i6 + 1;
                      i = i * i3;
                   }
                   int i10 = i2 - 1;
                   if (i7 == i10) {
                      i10 = this.sHeight();
                   }else {
                      i10 = i7 + 1;
                      i10 = i10 * i4;
                   }
                   tile.sRect = new Rect(i8, i9, i, i10);
                   tile.vRect = new Rect(0, 0, 0, 0);
                   tile.fileSRect = new Rect(tile.sRect);
                   uArrayList.add(tile);
                   i7 = i7 + 1;
                   i = 1;
                }
                i6 = i6 + 1;
                i = 1;
             }
             subsamplingS.tileMap.put(Integer.valueOf(fullImageSam), uArrayList);
             if (fullImageSam == 1) {
                return;
             }
             fullImageSam = fullImageSam / 2;
             i = 1;
          }
       }
    }
    public final boolean isBaseLayerReady(){
       boolean b = true;
       if (this.bitmap != null && this.bitmapIsPreview == null) {
          return b;
       }
       SubsamplingScaleImageView ttileMap = this.tileMap;
       if (ttileMap == null) {
          return false;
       }
       Iterator iterator = ttileMap.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          if (uEntry.getKey().intValue() == this.fullImageSampleSize) {
             Iterator iterator1 = uEntry.getValue().iterator();
             while (iterator1.hasNext()) {
                SubsamplingScaleImageView$Tile tile = iterator1.next();
                if (tile.loading != null || tile.bitmap == null) {
                   b = false;
                }else {
                   continue ;
                }
             }
          }
       }
       return b;
    }
    public final boolean isImageLoaded(){
       return this.imageLoadedSent;
    }
    public final boolean isPanEnabled(){
       return this.panEnabled;
    }
    public final boolean isQuickScaleEnabled(){
       return this.quickScaleEnabled;
    }
    public final boolean isReady(){
       return this.readySent;
    }
    public final boolean isZoomEnabled(){
       return this.zoomEnabled;
    }
    public PointF limitedSCenter(float p0,float p1,float p2,PointF p3){
       PointF pointF = this.vTranslateForSCenter(p0, p1, p2);
       p3.set((((float)(this.getPaddingLeft() + (((this.getWidth() - this.getPaddingRight()) - this.getPaddingLeft()) / 2)) - pointF.x) / p2), (((float)(this.getPaddingTop() + (((this.getHeight() - this.getPaddingBottom()) - this.getPaddingTop()) / 2)) - pointF.y) / p2));
       return p3;
    }
    public float limitedScale(float p0){
       return Math.min(this.maxScale, Math.max(this.minScale(), p0));
    }
    public final float minScale(){
       int i = this.getPaddingBottom() + this.getPaddingTop();
       int i1 = this.getPaddingLeft() + this.getPaddingRight();
       SubsamplingScaleImageView tminimumScal = this.minimumScaleType;
       if (tminimumScal == 2 || tminimumScal == 4) {
          return Math.max(((float)(this.getWidth() - i1) / (float)this.sWidth()), ((float)(this.getHeight() - i) / (float)this.sHeight()));
       }
       if (tminimumScal == 3) {
          tminimumScal = this.minScale;
          if (tminimumScal > 0) {
             return tminimumScal;
          }
       }
       return Math.min(((float)(this.getWidth() - i1) / (float)this.sWidth()), ((float)(this.getHeight() - i) / (float)this.sHeight()));
    }
    public void onDraw(Canvas p0){
       long l1;
       SubsamplingScaleImageView vTranslate;
       int anim2;
       SubsamplingScaleImageView$Anim anim2;
       Object obj1;
       int i2;
       SubsamplingScaleImageView subsamplingS1;
       Rect left;
       float f2;
       float f3;
       Rect right;
       float f4;
       float f5;
       float f6;
       float f7;
       float f8;
       float f9;
       int i3;
       int i4;
       float f10;
       int i5;
       float f11;
       float anim3;
       SubsamplingScaleImageView subsamplingS = this;
       Canvas uCanvas = p0;
       super.onDraw(p0);
       this.createPaints();
       if (subsamplingS.sWidth == null || (subsamplingS.sHeight == null || (this.getWidth() && this.getHeight()))) {
          if (subsamplingS.tileMap == null && subsamplingS.decoder != null) {
             subsamplingS.initialiseBaseLayer(this.getMaxBitmapDimensions(p0));
          }
          if (!this.checkReady()) {
             return;
          }else {
             this.preDraw();
             SubsamplingScaleImageView anim = subsamplingS.anim;
             float f = 0;
             if (anim != null && anim.vFocusStart != null) {
                SubsamplingScaleImageView scale = subsamplingS.scale;
                if (subsamplingS.vTranslateBefore == null) {
                   subsamplingS.vTranslateBefore = new PointF(f, f);
                }
                subsamplingS.vTranslateBefore.set(subsamplingS.vTranslate);
                SubsamplingScaleImageView anim1 = subsamplingS.anim;
                long l = System.currentTimeMillis() - anim1.time;
                SubsamplingScaleImageView$Anim duration = anim1.duration;
                boolean b = (l - duration > 0)? true: false;
                l1 = Math.min(l, duration);
                anim = subsamplingS.anim;
                SubsamplingScaleImageView$Anim scaleStart = anim.scaleStart;
                subsamplingS.scale = this.ease(anim.easing, l1, scaleStart, (anim.scaleEnd - scaleStart), anim.duration);
                anim = subsamplingS.anim;
                PointF x = anim.vFocusStart.x;
                float f1 = this.ease(anim.easing, l1, x, (anim.vFocusEnd.x - x), anim.duration);
                anim = subsamplingS.anim;
                x = anim.vFocusStart.y;
                vTranslate = subsamplingS.vTranslate;
                vTranslate.x = vTranslate.x - (subsamplingS.sourceToViewX(subsamplingS.anim.sCenterEnd.x) - f1);
                vTranslate = subsamplingS.vTranslate;
                vTranslate.y = vTranslate.y - (subsamplingS.sourceToViewY(subsamplingS.anim.sCenterEnd.y) - this.ease(anim.easing, l1, x, (anim.vFocusEnd.y - x), anim.duration));
                if (!b) {
                   anim = subsamplingS.anim;
                   if (anim.scaleStart - anim.scaleEnd) {
                      anim2 = false;
                   label_00e4 :
                      subsamplingS.fitToBounds(anim2);
                      subsamplingS.sendStateChanged(scale, subsamplingS.vTranslateBefore, subsamplingS.anim.origin);
                      subsamplingS.refreshRequiredTiles(b);
                      if (b) {
                         try{
                            anim2 = subsamplingS.anim.listener;
                            if (anim2 != null) {
                               anim2.onComplete();
                            }
                            subsamplingS.anim = null;
                         }catch(java.lang.Exception e0){
                         }
                      }
                   }
                }
                anim2 = true;
                goto label_00e4 ;
             }
          label_0104 :
             if (subsamplingS.tileMap != null && this.isBaseLayerReady()) {
                int i = Math.min(subsamplingS.fullImageSampleSize, subsamplingS.calculateInSampleSize(subsamplingS.scale));
                Iterator Map$Entry anim21 = subsamplingS.tileMap.entrySet().iterator();
                int i1 = 0;
                while (anim21.hasNext()) {
                   Map$Entry uEntry = anim21.next();
                   if (uEntry.getKey().intValue() == i) {
                      Iterator iterator = uEntry.getValue().iterator();
                      while (iterator.hasNext()) {
                         SubsamplingScaleImageView$Tile tile = iterator.next();
                         if (tile.visible != null && (tile.loading != null || tile.bitmap == null)) {
                            i1 = 1;
                         }else {
                            continue ;
                         }
                      }
                   }
                }
                Iterator iterator1 = subsamplingS.tileMap.entrySet().iterator();
                while (iterator1.hasNext()) {
                   anim21 = iterator1.next();
                   if (anim21.getKey().intValue() == i || i1) {
                      Iterator iterator2 = anim21.getValue().iterator();
                      while (iterator2.hasNext()) {
                         Rect obj = iterator2.next();
                         subsamplingS.sourceToViewRect(obj.sRect, obj.vRect);
                         SubsamplingScaleImageView$Tile Rect anim211 = obj.loading;
                         if (anim211 == null && obj.bitmap != null) {
                            anim = subsamplingS.tileBgPaint;
                            if (anim != null) {
                               uCanvas.drawRect(obj.vRect, anim);
                            }
                            if (subsamplingS.matrix == null) {
                               subsamplingS.matrix = new Matrix();
                            }
                            subsamplingS.matrix.reset();
                            obj1 = obj;
                            l1 = 180;
                            i2 = i;
                            subsamplingS1 = 90;
                            this.setMatrixArray(subsamplingS.srcArray, 0, 0, (float)obj.bitmap.getWidth(), 0, (float)obj.bitmap.getWidth(), (float)obj.bitmap.getHeight(), 0, (float)obj.bitmap.getHeight());
                            if (!this.getRequiredRotation()) {
                               anim211 = obj1.vRect;
                               left = anim211.left;
                               f2 = (float)left;
                               obj = anim211.top;
                               f3 = (float)obj;
                               right = anim211.right;
                               f4 = (float)right;
                               f = (float)obj;
                               anim211 = anim211.bottom;
                               f5 = (float)anim211;
                               f6 = (float)left;
                               f7 = (float)anim211;
                               f8 = f7;
                               f7 = f2;
                               f2 = f3;
                               f9 = f6;
                               f6 = f4;
                               f3 = f;
                               f4 = f5;
                               this.setMatrixArray(subsamplingS.dstArray, f7, f2, f6, f3, (float)right, f4, f9, f8);
                            }else if(this.getRequiredRotation() == subsamplingS1){
                               anim211 = obj1.vRect;
                               left = anim211.right;
                               f2 = (float)left;
                               obj = anim211.top;
                               f3 = (float)obj;
                               f10 = (float)left;
                               left = anim211.bottom;
                               f4 = (float)left;
                               anim211 = anim211.left;
                               f = (float)anim211;
                               f5 = (float)left;
                               f7 = (float)anim211;
                               f8 = f7;
                               f7 = f2;
                               f2 = f3;
                               f6 = f10;
                               f3 = f4;
                               f10 = f;
                               f4 = f5;
                               this.setMatrixArray(subsamplingS.dstArray, f7, f2, f6, f3, f10, f4, f8, (float)obj);
                            }else if(this.getRequiredRotation() == l1){
                               anim211 = obj1.vRect;
                               left = anim211.right;
                               f2 = (float)left;
                               obj = anim211.bottom;
                               f3 = (float)obj;
                               right = anim211.left;
                               f4 = (float)right;
                               f = (float)obj;
                               anim211 = anim211.top;
                               f5 = (float)anim211;
                               f6 = (float)left;
                               f7 = (float)anim211;
                               f8 = f7;
                               f7 = f2;
                               f2 = f3;
                               f9 = f6;
                               f6 = f4;
                               f3 = f;
                               f4 = f5;
                               this.setMatrixArray(subsamplingS.dstArray, f7, f2, f6, f3, (float)right, f4, f9, f8);
                            }else if(this.getRequiredRotation() == 270){
                               anim211 = obj1.vRect;
                               left = anim211.left;
                               f2 = (float)left;
                               obj = anim211.bottom;
                               f3 = (float)obj;
                               f10 = (float)left;
                               left = anim211.top;
                               f4 = (float)left;
                               anim211 = anim211.right;
                               f = (float)anim211;
                               f5 = (float)left;
                               f7 = (float)anim211;
                               f8 = f7;
                               f7 = f2;
                               f2 = f3;
                               f6 = f10;
                               f3 = f4;
                               f10 = f;
                               f4 = f5;
                               this.setMatrixArray(subsamplingS.dstArray, f7, f2, f6, f3, f10, f4, f8, (float)obj);
                            }
                            subsamplingS.matrix.setPolyToPoly(subsamplingS.srcArray, 0, subsamplingS.dstArray, 0, 4);
                            uCanvas.drawBitmap(obj1.bitmap, subsamplingS.matrix, subsamplingS.bitmapPaint);
                            if (subsamplingS.debug != null) {
                               uCanvas.drawRect(obj1.vRect, subsamplingS.debugLinePaint);
                            }
                         }else {
                            obj1 = obj;
                            i2 = i;
                            if (anim211 != null && subsamplingS.debug != null) {
                               anim2 = obj1.vRect.left + subsamplingS.px(5);
                               i3 = obj1.vRect.top + subsamplingS.px(35);
                               uCanvas.drawText("LOADING", (float)anim2, (float)i3, subsamplingS.debugTextPaint);
                            }
                         }
                         if (obj1.visible != null && subsamplingS.debug != null) {
                            i3 = obj1.vRect.left + subsamplingS.px(5);
                            i4 = obj1.vRect.top + subsamplingS.px(15);
                            uCanvas.drawText("ISS "+obj1.sampleSize+" RECT "+obj1.sRect.top+","+obj1.sRect.left+","+obj1.sRect.bottom+","+obj1.sRect.right, (float)i3, (float)i4, subsamplingS.debugTextPaint);
                         }else {
                            f2 = 0.00f;
                         }
                         i = i2;
                         f5 = 0.00f;
                      }
                   }
                   i2 = i;
                   l1 = 180;
                   i = i2;
                   f5 = 0.00f;
                }
                i5 = 15;
             }else {
                i5 = 15;
                subsamplingS1 = 90;
                anim = subsamplingS.bitmap;
                if (anim != null) {
                   vTranslate = subsamplingS.scale;
                   if (subsamplingS.bitmapIsPreview != null) {
                      f11 = vTranslate * ((float)subsamplingS.sWidth / (float)anim.getWidth());
                      anim3 = subsamplingS.scale * ((float)subsamplingS.sHeight / (float)subsamplingS.bitmap.getHeight());
                   }else {
                      anim = vTranslate;
                   }
                   if (subsamplingS.matrix == null) {
                      subsamplingS.matrix = new Matrix();
                   }
                   subsamplingS.matrix.reset();
                   subsamplingS.matrix.postScale(f11, anim3);
                   subsamplingS.matrix.postRotate((float)this.getRequiredRotation());
                   vTranslate = subsamplingS.vTranslate;
                   subsamplingS.matrix.postTranslate(vTranslate.x, vTranslate.y);
                   if (this.getRequiredRotation() == 180) {
                      vTranslate = subsamplingS.scale;
                      f7 = (float)subsamplingS.sWidth * vTranslate;
                      subsamplingS.matrix.postTranslate(f7, (vTranslate * (float)subsamplingS.sHeight));
                   }else if(this.getRequiredRotation() == subsamplingS1){
                      subsamplingS.matrix.postTranslate((subsamplingS.scale * (float)subsamplingS.sHeight), f);
                   }else if(this.getRequiredRotation() == 270){
                      subsamplingS.matrix.postTranslate(f, (subsamplingS.scale * (float)subsamplingS.sWidth));
                   }
                   if (subsamplingS.tileBgPaint != null) {
                      if (subsamplingS.sRect == null) {
                         subsamplingS.sRect = new RectF();
                      }
                      anim = subsamplingS.sRect;
                      i3 = (subsamplingS.bitmapIsPreview != null)? subsamplingS.bitmap.getWidth(): subsamplingS.sWidth;
                      f11 = (float)i3;
                      i4 = (subsamplingS.bitmapIsPreview != null)? subsamplingS.bitmap.getHeight(): subsamplingS.sHeight;
                      anim.set(f, f, f11, (float)i4);
                      subsamplingS.matrix.mapRect(subsamplingS.sRect);
                      uCanvas.drawRect(subsamplingS.sRect, subsamplingS.tileBgPaint);
                   }
                   uCanvas.drawBitmap(subsamplingS.bitmap, subsamplingS.matrix, subsamplingS.bitmapPaint);
                }
             }
             if (subsamplingS.debug != null) {
                Locale eNGLISH = Locale.ENGLISH;
                Object[] objArray = new Object[]{Float.valueOf(subsamplingS.scale)};
                objArray = new Object[]{Float.valueOf(this.minScale())};
                objArray = new Object[]{Float.valueOf(subsamplingS.maxScale)};
                uCanvas.drawText("Scale: "+String.format(eNGLISH, "%.2f", objArray)+" \("+String.format(eNGLISH, "%.2f", objArray)+" - "+String.format(eNGLISH, "%.2f", objArray)+"\)", (float)subsamplingS.px(5), (float)subsamplingS.px(i5), subsamplingS.debugTextPaint);
                Object[] objArray1 = new Object[]{Float.valueOf(subsamplingS.vTranslate.x)};
                objArray = new Object[]{Float.valueOf(subsamplingS.vTranslate.y)};
                uCanvas.drawText("Translate: "+String.format(eNGLISH, "%.2f", objArray1)+":"+String.format(eNGLISH, "%.2f", objArray), (float)subsamplingS.px(5), (float)subsamplingS.px(30), subsamplingS.debugTextPaint);
                PointF anim212 = this.getCenter();
                int i6 = 1;
                Object[] objArray2 = new Object[i6];
                int i7 = 0;
                objArray2[i7] = Float.valueOf(anim212.x);
                objArray1 = new Object[i6];
                objArray1[i7] = Float.valueOf(anim212.y);
                uCanvas.drawText("Source center: "+String.format(eNGLISH, "%.2f", objArray2)+":"+String.format(eNGLISH, "%.2f", objArray1), (float)subsamplingS.px(5), (float)subsamplingS.px(45), subsamplingS.debugTextPaint);
                anim = subsamplingS.anim;
                i3 = -16711681;
                i4 = -16776961;
                i5 = 20;
                int i8 = 0xffff0000;
                if (anim != null) {
                   anim212 = subsamplingS.sourceToViewCoord(anim.sCenterStart);
                   PointF pointF = subsamplingS.sourceToViewCoord(subsamplingS.anim.sCenterEndRequested);
                   PointF pointF1 = subsamplingS.sourceToViewCoord(subsamplingS.anim.sCenterEnd);
                   uCanvas.drawCircle(anim212.x, anim212.y, (float)subsamplingS.px(10), subsamplingS.debugLinePaint);
                   subsamplingS.debugLinePaint.setColor(i8);
                   uCanvas.drawCircle(pointF.x, pointF.y, (float)subsamplingS.px(i5), subsamplingS.debugLinePaint);
                   subsamplingS.debugLinePaint.setColor(i4);
                   uCanvas.drawCircle(pointF1.x, pointF1.y, (float)subsamplingS.px(25), subsamplingS.debugLinePaint);
                   subsamplingS.debugLinePaint.setColor(i3);
                   uCanvas.drawCircle((float)(this.getWidth() / 2), (float)(this.getHeight() / 2), (float)subsamplingS.px(30), subsamplingS.debugLinePaint);
                }
                if (subsamplingS.vCenterStart != null) {
                   subsamplingS.debugLinePaint.setColor(i8);
                   anim = subsamplingS.vCenterStart;
                   uCanvas.drawCircle(anim.x, anim.y, (float)subsamplingS.px(i5), subsamplingS.debugLinePaint);
                }
                if (subsamplingS.quickScaleSCenter != null) {
                   subsamplingS.debugLinePaint.setColor(i4);
                   uCanvas.drawCircle(subsamplingS.sourceToViewX(subsamplingS.quickScaleSCenter.x), subsamplingS.sourceToViewY(subsamplingS.quickScaleSCenter.y), (float)subsamplingS.px(35), subsamplingS.debugLinePaint);
                }
                if (subsamplingS.quickScaleVStart != null && subsamplingS.isQuickScaling != null) {
                   subsamplingS.debugLinePaint.setColor(i3);
                   anim = subsamplingS.quickScaleVStart;
                   uCanvas.drawCircle(anim.x, anim.y, (float)subsamplingS.px(30), subsamplingS.debugLinePaint);
                }
                subsamplingS.debugLinePaint.setColor(-65281);
             }
          }
       }
    }
    public void onImageLoaded(){
    }
    public synchronized void onImageLoaded(Bitmap p0,int p1,boolean p2){
       Object[] objArray = new Object[0];
       this.debug("onImageLoaded", objArray);
       SubsamplingScaleImageView tsWidth = this.sWidth;
       if (tsWidth > null && (this.sHeight > null && (tsWidth != p0.getWidth() || this.sHeight != p0.getHeight()))) {
          this.reset(0);
       }
    label_0022 :
       tsWidth = this.bitmap;
       if (tsWidth != null && this.bitmapIsCached == null) {
          tsWidth.recycle();
       }
       if (this.bitmap != null && this.bitmapIsCached != null) {
          tsWidth = this.onImageEventListener;
          if (tsWidth != null) {
             tsWidth.onPreviewReleased();
          }
       }
       this.bitmapIsPreview = false;
       this.bitmapIsCached = p2;
       this.bitmap = p0;
       this.sWidth = p0.getWidth();
       this.sHeight = p0.getHeight();
       this.sOrientation = p1;
       boolean b = this.checkImageLoaded();
       if (this.checkReady() || b) {
          this.invalidate();
          this.requestLayout();
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       int mode = View$MeasureSpec.getMode(p1);
       p0 = View$MeasureSpec.getSize(p0);
       p1 = View$MeasureSpec.getSize(p1);
       double d = Double.MIN_VALUE;
       int i = (View$MeasureSpec.getMode(p0) != 0x40000000)? 1: 0;
       if (mode == 0x40000000) {
          d = 0;
       }
       if (this.sWidth > null && this.sHeight > null) {
          if (i && d) {
             p0 = this.sWidth();
             p1 = this.sHeight();
          }else if(d){
             p1 = (int)(((double)this.sHeight() / (double)this.sWidth()) * (double)p0);
          }else if(i){
             p0 = (int)(((double)this.sWidth() / (double)this.sHeight()) * (double)p1);
          }
       }
       this.setMeasuredDimension(Math.max(p0, this.getSuggestedMinimumWidth()), Math.max(p1, this.getSuggestedMinimumHeight()));
       return;
    }
    public synchronized void onPreviewLoaded(Bitmap p0){
       Object[] objArray = new Object[0];
       this.debug("onPreviewLoaded", objArray);
       if (this.bitmap != null || this.imageLoadedSent != null) {
          p0.recycle();
          return;
       }else {
          SubsamplingScaleImageView tpRegion = this.pRegion;
          this.bitmap = (tpRegion != null)? Bitmap.createBitmap(p0, tpRegion.left, tpRegion.top, tpRegion.width(), this.pRegion.height()): p0;
          this.bitmapIsPreview = true;
          if (this.checkReady()) {
             this.invalidate();
             this.requestLayout();
          }
          return;
       }
    }
    public void onReady(){
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       Object[] objArray = new Object[]{Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p0),Integer.valueOf(p1)};
       this.debug("onSizeChanged %dx%d -> %dx%d", objArray);
       PointF center = this.getCenter();
       if (this.readySent != null && center != null) {
          this.anim = null;
          this.pendingScale = Float.valueOf(this.scale);
          this.sPendingCenter = center;
       }
       return;
    }
    public synchronized void onTileLoaded(){
       Object[] objArray = new Object[0];
       this.debug("onTileLoaded", objArray);
       this.checkReady();
       this.checkImageLoaded();
       if (this.isBaseLayerReady()) {
          SubsamplingScaleImageView tbitmap = this.bitmap;
          if (tbitmap != null) {
             if (this.bitmapIsCached == null) {
                tbitmap.recycle();
             }
             this.bitmap = null;
             tbitmap = this.onImageEventListener;
             if (tbitmap != null && this.bitmapIsCached != null) {
                tbitmap.onPreviewReleased();
             }
             this.bitmapIsPreview = false;
             this.bitmapIsCached = false;
          }
       }
       this.invalidate();
       return;
    }
    public synchronized void onTilesInited(ImageRegionDecoder p0,int p1,int p2,int p3){
       Object[] objArray = new Object[]{Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(this.orientation)};
       this.debug("onTilesInited sWidth=%d, sHeight=%d, sOrientation=%d", objArray);
       SubsamplingScaleImageView tsWidth = this.sWidth;
       if (tsWidth > null) {
          SubsamplingScaleImageView tsHeight = this.sHeight;
          if (tsHeight > null && (tsWidth != p1 || tsHeight != p2)) {
             this.reset(0);
             tsWidth = this.bitmap;
             if (tsWidth != null) {
                if (this.bitmapIsCached == null) {
                   tsWidth.recycle();
                }
                this.bitmap = null;
                tsWidth = this.onImageEventListener;
                if (tsWidth != null && this.bitmapIsCached != null) {
                   tsWidth.onPreviewReleased();
                }
                this.bitmapIsPreview = false;
                this.bitmapIsCached = false;
             }
          }
       }
       this.decoder = p0;
       this.sWidth = p1;
       this.sHeight = p2;
       this.sOrientation = p3;
       this.checkReady();
       if (!this.checkImageLoaded()) {
          SubsamplingScaleImageView tmaxTileWidt = this.maxTileWidth;
          if (tmaxTileWidt > null) {
             p1 = SubsamplingScaleImageView.TILE_SIZE_AUTO;
             if (tmaxTileWidt != p1) {
                tmaxTileWidt = this.maxTileHeight;
                if (tmaxTileWidt > null && (tmaxTileWidt != p1 && (this.getWidth() > 0 && this.getHeight() > 0))) {
                   this.initialiseBaseLayer(new Point(this.maxTileWidth, this.maxTileHeight));
                }
             }
          }
       }
       this.invalidate();
       this.requestLayout();
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       float f;
       SubsamplingScaleImageView tanim = this.anim;
       boolean b = true;
       if (tanim != null && tanim.interruptible == null) {
          this.requestDisallowInterceptTouchEvent(b);
          return b;
       }else if(tanim != null){
          SubsamplingScaleImageView$Anim listener = tanim.listener;
          if (listener != null) {
             try{
                listener.onInterruptedByUser();
             }catch(java.lang.Exception e0){
             }
          }
       }
    }
    public final boolean onTouchEventInternal(MotionEvent p0){
       SubsamplingScaleImageView tisZooming;
       SubsamplingScaleImageView tvTranslate;
       float f2;
       float f3;
       SubsamplingScaleImageView tvCenterStar;
       float f5;
       SubsamplingScaleImageView tvTranslateS;
       SubsamplingScaleImageView tscaleStart;
       int pointerCount = p0.getPointerCount();
       int action = p0.getAction();
       float f = 2.00f;
       float f1 = 0.00f;
       if (action) {
          if (action != 1) {
             if (action != f1) {
                if (action != 0.00f) {
                   if (action != 6) {
                      if (action != 261) {
                         if (action == 262) {
                         label_03c7 :
                            this.handler.removeMessages(1);
                            if (this.isQuickScaling != null) {
                               this.isQuickScaling = false;
                               if (this.quickScaleMoved == null) {
                                  this.doubleTapZoom(this.quickScaleSCenter, this.vCenterStart);
                               }
                            }
                            if (this.maxTouchCount > null) {
                               tisZooming = this.isZooming;
                               if (tisZooming != null || this.isPanning != null) {
                                  if (tisZooming != null && pointerCount == f1) {
                                     this.isPanning = true;
                                     tvTranslate = this.vTranslate;
                                     this.vTranslateStart.set(tvTranslate.x, tvTranslate.y);
                                     if (p0.getActionIndex() == 1) {
                                        this.vCenterStart.set(p0.getX(false), p0.getY(false));
                                     }else {
                                        this.vCenterStart.set(p0.getX(1), p0.getY(1));
                                     }
                                  }
                                  if (pointerCount < 3) {
                                     this.isZooming = false;
                                  }
                                  if (pointerCount < f1) {
                                     this.isPanning = false;
                                     this.maxTouchCount = 0;
                                  }
                                  this.refreshRequiredTiles(1);
                                  return 1;
                               }
                            }
                            if (pointerCount == 1) {
                               this.isZooming = false;
                               this.isPanning = false;
                               this.maxTouchCount = 0;
                            }
                            return 1;
                         }
                      }
                   }else {
                      goto label_03c7 ;
                   }
                }
             }else if(this.maxTouchCount > null){
                double d = -0.00f;
                if (pointerCount >= f1) {
                   f2 = this.distance(p0.getX(false), p0.getX(1), p0.getY(false), p0.getY(1));
                   f3 = (p0.getX(false) + p0.getX(1)) / f;
                   float f4 = (p0.getY(false) + p0.getY(1)) / f;
                   if (this.zoomEnabled != null) {
                      tvCenterStar = this.vCenterStart;
                      if (this.distance(tvCenterStar.x, f3, tvCenterStar.y, f4) - d <= 0 && (Math.abs((f2 - this.vDistStart)) - d > 0 || this.isPanning != null)) {
                         this.isZooming = true;
                         this.isPanning = true;
                         d = (double)this.scale;
                         f5 = Math.min(this.maxScale, ((f2 / this.vDistStart) * this.scaleStart));
                         this.scale = f5;
                         if (f5 - this.minScale() <= 0) {
                            this.vDistStart = f2;
                            this.scaleStart = this.minScale();
                            this.vCenterStart.set(f3, f4);
                            this.vTranslateStart.set(this.vTranslate);
                         }else if(this.panEnabled != null){
                            tvCenterStar = this.vCenterStart;
                            tvTranslateS = this.vTranslateStart;
                            tvTranslateS = this.scale;
                            tscaleStart = this.scaleStart;
                            tvTranslateS = this.vTranslate;
                            tvTranslateS.x = f3 - ((tvCenterStar.x - tvTranslateS.x) * (tvTranslateS / tscaleStart));
                            tvTranslateS.y = f4 - ((tvCenterStar.y - tvTranslateS.y) * (tvTranslateS / tscaleStart));
                            if (((double)this.sHeight() * d) - (double)this.getHeight() >= 0 || ((this.scale * (float)this.sHeight()) - (float)this.getHeight() >= 0 || ((d * (double)this.sWidth()) - (double)this.getWidth() < 0 && (this.scale * (float)this.sWidth()) - (float)this.getWidth() >= 0))) {
                               this.fitToBounds(1);
                               this.vCenterStart.set(f3, f4);
                               this.vTranslateStart.set(this.vTranslate);
                               this.scaleStart = this.scale;
                               this.vDistStart = f2;
                            }
                         }else if(this.sRequestedCenter != null){
                            f5.x = (float)(this.getWidth() / f1) - (this.scale * this.sRequestedCenter.x);
                            f5.y = (float)(this.getHeight() / f1) - (this.scale * this.sRequestedCenter.y);
                         }else {
                            f5.x = (float)(this.getWidth() / f1) - (this.scale * (float)(this.sWidth() / f1));
                            f5.y = (float)(this.getHeight() / f1) - (this.scale * (float)(this.sHeight() / f1));
                         }
                         this.fitToBounds(1);
                         this.refreshRequiredTiles(this.eagerLoadingEnabled);
                      }
                   }
                }else if(this.isQuickScaling != null){
                   f2 = (Math.abs((this.quickScaleVStart.y - p0.getY())) * f) + this.quickScaleThreshold;
                   if (!this.quickScaleLastDistance - 0xbf800000) {
                      this.quickScaleLastDistance = f2;
                   }
                   tvTranslate = this.quickScaleVLastPoint;
                   tisZooming = (p0.getY() - tvTranslate.y > 0)? 1: null;
                   f3 = 0;
                   tvTranslate.set(f3, p0.getY());
                   f = 0x3f800000;
                   f5 = Math.abs((f - (f2 / this.quickScaleLastDistance))) * 0x3f000000;
                   if (f5 - 0x3cf5c28f > 0 || this.quickScaleMoved != null) {
                      this.quickScaleMoved = true;
                      if (this.quickScaleLastDistance - f3 > 0) {
                         f = (tisZooming)? f5 + f: f - f5;
                      }
                      double d1 = (double)this.scale;
                      f5 = Math.max(this.minScale(), Math.min(this.maxScale, (this.scale * f)));
                      this.scale = f5;
                      if (this.panEnabled != null) {
                         tisZooming = this.vCenterStart;
                         PointF x = tisZooming.x;
                         SubsamplingScaleImageView tvTranslateS1 = this.vTranslateStart;
                         PointF y = tisZooming.y;
                         SubsamplingScaleImageView tscaleStart1 = this.scaleStart;
                         tvCenterStar = this.vTranslate;
                         tvCenterStar.x = x - ((x - tvTranslateS1.x) * (f5 / tscaleStart1));
                         tvCenterStar.y = y - ((y - tvTranslateS1.y) * (f5 / tscaleStart1));
                         if (((double)this.sHeight() * d1) - (double)this.getHeight() >= 0 || ((this.scale * (float)this.sHeight()) - (float)this.getHeight() >= 0 || ((d1 * (double)this.sWidth()) - (double)this.getWidth() < 0 && (this.scale * (float)this.sWidth()) - (float)this.getWidth() >= 0))) {
                            this.fitToBounds(1);
                            this.vCenterStart.set(this.sourceToViewCoord(this.quickScaleSCenter));
                            this.vTranslateStart.set(this.vTranslate);
                            this.scaleStart = this.scale;
                            f2 = 0;
                         }
                      }else if(this.sRequestedCenter != null){
                         f5.x = (float)(this.getWidth() / f1) - (this.scale * this.sRequestedCenter.x);
                         f5.y = (float)(this.getHeight() / f1) - (this.scale * this.sRequestedCenter.y);
                      }else {
                         f5.x = (float)(this.getWidth() / f1) - (this.scale * (float)(this.sWidth() / f1));
                         f5.y = (float)(this.getHeight() / f1) - (this.scale * (float)(this.sHeight() / f1));
                      }
                   }
                label_02da :
                   this.quickScaleLastDistance = f2;
                   this.fitToBounds(1);
                   this.refreshRequiredTiles(this.eagerLoadingEnabled);
                }else if(this.isZooming == null){
                   f2 = Math.abs((p0.getX() - this.vCenterStart.x));
                   f = Math.abs((p0.getY() - this.vCenterStart.y));
                   f1 = this.density * d;
                   v1 = f2 - f1;
                   if (d <= 0 && (f - f1 > 0 || this.isPanning != null)) {
                      this.vTranslate.x = this.vTranslateStart.x + (p0.getX() - this.vCenterStart.x);
                      this.vTranslate.y = this.vTranslateStart.y + (p0.getY() - this.vCenterStart.y);
                      tvCenterStar = this.vTranslate;
                      PointF y1 = tvCenterStar.y;
                      this.fitToBounds(1);
                      SubsamplingScaleImageView tvTranslate1 = this.vTranslate;
                      f3 = (tvCenterStar.x - tvTranslate1.x)? 1: 0;
                      PointF y2 = tvTranslate1.y;
                      tvTranslateS = (y1 - y2)? 1: 0;
                      tscaleStart = (f3 && (f2 - f > 0 && this.isPanning == null))? 1: 0;
                      SubsamplingScaleImageView subsamplingS = (tvTranslateS && (f - f2 > 0 && this.isPanning == null))? 1: null;
                      tvCenterStar = (!y1 - y2 && f - (3.00f * f1) > 0)? 1: null;
                      if (!tscaleStart && (!subsamplingS && (f3 && (tvTranslateS && (tvCenterStar || this.isPanning != null))))) {
                         this.isPanning = true;
                      }else if(d > 0 || f - f1 > 0){
                         this.maxTouchCount = 0;
                         this.handler.removeMessages(1);
                         this.requestDisallowInterceptTouchEvent(false);
                      }
                      if (this.panEnabled == null) {
                         tvCenterStar = this.vTranslate;
                         subsamplingS = this.vTranslateStart;
                         tvCenterStar.x = subsamplingS.x;
                         tvCenterStar.y = subsamplingS.y;
                         this.requestDisallowInterceptTouchEvent(false);
                      }
                      this.refreshRequiredTiles(this.eagerLoadingEnabled);
                   }
                }
                tvCenterStar = 1;
             label_03bb :
                if (tvCenterStar) {
                   this.handler.removeMessages(1);
                   this.invalidate();
                   return 1;
                }
             }
          label_03ba :
             tvCenterStar = null;
             goto label_03bb ;
             return false;
          }else {
             goto label_03c7 ;
          }
       }
    label_0433 :
       this.anim = null;
       this.requestDisallowInterceptTouchEvent(1);
       this.maxTouchCount = Math.max(this.maxTouchCount, pointerCount);
       if (pointerCount >= f1) {
          if (this.zoomEnabled != null) {
             this.scaleStart = this.scale;
             this.vDistStart = this.distance(p0.getX(false), p0.getX(1), p0.getY(false), p0.getY(1));
             tisZooming = this.vTranslate;
             this.vTranslateStart.set(tisZooming.x, tisZooming.y);
             this.vCenterStart.set(((p0.getX(false) + p0.getX(1)) / f), ((p0.getY(false) + p0.getY(1)) / f));
          }else {
             this.maxTouchCount = 0;
          }
          this.handler.removeMessages(1);
       }else if(this.isQuickScaling == null){
          tisZooming = this.vTranslate;
          this.vTranslateStart.set(tisZooming.x, tisZooming.y);
          this.vCenterStart.set(p0.getX(), p0.getY());
          this.handler.sendEmptyMessageDelayed(1, 600);
       }
       return 1;
    }
    public final void preDraw(){
       if (!this.getWidth() || (!this.getHeight() || (this.sWidth > null && this.sHeight > null))) {
          if (this.sPendingCenter != null) {
             SubsamplingScaleImageView tpendingScal = this.pendingScale;
             if (tpendingScal != null) {
                this.scale = tpendingScal.floatValue();
                if (this.vTranslate == null) {
                   this.vTranslate = new PointF();
                }
                this.vTranslate.x = (float)(this.getWidth() / 2) - (this.scale * this.sPendingCenter.x);
                this.vTranslate.y = (float)(this.getHeight() / 2) - (this.scale * this.sPendingCenter.y);
                this.sPendingCenter = null;
                this.pendingScale = null;
                boolean b = true;
                this.fitToBounds(b);
                this.refreshRequiredTiles(b);
             }
          }
          this.fitToBounds(false);
       }
    label_0066 :
       return;
    }
    public final int px(int p0){
       return (int)(this.density * (float)p0);
    }
    public void recycle(){
       this.reset(true);
       this.bitmapPaint = null;
       this.debugTextPaint = null;
       this.debugLinePaint = null;
       this.tileBgPaint = null;
    }
    public final void refreshRequiredTiles(boolean p0){
       if (this.decoder != null && this.tileMap != null) {
          int i = Math.min(this.fullImageSampleSize, this.calculateInSampleSize(this.scale));
          Iterator iterator = this.tileMap.entrySet().iterator();
          while (iterator.hasNext()) {
             Iterator iterator1 = iterator.next().getValue().iterator();
             while (iterator1.hasNext()) {
                SubsamplingScaleImageView$Tile tile = iterator1.next();
                SubsamplingScaleImageView$Tile sampleSize = tile.sampleSize;
                Bitmap uBitmap = null;
                if (sampleSize < i || (sampleSize > i && sampleSize != this.fullImageSampleSize)) {
                   tile.visible = false;
                   sampleSize = tile.bitmap;
                   if (sampleSize != null) {
                      sampleSize.recycle();
                      tile.bitmap = uBitmap;
                   }
                }
                sampleSize = tile.sampleSize;
                boolean b = true;
                if (sampleSize == i) {
                   if (this.tileVisible(tile)) {
                      tile.visible = b;
                      if (tile.loading == null && (tile.bitmap == null && p0)) {
                         this.execute(new SubsamplingScaleImageView$TileLoadTask(this, this.decoder, tile));
                      }
                   }else if(tile.sampleSize != this.fullImageSampleSize){
                      tile.visible = false;
                      sampleSize = tile.bitmap;
                      if (sampleSize != null) {
                         sampleSize.recycle();
                         tile.bitmap = uBitmap;
                      }
                   }
                }else if(sampleSize == this.fullImageSampleSize){
                   tile.visible = b;
                }
             }
          }
       }
       return;
    }
    public final void requestDisallowInterceptTouchEvent(boolean p0){
       ViewParent parent = this.getParent();
       if (parent != null) {
          parent.requestDisallowInterceptTouchEvent(p0);
       }
       return;
    }
    public final void reset(boolean p0){
       SubsamplingScaleImageView tdecoder;
       Object[] objArray = new Object[0];
       this.debug("reset newImage="+p0, objArray);
       float f = 0;
       this.scale = f;
       this.scaleStart = f;
       this.vTranslate = null;
       this.vTranslateStart = null;
       this.vTranslateBefore = null;
       this.pendingScale = Float.valueOf(f);
       this.sPendingCenter = null;
       this.sRequestedCenter = null;
       this.isZooming = false;
       this.isPanning = false;
       this.isQuickScaling = false;
       this.maxTouchCount = 0;
       this.fullImageSampleSize = 0;
       this.vCenterStart = null;
       this.vDistStart = f;
       this.quickScaleLastDistance = f;
       this.quickScaleMoved = false;
       this.quickScaleSCenter = null;
       this.quickScaleVLastPoint = null;
       this.quickScaleVStart = null;
       this.anim = null;
       this.satTemp = null;
       this.matrix = null;
       this.sRect = null;
       if (p0) {
          this.uri = null;
          this.decoderLock.writeLock().lock();
          tdecoder = this.decoder;
          if (tdecoder != null) {
             tdecoder.recycle();
             this.decoder = null;
          }
          this.decoderLock.writeLock().unlock();
          tdecoder = this.bitmap;
          if (tdecoder != null && this.bitmapIsCached == null) {
             tdecoder.recycle();
          }
          if (this.bitmap != null && this.bitmapIsCached != null) {
             tdecoder = this.onImageEventListener;
             if (tdecoder != null) {
                tdecoder.onPreviewReleased();
             }
          }
          this.sWidth = 0;
          this.sHeight = 0;
          this.sOrientation = 0;
          this.sRegion = null;
          this.pRegion = null;
          this.readySent = false;
          this.imageLoadedSent = false;
          this.bitmap = null;
          this.bitmapIsPreview = false;
          this.bitmapIsCached = false;
       }
       tdecoder = this.tileMap;
       if (tdecoder != null) {
          Iterator iterator = tdecoder.entrySet().iterator();
          while (iterator.hasNext()) {
             Iterator iterator1 = iterator.next().getValue().iterator();
             while (iterator1.hasNext()) {
                SubsamplingScaleImageView$Tile tile = iterator1.next();
                tile.visible = false;
                SubsamplingScaleImageView$Tile bitmap = tile.bitmap;
                if (bitmap != null) {
                   bitmap.recycle();
                   tile.bitmap = null;
                }
             }
          }
          this.tileMap = null;
       }
       this.setGestureDetector(this.getContext());
       return;
    }
    public final void resetScaleAndCenter(){
       this.anim = null;
       float f = 0;
       this.pendingScale = Float.valueOf(this.limitedScale(f));
       this.sPendingCenter = (this.isReady())? new PointF((float)(this.sWidth() / 2), (float)(this.sHeight() / 2)): new PointF(f, f);
       this.invalidate();
       return;
    }
    public final void restoreState(ImageViewState p0){
       if (p0 != null && (p0.getCenter() != null && SubsamplingScaleImageView.VALID_ORIENTATIONS.contains(Integer.valueOf(p0.getOrientation())))) {
          this.orientation = p0.getOrientation();
          this.pendingScale = Float.valueOf(p0.getScale());
          this.sPendingCenter = p0.getCenter();
          this.invalidate();
       }
    label_0031 :
       return;
    }
    public final int sHeight(){
       int requiredRota = this.getRequiredRotation();
       if (requiredRota == 90 || requiredRota == 270) {
          return this.sWidth;
       }
       return this.sHeight;
    }
    public final int sWidth(){
       int requiredRota = this.getRequiredRotation();
       if (requiredRota == 90 || requiredRota == 270) {
          return this.sHeight;
       }
       return this.sWidth;
    }
    public final void sendStateChanged(float p0,PointF p1,int p2){
       SubsamplingScaleImageView tonStateChan = this.onStateChangedListener;
       if (tonStateChan != null) {
          SubsamplingScaleImageView tscale = this.scale;
          if (tscale - p0) {
             tonStateChan.onScaleChanged(tscale, p2);
          }
       }
       if (this.onStateChangedListener != null && !this.vTranslate.equals(p1)) {
          this.onStateChangedListener.onCenterChanged(this.getCenter(), p2);
       }
       return;
    }
    public final void setBitmapDecoderClass(Class p0){
       if (p0 == null) {
          throw new IllegalArgumentException("Decoder class cannot be set to null");
       }
       this.bitmapDecoderFactory = new CompatDecoderFactory(p0);
       return;
    }
    public final void setBitmapDecoderFactory(DecoderFactory p0){
       if (p0 == null) {
          throw new IllegalArgumentException("Decoder factory cannot be set to null");
       }
       this.bitmapDecoderFactory = p0;
       return;
    }
    public final void setDebug(boolean p0){
       this.debug = p0;
    }
    public final void setDoubleTapZoomDpi(int p0){
       DisplayMetrics uDisplayMetr = c.c(this.getResources());
       this.setDoubleTapZoomScale((((uDisplayMetr.xdpi + uDisplayMetr.ydpi) / 2.00f) / (float)p0));
    }
    public final void setDoubleTapZoomDuration(int p0){
       this.doubleTapZoomDuration = Math.max(0, p0);
    }
    public final void setDoubleTapZoomScale(float p0){
       this.doubleTapZoomScale = p0;
    }
    public final void setDoubleTapZoomStyle(int p0){
       if (!SubsamplingScaleImageView.VALID_ZOOM_STYLES.contains(Integer.valueOf(p0))) {
          throw new IllegalArgumentException("Invalid zoom style: "+p0);
       }
       this.doubleTapZoomStyle = p0;
       return;
    }
    public void setEagerLoadingEnabled(boolean p0){
       this.eagerLoadingEnabled = p0;
    }
    public void setExecutor(Executor p0){
       Objects.requireNonNull(p0, "Executor must not be null");
       this.executor = p0;
    }
    public void setGestureDetector(Context p0){
       this.detector = new GestureDetector(p0, new SubsamplingScaleImageView$2(this, p0));
       this.singleDetector = new GestureDetector(p0, new SubsamplingScaleImageView$3(this));
    }
    public final void setImage(ImageSource p0){
       this.setImage(p0, null, null);
    }
    public final void setImage(ImageSource p0,ImageSource p1){
       this.setImage(p0, p1, null);
    }
    public final void setImage(ImageSource p0,ImageSource p1,ImageViewState p2){
       Objects.requireNonNull(p0, "imageSource must not be null");
       this.reset(true);
       if (p2 != null) {
          this.restoreState(p2);
       }
       String str = "/";
       String str1 = "android.resource://";
       if (p1 != null) {
          if (p0.getBitmap() == null) {
             if (p0.getSWidth() > 0 && p0.getSHeight() > 0) {
                this.sWidth = p0.getSWidth();
                this.sHeight = p0.getSHeight();
                this.pRegion = p1.getSRegion();
                if (p1.getBitmap() != null) {
                   this.bitmapIsCached = p1.isCached();
                   this.onPreviewLoaded(p1.getBitmap());
                }else {
                   Uri uri1 = p1.getUri();
                   if (uri1 == null && p1.getResource() != null) {
                      uri1 = Uri.parse(str1+this.getContext().getPackageName()+str+p1.getResource());
                   }
                   SubsamplingScaleImageView$BitmapLoadTask uBitmapLoadT1 = new SubsamplingScaleImageView$BitmapLoadTask(this, this.getContext(), this.bitmapDecoderFactory, uri1, true);
                   this.execute(str1+this.getContext().getPackageName()+str+p1.getResource());
                }
             }else {
                throw new IllegalArgumentException("Preview image cannot be used unless dimensions are provided for the main image");
             }
          }else {
             throw new IllegalArgumentException("Preview image cannot be used when a bitmap is provided for the main image");
          }
       }
       int i = 0;
       if (p0.getBitmap() != null && p0.getSRegion() != null) {
          this.onImageLoaded(Bitmap.createBitmap(p0.getBitmap(), p0.getSRegion().left, p0.getSRegion().top, p0.getSRegion().width(), p0.getSRegion().height()), i, i);
       }else if(p0.getBitmap() != null){
          this.onImageLoaded(p0.getBitmap(), i, p0.isCached());
       }else {
          this.sRegion = p0.getSRegion();
          Uri uri = p0.getUri();
          this.uri = uri;
          if (uri == null && p0.getResource() != null) {
             this.uri = Uri.parse(str1+this.getContext().getPackageName()+str+p0.getResource());
          }
          if (p0.getTile() || this.sRegion != null) {
             this.execute(new SubsamplingScaleImageView$TilesInitTask(this, this.getContext(), this.regionDecoderFactory, this.uri));
          }else {
             SubsamplingScaleImageView$BitmapLoadTask uBitmapLoadT = new SubsamplingScaleImageView$BitmapLoadTask(this, this.getContext(), this.bitmapDecoderFactory, this.uri, false);
             this.execute(this.sRegion);
          }
       }
       return;
    }
    public final void setImage(ImageSource p0,ImageViewState p1){
       this.setImage(p0, null, p1);
    }
    public final void setMatrixArray(float[] p0,float p1,float p2,float p3,float p4,float p5,float p6,float p7,float p8){
       p0[0] = p1;
       p0[1] = p2;
       p0[2] = p3;
       p0[3] = p4;
       p0[4] = p5;
       p0[5] = p6;
       p0[6] = p7;
       p0[7] = p8;
    }
    public final void setMaxScale(float p0){
       this.maxScale = p0;
    }
    public void setMaxTileSize(int p0){
       this.maxTileWidth = p0;
       this.maxTileHeight = p0;
    }
    public void setMaxTileSize(int p0,int p1){
       this.maxTileWidth = p0;
       this.maxTileHeight = p1;
    }
    public final void setMaximumDpi(int p0){
       DisplayMetrics uDisplayMetr = c.c(this.getResources());
       this.setMinScale((((uDisplayMetr.xdpi + uDisplayMetr.ydpi) / 2.00f) / (float)p0));
    }
    public final void setMinScale(float p0){
       this.minScale = p0;
    }
    public final void setMinimumDpi(int p0){
       DisplayMetrics uDisplayMetr = c.c(this.getResources());
       this.setMaxScale((((uDisplayMetr.xdpi + uDisplayMetr.ydpi) / 2.00f) / (float)p0));
    }
    public final void setMinimumScaleType(int p0){
       if (!SubsamplingScaleImageView.VALID_SCALE_TYPES.contains(Integer.valueOf(p0))) {
          throw new IllegalArgumentException("Invalid scale type: "+p0);
       }
       this.minimumScaleType = p0;
       if (this.isReady()) {
          this.fitToBounds(true);
          this.invalidate();
       }
       return;
    }
    public void setMinimumTileDpi(int p0){
       DisplayMetrics uDisplayMetr = c.c(this.getResources());
       this.minimumTileDpi = (int)Math.min(((uDisplayMetr.xdpi + uDisplayMetr.ydpi) / 2.00f), (float)p0);
       if (this.isReady()) {
          this.reset(false);
          this.invalidate();
       }
       return;
    }
    public void setOnImageEventListener(SubsamplingScaleImageView$OnImageEventListener p0){
       this.onImageEventListener = p0;
    }
    public void setOnLongClickListener(View$OnLongClickListener p0){
       this.onLongClickListener = p0;
    }
    public void setOnStateChangedListener(SubsamplingScaleImageView$OnStateChangedListener p0){
       this.onStateChangedListener = p0;
    }
    public final void setOrientation(int p0){
       if (!SubsamplingScaleImageView.VALID_ORIENTATIONS.contains(Integer.valueOf(p0))) {
          throw new IllegalArgumentException("Invalid orientation: "+p0);
       }
       this.orientation = p0;
       this.reset(false);
       this.invalidate();
       this.requestLayout();
       return;
    }
    public final void setPanEnabled(boolean p0){
       this.panEnabled = p0;
       if (!p0) {
          SubsamplingScaleImageView tvTranslate = this.vTranslate;
          if (tvTranslate != null) {
             tvTranslate.x = (float)(this.getWidth() / 2) - (this.scale * (float)(this.sWidth() / 2));
             tvTranslate.y = (float)(this.getHeight() / 2) - (this.scale * (float)(this.sHeight() / 2));
             if (this.isReady()) {
                this.refreshRequiredTiles(true);
                this.invalidate();
             }
          }
       }
       return;
    }
    public final void setPanLimit(int p0){
       if (!SubsamplingScaleImageView.VALID_PAN_LIMITS.contains(Integer.valueOf(p0))) {
          throw new IllegalArgumentException("Invalid pan limit: "+p0);
       }
       this.panLimit = p0;
       if (this.isReady()) {
          this.fitToBounds(true);
          this.invalidate();
       }
       return;
    }
    public final void setQuickScaleEnabled(boolean p0){
       this.quickScaleEnabled = p0;
    }
    public final void setRegionDecoderClass(Class p0){
       if (p0 == null) {
          throw new IllegalArgumentException("Decoder class cannot be set to null");
       }
       this.regionDecoderFactory = new CompatDecoderFactory(p0);
       return;
    }
    public final void setRegionDecoderFactory(DecoderFactory p0){
       if (p0 == null) {
          throw new IllegalArgumentException("Decoder factory cannot be set to null");
       }
       this.regionDecoderFactory = p0;
       return;
    }
    public final void setScaleAndCenter(float p0,PointF p1){
       this.anim = null;
       this.pendingScale = Float.valueOf(p0);
       this.sPendingCenter = p1;
       this.sRequestedCenter = p1;
       this.invalidate();
    }
    public final void setTileBackgroundColor(int p0){
       if (!Color.alpha(p0)) {
          this.tileBgPaint = null;
       }else {
          Paint paint = new Paint();
          this.tileBgPaint = paint;
          paint.setStyle(Paint$Style.FILL);
          this.tileBgPaint.setColor(p0);
       }
       this.invalidate();
       return;
    }
    public final void setZoomEnabled(boolean p0){
       this.zoomEnabled = p0;
    }
    public final PointF sourceToViewCoord(float p0,float p1){
       return this.sourceToViewCoord(p0, p1, new PointF());
    }
    public final PointF sourceToViewCoord(float p0,float p1,PointF p2){
       if (this.vTranslate == null) {
          return null;
       }
       p2.set(this.sourceToViewX(p0), this.sourceToViewY(p1));
       return p2;
    }
    public final PointF sourceToViewCoord(PointF p0){
       return this.sourceToViewCoord(p0.x, p0.y, new PointF());
    }
    public final PointF sourceToViewCoord(PointF p0,PointF p1){
       return this.sourceToViewCoord(p0.x, p0.y, p1);
    }
    public final Rect sourceToViewRect(Rect p0,Rect p1){
       p1.set((int)this.sourceToViewX((float)p0.left), (int)this.sourceToViewY((float)p0.top), (int)this.sourceToViewX((float)p0.right), (int)this.sourceToViewY((float)p0.bottom));
       return p1;
    }
    public final float sourceToViewX(float p0){
       SubsamplingScaleImageView tvTranslate = this.vTranslate;
       if (tvTranslate == null) {
          return Float.NaN;
       }
       return ((p0 * this.scale) + tvTranslate.x);
    }
    public final float sourceToViewY(float p0){
       SubsamplingScaleImageView tvTranslate = this.vTranslate;
       if (tvTranslate == null) {
          return Float.NaN;
       }
       return ((p0 * this.scale) + tvTranslate.y);
    }
    public final boolean tileVisible(SubsamplingScaleImageView$Tile p0){
       float f = this.viewToSourceX((float)this.getWidth());
       float f1 = this.viewToSourceY(0);
       float f2 = this.viewToSourceY((float)this.getHeight());
       p0 = p0.sRect;
       boolean b = (this.viewToSourceX(0) - (float)p0.right <= 0 && ((float)p0.left - f <= 0 && (f1 - (float)p0.bottom <= 0 && (float)p0.top - f2 <= 0)))? true: false;
       return b;
    }
    public final PointF vTranslateForSCenter(float p0,float p1,float p2){
       int i = this.getPaddingLeft() + (((this.getWidth() - this.getPaddingRight()) - this.getPaddingLeft()) / 2);
       int i1 = this.getPaddingTop() + (((this.getHeight() - this.getPaddingBottom()) - this.getPaddingTop()) / 2);
       if (this.satTemp == null) {
          this.satTemp = new SubsamplingScaleImageView$ScaleAndTranslate(0, new PointF(0, 0), null);
       }
       SubsamplingScaleImageView tsatTemp = this.satTemp;
       tsatTemp.scale = p2;
       tsatTemp.vTranslate.set(((float)i - (p0 * p2)), ((float)i1 - (p1 * p2)));
       this.fitToBounds(true, this.satTemp);
       return this.satTemp.vTranslate;
    }
    public void viewToFileRect(Rect p0,Rect p1){
       if (this.vTranslate != null && this.readySent != null) {
          p1.set((int)this.viewToSourceX((float)p0.left), (int)this.viewToSourceY((float)p0.top), (int)this.viewToSourceX((float)p0.right), (int)this.viewToSourceY((float)p0.bottom));
          this.fileSRect(p1, p1);
          p1.set(Math.max(0, p1.left), Math.max(0, p1.top), Math.min(this.sWidth, p1.right), Math.min(this.sHeight, p1.bottom));
          SubsamplingScaleImageView tsRegion = this.sRegion;
          if (tsRegion != null) {
             p1.offset(tsRegion.left, tsRegion.top);
          }
       }
       return;
    }
    public final PointF viewToSourceCoord(float p0,float p1){
       return this.viewToSourceCoord(p0, p1, new PointF());
    }
    public final PointF viewToSourceCoord(float p0,float p1,PointF p2){
       if (this.vTranslate == null) {
          return null;
       }
       p2.set(this.viewToSourceX(p0), this.viewToSourceY(p1));
       return p2;
    }
    public final PointF viewToSourceCoord(PointF p0){
       return this.viewToSourceCoord(p0.x, p0.y, new PointF());
    }
    public final PointF viewToSourceCoord(PointF p0,PointF p1){
       return this.viewToSourceCoord(p0.x, p0.y, p1);
    }
    public final float viewToSourceX(float p0){
       SubsamplingScaleImageView tvTranslate = this.vTranslate;
       if (tvTranslate == null) {
          return Float.NaN;
       }
       return ((p0 - tvTranslate.x) / this.scale);
    }
    public final float viewToSourceY(float p0){
       SubsamplingScaleImageView tvTranslate = this.vTranslate;
       if (tvTranslate == null) {
          return Float.NaN;
       }
       return ((p0 - tvTranslate.y) / this.scale);
    }
    public void visibleFileRect(Rect p0){
       if (this.vTranslate != null && this.readySent != null) {
          p0.set(0, 0, this.getWidth(), this.getHeight());
          this.viewToFileRect(p0, p0);
       }
       return;
    }
}
