package com.kuaishou.live.core.show.photoalbum.cropper.CropImageView$Guidelines;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class CropImageView$Guidelines extends Enum	// class@000d58
{
    public static final CropImageView$Guidelines[] $VALUES;
    public static final CropImageView$Guidelines OFF;
    public static final CropImageView$Guidelines ON;
    public static final CropImageView$Guidelines ON_TOUCH;

    static {
       CropImageView$Guidelines guidelines = new CropImageView$Guidelines("OFF", 0);
       CropImageView$Guidelines.OFF = guidelines;
       CropImageView$Guidelines guidelines1 = new CropImageView$Guidelines("ON_TOUCH", 1);
       CropImageView$Guidelines.ON_TOUCH = guidelines1;
       CropImageView$Guidelines guidelines2 = new CropImageView$Guidelines("ON", 2);
       CropImageView$Guidelines.ON = guidelines2;
       CropImageView$Guidelines[] guidelinesAr = new CropImageView$Guidelines[]{guidelines,guidelines1,guidelines2};
       CropImageView$Guidelines.$VALUES = guidelinesAr;
    }
    public void CropImageView$Guidelines(String p0,int p1){
       super(p0, p1);
    }
    public static CropImageView$Guidelines valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CropImageView$Guidelines.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(CropImageView$Guidelines.class, p0);
    }
    public static CropImageView$Guidelines[] values(){
       Object obj = PatchProxy.apply(null, null, CropImageView$Guidelines.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CropImageView$Guidelines.$VALUES.clone();
    }
}
