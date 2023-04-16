package androidx.constraintlayout.widget.ConstraintAttribute$AttributeType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class ConstraintAttribute$AttributeType extends Enum	// class@0006af
{
    public static final ConstraintAttribute$AttributeType[] $VALUES;
    public static final ConstraintAttribute$AttributeType BOOLEAN_TYPE;
    public static final ConstraintAttribute$AttributeType COLOR_DRAWABLE_TYPE;
    public static final ConstraintAttribute$AttributeType COLOR_TYPE;
    public static final ConstraintAttribute$AttributeType DIMENSION_TYPE;
    public static final ConstraintAttribute$AttributeType FLOAT_TYPE;
    public static final ConstraintAttribute$AttributeType INT_TYPE;
    public static final ConstraintAttribute$AttributeType STRING_TYPE;

    static {
       ConstraintAttribute$AttributeType uAttributeTy = new ConstraintAttribute$AttributeType("INT_TYPE", 0);
       ConstraintAttribute$AttributeType.INT_TYPE = uAttributeTy;
       ConstraintAttribute$AttributeType uAttributeTy1 = new ConstraintAttribute$AttributeType("FLOAT_TYPE", 1);
       ConstraintAttribute$AttributeType.FLOAT_TYPE = uAttributeTy1;
       ConstraintAttribute$AttributeType uAttributeTy2 = new ConstraintAttribute$AttributeType("COLOR_TYPE", 2);
       ConstraintAttribute$AttributeType.COLOR_TYPE = uAttributeTy2;
       ConstraintAttribute$AttributeType uAttributeTy3 = new ConstraintAttribute$AttributeType("COLOR_DRAWABLE_TYPE", 3);
       ConstraintAttribute$AttributeType.COLOR_DRAWABLE_TYPE = uAttributeTy3;
       ConstraintAttribute$AttributeType uAttributeTy4 = new ConstraintAttribute$AttributeType("STRING_TYPE", 4);
       ConstraintAttribute$AttributeType.STRING_TYPE = uAttributeTy4;
       ConstraintAttribute$AttributeType uAttributeTy5 = new ConstraintAttribute$AttributeType("BOOLEAN_TYPE", 5);
       ConstraintAttribute$AttributeType.BOOLEAN_TYPE = uAttributeTy5;
       ConstraintAttribute$AttributeType uAttributeTy6 = new ConstraintAttribute$AttributeType("DIMENSION_TYPE", 6);
       ConstraintAttribute$AttributeType.DIMENSION_TYPE = uAttributeTy6;
       ConstraintAttribute$AttributeType[] uAttributeTy7 = new ConstraintAttribute$AttributeType[]{uAttributeTy,uAttributeTy1,uAttributeTy2,uAttributeTy3,uAttributeTy4,uAttributeTy5,uAttributeTy6};
       ConstraintAttribute$AttributeType.$VALUES = uAttributeTy7;
    }
    public void ConstraintAttribute$AttributeType(String p0,int p1){
       super(p0, p1);
    }
    public static ConstraintAttribute$AttributeType valueOf(String p0){
       return Enum.valueOf(ConstraintAttribute$AttributeType.class, p0);
    }
    public static ConstraintAttribute$AttributeType[] values(){
       return ConstraintAttribute$AttributeType.$VALUES.clone();
    }
}
