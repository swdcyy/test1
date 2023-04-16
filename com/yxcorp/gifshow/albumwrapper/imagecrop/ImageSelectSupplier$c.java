package com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$c;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$b;
import java.util.List;

public class ImageSelectSupplier$c	// class@001b5e
{
    public ImageSelectSupplier$b a;
    public List b;

    public void ImageSelectSupplier$c(){
       super();
       this.b = new ArrayList();
    }
    public static ImageSelectSupplier$c a(){
       Object obj = PatchProxy.apply(null, null, ImageSelectSupplier$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ImageSelectSupplier$c();
    }
    public ImageSelectSupplier$c b(ImageSelectSupplier$b p0){
       this.a = p0;
       return this;
    }
    public void c(List p0){
       this.b = p0;
    }
}
