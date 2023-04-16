package com.kwaishou.merchant.daccore.rnlive.RNLive$RNLiveState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class RNLive$RNLiveState extends Enum	// class@001337
{
    public static final RNLive$RNLiveState[] $VALUES;
    public static final RNLive$RNLiveState FAILED;
    public static final RNLive$RNLiveState SUCCESS;
    public static final RNLive$RNLiveState UNREADY;

    static {
       RNLive$RNLiveState rNLiveState;
       RNLive$RNLiveState[] rNLiveStateA = new RNLive$RNLiveState[]{rNLiveState,rNLiveState,rNLiveState};
       rNLiveState = new RNLive$RNLiveState("UNREADY", 0);
       RNLive$RNLiveState.UNREADY = rNLiveState;
       rNLiveState = new RNLive$RNLiveState("SUCCESS", 1);
       RNLive$RNLiveState.SUCCESS = rNLiveState;
       rNLiveState = new RNLive$RNLiveState("FAILED", 2);
       RNLive$RNLiveState.FAILED = rNLiveState;
       RNLive$RNLiveState.$VALUES = rNLiveStateA;
    }
    public void RNLive$RNLiveState(String p0,int p1){
       super(p0, p1);
    }
    public static RNLive$RNLiveState valueOf(String p0){
       return Enum.valueOf(RNLive$RNLiveState.class, p0);
    }
    public static RNLive$RNLiveState[] values(){
       return RNLive$RNLiveState.$VALUES.clone();
    }
}
