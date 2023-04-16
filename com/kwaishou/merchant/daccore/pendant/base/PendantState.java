package com.kwaishou.merchant.daccore.pendant.base.PendantState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class PendantState extends Enum	// class@001331
{
    public int state;
    public static final PendantState[] $VALUES;
    public static final PendantState DID_MOUNT;
    public static final PendantState INIT;
    public static final PendantState WILL_UNMOUNT;

    static {
       PendantState pendantState1;
       PendantState[] pendantState = new PendantState[]{pendantState1,pendantState1,pendantState1};
       pendantState1 = new PendantState("INIT", 0, 0);
       PendantState.INIT = pendantState1;
       pendantState1 = new PendantState("DID_MOUNT", 1, 1);
       PendantState.DID_MOUNT = pendantState1;
       pendantState1 = new PendantState("WILL_UNMOUNT", 2, 2);
       PendantState.WILL_UNMOUNT = pendantState1;
       PendantState.$VALUES = pendantState;
    }
    public void PendantState(String p0,int p1,int p2){
       super(p0, p1);
       this.state = p2;
    }
    public static PendantState valueOf(String p0){
       return Enum.valueOf(PendantState.class, p0);
    }
    public static PendantState[] values(){
       return PendantState.$VALUES.clone();
    }
    public final int getState(){
       return this.state;
    }
    public final void setState(int p0){
       this.state = p0;
    }
}
