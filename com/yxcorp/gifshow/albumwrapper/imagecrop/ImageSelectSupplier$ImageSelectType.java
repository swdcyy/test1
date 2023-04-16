package com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$ImageSelectType;
import java.lang.Enum;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$ImageSelectType$1;
import java.lang.String;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$ImageSelectType$2;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$ImageSelectType$3;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$ImageSelectType$4;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.Bundle;
import com.yxcorp.gifshow.models.QMedia;

public abstract class ImageSelectSupplier$ImageSelectType extends Enum	// class@001b5a
{
    public final int mValue;
    public static final ImageSelectSupplier$ImageSelectType[] $VALUES;
    public static final ImageSelectSupplier$ImageSelectType AVATAR;
    public static final ImageSelectSupplier$ImageSelectType BACKGROUND;
    public static final ImageSelectSupplier$ImageSelectType BACKGROUND_REDESIGN;
    public static final ImageSelectSupplier$ImageSelectType MIYOU;

    static {
       ImageSelectSupplier$ImageSelectType$1 imageSelectT = new ImageSelectSupplier$ImageSelectType$1("AVATAR", 0, 0);
       ImageSelectSupplier$ImageSelectType.AVATAR = imageSelectT;
       ImageSelectSupplier$ImageSelectType$2 imageSelectT1 = new ImageSelectSupplier$ImageSelectType$2("BACKGROUND", 1, 1);
       ImageSelectSupplier$ImageSelectType.BACKGROUND = imageSelectT1;
       ImageSelectSupplier$ImageSelectType$3 imageSelectT2 = new ImageSelectSupplier$ImageSelectType$3("BACKGROUND_REDESIGN", 2, 2);
       ImageSelectSupplier$ImageSelectType.BACKGROUND_REDESIGN = imageSelectT2;
       ImageSelectSupplier$ImageSelectType$4 imageSelectT3 = new ImageSelectSupplier$ImageSelectType$4("MIYOU", 3, 3);
       ImageSelectSupplier$ImageSelectType.MIYOU = imageSelectT3;
       ImageSelectSupplier$ImageSelectType[] imageSelectT4 = new ImageSelectSupplier$ImageSelectType[]{imageSelectT,imageSelectT1,imageSelectT2,imageSelectT3};
       ImageSelectSupplier$ImageSelectType.$VALUES = imageSelectT4;
    }
    public void ImageSelectSupplier$ImageSelectType(String p0,int p1,int p2){
       super(p0, p1);
       this.mValue = p2;
    }
    public void ImageSelectSupplier$ImageSelectType(String p0,int p1,int p2,ImageSelectSupplier$a p3){
       super(p0, p1, p2);
    }
    public static ImageSelectSupplier$ImageSelectType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ImageSelectSupplier$ImageSelectType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ImageSelectSupplier$ImageSelectType.class, p0);
    }
    public static ImageSelectSupplier$ImageSelectType[] values(){
       Object obj = PatchProxy.apply(null, null, ImageSelectSupplier$ImageSelectType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ImageSelectSupplier$ImageSelectType.$VALUES.clone();
    }
    public abstract Bundle getCropPrams();
    public int getValue(){
       return this.mValue;
    }
    public abstract boolean skipMixImport(QMedia p0);
}
