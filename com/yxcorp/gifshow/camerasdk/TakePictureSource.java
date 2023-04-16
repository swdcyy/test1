package com.yxcorp.gifshow.camerasdk.TakePictureSource;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class TakePictureSource extends Enum	// class@001001
{
    public static final TakePictureSource[] $VALUES;
    public static final TakePictureSource SOURCE_CAMERA_SHOOT;
    public static final TakePictureSource SOURCE_PREVIEW_FRAME;
    public static final TakePictureSource SOURCE_UNDEFINE;

    static {
       TakePictureSource takePictureS = new TakePictureSource("SOURCE_UNDEFINE", 0);
       TakePictureSource.SOURCE_UNDEFINE = takePictureS;
       TakePictureSource takePictureS1 = new TakePictureSource("SOURCE_CAMERA_SHOOT", 1);
       TakePictureSource.SOURCE_CAMERA_SHOOT = takePictureS1;
       TakePictureSource takePictureS2 = new TakePictureSource("SOURCE_PREVIEW_FRAME", 2);
       TakePictureSource.SOURCE_PREVIEW_FRAME = takePictureS2;
       TakePictureSource[] takePictureS3 = new TakePictureSource[]{takePictureS,takePictureS1,takePictureS2};
       TakePictureSource.$VALUES = takePictureS3;
    }
    public void TakePictureSource(String p0,int p1){
       super(p0, p1);
    }
    public static TakePictureSource valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TakePictureSource.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(TakePictureSource.class, p0);
    }
    public static TakePictureSource[] values(){
       Object obj = PatchProxy.apply(null, null, TakePictureSource.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TakePictureSource.$VALUES.clone();
    }
}
