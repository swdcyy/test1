package com.kuaishou.krn.title.ButtonParams$PositionId;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ButtonParams$PositionId extends Enum	// class@000918
{
    public int positionId;
    public String value;
    public static final ButtonParams$PositionId[] $VALUES;
    public static final ButtonParams$PositionId CENTER;
    public static final ButtonParams$PositionId LEFT1;
    public static final ButtonParams$PositionId RIGHT1;

    static {
       ButtonParams$PositionId positionId = new ButtonParams$PositionId("LEFT1", 0, 0x7f0a15ce, "left1");
       ButtonParams$PositionId.LEFT1 = positionId;
       ButtonParams$PositionId positionId1 = new ButtonParams$PositionId("RIGHT1", 1, 0x7f0a15cf, "right1");
       ButtonParams$PositionId.RIGHT1 = positionId1;
       ButtonParams$PositionId positionId2 = new ButtonParams$PositionId("CENTER", 2, 0x7f0a15cd, "center");
       ButtonParams$PositionId.CENTER = positionId2;
       ButtonParams$PositionId[] positionIdAr = new ButtonParams$PositionId[]{positionId,positionId1,positionId2};
       ButtonParams$PositionId.$VALUES = positionIdAr;
    }
    public void ButtonParams$PositionId(String p0,int p1,int p2,String p3){
       super(p0, p1);
       this.positionId = p2;
       this.value = p3;
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
