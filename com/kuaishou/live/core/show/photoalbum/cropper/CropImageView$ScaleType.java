package com.kuaishou.live.core.show.photoalbum.cropper.CropImageView$ScaleType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class CropImageView$ScaleType extends Enum	// class@000d5a
{
    public static final CropImageView$ScaleType[] $VALUES;
    public static final CropImageView$ScaleType CENTER;
    public static final CropImageView$ScaleType CENTER_CROP;
    public static final CropImageView$ScaleType CENTER_INSIDE;
    public static final CropImageView$ScaleType FIT_CENTER;

    static {
       CropImageView$ScaleType scaleType = new CropImageView$ScaleType("FIT_CENTER", 0);
       CropImageView$ScaleType.FIT_CENTER = scaleType;
       CropImageView$ScaleType scaleType1 = new CropImageView$ScaleType("CENTER", 1);
       CropImageView$ScaleType.CENTER = scaleType1;
       CropImageView$ScaleType scaleType2 = new CropImageView$ScaleType("CENTER_CROP", 2);
       CropImageView$ScaleType.CENTER_CROP = scaleType2;
       CropImageView$ScaleType scaleType3 = new CropImageView$ScaleType("CENTER_INSIDE", 3);
       CropImageView$ScaleType.CENTER_INSIDE = scaleType3;
       CropImageView$ScaleType[] scaleTypeArr = new CropImageView$ScaleType[]{scaleType,scaleType1,scaleType2,scaleType3};
       CropImageView$ScaleType.$VALUES = scaleTypeArr;
    }
    public void CropImageView$ScaleType(String p0,int p1){
       super(p0, p1);
    }
    public static CropImageView$ScaleType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CropImageView$ScaleType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(CropImageView$ScaleType.class, p0);
    }
    public static CropImageView$ScaleType[] values(){
       Object obj = PatchProxy.apply(null, null, CropImageView$ScaleType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CropImageView$ScaleType.$VALUES.clone();
    }
}
