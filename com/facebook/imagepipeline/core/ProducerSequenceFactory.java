package com.facebook.imagepipeline.core.ProducerSequenceFactory;
import android.content.ContentResolver;
import vc.m;
import com.facebook.imagepipeline.producers.n;
import id.k0;
import ld.d;
import java.lang.Object;
import java.util.HashMap;
import android.net.Uri;
import java.lang.String;
import java.lang.StringBuilder;
import com.facebook.imagepipeline.request.ImageRequest;
import ab.e;
import com.facebook.imagepipeline.request.ImageRequest$RequestLevel;
import java.lang.Boolean;
import id.b0;
import kd.b;
import com.facebook.imagepipeline.producers.h;
import com.facebook.imagepipeline.producers.k;
import java.lang.IllegalArgumentException;
import db.a;
import java.util.Map;
import id.f;
import java.util.Objects;
import id.a;
import com.facebook.imagepipeline.producers.r;
import com.facebook.imagepipeline.producers.a;
import com.facebook.common.memory.b;
import jb.c;
import com.facebook.imagepipeline.producers.t;
import id.j0;
import jd.c;
import id.j;
import java.util.concurrent.ScheduledExecutorService;
import vc.f;
import com.facebook.imagepipeline.producers.g;
import java.util.concurrent.Executor;
import android.content.res.AssetManager;
import id.g0;
import id.o0;
import com.facebook.imagepipeline.producers.i;
import com.facebook.imagepipeline.producers.LocalExifThumbnailProducer;
import com.facebook.imagepipeline.producers.l;
import android.content.res.Resources;
import com.facebook.imagepipeline.producers.LocalVideoThumbnailProducer;
import id.z;
import sc.d;
import id.y;
import tc.v;
import tc.h;
import com.facebook.imagepipeline.producers.q;
import com.facebook.imagepipeline.producers.BitmapMemoryCacheProducer;
import com.facebook.imagepipeline.producers.BitmapMemoryCacheKeyMultiplexProducer;
import com.facebook.imagepipeline.producers.BitmapMemoryCacheGetProducer;
import id.g;
import tc.g;
import tc.d;
import com.facebook.imagepipeline.producers.b;
import com.facebook.imagepipeline.producers.p;
import eb.a;
import id.n;
import id.m;
import id.p;
import id.q;
import id.o;
import id.n0;
import id.m0;
import id.h;

public class ProducerSequenceFactory	// class@00047a
{
    public final boolean mAllowDelay;
    public b0 mBackgroundLocalContentUriFetchToEncodedMemorySequence;
    public b0 mBackgroundLocalFileFetchToEncodedMemorySequence;
    public b0 mBackgroundNetworkFetchToEncodedMemorySequence;
    public Map mBitmapPrepareSequences;
    public Map mCloseableImagePrefetchSequences;
    public b0 mCommonNetworkFetchToEncodedMemorySequence;
    public final ContentResolver mContentResolver;
    public b0 mDataFetchSequence;
    public final boolean mDiskCacheEnabled;
    public final boolean mDownsampleEnabled;
    public final d mImageTranscoderFactory;
    public final boolean mIsDiskCacheProbingEnabled;
    public final boolean mIsEncodedMemoryCacheProbingEnabled;
    public b0 mLocalAssetFetchSequence;
    public b0 mLocalContentUriEncodedImageProducerSequence;
    public b0 mLocalContentUriFetchSequence;
    public b0 mLocalFileEncodedImageProducerSequence;
    public b0 mLocalFileFetchToEncodedMemoryPrefetchSequence;
    public b0 mLocalImageFileFetchSequence;
    public b0 mLocalResourceFetchSequence;
    public b0 mLocalVideoFileFetchSequence;
    public b0 mNetworkEncodedImageProducerSequence;
    public b0 mNetworkFetchSequence;
    public b0 mNetworkFetchToEncodedMemoryPrefetchSequence;
    public final n mNetworkFetcher;
    public final boolean mPartialImageCachingEnabled;
    public Map mPostprocessorSequences;
    public final m mProducerFactory;
    public b0 mQualifiedResourceFetchSequence;
    public final boolean mResizeAndRotateEnabledForNetwork;
    public final k0 mThreadHandoffProducerQueue;
    public final boolean mUseBitmapPrepareToDraw;
    public final boolean mUseCombinedNetworkAndCacheProducer;
    public final boolean mWebpSupportEnabled;

    public void ProducerSequenceFactory(ContentResolver p0,m p1,n p2,boolean p3,boolean p4,k0 p5,boolean p6,boolean p7,boolean p8,boolean p9,d p10,boolean p11,boolean p12,boolean p13,boolean p14){
       super();
       this.mContentResolver = p0;
       this.mProducerFactory = p1;
       this.mNetworkFetcher = p2;
       this.mResizeAndRotateEnabledForNetwork = p3;
       this.mWebpSupportEnabled = p4;
       this.mUseCombinedNetworkAndCacheProducer = p13;
       this.mPostprocessorSequences = new HashMap();
       this.mCloseableImagePrefetchSequences = new HashMap();
       this.mBitmapPrepareSequences = new HashMap();
       this.mThreadHandoffProducerQueue = p5;
       this.mDownsampleEnabled = p6;
       this.mUseBitmapPrepareToDraw = p7;
       this.mPartialImageCachingEnabled = p8;
       this.mDiskCacheEnabled = p9;
       this.mImageTranscoderFactory = p10;
       this.mIsEncodedMemoryCacheProbingEnabled = p11;
       this.mIsDiskCacheProbingEnabled = p12;
       this.mAllowDelay = p14;
    }
    public static String getShortenedUriString(Uri p0){
       String str = String.valueOf(p0);
       if (str.length() > 30) {
          str = str.substring(0, 30)+"...";
       }
       return str;
    }
    public static void validateEncodedImageRequest(ImageRequest p0){
       e.d(p0);
       boolean b = (p0.i().getValue() <= ImageRequest$RequestLevel.ENCODED_MEMORY_CACHE.getValue())? true: false;
       e.a(Boolean.valueOf(b));
       return;
    }
    public synchronized final b0 getBackgroundLocalContentUriFetchToEncodeMemorySequence(){
       if (b.d()) {
          b.a("ProducerSequenceFactory#getBackgroundLocalContentUriFetchToEncodeMemorySequence");
       }
       if (this.mBackgroundLocalContentUriFetchToEncodedMemorySequence == null) {
          if (b.d()) {
             b.a("ProducerSequenceFactory#getBackgroundLocalContentUriFetchToEncodeMemorySequence:init");
          }
          this.mBackgroundLocalContentUriFetchToEncodedMemorySequence = this.mProducerFactory.b(this.newEncodedCacheMultiplexToTranscodeSequence(this.mProducerFactory.g()), this.mThreadHandoffProducerQueue);
          if (b.d()) {
             b.b();
          }
       }
       if (b.d()) {
          b.b();
       }
       return this.mBackgroundLocalContentUriFetchToEncodedMemorySequence;
    }
    public synchronized final b0 getBackgroundLocalFileFetchToEncodeMemorySequence(){
       if (b.d()) {
          b.a("ProducerSequenceFactory#getBackgroundLocalFileFetchToEncodeMemorySequence");
       }
       if (this.mBackgroundLocalFileFetchToEncodedMemorySequence == null) {
          if (b.d()) {
             b.a("ProducerSequenceFactory#getBackgroundLocalFileFetchToEncodeMemorySequence:init");
          }
          this.mBackgroundLocalFileFetchToEncodedMemorySequence = this.mProducerFactory.b(this.newEncodedCacheMultiplexToTranscodeSequence(this.mProducerFactory.i()), this.mThreadHandoffProducerQueue);
          if (b.d()) {
             b.b();
          }
       }
       if (b.d()) {
          b.b();
       }
       return this.mBackgroundLocalFileFetchToEncodedMemorySequence;
    }
    public synchronized final b0 getBackgroundNetworkFetchToEncodedMemorySequence(){
       if (b.d()) {
          b.a("ProducerSequenceFactory#getBackgroundNetworkFetchToEncodedMemorySequence");
       }
       if (this.mBackgroundNetworkFetchToEncodedMemorySequence == null) {
          if (b.d()) {
             b.a("ProducerSequenceFactory#getBackgroundNetworkFetchToEncodedMemorySequence:init");
          }
          this.mBackgroundNetworkFetchToEncodedMemorySequence = this.mProducerFactory.b(this.getCommonNetworkFetchToEncodedMemorySequence(), this.mThreadHandoffProducerQueue);
          if (b.d()) {
             b.b();
          }
       }
       if (b.d()) {
          b.b();
       }
       return this.mBackgroundNetworkFetchToEncodedMemorySequence;
    }
    public final b0 getBasicDecodedImageSequence(ImageRequest p0){
       b0 localVideoFi;
       if (b.d()) {
          b.a("ProducerSequenceFactory#getBasicDecodedImageSequence");
       }
       e.d(p0);
       Uri uri = p0.s();
       e.e(uri, "Uri is null.");
       int i = p0.t();
       if (i) {
          switch (i){
              case 2:
                localVideoFi = this.getLocalVideoFileFetchSequence();
                if (b.d()) {
                   b.b();
                }
                break;
              case 3:
                localVideoFi = this.getLocalImageFileFetchSequence();
                if (b.d()) {
                   b.b();
                }
                return localVideoFi;
                break;
              case 4:
                if (a.a(this.mContentResolver.getType(uri))) {
                   localVideoFi = this.getLocalVideoFileFetchSequence();
                   if (b.d()) {
                      b.b();
                   }
                   return localVideoFi;
                }else {
                   localVideoFi = this.getLocalContentUriFetchSequence();
                   if (b.d()) {
                      b.b();
                   }
                   return localVideoFi;
                }
                break;
              case 5:
                localVideoFi = this.getLocalAssetFetchSequence();
                if (b.d()) {
                   b.b();
                }
                return localVideoFi;
                break;
              case 6:
                localVideoFi = this.getLocalResourceFetchSequence();
                if (b.d()) {
                   b.b();
                }
                return localVideoFi;
                break;
              case 7:
                localVideoFi = this.getDataFetchSequence();
                if (b.d()) {
                   b.b();
                }
                return localVideoFi;
                break;
              case 8:
                localVideoFi = this.getQualifiedResourceFetchSequence();
                if (b.d()) {
                   b.b();
                }
                return localVideoFi;
                break;
              default:
                throw new IllegalArgumentException("Unsupported uri scheme! Uri is: "+ProducerSequenceFactory.getShortenedUriString(uri));
          }
          return localVideoFi;
       }else {
          localVideoFi = this.getNetworkFetchSequence();
          if (b.d()) {
             b.b();
          }
          return localVideoFi;
       }
    }
    public synchronized final b0 getBitmapPrepareSequence(b0 p0){
       b0 uob0 = this.mBitmapPrepareSequences.get(p0);
       if (uob0 == null) {
          ProducerSequenceFactory tmProducerFa = this.mProducerFactory;
          f uof = new f(p0, tmProducerFa.t, tmProducerFa.u, tmProducerFa.v);
          this.mBitmapPrepareSequences.put(p0, uof);
          uob0 = uof;
       }
       return uob0;
    }
    public synchronized final b0 getCommonNetworkFetchToEncodedMemorySequence(){
       b0 uob0;
       boolean b;
       if (b.d()) {
          b.a("ProducerSequenceFactory#getCommonNetworkFetchToEncodedMemorySequence");
       }
       if (this.mCommonNetworkFetchToEncodedMemorySequence == null) {
          if (b.d()) {
             b.a("ProducerSequenceFactory#getCommonNetworkFetchToEncodedMemorySequence:init");
          }
          if (this.mUseCombinedNetworkAndCacheProducer != null) {
             Objects.requireNonNull(this.mProducerFactory);
             uob0 = null;
          }else {
             uob0 = this.newEncodedCacheMultiplexToTranscodeSequence(this.mProducerFactory.k(this.mNetworkFetcher));
          }
          e.d(uob0);
          a uoa = m.a(uob0);
          this.mCommonNetworkFetchToEncodedMemorySequence = uoa;
          ProducerSequenceFactory tmProducerFa = this.mProducerFactory;
          b = (this.mResizeAndRotateEnabledForNetwork != null && this.mDownsampleEnabled == null)? true: false;
          this.mCommonNetworkFetchToEncodedMemorySequence = tmProducerFa.l(uoa, b, this.mImageTranscoderFactory);
          if (b.d()) {
             b.b();
          }
       }
       if (b.d()) {
          b.b();
       }
       return this.mCommonNetworkFetchToEncodedMemorySequence;
    }
    public synchronized final b0 getDataFetchSequence(){
       if (this.mDataFetchSequence == null) {
          a uoa = new a(this.mProducerFactory.k);
          if (c.a && (this.mWebpSupportEnabled == null || c.d == null)) {
             uoa = this.mProducerFactory.n(uoa);
          }
          this.mDataFetchSequence = this.newBitmapCacheGetToDecodeSequence(this.mProducerFactory.l(m.a(uoa), true, this.mImageTranscoderFactory));
       }
       return this.mDataFetchSequence;
    }
    public b0 getDecodedImagePrefetchProducerSequence(ImageRequest p0){
       b0 basicDecoded = this.getBasicDecodedImageSequence(p0);
       if (this.mUseBitmapPrepareToDraw != null) {
          basicDecoded = this.getBitmapPrepareSequence(basicDecoded);
       }
       return this.getDecodedImagePrefetchSequence(basicDecoded);
    }
    public synchronized final b0 getDecodedImagePrefetchSequence(b0 p0){
       b0 uob0 = this.mCloseableImagePrefetchSequences.get(p0);
       if (uob0 == null) {
          uob0 = this.mProducerFactory.m(p0);
          this.mCloseableImagePrefetchSequences.put(p0, uob0);
       }
       return uob0;
    }
    public b0 getDecodedImageProducerSequence(ImageRequest p0){
       if (b.d()) {
          b.a("ProducerSequenceFactory#getDecodedImageProducerSequence");
       }
       b0 basicDecoded = this.getBasicDecodedImageSequence(p0);
       if (p0.j() != null) {
          basicDecoded = this.getPostprocessorSequence(basicDecoded);
       }
       if (this.mUseBitmapPrepareToDraw != null) {
          basicDecoded = this.getBitmapPrepareSequence(basicDecoded);
       }
       if (this.mAllowDelay != null && p0.f() > 0) {
          basicDecoded = this.getDelaySequence(basicDecoded);
       }
       if (b.d()) {
          b.b();
       }
       return basicDecoded;
    }
    public synchronized final b0 getDelaySequence(b0 p0){
       return new j(p0, this.mProducerFactory.j.d());
    }
    public b0 getEncodedImagePrefetchProducerSequence(ImageRequest p0){
       ProducerSequenceFactory.validateEncodedImageRequest(p0);
       int i = p0.t();
       if (!i) {
          return this.getNetworkFetchToEncodedMemoryPrefetchSequence();
       }
       if (i == 2 || i == 3) {
          return this.getLocalFileFetchToEncodedMemoryPrefetchSequence();
       }
       throw new IllegalArgumentException("Unsupported uri scheme for encoded image fetch! Uri is: "+ProducerSequenceFactory.getShortenedUriString(p0.s()));
    }
    public b0 getEncodedImageProducerSequence(ImageRequest p0){
       b0 localContent;
       if (b.d()) {
          b.a("ProducerSequenceFactory#getEncodedImageProducerSequence");
       }
       ProducerSequenceFactory.validateEncodedImageRequest(p0);
       Uri uri = p0.s();
       int i = p0.t();
       if (i) {
          if (i != 2 && i != 3) {
             if (i == 4) {
                localContent = this.getLocalContentUriFetchEncodedImageProducerSequence();
                if (b.d()) {
                   b.b();
                }
                return localContent;
             }else {
                throw new IllegalArgumentException("Unsupported uri scheme for encoded image fetch! Uri is: "+ProducerSequenceFactory.getShortenedUriString(uri));
             }
          }else {
             localContent = this.getLocalFileFetchEncodedImageProducerSequence();
             if (b.d()) {
                b.b();
             }
             return localContent;
          }
       }else {
          localContent = this.getNetworkFetchEncodedImageProducerSequence();
          if (b.d()) {
             b.b();
          }
          return localContent;
       }
    }
    public synchronized final b0 getLocalAssetFetchSequence(){
       if (this.mLocalAssetFetchSequence == null) {
          ProducerSequenceFactory tmProducerFa = this.mProducerFactory;
          this.mLocalAssetFetchSequence = this.newBitmapCacheGetToLocalTransformSequence(new g(tmProducerFa.j.b(), tmProducerFa.k, tmProducerFa.c));
       }
       return this.mLocalAssetFetchSequence;
    }
    public b0 getLocalContentUriFetchEncodedImageProducerSequence(){
       _monitor_enter(this);
       if (b.d()) {
          b.a("ProducerSequenceFactory#getLocalContentUriFetchEncodedImageProducerSequence");
       }
       if (this.mLocalContentUriEncodedImageProducerSequence == null) {
          if (b.d()) {
             b.a("ProducerSequenceFactory#getLocalContentUriFetchEncodedImageProducerSequence:init");
          }
          this.mLocalContentUriEncodedImageProducerSequence = new g0(this.getBackgroundLocalContentUriFetchToEncodeMemorySequence());
          if (b.d()) {
             b.b();
          }
       }
       if (b.d()) {
          b.b();
       }
       _monitor_exit(this);
       return this.mLocalContentUriEncodedImageProducerSequence;
    }
    public synchronized final b0 getLocalContentUriFetchSequence(){
       ProducerSequenceFactory tmProducerFa;
       if (this.mLocalContentUriFetchSequence == null) {
          o0[] oo0Array = new o0[]{new i(tmProducerFa.j.b(), tmProducerFa.k, tmProducerFa.a),this.mProducerFactory.h()};
          tmProducerFa = this.mProducerFactory;
          Objects.requireNonNull(tmProducerFa);
          this.mLocalContentUriFetchSequence = this.newBitmapCacheGetToLocalTransformSequence(this.mProducerFactory.g(), oo0Array);
       }
       return this.mLocalContentUriFetchSequence;
    }
    public b0 getLocalFileFetchEncodedImageProducerSequence(){
       _monitor_enter(this);
       if (b.d()) {
          b.a("ProducerSequenceFactory#getLocalFileFetchEncodedImageProducerSequence");
       }
       if (this.mLocalFileEncodedImageProducerSequence == null) {
          if (b.d()) {
             b.a("ProducerSequenceFactory#getLocalFileFetchEncodedImageProducerSequence:init");
          }
          this.mLocalFileEncodedImageProducerSequence = new g0(this.getBackgroundLocalFileFetchToEncodeMemorySequence());
          if (b.d()) {
             b.b();
          }
       }
       if (b.d()) {
          b.b();
       }
       _monitor_exit(this);
       return this.mLocalFileEncodedImageProducerSequence;
    }
    public synchronized final b0 getLocalFileFetchToEncodedMemoryPrefetchSequence(){
       if (b.d()) {
          b.a("ProducerSequenceFactory#getLocalFileFetchToEncodedMemoryPrefetchSequence");
       }
       if (this.mLocalFileFetchToEncodedMemoryPrefetchSequence == null) {
          if (b.d()) {
             b.a("ProducerSequenceFactory#getLocalFileFetchToEncodedMemoryPrefetchSequence:init");
          }
          this.mLocalFileFetchToEncodedMemoryPrefetchSequence = this.mProducerFactory.m(this.getBackgroundLocalFileFetchToEncodeMemorySequence());
          if (b.d()) {
             b.b();
          }
       }
       if (b.d()) {
          b.b();
       }
       return this.mLocalFileFetchToEncodedMemoryPrefetchSequence;
    }
    public synchronized final b0 getLocalImageFileFetchSequence(){
       if (this.mLocalImageFileFetchSequence == null) {
          this.mLocalImageFileFetchSequence = this.newBitmapCacheGetToLocalTransformSequence(this.mProducerFactory.i());
       }
       return this.mLocalImageFileFetchSequence;
    }
    public synchronized final b0 getLocalResourceFetchSequence(){
       if (this.mLocalResourceFetchSequence == null) {
          ProducerSequenceFactory tmProducerFa = this.mProducerFactory;
          this.mLocalResourceFetchSequence = this.newBitmapCacheGetToLocalTransformSequence(new l(tmProducerFa.j.b(), tmProducerFa.k, tmProducerFa.b));
       }
       return this.mLocalResourceFetchSequence;
    }
    public synchronized final b0 getLocalVideoFileFetchSequence(){
       if (this.mLocalVideoFileFetchSequence == null) {
          this.mLocalVideoFileFetchSequence = this.newBitmapCacheGetToBitmapCacheSequence(this.mProducerFactory.j());
       }
       return this.mLocalVideoFileFetchSequence;
    }
    public b0 getNetworkFetchEncodedImageProducerSequence(){
       _monitor_enter(this);
       if (b.d()) {
          b.a("ProducerSequenceFactory#getNetworkFetchEncodedImageProducerSequence");
       }
       if (this.mNetworkEncodedImageProducerSequence == null) {
          if (b.d()) {
             b.a("ProducerSequenceFactory#getNetworkFetchEncodedImageProducerSequence:init");
          }
          this.mNetworkEncodedImageProducerSequence = new g0(this.getBackgroundNetworkFetchToEncodedMemorySequence());
          if (b.d()) {
             b.b();
          }
       }
       if (b.d()) {
          b.b();
       }
       _monitor_exit(this);
       return this.mNetworkEncodedImageProducerSequence;
    }
    public synchronized final b0 getNetworkFetchSequence(){
       if (b.d()) {
          b.a("ProducerSequenceFactory#getNetworkFetchSequence");
       }
       if (this.mNetworkFetchSequence == null) {
          if (b.d()) {
             b.a("ProducerSequenceFactory#getNetworkFetchSequence:init");
          }
          this.mNetworkFetchSequence = this.newBitmapCacheGetToDecodeSequence(this.getCommonNetworkFetchToEncodedMemorySequence());
          if (b.d()) {
             b.b();
          }
       }
       if (b.d()) {
          b.b();
       }
       return this.mNetworkFetchSequence;
    }
    public synchronized final b0 getNetworkFetchToEncodedMemoryPrefetchSequence(){
       if (b.d()) {
          b.a("ProducerSequenceFactory#getNetworkFetchToEncodedMemoryPrefetchSequence");
       }
       if (this.mNetworkFetchToEncodedMemoryPrefetchSequence == null) {
          if (b.d()) {
             b.a("ProducerSequenceFactory#getNetworkFetchToEncodedMemoryPrefetchSequence:init");
          }
          this.mNetworkFetchToEncodedMemoryPrefetchSequence = this.mProducerFactory.m(this.getBackgroundNetworkFetchToEncodedMemorySequence());
          if (b.d()) {
             b.b();
          }
       }
       if (b.d()) {
          b.b();
       }
       return this.mNetworkFetchToEncodedMemoryPrefetchSequence;
    }
    public synchronized final b0 getPostprocessorSequence(b0 p0){
       b0 uob0 = this.mPostprocessorSequences.get(p0);
       if (uob0 == null) {
          ProducerSequenceFactory tmProducerFa = this.mProducerFactory;
          tmProducerFa = this.mProducerFactory;
          y oy = new y(tmProducerFa.o, tmProducerFa.p, new z(p0, tmProducerFa.s, tmProducerFa.j.a()));
          this.mPostprocessorSequences.put(p0, oy);
          uob0 = oy;
       }
       return uob0;
    }
    public synchronized final b0 getQualifiedResourceFetchSequence(){
       if (this.mQualifiedResourceFetchSequence == null) {
          ProducerSequenceFactory tmProducerFa = this.mProducerFactory;
          this.mQualifiedResourceFetchSequence = this.newBitmapCacheGetToLocalTransformSequence(new q(tmProducerFa.j.b(), tmProducerFa.k, tmProducerFa.a));
       }
       return this.mQualifiedResourceFetchSequence;
    }
    public final b0 newBitmapCacheGetToBitmapCacheSequence(b0 p0){
       ProducerSequenceFactory tmProducerFa = this.mProducerFactory;
       p0 = this.mProducerFactory.b(new BitmapMemoryCacheKeyMultiplexProducer(this.mProducerFactory.p, new BitmapMemoryCacheProducer(tmProducerFa.o, tmProducerFa.p, p0)), this.mThreadHandoffProducerQueue);
       if (this.mIsEncodedMemoryCacheProbingEnabled == null && this.mIsDiskCacheProbingEnabled == null) {
          return this.mProducerFactory.c(p0);
       }
       ProducerSequenceFactory tmProducerFa1 = this.mProducerFactory;
       g og = new g(tmProducerFa1.n, tmProducerFa1.l, tmProducerFa1.m, tmProducerFa1.p, tmProducerFa1.q, tmProducerFa1.r, this.mProducerFactory.c(p0));
       return tmProducerFa;
    }
    public final b0 newBitmapCacheGetToDecodeSequence(b0 p0){
       if (b.d()) {
          b.a("ProducerSequenceFactory#newBitmapCacheGetToDecodeSequence");
       }
       p0 = this.newBitmapCacheGetToBitmapCacheSequence(this.mProducerFactory.d(p0));
       if (b.d()) {
          b.b();
       }
       return p0;
    }
    public final b0 newBitmapCacheGetToLocalTransformSequence(b0 p0){
       o0[] oo0Array = new o0[]{this.mProducerFactory.h()};
       return this.newBitmapCacheGetToLocalTransformSequence(p0, oo0Array);
    }
    public final b0 newBitmapCacheGetToLocalTransformSequence(b0 p0,o0[] p1){
       return this.newBitmapCacheGetToDecodeSequence(this.newLocalTransformationsSequence(this.newEncodedCacheMultiplexToTranscodeSequence(p0), p1));
    }
    public final b0 newDiskCacheSequence(b0 p0){
       ProducerSequenceFactory tmProducerFa;
       n on;
       if (b.d()) {
          b.a("ProducerSequenceFactory#newDiskCacheSequence");
       }
       if (this.mPartialImageCachingEnabled != null) {
          tmProducerFa = this.mProducerFactory;
          p op = new p(tmProducerFa.l, tmProducerFa.p, tmProducerFa.k, tmProducerFa.d, p0);
          on = tmProducerFa.e(v7);
       }else {
          on = this.mProducerFactory.e(p0);
       }
       tmProducerFa = this.mProducerFactory;
       m om = new m(tmProducerFa.l, tmProducerFa.m, tmProducerFa.p, on);
       if (b.d()) {
          b.b();
       }
       return om;
    }
    public final b0 newEncodedCacheMultiplexToTranscodeSequence(b0 p0){
       t ot;
       if (c.a && (this.mWebpSupportEnabled == null || c.d == null)) {
          ot = this.mProducerFactory.n(p0);
       }
       if (this.mDiskCacheEnabled != null) {
          ot = this.newDiskCacheSequence(ot);
       }
       ProducerSequenceFactory tmProducerFa = this.mProducerFactory;
       m p = tmProducerFa.p;
       p op = new p(tmProducerFa.n, p, ot);
       if (this.mIsDiskCacheProbingEnabled != null) {
          q oq = new q(tmProducerFa.l, tmProducerFa.m, p, tmProducerFa.q, tmProducerFa.r, op);
          return tmProducerFa.f(this.mIsDiskCacheProbingEnabled);
       }else {
          return tmProducerFa.f(op);
       }
    }
    public final b0 newLocalThumbnailProducer(o0[] p0){
       Objects.requireNonNull(this.mProducerFactory);
       return this.mProducerFactory.l(new n0(p0), true, this.mImageTranscoderFactory);
    }
    public final b0 newLocalTransformationsSequence(b0 p0,o0[] p1){
       return new h(this.newLocalThumbnailProducer(p1), new m0(5, this.mProducerFactory.j.e(), this.mProducerFactory.l(m.a(p0), true, this.mImageTranscoderFactory)));
    }
}
