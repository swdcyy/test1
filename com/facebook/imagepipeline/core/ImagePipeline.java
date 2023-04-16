package com.facebook.imagepipeline.core.ImagePipeline;
import java.util.concurrent.CancellationException;
import java.lang.String;
import com.facebook.imagepipeline.core.ProducerSequenceFactory;
import java.util.Set;
import ab.h;
import tc.v;
import tc.g;
import tc.h;
import id.k0;
import va.a;
import vc.h;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicLong;
import com.facebook.imagepipeline.listener.ForwardingRequestListener;
import com.facebook.imagepipeline.listener.ForwardingRequestListener2;
import bolts.Task;
import com.facebook.imagepipeline.core.ImagePipeline$e;
import ab.f;
import android.net.Uri;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.cache.common.CacheKey;
import kb.c;
import com.facebook.imagepipeline.request.ImageRequest$RequestLevel;
import dd.d;
import id.b0;
import java.lang.Throwable;
import com.facebook.datasource.a;
import ab.e;
import uc.d;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import kd.b;
import jd.c;
import com.facebook.common.references.a;
import com.facebook.imagepipeline.image.a;
import bd.h;
import com.facebook.imagepipeline.core.ImagePipeline$a;
import com.facebook.imagepipeline.core.ImagePipeline$b;
import com.facebook.imagepipeline.core.ImagePipeline$c;
import com.facebook.imagepipeline.core.ImagePipeline$d;
import kb.i;
import com.facebook.imagepipeline.core.ImagePipeline$g;
import bolts.a;
import com.facebook.imagepipeline.core.ImagePipeline$f;
import com.facebook.imagepipeline.request.ImageRequest$CacheChoice;
import com.facebook.imagepipeline.core.ImagePipeline$i;
import java.lang.Enum;
import com.facebook.imagepipeline.core.ImagePipeline$h;
import java.lang.Boolean;
import com.facebook.imagepipeline.common.Priority;
import id.u;
import dd.c;
import id.h0;
import ib.c;
import id.e0;
import wc.e;
import wc.f;

public class ImagePipeline	// class@000479
{
    public final v mBitmapMemoryCache;
    public final h mCacheKeyFactory;
    public final a mCallerContextVerifier;
    public final h mConfig;
    public final v mEncodedMemoryCache;
    public AtomicLong mIdCounter;
    public final h mIsPrefetchEnabledSupplier;
    public final h mLazyDataSource;
    public final g mMainBufferedDiskCache;
    public final ProducerSequenceFactory mProducerSequenceFactory;
    public final d mRequestListener;
    public final c mRequestListener2;
    public final g mSmallImageBufferedDiskCache;
    public final h mSuppressBitmapPrefetchingSupplier;
    public final k0 mThreadHandoffProducerQueue;
    public static final CancellationException PREFETCH_EXCEPTION;

    static {
       ImagePipeline.PREFETCH_EXCEPTION = new CancellationException("Prefetching is not enabled");
    }
    public void ImagePipeline(ProducerSequenceFactory p0,Set p1,Set p2,h p3,v p4,v p5,g p6,g p7,h p8,k0 p9,h p10,h p11,a p12,h p13){
       super();
       this.mIdCounter = new AtomicLong();
       this.mProducerSequenceFactory = p0;
       this.mRequestListener = new ForwardingRequestListener(p1);
       this.mRequestListener2 = new ForwardingRequestListener2(p2);
       this.mIsPrefetchEnabledSupplier = p3;
       this.mBitmapMemoryCache = p4;
       this.mEncodedMemoryCache = p5;
       this.mMainBufferedDiskCache = p6;
       this.mSmallImageBufferedDiskCache = p7;
       this.mCacheKeyFactory = p8;
       this.mThreadHandoffProducerQueue = p9;
       this.mSuppressBitmapPrefetchingSupplier = p10;
       this.mLazyDataSource = p11;
       this.mCallerContextVerifier = p12;
       this.mConfig = p13;
    }
    public void clearCaches(){
       this.clearMemoryCaches();
       this.clearDiskCaches();
    }
    public void clearDiskCaches(){
       this.mMainBufferedDiskCache.c();
       this.mSmallImageBufferedDiskCache.c();
    }
    public void clearMemoryCaches(){
       ImagePipeline$e uoe = new ImagePipeline$e(this);
       this.mBitmapMemoryCache.p(uoe);
       this.mEncodedMemoryCache.p(uoe);
    }
    public void evictFromCache(Uri p0){
       this.evictFromMemoryCache(p0);
       this.evictFromDiskCache(p0);
    }
    public void evictFromDiskCache(Uri p0){
       this.evictFromDiskCache(ImageRequest.b(p0));
    }
    public void evictFromDiskCache(ImageRequest p0){
       CacheKey uCacheKey = this.mCacheKeyFactory.b(p0, null);
       this.mMainBufferedDiskCache.k(uCacheKey);
       this.mSmallImageBufferedDiskCache.k(uCacheKey);
    }
    public void evictFromMemoryCache(Uri p0){
       f uof = this.predicateForUri(p0);
       this.mBitmapMemoryCache.p(uof);
       this.mEncodedMemoryCache.p(uof);
    }
    public c fetchDecodedImage(ImageRequest p0,Object p1){
       return this.fetchDecodedImage(p0, p1, ImageRequest$RequestLevel.FULL_FETCH);
    }
    public c fetchDecodedImage(ImageRequest p0,Object p1,ImageRequest$RequestLevel p2){
       return this.fetchDecodedImage(p0, p1, p2, null);
    }
    public c fetchDecodedImage(ImageRequest p0,Object p1,ImageRequest$RequestLevel p2,d p3){
       return this.fetchDecodedImage(p0, p1, p2, p3, null);
    }
    public c fetchDecodedImage(ImageRequest p0,Object p1,ImageRequest$RequestLevel p2,d p3,String p4){
       try{
          return this.submitFetchRequest(this.mProducerSequenceFactory.getDecodedImageProducerSequence(p0), p0, p2, p1, p3, p4);
       }catch(java.lang.Exception e9){
          return a.a(e9);
       }
    }
    public c fetchDecodedImage(ImageRequest p0,Object p1,d p2){
       return this.fetchDecodedImage(p0, p1, ImageRequest$RequestLevel.FULL_FETCH, p2);
    }
    public c fetchEncodedImage(ImageRequest p0,Object p1){
       return this.fetchEncodedImage(p0, p1, null);
    }
    public c fetchEncodedImage(ImageRequest p0,Object p1,d p2){
       ImageRequestBuilder imageRequest;
       Uri uri = p0.s();
       try{
          e.d(uri);
          b0 encodedImage = this.mProducerSequenceFactory.getEncodedImageProducerSequence(p0);
          if (p0.p() != null) {
             imageRequest = ImageRequestBuilder.d(p0);
             imageRequest.v(null);
             imageRequest = imageRequest.a();
          }
          return this.submitFetchRequest(encodedImage, imageRequest, ImageRequest$RequestLevel.FULL_FETCH, p1, p2, null);
       }catch(java.lang.Exception e9){
          return a.a(e9);
       }
    }
    public c fetchImageFromBitmapCache(ImageRequest p0,Object p1){
       return this.fetchDecodedImage(p0, p1, ImageRequest$RequestLevel.BITMAP_MEMORY_CACHE);
    }
    public String generateUniqueFutureId(){
       return String.valueOf(this.mIdCounter.getAndIncrement());
    }
    public v getBitmapMemoryCache(){
       return this.mBitmapMemoryCache;
    }
    public CacheKey getCacheKey(ImageRequest p0,Object p1){
       if (b.d()) {
          b.a("ImagePipeline#getCacheKey");
       }
       ImagePipeline tmCacheKeyFa = this.mCacheKeyFactory;
       c uoc = null;
       if (tmCacheKeyFa != null && p0 != null) {
          uoc = (p0.j() != null)? tmCacheKeyFa.a(p0, p1): tmCacheKeyFa.c(p0, p1);
       }
    label_0021 :
       if (b.d()) {
          b.b();
       }
       return uoc;
    }
    public h getCacheKeyFactory(){
       return this.mCacheKeyFactory;
    }
    public a getCachedImage(CacheKey p0){
       ImagePipeline tmBitmapMemo = this.mBitmapMemoryCache;
       if (tmBitmapMemo == null || p0 == null) {
          return null;
       }
       a uoa = tmBitmapMemo.get(p0);
       if (uoa == null || uoa.j().a().a()) {
          return uoa;
       }
       uoa.close();
       return null;
    }
    public d getCombinedRequestListener(d p0){
       if (p0 == null) {
          return this.mRequestListener;
       }
       d[] uodArray = new d[]{this.mRequestListener,p0};
       return new ForwardingRequestListener(uodArray);
    }
    public h getConfig(){
       return this.mConfig;
    }
    public h getDataSourceSupplier(ImageRequest p0,Object p1,ImageRequest$RequestLevel p2){
       return new ImagePipeline$a(this, p0, p1, p2);
    }
    public h getDataSourceSupplier(ImageRequest p0,Object p1,ImageRequest$RequestLevel p2,d p3){
       ImagePipeline$b uob = new ImagePipeline$b(this, p0, p1, p2, p3);
       return v6;
    }
    public h getDataSourceSupplier(ImageRequest p0,Object p1,ImageRequest$RequestLevel p2,d p3,String p4){
       ImagePipeline$c uoc = new ImagePipeline$c(this, p0, p1, p2, p3, p4);
       return v7;
    }
    public h getEncodedImageDataSourceSupplier(ImageRequest p0,Object p1){
       return new ImagePipeline$d(this, p0, p1);
    }
    public ProducerSequenceFactory getProducerSequenceFactory(){
       return this.mProducerSequenceFactory;
    }
    public d getRequestListenerForRequest(ImageRequest p0,d p1){
       d[] uodArray;
       int i = 2;
       if (p1 == null) {
          if (p0.o() == null) {
             return this.mRequestListener;
          }
          uodArray = new d[i];
          uodArray[0] = this.mRequestListener;
          uodArray[1] = p0.o();
          return new ForwardingRequestListener(uodArray);
       }else if(p0.o() == null){
          uodArray = new d[i];
          uodArray[0] = this.mRequestListener;
          uodArray[1] = p1;
          return new ForwardingRequestListener(uodArray);
       }else {
          d[] uodArray1 = new d[]{this.mRequestListener,p1,p0.o()};
          return new ForwardingRequestListener(uodArray1);
       }
    }
    public long getUsedDiskCacheSize(){
       return (this.mMainBufferedDiskCache.h() + this.mSmallImageBufferedDiskCache.h());
    }
    public boolean hasCachedImage(CacheKey p0){
       ImagePipeline tmBitmapMemo = this.mBitmapMemoryCache;
       if (tmBitmapMemo == null || p0 == null) {
          return false;
       }
       return tmBitmapMemo.contains(p0);
    }
    public boolean isInBitmapMemoryCache(Uri p0){
       if (p0 == null) {
          return false;
       }
       return this.mBitmapMemoryCache.m(this.predicateForUri(p0));
    }
    public boolean isInBitmapMemoryCache(ImageRequest p0){
       if (p0 == null) {
          return false;
       }
       a uoa = this.mBitmapMemoryCache.get(this.mCacheKeyFactory.c(p0, null));
       a.f(uoa);
       return a.l(uoa);
    }
    public c isInDiskCache(Uri p0){
       return this.isInDiskCache(ImageRequest.b(p0));
    }
    public c isInDiskCache(ImageRequest p0){
       CacheKey uCacheKey = this.mCacheKeyFactory.b(p0, null);
       i oi = i.p();
       this.mMainBufferedDiskCache.d(uCacheKey).continueWithTask(new ImagePipeline$g(this, uCacheKey)).continueWith(new ImagePipeline$f(this, oi));
       return oi;
    }
    public boolean isInDiskCacheSync(Uri p0){
       boolean b = (this.isInDiskCacheSync(p0, ImageRequest$CacheChoice.SMALL) || this.isInDiskCacheSync(p0, ImageRequest$CacheChoice.DEFAULT))? true: false;
       return b;
    }
    public boolean isInDiskCacheSync(Uri p0,ImageRequest$CacheChoice p1){
       ImageRequestBuilder imageRequest = ImageRequestBuilder.k(p0);
       imageRequest.n(p1);
       return this.isInDiskCacheSync(imageRequest.a());
    }
    public boolean isInDiskCacheSync(ImageRequest p0){
       CacheKey uCacheKey = this.mCacheKeyFactory.b(p0, null);
       int i = ImagePipeline$i.a[p0.e().ordinal()];
       if (i == 1) {
          return this.mMainBufferedDiskCache.f(uCacheKey);
       }
       if (i != 2) {
          return false;
       }
       return this.mSmallImageBufferedDiskCache.f(uCacheKey);
    }
    public boolean isInEncodedMemoryCache(Uri p0){
       if (p0 == null) {
          return false;
       }
       return this.mEncodedMemoryCache.m(this.predicateForUri(p0));
    }
    public boolean isInEncodedMemoryCache(ImageRequest p0){
       if (p0 == null) {
          return false;
       }
       a uoa = this.mEncodedMemoryCache.get(this.mCacheKeyFactory.b(p0, null));
       a.f(uoa);
       return a.l(uoa);
    }
    public h isLazyDataSource(){
       return this.mLazyDataSource;
    }
    public boolean isPaused(){
       return this.mThreadHandoffProducerQueue.e();
    }
    public void pause(){
       this.mThreadHandoffProducerQueue.b();
    }
    public final f predicateForUri(Uri p0){
       return new ImagePipeline$h(this, p0);
    }
    public c prefetchToBitmapCache(ImageRequest p0,Object p1){
       return this.prefetchToBitmapCache(p0, p1, null);
    }
    public c prefetchToBitmapCache(ImageRequest p0,Object p1,d p2){
       ImagePipeline imagePipelin;
       if (!this.mIsPrefetchEnabledSupplier.get().booleanValue()) {
          return a.a(ImagePipeline.PREFETCH_EXCEPTION);
       }
       try{
          Boolean uBoolean = p0.w();
          if (uBoolean != null) {
             imagePipelin = (!uBoolean.booleanValue())? 1: null;
          }else {
             imagePipelin = this.mSuppressBitmapPrefetchingSupplier.get().booleanValue();
          }
          b0 encodedImage = (imagePipelin)? this.mProducerSequenceFactory.getEncodedImagePrefetchProducerSequence(p0): this.mProducerSequenceFactory.getDecodedImagePrefetchProducerSequence(p0);
          return this.submitPrefetchRequest(encodedImage, p0, ImageRequest$RequestLevel.FULL_FETCH, p1, Priority.MEDIUM, p2);
       }catch(java.lang.Exception e9){
          return a.a(e9);
       }
    }
    public c prefetchToDiskCache(ImageRequest p0,Object p1){
       return this.prefetchToDiskCache(p0, p1, Priority.MEDIUM);
    }
    public c prefetchToDiskCache(ImageRequest p0,Object p1,Priority p2){
       return this.prefetchToDiskCache(p0, p1, p2, null);
    }
    public c prefetchToDiskCache(ImageRequest p0,Object p1,Priority p2,d p3){
       if (!this.mIsPrefetchEnabledSupplier.get().booleanValue()) {
          return a.a(ImagePipeline.PREFETCH_EXCEPTION);
       }
       try{
          return this.submitPrefetchRequest(this.mProducerSequenceFactory.getEncodedImagePrefetchProducerSequence(p0), p0, ImageRequest$RequestLevel.FULL_FETCH, p1, p2, p3);
       }catch(java.lang.Exception e9){
          return a.a(e9);
       }
    }
    public c prefetchToDiskCache(ImageRequest p0,Object p1,d p2){
       return this.prefetchToDiskCache(p0, p1, Priority.MEDIUM, p2);
    }
    public c prefetchToEncodedCache(ImageRequest p0,Object p1){
       return this.prefetchToEncodedCache(p0, p1, Priority.MEDIUM);
    }
    public c prefetchToEncodedCache(ImageRequest p0,Object p1,Priority p2){
       return this.prefetchToEncodedCache(p0, p1, p2, null);
    }
    public c prefetchToEncodedCache(ImageRequest p0,Object p1,Priority p2,d p3){
       if (!this.mIsPrefetchEnabledSupplier.get().booleanValue()) {
          return a.a(ImagePipeline.PREFETCH_EXCEPTION);
       }
       try{
          return this.submitPrefetchRequest(this.mProducerSequenceFactory.getEncodedImagePrefetchProducerSequence(p0), p0, ImageRequest$RequestLevel.FULL_FETCH, p1, p2, p3);
       }catch(java.lang.Exception e9){
          return a.a(e9);
       }
    }
    public c prefetchToEncodedCache(ImageRequest p0,Object p1,d p2){
       return this.prefetchToEncodedCache(p0, p1, Priority.MEDIUM, p2);
    }
    public void resume(){
       this.mThreadHandoffProducerQueue.d();
    }
    public final c submitFetchRequest(b0 p0,ImageRequest p1,ImageRequest$RequestLevel p2,Object p3,d p4,String p5){
       boolean b;
       c uoc;
       ImagePipeline imagePipelin = this;
       if (b.d()) {
          b.a("ImagePipeline#submitFetchRequest");
       }
       u ou = new u(this.getRequestListenerForRequest(p1, p4), imagePipelin.mRequestListener2);
       ImagePipeline mCallerConte = imagePipelin.mCallerContextVerifier;
       b = false;
       Object obj = p3;
       if (mCallerConte != null) {
          mCallerConte.a(obj, b);
       }
       try{
          ImageRequest$RequestLevel max = ImageRequest$RequestLevel.getMax(p1.i(), p2);
          String str = this.generateUniqueFutureId();
          boolean b1 = (p1.n() || !c.k(p1.s()))? true: false;
          h0 oh0 = new h0(p1, str, p5, ou, p3, max, false, b1, p1.m(), imagePipelin.mConfig);
          uoc = e.r(p0, v13, ou);
          if (b.d()) {
             b.b();
          }
          return uoc;
       }catch(java.lang.Exception e0){
          uoc = a.a(e0);
          if (b.d()) {
             b.b();
          }
          return uoc;
       }
    }
    public c submitFetchRequest(b0 p0,h0 p1,d p2){
       c uoc;
       if (b.d()) {
          b.a("ImagePipeline#submitFetchRequest");
       }
       try{
          uoc = e.r(p0, p1, new u(p2, this.mRequestListener2));
          if (b.d()) {
             b.b();
          }
          return uoc;
       }catch(java.lang.Exception e3){
          uoc = a.a(e3);
          if (b.d()) {
             b.b();
          }
          return uoc;
       }
    }
    public final c submitPrefetchRequest(b0 p0,ImageRequest p1,ImageRequest$RequestLevel p2,Object p3,Priority p4,d p5){
       ImagePipeline imagePipelin = this;
       u ou = new u(this.getRequestListenerForRequest(p1, p5), imagePipelin.mRequestListener2);
       ImagePipeline mCallerConte = imagePipelin.mCallerContextVerifier;
       if (mCallerConte != null) {
          mCallerConte.a(p3, true);
       }else {
          int i = p3;
       }
       try{
          h0 oh0 = new h0(p1, this.generateUniqueFutureId(), ou, p3, ImageRequest$RequestLevel.getMax(p1.i(), p2), true, false, p4, imagePipelin.mConfig);
          return new f(p0, v12, ou);
       }catch(java.lang.Exception e0){
          return a.a(e0);
       }
    }
}
