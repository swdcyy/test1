package androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class ConstraintWidget$DimensionBehaviour extends Enum	// class@00068d
{
    public static final ConstraintWidget$DimensionBehaviour[] $VALUES;
    public static final ConstraintWidget$DimensionBehaviour FIXED;
    public static final ConstraintWidget$DimensionBehaviour MATCH_CONSTRAINT;
    public static final ConstraintWidget$DimensionBehaviour MATCH_PARENT;
    public static final ConstraintWidget$DimensionBehaviour WRAP_CONTENT;

    static {
       ConstraintWidget$DimensionBehaviour uDimensionBe = new ConstraintWidget$DimensionBehaviour("FIXED", 0);
       ConstraintWidget$DimensionBehaviour.FIXED = uDimensionBe;
       ConstraintWidget$DimensionBehaviour uDimensionBe1 = new ConstraintWidget$DimensionBehaviour("WRAP_CONTENT", 1);
       ConstraintWidget$DimensionBehaviour.WRAP_CONTENT = uDimensionBe1;
       ConstraintWidget$DimensionBehaviour uDimensionBe2 = new ConstraintWidget$DimensionBehaviour("MATCH_CONSTRAINT", 2);
       ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT = uDimensionBe2;
       ConstraintWidget$DimensionBehaviour uDimensionBe3 = new ConstraintWidget$DimensionBehaviour("MATCH_PARENT", 3);
       ConstraintWidget$DimensionBehaviour.MATCH_PARENT = uDimensionBe3;
       ConstraintWidget$DimensionBehaviour[] uDimensionBe4 = new ConstraintWidget$DimensionBehaviour[]{uDimensionBe,uDimensionBe1,uDimensionBe2,uDimensionBe3};
       ConstraintWidget$DimensionBehaviour.$VALUES = uDimensionBe4;
    }
    public void ConstraintWidget$DimensionBehaviour(String p0,int p1){
       super(p0, p1);
    }
    public static ConstraintWidget$DimensionBehaviour valueOf(String p0){
       return Enum.valueOf(ConstraintWidget$DimensionBehaviour.class, p0);
    }
    public static ConstraintWidget$DimensionBehaviour[] values(){
       return ConstraintWidget$DimensionBehaviour.$VALUES.clone();
    }
}
