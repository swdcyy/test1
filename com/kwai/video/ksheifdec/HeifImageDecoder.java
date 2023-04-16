package com.kwai.video.ksheifdec.HeifImageDecoder;
import yc.b;
import oc.b;
import pc.c;
import com.kwai.video.ksheifdec.HeifAnimatableInfo;
import java.lang.Object;
import com.facebook.imageformat.a;
import ed.v;
import ed.d;
import ed.b;
import ed.c;
import sc.c;
import bd.d;
import android.graphics.Bitmap$Config;
import android.graphics.BitmapFactory$Options;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.io.InputStream;
import android.graphics.Rect;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.nio.ByteBuffer;
import com.kwai.video.ksheifdec.HeifImageFrame;
import com.kwai.video.ksheifdec.KSHeifConfig;
import com.facebook.common.references.a;
import ab.e;
import com.facebook.common.memory.PooledByteBuffer;
import java.lang.System;
import java.lang.StringBuilder;
import java.io.PrintStream;
import java.lang.Exception;
import fb.c;
import com.facebook.imagepipeline.common.TooManyBitmapsException;
import uc.b;
import android.os.Build$VERSION;
import bd.h;
import com.facebook.imagepipeline.image.a;
import java.lang.Integer;
import java.lang.Long;
import com.kwai.video.ksheifdec.HeifDecodeOptionsInterface;
import java.lang.CharSequence;
import android.text.TextUtils;
import nc.a;
import com.kwai.video.ksheifdec.KpgImageFormat;
import com.kwai.video.ksheifdec.HeifLogger;
import com.facebook.imagepipeline.decoder.DecodeException;
import bd.c;
import bd.g;
import nd.a;
import eb.e;
import lnc.a0;
import java.lang.Throwable;
import com.facebook.common.internal.e;
import jb.a;
import com.kwai.video.ksheifdec.HeifQos;
import oc.e;
import oc.d;
import bd.a;
import oc.c;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo$BlendOperation;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo$DisposalMethod;

public class HeifImageDecoder implements b, b, c, HeifAnimatableInfo	// class@000f95
{
    public a mBitmapCreator;
    public d mBitmapPool;
    public b mDecodeOptions;
    public boolean mDecoderInitSuccess;
    public int mDuration;
    public int mFrameCount;
    public int[] mFrameDurations;
    public int mHeight;
    public a mImageFormat;
    public long mNativeDecoderHandle;
    public int mRotation;
    public int mSizeInBytes;
    public boolean mTiledMode;
    public b mUnpooledBitmapsCounter;
    public int mWidth;
    public String uniqueKey;
    public static final String TAG = "HeifImageDecoder";

    public void HeifImageDecoder(long p0){
       super();
       this.mWidth = 0;
       this.mHeight = 0;
       this.mRotation = 0;
       this.mFrameCount = 0;
       this.mDuration = 0;
       this.mTiledMode = false;
       this.mDecoderInitSuccess = false;
       this.mSizeInBytes = 0;
       this.mFrameDurations = null;
       this.mNativeDecoderHandle = 0;
       this.uniqueKey = "undefine";
       this.mImageFormat = a.c;
       this.mNativeDecoderHandle = p0;
    }
    public void HeifImageDecoder(v p0,a p1){
       super();
       this.mWidth = 0;
       this.mHeight = 0;
       this.mRotation = 0;
       this.mFrameCount = 0;
       this.mDuration = 0;
       this.mTiledMode = false;
       this.mDecoderInitSuccess = false;
       this.mSizeInBytes = 0;
       this.mFrameDurations = null;
       this.mNativeDecoderHandle = 0;
       this.uniqueKey = "undefine";
       this.mImageFormat = a.c;
       this.mBitmapPool = p0.a();
       this.mUnpooledBitmapsCounter = c.a();
       this.mBitmapCreator = new c(p0);
       this.mImageFormat = p1;
    }
    public static BitmapFactory$Options getDecodeOptionsHasDecodeBound(d p0,Bitmap$Config p1){
       BitmapFactory$Options obj = PatchProxy.applyTwoRefs(p0, p1, null, HeifImageDecoder.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new BitmapFactory$Options();
       obj.inSampleSize = p0.o();
       obj.inJustDecodeBounds = true;
       BitmapFactory.decodeStream(p0.k(), null, obj);
       if (obj.outWidth == -1 || obj.outHeight == -1) {
          return null;
       }
       obj.inJustDecodeBounds = false;
       obj.inDither = true;
       obj.inPreferredConfig = p1;
       obj.inMutable = true;
       return obj;
    }
    public static native HeifImageDecoder nativeCreateFromDirectByteBuffer(ByteBuffer p0,int p1,int p2);
    public static native HeifImageDecoder nativeCreateFromDirectByteBufferWithKey(ByteBuffer p0,int p1,String p2,int p3);
    public static native HeifImageDecoder nativeCreateFromNativeMemory(long p0,int p1,int p2,int p3);
    public static native HeifImageDecoder nativeCreateFromNativeMemoryWithKey(long p0,int p1,int p2,String p3,int p4);
    public static native void nativeDispose(long p0);
    public static native HeifImageFrame nativeGetFrame(long p0,int p1);
    public static native double nativeGetFrameDurationAtIndex(long p0,int p1);
    public static native String nativeGetHeifQos(long p0);
    public static native void nativeProbe(long p0,HeifImageDecoder p1);
    public static native void nativeRenderBitmap(long p0,int p1,Bitmap p2);
    public static HeifImageDecoder parseHeifImageMetadata(d p0){
       HeifImageDecoder heifImageDec = null;
       Object obj = PatchProxy.applyOneRefs(p0, heifImageDec, HeifImageDecoder.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return heifImageDec;
       }
       KSHeifConfig.ensureLoadDecodeLibrary();
       a uoa = p0.e();
       try{
          String str = "undefine";
          e.d(uoa);
          PooledByteBuffer pooledByteBu = uoa.j();
          long l = System.currentTimeMillis();
          HeifImageDecoder heifImageDec1 = (pooledByteBu.n() != null)? HeifImageDecoder.nativeCreateFromDirectByteBufferWithKey(pooledByteBu.n(), 1, str, 1): HeifImageDecoder.nativeCreateFromNativeMemoryWithKey(pooledByteBu.B(), pooledByteBu.size(), 1, str, 1);
          heifImageDec = heifImageDec1;
          System.out.println("nativeCreate cost time: "+(System.currentTimeMillis() - l));
       }catch(java.lang.Exception e10){
          e10.printStackTrace();
       }
       if (heifImageDec != null) {
          heifImageDec.releaseDecoder(heifImageDec);
       }
       return heifImageDec;
    }
    public final a countBitmap(Bitmap p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HeifImageDecoder.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mUnpooledBitmapsCounter.c(p0)) {
          return a.p(p0, this.mUnpooledBitmapsCounter.b());
       }
       p0.recycle();
       throw new TooManyBitmapsException();
    }
    public final a createBitmapFromFactory(d p0,b p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, HeifImageDecoder.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (Build$VERSION.SDK_INT < 28) {
          return null;
       }
       if (p0 != null && p1 != null) {
          BitmapFactory$Options decodeOption = HeifImageDecoder.getDecodeOptionsHasDecodeBound(p0, p1.g);
          if (decodeOption != null) {
             Bitmap uBitmap = BitmapFactory.decodeStream(p0.k(), null, decodeOption);
             if (uBitmap != null) {
                return a.p(uBitmap, this.mBitmapPool);
             }
          }
       }
       return null;
    }
    public a decode(d p0,int p1,h p2,b p3){
       if (PatchProxy.isSupport(HeifImageDecoder.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), p2, p3, this, HeifImageDecoder.class, "16");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mDecodeOptions = p3;
       return this.decodeHeif(p0, p3);
    }
    public b decode(long p0,int p1){
       return null;
    }
    public b decode(HeifImageDecoder p0,long p1,int p2){
       HeifImageDecoder obj;
       if (PatchProxy.isSupport(HeifImageDecoder.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Long.valueOf(p1), Integer.valueOf(p2), this, HeifImageDecoder.class, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       KSHeifConfig.ensureLoadDecodeLibrary();
       if (p0 == null) {
          return null;
       }else {
          p0.mSizeInBytes = p2;
          obj = p0.mFrameCount;
          if (obj > null) {
             int[] ointArray = new int[obj];
             p0.mFrameDurations = ointArray;
             for (int i = 0; i < p0.mFrameCount; i++) {
                double d = HeifImageDecoder.nativeGetFrameDurationAtIndex(p0.mNativeDecoderHandle, i) * 0x408f400000000000;
                int i1 = (int)d;
                if (!i1) {
                   i1 = p0.mDuration * 1000;
                   i1 = i1 / p0.mFrameCount;
                }
                p2[i] = i1;
             }
          }
          return p0;
       }
    }
    public b decode(HeifImageDecoder p0,ByteBuffer p1){
       int i1;
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, HeifImageDecoder.class, "15");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       KSHeifConfig.ensureLoadDecodeLibrary();
       if (p0 == null) {
          return null;
       }
       HeifImageDecoder mFrameCount = p0.mFrameCount;
       if (mFrameCount > null && p0.mDuration > null) {
          int[] ointArray = new int[mFrameCount];
          p0.mFrameDurations = ointArray;
          for (int i = 0; i < p0.mFrameCount; i = i + 1) {
             try{
                double d = HeifImageDecoder.nativeGetFrameDurationAtIndex(p0.mNativeDecoderHandle, i) * 0x408f400000000000;
                i1 = (int)d;
             }catch(java.lang.Exception e1){
                e1.printStackTrace();
                i1 = 0;
             }
             if (!i1) {
                i1 = p0.mDuration * 1000;
                i1 = i1 / p0.mFrameCount;
             }
             p0.mFrameDurations[i] = i1;
          }
       }
       return p0;
    }
    public b decode(ByteBuffer p0){
       return null;
    }
    public a decodeHeif(d p0,b p1){
       c uoc;
       boolean i2;
       HeifImageDecoder heifImageDec;
       StringBuilder obj4;
       a closeableIma;
       Object obj = this;
       Object obj1 = p0;
       Object obj2 = p1;
       b obj3 = PatchProxy.applyTwoRefs(obj1, obj2, obj, HeifImageDecoder.class, "17");
       if (obj3 != PatchProxyResult.class) {
          return obj3;
       }
       KSHeifConfig.ensureLoadDecodeLibrary();
       a uoa = p0.e();
       String str = "undefine";
       obj3 = obj2.g;
       a uoa1 = null;
       try{
          int i = 1;
          e.d(uoa);
          if (obj2 instanceof HeifDecodeOptionsInterface) {
             String uniqueKey = obj2.getUniqueKey();
             if (!TextUtils.isEmpty(uniqueKey)) {
                str = uniqueKey;
             }
          }
          PooledByteBuffer pooledByteBu = uoa.j();
          int i1 = -1;
          HeifImageDecoder mImageFormat = obj.mImageFormat;
          if (mImageFormat == a.k) {
             i1 = 1;
          }else if(mImageFormat == KpgImageFormat.KPG){
             i1 = 0;
          }else if(mImageFormat != a.j && (mImageFormat != a.h && (mImageFormat != a.i && (mImageFormat == a.g || mImageFormat == a.f)))){
             i1 = 2;
          }
          if (pooledByteBu.n() != null) {
             ByteBuffer uByteBuffer = pooledByteBu.n();
             i2 = (obj3 == Bitmap$Config.ARGB_8888)? 1: 0;
             heifImageDec = HeifImageDecoder.nativeCreateFromDirectByteBufferWithKey(uByteBuffer, i2, str, i1);
          }else {
             long l = pooledByteBu.B();
             int i4 = pooledByteBu.size();
             int i5 = (obj3 == Bitmap$Config.ARGB_8888)? 1: 0;
             heifImageDec = HeifImageDecoder.nativeCreateFromNativeMemoryWithKey(l, i4, i5, str, i1);
          }
          try{
             if (heifImageDec != null) {
                if (obj2 instanceof HeifDecodeOptionsInterface) {
                   obj4 = obj2;
                   i2 = (heifImageDec.mFrameCount > i)? true: false;
                   obj4.setIsAnimatedImage(i2);
                }
                HeifLogger.d(str, "staticImg heif decoder param, staticImgFirstUseSystemDecoder£º"+KSHeifConfig.getStaticImgFirstUseSystemDecoder()+" StaticImgRetryUseSystemDecoder£º"+KSHeifConfig.getStaticImgRetryUseSystemDecoder()+" sUseFFmpegSwScale: "+KSHeifConfig.getUseFFmpegSwScale());
                if (KSHeifConfig.getStaticImgFirstUseSystemDecoder() && heifImageDec.getFrameCount() <= i) {
                   uoa1 = this.createBitmapFromFactory(p0, p1);
                   obj4 = "staticImg firstUseSystemDecoder, result = ";
                   i2 = (uoa1 != null)? true: false;
                   HeifLogger.w(str, obj4+i2);
                }
                if (uoa1 == null) {
                   if (heifImageDec.mDecoderInitSuccess != null) {
                      HeifImageDecoder.nativeProbe(heifImageDec.mNativeDecoderHandle, heifImageDec);
                      heifImageDec.uniqueKey = str;
                      if (heifImageDec.getFrameCount() > i) {
                         closeableIma = obj.getCloseableImage(obj2, obj.decode(heifImageDec, pooledByteBu.B(), pooledByteBu.size()));
                         a.f(uoa);
                         if (heifImageDec.getFrameCount() <= i) {
                            obj.releaseDecoder(heifImageDec);
                         }
                         return closeableIma;
                      }else {
                         int i3 = p0.o();
                         closeableIma = (this.useAboveKitKatWay())? obj.decodeHeifFromStreamAboveKitKat(heifImageDec, p0.k(), obj3, i3): obj.decodeHeifFromStreamBelowKitKat(heifImageDec, p0.k(), i3, obj3);
                         uoa1 = closeableIma;
                         StringBuilder str1 = "useHeifDecoder, result = ";
                         boolean b = (uoa1 != null)? true: false;
                         HeifLogger.w(str, str1+b);
                      }
                   }else {
                      throw new DecodeException("heif decode init error", obj1);
                   }
                }
                if (uoa1 != null) {
                   uoc = new c(uoa1, g.d, p0.l());
                   uoa1.close();
                   a.f(uoa);
                   if (heifImageDec.getFrameCount() <= i) {
                      obj.releaseDecoder(heifImageDec);
                   }
                   return uoc;
                }else {
                   throw new DecodeException("heif decode error, not get bitmap", obj1);
                }
             }else {
                throw new DecodeException("heif decode error, not get bitmap", obj1);
             }
          }catch(java.lang.Exception e0){
             HeifImageDecoder heifImageDec1 = heifImageDec;
          }
          e0.printStackTrace();
          uoc = obj.retryWithBitmapFactory(str, uoa1, obj1, obj2);
          if (uoc != null) {
             a.f(uoa);
             if (uoa1 != null && uoa1.getFrameCount() <= i) {
                obj.releaseDecoder(uoa1);
             }
             return uoc;
          }else {
             throw new DecodeException("heif decode error, not get bitmap", obj1);
          }
       }catch(java.lang.Exception e0){
          goto label_019f ;
       }
    }
    public final a decodeHeifFromStreamAboveKitKat(HeifImageDecoder p0,InputStream p1,Bitmap$Config p2,int p3){
       if (PatchProxy.isSupport(HeifImageDecoder.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, p2, Integer.valueOf(p3), this, HeifImageDecoder.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 == null) {
          return null;
       }else {
          KSHeifConfig.ensureLoadDecodeLibrary();
          int width = p0.getWidth();
          int height = p0.getHeight();
          if (p3) {
             width = width / p3;
             height = height / p3;
          }
          p3 = a.c(width, height, p2);
          try{
             e.d(p1);
             Bitmap uBitmap = this.mBitmapPool.get(p3);
             try{
                a0.a(uBitmap, width, height, p2);
                HeifImageDecoder.nativeRenderBitmap(p0.mNativeDecoderHandle, 0, uBitmap);
                return a.p(uBitmap, this.mBitmapPool);
             }catch(java.lang.RuntimeException e9){
                this.mBitmapPool.a(uBitmap);
                throw e9;
             }
          }catch(java.lang.OutOfMemoryError e0){
             return e0;
          }
       }
    }
    public final a decodeHeifFromStreamBelowKitKat(HeifImageDecoder p0,InputStream p1,int p2,Bitmap$Config p3){
       if (PatchProxy.isSupport(HeifImageDecoder.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), p3, this, HeifImageDecoder.class, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 == null) {
          return null;
       }else {
          try{
             KSHeifConfig.ensureLoadDecodeLibrary();
             e.d(p1);
             Bitmap uBitmap = this.mBitmapCreator.a((p0.getWidth() / p2), (p0.getHeight() / p2), p3);
             try{
                HeifImageDecoder.nativeRenderBitmap(p0.mNativeDecoderHandle, 0, uBitmap);
             }catch(java.lang.Exception e9){
                e9.printStackTrace();
             }
             return this.countBitmap(uBitmap);
          }catch(java.lang.OutOfMemoryError e0){
             return e0;
          }
       }
    }
    public void dispose(){
       if (PatchProxy.applyVoid(null, this, HeifImageDecoder.class, "10")) {
          return;
       }
       this.releaseDecoder(this);
       this.mWidth = 0;
       this.mHeight = 0;
       this.mFrameCount = 0;
       this.mDuration = 0;
       this.mSizeInBytes = 0;
       this.mFrameDurations = null;
       return;
    }
    public boolean doesRenderSupportScaling(){
       return false;
    }
    public void finalize(){
       if (PatchProxy.applyVoid(null, this, HeifImageDecoder.class, "11")) {
          return;
       }
       KSHeifConfig.ensureLoadDecodeLibrary();
       HeifImageDecoder tmNativeDeco = this.mNativeDecoderHandle;
       if (tmNativeDeco) {
          try{
             HeifImageDecoder.nativeDispose(tmNativeDeco);
          }catch(java.lang.Exception e0){
             e0.printStackTrace();
          }
          this.mNativeDecoderHandle = 0;
       }
       return;
    }
    public HeifQos getAnimatedImageQos(){
       String obj = PatchProxy.apply(null, this, HeifImageDecoder.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       KSHeifConfig.ensureLoadDecodeLibrary();
       HeifImageDecoder tmNativeDeco = this.mNativeDecoderHandle;
       if (tmNativeDeco) {
          try{
             obj = HeifImageDecoder.nativeGetHeifQos(tmNativeDeco);
             if (!TextUtils.isEmpty(obj)) {
                HeifQos heifQos = new HeifQos();
                heifQos.setQosJson(obj);
                heifQos.setUniqueKey(this.uniqueKey);
                return heifQos;
             }
          }catch(java.lang.Exception e0){
             e0.printStackTrace();
          }
       }
    }
    public final a getCloseableImage(b p0,b p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, HeifImageDecoder.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = (p0.d != null)? p1.getFrameCount() - 1: 0;
       e uoe = d.e(p1);
       uoe.b(i);
       d uod = uoe.a();
       return new a(uod);
    }
    public int getDuration(){
       return this.mDuration;
    }
    public c getFrame(int p0){
       HeifImageFrame obj;
       HeifImageDecoder heifImageDec = HeifImageDecoder.class;
       if (PatchProxy.isSupport(heifImageDec)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, heifImageDec, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       KSHeifConfig.ensureLoadDecodeLibrary();
       obj = null;
       HeifImageDecoder tmNativeDeco = this.mNativeDecoderHandle;
       if (tmNativeDeco) {
          try{
             obj = HeifImageDecoder.nativeGetFrame(tmNativeDeco, p0);
          }catch(java.lang.Exception e1){
             e1.printStackTrace();
          }
          if (obj != null) {
             obj.index = p0;
          }
       }
       return obj;
    }
    public int getFrameCount(){
       return this.mFrameCount;
    }
    public int[] getFrameDurations(){
       return this.mFrameDurations;
    }
    public AnimatedDrawableFrameInfo getFrameInfo(int p0){
       c obj;
       HeifImageDecoder heifImageDec = HeifImageDecoder.class;
       if (PatchProxy.isSupport(heifImageDec)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, heifImageDec, "13");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.getFrame(p0);
       if (obj == null) {
          return null;
       }else {
          AnimatedDrawableFrameInfo uAnimatedDra = new AnimatedDrawableFrameInfo(p0, obj.getXOffset(), obj.getYOffset(), obj.getWidth(), obj.getHeight(), AnimatedDrawableFrameInfo$BlendOperation.NO_BLEND, AnimatedDrawableFrameInfo$DisposalMethod.DISPOSE_DO_NOT);
          obj.dispose();
          return v9;
       }
    }
    public int getHeight(){
       return this.mHeight;
    }
    public int getLoopCount(){
       return 0;
    }
    public int getRotation(){
       int i = (- this.mRotation) * 90;
       if (i == -270) {
          return 6;
       }
       if (i == -180) {
          return 3;
       }
       if (i == -90) {
          return 8;
       }
       if (i) {
          return 0;
       }
       return 1;
    }
    public int getSizeInBytes(){
       return this.mSizeInBytes;
    }
    public int getWidth(){
       return this.mWidth;
    }
    public final void releaseDecoder(HeifImageDecoder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HeifImageDecoder.class, "2")) {
          return;
       }
       KSHeifConfig.ensureLoadDecodeLibrary();
       if (p0 == null) {
          return;
       }
       HeifImageDecoder mNativeDecod = p0.mNativeDecoderHandle;
       if (mNativeDecod) {
          try{
             HeifImageDecoder.nativeDispose(mNativeDecod);
          }catch(java.lang.Exception e0){
             e0.printStackTrace();
          }
          p0.mNativeDecoderHandle = 0;
       }
       return;
    }
    public final c retryWithBitmapFactory(String p0,HeifImageDecoder p1,d p2,b p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, HeifImageDecoder.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1 != null) {
          boolean b = true;
          if (p1.getFrameCount() <= b && (KSHeifConfig.getStaticImgRetryUseSystemDecoder() && !KSHeifConfig.getStaticImgFirstUseSystemDecoder())) {
             a uoa = this.createBitmapFromFactory(p2, p3);
             StringBuilder str = "staticImg retryUseSystemDecoder, result = ";
             if (uoa == null) {
                b = false;
             }
             HeifLogger.w(p0, str+b);
             if (uoa != null) {
                uoa.close();
                return new c(uoa, g.d, p2.l());
             }
          }
       }
    label_0056 :
       return null;
    }
    public final boolean useAboveKitKatWay(){
       return true;
    }
}
