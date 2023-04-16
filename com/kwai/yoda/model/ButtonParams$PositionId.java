package com.kwai.yoda.model.ButtonParams$PositionId;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ButtonParams$PositionId extends Enum	// class@0012bc
{
    public int mPositionId;
    public String mValue;
    public static final ButtonParams$PositionId[] $VALUES;
    public static final ButtonParams$PositionId CENTER;
    public static final ButtonParams$PositionId LEFT1;
    public static final ButtonParams$PositionId LEFT2;
    public static final ButtonParams$PositionId RIGHT1;
    public static final ButtonParams$PositionId RIGHT2;

    static {
       ButtonParams$PositionId positionId = new ButtonParams$PositionId("LEFT1", 0, 0x7f0a1702, "left1");
       ButtonParams$PositionId.LEFT1 = positionId;
       ButtonParams$PositionId positionId1 = new ButtonParams$PositionId("LEFT2", 1, 0x7f0a1703, "left2");
       ButtonParams$PositionId.LEFT2 = positionId1;
       ButtonParams$PositionId positionId2 = new ButtonParams$PositionId("RIGHT1", 2, 0x7f0a362c, "right1");
       ButtonParams$PositionId.RIGHT1 = positionId2;
       ButtonParams$PositionId positionId3 = new ButtonParams$PositionId("RIGHT2", 3, 0x7f0a362d, "right2");
       ButtonParams$PositionId.RIGHT2 = positionId3;
       ButtonParams$PositionId positionId4 = new ButtonParams$PositionId("CENTER", 4, 0x7f0a0690, "center");
       ButtonParams$PositionId.CENTER = positionId4;
       ButtonParams$PositionId[] positionIdAr = new ButtonParams$PositionId[]{positionId,positionId1,positionId2,positionId3,positionId4};
       ButtonParams$PositionId.$VALUES = positionIdAr;
    }
    public void ButtonParams$PositionId(String p0,int p1,int p2,String p3){
       super(p0, p1);
       this.mPositionId = p2;
       this.mValue = p3;
    }
    public static ButtonParams$PositionId valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ButtonParams$PositionId.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ButtonParams$PositionId.class, p0);
    }
    public static ButtonParams$PositionId[] values(){
       Object obj = PatchProxy.apply(null, null, ButtonParams$PositionId.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ButtonParams$PositionId.$VALUES.clone();
    }
}
