package com.yxcrop.gifshow.v3.editor.crop.data.ui.CropAction;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class CropAction extends Enum	// class@000a13
{
    public static final CropAction[] $VALUES;
    public static final CropAction POSITION_CHANGE;
    public static final CropAction RATIO_CHANGE_ROTATE;
    public static final CropAction RATIO_CHANGE_SELECT;
    public static final CropAction RESET;
    public static final CropAction ROTATE;

    static {
       CropAction uCropAction;
       CropAction[] uCropActionA = new CropAction[]{uCropAction,uCropAction,uCropAction,uCropAction,uCropAction};
       uCropAction = new CropAction("ROTATE", 0);
       CropAction.ROTATE = uCropAction;
       uCropAction = new CropAction("RATIO_CHANGE_SELECT", 1);
       CropAction.RATIO_CHANGE_SELECT = uCropAction;
       uCropAction = new CropAction("POSITION_CHANGE", 2);
       CropAction.POSITION_CHANGE = uCropAction;
       uCropAction = new CropAction("RESET", 3);
       CropAction.RESET = uCropAction;
       uCropAction = new CropAction("RATIO_CHANGE_ROTATE", 4);
       CropAction.RATIO_CHANGE_ROTATE = uCropAction;
       CropAction.$VALUES = uCropActionA;
    }
    public void CropAction(String p0,int p1){
       super(p0, p1);
    }
    public static CropAction valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CropAction.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(CropAction.class, p0);
    }
    public static CropAction[] values(){
       Object obj = PatchProxy.apply(null, null, CropAction.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CropAction.$VALUES.clone();
    }
}
