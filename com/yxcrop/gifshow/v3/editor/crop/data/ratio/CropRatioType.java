package com.yxcrop.gifshow.v3.editor.crop.data.ratio.CropRatioType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class CropRatioType extends Enum	// class@000a12
{
    public final float ratio;
    public static final CropRatioType[] $VALUES;
    public static final CropRatioType FREE;
    public static final CropRatioType ORIGINAL;
    public static final CropRatioType RATIO_16_9;
    public static final CropRatioType RATIO_1_1;
    public static final CropRatioType RATIO_3_4;
    public static final CropRatioType RATIO_4_3;
    public static final CropRatioType RATIO_9_16;

    static {
       CropRatioType uCropRatioTy1;
       CropRatioType[] uCropRatioTy = new CropRatioType[]{uCropRatioTy1,uCropRatioTy1,uCropRatioTy1,uCropRatioTy1,uCropRatioTy1,uCropRatioTy1,uCropRatioTy1};
       uCropRatioTy1 = new CropRatioType("FREE", 0, 0);
       CropRatioType.FREE = uCropRatioTy1;
       uCropRatioTy1 = new CropRatioType("ORIGINAL", 1, 0);
       CropRatioType.ORIGINAL = uCropRatioTy1;
       uCropRatioTy1 = new CropRatioType("RATIO_3_4", 2, 0x3f400000);
       CropRatioType.RATIO_3_4 = uCropRatioTy1;
       uCropRatioTy1 = new CropRatioType("RATIO_1_1", 3, 0x3f800000);
       CropRatioType.RATIO_1_1 = uCropRatioTy1;
       uCropRatioTy1 = new CropRatioType("RATIO_9_16", 4, 0x3f100000);
       CropRatioType.RATIO_9_16 = uCropRatioTy1;
       uCropRatioTy1 = new CropRatioType("RATIO_16_9", 5, 0x3fe38e39);
       CropRatioType.RATIO_16_9 = uCropRatioTy1;
       uCropRatioTy1 = new CropRatioType("RATIO_4_3", 6, 0x3faaaaab);
       CropRatioType.RATIO_4_3 = uCropRatioTy1;
       CropRatioType.$VALUES = uCropRatioTy;
    }
    public void CropRatioType(String p0,int p1,float p2){
       super(p0, p1);
       this.ratio = p2;
    }
    public static CropRatioType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CropRatioType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(CropRatioType.class, p0);
    }
    public static CropRatioType[] values(){
       Object obj = PatchProxy.apply(null, null, CropRatioType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CropRatioType.$VALUES.clone();
    }
    public final float getRatio(){
       return this.ratio;
    }
}
