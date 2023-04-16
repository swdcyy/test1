package com.eclipsesource.v8.debug.StepAction;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class StepAction extends Enum	// class@000ff8
{
    public int index;
    public static final StepAction[] $VALUES;
    public static final StepAction STEP_FRAME;
    public static final StepAction STEP_IN;
    public static final StepAction STEP_NEXT;
    public static final StepAction STEP_OUT;

    static {
       StepAction stepAction = new StepAction("STEP_OUT", 0, 0);
       StepAction.STEP_OUT = stepAction;
       StepAction stepAction1 = new StepAction("STEP_NEXT", 1, 1);
       StepAction.STEP_NEXT = stepAction1;
       StepAction stepAction2 = new StepAction("STEP_IN", 2, 2);
       StepAction.STEP_IN = stepAction2;
       StepAction stepAction3 = new StepAction("STEP_FRAME", 3, 3);
       StepAction.STEP_FRAME = stepAction3;
       StepAction[] stepActionAr = new StepAction[]{stepAction,stepAction1,stepAction2,stepAction3};
       StepAction.$VALUES = stepActionAr;
    }
    public void StepAction(String p0,int p1,int p2){
       super(p0, p1);
       this.index = p2;
    }
    public static StepAction valueOf(String p0){
       return Enum.valueOf(StepAction.class, p0);
    }
    public static StepAction[] values(){
       return StepAction.$VALUES.clone();
    }
}
