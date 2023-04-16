package androidx.constraintlayout.motion.widget.MotionLayout$TransitionState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class MotionLayout$TransitionState extends Enum	// class@000667
{
    public static final MotionLayout$TransitionState[] $VALUES;
    public static final MotionLayout$TransitionState FINISHED;
    public static final MotionLayout$TransitionState MOVING;
    public static final MotionLayout$TransitionState SETUP;
    public static final MotionLayout$TransitionState UNDEFINED;

    static {
       MotionLayout$TransitionState transitionSt = new MotionLayout$TransitionState("UNDEFINED", 0);
       MotionLayout$TransitionState.UNDEFINED = transitionSt;
       MotionLayout$TransitionState transitionSt1 = new MotionLayout$TransitionState("SETUP", 1);
       MotionLayout$TransitionState.SETUP = transitionSt1;
       MotionLayout$TransitionState transitionSt2 = new MotionLayout$TransitionState("MOVING", 2);
       MotionLayout$TransitionState.MOVING = transitionSt2;
       MotionLayout$TransitionState transitionSt3 = new MotionLayout$TransitionState("FINISHED", 3);
       MotionLayout$TransitionState.FINISHED = transitionSt3;
       MotionLayout$TransitionState[] transitionSt4 = new MotionLayout$TransitionState[]{transitionSt,transitionSt1,transitionSt2,transitionSt3};
       MotionLayout$TransitionState.$VALUES = transitionSt4;
    }
    public void MotionLayout$TransitionState(String p0,int p1){
       super(p0, p1);
    }
    public static MotionLayout$TransitionState valueOf(String p0){
       return Enum.valueOf(MotionLayout$TransitionState.class, p0);
    }
    public static MotionLayout$TransitionState[] values(){
       return MotionLayout$TransitionState.$VALUES.clone();
    }
}
