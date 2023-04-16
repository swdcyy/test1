package com.taobao.gcanvas.bridges.rn.GReactModule$HostLifeState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class GReactModule$HostLifeState extends Enum	// class@000df2
{
    public static final GReactModule$HostLifeState[] $VALUES;
    public static final GReactModule$HostLifeState Destroyed;
    public static final GReactModule$HostLifeState Idle;
    public static final GReactModule$HostLifeState Paused;
    public static final GReactModule$HostLifeState Running;

    static {
       GReactModule$HostLifeState hostLifeStat = new GReactModule$HostLifeState("Idle", 0);
       GReactModule$HostLifeState.Idle = hostLifeStat;
       GReactModule$HostLifeState hostLifeStat1 = new GReactModule$HostLifeState("Running", 1);
       GReactModule$HostLifeState.Running = hostLifeStat1;
       GReactModule$HostLifeState hostLifeStat2 = new GReactModule$HostLifeState("Paused", 2);
       GReactModule$HostLifeState.Paused = hostLifeStat2;
       GReactModule$HostLifeState hostLifeStat3 = new GReactModule$HostLifeState("Destroyed", 3);
       GReactModule$HostLifeState.Destroyed = hostLifeStat3;
       GReactModule$HostLifeState[] hostLifeStat4 = new GReactModule$HostLifeState[]{hostLifeStat,hostLifeStat1,hostLifeStat2,hostLifeStat3};
       GReactModule$HostLifeState.$VALUES = hostLifeStat4;
    }
    public void GReactModule$HostLifeState(String p0,int p1){
       super(p0, p1);
    }
    public static GReactModule$HostLifeState valueOf(String p0){
       return Enum.valueOf(GReactModule$HostLifeState.class, p0);
    }
    public static GReactModule$HostLifeState[] values(){
       return GReactModule$HostLifeState.$VALUES.clone();
    }
}
