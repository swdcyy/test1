package androidx.constraintlayout.solver.state.State$Constraint;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class State$Constraint extends Enum	// class@000685
{
    public static final State$Constraint[] $VALUES;
    public static final State$Constraint BASELINE_TO_BASELINE;
    public static final State$Constraint BOTTOM_TO_BOTTOM;
    public static final State$Constraint BOTTOM_TO_TOP;
    public static final State$Constraint CENTER_HORIZONTALLY;
    public static final State$Constraint CENTER_VERTICALLY;
    public static final State$Constraint END_TO_END;
    public static final State$Constraint END_TO_START;
    public static final State$Constraint LEFT_TO_LEFT;
    public static final State$Constraint LEFT_TO_RIGHT;
    public static final State$Constraint RIGHT_TO_LEFT;
    public static final State$Constraint RIGHT_TO_RIGHT;
    public static final State$Constraint START_TO_END;
    public static final State$Constraint START_TO_START;
    public static final State$Constraint TOP_TO_BOTTOM;
    public static final State$Constraint TOP_TO_TOP;

    static {
       State$Constraint uConstraint = new State$Constraint("LEFT_TO_LEFT", 0);
       State$Constraint.LEFT_TO_LEFT = uConstraint;
       State$Constraint uConstraint1 = new State$Constraint("LEFT_TO_RIGHT", 1);
       State$Constraint.LEFT_TO_RIGHT = uConstraint1;
       State$Constraint uConstraint2 = new State$Constraint("RIGHT_TO_LEFT", 2);
       State$Constraint.RIGHT_TO_LEFT = uConstraint2;
       State$Constraint uConstraint3 = new State$Constraint("RIGHT_TO_RIGHT", 3);
       State$Constraint.RIGHT_TO_RIGHT = uConstraint3;
       State$Constraint uConstraint4 = new State$Constraint("START_TO_START", 4);
       State$Constraint.START_TO_START = uConstraint4;
       State$Constraint uConstraint5 = new State$Constraint("START_TO_END", 5);
       State$Constraint.START_TO_END = uConstraint5;
       State$Constraint uConstraint6 = new State$Constraint("END_TO_START", 6);
       State$Constraint.END_TO_START = uConstraint6;
       State$Constraint uConstraint7 = new State$Constraint("END_TO_END", 7);
       State$Constraint.END_TO_END = uConstraint7;
       State$Constraint uConstraint8 = new State$Constraint("TOP_TO_TOP", 8);
       State$Constraint.TOP_TO_TOP = uConstraint8;
       State$Constraint uConstraint9 = new State$Constraint("TOP_TO_BOTTOM", 9);
       State$Constraint.TOP_TO_BOTTOM = uConstraint9;
       State$Constraint uConstraint10 = new State$Constraint("BOTTOM_TO_TOP", 10);
       State$Constraint.BOTTOM_TO_TOP = uConstraint10;
       State$Constraint uConstraint11 = new State$Constraint("BOTTOM_TO_BOTTOM", 11);
       State$Constraint.BOTTOM_TO_BOTTOM = uConstraint11;
       State$Constraint uConstraint12 = new State$Constraint("BASELINE_TO_BASELINE", 12);
       State$Constraint.BASELINE_TO_BASELINE = uConstraint12;
       State$Constraint uConstraint13 = new State$Constraint("CENTER_HORIZONTALLY", 13);
       State$Constraint.CENTER_HORIZONTALLY = uConstraint13;
       State$Constraint uConstraint14 = uConstraint13;
       State$Constraint uConstraint15 = new State$Constraint("CENTER_VERTICALLY", 14);
       State$Constraint.CENTER_VERTICALLY = uConstraint15;
       State$Constraint[] uConstraintA = new State$Constraint[15];
       uConstraintA[0] = uConstraint;
       uConstraintA[1] = uConstraint1;
       uConstraintA[2] = uConstraint2;
       uConstraintA[3] = uConstraint3;
       uConstraintA[4] = uConstraint4;
       uConstraintA[5] = uConstraint5;
       uConstraintA[6] = uConstraint6;
       uConstraintA[7] = uConstraint7;
       uConstraintA[8] = uConstraint8;
       uConstraintA[9] = uConstraint9;
       uConstraintA[10] = uConstraint10;
       uConstraintA[11] = uConstraint11;
       uConstraintA[12] = uConstraint12;
       uConstraintA[13] = uConstraint14;
       uConstraintA[14] = uConstraint15;
       State$Constraint.$VALUES = uConstraintA;
    }
    public void State$Constraint(String p0,int p1){
       super(p0, p1);
    }
    public static State$Constraint valueOf(String p0){
       return Enum.valueOf(State$Constraint.class, p0);
    }
    public static State$Constraint[] values(){
       return State$Constraint.$VALUES.clone();
    }
}
