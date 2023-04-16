package androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class ConstraintAnchor$Type extends Enum	// class@00068a
{
    public static final ConstraintAnchor$Type[] $VALUES;
    public static final ConstraintAnchor$Type BASELINE;
    public static final ConstraintAnchor$Type BOTTOM;
    public static final ConstraintAnchor$Type CENTER;
    public static final ConstraintAnchor$Type CENTER_X;
    public static final ConstraintAnchor$Type CENTER_Y;
    public static final ConstraintAnchor$Type LEFT;
    public static final ConstraintAnchor$Type NONE;
    public static final ConstraintAnchor$Type RIGHT;
    public static final ConstraintAnchor$Type TOP;

    static {
       ConstraintAnchor$Type type = new ConstraintAnchor$Type("NONE", 0);
       ConstraintAnchor$Type.NONE = type;
       ConstraintAnchor$Type type1 = new ConstraintAnchor$Type("LEFT", 1);
       ConstraintAnchor$Type.LEFT = type1;
       ConstraintAnchor$Type type2 = new ConstraintAnchor$Type("TOP", 2);
       ConstraintAnchor$Type.TOP = type2;
       ConstraintAnchor$Type type3 = new ConstraintAnchor$Type("RIGHT", 3);
       ConstraintAnchor$Type.RIGHT = type3;
       ConstraintAnchor$Type type4 = new ConstraintAnchor$Type("BOTTOM", 4);
       ConstraintAnchor$Type.BOTTOM = type4;
       ConstraintAnchor$Type type5 = new ConstraintAnchor$Type("BASELINE", 5);
       ConstraintAnchor$Type.BASELINE = type5;
       ConstraintAnchor$Type type6 = new ConstraintAnchor$Type("CENTER", 6);
       ConstraintAnchor$Type.CENTER = type6;
       ConstraintAnchor$Type type7 = new ConstraintAnchor$Type("CENTER_X", 7);
       ConstraintAnchor$Type.CENTER_X = type7;
       ConstraintAnchor$Type type8 = new ConstraintAnchor$Type("CENTER_Y", 8);
       ConstraintAnchor$Type.CENTER_Y = type8;
       ConstraintAnchor$Type[] typeArray = new ConstraintAnchor$Type[9];
       typeArray[0] = type;
       typeArray[1] = type1;
       typeArray[2] = type2;
       typeArray[3] = type3;
       typeArray[4] = type4;
       typeArray[5] = type5;
       typeArray[6] = type6;
       typeArray[7] = type7;
       typeArray[8] = type8;
       ConstraintAnchor$Type.$VALUES = typeArray;
    }
    public void ConstraintAnchor$Type(String p0,int p1){
       super(p0, p1);
    }
    public static ConstraintAnchor$Type valueOf(String p0){
       return Enum.valueOf(ConstraintAnchor$Type.class, p0);
    }
    public static ConstraintAnchor$Type[] values(){
       return ConstraintAnchor$Type.$VALUES.clone();
    }
}
