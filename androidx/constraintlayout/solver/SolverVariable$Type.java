package androidx.constraintlayout.solver.SolverVariable$Type;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class SolverVariable$Type extends Enum	// class@000679
{
    public static final SolverVariable$Type[] $VALUES;
    public static final SolverVariable$Type CONSTANT;
    public static final SolverVariable$Type ERROR;
    public static final SolverVariable$Type SLACK;
    public static final SolverVariable$Type UNKNOWN;
    public static final SolverVariable$Type UNRESTRICTED;

    static {
       SolverVariable$Type type = new SolverVariable$Type("UNRESTRICTED", 0);
       SolverVariable$Type.UNRESTRICTED = type;
       SolverVariable$Type type1 = new SolverVariable$Type("CONSTANT", 1);
       SolverVariable$Type.CONSTANT = type1;
       SolverVariable$Type type2 = new SolverVariable$Type("SLACK", 2);
       SolverVariable$Type.SLACK = type2;
       SolverVariable$Type type3 = new SolverVariable$Type("ERROR", 3);
       SolverVariable$Type.ERROR = type3;
       SolverVariable$Type type4 = new SolverVariable$Type("UNKNOWN", 4);
       SolverVariable$Type.UNKNOWN = type4;
       SolverVariable$Type[] typeArray = new SolverVariable$Type[]{type,type1,type2,type3,type4};
       SolverVariable$Type.$VALUES = typeArray;
    }
    public void SolverVariable$Type(String p0,int p1){
       super(p0, p1);
    }
    public static SolverVariable$Type valueOf(String p0){
       return Enum.valueOf(SolverVariable$Type.class, p0);
    }
    public static SolverVariable$Type[] values(){
       return SolverVariable$Type.$VALUES.clone();
    }
}
