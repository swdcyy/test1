package com.yxcorp.gifshow.albumwrapper.imagecrop.RxImageSupplierFragment$Type;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class RxImageSupplierFragment$Type extends Enum	// class@001b61
{
    public static final RxImageSupplierFragment$Type[] $VALUES;
    public static final RxImageSupplierFragment$Type CAMERA;
    public static final RxImageSupplierFragment$Type GALLERY;

    static {
       RxImageSupplierFragment$Type type = new RxImageSupplierFragment$Type("CAMERA", 0);
       RxImageSupplierFragment$Type.CAMERA = type;
       RxImageSupplierFragment$Type type1 = new RxImageSupplierFragment$Type("GALLERY", 1);
       RxImageSupplierFragment$Type.GALLERY = type1;
       RxImageSupplierFragment$Type[] typeArray = new RxImageSupplierFragment$Type[]{type,type1};
       RxImageSupplierFragment$Type.$VALUES = typeArray;
    }
    public void RxImageSupplierFragment$Type(String p0,int p1){
       super(p0, p1);
    }
    public static RxImageSupplierFragment$Type valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RxImageSupplierFragment$Type.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(RxImageSupplierFragment$Type.class, p0);
    }
    public static RxImageSupplierFragment$Type[] values(){
       Object obj = PatchProxy.apply(null, null, RxImageSupplierFragment$Type.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RxImageSupplierFragment$Type.$VALUES.clone();
    }
}
