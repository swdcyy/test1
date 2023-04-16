package com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSupplierStyle;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ImageSupplierStyle extends Enum	// class@001b60
{
    public static final ImageSupplierStyle[] $VALUES;
    public static final ImageSupplierStyle GRID;
    public static final ImageSupplierStyle LIST;

    static {
       ImageSupplierStyle imageSupplie = new ImageSupplierStyle("LIST", 0);
       ImageSupplierStyle.LIST = imageSupplie;
       ImageSupplierStyle imageSupplie1 = new ImageSupplierStyle("GRID", 1);
       ImageSupplierStyle.GRID = imageSupplie1;
       ImageSupplierStyle[] imageSupplie2 = new ImageSupplierStyle[]{imageSupplie,imageSupplie1};
       ImageSupplierStyle.$VALUES = imageSupplie2;
    }
    public void ImageSupplierStyle(String p0,int p1){
       super(p0, p1);
    }
    public static ImageSupplierStyle valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ImageSupplierStyle.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ImageSupplierStyle.class, p0);
    }
    public static ImageSupplierStyle[] values(){
       Object obj = PatchProxy.apply(null, null, ImageSupplierStyle.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ImageSupplierStyle.$VALUES.clone();
    }
}
