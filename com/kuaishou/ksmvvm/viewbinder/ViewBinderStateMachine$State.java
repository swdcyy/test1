package com.kuaishou.ksmvvm.viewbinder.ViewBinderStateMachine$State;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class ViewBinderStateMachine$State extends Enum	// class@00092c
{
    public final int mIndex;
    public static final ViewBinderStateMachine$State[] $VALUES;
    public static final ViewBinderStateMachine$State BIND;
    public static final ViewBinderStateMachine$State CREATE;
    public static final ViewBinderStateMachine$State DESTROY;
    public static final ViewBinderStateMachine$State INIT;
    public static final ViewBinderStateMachine$State UNBIND;

    static {
       ViewBinderStateMachine$State state = new ViewBinderStateMachine$State("INIT", 0, 0);
       ViewBinderStateMachine$State.INIT = state;
       ViewBinderStateMachine$State state1 = new ViewBinderStateMachine$State("CREATE", 1, 1);
       ViewBinderStateMachine$State.CREATE = state1;
       ViewBinderStateMachine$State state2 = new ViewBinderStateMachine$State("BIND", 2, 2);
       ViewBinderStateMachine$State.BIND = state2;
       ViewBinderStateMachine$State state3 = new ViewBinderStateMachine$State("UNBIND", 3, 3);
       ViewBinderStateMachine$State.UNBIND = state3;
       ViewBinderStateMachine$State state4 = new ViewBinderStateMachine$State("DESTROY", 4, 4);
       ViewBinderStateMachine$State.DESTROY = state4;
       ViewBinderStateMachine$State[] stateArray = new ViewBinderStateMachine$State[]{state,state1,state2,state3,state4};
       ViewBinderStateMachine$State.$VALUES = stateArray;
    }
    public void ViewBinderStateMachine$State(String p0,int p1,int p2){
       super(p0, p1);
       this.mIndex = p2;
    }
    public static ViewBinderStateMachine$State valueOf(String p0){
       return Enum.valueOf(ViewBinderStateMachine$State.class, p0);
    }
    public static ViewBinderStateMachine$State[] values(){
       return ViewBinderStateMachine$State.$VALUES.clone();
    }
    public int index(){
       return this.mIndex;
    }
}
