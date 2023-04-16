package androidx.constraintlayout.solver.widgets.analyzer.DependencyNode$Type;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class DependencyNode$Type extends Enum	// class@000691
{
    public static final DependencyNode$Type[] $VALUES;
    public static final DependencyNode$Type BASELINE;
    public static final DependencyNode$Type BOTTOM;
    public static final DependencyNode$Type HORIZONTAL_DIMENSION;
    public static final DependencyNode$Type LEFT;
    public static final DependencyNode$Type RIGHT;
    public static final DependencyNode$Type TOP;
    public static final DependencyNode$Type UNKNOWN;
    public static final DependencyNode$Type VERTICAL_DIMENSION;

    static {
       DependencyNode$Type type = new DependencyNode$Type("UNKNOWN", 0);
       DependencyNode$Type.UNKNOWN = type;
       DependencyNode$Type type1 = new DependencyNode$Type("HORIZONTAL_DIMENSION", 1);
       DependencyNode$Type.HORIZONTAL_DIMENSION = type1;
       DependencyNode$Type type2 = new DependencyNode$Type("VERTICAL_DIMENSION", 2);
       DependencyNode$Type.VERTICAL_DIMENSION = type2;
       DependencyNode$Type type3 = new DependencyNode$Type("LEFT", 3);
       DependencyNode$Type.LEFT = type3;
       DependencyNode$Type type4 = new DependencyNode$Type("RIGHT", 4);
       DependencyNode$Type.RIGHT = type4;
       DependencyNode$Type type5 = new DependencyNode$Type("TOP", 5);
       DependencyNode$Type.TOP = type5;
       DependencyNode$Type type6 = new DependencyNode$Type("BOTTOM", 6);
       DependencyNode$Type.BOTTOM = type6;
       DependencyNode$Type type7 = new DependencyNode$Type("BASELINE", 7);
       DependencyNode$Type.BASELINE = type7;
       DependencyNode$Type[] typeArray = new DependencyNode$Type[]{type,type1,type2,type3,type4,type5,type6,type7};
       DependencyNode$Type.$VALUES = typeArray;
    }
    public void DependencyNode$Type(String p0,int p1){
       super(p0, p1);
    }
    public static DependencyNode$Type valueOf(String p0){
       return Enum.valueOf(DependencyNode$Type.class, p0);
    }
    public static DependencyNode$Type[] values(){
       return DependencyNode$Type.$VALUES.clone();
    }
}
