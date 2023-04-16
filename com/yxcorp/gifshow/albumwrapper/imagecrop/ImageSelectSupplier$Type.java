package com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$Type;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ImageSelectSupplier$Type extends Enum	// class@001b5b
{
    public static final ImageSelectSupplier$Type[] $VALUES;
    public static final ImageSelectSupplier$Type CAMERA;
    public static final ImageSelectSupplier$Type GALLERY;
    public static final ImageSelectSupplier$Type UNKNOWN;

    static {
       ImageSelectSupplier$Type type = new ImageSelectSupplier$Type("CAMERA", 0);
       ImageSelectSupplier$Type.CAMERA = type;
       ImageSelectSupplier$Type type1 = new ImageSelectSupplier$Type("GALLERY", 1);
       ImageSelectSupplier$Type.GALLERY = type1;
       ImageSelectSupplier$Type type2 = new ImageSelectSupplier$Type("UNKNOWN", 2);
       ImageSelectSupplier$Type.UNKNOWN = type2;
       ImageSelectSupplier$Type[] typeArray = new ImageSelectSupplier$Type[]{type,type1,type2};
       ImageSelectSupplier$Type.$VALUES = typeArray;
    }
    public void ImageSelectSupplier$Type(String p0,int p1){
       super(p0, p1);
    }
    public static ImageSelectSupplier$Type valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ImageSelectSupplier$Type.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ImageSelectSupplier$Type.class, p0);
    }
    public static ImageSelectSupplier$Type[] values(){
       Object obj = PatchProxy.apply(null, null, ImageSelectSupplier$Type.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ImageSelectSupplier$Type.$VALUES.clone();
    }
}
