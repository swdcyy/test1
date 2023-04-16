package com.facebook.react.modules.image.ImageLoaderModule;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.Object;
import android.util.SparseArray;
import pf.g;
import com.facebook.react.views.image.ReactImageManager;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Double;
import java.lang.String;
import kb.c;
import com.facebook.react.bridge.Promise;
import qf.a;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import android.content.Context;
import android.net.Uri;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.imagepipeline.request.ImageRequest;
import yd.e;
import android.view.View;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.react.modules.image.ImageLoaderModule$a;
import ya.a;
import kb.e;
import java.util.concurrent.Executor;
import com.facebook.react.bridge.ReadableMap;
import oe.b;
import com.facebook.react.modules.image.ImageLoaderModule$b;
import com.facebook.react.modules.image.ImageLoaderModule$c;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.modules.image.ImageLoaderModule$d;
import com.facebook.react.bridge.ReactContext;
import android.os.AsyncTask;
import java.lang.Void;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;

public class ImageLoaderModule extends NativeImageLoaderAndroidSpec implements LifecycleEventListener	// class@0012bf
{
    public final Object mEnqueuedRequestMonitor;
    public final SparseArray mEnqueuedRequests;
    public final g mReactImageConfig;

    public void ImageLoaderModule(ReactApplicationContext p0){
       super(p0);
       this.mEnqueuedRequestMonitor = new Object();
       this.mEnqueuedRequests = new SparseArray();
       this.mReactImageConfig = ReactImageManager.getGlobalReactImageConfig();
    }
    public void abortRequest(double p0){
       ImageLoaderModule imageLoaderM = ImageLoaderModule.class;
       if (PatchProxy.isSupport(imageLoaderM) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, imageLoaderM, "4")) {
          return;
       }
       c uoc = this.removeRequest((int)p0);
       if (uoc != null) {
          uoc.close();
       }
       return;
    }
    public String getName(){
       return "ImageLoader";
    }
    public void getSize(String p0,Promise p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ImageLoaderModule.class, "1")) {
          return;
       }
       if (p0 == null || p0.isEmpty()) {
          p1.reject("E_INVALID_URI", "Cannot get the size of an image for an empty URI");
          return;
       }else {
          a uoa = new a(this.getReactApplicationContext(), p0);
          ImageRequest imageRequest = ImageRequestBuilder.k(uoa.c()).a();
          ImageLoaderModule tmReactImage = this.mReactImageConfig;
          String str = (tmReactImage != null && e.N)? tmReactImage.b(null, uoa): "ImageLoader";
          Fresco.getImagePipeline().fetchDecodedImage(imageRequest, str).f(new ImageLoaderModule$a(this, p1), a.a());
          return;
       }
    }
    public void getSizeWithHeaders(String p0,ReadableMap p1,Promise p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, ImageLoaderModule.class, "2")) {
          return;
       }
       if (p0 == null || p0.isEmpty()) {
          p2.reject("E_INVALID_URI", "Cannot get the size of an image for an empty URI");
          return;
       }else {
          a uoa = new a(this.getReactApplicationContext(), p0);
          b uob = b.x(ImageRequestBuilder.k(uoa.c()), p1);
          ImageLoaderModule tmReactImage = this.mReactImageConfig;
          String str = (tmReactImage != null && e.N)? tmReactImage.b(null, uoa): "ImageLoader";
          Fresco.getImagePipeline().fetchDecodedImage(uob, str).f(new ImageLoaderModule$b(this, p2), a.a());
          return;
       }
    }
    public void onCatalystInstanceDestroy(){
       if (PatchProxy.applyVoid(null, this, ImageLoaderModule.class, "8")) {
          return;
       }
       ImageLoaderModule tmEnqueuedRe = this.mEnqueuedRequestMonitor;
       _monitor_enter(tmEnqueuedRe);
       int i = 0;
       int i1 = this.mEnqueuedRequests.size();
       while (i < i1) {
          c uoc = this.mEnqueuedRequests.valueAt(i);
          if (uoc != null) {
             uoc.close();
          }
          i = i + 1;
       }
       this.mEnqueuedRequests.clear();
       _monitor_exit(tmEnqueuedRe);
       return;
    }
    public void onHostDestroy(){
    }
    public void onHostPause(){
    }
    public void onHostResume(){
    }
    public void prefetchImage(String p0,double p1,Promise p2){
       if (PatchProxy.isSupport(ImageLoaderModule.class) && PatchProxy.applyVoidThreeRefs(p0, Double.valueOf(p1), p2, this, ImageLoaderModule.class, "3")) {
          return;
       }
       int i = (int)p1;
       if (p0 == null || p0.isEmpty()) {
          p2.reject("E_INVALID_URI", "Cannot prefetch an image for an empty URI");
          return;
       }else {
          c uoc = Fresco.getImagePipeline().prefetchToDiskCache(ImageRequestBuilder.k(Uri.parse(p0)).a(), null);
          this.registerRequest(i, uoc);
          uoc.f(new ImageLoaderModule$c(this, i, p2), a.a());
          return;
       }
    }
    public void queryCache(ReadableArray p0,Promise p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ImageLoaderModule.class, "5")) {
          return;
       }
       Void[] voidArray = new Void[0];
       new ImageLoaderModule$d(this, this.getReactApplicationContext(), p0, p1).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, voidArray);
       return;
    }
    public final void registerRequest(int p0,c p1){
       ImageLoaderModule imageLoaderM = ImageLoaderModule.class;
       if (PatchProxy.isSupport(imageLoaderM) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, imageLoaderM, "6")) {
          return;
       }
       imageLoaderM = this.mEnqueuedRequestMonitor;
       _monitor_enter(imageLoaderM);
       this.mEnqueuedRequests.put(p0, p1);
       _monitor_exit(imageLoaderM);
       return;
    }
    public c removeRequest(int p0){
       ImageLoaderModule imageLoaderM = ImageLoaderModule.class;
       if (PatchProxy.isSupport(imageLoaderM)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, imageLoaderM, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       imageLoaderM = this.mEnqueuedRequestMonitor;
       _monitor_enter(imageLoaderM);
       this.mEnqueuedRequests.remove(p0);
       _monitor_exit(imageLoaderM);
       return this.mEnqueuedRequests.get(p0);
    }
}
