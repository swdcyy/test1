package com.smile.gifmaker.mvps.presenter.PresenterStateMachine$PresenterState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class PresenterStateMachine$PresenterState extends Enum	// class@000c19
{
    public int mIndex;
    public static final PresenterStateMachine$PresenterState[] $VALUES;
    public static final PresenterStateMachine$PresenterState BIND;
    public static final PresenterStateMachine$PresenterState CREATE;
    public static final PresenterStateMachine$PresenterState DESTROY;
    public static final PresenterStateMachine$PresenterState INIT;
    public static final PresenterStateMachine$PresenterState UNBIND;

    static {
       PresenterStateMachine$PresenterState presenterSta = new PresenterStateMachine$PresenterState("INIT", 0, 0);
       PresenterStateMachine$PresenterState.INIT = presenterSta;
       PresenterStateMachine$PresenterState presenterSta1 = new PresenterStateMachine$PresenterState("CREATE", 1, 1);
       PresenterStateMachine$PresenterState.CREATE = presenterSta1;
       PresenterStateMachine$PresenterState presenterSta2 = new PresenterStateMachine$PresenterState("BIND", 2, 2);
       PresenterStateMachine$PresenterState.BIND = presenterSta2;
       PresenterStateMachine$PresenterState presenterSta3 = new PresenterStateMachine$PresenterState("UNBIND", 3, 3);
       PresenterStateMachine$PresenterState.UNBIND = presenterSta3;
       PresenterStateMachine$PresenterState presenterSta4 = new PresenterStateMachine$PresenterState("DESTROY", 4, 4);
       PresenterStateMachine$PresenterState.DESTROY = presenterSta4;
       PresenterStateMachine$PresenterState[] presenterSta5 = new PresenterStateMachine$PresenterState[]{presenterSta,presenterSta1,presenterSta2,presenterSta3,presenterSta4};
       PresenterStateMachine$PresenterState.$VALUES = presenterSta5;
    }
    public void PresenterStateMachine$PresenterState(String p0,int p1,int p2){
       super(p0, p1);
       this.mIndex = p2;
    }
    public static PresenterStateMachine$PresenterState valueOf(String p0){
       return Enum.valueOf(PresenterStateMachine$PresenterState.class, p0);
    }
    public static PresenterStateMachine$PresenterState[] values(){
       return PresenterStateMachine$PresenterState.$VALUES.clone();
    }
    public int index(){
       return this.mIndex;
    }
}
