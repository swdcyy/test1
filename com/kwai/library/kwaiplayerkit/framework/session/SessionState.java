package com.kwai.library.kwaiplayerkit.framework.session.SessionState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class SessionState extends Enum	// class@000880
{
    public static final SessionState[] $VALUES;
    public static final SessionState ATTACHED;
    public static final SessionState PRELOADED;
    public static final SessionState RELEASED;
    public static final SessionState UNKNOWN;
    public static final SessionState WILL_ATTACH;

    static {
       SessionState sessionState1;
       SessionState[] sessionState = new SessionState[]{sessionState1,sessionState1,sessionState1,sessionState1,sessionState1};
       sessionState1 = new SessionState("UNKNOWN", 0);
       SessionState.UNKNOWN = sessionState1;
       sessionState1 = new SessionState("PRELOADED", 1);
       SessionState.PRELOADED = sessionState1;
       sessionState1 = new SessionState("WILL_ATTACH", 2);
       SessionState.WILL_ATTACH = sessionState1;
       sessionState1 = new SessionState("ATTACHED", 3);
       SessionState.ATTACHED = sessionState1;
       sessionState1 = new SessionState("RELEASED", 4);
       SessionState.RELEASED = sessionState1;
       SessionState.$VALUES = sessionState;
    }
    public void SessionState(String p0,int p1){
       super(p0, p1);
    }
    public static SessionState valueOf(String p0){
       return Enum.valueOf(SessionState.class, p0);
    }
    public static SessionState[] values(){
       return SessionState.$VALUES.clone();
    }
}
