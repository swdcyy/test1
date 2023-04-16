package com.kuaishou.webkit.extension.KwSdk$InstallState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class KwSdk$InstallState extends Enum	// class@0012f1
{
    public static final KwSdk$InstallState[] $VALUES;
    public static final KwSdk$InstallState STATE_CURRENT;
    public static final KwSdk$InstallState STATE_NONE;
    public static final KwSdk$InstallState STATE_OLD;

    static {
       KwSdk$InstallState installState = new KwSdk$InstallState("STATE_NONE", 0);
       KwSdk$InstallState.STATE_NONE = installState;
       KwSdk$InstallState installState1 = new KwSdk$InstallState("STATE_OLD", 1);
       KwSdk$InstallState.STATE_OLD = installState1;
       KwSdk$InstallState installState2 = new KwSdk$InstallState("STATE_CURRENT", 2);
       KwSdk$InstallState.STATE_CURRENT = installState2;
       KwSdk$InstallState[] installState3 = new KwSdk$InstallState[]{installState,installState1,installState2};
       KwSdk$InstallState.$VALUES = installState3;
    }
    public void KwSdk$InstallState(String p0,int p1){
       super(p0, p1);
    }
    public static KwSdk$InstallState valueOf(String p0){
       return Enum.valueOf(KwSdk$InstallState.class, p0);
    }
    public static KwSdk$InstallState[] values(){
       return KwSdk$InstallState.$VALUES.clone();
    }
}
