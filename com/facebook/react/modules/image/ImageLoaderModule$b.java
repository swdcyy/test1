package com.facebook.react.modules.image.ImageLoaderModule$b;
import kb.b;
import com.facebook.react.modules.image.ImageLoaderModule;
import com.facebook.react.bridge.Promise;
import kb.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Throwable;
import com.facebook.common.references.a;
import com.facebook.imagepipeline.image.a;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;
import bd.f;

public class ImageLoaderModule$b extends b	// class@0012bc
{
    public final Promise a;
    public final ImageLoaderModule b;

    public void ImageLoaderModule$b(ImageLoaderModule p0,Promise p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onFailureImpl(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ImageLoaderModule$b.class, "2")) {
          return;
       }
       this.a.reject("E_GET_SIZE_FAILURE", p0.e());
       return;
    }
    public void onNewResultImpl(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ImageLoaderModule$b.class, "1")) {
          return;
       }
       if (!p0.a()) {
          return;
       }
       a result = p0.getResult();
       if (result != null) {
          try{
             a uoa = result.j();
             WritableMap writableMap = Arguments.createMap();
             writableMap.putInt("width", uoa.getWidth());
             writableMap.putInt("height", uoa.getHeight());
             this.a.resolve(writableMap);
          }catch(java.lang.Exception e1){
             this.a.reject("E_GET_SIZE_FAILURE", e1);
          }
          a.f(result);
       }else {
          this.a.reject("E_GET_SIZE_FAILURE");
       }
       return;
    }
}
