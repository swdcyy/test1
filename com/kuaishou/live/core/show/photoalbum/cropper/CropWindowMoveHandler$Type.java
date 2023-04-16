package com.kuaishou.live.core.show.photoalbum.cropper.CropWindowMoveHandler$Type;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class CropWindowMoveHandler$Type extends Enum	// class@000d65
{
    public static final CropWindowMoveHandler$Type[] $VALUES;
    public static final CropWindowMoveHandler$Type BOTTOM;
    public static final CropWindowMoveHandler$Type BOTTOM_LEFT;
    public static final CropWindowMoveHandler$Type BOTTOM_RIGHT;
    public static final CropWindowMoveHandler$Type CENTER;
    public static final CropWindowMoveHandler$Type LEFT;
    public static final CropWindowMoveHandler$Type RIGHT;
    public static final CropWindowMoveHandler$Type TOP;
    public static final CropWindowMoveHandler$Type TOP_LEFT;
    public static final CropWindowMoveHandler$Type TOP_RIGHT;

    static {
       CropWindowMoveHandler$Type type = new CropWindowMoveHandler$Type("TOP_LEFT", 0);
       CropWindowMoveHandler$Type.TOP_LEFT = type;
       CropWindowMoveHandler$Type type1 = new CropWindowMoveHandler$Type("TOP_RIGHT", 1);
       CropWindowMoveHandler$Type.TOP_RIGHT = type1;
       CropWindowMoveHandler$Type type2 = new CropWindowMoveHandler$Type("BOTTOM_LEFT", 2);
       CropWindowMoveHandler$Type.BOTTOM_LEFT = type2;
       CropWindowMoveHandler$Type type3 = new CropWindowMoveHandler$Type("BOTTOM_RIGHT", 3);
       CropWindowMoveHandler$Type.BOTTOM_RIGHT = type3;
       CropWindowMoveHandler$Type type4 = new CropWindowMoveHandler$Type("LEFT", 4);
       CropWindowMoveHandler$Type.LEFT = type4;
       CropWindowMoveHandler$Type type5 = new CropWindowMoveHandler$Type("TOP", 5);
       CropWindowMoveHandler$Type.TOP = type5;
       CropWindowMoveHandler$Type type6 = new CropWindowMoveHandler$Type("RIGHT", 6);
       CropWindowMoveHandler$Type.RIGHT = type6;
       CropWindowMoveHandler$Type type7 = new CropWindowMoveHandler$Type("BOTTOM", 7);
       CropWindowMoveHandler$Type.BOTTOM = type7;
       CropWindowMoveHandler$Type type8 = new CropWindowMoveHandler$Type("CENTER", 8);
       CropWindowMoveHandler$Type.CENTER = type8;
       CropWindowMoveHandler$Type[] typeArray = new CropWindowMoveHandler$Type[9];
       typeArray[0] = type;
       typeArray[1] = type1;
       typeArray[2] = type2;
       typeArray[3] = type3;
       typeArray[4] = type4;
       typeArray[5] = type5;
       typeArray[6] = type6;
       typeArray[7] = type7;
       typeArray[8] = type8;
       CropWindowMoveHandler$Type.$VALUES = typeArray;
    }
    public void CropWindowMoveHandler$Type(String p0,int p1){
       super(p0, p1);
    }
    public static CropWindowMoveHandler$Type valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CropWindowMoveHandler$Type.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(CropWindowMoveHandler$Type.class, p0);
    }
    public static CropWindowMoveHandler$Type[] values(){
       Object obj = PatchProxy.apply(null, null, CropWindowMoveHandler$Type.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CropWindowMoveHandler$Type.$VALUES.clone();
    }
}
