package com.kuaishou.live.core.show.photoalbum.cropper.CropImageView$RequestSizeOptions;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class CropImageView$RequestSizeOptions extends Enum	// class@000d59
{
    public static final CropImageView$RequestSizeOptions[] $VALUES;
    public static final CropImageView$RequestSizeOptions NONE;
    public static final CropImageView$RequestSizeOptions RESIZE_EXACT;
    public static final CropImageView$RequestSizeOptions RESIZE_FIT;
    public static final CropImageView$RequestSizeOptions RESIZE_INSIDE;
    public static final CropImageView$RequestSizeOptions SAMPLING;

    static {
       CropImageView$RequestSizeOptions requestSizeO = new CropImageView$RequestSizeOptions("NONE", 0);
       CropImageView$RequestSizeOptions.NONE = requestSizeO;
       CropImageView$RequestSizeOptions requestSizeO1 = new CropImageView$RequestSizeOptions("SAMPLING", 1);
       CropImageView$RequestSizeOptions.SAMPLING = requestSizeO1;
       CropImageView$RequestSizeOptions requestSizeO2 = new CropImageView$RequestSizeOptions("RESIZE_INSIDE", 2);
       CropImageView$RequestSizeOptions.RESIZE_INSIDE = requestSizeO2;
       CropImageView$RequestSizeOptions requestSizeO3 = new CropImageView$RequestSizeOptions("RESIZE_FIT", 3);
       CropImageView$RequestSizeOptions.RESIZE_FIT = requestSizeO3;
       CropImageView$RequestSizeOptions requestSizeO4 = new CropImageView$RequestSizeOptions("RESIZE_EXACT", 4);
       CropImageView$RequestSizeOptions.RESIZE_EXACT = requestSizeO4;
       CropImageView$RequestSizeOptions[] requestSizeO5 = new CropImageView$RequestSizeOptions[]{requestSizeO,requestSizeO1,requestSizeO2,requestSizeO3,requestSizeO4};
       CropImageView$RequestSizeOptions.$VALUES = requestSizeO5;
    }
    public void CropImageView$RequestSizeOptions(String p0,int p1){
       super(p0, p1);
    }
    public static CropImageView$RequestSizeOptions valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CropImageView$RequestSizeOptions.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(CropImageView$RequestSizeOptions.class, p0);
    }
    public static CropImageView$RequestSizeOptions[] values(){
       Object obj = PatchProxy.apply(null, null, CropImageView$RequestSizeOptions.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CropImageView$RequestSizeOptions.$VALUES.clone();
    }
}
