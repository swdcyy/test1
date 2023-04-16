package com.facebook.react.transientpage.TransientPageModule$STATE;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class TransientPageModule$STATE extends Enum	// class@001304
{
    public static final TransientPageModule$STATE[] $VALUES;
    public static final TransientPageModule$STATE ACTIVE;
    public static final TransientPageModule$STATE INACTIVE;

    static {
       TransientPageModule$STATE sTATE = new TransientPageModule$STATE("ACTIVE", 0);
       TransientPageModule$STATE.ACTIVE = sTATE;
       TransientPageModule$STATE sTATE1 = new TransientPageModule$STATE("INACTIVE", 1);
       TransientPageModule$STATE.INACTIVE = sTATE1;
       TransientPageModule$STATE[] sTATEArray = new TransientPageModule$STATE[]{sTATE,sTATE1};
       TransientPageModule$STATE.$VALUES = sTATEArray;
    }
    public void TransientPageModule$STATE(String p0,int p1){
       super(p0, p1);
    }
    public static TransientPageModule$STATE valueOf(String p0){
       return Enum.valueOf(TransientPageModule$STATE.class, p0);
    }
    public static TransientPageModule$STATE[] values(){
       return TransientPageModule$STATE.$VALUES.clone();
    }
}
