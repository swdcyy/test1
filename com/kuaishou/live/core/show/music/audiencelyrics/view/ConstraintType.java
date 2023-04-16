package com.kuaishou.live.core.show.music.audiencelyrics.view.ConstraintType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ConstraintType extends Enum	// class@000d36
{
    public static final ConstraintType[] $VALUES;
    public static final ConstraintType LEFT_BOTTOM;
    public static final ConstraintType LEFT_TOP;
    public static final ConstraintType RIGHT_BOTTOM;
    public static final ConstraintType RIGHT_TOP;

    static {
       ConstraintType uConstraintT1;
       ConstraintType[] uConstraintT = new ConstraintType[]{uConstraintT1,uConstraintT1,uConstraintT1,uConstraintT1};
       uConstraintT1 = new ConstraintType("LEFT_TOP", 0);
       ConstraintType.LEFT_TOP = uConstraintT1;
       uConstraintT1 = new ConstraintType("LEFT_BOTTOM", 1);
       ConstraintType.LEFT_BOTTOM = uConstraintT1;
       uConstraintT1 = new ConstraintType("RIGHT_TOP", 2);
       ConstraintType.RIGHT_TOP = uConstraintT1;
       uConstraintT1 = new ConstraintType("RIGHT_BOTTOM", 3);
       ConstraintType.RIGHT_BOTTOM = uConstraintT1;
       ConstraintType.$VALUES = uConstraintT;
    }
    public void ConstraintType(String p0,int p1){
       super(p0, p1);
    }
    public static ConstraintType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ConstraintType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ConstraintType.class, p0);
    }
    public static ConstraintType[] values(){
       Object obj = PatchProxy.apply(null, null, ConstraintType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ConstraintType.$VALUES.clone();
    }
}
