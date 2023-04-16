package com.facebook.react.modules.camera.ImageEditingManager$b$a;
import java.io.FilenameFilter;
import com.facebook.react.modules.camera.ImageEditingManager$b;
import java.lang.Object;
import java.io.File;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class ImageEditingManager$b$a implements FilenameFilter	// class@001281
{
    public final ImageEditingManager$b b;

    public void ImageEditingManager$b$a(ImageEditingManager$b p0){
       this.b = p0;
       super();
    }
    public boolean accept(File p0,String p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, ImageEditingManager$b$a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       return p1.startsWith("ReactNative_cropped_image_");
    }
}
