package com.facebook.react.views.image.ImageResizeMethod;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ImageResizeMethod extends Enum	// class@0013b8
{
    public static final ImageResizeMethod[] $VALUES;
    public static final ImageResizeMethod AUTO;
    public static final ImageResizeMethod RESIZE;
    public static final ImageResizeMethod SCALE;

    static {
       ImageResizeMethod imageResizeM = new ImageResizeMethod("AUTO", 0);
       ImageResizeMethod.AUTO = imageResizeM;
       ImageResizeMethod imageResizeM1 = new ImageResizeMethod("RESIZE", 1);
       ImageResizeMethod.RESIZE = imageResizeM1;
       ImageResizeMethod imageResizeM2 = new ImageResizeMethod("SCALE", 2);
       ImageResizeMethod.SCALE = imageResizeM2;
       ImageResizeMethod[] imageResizeM3 = new ImageResizeMethod[]{imageResizeM,imageResizeM1,imageResizeM2};
       ImageResizeMethod.$VALUES = imageResizeM3;
    }
    public void ImageResizeMethod(String p0,int p1){
       super(p0, p1);
    }
    public static ImageResizeMethod valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ImageResizeMethod.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ImageResizeMethod.class, p0);
    }
    public static ImageResizeMethod[] values(){
       Object obj = PatchProxy.apply(null, null, ImageResizeMethod.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ImageResizeMethod.$VALUES.clone();
    }
}
