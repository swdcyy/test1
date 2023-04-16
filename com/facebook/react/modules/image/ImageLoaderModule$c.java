package com.facebook.react.modules.image.ImageLoaderModule$c;
import kb.b;
import com.facebook.react.modules.image.ImageLoaderModule;
import com.facebook.react.bridge.Promise;
import kb.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Throwable;
import java.lang.Boolean;

public class ImageLoaderModule$c extends b	// class@0012bd
{
    public final int a;
    public final Promise b;
    public final ImageLoaderModule c;

    public void ImageLoaderModule$c(ImageLoaderModule p0,int p1,Promise p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void onFailureImpl(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ImageLoaderModule$c.class, "2")) {
          return;
       }
       this.c.removeRequest(this.a);
       this.b.reject("E_PREFETCH_FAILURE", p0.e());
       p0.close();
       return;
    }
    public void onNewResultImpl(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ImageLoaderModule$c.class, "1")) {
          return;
       }
       if (!p0.a()) {
          return;
       }
       this.c.removeRequest(this.a);
       this.b.resolve(Boolean.TRUE);
       p0.close();
       return;
    }
}
