package com.facebook.react.modules.image.ImageLoaderModule$d;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.modules.image.ImageLoaderModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.Promise;
import java.lang.Object;
import java.lang.Void;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.drawee.backends.pipeline.Fresco;
import android.net.Uri;

public class ImageLoaderModule$d extends GuardedAsyncTask	// class@0012be
{
    public final ReadableArray a;
    public final Promise b;
    public final ImageLoaderModule c;

    public void ImageLoaderModule$d(ImageLoaderModule p0,ReactContext p1,ReadableArray p2,Promise p3){
       this.c = p0;
       this.a = p2;
       this.b = p3;
       super(p1);
    }
    public void doInBackgroundGuarded(Object[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ImageLoaderModule$d.class, "1")) {
       }else {
          WritableMap writableMap = Arguments.createMap();
          ImagePipeline imagePipelin = Fresco.getImagePipeline();
          int i = 0;
          while (i < this.a.size()) {
             String str = this.a.getString(i);
             Uri uri = Uri.parse(str);
             if (imagePipelin.isInBitmapMemoryCache(uri)) {
                writableMap.putString(str, "memory");
             }else if(imagePipelin.isInDiskCacheSync(uri)){
                writableMap.putString(str, "disk");
             }
             i = i + 1;
          }
          this.b.resolve(writableMap);
       }
       return;
    }
}
