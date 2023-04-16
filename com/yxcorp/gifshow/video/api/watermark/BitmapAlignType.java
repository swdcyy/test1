package com.yxcorp.gifshow.video.api.watermark.BitmapAlignType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class BitmapAlignType extends Enum	// class@001688
{
    public static final BitmapAlignType[] $VALUES;
    public static final BitmapAlignType BOTTOM_CENTER_ONE_LINE;
    public static final BitmapAlignType DYNAMIC_WATERMARK;
    public static final BitmapAlignType LEFT;
    public static final BitmapAlignType RIGHT;
    public static final BitmapAlignType TOP_RIGHT;

    static {
       BitmapAlignType uBitmapAlign = new BitmapAlignType("LEFT", 0);
       BitmapAlignType.LEFT = uBitmapAlign;
       BitmapAlignType uBitmapAlign1 = new BitmapAlignType("RIGHT", 1);
       BitmapAlignType.RIGHT = uBitmapAlign1;
       BitmapAlignType uBitmapAlign2 = new BitmapAlignType("TOP_RIGHT", 2);
       BitmapAlignType.TOP_RIGHT = uBitmapAlign2;
       BitmapAlignType uBitmapAlign3 = new BitmapAlignType("BOTTOM_CENTER_ONE_LINE", 3);
       BitmapAlignType.BOTTOM_CENTER_ONE_LINE = uBitmapAlign3;
       BitmapAlignType uBitmapAlign4 = new BitmapAlignType("DYNAMIC_WATERMARK", 4);
       BitmapAlignType.DYNAMIC_WATERMARK = uBitmapAlign4;
       BitmapAlignType[] uBitmapAlign5 = new BitmapAlignType[]{uBitmapAlign,uBitmapAlign1,uBitmapAlign2,uBitmapAlign3,uBitmapAlign4};
       BitmapAlignType.$VALUES = uBitmapAlign5;
    }
    public void BitmapAlignType(String p0,int p1){
       super(p0, p1);
    }
    public static BitmapAlignType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, BitmapAlignType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(BitmapAlignType.class, p0);
    }
    public static BitmapAlignType[] values(){
       Object obj = PatchProxy.apply(null, null, BitmapAlignType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return BitmapAlignType.$VALUES.clone();
    }
}
