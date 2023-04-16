package com.kuaishou.live.core.show.photoalbum.cropper.CropImageView$CropShape;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class CropImageView$CropShape extends Enum	// class@000d57
{
    public static final CropImageView$CropShape[] $VALUES;
    public static final CropImageView$CropShape OVAL;
    public static final CropImageView$CropShape RECTANGLE;

    static {
       CropImageView$CropShape uCropShape = new CropImageView$CropShape("RECTANGLE", 0);
       CropImageView$CropShape.RECTANGLE = uCropShape;
       CropImageView$CropShape uCropShape1 = new CropImageView$CropShape("OVAL", 1);
       CropImageView$CropShape.OVAL = uCropShape1;
       CropImageView$CropShape[] uCropShapeAr = new CropImageView$CropShape[]{uCropShape,uCropShape1};
       CropImageView$CropShape.$VALUES = uCropShapeAr;
    }
    public void CropImageView$CropShape(String p0,int p1){
       super(p0, p1);
    }
    public static CropImageView$CropShape valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CropImageView$CropShape.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(CropImageView$CropShape.class, p0);
    }
    public static CropImageView$CropShape[] values(){
       Object obj = PatchProxy.apply(null, null, CropImageView$CropShape.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CropImageView$CropShape.$VALUES.clone();
    }
}
